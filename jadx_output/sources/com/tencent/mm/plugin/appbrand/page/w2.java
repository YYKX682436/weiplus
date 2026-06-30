package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class w2 extends me.imid.swipebacklayout.lib.SwipeBackLayout {
    public com.tencent.mm.plugin.appbrand.page.i3 G;
    public android.view.View H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f87192J;
    public boolean K;
    public final int L;
    public final java.util.Map M;
    public final java.util.Set N;
    public int P;
    public int Q;
    public boolean R;
    public final boolean[] S;
    public final z26.e T;
    public boolean U;
    public com.tencent.mm.plugin.appbrand.wxassistant.s2 V;

    public w2(android.content.Context context, com.tencent.mm.plugin.appbrand.page.i3 i3Var) {
        super(context, null);
        this.I = true;
        this.f87192J = false;
        this.K = false;
        this.M = new java.util.HashMap();
        this.N = new java.util.HashSet();
        this.R = false;
        this.S = new boolean[]{false};
        this.T = new com.tencent.mm.plugin.appbrand.page.u2(this);
        this.U = false;
        this.G = i3Var;
        int S = getPageContainer().S();
        if (S <= 0) {
            this.L = super.getEdgeSize();
        } else {
            setEdgeSize(S);
            this.L = S;
        }
    }

    private java.lang.String getLocalClassName() {
        return getClass().getName().replaceFirst(java.util.regex.Pattern.quote("com.tencent.mm.plugin.appbrand"), "");
    }

    public void A() {
        cf.i.b("AppBrandPageProfile| " + getLocalClassName() + " initView()", new com.tencent.mm.plugin.appbrand.page.t2(this));
    }

    public boolean B() {
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            return currentPageView.p2();
        }
        return false;
    }

    public abstract void C(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar);

    public void D() {
    }

    public abstract void E();

    public abstract void F();

    public abstract void G();

    public final void H(float f17) {
        boolean z17 = this.I;
        if (z17) {
            if (f17 >= 0.0f) {
                setVisibility(0);
            } else if (z17) {
                setVisibility(4);
            }
        }
        clearAnimation();
        setTranslationX((getWidth() / 4.0f) * (1.0f - f17) * (-1.0f));
    }

    public void I(com.tencent.mm.plugin.appbrand.wxassistant.s2 s2Var) {
    }

    public com.tencent.mm.plugin.appbrand.page.v5 J(int i17) {
        return null;
    }

    public void K(oi1.n nVar, oi1.l lVar) {
        if (nVar == null) {
            return;
        }
        synchronized (this.M) {
            if (lVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPage", "[registerNavigateBackInterceptionInfo] remove " + nVar);
            } else {
                ((java.util.HashMap) this.M).put(nVar, lVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPage", "[registerNavigateBackInterceptionInfo] add " + nVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPage", "[registerNavigateBackInterceptionInfo] navigateBackInterceptionInfos size=" + ((java.util.HashMap) this.M).size());
        }
    }

    public void L() {
        boolean z17;
        boolean w17;
        if (this.G.getRuntime().V1()) {
            com.tencent.mm.plugin.appbrand.page.v5 currentPageView = getCurrentPageView();
            if (currentPageView != null ? currentPageView.q2() : false) {
                setEnableGesture(false);
            } else {
                com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.G;
                if (i3Var.getRuntime().f74820y1) {
                    w17 = false;
                } else {
                    boolean z18 = i3Var.getActualPageStackSize() <= 1;
                    if (i3Var.getRuntime().R0() && i3Var.getRuntime().B0() != null) {
                        z18 = false;
                    }
                    w17 = z18 ? i3Var.w() : true;
                }
                setEnableGesture(w17);
            }
        } else {
            if (!this.G.getRuntime().f74820y1) {
                com.tencent.mm.plugin.appbrand.page.v5 currentPageView2 = getCurrentPageView();
                if (!(currentPageView2 != null ? currentPageView2.q2() : false)) {
                    com.tencent.mm.plugin.appbrand.page.i3 i3Var2 = this.G;
                    if (i3Var2.getActualPageStackSize() <= 1) {
                        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = i3Var2.getRuntime();
                        if (runtime.V1()) {
                            throw new java.lang.RuntimeException("Stub!");
                        }
                        if (!(runtime.f74807p1 && !runtime.f74820y1)) {
                            z17 = false;
                            setEnableGesture(z17);
                        }
                    }
                    z17 = true;
                    setEnableGesture(z17);
                }
            }
            setEnableGesture(false);
        }
        setEdgeTrackingEnabled(1);
        setOrientation(this.G.X(this));
        setEdgeSize(this.L);
        H(1.0f);
        this.S[0] = false;
        this.R = false;
        e();
    }

    public void M(long j17, java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void N(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.page.r2(this, runnable));
            return;
        }
        java.lang.Object tag = getTag(com.tencent.mm.R.id.f483175yo);
        if (tag instanceof android.animation.Animator) {
            ((android.animation.Animator) tag).addListener(new com.tencent.mm.plugin.appbrand.page.s2(this, runnable));
        } else if (getAnimation() == null) {
            runnable.run();
        } else {
            this.N.add(runnable);
        }
    }

    public java.lang.String getAllElementsRect() {
        return ((com.tencent.mm.plugin.appbrand.wxassistant.q3) getSerializer()).c();
    }

    public java.lang.String getAppId() {
        return this.G.getAppId();
    }

    public com.tencent.mm.plugin.appbrand.page.i3 getContainer() {
        return this.G;
    }

    public final android.view.View getContentView() {
        return this.H;
    }

    public int getCurrentComponentId() {
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            return currentPageView.getComponentId();
        }
        return -1;
    }

    public abstract com.tencent.mm.plugin.appbrand.page.v5 getCurrentPageView();

    public abstract java.lang.String getCurrentUrl();

    public int getCurrentWindowId() {
        return -1;
    }

    public java.lang.String getNativeComponentInfo() {
        com.tencent.mm.plugin.appbrand.widget.k0 w07 = getRuntime().w0();
        android.util.SparseArray clone = w07.f91747a.clone();
        kotlin.jvm.internal.o.f(clone, "clone(...)");
        int size = clone.size();
        for (int i17 = 0; i17 < size; i17++) {
            clone.keyAt(i17);
            ((com.tencent.mm.plugin.appbrand.wxassistant.q3) getSerializer()).d(new com.tencent.mm.plugin.appbrand.wxassistant.t2((com.tencent.mm.ui.widget.dialog.k0) clone.valueAt(i17)));
        }
        android.util.SparseArray clone2 = w07.f91748b.clone();
        kotlin.jvm.internal.o.f(clone2, "clone(...)");
        int size2 = clone2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            clone2.keyAt(i18);
            fl1.b2 b2Var = (fl1.b2) clone2.valueAt(i18);
            com.tencent.mm.plugin.appbrand.wxassistant.s2 serializer = getSerializer();
            android.view.View contentView = b2Var.getContentView();
            kotlin.jvm.internal.o.f(contentView, "getContentView(...)");
            ((com.tencent.mm.plugin.appbrand.wxassistant.q3) serializer).e(contentView);
        }
        com.tencent.mm.plugin.appbrand.wxassistant.s2 serializer2 = getSerializer();
        android.view.ViewGroup viewGroup = getCurrentPageView().getCustomViewContainer().f86757a;
        kotlin.jvm.internal.o.f(viewGroup, "getRootView(...)");
        ((com.tencent.mm.plugin.appbrand.wxassistant.q3) serializer2).d(new com.tencent.mm.plugin.appbrand.wxassistant.d2(viewGroup));
        tl1.b bVar = (tl1.b) getRuntime().f74810s.getRootView().findViewById(com.tencent.mm.R.id.f483189z2);
        if (bVar != null && bVar.getVisibility() == 0) {
            ((com.tencent.mm.plugin.appbrand.wxassistant.q3) getSerializer()).e(bVar);
        }
        java.lang.String b17 = ((com.tencent.mm.plugin.appbrand.wxassistant.q3) getSerializer()).b();
        int size3 = clone.size();
        for (int i19 = 0; i19 < size3; i19++) {
            clone.keyAt(i19);
            ((com.tencent.mm.plugin.appbrand.wxassistant.q3) getSerializer()).g(new com.tencent.mm.plugin.appbrand.wxassistant.t2((com.tencent.mm.ui.widget.dialog.k0) clone.valueAt(i19)));
        }
        int size4 = clone2.size();
        for (int i27 = 0; i27 < size4; i27++) {
            clone2.keyAt(i27);
            fl1.b2 b2Var2 = (fl1.b2) clone2.valueAt(i27);
            com.tencent.mm.plugin.appbrand.wxassistant.s2 serializer3 = getSerializer();
            android.view.View contentView2 = b2Var2.getContentView();
            kotlin.jvm.internal.o.f(contentView2, "getContentView(...)");
            ((com.tencent.mm.plugin.appbrand.wxassistant.q3) serializer3).h(contentView2);
        }
        com.tencent.mm.plugin.appbrand.wxassistant.s2 serializer4 = getSerializer();
        android.view.ViewGroup viewGroup2 = getCurrentPageView().getCustomViewContainer().f86757a;
        kotlin.jvm.internal.o.f(viewGroup2, "getRootView(...)");
        ((com.tencent.mm.plugin.appbrand.wxassistant.q3) serializer4).g(new com.tencent.mm.plugin.appbrand.wxassistant.d2(viewGroup2));
        if (bVar != null && bVar.getVisibility() == 0) {
            ((com.tencent.mm.plugin.appbrand.wxassistant.q3) getSerializer()).h(bVar);
        }
        return b17;
    }

    public k91.f getPageConfig() {
        return getCurrentPageView().M1();
    }

    public final com.tencent.mm.plugin.appbrand.page.i3 getPageContainer() {
        return this.G;
    }

    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime getRuntime() {
        return this.G.getRuntime();
    }

    public final synchronized com.tencent.mm.plugin.appbrand.wxassistant.s2 getSerializer() {
        if (this.V == null) {
            com.tencent.mm.plugin.appbrand.wxassistant.q3 q3Var = new com.tencent.mm.plugin.appbrand.wxassistant.q3();
            this.V = q3Var;
            I(q3Var);
        }
        return this.V;
    }

    public void i(com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView appBrandPageFullScreenView) {
        if (appBrandPageFullScreenView == null || appBrandPageFullScreenView.getParent() != null) {
            return;
        }
        android.view.View view = this.H;
        if (view instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view).addView(appBrandPageFullScreenView, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }

    public abstract void k();

    public boolean o(int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = getCurrentPageView();
        return currentPageView != null && currentPageView.getComponentId() == i17;
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        java.util.HashSet hashSet = (java.util.HashSet) this.N;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        hashSet.clear();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (this.I) {
            this.f87192J = true;
        }
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            currentPageView.x2(configuration);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!this.K && this.I && !this.f87192J && this.P > 0 && this.Q > 0) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.P, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.Q, 1073741824));
            return;
        }
        super.onMeasure(i17, i18);
        this.P = getMeasuredWidth();
        this.Q = getMeasuredHeight();
    }

    public abstract android.view.View p();

    public abstract void r(java.lang.String str, java.lang.String str2, int[] iArr);

    public final void s(long j17, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        if (this.G == null) {
            return;
        }
        D();
        t(j17, "onAppRouteDone", wdVar, null, null, null);
        this.G.j(getCurrentPageView());
        com.tencent.mm.plugin.appbrand.page.pa paVar = this.G.f86719y;
        paVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        paVar.b(j17, "routeStartTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), false);
    }

    public void setForceDisableMeasureCache(boolean z17) {
        this.K = z17;
    }

    public abstract void setInitialUrl(java.lang.String str);

    public void setIsAnimating(boolean z17) {
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            currentPageView.Y2(z17);
        }
    }

    public final void t(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.a5 a5Var, org.json.JSONObject jSONObject, java.util.HashMap hashMap) {
        com.tencent.mm.plugin.appbrand.page.wd wdVar2;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        org.json.JSONObject jSONObject4;
        org.json.JSONObject jSONObject5;
        sj1.l.e(getAppId(), "internal:prepare", u46.l.k(new java.lang.String[]{"dispatchRoute", str, wdVar.name()}, "-"));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        boolean equals = "onAppRouteDone".equals(str);
        java.lang.String currentUrl = getCurrentUrl();
        java.lang.String a17 = nf.z.a(currentUrl);
        java.util.Map c17 = nf.z.c(currentUrl);
        hashMap2.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, a17);
        hashMap2.put("query", c17);
        hashMap2.put("rawPath", currentUrl);
        java.util.Map map = (java.util.Map) this.G.f86719y.f87014c.get(j17);
        boolean z17 = map != null && (map.get("overrideEntryPagePath") instanceof java.lang.Boolean) && ((java.lang.Boolean) map.get("overrideEntryPagePath")).booleanValue();
        hashMap2.put("overrideEntryPagePath", java.lang.Boolean.valueOf(z17));
        java.lang.String str2 = map != null ? (java.lang.String) map.get("routeJsRouteId") : null;
        if (!android.text.TextUtils.isEmpty(str2)) {
            hashMap2.put("routeId", str2);
        }
        com.tencent.mm.plugin.appbrand.page.pa paVar = this.G.f86719y;
        paVar.getClass();
        if (paVar.f87013b.get(j17, null) != wdVar || (wdVar2 = (com.tencent.mm.plugin.appbrand.page.wd) paVar.f87012a.get(j17, null)) == null) {
            wdVar2 = wdVar;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer.AppRouteMetricsContext", "restore target(%s) -> source(%s), routeId:%d, isAppRouteDone:%b", wdVar, wdVar2, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(equals));
        }
        hashMap2.put("openType", wdVar2.f87232d);
        if (a5Var != null) {
            hashMap2.put("pipMode", a5Var.f86397d);
        }
        if (!equals) {
            hashMap2.put("qualityData", map);
            ni1.e eVar = (ni1.e) getCurrentPageView().B1(ni1.e.class);
            hashMap2.put("resizing", java.lang.Boolean.valueOf(eVar != null && eVar.a()));
            if (com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK != wdVar) {
                k91.r appConfig = this.G.getAppConfig();
                if (((!appConfig.f305737d || (jSONObject5 = appConfig.G) == null || jSONObject5.length() == 0) ? appConfig.F : appConfig.G) != null) {
                    k91.r appConfig2 = this.G.getAppConfig();
                    hashMap2.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, ((!appConfig2.f305737d || (jSONObject4 = appConfig2.G) == null || jSONObject4.length() == 0) ? appConfig2.F : appConfig2.G).opt(a17));
                }
                k91.r appConfig3 = this.G.getAppConfig();
                if (((!appConfig3.f305737d || (jSONObject3 = appConfig3.I) == null || jSONObject3.length() == 0) ? appConfig3.H : appConfig3.I) != null) {
                    java.lang.String t17 = u46.l.t(a17, 0, a17.lastIndexOf(".html"));
                    k91.r appConfig4 = this.G.getAppConfig();
                    hashMap2.put("preloadRule", ((!appConfig4.f305737d || (jSONObject2 = appConfig4.I) == null || jSONObject2.length() == 0) ? appConfig4.H : appConfig4.I).opt(t17));
                }
            }
        }
        getCurrentPageView().B2(equals, hashMap2, wdVar, jSONObject);
        int optInt = getCurrentPageView().p2() ? ((org.json.JSONObject) hashMap2.get("singlePageData")).optInt("pageId", 0) : getCurrentPageView().getComponentId();
        nf.f.c(hashMap2);
        java.lang.String jSONObject6 = new org.json.JSONObject(hashMap2).toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPage", "dispatchRoute, appId:%s, event:%s, type:%s, windowId:%d, pageId:%d, rawPath:%s, data:%s overrideEntryPagePath:%s", getAppId(), str, wdVar.f87232d, java.lang.Integer.valueOf(getCurrentWindowId()), java.lang.Integer.valueOf(optInt), currentUrl, jSONObject6, "" + z17);
        getCurrentPageView().d(str, jSONObject6, null);
        sj1.l.g(getAppId());
    }

    public abstract com.tencent.mm.plugin.appbrand.page.v5 u(int i17);

    public oi1.l w(oi1.n nVar) {
        oi1.l lVar;
        synchronized (this.M) {
            lVar = (oi1.l) ((java.util.HashMap) this.M).get(nVar);
        }
        return lVar;
    }

    public abstract boolean x(java.lang.String str);

    public boolean z(int[] iArr, int i17) {
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        for (int i18 : iArr) {
            if (i18 == i17) {
                return true;
            }
        }
        return false;
    }
}
