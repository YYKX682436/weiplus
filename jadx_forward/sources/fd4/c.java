package fd4;

/* loaded from: classes4.dex */
public abstract class c implements fd4.l {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f342820d;

    /* renamed from: e, reason: collision with root package name */
    public i64.b1 f342821e;

    /* renamed from: f, reason: collision with root package name */
    public u74.d f342822f;

    /* renamed from: g, reason: collision with root package name */
    public u74.f f342823g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f342824h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f342825i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n f342826m;

    /* renamed from: n, reason: collision with root package name */
    public int f342827n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f342828o;

    /* renamed from: p, reason: collision with root package name */
    public final w64.l f342829p = new fd4.a(this);

    @Override // fd4.l
    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        this.f342825i = c17933xe8d1b226;
        if (c17933xe8d1b226 != null) {
            ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        }
        this.f342826m = nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, u74.d dVar, u74.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        this.f342820d = activity;
        this.f342824h = iVar;
        this.f342821e = b1Var;
        this.f342822f = dVar;
        this.f342827n = dVar.T.f506664a;
        this.f342823g = fVar;
        if (n()) {
            u74.d dVar2 = this.f342822f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFullCardAdBusiness", "initBreakFrameContainer, hash=" + hashCode());
            if (m()) {
                android.view.ViewStub viewStub = (android.view.ViewStub) dVar2.f506696x.findViewById(com.p314xaae8f345.mm.R.id.n3o);
                if (viewStub == null || this.f342828o != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseFullCardAdBusiness", "onCreate, no fullFrameContainerStub in timeline");
                } else {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewStub.inflate();
                    this.f342828o = frameLayout;
                    frameLayout.setVisibility(0);
                }
            } else {
                android.view.View view = dVar2.f506696x;
                if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17796xc7afd692) {
                    android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.f342820d);
                    this.f342828o = frameLayout2;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17796xc7afd692) view).m69585xfb3ae708(frameLayout2);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseFullCardAdBusiness", "onCreate, no AdLinearLayout in detail");
                }
            }
            android.widget.FrameLayout frameLayout3 = this.f342828o;
            if (frameLayout3 != null) {
                o(frameLayout3);
            }
            dVar2.f506698z.getViewTreeObserver().addOnPreDrawListener(new fd4.b(this, dVar2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doEggClickReport", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFullCardAdBusiness", "doEggClickReport, clickPos=" + i17 + ", source=" + this.f342827n);
        if (this.f342821e == null || (c17933xe8d1b226 = this.f342825i) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseFullCardAdBusiness", "doEggClickReport err, param==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doEggClickReport", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
            return;
        }
        try {
            int i18 = this.f342827n;
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i18, i18 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, i17, 21);
            ca4.m0.f(c11137xb05b06ad, this.f342821e, this.f342825i, i17);
            ca4.z0.x0(c11137xb05b06ad);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFullCardAdBusiness", "doEggClickReport, clickPos=" + i17 + ", source=" + this.f342827n + ", exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doEggClickReport", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOpenNativeEggLandingPage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFullCardAdBusiness", "doOpenNativeEggLandingPage, source=" + this.f342827n);
        android.app.Activity activity = this.f342820d;
        if (activity == null || (c17933xe8d1b226 = this.f342825i) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseFullCardAdBusiness", "doOpenNativeEggLandingPage err, param==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOpenNativeEggLandingPage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
            return;
        }
        try {
            int i17 = this.f342827n;
            int i18 = 2;
            if (i17 == 2) {
                i18 = 16;
            } else if (i17 != 1) {
                i18 = 1;
            }
            android.view.View view = this.f342822f.f506698z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            ca4.m0.p0(activity, view, c17933xe8d1b226, i18, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openEggLandingPage", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseFullCardAdBusiness", "doOpenNativeEggLandingPage exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOpenNativeEggLandingPage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public boolean m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFromTimeline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        boolean z17 = this.f342822f.T.f506664a == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFromTimeline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        return z17;
    }

    public boolean n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        return false;
    }

    public void o(android.widget.FrameLayout frameLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    @Override // fd4.l
    /* renamed from: onVideoPause */
    public void mo129355x65d3157a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void p(android.widget.FrameLayout frameLayout, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void q(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }

    public void r(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = this.f342824h;
        if (iVar != null) {
            iVar.M(this.f342822f, bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness");
    }
}
