package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes13.dex */
public abstract class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.l0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f164548d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f164549e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f164550f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k2 f164551g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f164552h;

    /* renamed from: i, reason: collision with root package name */
    public int f164553i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.i f164554m;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        super(lVar);
        this.f164549e = new float[3];
        this.f164550f = new float[3];
        this.f164552h = "unknow";
        this.f164553i = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.i();
        this.f164554m = iVar;
        iVar.p(lVar);
        this.f164551g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.f0.f164536e.e0(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.j(this, lVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.l0
    public void h(boolean z17) {
        this.f164548d = z17;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (this.f164548d) {
            return;
        }
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length < 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiEnableCompass", "compass sensor callback data invalidate.");
            return;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.f164550f = sensorEvent.values;
            int i17 = sensorEvent.accuracy;
            if (i17 == -1) {
                this.f164552h = "no-contact";
            } else if (i17 == 0) {
                this.f164552h = "unreliable";
            } else if (i17 == 1) {
                this.f164552h = "low";
            } else if (i17 == 2) {
                this.f164552h = ya.b.f77490x87518375;
            } else if (i17 != 3) {
                this.f164552h = "unknow";
                this.f164553i = i17;
            } else {
                this.f164552h = "high";
            }
        } else if (sensorEvent.sensor.getType() != 1) {
            return;
        } else {
            this.f164549e = sensorEvent.values;
        }
        this.f164551g.a(new java.lang.Object[0]);
    }
}
