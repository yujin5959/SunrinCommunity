package com.example.myapplication655;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mid1,mpassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mid1 = findViewById(R.id.login_id1);
        mpassword = findViewById(R.id.login_password);

        findViewById(R.id.login_success);
    }


}