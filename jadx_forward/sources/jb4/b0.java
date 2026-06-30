package jb4;

/* loaded from: classes14.dex */
public class b0 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public long f380306d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f380307e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933 c17931xd3691933) {
        this.f380307e = new java.lang.ref.WeakReference(c17931xd3691933);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccuracyChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccuracyChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933 c17931xd3691933 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933) this.f380307e.get();
        if (c17931xd3691933 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            if (this.f380306d != 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                float f17 = ((float) (currentTimeMillis - this.f380306d)) / 1000.0f;
                if (f17 < 0.012d) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
                    return;
                }
                this.f380306d = currentTimeMillis;
                float[] f18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933.f(c17931xd3691933);
                f18[0] = f18[0] + (sensorEvent.values[0] * f17);
                float[] f19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933.f(c17931xd3691933);
                f19[1] = f19[1] + (sensorEvent.values[1] * f17);
                float[] f27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933.f(c17931xd3691933);
                f27[2] = f27[2] + (sensorEvent.values[2] * f17);
                float degrees = (float) java.lang.Math.toDegrees(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933.f(c17931xd3691933)[0]);
                float degrees2 = (float) java.lang.Math.toDegrees(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933.f(c17931xd3691933)[1]);
                java.lang.Math.toDegrees(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933.f(c17931xd3691933)[2]);
                jb4.d0 d0Var = new jb4.d0();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSensorX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                d0Var.f380317a = degrees2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSensorX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSensorY", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                d0Var.f380318b = degrees;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSensorY", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSensorZ", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSensorZ", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                android.os.Message obtain = android.os.Message.obtain();
                obtain.what = 1;
                obtain.obj = d0Var;
                c17931xd3691933.I.sendMessage(obtain);
            } else {
                this.f380306d = java.lang.System.currentTimeMillis();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
    }
}
