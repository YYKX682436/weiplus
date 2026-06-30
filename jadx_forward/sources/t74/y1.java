package t74;

/* loaded from: classes4.dex */
public final class y1 extends dc4.v implements i64.k0 {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f497838p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f497839q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f497840r;

    /* renamed from: s, reason: collision with root package name */
    public final android.app.Activity f497841s;

    /* renamed from: t, reason: collision with root package name */
    public final int f497842t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f497843u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f497844v;

    /* renamed from: w, reason: collision with root package name */
    public final t74.d2 f497845w;

    /* renamed from: x, reason: collision with root package name */
    public int f497846x;

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Handler f497847y;

    public y1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mActivity, "mActivity");
        this.f497838p = c17933xe8d1b226;
        this.f497839q = iVar;
        this.f497840r = b1Var;
        this.f497841s = mActivity;
        this.f497842t = i17;
        this.f497845w = new t74.d2();
        this.f497847y = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardDetailItem", "initView, snsId is " + ca4.z0.y0(this.f497838p));
        if (view == null || view2 == null || this.f497840r == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFlipCardDetailItem", "initView, params error");
        }
        this.f310366f = view;
        this.f310367g = view2;
        this.f497843u = view != null ? (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.f566547tx1) : null;
        this.f497844v = view != null ? (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.f566548tx2) : null;
        this.f497846x = ca4.m0.y("AdFlipCardDetailItem", this.f497841s, this.f497842t, this.f310372o);
        t74.b2 b2Var = new t74.b2(this.f497843u, this.f497844v, this.f310369i, this.f497846x, this.f310372o, this.f497840r, new w64.n(this.f497841s, this.f497842t, this.f497840r, null, null), this.f497839q, this.f497841s, this.f497842t);
        t74.d2 d2Var = this.f497845w;
        d2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        d2Var.f497657a = b2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        d2Var.b(this.f497846x);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardDetailItem", "onAdRemoved, snsId is " + str);
        this.f497845w.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // dc4.v
    public void e(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        super.e(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardDetailItem", "onConfigurationChanged");
        t74.d2 d2Var = this.f497845w;
        d2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = d2Var.f497658b;
        if (w1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            p3325xe03a0797.p3326xc267989b.y0 h17 = w1Var.h();
            if (h17 != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(h17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h.mo7096x348d9a(w1Var.A0), null, new t74.a(w1Var, null), 2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        super.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardDetailItem", "onPause");
        this.f497845w.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // dc4.v
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        super.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardDetailItem", "onUIDestroy");
        this.f497847y.removeCallbacksAndMessages(null);
        this.f497845w.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f497838p;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardDetailItem", "refreshView, snsId is " + ca4.z0.y0(c17933xe8d1b226));
        this.f497845w.a(this.f497841s, c17933xe8d1b226);
        android.os.Handler handler = this.f497847y;
        handler.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        if (!android.text.TextUtils.isEmpty(T) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0", T) && (b1Var = this.f497840r) != null) {
            b1Var.a(T, this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        handler.postDelayed(new t74.x1(this, c17933xe8d1b226), 600L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
    }
}
