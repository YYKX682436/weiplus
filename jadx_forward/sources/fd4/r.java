package fd4;

/* loaded from: classes4.dex */
public class r extends fd4.c implements a94.l {
    public boolean A;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 f342858q;

    /* renamed from: r, reason: collision with root package name */
    public int f342859r;

    /* renamed from: s, reason: collision with root package name */
    public int f342860s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f342861t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f342862u;

    /* renamed from: x, reason: collision with root package name */
    public int f342865x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 f342866y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f342867z;

    /* renamed from: v, reason: collision with root package name */
    public int[] f342863v = new int[2];

    /* renamed from: w, reason: collision with root package name */
    public int[] f342864w = new int[2];
    public int B = Integer.MAX_VALUE;
    public final a94.x C = new fd4.p(this);

    @Override // fd4.c, fd4.l
    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.a(i17, c17933xe8d1b226, nVar, layoutParams);
        this.B = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f342825i;
        if (c17933xe8d1b2262 != null && (c17812x947672b6 = this.f342858q) != null) {
            int i18 = this.f342827n == 0 ? 1 : 2;
            c17812x947672b6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            if (c17933xe8d1b2262 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            } else {
                c17812x947672b6.f245373r = i18;
                c17812x947672b6.f245368m = c17933xe8d1b2262;
                a94.a aVar = c17933xe8d1b2262.m70354x74235b3e().f38209xe4873ff1;
                c17812x947672b6.f245369n = aVar;
                c17812x947672b6.f245374s = this;
                if (aVar != null) {
                    c17812x947672b6.f245363e.setText(aVar.f83967h);
                    c17812x947672b6.f245364f.setText(c17812x947672b6.f245369n.f83968i);
                }
                if (layoutParams != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = c17812x947672b6.f245362d.getLayoutParams();
                    int i19 = (int) (layoutParams.height * 0.32d);
                    if (i19 > 0 && layoutParams2.height != i19) {
                        layoutParams2.height = i19;
                        layoutParams2.width = i19;
                        c17812x947672b6.f245362d.setLayoutParams(layoutParams2);
                    }
                }
                c17812x947672b6.f245371p = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            }
            this.f342822f.f506687o.f249950g.m70616x7e1f5de8(300);
        }
        if (!ca4.m0.V(this.f342867z, c17933xe8d1b226)) {
            if (this.f342866y != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resizeBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                try {
                    if (this.f342827n == 0 && !this.A) {
                        this.f342822f.f506698z.getViewTreeObserver().addOnPreDrawListener(new fd4.q(this));
                        this.A = true;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "resizeBreakFrameContainer, exp is " + th6);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizeBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                this.f342866y.b();
                this.f342866y.m69529x53b40971(c17933xe8d1b226.f68891x29d1292e);
                this.f342866y.m69527x30f2d575(true);
            }
            this.f342867z = c17933xe8d1b226;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // a94.l
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopDetectShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeAdBusiness", "stopDetectShake");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopDetectShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6 = this.f342858q;
        if (c17812x947672b6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            c17812x947672b6.f245371p = true;
            c17812x947672b6.f245375t.removeCallbacksAndMessages(null);
            c17812x947672b6.c();
            c17812x947672b6.h(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        }
        this.f342867z = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc7 = this.f342866y;
        if (c17777x70d32dc7 != null) {
            c17777x70d32dc7.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6 = this.f342858q;
        if (c17812x947672b6 != null) {
            c17812x947672b6.b(0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // a94.l
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHighPriorityAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHighPriorityAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return true;
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        if (this.f342821e == null || this.f342825i == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6 = this.f342858q;
        if (c17812x947672b6 != null) {
            c17812x947672b6.b(j17);
        }
        v(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // a94.l
    /* renamed from: getPosition */
    public int mo877xa86cd69f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPosition", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        int i17 = this.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPosition", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return i17;
    }

    @Override // a94.l
    public float h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdContentExposureRatio", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdContentExposureRatio", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return 100.0f;
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, u74.d dVar, u74.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f342858q == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) this.f342822f.f506698z.findViewById(com.p314xaae8f345.mm.R.id.naq);
            if (viewStub != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6) viewStub.inflate();
                this.f342858q = c17812x947672b6;
                c17812x947672b6.setVisibility(0);
                this.f342858q.m69687xebbf6179(this.C);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "coverStub==null");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        r44.f t17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.j();
        if (this.f342827n == 0 && (t17 = t()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShakableAdRemoved", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t17.f451099h, this)) {
                t17.f451099h = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShakableAdRemoved", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c
    public boolean n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return true;
    }

    @Override // fd4.c
    public void o(android.widget.FrameLayout frameLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.o(frameLayout);
        try {
            this.f342859r = i65.a.b(this.f342820d, 100);
            this.f342860s = i65.a.b(this.f342820d, 200);
            u();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "onBreakFrameContainerInflated exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c, fd4.l
    /* renamed from: onVideoPause */
    public void mo129355x65d3157a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.mo129355x65d3157a();
        if (this.f342825i != null && (c17812x947672b6 = this.f342858q) != null) {
            c17812x947672b6.c();
        }
        v(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c
    public void p(android.widget.FrameLayout frameLayout, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.p(frameLayout, i17, i18);
        if (this.f342865x <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "onBreakFrameContainerSizeCalcFinish but interactionLabelTitleView height <= 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPAGViewMargins", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            int[] iArr = this.f342863v;
            int[] iArr2 = {iArr[0] - this.f342859r, ((iArr[1] + this.f342865x) - this.f342864w[1]) - this.f342860s};
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPAGViewMargins", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc7 = this.f342866y;
            if (c17777x70d32dc7 == null || c17777x70d32dc7.getParent() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc72 = this.f342866y;
                if (c17777x70d32dc72 != null && c17777x70d32dc72.getParent() != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = this.f342866y.getLayoutParams();
                    if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.width = this.f342859r;
                        layoutParams2.height = this.f342860s;
                        layoutParams2.leftMargin = iArr2[0];
                        layoutParams2.topMargin = iArr2[1];
                        this.f342866y.setLayoutParams(layoutParams2);
                    }
                }
            } else {
                android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(this.f342859r, this.f342860s);
                layoutParams3.leftMargin = iArr2[0];
                layoutParams3.topMargin = iArr2[1];
                frameLayout.addView(this.f342866y, layoutParams3);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "onBreakFrameContainerSizeCalcFinish exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    @Override // fd4.c
    public void q(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        super.q(i17, i18);
        try {
            if (this.f342861t == null) {
                this.f342861t = (android.view.ViewGroup) this.f342822f.f506696x.findViewById(com.p314xaae8f345.mm.R.id.f568529n46);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "onContentPreDraw exp is " + th6);
        }
        if (this.f342861t == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "onContentPreDraw but mInteractionLabelViewGroup is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        int[] iArr = new int[2];
        this.f342864w = iArr;
        this.f342822f.f506696x.getLocationOnScreen(iArr);
        if (this.f342862u == null) {
            this.f342862u = this.f342861t.findViewById(com.p314xaae8f345.mm.R.id.obc);
        }
        android.view.View view = this.f342862u;
        if (view != null) {
            int[] iArr2 = new int[2];
            this.f342863v = iArr2;
            view.getLocationOnScreen(iArr2);
            this.f342865x = this.f342862u.getHeight();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeAdBusiness", "shake title x is " + this.f342863v[0] + ", y is " + this.f342863v[1] + ", titleView height is " + this.f342865x + ", itemRootView y is " + this.f342864w[1]);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "onContentPreDraw but mInteractionLabelTitleView is null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    public final boolean s(android.app.Activity activity) {
        int i17;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkListScrollState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac activityC18022x27bfedac = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) this.f342820d;
            activityC18022x27bfedac.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            i17 = activityC18022x27bfedac.P1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5 activity2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) this.f342820d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e.class);
                c18232x7592f55e.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollState", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                int i18 = c18232x7592f55e.f250232h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollState", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                z17 = i18 == 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkListScrollState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                return z17;
            }
            i17 = -1;
        }
        z17 = i17 == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkListScrollState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        return z17;
    }

    public r44.f t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        try {
            android.app.Activity context = this.f342820d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r44.f fVar = (r44.f) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(r44.f.class);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return fVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "getSnsAdBizUic, exp=" + e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdBizUic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return null;
        }
    }

    public final void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc7 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7(this.f342820d);
        this.f342866y = c17777x70d32dc7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initThumbView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            c17777x70d32dc7.f244848e = new android.widget.ImageView(c17777x70d32dc7.getContext());
            c17777x70d32dc7.addView(c17777x70d32dc7.f244848e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initThumbView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc72 = this.f342866y;
        c17777x70d32dc72.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(c17777x70d32dc72.getContext());
            c17777x70d32dc72.f244847d = c22789xd23e9a9b;
            boolean z17 = true;
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20316xf7a4b984()) != 1) {
                z17 = false;
            }
            c22789xd23e9a9b.o(z17);
            c17777x70d32dc72.addView(c17777x70d32dc72.f244847d, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } catch (java.lang.Throwable unused2) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc73 = this.f342866y;
        c17777x70d32dc73.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initThumbData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            android.widget.ImageView imageView = c17777x70d32dc73.f244848e;
            if (imageView != null) {
                imageView.setImageDrawable(c17777x70d32dc73.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cfh));
            }
        } catch (java.lang.Throwable unused3) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initThumbData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc74 = this.f342866y;
        c17777x70d32dc74.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPAGData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = c17777x70d32dc74.f244847d;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.m82581x764e93a7("assets://sns/sna_ad_shake_attract_anim.pag");
            c17777x70d32dc74.f244847d.m82584xebcf33cb(3);
            c17777x70d32dc74.f244847d.m82583xcde73672(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPAGData", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }

    public final void v(boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc7 = this.f342866y;
        if (c17777x70d32dc7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            return;
        }
        boolean z19 = false;
        try {
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c17777x70d32dc7.f244847d;
                if (c22789xd23e9a9b != null) {
                    z19 = c22789xd23e9a9b.f();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                }
                if (z19) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc72 = this.f342866y;
                    c17777x70d32dc72.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = c17777x70d32dc72.f244847d;
                    if (c22789xd23e9a9b2 != null) {
                        c22789xd23e9a9b2.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.h(c17777x70d32dc72));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "stop");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                }
            } else {
                if (!s(this.f342820d)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                    return;
                }
                if (!this.f342866y.isAttachedToWindow()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "notifyPAGStatus, isVideoPlaying is true but mAdPAGFrameContainer is onDetachedFromWindow");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc73 = this.f342866y;
                c17777x70d32dc73.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = c17777x70d32dc73.f244847d;
                if (c22789xd23e9a9b3 != null) {
                    z18 = c22789xd23e9a9b3.f();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    z18 = false;
                }
                if (!z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc74 = this.f342866y;
                    c17777x70d32dc74.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReset", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    boolean z27 = c17777x70d32dc74.f244849f;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReset", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    if (z27) {
                        this.f342866y.c();
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc75 = this.f342866y;
                        c17777x70d32dc75.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resume", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = c17777x70d32dc75.f244847d;
                        if (c22789xd23e9a9b4 != null) {
                            c22789xd23e9a9b4.setVisibility(0);
                            c17777x70d32dc75.f244847d.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.g(c17777x70d32dc75));
                            c17777x70d32dc75.f244849f = false;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "resume");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resume", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "notifyPAGPlayingStatus exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyPAGPlayingStatus", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
    }
}
