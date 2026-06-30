package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class t3 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8 {

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.t3 f273446f;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f273447a = new float[3];

    /* renamed from: b, reason: collision with root package name */
    public int f273448b = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55644xa67f77f6;

    /* renamed from: c, reason: collision with root package name */
    public int f273449c = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55644xa67f77f6;

    /* renamed from: d, reason: collision with root package name */
    public android.hardware.SensorManager f273450d;

    /* renamed from: e, reason: collision with root package name */
    public android.hardware.SensorEventListener f273451e;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    public void a(android.content.Context context) {
        d(context);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    public void b(android.content.Context context) {
        android.hardware.SensorEventListener sensorEventListener;
        android.hardware.SensorManager sensorManager = this.f273450d;
        if (sensorManager == null || (sensorEventListener = this.f273451e) == null) {
            return;
        }
        sensorManager.unregisterListener(sensorEventListener);
        this.f273450d = null;
        this.f273451e = null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    public void c(android.content.Context context) {
        android.hardware.SensorEventListener sensorEventListener;
        f273446f = null;
        android.hardware.SensorManager sensorManager = this.f273450d;
        if (sensorManager == null || (sensorEventListener = this.f273451e) == null) {
            return;
        }
        sensorManager.unregisterListener(sensorEventListener);
        this.f273450d = null;
        this.f273451e = null;
    }

    public void d(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HeadingPitchSensorMgr", "initSensor() context == null");
            return;
        }
        if (this.f273450d == null) {
            this.f273450d = (android.hardware.SensorManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("sensor");
        }
        if (this.f273451e == null) {
            this.f273451e = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s3(this);
        }
        android.hardware.SensorManager sensorManager = this.f273450d;
        sensorManager.registerListener(this.f273451e, sensorManager.getDefaultSensor(3), 3);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    /* renamed from: getName */
    public java.lang.String mo74208xfb82e301() {
        return "HeadingPitchSensorMgr";
    }
}
