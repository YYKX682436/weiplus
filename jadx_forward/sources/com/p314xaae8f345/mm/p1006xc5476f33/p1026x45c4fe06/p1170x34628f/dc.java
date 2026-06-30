package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class dc implements ni1.e, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168072a;

    /* renamed from: b, reason: collision with root package name */
    public final re.r f168073b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f168074c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f168075d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f168076e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f168077f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f168078g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f168079h = false;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.Configuration f168080i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cc f168081j;

    public dc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f168072a = v5Var;
        this.f168073b = new re.r(v5Var);
        v5Var.mo51313xaf0c0532().addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vb(this));
    }

    @Override // ni1.e
    public boolean a() {
        boolean e17;
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168072a;
        xi1.p mo51612x60543150 = v5Var.mo50261xee5260a9() == null ? null : v5Var.mo50261xee5260a9().mo51612x60543150();
        boolean z19 = false;
        if (mo51612x60543150 == null || (mo51612x60543150 instanceof zi1.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "__willResize NULL orientationHandler, appId:%s, url:%s", v5Var.mo48798x74292566(), v5Var.X1());
        } else {
            xi1.o a17 = mo51612x60543150.a();
            xi1.o d17 = xi1.o.d(mo14689x776c71f8());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "willResizeByOrientation appId[%s], url[%s] current[%s], desire[%s]", g(), i(), a17, d17);
            if (xi1.o.UNSPECIFIED != d17) {
                if (v5Var.mo50261xee5260a9() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m3.b(v5Var.mo50352x76847179())) {
                        try {
                            z18 = v5Var.t3().m0().f387287x;
                        } catch (java.lang.NullPointerException unused) {
                            z18 = false;
                        }
                        if (!z18 || j()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "willResizeByOrientation appId[%s], url[%s], fixed orientation device", g(), i());
                        } else {
                            m();
                        }
                    }
                    z18 = false;
                    if (z18) {
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "willResizeByOrientation appId[%s], url[%s], fixed orientation device", g(), i());
                }
                android.content.Context ctx = v5Var.mo50352x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l3 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m3.a(ctx);
                android.util.DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
                if ((ctx.getResources().getConfiguration().screenLayout & 15) >= 3 && java.lang.Math.sqrt(java.lang.Math.pow((double) (((float) a18.f172035a) / displayMetrics.xdpi), 2.0d) + java.lang.Math.pow((double) (((float) a18.f172036b) / displayMetrics.ydpi), 2.0d)) >= 7.0d) {
                    nf.y yVar = nf.x.f418149b;
                    e17 = yVar != null ? yVar.e() : false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "folderFixedOrientationDeviceCompatible ret=" + e17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "folderFixedOrientationDeviceCompatible not large screen");
                    e17 = false;
                }
                if (e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "willResizeByOrientation appId[%s], url[%s] return false for folder orientaion fixed", g(), i());
                } else {
                    try {
                        z17 = v5Var.t3().m0().f387287x;
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
        this.f168073b.f475825f = z19;
        return z19;
    }

    @Override // ni1.c
    public void b() {
        android.content.res.Configuration configuration = this.f168080i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168072a;
        if (configuration == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w17 = v5Var.w1();
            java.util.Objects.requireNonNull(w17);
            this.f168080i = new android.content.res.Configuration(w17.getResources().getConfiguration());
        }
        this.f168076e = true;
        if (v5Var.C1() == null || !v5Var.C1().c()) {
            d(null);
        } else {
            v5Var.C1().d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.zb(this));
        }
        re.r rVar = this.f168073b;
        if (rVar.f475820a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 = rVar.f475826g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onForeground dispatch ViewDidResize appId[%s] url[%s]", v5Var2.mo48798x74292566(), v5Var2.X1());
            rVar.c();
            rVar.f475820a = false;
        }
        rVar.f475823d = true;
    }

    @Override // ni1.c
    public void c() {
        this.f168076e = false;
        this.f168073b.f475823d = false;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc.d(xi1.n):void");
    }

    public final void e() {
        if (this.f168072a.v3() == null || this.f168077f) {
            return;
        }
        re.r rVar = this.f168073b;
        int width = rVar.f475826g.mo51313xaf0c0532().getWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = rVar.f475826g;
        int height = v5Var.mo51313xaf0c0532().getHeight();
        if (width <= 0 || height <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onPageLayout invalid window size [%d %d], appId[%s], url[%s]", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), v5Var.mo48798x74292566(), v5Var.X1());
            return;
        }
        boolean z17 = (width == rVar.f475821b && height == rVar.f475822c) ? false : true;
        rVar.f475821b = width;
        rVar.f475822c = height;
        int[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(v5Var);
        boolean z18 = rVar.b(width, height) && rVar.b(a17[0], a17[1]);
        boolean z19 = (rVar.f475821b == 0 || rVar.f475822c == 0) ? false : true;
        boolean z27 = (z19 && z17 && z18) || (rVar.f475825f && z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onPageLayout appId[%s], url[%s], hadInit[%b], winSizeChanged[%b], winSizeMatched[%b], foreground[%b], shouldDispatch[%b], this.needDispatch[%b]", v5Var.mo48798x74292566(), v5Var.X1(), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(rVar.f475823d), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(rVar.f475820a));
        if (!z27 && rVar.f475825f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "onPageLayout appId[%s], url[%s], window[%d x %d], screen[%d x %d]", v5Var.mo48798x74292566(), v5Var.X1(), java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(a17[0]), java.lang.Integer.valueOf(a17[1]));
        }
        if (!z27) {
            rVar.f475820a = false;
        } else if (rVar.f475823d) {
            rVar.c();
        } else {
            rVar.f475820a = true;
        }
    }

    @Override // ni1.e
    public void f(java.lang.String str) {
        synchronized (this.f168074c) {
            java.lang.String[] strArr = this.f168075d;
            if (strArr == null) {
                this.f168075d = new java.lang.String[]{str};
            } else {
                strArr[0] = str;
            }
        }
        d(null);
    }

    public final java.lang.String g() {
        return this.f168072a.mo48798x74292566();
    }

    @Override // ni1.e
    /* renamed from: getRequestedOrientation */
    public java.lang.String mo14689x776c71f8() {
        boolean z17;
        if (this.f168075d == null) {
            synchronized (this.f168074c) {
                if (this.f168075d == null) {
                    java.lang.String N1 = this.f168072a.N1();
                    this.f168073b.f475825f = false;
                    synchronized (this.f168074c) {
                        this.f168075d = new java.lang.String[]{N1};
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "getRequestedOrientation and setInitialOrientation for %s, %s, stack:%s", g(), i(), android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        return this.f168075d[0];
    }

    public final xi1.p h() {
        return this.f168072a.mo50261xee5260a9().mo51612x60543150();
    }

    public final java.lang.String i() {
        return this.f168072a.X1();
    }

    public final boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168072a;
        if (v5Var.mo50261xee5260a9().mo51620x1ab1e3d4()) {
            return false;
        }
        nf.y yVar = nf.x.f418149b;
        if ((yVar != null ? yVar.f() : false) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m3.b(v5Var.mo50352x76847179())) {
            return true;
        }
        if (!u75.c.a() || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m3.b(v5Var.mo50352x76847179())) {
            return false;
        }
        nf.y yVar2 = nf.x.f418149b;
        return !(yVar2 != null ? yVar2.f() : false);
    }

    public final void k(boolean z17) {
        this.f168078g = z17;
        if (z17 || !this.f168079h) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168072a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "emitPageLayout after mPageLayoutFrozen reset false, appId[%s] url[%s] mDestroyed[%b]", v5Var.mo48798x74292566(), v5Var.X1(), java.lang.Boolean.valueOf(this.f168077f));
        e();
        this.f168079h = false;
    }

    public void l(java.lang.String str, java.util.Map map) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            this.f168072a.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wb(this, str, map));
            return;
        }
        re.r rVar = this.f168073b;
        if (map != null) {
            ((java.util.HashMap) rVar.f475824e).putAll(map);
        } else {
            rVar.getClass();
        }
        f(str);
    }

    public final boolean m() {
        if (!xi1.o.b(h().a())) {
            return false;
        }
        ((ne.a) this.f168072a.b(ne.a.class)).getClass();
        return false;
    }

    @Override // ni1.c
    /* renamed from: onConfigurationChanged */
    public void mo14690x50e1c15d(android.content.res.Configuration configuration) {
        android.content.res.Configuration configuration2;
        if (!this.f168076e || this.f168077f || (configuration2 = this.f168080i) == null || configuration2.orientation == configuration.orientation) {
            return;
        }
        this.f168080i = new android.content.res.Configuration(configuration);
        if (this.f168081j == null) {
            this.f168081j = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cc(this, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cc ccVar = this.f168081j;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc dcVar = ccVar.f168034c;
        dcVar.k(true);
        ccVar.a();
        android.view.View mo51310xc2a54588 = dcVar.f168072a.mo51310xc2a54588();
        java.util.Objects.requireNonNull(mo51310xc2a54588);
        mo51310xc2a54588.postDelayed(ccVar.f168032a, 100L);
        android.view.ViewTreeObserver viewTreeObserver = mo51310xc2a54588.getViewTreeObserver();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bc bcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bc(ccVar);
        ccVar.f168033b = bcVar;
        viewTreeObserver.addOnGlobalLayoutListener(bcVar);
    }

    @Override // ni1.c
    /* renamed from: onDestroy */
    public void mo14691xac79a11b() {
        this.f168076e = false;
        this.f168077f = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cc ccVar = this.f168081j;
        if (ccVar != null) {
            ccVar.a();
            ccVar.f168033b = null;
            ccVar.f168032a = null;
        }
    }
}
