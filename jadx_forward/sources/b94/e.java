package b94;

/* loaded from: classes4.dex */
public final class e implements android.hardware.SensorEventListener {

    /* renamed from: e, reason: collision with root package name */
    public long f100152e;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f100154g;

    /* renamed from: d, reason: collision with root package name */
    public float f100151d = 9.8f;

    /* renamed from: f, reason: collision with root package name */
    public float f100153f = 1.0f;

    public e(b94.d dVar) {
        if (dVar != null) {
            this.f100154g = new java.lang.ref.WeakReference(dVar);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector$ShakeDetectListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sensor, "sensor");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector$ShakeDetectListener");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent event) {
        b94.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector$ShakeDetectListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.hardware.Sensor sensor = event.sensor;
        if (sensor != null && sensor.getType() == 1) {
            float[] fArr = event.values;
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr[2];
            float sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (f18 * f18) + (f19 * f19));
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f100152e > 1000) {
                float f27 = this.f100151d;
                if (sqrt - f27 > this.f100153f * 9.8f) {
                    java.lang.Math.abs(sqrt - f27);
                    this.f100152e = currentTimeMillis;
                    java.lang.ref.WeakReference weakReference = this.f100154g;
                    if (weakReference != null && (dVar = (b94.d) weakReference.get()) != null) {
                        dVar.a();
                    }
                }
            }
            this.f100151d = sqrt;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.SnsAdShakeDetector$ShakeDetectListener");
    }
}
