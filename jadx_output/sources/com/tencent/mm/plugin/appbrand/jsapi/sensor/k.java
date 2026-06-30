package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public abstract class k extends com.tencent.mm.plugin.appbrand.jsapi.sensor.l0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f83015d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f83016e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f83017f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.k2 f83018g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f83019h;

    /* renamed from: i, reason: collision with root package name */
    public int f83020i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.sensor.i f83021m;

    public k(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super(lVar);
        this.f83016e = new float[3];
        this.f83017f = new float[3];
        this.f83019h = "unknow";
        this.f83020i = 0;
        com.tencent.mm.plugin.appbrand.jsapi.sensor.i iVar = new com.tencent.mm.plugin.appbrand.jsapi.sensor.i();
        this.f83021m = iVar;
        iVar.p(lVar);
        this.f83018g = new com.tencent.mm.plugin.appbrand.utils.k2(com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e.e0(), new com.tencent.mm.plugin.appbrand.jsapi.sensor.j(this, lVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.l0
    public void h(boolean z17) {
        this.f83015d = z17;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (this.f83015d) {
            return;
        }
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length < 3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiEnableCompass", "compass sensor callback data invalidate.");
            return;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.f83017f = sensorEvent.values;
            int i17 = sensorEvent.accuracy;
            if (i17 == -1) {
                this.f83019h = "no-contact";
            } else if (i17 == 0) {
                this.f83019h = "unreliable";
            } else if (i17 == 1) {
                this.f83019h = "low";
            } else if (i17 == 2) {
                this.f83019h = ya.b.MEDIUM;
            } else if (i17 != 3) {
                this.f83019h = "unknow";
                this.f83020i = i17;
            } else {
                this.f83019h = "high";
            }
        } else if (sensorEvent.sensor.getType() != 1) {
            return;
        } else {
            this.f83016e = sensorEvent.values;
        }
        this.f83018g.a(new java.lang.Object[0]);
    }
}
