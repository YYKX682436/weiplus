package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread f250561d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f250562e;

    /* renamed from: f, reason: collision with root package name */
    public final t26.d f250563f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("Sns-Dispatch", 5);
        this.f250561d = a17;
        a17.start();
        android.os.Handler handler = new android.os.Handler(a17.getLooper());
        this.f250562e = handler;
        this.f250563f = t26.e.b(handler, null, 1, null);
        rk0.c.c("MicroMsg.Improve.ImproveDispatchUIC", "create ImproveDispatchUIC", new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
        this.f250562e.removeCallbacksAndMessages(null);
        this.f250561d.quitSafely();
        rk0.c.c("MicroMsg.Improve.ImproveDispatchUIC", "onDestroy ImproveDispatchUIC", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
    }
}
