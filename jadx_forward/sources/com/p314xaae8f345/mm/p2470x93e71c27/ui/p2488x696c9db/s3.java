package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class s3 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.t3 f273428d;

    public s3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.t3 t3Var) {
        this.f273428d = t3Var;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeadingPitchSensorMgr", "onAccuracyChanged");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 3) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.t3 t3Var = this.f273428d;
            float[] fArr = t3Var.f273447a;
            float[] fArr2 = sensorEvent.values;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            int i17 = t3Var.f273448b;
            t3Var.getClass();
            if (i17 == -10000) {
                t3Var.f273448b = (int) t3Var.f273447a[0];
            } else {
                float f17 = t3Var.f273447a[0];
                int i18 = t3Var.f273448b;
                if (f17 - i18 > 300.0f || f17 - i18 < -300.0f) {
                    t3Var.f273448b = (int) f17;
                } else {
                    t3Var.f273448b = (int) ((i18 * 0.6d) + (f17 * 0.4d));
                }
            }
            if (t3Var.f273448b == 0) {
                t3Var.f273448b = 1;
            }
            if (t3Var.f273448b == 365) {
                t3Var.f273448b = 364;
            }
            int i19 = t3Var.f273449c;
            t3Var.getClass();
            if (i19 == -10000) {
                t3Var.f273449c = (int) t3Var.f273447a[1];
                return;
            }
            float f18 = t3Var.f273447a[1];
            if (f18 < -68.0f) {
                int i27 = (int) (((f18 + 68.0f) / 1.5d) - 68.0d);
                if (i27 < -89) {
                    i27 = -89;
                }
                t3Var.f273449c = i27;
                return;
            }
            if (f18 > 89.0f) {
                t3Var.f273449c = 89;
            } else {
                t3Var.f273449c = (int) ((t3Var.f273449c * 0.6d) + (f18 * 0.4d));
            }
        }
    }
}
