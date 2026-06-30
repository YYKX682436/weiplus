package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public abstract class e extends com.tencent.mm.plugin.appbrand.jsapi.sensor.l0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f83000e = false;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.k2 f82999d = new com.tencent.mm.plugin.appbrand.utils.k2(com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e.e0(), new com.tencent.mm.plugin.appbrand.jsapi.sensor.d(this));

    @Override // com.tencent.mm.plugin.appbrand.jsapi.sensor.l0
    public void h(boolean z17) {
        this.f83000e = z17;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (!this.f83000e && sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            if (fArr == null || fArr.length < 3) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiEnableAccelerometer", "ACCELEROMETER sensor callback data invalidate.");
            } else {
                this.f82999d.a(fArr);
            }
        }
    }
}
