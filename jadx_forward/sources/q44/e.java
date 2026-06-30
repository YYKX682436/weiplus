package q44;

/* loaded from: classes4.dex */
public class e implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q44.f f441643d;

    public e(q44.f fVar) {
        this.f441643d = fVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        q44.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
        if (sensorEvent.sensor.getType() == 4) {
            long floor = (long) java.lang.Math.floor(sensorEvent.values[2] * 1000000.0f);
            q44.f fVar = this.f441643d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            long j17 = fVar.f441649f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            if (j17 == 0 && floor != 0) {
                q44.f fVar2 = this.f441643d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                fVar2.f441649f = floor;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            }
            q44.f fVar3 = this.f441643d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            long j18 = fVar3.f441649f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            if (j18 == floor) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
                return;
            }
            q44.f fVar4 = this.f441643d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            long j19 = fVar4.f441648e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            if (j19 != 0) {
                long j27 = sensorEvent.timestamp;
                q44.f fVar5 = this.f441643d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                long j28 = fVar5.f441648e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                float f17 = ((float) (j27 - j28)) * 1.0E-9f;
                q44.f fVar6 = this.f441643d;
                long j29 = sensorEvent.timestamp;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                fVar6.f441648e = j29;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                float abs = java.lang.Math.abs(sensorEvent.values[2]);
                q44.f fVar7 = this.f441643d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                java.lang.ref.WeakReference weakReference = fVar7.f441651h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                if (weakReference != null) {
                    q44.f fVar8 = this.f441643d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    java.lang.ref.WeakReference weakReference2 = fVar8.f441651h;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    aVar = (q44.a) weakReference2.get();
                } else {
                    aVar = null;
                }
                if (abs >= 5.0f) {
                    if (aVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb5 = ((e94.t) aVar).f331922a;
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5.C;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        android.os.Handler handler = c17821xa501ffb5.f245467y;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        android.os.Message.obtain(handler, 3).sendToTarget();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistGyrosImpl", "listener is null, release sensor");
                        this.f441643d.mo159513x514e147f(false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
                    return;
                }
                q44.f fVar9 = this.f441643d;
                double d17 = sensorEvent.values[2] * f17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$318", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                fVar9.f441647d += d17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$318", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                q44.f fVar10 = this.f441643d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                double d18 = fVar10.f441647d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                float degrees = (float) java.lang.Math.toDegrees(d18);
                if (aVar != null) {
                    ((e94.t) aVar).a(0.0f, degrees);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistGyrosImpl", "listener is null, release sensor");
                    this.f441643d.mo159513x514e147f(false);
                }
            } else {
                q44.f fVar11 = this.f441643d;
                long j37 = sensorEvent.timestamp;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                fVar11.f441648e = j37;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
    }
}
