package b94;

/* loaded from: classes4.dex */
public final class e implements android.hardware.SensorEventListener {

    /* renamed from: e, reason: collision with root package name */
    public long f18619e;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f18621g;

    /* renamed from: d, reason: collision with root package name */
    public float f18618d = 9.8f;

    /* renamed from: f, reason: collision with root package name */
    public float f18620f = 1.0f;

    public e(b94.d dVar) {
        if (dVar != null) {
            this.f18621g = new java.lang.ref.WeakReference(dVar);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector$ShakeDetectListener");
        kotlin.jvm.internal.o.g(sensor, "sensor");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector$ShakeDetectListener");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent event) {
        b94.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector$ShakeDetectListener");
        kotlin.jvm.internal.o.g(event, "event");
        android.hardware.Sensor sensor = event.sensor;
        if (sensor != null && sensor.getType() == 1) {
            float[] fArr = event.values;
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr[2];
            float sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (f18 * f18) + (f19 * f19));
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f18619e > 1000) {
                float f27 = this.f18618d;
                if (sqrt - f27 > this.f18620f * 9.8f) {
                    java.lang.Math.abs(sqrt - f27);
                    this.f18619e = currentTimeMillis;
                    java.lang.ref.WeakReference weakReference = this.f18621g;
                    if (weakReference != null && (dVar = (b94.d) weakReference.get()) != null) {
                        dVar.a();
                    }
                }
            }
            this.f18618d = sqrt;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector$ShakeDetectListener");
    }
}
