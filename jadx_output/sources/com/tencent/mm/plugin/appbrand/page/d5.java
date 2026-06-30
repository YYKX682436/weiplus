package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class d5 extends we.a implements com.tencent.mm.plugin.appbrand.page.r4 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f86522p1 = 0;
    public android.widget.FrameLayout M;
    public com.tencent.mm.plugin.appbrand.page.x1 N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public long S;
    public long T;
    public long U;
    public java.lang.String V;
    public java.lang.String W;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.wd[] f86523l1;

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.Deque f86524p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f86525x0;

    /* renamed from: y0, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f86526y0;

    static {
        int i17 = com.tencent.mm.plugin.appbrand.launching.ka.f84720a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ModularizingPkgRetrieverContract", "<clinit>");
    }

    public d5(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(context, o6Var);
        this.P = false;
        this.Q = false;
        this.R = false;
        this.f86524p0 = new java.util.LinkedList();
        if (!getRuntime().q2() && com.tencent.mm.plugin.appbrand.ui.e4.g()) {
            setPageNavigationPushTimeout(com.tencent.mm.plugin.appbrand.ui.e4.d());
        }
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f86526y0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.jsapi.video.event.AppBrandVideoPlayEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$1
            {
                this.__eventId = 839890650;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.jsapi.video.event.AppBrandVideoPlayEvent appBrandVideoPlayEvent) {
                if (appBrandVideoPlayEvent == null) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] receive weishi play event");
                int i17 = com.tencent.mm.plugin.appbrand.page.d5.f86522p1;
                com.tencent.mm.plugin.appbrand.page.d5 d5Var = com.tencent.mm.plugin.appbrand.page.d5.this;
                if (d5Var.M != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed");
                    android.widget.FrameLayout frameLayout = d5Var.M;
                    com.tencent.mm.plugin.appbrand.o6 runtime = d5Var.getRuntime();
                    runtime.j(new com.tencent.mm.plugin.appbrand.page.e5(d5Var, frameLayout), 300L);
                    d5Var.M = null;
                    com.tencent.mm.plugin.appbrand.ui.vc vcVar = runtime.f74811t;
                    if (vcVar instanceof com.tencent.mm.plugin.appbrand.ui.zc) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed, hide");
                        ((com.tencent.mm.plugin.appbrand.ui.zc) vcVar).e(true, "", null);
                    }
                }
                com.tencent.mm.plugin.appbrand.weishi.c.b();
                return false;
            }
        };
        this.f86523l1 = new com.tencent.mm.plugin.appbrand.page.wd[]{com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH, com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB, com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH, com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH, com.tencent.mm.plugin.appbrand.page.wd.REDIRECT_TO};
        setDelegate(this);
        setSkylineRouter((com.tencent.mm.plugin.appbrand.page.jb) o6Var.C0().z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void A() {
        com.tencent.mm.plugin.appbrand.page.x1 x1Var = this.N;
        if (x1Var == null) {
            super.A();
        } else {
            x1Var.dismiss();
            this.N = null;
        }
    }

    @Override // we.a, com.tencent.mm.plugin.appbrand.page.i3
    public void B() {
        android.view.View rootView;
        super.B();
        if (getCurrentPage() != null && getCurrentPage().getCurrentPageView() != null) {
            if (getRuntime().g2() == 1118) {
                if (this.P && !this.Q) {
                    java.lang.String Y1 = getCurrentPage().getCurrentPageView().Y1();
                    java.lang.String str = this.V;
                    if (str != null && str.equals(Y1)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "statPageTime onBackground");
                        com.tencent.mm.plugin.appbrand.report.model.h w37 = ((com.tencent.mm.plugin.appbrand.page.n7) getCurrentPage().getCurrentPageView()).w3();
                        this.S = w37 == null ? 0L : w37.a();
                        this.Q = true;
                    }
                }
                this.U = java.lang.System.currentTimeMillis() - this.T;
                if (this.P && this.Q && getRuntime().l2() != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "report pageStayTime:%d, appStayTime:%d", java.lang.Long.valueOf(this.S), java.lang.Long.valueOf(this.U));
                    long j17 = this.S;
                    long j18 = this.U;
                    com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj appBrandRecommendStatObj = getRuntime().l2().f87796o;
                    if (appBrandRecommendStatObj != null) {
                        java.util.Set set = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
                        ik1.h0.a().postToWorker(new x81.e(1, j17, j18, appBrandRecommendStatObj));
                    }
                }
            }
            if (this.R && getRuntime().g2() == 1162 && java.lang.System.currentTimeMillis() - this.T >= 3000) {
                com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer = getRuntime().u0().f77303p2;
                java.lang.String str2 = appBrandLaunchFromNotifyReferrer.f77314d;
                int i17 = appBrandLaunchFromNotifyReferrer.f77316f;
                java.lang.String str3 = appBrandLaunchFromNotifyReferrer.f77317g;
                java.lang.String str4 = appBrandLaunchFromNotifyReferrer.f77318h;
                int i18 = appBrandLaunchFromNotifyReferrer.f77319i;
                java.lang.String str5 = appBrandLaunchFromNotifyReferrer.f77320m;
                java.lang.String str6 = this.W;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str6 == null) {
                    str6 = "";
                }
                if (!str6.equals(str3)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19724, 4, 0, 0, java.lang.Integer.valueOf(i18), 0, null, 0, 0, 0, str2, null, null, str3, 0, null, str4, java.lang.Integer.valueOf(i17), null, null, str5);
                    this.W = str3;
                }
            }
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = getRuntime().H2;
        l0Var.f91199e.c();
        if (l0Var.e().c()) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = l0Var.f91195a;
            com.tencent.mm.plugin.appbrand.hc hcVar = o6Var.f74796e;
            if (!kotlin.jvm.internal.o.b(hcVar != null ? hcVar.getActiveRuntime() : null, o6Var)) {
                com.tencent.mm.plugin.appbrand.page.d5 x07 = o6Var.x0();
                android.view.KeyEvent.Callback findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.tencent.mm.R.id.w_);
                hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
                if (eVar != null) {
                    eVar.setExternalHeaderVisibility(8);
                }
            }
            com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = l0Var.e().f77366p;
            if (weAppHalfScreenStatusChangeListener != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeAppHalfScreenStatusChangeListener", "notifyHalfScreenPause");
                android.os.ResultReceiver resultReceiver = weAppHalfScreenStatusChangeListener.f77397e;
                if (resultReceiver != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    k91.q3[] q3VarArr = k91.q3.f305733d;
                    bundle.putInt("action", 6);
                    resultReceiver.send(0, bundle);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void C() {
        if (getPageCount() > 0) {
            getReporter().a((com.tencent.luggage.sdk.jsapi.component.b) getCurrentPage().getCurrentPageView());
        }
        com.tencent.mm.plugin.appbrand.page.x1 x1Var = this.N;
        if (x1Var != null) {
            x1Var.i();
            this.N = null;
        }
        com.tencent.mm.sdk.event.IListener iListener = this.f86526y0;
        if (iListener != null) {
            iListener.dead();
        }
    }

    @Override // we.a, com.tencent.mm.plugin.appbrand.page.i3
    public void D() {
        android.view.View rootView;
        super.D();
        mi1.v vVar = getRuntime().f74821z;
        if (vVar.f326703b != null) {
            vVar.c().setBackgroundColor(0);
        }
        o0();
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = getRuntime().H2;
        l0Var.l();
        l0Var.k();
        if (l0Var.e().c()) {
            com.tencent.mm.plugin.appbrand.o6 runtime = l0Var.f91195a;
            kotlin.jvm.internal.o.g(runtime, "runtime");
            com.tencent.mm.plugin.appbrand.page.d5 x07 = runtime.x0();
            android.view.KeyEvent.Callback findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.tencent.mm.R.id.w_);
            hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
            if (eVar != null) {
                eVar.setExternalHeaderVisibility(0);
            }
            com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = l0Var.e().f77366p;
            if (weAppHalfScreenStatusChangeListener != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeAppHalfScreenStatusChangeListener", "notifyHalfScreenResume");
                android.os.ResultReceiver resultReceiver = weAppHalfScreenStatusChangeListener.f77397e;
                if (resultReceiver != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    k91.q3[] q3VarArr = k91.q3.f305733d;
                    bundle.putInt("action", 5);
                    resultReceiver.send(0, bundle);
                }
            }
        }
    }

    @Override // we.a, com.tencent.mm.plugin.appbrand.page.i3
    public com.tencent.mm.plugin.appbrand.page.a5 E(com.tencent.mm.plugin.appbrand.page.w2 out, com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        ni1.f fVar;
        com.tencent.mm.plugin.appbrand.page.a5 E = super.E(out, w2Var);
        getRuntime().Q2().b(w2Var.getCurrentUrl());
        re.n nVar = getRuntime().f86168e3;
        if (nVar != null) {
            nVar.getClass();
            kotlin.jvm.internal.o.g(out, "out");
            ((ku5.t0) ku5.t0.f312615d).B(new re.k(nVar));
            com.tencent.mm.plugin.appbrand.page.v5 currentPageView = w2Var.getCurrentPageView();
            if (currentPageView != null && (fVar = (ni1.f) currentPageView.B1(ni1.f.class)) != null) {
                fVar.P();
            }
        }
        return E;
    }

    @Override // we.a, com.tencent.mm.plugin.appbrand.page.i3
    public void F(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, com.tencent.mm.plugin.appbrand.page.wd type) {
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView;
        ni1.f fVar;
        super.F(w2Var, w2Var2, type);
        com.tencent.mm.plugin.appbrand.page.x1 x1Var = this.N;
        if (x1Var != null) {
            x1Var.setVisibility(8);
            x1Var.i();
            this.N = null;
        }
        getRuntime().Q2().b(w2Var2.getCurrentUrl());
        re.n nVar = getRuntime().f86168e3;
        com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_TO;
        if (nVar != null) {
            kotlin.jvm.internal.o.g(type, "type");
            com.tencent.mm.plugin.appbrand.page.wd wdVar2 = com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB;
            if (wdVar == type) {
                nVar.d(type);
                try {
                    if (nVar.f394278a.y0() > nVar.f394280c) {
                        final re.m mVar = new re.m(nVar);
                        w2Var2.N(new java.lang.Runnable(mVar) { // from class: re.o

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ yz5.a f394286d;

                            {
                                kotlin.jvm.internal.o.g(mVar, "function");
                                this.f394286d = mVar;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f394286d.invoke();
                            }
                        });
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]tryPauseRenderingOfInvisiblePages appId[" + nVar.f394279b + "] type[" + type + "] maxKeepPageCount[" + nVar.f394280c + "] keepInvisbileTabbarPagesActive[" + nVar.f394281d + ']', new java.lang.Object[0]);
                }
            } else if (wdVar2 == type) {
                try {
                    if (!nVar.f394281d) {
                        com.tencent.mm.plugin.appbrand.page.i3 x07 = nVar.f394278a.x0();
                        com.tencent.mm.plugin.appbrand.page.w2 currentPage = x07 != null ? x07.getCurrentPage() : null;
                        if ((currentPage instanceof com.tencent.mm.plugin.appbrand.page.y1) && (currentPageView = ((com.tencent.mm.plugin.appbrand.page.y1) currentPage).getCurrentPageView()) != null) {
                            com.tencent.mm.plugin.appbrand.page.y1 y1Var = (com.tencent.mm.plugin.appbrand.page.y1) currentPage;
                            y1Var.getClass();
                            for (com.tencent.mm.plugin.appbrand.page.v5 v5Var : ((java.util.HashMap) y1Var.f87270x1).values()) {
                                if (kotlin.jvm.internal.o.b(currentPageView, v5Var)) {
                                    break;
                                }
                                kotlin.jvm.internal.o.d(v5Var);
                                ni1.f fVar2 = (ni1.f) v5Var.B1(ni1.f.class);
                                if (fVar2 != null) {
                                    fVar2.V();
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th7, "[wxa_reload]tryPauseRenderingOfInvisibleTabbarPages appId[" + nVar.f394279b + "], switch[" + nVar.f394281d + ']', new java.lang.Object[0]);
                }
            }
            com.tencent.mm.plugin.appbrand.page.v5 currentPageView2 = w2Var2.getCurrentPageView();
            if (currentPageView2 != null && (fVar = (ni1.f) currentPageView2.B1(ni1.f.class)) != null) {
                fVar.P();
            }
            if (wdVar2 != type && wdVar != type) {
                ((ku5.t0) ku5.t0.f312615d).B(new re.l(nVar, type));
            }
        }
        if (w2Var != null && type == wdVar && getRuntime().g2() == 1118 && this.P && !this.Q) {
            java.lang.String Y1 = w2Var.getCurrentPageView() == null ? "" : w2Var.getCurrentPageView().Y1();
            java.lang.String str = this.V;
            if (str == null || !str.equals(Y1)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "statPageTime");
            this.S = ((com.tencent.mm.plugin.appbrand.page.n7) w2Var.getCurrentPageView()).w3().a();
            this.Q = true;
        }
    }

    @Override // we.a, com.tencent.mm.plugin.appbrand.page.i3
    public com.tencent.mm.plugin.appbrand.page.a5 G(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, com.tencent.mm.plugin.appbrand.page.wd type, java.lang.String str, boolean z17) {
        gf.n2 n2Var;
        gf.d2 d2Var;
        com.tencent.mm.plugin.appbrand.page.a5 G = super.G(w2Var, w2Var2, type, str, z17);
        if ((w2Var2 instanceof com.tencent.mm.plugin.appbrand.page.y1) && com.tencent.mm.plugin.appbrand.kf.a(getRuntime())) {
            zl1.t tabBar = ((com.tencent.mm.plugin.appbrand.page.y1) w2Var2).getTabBar();
            if (tabBar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "checkSinglePageModeLogic tab null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "checkSinglePageModeLogic set tab gone");
                if (tabBar.getVisibility() == 0) {
                    tabBar.setVisibility(8);
                }
            }
        }
        if (w2Var2.getCurrentPageView().p2() && (n2Var = (gf.n2) getRuntime().p0(gf.n2.class, false)) != null && n2Var.f271145h && n2Var.f271147m && n2Var.f271148n && (d2Var = n2Var.f271146i) != null && d2Var.f271036c != null) {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(getRuntime());
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = getRuntime().S2(false);
            if (a17 != null && S2 != null) {
                java.lang.String a18 = nf.z.a(str);
                java.util.HashSet hashSet = new java.util.HashSet();
                for (gf.e2 e2Var : d2Var.f271036c) {
                    java.util.List list = e2Var.f271042d;
                    boolean isEmpty = list.isEmpty();
                    if (!isEmpty && a18 != null && !a18.isEmpty()) {
                        isEmpty = list.contains(a18);
                    }
                    if (isEmpty) {
                        if (hashSet.add((a18 == null || a18.isEmpty()) ? "" : a18)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "wxa_expt_hitStruct ID:21627 has reported  targetUrl =" + str);
                            com.tencent.mm.autogen.mmdata.rpt.wxa_expt_hitStruct wxa_expt_hitstruct = new com.tencent.mm.autogen.mmdata.rpt.wxa_expt_hitStruct();
                            wxa_expt_hitstruct.f63223d = wxa_expt_hitstruct.b("AppId", getRuntime().f74803n, true);
                            wxa_expt_hitstruct.f63224e = a17.f88139i;
                            wxa_expt_hitstruct.f63225f = a17.f88136f;
                            wxa_expt_hitstruct.f63226g = wxa_expt_hitstruct.b("libVersion", S2.W0(), true);
                            wxa_expt_hitstruct.f63227h = wxa_expt_hitstruct.b("libUpdateTime", S2.B7(), true);
                            wxa_expt_hitstruct.f63228i = e2Var.f271040b;
                            java.lang.String str2 = e2Var.f271041c;
                            wxa_expt_hitstruct.f63229j = wxa_expt_hitstruct.b("exptParam", str2 != null ? fp.s0.a(str2) : null, true);
                            wxa_expt_hitstruct.f63230k = 3L;
                            wxa_expt_hitstruct.f63231l = a17.K ? 1L : 2L;
                            wxa_expt_hitstruct.k();
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.appbrand.weishi.c.a(getRuntime());
        re.n nVar = getRuntime().f86168e3;
        if (nVar != null) {
            nVar.getClass();
            kotlin.jvm.internal.o.g(type, "type");
            nVar.c(w2Var2);
        }
        return G;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void H(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.wd type) {
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = getRuntime().H2;
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) w2Var.getCurrentPageView();
        l0Var.getClass();
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(type, "type");
        pageView.getRuntime();
        com.tencent.mm.plugin.appbrand.report.quality.h1 h1Var = getRuntime().R2;
        com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var = h1Var == null ? null : h1Var.f88202d;
        if (d1Var != null) {
            com.tencent.mm.plugin.appbrand.page.n7 page = (com.tencent.mm.plugin.appbrand.page.n7) w2Var.getCurrentPageView();
            kotlin.jvm.internal.o.g(page, "page");
            if (!d1Var.f88163b || d1Var.c(page)) {
                return;
            }
            d1Var.b(page, com.tencent.mm.plugin.appbrand.report.quality.j0.f88209d, d1Var.f88165d);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void J(com.tencent.mm.plugin.appbrand.page.wd type, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[onPageSwitchCancel]");
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = getRuntime().H2;
        l0Var.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.appbrand.o6 o6Var = l0Var.f91195a;
        if (l0Var.a(o6Var, type)) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
            kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
            if (((java.lang.Boolean) l0Var.z(w2Var, w2Var2, u07).f302833d).booleanValue()) {
                l0Var.s(!((java.lang.Boolean) r3.f302834e).booleanValue(), false);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void K(com.tencent.mm.plugin.appbrand.page.wd type, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        com.tencent.mm.plugin.appbrand.page.z zVar;
        super.K(type, w2Var, w2Var2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[onPageSwitchEnd]");
        if (getRuntime() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 runtime = getRuntime();
        boolean z17 = false;
        if (type == com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH) {
            bm5.x0 x0Var = runtime.f86169f3;
            java.lang.Runnable runnable = (java.lang.Runnable) x0Var.d();
            if (runnable != null) {
                runtime.f74810s.removeCallbacks(runnable);
                x0Var.reset();
            }
            runtime.K("onPageSwitchEnd getPageContainer().setTranslationY(0)", new java.lang.Object[0]);
            runtime.x0().setTranslationY(0.0f);
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = runtime.H2;
        l0Var.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = l0Var.f91195a;
        if (l0Var.a(o6Var2, type)) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var2.u0();
            kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
            jz5.l z18 = l0Var.z(w2Var, w2Var2, u07);
            if (((java.lang.Boolean) z18.f302833d).booleanValue()) {
                l0Var.s(((java.lang.Boolean) z18.f302834e).booleanValue(), false);
            }
        }
        l0Var.l();
        if (!android.text.TextUtils.isEmpty(o6Var2.u0().C2) && !l0Var.h(w2Var) && l0Var.f(w2Var2)) {
            z17 = true;
        }
        com.tencent.mm.plugin.appbrand.widget.h hVar = o6Var2.I2;
        if (z17) {
            if (hVar != null) {
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08 = hVar.f91137a.u0();
                kotlin.jvm.internal.o.f(u08, "getInitConfig(...)");
                hVar.b(u08);
                return;
            }
            return;
        }
        if (hVar == null || (o6Var = hVar.f91137a) == null || (zVar = o6Var.D1) == null) {
            return;
        }
        zVar.C();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void L(com.tencent.mm.plugin.appbrand.page.wd type, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, float f17) {
        com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar c17;
        if (getRuntime() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = getRuntime().H2;
        l0Var.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.appbrand.o6 o6Var = l0Var.f91195a;
        if (l0Var.a(o6Var, type)) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
            kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
            jz5.l z17 = l0Var.z(w2Var, w2Var2, u07);
            if (((java.lang.Boolean) z17.f302833d).booleanValue() && (c17 = l0Var.c()) != null) {
                java.lang.Boolean bool = (java.lang.Boolean) z17.f302834e;
                c17.setHeaderAlpha(bool.booleanValue() ? f17 : 100 - f17);
                int color = c17.getContext().getResources().getColor(c17.h(com.tencent.mm.R.color.aaw));
                if (!bool.booleanValue()) {
                    f17 = 100 - f17;
                }
                int argb = android.graphics.Color.argb((int) ((f17 * 255.0f) / 100), android.graphics.Color.red(color), android.graphics.Color.green(color), android.graphics.Color.blue(color));
                mi1.v vVar = o6Var.f74821z;
                if (vVar.f326703b != null) {
                    vVar.c().setBackgroundColor(argb);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void M(com.tencent.mm.plugin.appbrand.page.wd type, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        super.M(type, w2Var, w2Var2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[onPageSwitchStart]");
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = getRuntime().H2;
        l0Var.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig e17 = l0Var.e();
        if (!(e17.c() && e17.f77364n) || w2Var2 == null) {
            return;
        }
        w2Var2.setForceDisableMeasureCache(true);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void N() {
        new com.tencent.mm.plugin.appbrand.ReportStorageSizeTask().C(getRuntime().f74803n);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public boolean P(boolean z17) {
        df.w1 t17;
        if (!p0()) {
            return false;
        }
        s0();
        super.P(z17);
        com.tencent.mm.plugin.appbrand.page.d7 Q1 = this.f86715u.Q1();
        if (!z17 || !(Q1 instanceof gf.d0) || (t17 = ((gf.d0) Q1).f0().t()) == null) {
            return true;
        }
        t17.s();
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public int R() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.app.Activity r07 = getRuntime().r0();
        float f17 = (r07 == null || (resources = r07.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density;
        float f18 = 20 * f17;
        float B = (i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) / 5) - f18;
        float f19 = (100 * f17) + 0.5f;
        if (B > 0.0f) {
            f18 = B;
        }
        return (int) java.lang.Math.min(f19, f18);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public int S() {
        if (rh1.b.f395624a) {
            return (int) ((getContext().getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public java.lang.Object T(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        return android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477880e4);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public java.lang.Object U(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        return android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477889ed);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public java.lang.Object V(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        return android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477886ea);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public java.lang.Object W(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        return android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477882e6);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public int X(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        return (com.tencent.mm.plugin.appbrand.kf.a(getRuntime()) || getRuntime().e3() || r(w2Var) != null || (android.os.Build.VERSION.SDK_INT >= 34 && !getRuntime().Q0())) ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    @Override // com.tencent.mm.plugin.appbrand.page.r4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.String r3, com.tencent.mm.plugin.appbrand.page.wd r4, com.tencent.mm.plugin.appbrand.page.i3 r5, com.tencent.mm.plugin.appbrand.page.u4 r6) {
        /*
            r2 = this;
            iz5.a.f(r2, r5)
            com.tencent.mm.plugin.appbrand.o6 r5 = r2.getRuntime()
            com.tencent.mm.plugin.appbrand.page.wd[] r0 = r2.f86523l1
            boolean r0 = u46.a.b(r0, r4)
            boolean r5 = gf.y0.b(r5, r3, r0)
            if (r5 == 0) goto L21
            gf.t0 r5 = new gf.t0
            com.tencent.mm.plugin.appbrand.o6 r0 = r2.getRuntime()
            r5.<init>(r6, r0)
            r2.s0()
        L1f:
            r6 = r5
            goto L35
        L21:
            boolean r5 = com.tencent.mm.plugin.appbrand.da.f77575a
            java.lang.Class<com.tencent.mm.plugin.appbrand.da> r5 = com.tencent.mm.plugin.appbrand.da.class
            monitor-enter(r5)
            boolean r0 = com.tencent.mm.plugin.appbrand.da.f77576b     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L35
            com.tencent.mm.plugin.appbrand.page.bf r5 = new com.tencent.mm.plugin.appbrand.page.bf
            com.tencent.mm.plugin.appbrand.o6 r0 = r2.getRuntime()
            r5.<init>(r6, r0)
            goto L1f
        L35:
            com.tencent.mm.plugin.appbrand.o6 r5 = r2.getRuntime()
            boolean r5 = r5.a2()
            r0 = 0
            if (r5 == 0) goto L43
            r6.setAnimationEnabled(r0)
        L43:
            com.tencent.mm.plugin.appbrand.o6 r5 = r2.getRuntime()
            ph1.h r5 = r5.R
            boolean r1 = r5.e()
            if (r1 != 0) goto L58
            com.tencent.mm.plugin.appbrand.page.i5 r0 = new com.tencent.mm.plugin.appbrand.page.i5
            r0.<init>(r2, r6)
            r5.g(r3, r4, r0)
            goto L5b
        L58:
            r2.q0(r3, r4, r6, r0)
        L5b:
            r3 = 1
            return r3
        L5d:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5d
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.d5.b(java.lang.String, com.tencent.mm.plugin.appbrand.page.wd, com.tencent.mm.plugin.appbrand.page.i3, com.tencent.mm.plugin.appbrand.page.u4):boolean");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public boolean c(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        if (v5Var == null) {
            return false;
        }
        boolean a17 = gf.y0.a(getRuntime(), str);
        if (!v5Var.p2() && !a17) {
            return true;
        }
        if (!v5Var.p2() || !a17) {
            return false;
        }
        ((java.util.LinkedList) this.f86524p0).pollFirst();
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public com.tencent.mm.plugin.appbrand.page.w2 d(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.util.concurrent.Callable callable) {
        if (com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH == wdVar && getRuntime().Z1()) {
            return new com.tencent.mm.plugin.appbrand.headless.m(getContext(), this);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public boolean e(java.lang.String str) {
        boolean z17;
        if (!getRuntime().q2()) {
            if (getRuntime().C0().K1() && p0()) {
                getRuntime().C0().Z1();
            }
            k91.h hVar = getRuntime().m0().f305755y;
            java.lang.String[] strArr = hVar.f305596b;
            if (((strArr.length == 1 && u46.a.b(strArr, "skyline")) || u46.l.c(hVar.f305595a, "skyline")) && !nd1.j0.NAME.equals(str) && p0()) {
                return true;
            }
        }
        boolean z18 = com.tencent.mm.plugin.appbrand.da.f77575a;
        synchronized (com.tencent.mm.plugin.appbrand.da.class) {
            z17 = com.tencent.mm.plugin.appbrand.da.f77576b;
        }
        if (z17) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.da.c(new com.tencent.mm.plugin.appbrand.page.k5(this, str));
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public boolean e0(com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        return com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH == wdVar && ((java.lang.Boolean) ((jz5.n) getRuntime().f86189u2.f74954c).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public boolean g0(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        com.tencent.mm.plugin.appbrand.weishi.c.a(getRuntime());
        boolean[] zArr = {super.g0(w2Var), !getRuntime().e3(), !getRuntime().q2(), true, !com.tencent.mm.plugin.appbrand.kf.a(getRuntime())};
        for (int i17 = 0; i17 < 5; i17++) {
            if (!zArr[i17]) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[%s,%s]->shouldShowActionBarHomeButton: test fail cause #[%d] condition", w2Var.getAppId(), w2Var.getCurrentUrl(), java.lang.Integer.valueOf(i17));
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void h() {
        synchronized (this.f86524p0) {
            this.f86524p0.forEach(new com.tencent.mm.plugin.appbrand.page.d5$$a());
            ((java.util.LinkedList) this.f86524p0).clear();
        }
        super.h();
    }

    public final void o0() {
        if (getCurrentPage() == null || getCurrentPage().getCurrentPageView() == null) {
            return;
        }
        if (getRuntime().g2() == 1118) {
            com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj appBrandRecommendStatObj = getRuntime().l2() == null ? null : getRuntime().l2().f87796o;
            if (appBrandRecommendStatObj != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "recommendStatObj is got");
                java.lang.String str = appBrandRecommendStatObj.f87780h;
                if (!android.text.TextUtils.isEmpty(str)) {
                    java.lang.String str2 = appBrandRecommendStatObj.f87781i;
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        this.V = str + "?" + str2;
                        this.P = true;
                        this.T = java.lang.System.currentTimeMillis();
                    }
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    this.V = getRuntime().t0();
                } else {
                    this.V = str;
                }
                this.P = true;
                this.T = java.lang.System.currentTimeMillis();
            }
        }
        if (getRuntime().g2() == 1162) {
            this.R = true;
            this.T = java.lang.System.currentTimeMillis();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (view instanceof com.tencent.mm.plugin.appbrand.page.w2) {
            com.tencent.mm.plugin.appbrand.page.ve.a((com.tencent.mm.plugin.appbrand.page.w2) view);
        }
    }

    public final boolean p0() {
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = getCurrentPage();
        if (currentPage != null && (currentPageView = currentPage.getCurrentPageView()) != null && currentPageView.p2()) {
            return true;
        }
        gf.n2 n2Var = (gf.n2) getRuntime().p0(gf.n2.class, false);
        return n2Var != null && n2Var.b();
    }

    public final void q0(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.u4 u4Var, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(937, z17 ? 5 : 1);
        getRuntime().R.g(str, wdVar, new com.tencent.mm.plugin.appbrand.page.q5(this, u4Var, wdVar, str, z17));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.page.n7 a(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str) {
        boolean a17 = gf.y0.a(getRuntime(), str);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = null;
        if (!android.text.TextUtils.isEmpty(this.f86525x0) && !a17) {
            synchronized (this.f86524p0) {
                java.util.Iterator it = this.f86524p0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.appbrand.page.n7 n7Var2 = (com.tencent.mm.plugin.appbrand.page.n7) it.next();
                    if (n7Var2 instanceof com.tencent.mm.plugin.appbrand.page.md) {
                        it.remove();
                        n7Var = n7Var2;
                        break;
                    }
                }
            }
            return n7Var != null ? n7Var : new com.tencent.mm.plugin.appbrand.page.md(this.f86525x0);
        }
        if (a17) {
            getRuntime().C0().Z1();
        }
        synchronized (this.f86524p0) {
            java.util.Iterator it6 = this.f86524p0.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.appbrand.page.n7 n7Var3 = (com.tencent.mm.plugin.appbrand.page.n7) it6.next();
                if (!(a17 || n7Var3.p2()) || (a17 && n7Var3.p2())) {
                    it6.remove();
                    n7Var = n7Var3;
                    break;
                }
            }
        }
        if (n7Var == null) {
            return a17 ? com.tencent.mm.plugin.appbrand.page.n7.I3(getRuntime().M2(str)) : new com.tencent.mm.plugin.appbrand.page.n7();
        }
        if (a17) {
            getRuntime().A0(str);
        }
        return n7Var;
    }

    public final void s0() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var;
        com.tencent.mm.plugin.appbrand.utils.s3.b("MicroMsg.AppBrandPageContainerWC", "preloadSkylineViewInner", new java.lang.Object[0]);
        fh1.s0 s0Var = fh1.x0.I;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f271086a;
        fh1.p0 p0Var = new fh1.p0();
        com.tencent.mars.xlog.Log.i("SkylineTextureManager", "registerHandler type:".concat("magic-brush-frame"));
        gf.h1.f271086a.put("magic-brush-frame", p0Var);
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) getRuntime().C0().z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class);
        com.tencent.mm.plugin.appbrand.service.c0 service = getRuntime().C0();
        appServiceSkylineExtensionImpl.getClass();
        kotlin.jvm.internal.o.g(service, "service");
        gf.l0.d(new gf.r(appServiceSkylineExtensionImpl, service));
        if (appServiceSkylineExtensionImpl.f47707c) {
            return;
        }
        synchronized (this.f86524p0) {
            java.util.Iterator it = this.f86524p0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    n7Var = null;
                    break;
                } else {
                    n7Var = (com.tencent.mm.plugin.appbrand.page.n7) it.next();
                    if (n7Var.p2()) {
                        break;
                    }
                }
            }
        }
        if (n7Var == null) {
            java.util.Iterator<com.tencent.mm.plugin.appbrand.page.v5> it6 = getPreloadedPageView().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.appbrand.page.v5 next = it6.next();
                if (next.p2()) {
                    n7Var = (com.tencent.mm.plugin.appbrand.page.n7) next;
                    break;
                }
            }
        }
        if (n7Var == null) {
            n7Var = com.tencent.mm.plugin.appbrand.page.n7.I3(getRuntime().M2("preload_skyline"));
            n7Var.A3(com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadBeforeRuntimeInit);
            synchronized (this.f86524p0) {
                ((java.util.LinkedList) this.f86524p0).add(n7Var);
            }
        }
        n7Var.f86915g2 = com.tencent.mm.plugin.appbrand.page.n7.H3(getRuntime()) ? 1 : 0;
        gf.a2 f07 = ((gf.d0) n7Var.Q1()).f0();
        java.util.Objects.requireNonNull(f07);
        gf.l0.d(new com.tencent.mm.plugin.appbrand.page.j5(this, f07, appServiceSkylineExtensionImpl));
    }

    public void setWAAutoWebViewJs(java.lang.String str) {
        this.f86525x0 = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public final boolean t() {
        com.tencent.mm.plugin.appbrand.page.g4 g4Var;
        java.util.Iterator h07 = h0(false);
        do {
            g4Var = (com.tencent.mm.plugin.appbrand.page.g4) h07;
            if (!g4Var.hasNext()) {
                return false;
            }
        } while (!(((com.tencent.mm.plugin.appbrand.page.w2) g4Var.next()) instanceof com.tencent.mm.plugin.appbrand.headless.m));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0065, code lost:
    
        if (com.tencent.mm.plugin.appbrand.o6.f86162n3 != false) goto L6;
     */
    @Override // com.tencent.mm.plugin.appbrand.page.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.getAppId()
            kg1.a r1 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInit
            com.tencent.mm.plugin.appbrand.keylogger.w.g(r0, r1)
            java.lang.String r0 = r3.getAppId()
            kg1.a r1 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInitUIGroup
            com.tencent.mm.plugin.appbrand.keylogger.w.g(r0, r1)
            java.lang.String r0 = r3.getAppId()
            kg1.a r1 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCreatePageUI
            com.tencent.mm.plugin.appbrand.keylogger.w.g(r0, r1)
            java.lang.String r0 = r3.getAppId()
            kg1.a r1 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCreatePageUI_Game
            com.tencent.mm.plugin.appbrand.keylogger.w.g(r0, r1)
            java.lang.String r0 = r3.getAppId()
            kg1.a r1 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInitUIGroup_Game
            com.tencent.mm.plugin.appbrand.keylogger.w.e(r0, r1)
            super.u(r4)
            java.lang.String r4 = r3.getAppId()
            kg1.a r0 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCreatePageUI
            com.tencent.mm.plugin.appbrand.keylogger.w.e(r4, r0)
            java.lang.String r4 = r3.getAppId()
            kg1.a r0 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInitUIGroup
            com.tencent.mm.plugin.appbrand.keylogger.w.e(r4, r0)
            java.lang.String r4 = r3.getAppId()
            kg1.a r0 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCreatePageUI_Game
            com.tencent.mm.plugin.appbrand.keylogger.w.e(r4, r0)
            java.lang.String r4 = r3.getAppId()
            kg1.a r0 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInitUIGroup_Game
            com.tencent.mm.plugin.appbrand.keylogger.w.e(r4, r0)
            com.tencent.mm.plugin.appbrand.o6 r4 = r3.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r4 = r4.E0()
            boolean r4 = r4.f47296w
            if (r4 != 0) goto L67
            r3.getRuntime()
            boolean r4 = com.tencent.mm.plugin.appbrand.o6.f86162n3
            if (r4 == 0) goto L75
        L67:
            com.tencent.mm.plugin.appbrand.o6 r4 = r3.getRuntime()
            com.tencent.mm.plugin.appbrand.page.g5 r0 = new com.tencent.mm.plugin.appbrand.page.g5
            r0.<init>(r3)
            r1 = 10000(0x2710, double:4.9407E-320)
            r4.j(r0, r1)
        L75:
            com.tencent.mm.plugin.appbrand.report.quality.j r4 = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a     // Catch: java.lang.Throwable -> L7b
            r4.a(r3)     // Catch: java.lang.Throwable -> L7b
            goto L87
        L7b:
            r4 = move-exception
            java.lang.String r0 = "pagecontainerInitReport %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = "MicroMsg.AppBrandPageContainerWC"
            com.tencent.mars.xlog.Log.w(r1, r0, r4)
        L87:
            r3.o0()
            com.tencent.mm.plugin.appbrand.o6 r4 = r3.getRuntime()
            com.tencent.mm.plugin.appbrand.weishi.c.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.d5.u(java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public boolean w() {
        if (getRuntime().u0().Z) {
            return false;
        }
        return (getRuntime().q2() ^ true) || getRuntime().u0().L1.c() || com.tencent.mm.plugin.appbrand.kf.a(getRuntime());
    }

    @Override // we.a, com.tencent.mm.plugin.appbrand.page.i3
    public com.tencent.mm.plugin.appbrand.o6 getRuntime() {
        return (com.tencent.mm.plugin.appbrand.o6) super.getRuntime();
    }

    public d5(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.page.r4 r4Var) {
        super(context, o6Var);
        this.P = false;
        this.Q = false;
        this.R = false;
        this.f86524p0 = new java.util.LinkedList();
        if (!getRuntime().q2() && com.tencent.mm.plugin.appbrand.ui.e4.g()) {
            setPageNavigationPushTimeout(com.tencent.mm.plugin.appbrand.ui.e4.d());
        }
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f86526y0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.jsapi.video.event.AppBrandVideoPlayEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$1
            {
                this.__eventId = 839890650;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.jsapi.video.event.AppBrandVideoPlayEvent appBrandVideoPlayEvent) {
                if (appBrandVideoPlayEvent == null) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] receive weishi play event");
                int i17 = com.tencent.mm.plugin.appbrand.page.d5.f86522p1;
                com.tencent.mm.plugin.appbrand.page.d5 d5Var = com.tencent.mm.plugin.appbrand.page.d5.this;
                if (d5Var.M != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed");
                    android.widget.FrameLayout frameLayout = d5Var.M;
                    com.tencent.mm.plugin.appbrand.o6 runtime = d5Var.getRuntime();
                    runtime.j(new com.tencent.mm.plugin.appbrand.page.e5(d5Var, frameLayout), 300L);
                    d5Var.M = null;
                    com.tencent.mm.plugin.appbrand.ui.vc vcVar = runtime.f74811t;
                    if (vcVar instanceof com.tencent.mm.plugin.appbrand.ui.zc) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed, hide");
                        ((com.tencent.mm.plugin.appbrand.ui.zc) vcVar).e(true, "", null);
                    }
                }
                com.tencent.mm.plugin.appbrand.weishi.c.b();
                return false;
            }
        };
        this.f86523l1 = new com.tencent.mm.plugin.appbrand.page.wd[]{com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH, com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB, com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH, com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH, com.tencent.mm.plugin.appbrand.page.wd.REDIRECT_TO};
        setDelegate(r4Var);
    }
}
