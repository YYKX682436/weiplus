package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class dc implements ni1.e, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f86539a;

    /* renamed from: b, reason: collision with root package name */
    public final re.r f86540b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f86541c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f86542d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f86543e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86544f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f86545g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86546h = false;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.Configuration f86547i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.cc f86548j;

    public dc(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f86539a = v5Var;
        this.f86540b = new re.r(v5Var);
        v5Var.getPageArea().addOnLayoutChangeListener(new com.tencent.mm.plugin.appbrand.page.vb(this));
    }

    @Override // ni1.e
    public boolean a() {
        boolean e17;
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86539a;
        xi1.p orientationHandler = v5Var.getWindowAndroid() == null ? null : v5Var.getWindowAndroid().getOrientationHandler();
        boolean z19 = false;
        if (orientationHandler == null || (orientationHandler instanceof zi1.b)) {
            com.tencent.mars.xlog.Log.e("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "__willResize NULL orientationHandler, appId:%s, url:%s", v5Var.getAppId(), v5Var.X1());
        } else {
            xi1.o a17 = orientationHandler.a();
            xi1.o d17 = xi1.o.d(getRequestedOrientation());
            com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "willResizeByOrientation appId[%s], url[%s] current[%s], desire[%s]", g(), i(), a17, d17);
            if (xi1.o.UNSPECIFIED != d17) {
                if (v5Var.getWindowAndroid() instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) {
                    if (com.tencent.mm.plugin.appbrand.utils.m3.b(v5Var.getContext())) {
                        try {
                            z18 = v5Var.t3().m0().f305754x;
                        } catch (java.lang.NullPointerException unused) {
                            z18 = false;
                        }
                        if (!z18 || j()) {
                            com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "willResizeByOrientation appId[%s], url[%s], fixed orientation device", g(), i());
                        } else {
                            m();
                        }
                    }
                    z18 = false;
                    if (z18) {
                    }
                    com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "willResizeByOrientation appId[%s], url[%s], fixed orientation device", g(), i());
                }
                android.content.Context ctx = v5Var.getContext();
                kotlin.jvm.internal.o.g(ctx, "ctx");
                com.tencent.mm.plugin.appbrand.utils.l3 a18 = com.tencent.mm.plugin.appbrand.utils.m3.a(ctx);
                android.util.DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
                if ((ctx.getResources().getConfiguration().screenLayout & 15) >= 3 && java.lang.Math.sqrt(java.lang.Math.pow((double) (((float) a18.f90502a) / displayMetrics.xdpi), 2.0d) + java.lang.Math.pow((double) (((float) a18.f90503b) / displayMetrics.ydpi), 2.0d)) >= 7.0d) {
                    nf.y yVar = nf.x.f336616b;
                    e17 = yVar != null ? yVar.e() : false;
                    com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "folderFixedOrientationDeviceCompatible ret=" + e17);
                } else {
                    com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "folderFixedOrientationDeviceCompatible not large screen");
                    e17 = false;
                }
                if (e17) {
                    com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "willResizeByOrientation appId[%s], url[%s] return false for folder orientaion fixed", g(), i());
                } else {
                    try {
                        z17 = v5Var.t3().m0().f305754x;
                    } catch (java.lang.NullPointerException unused2) {
                        z17 = false;
                    }
                    if (z17) {
                        m();
                    }
                    if (d17 == null) {
                        d17 = xi1.o.PORTRAIT;
                    }
                    if (!a17.a(d17)) {
                        z19 = true;
                    }
                }
            }
        }
        this.f86540b.f394292f = z19;
        return z19;
    }

    @Override // ni1.c
    public void b() {
        android.content.res.Configuration configuration = this.f86547i;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86539a;
        if (configuration == null) {
            com.tencent.mm.plugin.appbrand.page.w2 w17 = v5Var.w1();
            java.util.Objects.requireNonNull(w17);
            this.f86547i = new android.content.res.Configuration(w17.getResources().getConfiguration());
        }
        this.f86543e = true;
        if (v5Var.C1() == null || !v5Var.C1().c()) {
            d(null);
        } else {
            v5Var.C1().d(new com.tencent.mm.plugin.appbrand.page.zb(this));
        }
        re.r rVar = this.f86540b;
        if (rVar.f394287a) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = rVar.f394293g;
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onForeground dispatch ViewDidResize appId[%s] url[%s]", v5Var2.getAppId(), v5Var2.X1());
            rVar.c();
            rVar.f394287a = false;
        }
        rVar.f394290d = true;
    }

    @Override // ni1.c
    public void c() {
        this.f86543e = false;
        this.f86540b.f394290d = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        if (r10.equals("auto") == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    @Override // ni1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(xi1.n r10) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.dc.d(xi1.n):void");
    }

    public final void e() {
        if (this.f86539a.v3() == null || this.f86544f) {
            return;
        }
        re.r rVar = this.f86540b;
        int width = rVar.f394293g.getPageArea().getWidth();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = rVar.f394293g;
        int height = v5Var.getPageArea().getHeight();
        if (width <= 0 || height <= 0) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onPageLayout invalid window size [%d %d], appId[%s], url[%s]", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), v5Var.getAppId(), v5Var.X1());
            return;
        }
        boolean z17 = (width == rVar.f394288b && height == rVar.f394289c) ? false : true;
        rVar.f394288b = width;
        rVar.f394289c = height;
        int[] a17 = com.tencent.mm.plugin.appbrand.utils.f5.a(v5Var);
        boolean z18 = rVar.b(width, height) && rVar.b(a17[0], a17[1]);
        boolean z19 = (rVar.f394288b == 0 || rVar.f394289c == 0) ? false : true;
        boolean z27 = (z19 && z17 && z18) || (rVar.f394292f && z18);
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onPageLayout appId[%s], url[%s], hadInit[%b], winSizeChanged[%b], winSizeMatched[%b], foreground[%b], shouldDispatch[%b], this.needDispatch[%b]", v5Var.getAppId(), v5Var.X1(), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(rVar.f394290d), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(rVar.f394287a));
        if (!z27 && rVar.f394292f) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onPageLayout appId[%s], url[%s], window[%d x %d], screen[%d x %d]", v5Var.getAppId(), v5Var.X1(), java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(a17[0]), java.lang.Integer.valueOf(a17[1]));
        }
        if (!z27) {
            rVar.f394287a = false;
        } else if (rVar.f394290d) {
            rVar.c();
        } else {
            rVar.f394287a = true;
        }
    }

    @Override // ni1.e
    public void f(java.lang.String str) {
        synchronized (this.f86541c) {
            java.lang.String[] strArr = this.f86542d;
            if (strArr == null) {
                this.f86542d = new java.lang.String[]{str};
            } else {
                strArr[0] = str;
            }
        }
        d(null);
    }

    public final java.lang.String g() {
        return this.f86539a.getAppId();
    }

    @Override // ni1.e
    public java.lang.String getRequestedOrientation() {
        boolean z17;
        if (this.f86542d == null) {
            synchronized (this.f86541c) {
                if (this.f86542d == null) {
                    java.lang.String N1 = this.f86539a.N1();
                    this.f86540b.f394292f = false;
                    synchronized (this.f86541c) {
                        this.f86542d = new java.lang.String[]{N1};
                    }
                    z17 = true;
                } else {
                    z17 = false;
                }
            }
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "getRequestedOrientation and setInitialOrientation for %s, %s, stack:%s", g(), i(), android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        return this.f86542d[0];
    }

    public final xi1.p h() {
        return this.f86539a.getWindowAndroid().getOrientationHandler();
    }

    public final java.lang.String i() {
        return this.f86539a.X1();
    }

    public final boolean j() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86539a;
        if (v5Var.getWindowAndroid().shouldInLargeScreenCompatMode()) {
            return false;
        }
        nf.y yVar = nf.x.f336616b;
        if ((yVar != null ? yVar.f() : false) && com.tencent.mm.plugin.appbrand.utils.m3.b(v5Var.getContext())) {
            return true;
        }
        if (!u75.c.a() || !com.tencent.mm.plugin.appbrand.utils.m3.b(v5Var.getContext())) {
            return false;
        }
        nf.y yVar2 = nf.x.f336616b;
        return !(yVar2 != null ? yVar2.f() : false);
    }

    public final void k(boolean z17) {
        this.f86545g = z17;
        if (z17 || !this.f86546h) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86539a;
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "emitPageLayout after mPageLayoutFrozen reset false, appId[%s] url[%s] mDestroyed[%b]", v5Var.getAppId(), v5Var.X1(), java.lang.Boolean.valueOf(this.f86544f));
        e();
        this.f86546h = false;
    }

    public void l(java.lang.String str, java.util.Map map) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            this.f86539a.m(new com.tencent.mm.plugin.appbrand.page.wb(this, str, map));
            return;
        }
        re.r rVar = this.f86540b;
        if (map != null) {
            ((java.util.HashMap) rVar.f394291e).putAll(map);
        } else {
            rVar.getClass();
        }
        f(str);
    }

    public final boolean m() {
        if (!xi1.o.b(h().a())) {
            return false;
        }
        ((ne.a) this.f86539a.b(ne.a.class)).getClass();
        return false;
    }

    @Override // ni1.c
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.content.res.Configuration configuration2;
        if (!this.f86543e || this.f86544f || (configuration2 = this.f86547i) == null || configuration2.orientation == configuration.orientation) {
            return;
        }
        this.f86547i = new android.content.res.Configuration(configuration);
        if (this.f86548j == null) {
            this.f86548j = new com.tencent.mm.plugin.appbrand.page.cc(this, null);
        }
        com.tencent.mm.plugin.appbrand.page.cc ccVar = this.f86548j;
        com.tencent.mm.plugin.appbrand.page.dc dcVar = ccVar.f86501c;
        dcVar.k(true);
        ccVar.a();
        android.view.View contentView = dcVar.f86539a.getContentView();
        java.util.Objects.requireNonNull(contentView);
        contentView.postDelayed(ccVar.f86499a, 100L);
        android.view.ViewTreeObserver viewTreeObserver = contentView.getViewTreeObserver();
        com.tencent.mm.plugin.appbrand.page.bc bcVar = new com.tencent.mm.plugin.appbrand.page.bc(ccVar);
        ccVar.f86500b = bcVar;
        viewTreeObserver.addOnGlobalLayoutListener(bcVar);
    }

    @Override // ni1.c
    public void onDestroy() {
        this.f86543e = false;
        this.f86544f = true;
        com.tencent.mm.plugin.appbrand.page.cc ccVar = this.f86548j;
        if (ccVar != null) {
            ccVar.a();
            ccVar.f86500b = null;
            ccVar.f86499a = null;
        }
    }
}
