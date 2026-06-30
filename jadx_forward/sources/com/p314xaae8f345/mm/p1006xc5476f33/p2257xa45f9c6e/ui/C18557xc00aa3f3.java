package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView */
/* loaded from: classes8.dex */
public class C18557xc00aa3f3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 implements com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2, lh4.b, cl1.o0, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.t {

    /* renamed from: c3, reason: collision with root package name */
    public static final /* synthetic */ int f254052c3 = 0;
    public boolean A2;
    public boolean B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public int G2;
    public boolean H2;
    public boolean I2;
    public int J2;
    public int K2;
    public boolean L2;
    public boolean M2;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d N2;
    public final int O2;
    public float P2;
    public float Q2;
    public float R2;
    public boolean S2;
    public boolean T2;
    public boolean U2;
    public boolean V2;
    public final android.view.animation.Interpolator W2;
    public final java.lang.Runnable X2;
    public final java.lang.Runnable Y2;
    public int Z2;

    /* renamed from: a3, reason: collision with root package name */
    public boolean f254053a3;

    /* renamed from: b2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 f254054b2;

    /* renamed from: b3, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f254055b3;

    /* renamed from: c2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 f254056c2;

    /* renamed from: d2, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f254057d2;

    /* renamed from: e2, reason: collision with root package name */
    public final java.util.ArrayList f254058e2;

    /* renamed from: f2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 f254059f2;

    /* renamed from: g2, reason: collision with root package name */
    public android.content.Context f254060g2;

    /* renamed from: h2, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f254061h2;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f254062i2;

    /* renamed from: j2, reason: collision with root package name */
    public java.lang.String f254063j2;

    /* renamed from: k2, reason: collision with root package name */
    public rh4.n0 f254064k2;

    /* renamed from: l2, reason: collision with root package name */
    public rh4.o f254065l2;

    /* renamed from: m2, reason: collision with root package name */
    public rh4.m f254066m2;

    /* renamed from: n2, reason: collision with root package name */
    public ph4.e f254067n2;

    /* renamed from: o2, reason: collision with root package name */
    public oh4.j f254068o2;

    /* renamed from: p2, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f254069p2;

    /* renamed from: q2, reason: collision with root package name */
    public int f254070q2;

    /* renamed from: r2, reason: collision with root package name */
    public java.lang.Runnable f254071r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f254072s2;

    /* renamed from: t2, reason: collision with root package name */
    public int f254073t2;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f254074u2;

    /* renamed from: v2, reason: collision with root package name */
    public boolean f254075v2;

    /* renamed from: w2, reason: collision with root package name */
    public boolean f254076w2;

    /* renamed from: x2, reason: collision with root package name */
    public boolean f254077x2;

    /* renamed from: y2, reason: collision with root package name */
    public boolean f254078y2;

    /* renamed from: z2, reason: collision with root package name */
    public boolean f254079z2;

    public C18557xc00aa3f3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f254054b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1();
        this.f254057d2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f254058e2 = new java.util.ArrayList();
        this.f254061h2 = null;
        this.f254062i2 = false;
        this.f254063j2 = "";
        this.f254070q2 = 0;
        this.f254071r2 = null;
        this.f254072s2 = false;
        this.f254073t2 = 0;
        this.f254074u2 = false;
        this.f254075v2 = false;
        this.f254076w2 = true;
        this.f254077x2 = false;
        this.f254078y2 = false;
        this.f254079z2 = false;
        this.A2 = false;
        this.B2 = false;
        this.C2 = false;
        this.D2 = false;
        this.E2 = false;
        this.F2 = false;
        this.G2 = 0;
        this.H2 = false;
        this.I2 = false;
        this.J2 = 0;
        this.K2 = 0;
        this.L2 = false;
        this.M2 = false;
        this.N2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6170x4f46fb32>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarView.1
            {
                this.f39173x3fe91575 = -160835806;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6170x4f46fb32 c6170x4f46fb32) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.f254052c3;
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.this;
                java.lang.Runnable runnable = c18557xc00aa3f3.Y2;
                c18557xc00aa3f3.removeCallbacks(runnable);
                c18557xc00aa3f3.post(runnable);
                return false;
            }
        };
        this.O2 = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop();
        this.P2 = 0.0f;
        this.Q2 = 0.0f;
        this.R2 = 0.0f;
        this.S2 = false;
        this.T2 = false;
        this.U2 = false;
        this.V2 = false;
        this.W2 = new android.view.animation.DecelerateInterpolator();
        this.X2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r1(this);
        this.Y2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s1(this);
        this.Z2 = -1;
        this.f254053a3 = false;
        this.f254055b3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.m1(this);
        q1(context);
    }

    public static void g1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "checkDidReAppear CommonUsedDataUpdated:%b, dataRefreshType:%d", java.lang.Boolean.valueOf(c18557xc00aa3f3.f254056c2.f254200m), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = c18557xc00aa3f3.f254056c2;
        if (o2Var.f254200m) {
            int i18 = c18557xc00aa3f3.K2;
            boolean z17 = true;
            if ((i18 == 0 && i17 == 1) || i17 == 2) {
                if (i17 == 1) {
                    c18557xc00aa3f3.K2 = i18 + 1;
                    z17 = false;
                }
                o2Var.f254200m = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "onDidReAppear dataRefreshType:%d, isBackFromDesktop:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
                o2Var.f254199l = i17;
                ih4.a aVar = o2Var.f254207t;
                aVar.getClass();
                aVar.f373131a = java.lang.System.currentTimeMillis();
                o2Var.l(z17, 0);
                o2Var.m();
                o2Var.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDesktopContainer */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730 m71606xaa86a33b() {
        return this.f254059f2.m71594xf3e53c80();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getEmptyViewTopMargin */
    public int m71607x1550ffe7() {
        rh4.m mVar;
        rh4.o oVar;
        rh4.n0 n0Var;
        java.util.ArrayList arrayList = this.f254058e2;
        java.lang.Object[] objArr = arrayList.size() - (p1() ? 1 : 0) == 1;
        int f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        if (objArr == true) {
            return (getHeight() - (p1() ? f17 : 0)) / 3;
        }
        int height = getHeight();
        if (p1()) {
            height -= f17;
        }
        if (arrayList.contains(1) && (n0Var = this.f254064k2) != null) {
            height -= n0Var.getHeight();
        }
        if (arrayList.contains(2) && (oVar = this.f254065l2) != null) {
            height -= oVar.getHeight();
        }
        if (arrayList.contains(7) && (mVar = this.f254066m2) != null) {
            height -= mVar.getHeight();
        }
        return java.lang.Math.max(height / 3, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
    }

    public static void h1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onDidCloseHeader %b", java.lang.Boolean.valueOf(c18557xc00aa3f3.f254074u2));
        if (c18557xc00aa3f3.f254074u2) {
            return;
        }
        c18557xc00aa3f3.m71608xf01ce28e(true);
        c18557xc00aa3f3.f254076w2 = true;
        c18557xc00aa3f3.post(c18557xc00aa3f3.X2);
        c18557xc00aa3f3.m1();
        if (c18557xc00aa3f3.f254066m2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "updateTitleSize to 14f");
            int dimensionPixelSize = c18557xc00aa3f3.f254060g2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4);
            c18557xc00aa3f3.f254066m2.h(dimensionPixelSize);
            rh4.n0 n0Var = c18557xc00aa3f3.f254064k2;
            if (n0Var != null) {
                n0Var.h(dimensionPixelSize);
            }
            ph4.e eVar = c18557xc00aa3f3.f254067n2;
            if (eVar != null) {
                eVar.h(dimensionPixelSize);
            }
            oh4.j jVar = c18557xc00aa3f3.f254068o2;
            if (jVar != null) {
                jVar.h(dimensionPixelSize);
            }
            c18557xc00aa3f3.f254066m2.t(false);
        }
        if (c18557xc00aa3f3.I2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "ljd checkUpdateCacheWhenCloseHeader");
            c18557xc00aa3f3.I2 = false;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "notifyCommonUsedAppCacheUpdate");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0.class);
            l0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "ljd notifyCommonUsedAppCacheUpdate db");
            l0Var.mo142179xf35bbb4("batch", 3, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158007h = false;
        }
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ui(rv.g3.ShowAppBrandBox);
    }

    public static void j1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4, int i18, boolean z17) {
        c18557xc00aa3f3.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17 ? "2:" : "1:");
        sb6.append(i18);
        c12559xbdae8559.f169324g = sb6.toString();
        if (c11714x918fd2e4 != null) {
            c18557xc00aa3f3.D2 = true;
            c18557xc00aa3f3.v1();
            c18557xc00aa3f3.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.k1(c18557xc00aa3f3, c11714x918fd2e4, i17, c12559xbdae8559), gh4.j0.b() ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_appbrand_pulldown_launch_remove_delay_millis, 0L) : 0L);
        }
    }

    /* renamed from: setupMultiTaskScroll */
    private void m71608xf01ce28e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "setupMultiTaskScroll %b", java.lang.Boolean.valueOf(z17));
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).T6(z17);
    }

    @Override // cl1.o0
    public void A() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    @Override // cl1.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(boolean r18, cl1.n0 r19, int r20, boolean r21, int r22) {
        /*
            r17 = this;
            r0 = r19
            r1 = r17
            com.tencent.mm.plugin.taskbar.ui.o2 r2 = r1.f254056c2
            r2.getClass()
            java.lang.String r3 = "item"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r3)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r3 = r0.f124421a
            java.lang.String r3 = r3.f157895e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            int r5 = r0.f124422b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r6}
            java.lang.String r4 = "MicroMsg.TaskBarViewPresenter"
            java.lang.String r6 = "reportOnItemManualAddDeleteMyWeApp appId:%s,pos:%d, viewType:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r6, r3)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r3 = r0.f124421a
            java.lang.String r4 = r3.f157895e
            int r3 = r3.f157896f
            java.lang.String r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.b(r4, r3)
            r3 = 2
            r4 = 1
            r6 = 7
            if (r5 != r3) goto L3a
            r7 = 3
            goto L3e
        L3a:
            if (r5 != r6) goto L40
            r7 = 14
        L3e:
            r9 = r7
            goto L41
        L40:
            r9 = r4
        L41:
            if (r18 == 0) goto L45
            r7 = r4
            goto L46
        L45:
            r7 = r3
        L46:
            if (r18 == 0) goto L4a
            r3 = 6
            goto L4b
        L4a:
            r3 = r6
        L4b:
            if (r5 != r6) goto L4f
            r3 = 8
        L4f:
            r8 = r3
            ih4.a r6 = r2.f254207t
            r11 = 0
            r13 = 0
            r14 = 0
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r2 = r0.f124421a
            java.lang.String r15 = r2.f157894d
            boolean r0 = r19.b()
            if (r0 == 0) goto L61
            r0 = 4
            goto L62
        L61:
            r0 = 0
        L62:
            r16 = r0
            r12 = r22
            r6.c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.D(boolean, cl1.n0, int, boolean, int):void");
    }

    @Override // cl1.o0
    public void E(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = this.f254059f2.f254030d;
        if (zVar != null) {
            zVar.b(0L, i17, false);
        }
    }

    @Override // cl1.o0
    public void G(int i17, cl1.n0 n0Var, boolean z17) {
        int i18;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = n0Var.f124421a.f157898h;
        int i19 = n0Var.f124422b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "launchAppBrandWithCheck, %d %s %d %b", valueOf, str, java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(this.f254079z2));
        if (this.f254079z2) {
            return;
        }
        this.f254056c2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "checkLaunchAppBrand checkOk: %b", java.lang.Boolean.TRUE);
        this.B2 = false;
        this.C2 = false;
        int i27 = 2;
        if (i19 == 2) {
            j1(this, 1104, n0Var.f124421a, i17, z17);
        } else if (i19 == 7) {
            j1(this, 1271, n0Var.f124421a, i17, z17);
        } else {
            j1(this, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.z.f33965x366c91de, n0Var.f124421a, i17, z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = this.f254056c2;
        o2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemClicked appId:%s,pos:%d,viewType:%d,desktop:%b", n0Var.f124421a.f157895e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = n0Var.f124421a;
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.b(c11714x918fd2e4.f157895e, c11714x918fd2e4.f157896f);
        java.lang.String extra_data = "";
        if (i19 == 2) {
            i18 = 3;
        } else if (i19 == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11709x5a897c43 c11709x5a897c43 = n0Var.f124421a.f157908u;
            if (c11709x5a897c43 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11709x5a897c43.f157872f)) {
                extra_data = n0Var.f124421a.f157908u.f157872f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extra_data, "extra_data");
            }
            i18 = 14;
        } else {
            i18 = 1;
        }
        o2Var.f254211x = i18;
        if (!z17) {
            i27 = 1;
        } else if (i19 == 2) {
            i27 = 3;
        }
        o2Var.f254207t.e(i18, i17, b17, i27, null, extra_data, o2Var.f254199l, n0Var.f124421a.f157894d, n0Var.b() ? 4 : 0);
    }

    @Override // cl1.o0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = this.f254056c2;
        if (o2Var == null) {
            return;
        }
        o2Var.k(c11714x918fd2e4, i17, i18, false);
    }

    @Override // cl1.o0
    public boolean c() {
        return !((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && this.f254056c2.f254196i.size() > 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q
    public void d() {
        m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r0 != 3) goto L74;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    @Override // cl1.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(cl1.n0 r18, boolean r19, boolean r20, boolean r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            if (r20 != 0) goto Ld
            boolean r3 = r0.f254078y2
            if (r3 == 0) goto Ld
            return
        Ld:
            if (r20 == 0) goto L92
            com.tencent.mm.plugin.taskbar.ui.o2 r3 = r0.f254056c2
            r3.getClass()
            java.lang.String r4 = "item"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r4 = r1.f124421a
            java.lang.String r5 = r4.f157895e
            int r4 = r4.f157896f
            java.lang.String r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.b(r5, r4)
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r4 = r1.f124421a
            java.lang.String r4 = r4.f157895e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r21)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r19)
            int r7 = r1.f124422b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r9, r5, r6, r8}
            java.lang.String r5 = "MicroMsg.TaskBarViewPresenter"
            java.lang.String r6 = "reportOnItemAppear appId:%s,multiTaskId:%s loadMore:%b isMy:%b, viewType:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6, r4)
            r4 = 3
            r5 = 2
            java.lang.String r6 = ""
            if (r7 != r5) goto L4a
            r8 = r4
            goto L68
        L4a:
            r8 = 7
            if (r7 != r8) goto L6a
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r7 = r1.f124421a
            com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo r7 = r7.f157908u
            r8 = 14
            if (r7 == 0) goto L68
            java.lang.String r7 = r7.f157872f
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r7 != 0) goto L68
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r6 = r1.f124421a
            com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo r6 = r6.f157908u
            java.lang.String r6 = r6.f157872f
            java.lang.String r7 = "extra_data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)
        L68:
            r12 = r6
            goto L6d
        L6a:
            r7 = 1
            r12 = r6
            r8 = r7
        L6d:
            if (r2 == 0) goto L71
            r10 = r4
            goto L72
        L71:
            r10 = r5
        L72:
            if (r21 == 0) goto L76
            r7 = r4
            goto L77
        L76:
            r7 = r5
        L77:
            ih4.a r6 = r3.f254207t
            java.lang.String r11 = ""
            int r14 = r3.f254199l
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r2 = r1.f124421a
            java.lang.String r15 = r2.f157894d
            boolean r1 = r18.b()
            if (r1 == 0) goto L89
            r1 = 4
            goto L8a
        L89:
            r1 = 0
        L8a:
            r16 = r1
            r13 = r22
            r6.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L99
        L92:
            com.tencent.mm.plugin.taskbar.ui.o2 r3 = r0.f254056c2
            r4 = r22
            r3.j(r1, r2, r4)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.e(cl1.n0, boolean, boolean, boolean, int):void");
    }

    /* renamed from: getRecyclerView */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m71609x4905e9fa() {
        return this;
    }

    /* renamed from: getTaskBarContainerBottom */
    public int m71610x9915d2d4() {
        return getBottom();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public void l1(int i17) {
        postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.e1(this, i17), E0() ? 200L : 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032d A[Catch: Exception -> 0x0336, TRY_LEAVE, TryCatch #1 {Exception -> 0x0336, blocks: (B:63:0x02f4, B:113:0x0302, B:116:0x0309, B:118:0x0319, B:120:0x031f, B:125:0x032d), top: B:62:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038e A[Catch: all -> 0x0394, TRY_LEAVE, TryCatch #0 {all -> 0x0394, blocks: (B:71:0x0353, B:74:0x0365, B:79:0x0372, B:81:0x037c, B:83:0x0382, B:88:0x038e), top: B:70:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0391 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.m():void");
    }

    public void m1() {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Boolean.valueOf(this.f254078y2);
        objArr[1] = java.lang.Boolean.valueOf(this.A2);
        objArr[2] = java.lang.Boolean.valueOf(this.f254077x2);
        objArr[3] = java.lang.Boolean.valueOf(this.f254076w2);
        objArr[4] = java.lang.Boolean.valueOf(!this.f254079z2);
        objArr[5] = java.lang.Boolean.valueOf(this.f254056c2.f254203p == 0);
        objArr[6] = java.lang.Boolean.valueOf(!this.f254074u2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "checkReloadData isInSecondaryPage[%b],isStopped[%b] | shouldReloadOnAppear[%b] isHeaderDidClose[%b] !isPaused[%b] isOnMainTab[%b] !isHeaderStartOpen[%b]", objArr);
        if (!this.f254078y2 && (!this.A2 || this.f254076w2)) {
            if (!this.f254077x2 || !this.f254076w2 || this.f254079z2) {
                return;
            }
            if (!(this.f254056c2.f254203p == 0) || this.f254074u2) {
                return;
            }
        }
        java.lang.Runnable runnable = this.Y2;
        removeCallbacks(runnable);
        post(runnable);
    }

    @Override // cl1.o0
    public void n(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "notifyDesktopClosed isBack:%b, isDataChange:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        this.f254078y2 = false;
        this.f254059f2.f254036m.setImportantForAccessibility(2);
        if (z17) {
            if (!z18) {
                this.f254056c2.l(true, 0);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
            bundle.putString("session_id", ip1.q.f375133e);
            bundle.putBoolean("need_location_info", true);
            ft.j jVar = (ft.j) i95.n0.c(ft.j.class);
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y1(this, 2);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) jVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.z0().u0(currentTimeMillis, true, bundle, 11, 0, -1, -1L, null, y1Var);
        }
    }

    public void n1() {
        rh4.m mVar = this.f254066m2;
        if (mVar == null || !mVar.r()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "updateTitleSize to 12f");
        int dimensionPixelSize = this.f254060g2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        this.f254066m2.h(dimensionPixelSize);
        rh4.n0 n0Var = this.f254064k2;
        if (n0Var != null) {
            n0Var.h(dimensionPixelSize);
        }
        ph4.e eVar = this.f254067n2;
        if (eVar != null) {
            eVar.h(dimensionPixelSize);
        }
        oh4.j jVar = this.f254068o2;
        if (jVar != null) {
            jVar.h(dimensionPixelSize);
        }
        if (this.f254066m2.r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "need restrictMoreViewWidget");
            this.f254066m2.t(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d4  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.o(int, int):void");
    }

    public final boolean o1() {
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TASKBAR_SHOULD_NOT_SHOW_EMPTY_OTHER_TIPS_BOOLEAN_SYNC, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "enableOthersWording %b", java.lang.Boolean.valueOf(!o17));
        return !o17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.View rootView = getRootView();
        if (rootView == null) {
            return;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.T2) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = this.f254059f2;
        if (viewOnTouchListenerC18555xc58183f3 == null || this.f254070q2 == viewOnTouchListenerC18555xc58183f3.m71598x6ba62022()) {
            return;
        }
        int m71598x6ba62022 = this.f254059f2.m71598x6ba62022();
        this.f254070q2 = m71598x6ba62022;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onMeasure fixedViewHeight: %d, measuredHeight: %d", java.lang.Integer.valueOf(m71598x6ba62022), java.lang.Integer.valueOf(this.f254059f2.getMeasuredHeight()));
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3;
        super.onVisibilityChanged(view, i17);
        if (i17 == 8 || i17 == 4) {
            if (this.D2 && (viewOnTouchListenerC18555xc58183f3 = this.f254059f2) != null) {
                int i18 = this.G2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = viewOnTouchListenerC18555xc58183f3.f254030d;
                if (zVar != null) {
                    zVar.b(100L, i18, true);
                }
                this.G2 = 0;
                this.D2 = false;
            }
            if (this.f254072s2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onVisibilityChanged needRefresh");
                this.f254072s2 = false;
                java.lang.Runnable runnable = this.f254071r2;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.n1(this);
                this.f254071r2 = n1Var;
                postDelayed(n1Var, 1000L);
            }
        }
    }

    public final boolean p1() {
        java.util.ArrayList arrayList = this.f254058e2;
        return arrayList.contains(5) || arrayList.contains(10);
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        synchronized (this) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f254057d2;
            if (n3Var == null) {
                return false;
            }
            return n3Var.mo50293x3498a0(runnable);
        }
    }

    @Override // android.view.View
    public boolean postDelayed(java.lang.Runnable runnable, long j17) {
        synchronized (this) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f254057d2;
            if (n3Var == null) {
                return false;
            }
            return n3Var.mo50297x7c4d7ca2(runnable, j17);
        }
    }

    public final void q1(android.content.Context context) {
        this.f254060g2 = context;
        m7964x8d4ad49c(this.f254054b2);
        N(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.x1(this, null));
        setVerticalFadingEdgeEnabled(false);
        setNestedScrollingEnabled(true);
        setBackground(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o1(this, context);
        this.f254061h2 = o1Var;
        mo7967x900dcbe1(o1Var);
        setOverScrollMode(2);
        i(this.f254055b3);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1(this);
        this.f254069p2 = w1Var;
        mo7960x6cab2c8d(w1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "TaskBarView init %d", java.lang.Integer.valueOf(hashCode()));
        this.N2.mo48813x58998cd();
    }

    public final boolean r1() {
        rh4.o oVar;
        rh4.m mVar;
        rh4.n0 n0Var = this.f254064k2;
        return (n0Var != null && n0Var.f477302m.f172658d2) || ((oVar = this.f254065l2) != null && oVar.f477302m.f172658d2) || ((mVar = this.f254066m2) != null && mVar.f477302m.f172658d2);
    }

    @Override // android.view.View
    public boolean removeCallbacks(java.lang.Runnable runnable) {
        synchronized (this) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f254057d2;
            if (n3Var == null) {
                return false;
            }
            n3Var.mo50300x3fa464aa(runnable);
            return true;
        }
    }

    public void s1() {
        this.B2 = false;
        this.C2 = false;
        this.D2 = false;
        if (((su4.a1) i95.n0.c(su4.a1.class)) != null) {
            this.f254078y2 = true;
            su4.j2 j2Var = new su4.j2();
            j2Var.f494472b = 42;
            j2Var.f494473c = 262208;
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_weapp_mainframe_search_style, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onSearchClick isSupportSearchStyle:%b", java.lang.Boolean.valueOf(z17));
            j2Var.D = z17;
            j2Var.E = c();
            j2Var.A = !((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(42, 262208);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Bi(this.f254060g2, j2Var);
            ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).aj(42, 262208);
        }
        boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20685x2f3c5f64()) == 1;
        int i17 = z18 ? 16 : 12;
        if (z18) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Di(1132);
        }
        u(i17, false, false, null);
    }

    /* renamed from: setHeaderContainer */
    public void m71611xffc883b2(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3) {
        this.f254059f2 = viewOnTouchListenerC18555xc58183f3;
        m71606xaa86a33b().m53357x6c4ebec7(this);
    }

    public void t1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onTeenModeStatusChanged");
        this.f254056c2.b(true, 300L);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb) m71606xaa86a33b().f172606f;
        c12767x7016a6fb.getClass();
        if (((ku5.t0) ku5.t0.f394148d).f394150a.get()) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: cl1.l$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb.f172613h0;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb.this;
                c12767x7016a6fb2.o1();
                c12767x7016a6fb2.n1();
                c12767x7016a6fb2.m1(i65.a.B(c12767x7016a6fb2.getContext()));
            }
        });
    }

    @Override // cl1.o0
    public void u(int i17, boolean z17, boolean z18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = this.f254056c2;
        if (o2Var == null) {
            return;
        }
        o2Var.f254211x = i17;
        int i18 = !z17 ? 1 : z18 ? 3 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemClicked type:%d", java.lang.Integer.valueOf(i17));
        o2Var.f254207t.e(i17, 0, "", i18, str, "", o2Var.f254199l, "", -1);
    }

    public void u1(cl1.n0 n0Var, int i17) {
        if (n0Var.f124422b == 7) {
            this.f254056c2.g(n0Var, i17, 2, 9);
        } else {
            this.f254056c2.g(n0Var, i17, 2, 7);
        }
    }

    public final void v1() {
        if (this.f254059f2 == null || !gh4.j0.b()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "switchToGradientBackgroundView");
        java.lang.Object parent = this.f254059f2.getParent();
        if (parent instanceof android.view.View) {
            ((android.view.View) parent).setBackgroundColor(this.f254060g2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d m71591x13a1e17d = this.f254059f2.m71591x13a1e17d();
        if (m71591x13a1e17d != null) {
            synchronized (m71591x13a1e17d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "pause");
                com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView = m71591x13a1e17d.getGradientBgView();
                if (gradientBgView != null) {
                    gradientBgView.setVisibility(0);
                }
                com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView2 = m71591x13a1e17d.getGradientBgView();
                if (gradientBgView2 != null) {
                    gradientBgView2.setAlpha(1.0f);
                }
                com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d40 = m71591x13a1e17d.dynamicBgSurfaceView;
                if (c10434xd4fc3d40 != null) {
                    c10434xd4fc3d40.b();
                }
            }
            this.L2 = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q
    public void w(int i17) {
        o(i17, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.w1():void");
    }

    @Override // cl1.o0
    public void y(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = this.f254056c2;
        o2Var.getClass();
        boolean b17 = gh4.j0.b();
        ih4.a aVar = o2Var.f254207t;
        int i18 = !z17 ? i17 : 0;
        int i19 = z17 ? i17 : 0;
        aVar.b(2, b17 ? 1 : 0, i18, 0, 0, 0, 0, 0, i19, 0, 0, z17 ? 3 : 2, 0, o2Var.f254199l);
    }

    public C18557xc00aa3f3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f254054b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1();
        this.f254057d2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f254058e2 = new java.util.ArrayList();
        this.f254061h2 = null;
        this.f254062i2 = false;
        this.f254063j2 = "";
        this.f254070q2 = 0;
        this.f254071r2 = null;
        this.f254072s2 = false;
        this.f254073t2 = 0;
        this.f254074u2 = false;
        this.f254075v2 = false;
        this.f254076w2 = true;
        this.f254077x2 = false;
        this.f254078y2 = false;
        this.f254079z2 = false;
        this.A2 = false;
        this.B2 = false;
        this.C2 = false;
        this.D2 = false;
        this.E2 = false;
        this.F2 = false;
        this.G2 = 0;
        this.H2 = false;
        this.I2 = false;
        this.J2 = 0;
        this.K2 = 0;
        this.L2 = false;
        this.M2 = false;
        this.N2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6170x4f46fb32>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarView.1
            {
                this.f39173x3fe91575 = -160835806;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6170x4f46fb32 c6170x4f46fb32) {
                int i172 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.f254052c3;
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.this;
                java.lang.Runnable runnable = c18557xc00aa3f3.Y2;
                c18557xc00aa3f3.removeCallbacks(runnable);
                c18557xc00aa3f3.post(runnable);
                return false;
            }
        };
        this.O2 = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop();
        this.P2 = 0.0f;
        this.Q2 = 0.0f;
        this.R2 = 0.0f;
        this.S2 = false;
        this.T2 = false;
        this.U2 = false;
        this.V2 = false;
        this.W2 = new android.view.animation.DecelerateInterpolator();
        this.X2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r1(this);
        this.Y2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s1(this);
        this.Z2 = -1;
        this.f254053a3 = false;
        this.f254055b3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.m1(this);
        q1(context);
    }
}
