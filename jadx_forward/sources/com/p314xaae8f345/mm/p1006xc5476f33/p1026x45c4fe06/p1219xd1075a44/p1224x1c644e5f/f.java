package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public class f implements ze.p, xi1.s {

    /* renamed from: Companion */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.a f35315x233c02ec = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.a(null);
    private static final java.lang.String TAG = "MicroMsg.AppBrandHalfWindowLayoutManager";

    /* renamed from: baseWindow */
    private final xi1.g f35316xd578ae21;

    /* renamed from: centerInsideManager */
    private ze.g f35317xdffdf9bc;

    /* renamed from: currentWindowStableInsetBottom */
    private int f35318x7034fba4;

    /* renamed from: currentWindowStableInsetRight */
    private int f35319x5711cd83;

    /* renamed from: isMonitorWindowInsets */
    private boolean f35320x10a577f6;

    /* renamed from: lastOrientation */
    private int f35321x2c91b15a;

    /* renamed from: onApplyWindowInsetsListener$delegate */
    private final jz5.g f35322x2ad83280;

    /* renamed from: rt, reason: collision with root package name */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f172700rt;

    /* renamed from: setupGestureController */
    private volatile boolean f35323x383404c8;

    /* renamed from: shouldUseCenterPopStyle */
    private boolean f35324xf9801149;

    /* renamed from: wxaHalfScreenEmptyAreaClickHandler */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.p0 f35325x7ab20a3d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6, xi1.g baseWindow) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseWindow, "baseWindow");
        this.f172700rt = rt6;
        this.f35316xd578ae21 = baseWindow;
        this.f35325x7ab20a3d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.p0(rt6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.a aVar = f35315x233c02ec;
        android.content.Context mo52325x76847179 = baseWindow.mo52325x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = rt6.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        boolean a17 = aVar.a(mo52325x76847179, halfScreenConfig);
        this.f35324xf9801149 = a17;
        if (a17) {
            this.f35317xdffdf9bc = m53390x988a3ae();
        }
        this.f35322x2ad83280 = jz5.h.a(jz5.i.f384364f, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.e(this));
    }

    /* renamed from: centerInsideManagerFactory */
    private final ze.g m53390x988a3ae() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.c(this, this.f172700rt);
    }

    /* renamed from: configGesture */
    private final void m53391xdca3a3a7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1) {
        android.app.Activity r07 = this.f172700rt.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
        boolean z17 = r07.getResources().getConfiguration().orientation == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = this.f172700rt.H2.f172731d;
        if (f0Var != null) {
            f0Var.d0(!z17 && c11816x5915d2c1.f158897n, !z17 && c11816x5915d2c1.f158902s, c11816x5915d2c1.f158889J, c11816x5915d2c1.L, c11816x5915d2c1.N, c11816x5915d2c1.W);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = this.f172700rt.H2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var2 = l0Var.f172731d;
        if (f0Var2 != null) {
            f0Var2.c0(l0Var.f172734g);
        }
    }

    /* renamed from: configHalfScreenConfig */
    private final void m53392x62ba9203(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 c12547xf52fd300;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = c11809xbc286be4.L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        boolean z17 = false;
        if (!halfScreenConfig.c()) {
            this.f172700rt.f156343s.m53608x1e535048(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = this.f172700rt.H2.f172731d;
            if (f0Var != null) {
                f0Var.Y();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = this.f172700rt.H2;
            l0Var.f172731d = null;
            l0Var.n();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var2 = this.f172700rt.H2;
            int i17 = hl1.h.f363631a;
            hl1.h hVar = hl1.f.f363626a;
            l0Var2.getClass();
            l0Var2.f172732e = hVar;
            this.f35323x383404c8 = false;
            c12547xf52fd300 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300(-1, -1);
        } else {
            if (this.f172700rt.r0() == null) {
                return;
            }
            android.app.Activity r07 = this.f172700rt.r0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
            c12547xf52fd300 = m53397x617825fb(this, halfScreenConfig, r07.getResources().getConfiguration().orientation == 2, false, 4, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var2 = this.f172700rt.H2.f172731d;
            if (f0Var2 != null) {
                f0Var2.X(0, -1);
            }
            if (this.f172700rt.H2.A()) {
                if (!this.f35323x383404c8) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = this.f172700rt;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = runtime.f156343s;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.z0(runtime, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0(runtime), null);
                    this.f172700rt.H2.f172731d = z0Var;
                    qVar.m53608x1e535048(z0Var);
                    this.f35323x383404c8 = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var3 = this.f172700rt.H2.f172731d;
                if (f0Var3 != null) {
                    int i18 = ((android.widget.FrameLayout.LayoutParams) c12547xf52fd300).height;
                    int i19 = halfScreenConfig.K;
                    if (i19 != -1) {
                        i19 = java.lang.Math.max(-1, i19 - m53394xac37c03e(halfScreenConfig));
                    }
                    f0Var3.X(i18, i19);
                }
                m53391xdca3a3a7(halfScreenConfig);
            }
            if (halfScreenConfig.D == k91.x2.f387350e && this.f172700rt.H2.f172732e.mo133702x368f3a() != hl1.g.f363629f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f172700rt;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var3 = o6Var.H2;
                android.app.Activity r08 = o6Var.r0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r08);
                hl1.d dVar = new hl1.d(o6Var, r08.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77910xe61cad91));
                l0Var3.getClass();
                l0Var3.f172732e = dVar;
            } else if (halfScreenConfig.D == k91.x2.f387349d && this.f172700rt.H2.f172732e.mo133702x368f3a() != hl1.g.f363628e) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = this.f172700rt;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var4 = o6Var2.H2;
                hl1.b bVar2 = new hl1.b(o6Var2, halfScreenConfig.f158905v);
                l0Var4.getClass();
                l0Var4.f172732e = bVar2;
            }
            if (bVar != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.b.f172684d && !halfScreenConfig.f158904u) {
                this.f172700rt.H2.f172732e.a();
            }
            xi1.g mo48803xee5260a9 = this.f172700rt.mo48803xee5260a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo48803xee5260a9, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
            android.app.Activity r09 = this.f172700rt.r0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r09);
            ((xi1.i) mo48803xee5260a9).d(r09.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), this.f172700rt);
            z17 = true;
        }
        xi1.g mo48803xee5260a92 = this.f172700rt.mo48803xee5260a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo48803xee5260a92, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
        ((xi1.i) mo48803xee5260a92).a(c12547xf52fd300, this.f172700rt);
        m53399x8d81b180(z17);
    }

    /* renamed from: defaultDisplay */
    private final android.view.Display m53393xdb197f41() {
        android.content.Context r07 = this.f172700rt.r0();
        if (r07 == null) {
            r07 = this.f172700rt.f156328d;
        }
        java.lang.Object systemService = r07.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return ((android.view.WindowManager) systemService).getDefaultDisplay();
    }

    /* renamed from: getHeaderOuterIndicatorHeight */
    private final int m53394xac37c03e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1) {
        if (!this.f172700rt.H2.r()) {
            return 0;
        }
        int i17 = c11816x5915d2c1.G;
        return i17 > 0 ? i17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
    }

    /* renamed from: getOnApplyWindowInsetsListener */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.d m53395x7e501c13() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.d) this.f35322x2ad83280.mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x010b, code lost:
    
        if (xi1.o.b(r13) != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff A[Catch: Error -> 0x010f, TryCatch #0 {Error -> 0x010f, blocks: (B:47:0x00ca, B:49:0x00d2, B:51:0x00da, B:53:0x00e6, B:54:0x00f7, B:56:0x00ff, B:58:0x0105, B:59:0x0107, B:66:0x00e9, B:68:0x00f1), top: B:46:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* renamed from: makeLayoutParams */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 m53396xcb73e5e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f.m53396xcb73e5e(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig, boolean, boolean):com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams");
    }

    /* renamed from: makeLayoutParams$default */
    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 m53397x617825fb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeLayoutParams");
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        return fVar.m53396xcb73e5e(c11816x5915d2c1, z17, z18);
    }

    /* renamed from: makeLayoutParamsForCenterPop */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 m53398xc4bb6c71() {
        ze.g gVar = this.f35317xdffdf9bc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
        gVar.mo51619xfa43b684("portrait");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "wh=%d%d", java.lang.Integer.valueOf(gVar.mo48807xad90d981().widthPixels), java.lang.Integer.valueOf(gVar.mo48807xad90d981().heightPixels));
        android.util.DisplayMetrics mo48807xad90d981 = gVar.mo48807xad90d981();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 c12547xf52fd300 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300((int) (mo48807xad90d981.widthPixels * gVar.mo51614x7520af94()), (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * 3) / 4);
        ((android.widget.FrameLayout.LayoutParams) c12547xf52fd300).gravity = 81;
        return c12547xf52fd300;
    }

    /* renamed from: monitorWindowInsets */
    private final void m53399x8d81b180(boolean z17) {
        android.app.Activity r07 = this.f172700rt.r0();
        if (!(r07 instanceof android.app.Activity)) {
            r07 = null;
        }
        if (r07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "[monitorWindowInsets] runtime context is null!");
            return;
        }
        if (!z17) {
            this.f35320x10a577f6 = false;
            vj5.n.b(r07).f(m53395x7e501c13());
        } else {
            if (this.f35320x10a577f6) {
                return;
            }
            this.f35320x10a577f6 = true;
            android.view.WindowInsets b17 = com.p314xaae8f345.mm.ui.qk.b(r07);
            if (b17 != null) {
                m53402xd9f3c575(b17);
            }
            vj5.n.b(r07).d(m53395x7e501c13());
        }
    }

    /* renamed from: navigationBarHeightToConsume */
    private final int m53400x2d395c3b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1) {
        if (c11816x5915d2c1.C) {
            return this.f35318x7034fba4;
        }
        return 0;
    }

    /* renamed from: navigationBarWidthToConsume */
    private final int m53401xadb9b11a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1) {
        if (c11816x5915d2c1.C) {
            return this.f35319x5711cd83;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onApplyWindowInsets */
    public final void m53402xd9f3c575(android.view.WindowInsets windowInsets) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onApplyWindowInsets insets=" + windowInsets + ", currentWindowStableInsetBottom=" + this.f35318x7034fba4);
        boolean z18 = true;
        if (this.f35318x7034fba4 != windowInsets.getStableInsetBottom()) {
            this.f35318x7034fba4 = windowInsets.getStableInsetBottom();
            z17 = true;
        } else {
            z17 = false;
        }
        if (this.f35319x5711cd83 != windowInsets.getStableInsetRight()) {
            this.f35319x5711cd83 = windowInsets.getStableInsetRight();
        } else {
            z18 = z17;
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = this.f172700rt.u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getInitConfig(...)");
            m53392x62ba9203(u07, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.b.f172684d);
        }
    }

    /* renamed from: shouldUseCenterPopStyle */
    public static final boolean m53403xf9801149(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1) {
        return f35315x233c02ec.a(context, c11816x5915d2c1);
    }

    /* renamed from: triggerScreenStatusChange */
    private final void m53404x8df078a6(boolean z17) {
        android.os.ResultReceiver resultReceiver;
        android.os.ResultReceiver resultReceiver2;
        boolean z18 = !this.f172700rt.H2.f172735h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "triggerScreenStatusChange isFullScreen:%b, lastStateIsFullScreen:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368 = this.f172700rt.u0().L1.f158899p;
            if (c11820x84c5f368 != null && (resultReceiver2 = c11820x84c5f368.f158930e) != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                k91.q3[] q3VarArr = k91.q3.f387266d;
                bundle.putInt("action", 0);
                bundle.putInt("status", 1);
                resultReceiver2.send(0, bundle);
            }
            if (z18) {
                return;
            }
            if (this.f172700rt.C0() != null) {
                il1.d dVar = new il1.d();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = this.f172700rt.C0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C0, "getService(...)");
                dVar.x(C0, il1.e.f373563d);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "triggerScreenStatusChange from half screen to full screen");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f3682 = this.f172700rt.u0().L1.f158899p;
        if (c11820x84c5f3682 != null && (resultReceiver = c11820x84c5f3682.f158930e) != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            k91.q3[] q3VarArr2 = k91.q3.f387266d;
            bundle2.putInt("action", 0);
            bundle2.putInt("status", 0);
            resultReceiver.send(0, bundle2);
        }
        if (z18) {
            if (this.f172700rt.C0() != null) {
                il1.d dVar2 = new il1.d();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C02 = this.f172700rt.C0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C02, "getService(...)");
                dVar2.x(C02, il1.e.f373564e);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "triggerScreenStatusChange from full screen to half screen");
        }
    }

    /* renamed from: tryMinusHeaderOuterIndicatorHeight */
    private final int m53405x4d41cb9d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1) {
        return i17 - m53394xac37c03e(c11816x5915d2c1);
    }

    /* renamed from: applyWindowConfig */
    public void mo53406x416eb9e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.b reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "applyWindowConfig");
        m53392x62ba9203(initConfig, reason);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = this.f172700rt.H2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = l0Var.f172731d;
        if (f0Var != null) {
            f0Var.b0(this.f35325x7ab20a3d);
        }
        l0Var.p();
    }

    @Override // xi1.s
    /* renamed from: createFullscreenHandler */
    public xi1.m mo51609xe80d1173(xi1.k kVar) {
        xi1.m mo51609xe80d1173 = this.f35316xd578ae21.mo51609xe80d1173(kVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo51609xe80d1173, "createFullscreenHandler(...)");
        return mo51609xe80d1173;
    }

    @Override // xi1.s
    /* renamed from: forceLightMode */
    public boolean mo52324x6c02152e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = this.f172700rt.u0().L1;
        return c11816x5915d2c1.f158894h & c11816x5915d2c1.c();
    }

    @Override // xi1.s
    /* renamed from: getOrientationHandler */
    public xi1.p mo51612x60543150() {
        if (this.f35324xf9801149) {
            xi1.g mo48803xee5260a9 = this.f172700rt.mo48803xee5260a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48803xee5260a9, "getWindowAndroid(...)");
            return new zi1.b(mo48803xee5260a9);
        }
        xi1.p mo51612x60543150 = this.f35316xd578ae21.mo51612x60543150();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo51612x60543150, "getOrientationHandler(...)");
        return mo51612x60543150;
    }

    @Override // xi1.s
    /* renamed from: getScale */
    public float mo51614x7520af94() {
        return this.f35316xd578ae21.mo51614x7520af94();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((!r0.f158897n && r0.f158890d == -1) == false) goto L13;
     */
    @Override // xi1.s
    /* renamed from: getStatusBar */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xi1.f mo51615x8408480b() {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.o6 r0 = r4.f172700rt
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.L1
            boolean r1 = r0.c()
            r2 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r0.f158897n
            r3 = 1
            if (r1 != 0) goto L1b
            int r0 = r0.f158890d
            r1 = -1
            if (r0 != r1) goto L1b
            r0 = r3
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 != 0) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 == 0) goto L2e
            xi1.f r0 = new xi1.f
            r0.<init>()
            r0.f536235a = r2
            r1 = 8
            r0.f536236b = r1
            goto L34
        L2e:
            xi1.g r0 = r4.f35316xd578ae21
            xi1.f r0 = r0.mo51615x8408480b()
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f.mo51615x8408480b():xi1.f");
    }

    @Override // xi1.s
    /* renamed from: getVDisplayMetrics */
    public android.util.DisplayMetrics mo48807xad90d981() {
        android.view.Display m53393xdb197f41;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        try {
            if (fp.h.c(30)) {
                android.app.Activity r07 = this.f172700rt.r0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
                m53393xdb197f41 = r07.getDisplay();
                if (m53393xdb197f41 == null) {
                    m53393xdb197f41 = m53393xdb197f41();
                }
            } else {
                m53393xdb197f41 = m53393xdb197f41();
            }
        } catch (java.lang.Throwable unused) {
            m53393xdb197f41 = m53393xdb197f41();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m53393xdb197f41);
        m53393xdb197f41.getRealMetrics(displayMetrics);
        if (this.f172700rt.u0().L1.c()) {
            displayMetrics.widthPixels = this.f172700rt.f156343s.getMeasuredWidth();
            displayMetrics.heightPixels = this.f172700rt.f156343s.getMeasuredHeight();
        }
        return displayMetrics;
    }

    @Override // xi1.s
    /* renamed from: isLargeScreenWindow */
    public boolean mo51618xbcb3824d() {
        return this.f35316xd578ae21.mo51618xbcb3824d();
    }

    @Override // ze.p
    /* renamed from: onAppConfigGot */
    public void mo53409xab40bc48(k91.r appConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appConfig, "appConfig");
        ze.g gVar = this.f35317xdffdf9bc;
        if (gVar != null) {
            gVar.mo53409xab40bc48(appConfig);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onAppConfigGot appId:" + this.f172700rt.f156336n + ", halfScreenEnable=" + this.f172700rt.u0().L1.c());
        android.app.Activity r07 = this.f172700rt.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
        int i17 = r07.getResources().getConfiguration().orientation;
        boolean z17 = i17 != 1 && i17 == 2;
        xi1.g mo48803xee5260a9 = this.f172700rt.mo48803xee5260a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo48803xee5260a9, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = this.f172700rt.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        ((xi1.i) mo48803xee5260a9).a(m53396xcb73e5e(halfScreenConfig, z17, false), this.f172700rt);
    }

    @Override // ze.p
    /* renamed from: onConfigurationChanged */
    public void mo53410x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onConfigurationChanged  new[" + newConfig.orientation + "]  last[" + this.f35321x2c91b15a + ']');
        ze.g gVar = this.f35317xdffdf9bc;
        if (gVar != null) {
            gVar.mo53410x50e1c15d(newConfig);
        }
        if (newConfig.orientation == this.f35321x2c91b15a) {
            return;
        }
        if (this.f172700rt.Q0()) {
            int i17 = newConfig.orientation;
            boolean z17 = false;
            if (i17 != 1 && i17 == 2) {
                z17 = true;
            }
            xi1.g mo48803xee5260a9 = this.f172700rt.mo48803xee5260a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo48803xee5260a9, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = this.f172700rt.u0().L1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
            ((xi1.i) mo48803xee5260a9).a(m53396xcb73e5e(halfScreenConfig, z17, true), this.f172700rt);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig2 = this.f172700rt.u0().L1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig2, "halfScreenConfig");
            m53391xdca3a3a7(halfScreenConfig2);
        }
        this.f35321x2c91b15a = newConfig.orientation;
    }

    @Override // xi1.s
    /* renamed from: setSoftOrientation */
    public void mo51619xfa43b684(java.lang.String str) {
        this.f35316xd578ae21.mo51619xfa43b684(str);
    }

    @Override // xi1.s
    /* renamed from: shouldInLargeScreenCompatMode */
    public boolean mo51620x1ab1e3d4() {
        return this.f35324xf9801149;
    }

    @Override // ze.p
    /* renamed from: init, reason: merged with bridge method [inline-methods] */
    public void mo53407x316510(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        ze.g gVar = this.f35317xdffdf9bc;
        if (gVar != null) {
            gVar.mo53407x316510(initConfig);
        }
        mo53406x416eb9e0(initConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.b.f172686f);
    }

    @Override // ze.p
    /* renamed from: onInitConfigUpdated, reason: merged with bridge method [inline-methods] */
    public void mo53411xc6ee77ca(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onInitConfigUpdated");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.a aVar = f35315x233c02ec;
        android.content.Context mo52325x76847179 = this.f35316xd578ae21.mo52325x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = initConfig.L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        boolean a17 = aVar.a(mo52325x76847179, halfScreenConfig);
        this.f35324xf9801149 = a17;
        if (a17) {
            ze.g gVar = this.f35317xdffdf9bc;
            if (gVar != null) {
                gVar.mo53411xc6ee77ca(initConfig);
            } else {
                ze.g m53390x988a3ae = m53390x988a3ae();
                this.f35317xdffdf9bc = m53390x988a3ae;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m53390x988a3ae);
                m53390x988a3ae.mo53407x316510(initConfig);
                ze.g gVar2 = this.f35317xdffdf9bc;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
                k91.r m07 = this.f172700rt.m0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m07, "getAppConfig(...)");
                gVar2.mo53409xab40bc48(m07);
            }
        } else {
            this.f35317xdffdf9bc = null;
        }
        mo53406x416eb9e0(initConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.b.f172685e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = this.f172700rt.x0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = (x07 == null || (m52169xfdaa7672 = x07.m52169xfdaa7672()) == null) ? null : m52169xfdaa7672.mo14682x9dee9c37();
        if (mo14682x9dee9c37 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = this.f172700rt.H2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l0Var, "getHalfScreenManger(...)");
            l0Var.f172737j = false;
            l0Var.n();
            l0Var.v((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) mo14682x9dee9c37, null);
        }
    }
}
