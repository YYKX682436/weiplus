package ca3;

/* loaded from: classes13.dex */
public final class e implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public double f39791d;

    /* renamed from: e, reason: collision with root package name */
    public long f39792e = 200;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        ca3.a aVar;
        if (sensorEvent == null || sensorEvent.sensor.getType() != 3) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f39792e;
        float f17 = sensorEvent.values[0];
        if (f17 <= 0.0f) {
            f17 += (((((int) f17) * (-1)) / com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) + 1) * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        }
        float f18 = f17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        if (currentTimeMillis > 200) {
            double d17 = f18;
            if (java.lang.Math.abs(d17 - this.f39791d) > 3) {
                java.util.Iterator it = ca3.f.f39794b.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView = ((ca3.r) ((ca3.d) it.next())).f39808a;
                    if (liteAppMapView.f144104h && !liteAppMapView.G && (aVar = liteAppMapView.F) != null) {
                        double d18 = aVar.f39784i ? aVar.f39782g : d17;
                        com.tencent.mapsdk.raster.model.Marker marker = aVar.f39776a;
                        if (marker != null) {
                            marker.setRotation((float) d18);
                        }
                    }
                }
                this.f39791d = d17;
                this.f39792e = java.lang.System.currentTimeMillis();
            }
        }
    }
}
