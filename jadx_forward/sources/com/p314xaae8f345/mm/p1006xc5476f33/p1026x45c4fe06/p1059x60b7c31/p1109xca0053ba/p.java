package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes13.dex */
public abstract class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.l0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f164567d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k2 f164568e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.n f164569f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f164570g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f164571h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f164572i;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        super(lVar);
        this.f164570g = new float[9];
        this.f164571h = new float[3];
        this.f164572i = new float[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.n();
        this.f164569f = nVar;
        nVar.p(lVar);
        this.f164568e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.f0.f164536e.e0(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.o(this, lVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.l0
    public void h(boolean z17) {
        this.f164567d = z17;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (this.f164567d) {
            return;
        }
        boolean n66 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.f0.f164536e.n6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k2 k2Var = this.f164568e;
        if (!n66) {
            if (sensorEvent.sensor.getType() != 3) {
                return;
            }
            float[] fArr = sensorEvent.values;
            if (fArr == null || fArr.length < 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiEnableDeviceMotion", "deviceMotion sensor callback data invalidate.");
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
        float[] fArr3 = this.f164570g;
        android.hardware.SensorManager.getRotationMatrixFromVector(fArr3, fArr2);
        float[] fArr4 = this.f164571h;
        android.hardware.SensorManager.getOrientation(fArr3, fArr4);
        float f17 = fArr4[0];
        if (f17 < 0.0f) {
            fArr4[0] = (float) (f17 + 6.283185307179586d);
        }
        fArr4[2] = -fArr4[2];
        float degrees = (float) java.lang.Math.toDegrees(fArr4[0]);
        float[] fArr5 = this.f164572i;
        fArr5[0] = degrees;
        fArr5[1] = (float) java.lang.Math.toDegrees(fArr4[1]);
        fArr5[2] = (float) java.lang.Math.toDegrees(fArr4[2]);
        k2Var.a(fArr5);
    }
}
