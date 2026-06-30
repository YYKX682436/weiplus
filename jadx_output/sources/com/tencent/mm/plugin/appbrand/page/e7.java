package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class e7 extends com.tencent.mm.plugin.appbrand.page.wc implements com.tencent.mm.plugin.appbrand.jsapi.file.v0 {
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.Set f86565J;
    public final java.util.Set K;
    public com.tencent.mm.plugin.appbrand.page.sa L;
    public final com.tencent.mm.plugin.appbrand.page.la M;

    public e7(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        super(n7Var);
        this.f86565J = new java.util.HashSet();
        this.K = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.L = null;
        this.M = new com.tencent.mm.plugin.appbrand.page.h7(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    public com.tencent.mm.plugin.appbrand.performance.v M() {
        return new com.tencent.mm.plugin.appbrand.performance.c0((com.tencent.mm.plugin.appbrand.page.n7) F());
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a
    public com.tencent.mm.plugin.appbrand.page.hb R() {
        java.util.Objects.requireNonNull(h0());
        if (!h0().u(2002) || !h0().u(2004)) {
            return null;
        }
        hm1.m mVar = hm1.m.f282203a;
        return new com.tencent.mm.plugin.appbrand.page.j7(this, this);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    public void V(java.lang.String str) {
        super.V(str);
        com.tencent.mm.plugin.appbrand.report.v0.m(H(), 27, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026d  */
    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(com.tencent.luggage.sdk.jsapi.component.n r27, boolean r28, long r29, long r31, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.e7.X(com.tencent.luggage.sdk.jsapi.component.n, boolean, long, long, java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    public boolean Y(com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        oe1.b2.a(H());
        if (com.tencent.mm.plugin.appbrand.kf.a(((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime()) || ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime().u0().L1.c() || ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime().a2() || ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime().u0().r() == k91.z3.TRANSPARENT) {
            return false;
        }
        if (!((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime().e3()) {
            return super.Y(wdVar);
        }
        com.tencent.mm.plugin.appbrand.page.w2 w17 = ((com.tencent.mm.plugin.appbrand.page.n7) F()).w1();
        return J().f74797f.size() >= 2 && w17 != null && w17.getPageContainer().getPageCount() == 1 && wdVar == com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_TO;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc
    public com.tencent.mm.plugin.appbrand.page.fb c0(android.content.Context context) {
        java.lang.String str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.H = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.page.i7 i7Var = new com.tencent.mm.plugin.appbrand.page.i7(this, context);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Object invoke = i7Var.invoke();
        if (invoke instanceof cf.h) {
            str = ((cf.h) invoke).I();
        } else if (invoke == null || (str = invoke.toString()) == null) {
            str = "";
        }
        boolean a17 = com.tencent.mm.plugin.appbrand.utils.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a17) {
            com.tencent.mars.xlog.Log.i("Luggage.Utils.Profile", "runProfiled:log:onCreateRealWebView cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a17 + ' ');
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:onCreateRealWebView cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a17 + ' ');
        }
        com.tencent.mm.plugin.appbrand.page.w9 w9Var = (com.tencent.mm.plugin.appbrand.page.w9) invoke;
        w9Var.setOverScrolledListener(this.M);
        return w9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc
    public final void d0(java.lang.String str, long j17, long j18) {
        boolean X1;
        if (F() != null && Q()) {
            com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
            com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) F();
            com.tencent.mm.plugin.appbrand.service.c0 U1 = ((com.tencent.mm.plugin.appbrand.page.n7) F()).U1();
            if (U1 == null) {
                X1 = false;
            } else {
                X1 = U1.X1();
                if (!X1) {
                    X1 = true;
                }
            }
            jVar.k(yVar, str, j17, j18, X1, 0L);
        }
    }

    @Override // re.a
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.o6 J() {
        return (com.tencent.mm.plugin.appbrand.o6) super.J();
    }

    public com.tencent.mm.plugin.appbrand.page.w9 h0() {
        com.tencent.mm.plugin.appbrand.page.fb fbVar = this.f86372g;
        if (fbVar instanceof com.tencent.mm.plugin.appbrand.page.w9) {
            return (com.tencent.mm.plugin.appbrand.page.w9) fbVar;
        }
        if (!(fbVar instanceof com.tencent.mm.plugin.appbrand.page.na)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.fb fbVar2 = ((com.tencent.mm.plugin.appbrand.page.na) fbVar).f86927d;
        if (fbVar2 instanceof com.tencent.mm.plugin.appbrand.page.w9) {
            return (com.tencent.mm.plugin.appbrand.page.w9) fbVar2;
        }
        return null;
    }

    public final void i0(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, long j17, long j18) {
        long j19;
        if (Q()) {
            if (z17) {
                com.tencent.mm.plugin.appbrand.keylogger.w.f(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSPageScript, str2, j17, j18);
            } else {
                com.tencent.mm.plugin.appbrand.keylogger.w.d(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSPageScript, "", str2, j17, j18);
            }
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(H(), true);
            if (b17 != null) {
                com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageframeInjectStruct weAppQualityPageframeInjectStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageframeInjectStruct();
                weAppQualityPageframeInjectStruct.f62624d = weAppQualityPageframeInjectStruct.b("InstanceId", b17.f88134d, true);
                weAppQualityPageframeInjectStruct.f62625e = weAppQualityPageframeInjectStruct.b("AppId", H(), true);
                weAppQualityPageframeInjectStruct.f62626f = b17.f88139i;
                int i17 = b17.f88136f;
                weAppQualityPageframeInjectStruct.f62627g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.b0.demo : cm.b0.debug : cm.b0.release;
                weAppQualityPageframeInjectStruct.f62628h = b17.f88137g;
                weAppQualityPageframeInjectStruct.f62629i = j18 - j17;
                weAppQualityPageframeInjectStruct.f62630j = b17.f88138h;
                weAppQualityPageframeInjectStruct.f62631k = j17;
                weAppQualityPageframeInjectStruct.f62632l = j18;
                weAppQualityPageframeInjectStruct.f62633m = weAppQualityPageframeInjectStruct.b("package", str, true);
                weAppQualityPageframeInjectStruct.f62634n = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(str3.length()));
                if (str3.startsWith("//XWEB_SCRIPT:") && ((java.util.HashSet) this.f86565J).contains(str2)) {
                    j19 = 1;
                    weAppQualityPageframeInjectStruct.f62635o = j19;
                    com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
                    weAppQualityPageframeInjectStruct.f62636p = jVar.e((com.tencent.mm.plugin.appbrand.page.n7) F());
                    weAppQualityPageframeInjectStruct.f62637q = weAppQualityPageframeInjectStruct.b("engineVersion", jVar.d() + "", true);
                    weAppQualityPageframeInjectStruct.k();
                }
                j19 = 0;
                weAppQualityPageframeInjectStruct.f62635o = j19;
                com.tencent.mm.plugin.appbrand.report.quality.j jVar2 = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
                weAppQualityPageframeInjectStruct.f62636p = jVar2.e((com.tencent.mm.plugin.appbrand.page.n7) F());
                weAppQualityPageframeInjectStruct.f62637q = weAppQualityPageframeInjectStruct.b("engineVersion", jVar2.d() + "", true);
                weAppQualityPageframeInjectStruct.k();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a, com.tencent.mm.plugin.appbrand.page.d7
    public boolean j(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        com.tencent.mm.plugin.appbrand.page.w9 h07;
        android.view.accessibility.AccessibilityManager accessibilityManager;
        this.I = java.lang.System.currentTimeMillis();
        ((com.tencent.mm.plugin.appbrand.page.dd) this.f86372g).J(new com.tencent.mm.plugin.appbrand.page.l7(this));
        try {
            J();
            if (com.tencent.mm.plugin.appbrand.o6.f86162n3 && (accessibilityManager = (android.view.accessibility.AccessibilityManager) b3.l.getSystemService(I(), android.view.accessibility.AccessibilityManager.class)) != null && !accessibilityManager.isTouchExplorationEnabled()) {
                ((com.tencent.mm.plugin.appbrand.page.n7) F()).getContentView().setContentDescription(nf.z.a(str));
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.appbrand.o6 runtime = F() != null ? ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime() : null;
        if (runtime != null && runtime.u0().L1.f77361h && (h07 = h0()) != null && h07.getSettings() != null) {
            h07.getSettings().B(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewRendererWC", "[applyDarkModeConfig] set FORCE_DARK_OFF reason[ half screen force-light-mode]");
        }
        ((com.tencent.mm.plugin.appbrand.page.dd) this.f86372g).i(((com.tencent.mm.plugin.appbrand.page.n7) F()).getContext());
        boolean j17 = super.j(str, wdVar);
        com.tencent.mm.plugin.appbrand.c0.b((com.tencent.mm.plugin.appbrand.page.n7) F());
        return j17;
    }

    public final void j0(java.lang.String str, java.lang.String str2, long j17, long j18) {
        boolean X1;
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct g17 = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.g((com.tencent.mm.plugin.appbrand.y) F());
        g17.p(str);
        g17.f62568p = str2.length();
        g17.f62570r = (str2.startsWith("//XWEB_SCRIPT:") && ((java.util.HashSet) this.f86565J).contains(str)) ? 1L : 0L;
        com.tencent.mm.plugin.appbrand.service.c0 U1 = ((com.tencent.mm.plugin.appbrand.page.n7) F()).U1();
        if (U1 == null) {
            X1 = false;
        } else {
            X1 = U1.X1();
            if (!X1) {
                X1 = true;
            }
        }
        g17.f62571s = X1 ? 1L : 0L;
        g17.f62563k = j17;
        g17.f62564l = j18;
        g17.f62561i = j18 - j17;
        g17.k();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.v0
    public void l(java.lang.String str, com.tencent.luggage.sdk.jsapi.component.n[] nVarArr, boolean[] zArr, java.lang.Object[] objArr, long j17, long j18) {
        boolean z17;
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (android.text.TextUtils.isEmpty(str) || nVarArr.length == 0 || zArr.length == 0) {
            return;
        }
        int length = nVarArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = true;
                break;
            } else {
                if (nVarArr[i17] != null) {
                    z17 = false;
                    break;
                }
                i17++;
            }
        }
        if (z17) {
            return;
        }
        long j19 = 0;
        for (com.tencent.luggage.sdk.jsapi.component.n nVar : nVarArr) {
            if (nVar != null) {
                j19 += nVar.f47354k;
            }
        }
        com.tencent.mm.plugin.appbrand.o6 J2 = J();
        cm.b0 b0Var = null;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = J2 == null ? null : com.tencent.mm.plugin.appbrand.report.quality.e.a(J2);
        if (a17 != null) {
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageframeInjectStruct weAppQualityPageframeInjectStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPageframeInjectStruct();
            weAppQualityPageframeInjectStruct.f62624d = weAppQualityPageframeInjectStruct.b("InstanceId", a17.f88134d, true);
            weAppQualityPageframeInjectStruct.f62625e = weAppQualityPageframeInjectStruct.b("AppId", H(), true);
            weAppQualityPageframeInjectStruct.f62626f = a17.f88139i;
            int i18 = a17.f88136f;
            if (i18 == 1) {
                b0Var = cm.b0.release;
            } else if (i18 == 2) {
                b0Var = cm.b0.debug;
            } else if (i18 == 3) {
                b0Var = cm.b0.demo;
            }
            weAppQualityPageframeInjectStruct.f62627g = b0Var;
            weAppQualityPageframeInjectStruct.f62628h = a17.f88137g;
            weAppQualityPageframeInjectStruct.f62629i = j18 - j17;
            weAppQualityPageframeInjectStruct.f62630j = a17.f88138h;
            weAppQualityPageframeInjectStruct.f62631k = j17;
            weAppQualityPageframeInjectStruct.f62632l = j18;
            weAppQualityPageframeInjectStruct.f62634n = j19;
            weAppQualityPageframeInjectStruct.f62635o = 0L;
            com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
            weAppQualityPageframeInjectStruct.f62636p = jVar.e((com.tencent.mm.plugin.appbrand.page.n7) F());
            weAppQualityPageframeInjectStruct.f62637q = weAppQualityPageframeInjectStruct.b("engineVersion", jVar.d() + "", true);
            weAppQualityPageframeInjectStruct.f62638r = weAppQualityPageframeInjectStruct.b("lazyLoadKey", str, true);
            weAppQualityPageframeInjectStruct.k();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void n() {
        super.n();
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = J().u0().L1;
        if (halfScreenConfig.c()) {
            com.tencent.mm.plugin.appbrand.page.fb fbVar = this.f86372g;
            if (halfScreenConfig.f77361h) {
                fbVar.setBackgroundColor(-1);
            }
            com.tencent.mm.plugin.appbrand.page.w9 h07 = h0();
            if (h07 instanceof com.tencent.mm.plugin.appbrand.page.x) {
                if (!halfScreenConfig.f77364n) {
                    ((com.tencent.mm.plugin.appbrand.page.x) h07).setFixSizeEnable(false);
                    return;
                }
                com.tencent.mm.plugin.appbrand.page.x xVar = (com.tencent.mm.plugin.appbrand.page.x) h07;
                xVar.setFixSizeEnable(true);
                xVar.setContentsMaxVisibleHeightProvider(new com.tencent.mm.plugin.appbrand.page.e7$$a(this));
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                qi1.d dVar = xVar.f87239J;
                if (n3.x0.c(dVar)) {
                    qi1.d.b(xVar.f87239J, 0, 0, false, false, 15, null);
                }
                dVar.requestLayout();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, ni1.d
    public java.util.Map p() {
        return (java.util.Map) cf.i.a("AppBrandPageViewRendererWC.onCreateJsApiPool()", new com.tencent.mm.plugin.appbrand.page.g7(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a, com.tencent.luggage.sdk.jsapi.component.a
    public final java.lang.Object r(java.lang.Class cls) {
        if (ni1.f.class != cls) {
            return super.r(cls);
        }
        ni1.f fVar = (ni1.f) super.r(ni1.f.class);
        if (fVar == null) {
            return null;
        }
        if (this.L == null) {
            this.L = new com.tencent.mm.plugin.appbrand.page.sa(fVar);
        }
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) F();
        java.util.Objects.requireNonNull(n7Var);
        this.L.m(n7Var.s3());
        return cls.cast(this.L);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void v() {
        if (com.tencent.mm.plugin.appbrand.jsruntime.m1.e((com.tencent.mm.plugin.appbrand.page.v5) F())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewRendererWC", "page initNativeTransServiceId");
            com.tencent.mm.plugin.appbrand.jsruntime.m1.b(((com.tencent.mm.plugin.appbrand.page.n7) F()).getJsRuntime(), ((com.tencent.mm.plugin.appbrand.page.n7) F()).U1().getComponentId(), ((com.tencent.mm.plugin.appbrand.page.n7) F()).getComponentId(), H());
        }
        super.v();
        r(ni1.f.class);
        ((com.tencent.mm.plugin.appbrand.page.dd) this.f86372g).J(new com.tencent.mm.plugin.appbrand.page.k7(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a, com.tencent.mm.plugin.appbrand.page.d7
    public void x() {
        super.x();
        com.tencent.mm.plugin.appbrand.performance.h.d(J(), 203, java.lang.System.currentTimeMillis() - this.I);
        com.tencent.mm.plugin.appbrand.performance.m.e(H(), "Native", "PageLoad", "X", this.I, java.lang.System.currentTimeMillis(), "");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, com.tencent.mm.plugin.appbrand.page.d7
    public void z(android.view.View view) {
        super.z(view);
        ((com.tencent.mm.plugin.appbrand.page.n7) F()).C1().d(new com.tencent.mm.plugin.appbrand.page.f7(this));
    }
}
