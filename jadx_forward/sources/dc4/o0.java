package dc4;

/* loaded from: classes4.dex */
public class o0 extends dc4.v implements z84.i, z84.h, i64.k0 {
    public android.view.ViewGroup A;
    public android.view.ViewGroup B;
    public q74.z C;
    public z84.k D;
    public w64.n E;
    public android.view.ViewStub F;
    public android.graphics.Point G;
    public d94.g H;
    public android.widget.FrameLayout I;
    public android.view.View L;
    public q74.d0 M;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f310319p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f310320q;

    /* renamed from: r, reason: collision with root package name */
    public int f310321r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f310322s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 f310323t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f310324u;

    /* renamed from: v, reason: collision with root package name */
    public final i64.b1 f310325v;

    /* renamed from: x, reason: collision with root package name */
    public q74.b1 f310327x;

    /* renamed from: y, reason: collision with root package name */
    public final q74.b0 f310328y;

    /* renamed from: z, reason: collision with root package name */
    public w64.n f310329z;

    /* renamed from: w, reason: collision with root package name */
    public final z74.i f310326w = new z74.i();

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.Rect f310318J = new android.graphics.Rect();
    public final android.graphics.Point K = new android.graphics.Point();
    public final int[] N = new int[2];
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public final int[] R = new int[2];
    public final d94.a S = new dc4.m0(this);

    public o0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var) {
        this.f310364d = c19807x593d1720;
        this.f310365e = c17933xe8d1b226;
        this.f310371n = iVar;
        this.f310325v = b1Var;
        this.f310328y = new q74.b0(2);
    }

    public static /* synthetic */ int[] l(dc4.o0 o0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = o0Var.N;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    public static /* synthetic */ android.graphics.Rect m(dc4.o0 o0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        android.graphics.Rect rect = o0Var.f310318J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return rect;
    }

    public static /* synthetic */ int[] n(dc4.o0 o0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = o0Var.P;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    public static /* synthetic */ int[] o(dc4.o0 o0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = o0Var.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    public static /* synthetic */ int[] p(dc4.o0 o0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = o0Var.R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    @Override // z84.h
    public void a(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            q74.b0 b0Var = this.f310328y;
            if (b0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d17 = b0Var.d(i17);
                if (d17 != null) {
                    d17.f441926f++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // z84.i
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            q(view, this.f310365e, i17);
            q74.b0 b0Var = this.f310328y;
            if (b0Var != null) {
                b0Var.g(i17);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            s(view, view2);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardDetailItem", "the init view failed");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310365e;
            if (c17933xe8d1b226 != null) {
                java.lang.String T = ca4.z0.T(c17933xe8d1b226);
                if (!android.text.TextUtils.isEmpty(T) && T.equals(str)) {
                    a84.t0.a(this.f310328y);
                }
            }
            q74.d0 d0Var = this.M;
            if (d0Var != null) {
                d0Var.c();
            }
            q74.b1 b1Var = this.f310327x;
            if (b1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.f441961k.removeCallbacksAndMessages(null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportTouchDuration", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = this.f310365e.m70354x74235b3e();
            boolean z17 = (m70354x74235b3e == null || m70354x74235b3e.f38275x3163e578 == null || this.I == null) ? false : true;
            int m69490x91c80705 = (int) this.f310323t.m69490x91c80705();
            int m69489x6f36753e = this.f310323t.m69489x6f36753e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 c17758x730d4dd2 = this.f310323t;
            c17758x730d4dd2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideRecyclerView", "reset");
            c17758x730d4dd2.f244744c2 = 0L;
            c17758x730d4dd2.f244746e2 = 0L;
            c17758x730d4dd2.f244745d2 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            a84.t0.a(new q74.v(this.f310365e, 2, m69490x91c80705, m69489x6f36753e, z17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardDetailItem", "reportTouchDuration, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTouchDuration", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // z84.h
    public void f(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemProductClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        q74.b0 b0Var = this.f310328y;
        if (b0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataProductClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            q74.a0 d17 = b0Var.d(i17);
            if (d17 != null) {
                d17.f441934n++;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataProductClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemProductClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            super.g();
            q74.b1 b1Var = this.f310327x;
            if (b1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.f441952b = false;
                z74.i iVar = b1Var.f441953c;
                if (iVar != null) {
                    try {
                        iVar.d();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f310324u;
            if (c17808x428917d3 != null) {
                c17808x428917d3.o();
            }
        } catch (java.lang.Throwable unused2) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        q74.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            s34.a1 a1Var = this.f310365e.m70354x74235b3e().f38210x95847c91;
            if (s34.z0.d(this.f310365e) && this.M == null) {
                this.M = new q74.d0(this.f310319p, r(), this.f310322s, this.f310369i, this.f310325v, this.f310329z, this.f310323t, this);
            }
            q74.d0 d0Var = this.M;
            if (d0Var != null && (b1Var = this.f310327x) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSlideFullCardBreakFrameLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.f441957g = d0Var;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSlideFullCardBreakFrameLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                this.M.a(this.f310365e);
            }
            if (a1Var != null && a1Var.f76694x80bfd259 != null) {
                if (this.E == null) {
                    this.E = new w64.n(this.f310319p, r(), this.f310325v, null, null);
                }
                if (this.C == null) {
                    q74.c0 c0Var = new q74.c0();
                    c0Var.f441964a = this.f310323t;
                    c0Var.f441965b = this.F;
                    c0Var.f441966c = this.f310327x;
                    c0Var.f441967d = this.f310324u;
                    c0Var.f441968e = this.D;
                    c0Var.f441969f = this.E;
                    c0Var.f441970g = this.f310328y;
                    c0Var.f441971h = this.G;
                    c0Var.f441972i = this.f310321r;
                    this.C = new q74.z(this.f310319p, c0Var);
                }
            }
            q74.z zVar = this.C;
            if (zVar != null) {
                zVar.d(this.f310365e, a1Var);
            }
            q74.t0.a(this.f310320q, this.A, this.B, null, this.f310321r, r());
            if (this.f310327x != null) {
                l44.b3.f397574a.h(this.f310365e);
                this.f310327x.l(this.f310324u);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    public void q(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null || c17933xe8d1b226.m70354x74235b3e().f38210x95847c91 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        s34.a1 a1Var = c17933xe8d1b226.m70354x74235b3e().f38210x95847c91;
        java.util.List<s34.x0> list = a1Var.f76695x5800ff2c;
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        s34.x0 x0Var = a1Var.f76695x5800ff2c.get(i17);
        if (x0Var == null || x0Var.f76730xf7a0a3ac == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        int a17 = a1Var.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = x0Var.f76730xf7a0a3ac;
        c17702x544f64e9.f244102a = 3;
        this.f310329z.o(c17702x544f64e9, c17933xe8d1b226, a17);
        this.f310329z.k(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    public final int r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        i64.b1 b1Var = this.f310325v;
        if (b1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return 1;
        }
        int i17 = b1Var.f370628j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return i17;
    }

    public void s(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        d94.f fVar;
        android.widget.FrameLayout frameLayout;
        android.view.View view3;
        android.view.ViewStub viewStub;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        if (view == null || (c17933xe8d1b226 = this.f310365e) == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.SlideFullCardDetailItem", "the content view is null??? the init view can't complete!!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        s34.a1 a1Var = this.f310365e.m70354x74235b3e().f38210x95847c91;
        if (a1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.SlideFullCardDetailItem", "the adSliderFullCardInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        q74.b0 b0Var = this.f310328y;
        if (b0Var != null) {
            b0Var.f(this.f310365e, r(), a1Var);
        }
        this.f310320q = view;
        this.f310319p = view.getContext();
        this.f310322s = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view.findViewById(com.p314xaae8f345.mm.R.id.n5p);
        this.f310323t = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2) view.findViewById(com.p314xaae8f345.mm.R.id.n5o);
        this.F = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.qpg);
        this.A = (android.view.ViewGroup) this.f310369i.findViewById(com.p314xaae8f345.mm.R.id.n_6);
        this.B = (android.view.ViewGroup) this.f310369i.findViewById(com.p314xaae8f345.mm.R.id.afc);
        this.L = this.f310369i.findViewById(com.p314xaae8f345.mm.R.id.f564201kq);
        if (this.f310323t != null) {
            this.f310321r = q74.t0.c(this.f310319p, r(), this.f310372o);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin += i65.a.b(this.f310319p, 8);
                view.setLayoutParams(layoutParams2);
            }
            this.f310323t.m7963x830bc99d(true);
            this.f310324u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3(this.f310323t);
            q74.b1 b1Var = new q74.b1(this.f310326w, b0Var, r());
            this.f310327x = b1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f310365e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            b1Var.f441954d = c17933xe8d1b2262;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            z84.k kVar = new z84.k(i65.a.b(this.f310319p, 12), i65.a.b(this.f310319p, 8));
            this.D = kVar;
            this.f310324u.D(kVar);
            this.f310324u.E(this.f310327x);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f310324u;
            int r17 = r();
            c17808x428917d3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            c17808x428917d3.f245331y = r17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            this.f310323t.mo7967x900dcbe1(this.f310324u);
            this.f310329z = new w64.n(this.f310319p, r(), this.f310325v, null, new dc4.n0(this));
            q74.x0 x0Var = new q74.x0(this.f310323t, this.f310365e, new w64.n(this.f310319p, r(), this.f310325v, null, new dc4.n0(this)));
            x0Var.y(this.f310321r);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            android.graphics.Point point = new android.graphics.Point(x0Var.f442099n, x0Var.f442100o);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            this.G = point;
            x0Var.mo8164xbbdced85(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            x0Var.f442096h = this;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemActionBtnClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            x0Var.f442097i = this;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemActionBtnClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            this.f310323t.mo7960x6cab2c8d(x0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        i64.b1 b1Var2 = this.f310325v;
        if (b1Var2 != null) {
            java.lang.String T = ca4.z0.T(this.f310365e);
            if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                b1Var2.a(T, this);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = this.f310365e.m70354x74235b3e();
            if (m70354x74235b3e == null || m70354x74235b3e.f38275x3163e578 == null) {
                this.f310323t.m69492xeaf65bd1(null);
                fVar = null;
            } else {
                if (this.I == null && (view3 = this.f310370m) != null && (viewStub = (android.view.ViewStub) view3.findViewById(com.p314xaae8f345.mm.R.id.f564170jv)) != null) {
                    this.I = (android.widget.FrameLayout) viewStub.inflate();
                }
                if (this.H == null && (frameLayout = this.I) != null) {
                    this.H = new d94.g(this.f310319p, frameLayout, this.S, 2);
                }
                fVar = m70354x74235b3e.f38275x3163e578;
                this.f310323t.m69492xeaf65bd1(this.H);
            }
            d94.g gVar = this.H;
            if (gVar != null) {
                gVar.b(fVar);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardDetailItem", "touch anim exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }
}
