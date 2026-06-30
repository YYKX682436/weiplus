package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public abstract class p extends com.tencent.mm.plugin.appbrand.jsapi.sensor.l0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f83034d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.k2 f83035e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.sensor.n f83036f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f83037g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f83038h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f83039i;

    public p(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super(lVar);
        this.f83037g = new float[9];
        this.f83038h = new float[3];
        this.f83039i = new float[3];
        com.tencent.mm.plugin.appbrand.jsapi.sensor.n nVar = new com.tencent.mm.plugin.appbrand.jsapi.sensor.n();
        this.f83036f = nVar;
        nVar.p(lVar);
        this.f83035e = new com.tencent.mm.plugin.appbrand.utils.k2(com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e.e0(), new com.tencent.mm.plugin.appbrand.jsapi.sensor.o(this, lVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.l0
    public void h(boolean z17) {
        this.f83034d = z17;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (this.f83034d) {
            return;
        }
        boolean n66 = com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e.n6();
        com.tencent.mm.plugin.appbrand.utils.k2 k2Var = this.f83035e;
        if (!n66) {
            if (sensorEvent.sensor.getType() != 3) {
                return;
            }
            float[] fArr = sensorEvent.values;
            if (fArr == null || fArr.length < 3) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiEnableDeviceMotion", "deviceMotion sensor callback data invalidate.");
                return;
            } else {
                k2Var.a(fArr);
                return;
            }
        }
        if (sensorEvent.sensor.getType() != 11) {
            return;
        }
        float[] fArr2 = sensorEvent.values;
        float[] fArr3 = this.f83037g;
        android.hardware.SensorManager.getRotationMatrixFromVector(fArr3, fArr2);
        float[] fArr4 = this.f83038h;
        android.hardware.SensorManager.getOrientation(fArr3, fArr4);
        float f17 = fArr4[0];
        if (f17 < 0.0f) {
            fArr4[0] = (float) (f17 + 6.283185307179586d);
        }
        fArr4[2] = -fArr4[2];
        float degrees = (float) java.lang.Math.toDegrees(fArr4[0]);
        float[] fArr5 = this.f83039i;
        fArr5[0] = degrees;
        fArr5[1] = (float) java.lang.Math.toDegrees(fArr4[1]);
        fArr5[2] = (float) java.lang.Math.toDegrees(fArr4[2]);
        k2Var.a(fArr5);
    }
}
