package q44;

/* loaded from: classes4.dex */
public class f implements q44.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.Sensor f441644a;

    /* renamed from: b, reason: collision with root package name */
    public final android.hardware.SensorManager f441645b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f441646c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile double f441647d = 0.0d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f441648e = 0;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f441649f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final android.hardware.SensorEventListener f441650g = new q44.e(this);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f441651h;

    public f(android.content.Context context, android.hardware.Sensor sensor) {
        this.f441645b = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f441644a = sensor;
    }

    @Override // q44.b
    public void a(q44.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        this.f441651h = new java.lang.ref.WeakReference(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
    }

    @Override // q44.b
    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        boolean z17 = this.f441646c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        return z17;
    }

    @Override // q44.b
    /* renamed from: reset */
    public void mo159512x6761d4f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        this.f441648e = 0L;
        this.f441647d = 0.0d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
    }

    @Override // q44.b
    /* renamed from: setEnabled */
    public void mo159513x514e147f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        if (this.f441644a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            return;
        }
        try {
            if (!z17) {
                this.f441645b.unregisterListener(this.f441650g);
                this.f441646c = false;
            } else if (!this.f441646c) {
                this.f441649f = 0L;
                this.f441645b.registerListener(this.f441650g, this.f441644a, 1);
                this.f441646c = true;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistGyrosImpl", "setEnabled exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
    }
}
