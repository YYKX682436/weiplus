package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public abstract class y extends com.tencent.mm.plugin.appbrand.jsapi.sensor.l0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f83051d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.k2 f83052e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.sensor.w f83053f;

    public y(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        super(lVar);
        com.tencent.mm.plugin.appbrand.jsapi.sensor.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.sensor.w();
        this.f83053f = wVar;
        wVar.p(lVar);
        this.f83052e = new com.tencent.mm.plugin.appbrand.utils.k2(com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e.e0(), new com.tencent.mm.plugin.appbrand.jsapi.sensor.x(this, lVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.l0
    public void h(boolean z17) {
        this.f83051d = z17;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (!this.f83051d && sensorEvent.sensor.getType() == 4) {
            float[] fArr = sensorEvent.values;
            if (fArr == null || fArr.length < 3) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiEnableGyroscope", "deviceMotion sensor callback data invalidate.");
            } else {
                this.f83052e.a(fArr);
            }
        }
    }
}
