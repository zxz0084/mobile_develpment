package com.swufestu.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et1=findViewById(R.id.editTextTextPersonName2);
                EditText et2=findViewById(R.id.editTextTextPersonName4);
                TextView tx1=findViewById(R.id.display);
                EditText et3=findViewById(R.id.editTextTextPersonName5);
                String weight=et1.getText().toString();
                String height=et2.getText().toString();
                 double wei=Double.parseDouble(weight);
                 double hei=Double.parseDouble(height);
                 double BMI=wei/(hei*hei);
                DecimalFormat df=new DecimalFormat("#.00");
                String BM=df.format(BMI);
                tx1.setText(BM);

                if(BMI<18.5){
                    et3.setText("thinnish");
                }else if(BMI<23.9&&BMI>=18.5){
                    et3.setText("normal");
                }else if(BMI>=24){
                    et3.setText("overweight");
                }else if(BMI<27.9&&BMI>24){
                    et3.setText("fatty");
                }else if(BMI>=28){
                    et3.setText("obesity");
                }else{
                    et3.setText("severe obesity");
                }
            }
        });

    }
}