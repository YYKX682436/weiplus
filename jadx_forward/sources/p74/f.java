package p74;

/* loaded from: classes4.dex */
public final class f extends dc4.v implements i64.k0, p74.a {
    public w64.n A;
    public p74.o B;
    public p74.i C;
    public w64.n D;
    public android.view.ViewStub E;
    public int F;
    public android.view.ViewStub G;
    public a44.k H;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f434067p;

    /* renamed from: q, reason: collision with root package name */
    public final i64.b1 f434068q;

    /* renamed from: r, reason: collision with root package name */
    public final android.app.Activity f434069r;

    /* renamed from: s, reason: collision with root package name */
    public final int f434070s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f434071t;

    /* renamed from: u, reason: collision with root package name */
    public int f434072u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 f434073v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17756xdaea265 f434074w;

    /* renamed from: x, reason: collision with root package name */
    public final z74.i f434075x;

    /* renamed from: y, reason: collision with root package name */
    public p74.w f434076y;

    /* renamed from: z, reason: collision with root package name */
    public final q74.b0 f434077z;

    public f(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mActivity, "mActivity");
        this.f434067p = c17933xe8d1b226;
        this.f434068q = b1Var;
        this.f434069r = mActivity;
        this.f434070s = i17;
        this.f434075x = new z74.i();
        this.F = 1;
        this.f310364d = c19807x593d1720;
        this.f310365e = c17933xe8d1b226;
        this.f310371n = iVar;
        this.f434077z = new q74.b0(2);
    }

    @Override // p74.a
    public void M(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        try {
            l(null, this.f310365e, i17);
            q74.b0 b0Var = this.f434077z;
            if (b0Var != null) {
                b0Var.g(i17);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideCardDetailItem", "onItemClick error: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        try {
            m(view, view2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideCardDetailItem", "initView error: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        java.lang.String m70375x338a8cc7;
        java.lang.Integer num;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f434067p;
        q74.b0 b0Var = this.f434077z;
        if (c17933xe8d1b226 != null) {
            try {
                java.lang.String T = ca4.z0.T(c17933xe8d1b226);
                if (!android.text.TextUtils.isEmpty(T) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(T, str)) {
                    a84.t0.a(b0Var);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideCardDetailItem", "onAdRemoved error: " + th6.getMessage());
            }
        }
        if (c17933xe8d1b226 != null && (m70375x338a8cc7 = c17933xe8d1b226.m70375x338a8cc7()) != null) {
            if (b0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                int i17 = b0Var.f441949i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                num = java.lang.Integer.valueOf(i17);
            } else {
                num = null;
            }
            a84.t0.a(new ca4.a(m70375x338a8cc7, 2, 1569, null, num, 8, null));
        }
        p74.w wVar = this.f434076y;
        if (wVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.f434148i.removeCallbacksAndMessages(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        }
        if (b0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            b0Var.f441950j = -1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        z74.i iVar = this.f434075x;
        if (iVar != null) {
            iVar.j();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e02 = this.f434073v;
        int m69487x91c80705 = c17757xeeb72e02 != null ? (int) c17757xeeb72e02.m69487x91c80705() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e022 = this.f434073v;
        int m69486x6f36753e = c17757xeeb72e022 != null ? c17757xeeb72e022.m69486x6f36753e() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e023 = this.f434073v;
        if (c17757xeeb72e023 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardRecyclerView", "reset");
            c17757xeeb72e023.f244739b2 = 0L;
            c17757xeeb72e023.f244741d2 = 0L;
            c17757xeeb72e023.f244740c2 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        }
        a84.t0.a(new q74.v(this.f434067p, 1, m69487x91c80705, m69486x6f36753e, false));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        try {
            super.g();
            p74.w wVar = this.f434076y;
            if (wVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                wVar.f434144e = false;
                z74.i iVar = wVar.f434140a;
                if (iVar != null) {
                    iVar.d();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17756xdaea265 c17756xdaea265 = this.f434074w;
            if (c17756xdaea265 != null) {
                c17756xdaea265.o();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideCardDetailItem", "onPause error: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        java.util.List<s34.x0> list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310365e;
            s34.a1 a1Var = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38210x95847c91;
            this.F = p74.k.d((a1Var == null || (list = a1Var.f76695x5800ff2c) == null) ? null : (s34.x0) kz5.n0.Z(list));
            if ((a1Var != null ? a1Var.f76694x80bfd259 : null) != null) {
                if (this.D == null) {
                    this.D = new w64.n(this.f434069r, this.f434070s, this.f434068q, null, null);
                }
                if (this.B == null) {
                    p74.d dVar = new p74.d();
                    dVar.f434059a = this.f434073v;
                    dVar.f434060b = this.E;
                    dVar.f434061c = this.f434076y;
                    dVar.f434062d = this.f434074w;
                    dVar.f434063e = this.C;
                    dVar.f434064f = this.D;
                    dVar.f434065g = this.f434077z;
                    this.B = new p74.o(this.f434069r, dVar, this.F);
                }
            }
            p74.o oVar = this.B;
            if (oVar != null) {
                oVar.c(this.f310365e, a1Var, this.F);
            }
            p74.k.a(this.f434071t, null, null, null, this.f434072u, this.f434070s);
            p74.w wVar = this.f434076y;
            if (wVar != null) {
                wVar.l(this.f434074w);
            }
            if (this.H == null) {
                this.H = new a44.k(this.G, this.f310367g);
            }
            a44.k kVar = this.H;
            if (kVar != null) {
                android.view.View view = this.f310370m;
                kVar.g(view != null ? view.getContext() : null, this.f310365e, this.f434072u);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideCardDetailItem", "refreshView error: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    public final void l(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null || c17933xe8d1b226.m70354x74235b3e().f38210x95847c91 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17756xdaea265 c17756xdaea265 = this.f434074w;
        int p17 = c17756xdaea265 != null ? c17756xdaea265.p() : -1;
        if (i17 > p17 && p17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17756xdaea265 c17756xdaea2652 = this.f434074w;
            if (c17756xdaea2652 != null) {
                c17756xdaea2652.F();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f434067p;
        s34.a1 a1Var = (c17933xe8d1b2262 == null || (m70354x74235b3e = c17933xe8d1b2262.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38210x95847c91;
        if (a1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        s34.x0 x0Var = a1Var.f76695x5800ff2c.get(i17);
        if (x0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = x0Var.f76730xf7a0a3ac;
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        c17702x544f64e9.f244102a = 3;
        w64.n nVar = this.A;
        if (nVar != null) {
            nVar.o(c17702x544f64e9, c17933xe8d1b226, i17);
        }
        w64.n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.k(view);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    public final void m(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        if (view == null || (c17933xe8d1b226 = this.f310365e) == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdSlideCardDetailItem", "initViewInternal: contentView or snsInfo or adXml is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f310365e;
        s34.a1 a1Var = (c17933xe8d1b2262 == null || (m70354x74235b3e = c17933xe8d1b2262.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38210x95847c91;
        if (a1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdSlideCardDetailItem", "initViewInternal: adSliderFullCardInfo is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        this.f310367g = view2;
        q74.b0 b0Var = this.f434077z;
        int i17 = this.f434070s;
        if (b0Var != null) {
            b0Var.f(this.f310365e, i17, a1Var);
        }
        this.f434071t = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        this.f434073v = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02) view.findViewById(com.p314xaae8f345.mm.R.id.v7t);
        this.E = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.v7f);
        if (this.f434073v != null) {
            this.f434072u = p74.k.b(this.f434069r, i17, this.f310372o);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e02 = this.f434073v;
            if (c17757xeeb72e02 != null) {
                c17757xeeb72e02.m7963x830bc99d(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e022 = this.f434073v;
            if (c17757xeeb72e022 != null) {
                c17757xeeb72e022.setOverScrollMode(2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e023 = this.f434073v;
            if (c17757xeeb72e023 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
                return;
            }
            this.f434074w = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17756xdaea265(c17757xeeb72e023);
            p74.w wVar = new p74.w(this.f434075x, b0Var, i17);
            this.f434076y = wVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = this.f310365e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.f434147h = c17933xe8d1b2263;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            java.util.List<s34.x0> list = a1Var.f76695x5800ff2c;
            int d17 = p74.k.d(list != null ? (s34.x0) kz5.n0.Z(list) : null);
            this.F = d17;
            p74.j c17 = p74.k.c(d17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWidthDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWidthDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            float f17 = c17.f434097a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeightDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeightDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            float f18 = c17.f434098b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposeDistance2Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposeDistance2Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposeDistance3Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposeDistance3Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            p74.i iVar = new p74.i(f17, f18, 28.0f, 24.0f, this.F, 0.0f, 0.0f, 96, null);
            this.C = iVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17756xdaea265 c17756xdaea265 = this.f434074w;
            if (c17756xdaea265 != null) {
                c17756xdaea265.D(iVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17756xdaea265 c17756xdaea2652 = this.f434074w;
            if (c17756xdaea2652 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                c17756xdaea2652.f245331y = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17756xdaea265 c17756xdaea2653 = this.f434074w;
            if (c17756xdaea2653 != null) {
                c17756xdaea2653.E(this.f434076y);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17756xdaea265 c17756xdaea2654 = this.f434074w;
            if (c17756xdaea2654 != null) {
                c17756xdaea2654.C(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e024 = this.f434073v;
            if (c17757xeeb72e024 != null) {
                c17757xeeb72e024.mo7967x900dcbe1(this.f434074w);
            }
            this.A = new w64.n(this.f434069r, this.f434070s, this.f434068q, null, new p74.e(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e025 = this.f434073v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17757xeeb72e025);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2264 = this.f310365e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b2264);
            p74.c cVar = new p74.c(c17757xeeb72e025, c17933xe8d1b2264);
            cVar.mo8164xbbdced85(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
            cVar.f434057h = this;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e.C17757xeeb72e02 c17757xeeb72e026 = this.f434073v;
            if (c17757xeeb72e026 != null) {
                c17757xeeb72e026.mo7960x6cab2c8d(cVar);
            }
        }
        this.G = (android.view.ViewStub) this.f310369i.findViewById(com.p314xaae8f345.mm.R.id.g6y);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        i64.b1 b1Var = this.f434068q;
        if (b1Var != null) {
            java.lang.String T = ca4.z0.T(this.f310365e);
            if (!android.text.TextUtils.isEmpty(T) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(T, "0")) {
                b1Var.a(T, this);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }
}
