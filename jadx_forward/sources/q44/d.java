package q44;

/* loaded from: classes4.dex */
public class d implements q44.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.Sensor f441635a;

    /* renamed from: b, reason: collision with root package name */
    public final android.hardware.SensorManager f441636b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f441637c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f441638d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f441639e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f441640f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public final android.hardware.SensorEventListener f441641g = new q44.c(this);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f441642h;

    public d(android.content.Context context, android.hardware.Sensor sensor) {
        this.f441636b = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f441635a = sensor;
    }

    @Override // q44.b
    public void a(q44.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        this.f441642h = new java.lang.ref.WeakReference(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
    }

    @Override // q44.b
    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        boolean z17 = this.f441637c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        return z17;
    }

    @Override // q44.b
    /* renamed from: reset */
    public void mo159512x6761d4f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        this.f441639e = 0.0f;
        this.f441640f = 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
    }

    @Override // q44.b
    /* renamed from: setEnabled */
    public void mo159513x514e147f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        if (this.f441635a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
            return;
        }
        try {
            if (!z17) {
                this.f441636b.unregisterListener(this.f441641g);
                this.f441637c = false;
            } else if (!this.f441637c) {
                this.f441638d = 0L;
                this.f441636b.registerListener(this.f441641g, this.f441635a, 1);
                this.f441637c = true;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistGravityImpl", "setEnabled exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
    }
}
