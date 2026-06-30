package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public class f implements ze.p, xi1.s {
    public static final com.tencent.mm.plugin.appbrand.widget.halfscreen.a Companion = new com.tencent.mm.plugin.appbrand.widget.halfscreen.a(null);
    private static final java.lang.String TAG = "MicroMsg.AppBrandHalfWindowLayoutManager";
    private final xi1.g baseWindow;
    private ze.g centerInsideManager;
    private int currentWindowStableInsetBottom;
    private int currentWindowStableInsetRight;
    private boolean isMonitorWindowInsets;
    private int lastOrientation;
    private final jz5.g onApplyWindowInsetsListener$delegate;

    /* renamed from: rt, reason: collision with root package name */
    private final com.tencent.mm.plugin.appbrand.o6 f91167rt;
    private volatile boolean setupGestureController;
    private boolean shouldUseCenterPopStyle;
    private com.tencent.mm.plugin.appbrand.widget.halfscreen.p0 wxaHalfScreenEmptyAreaClickHandler;

    public f(com.tencent.mm.plugin.appbrand.o6 rt6, xi1.g baseWindow) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(baseWindow, "baseWindow");
        this.f91167rt = rt6;
        this.baseWindow = baseWindow;
        this.wxaHalfScreenEmptyAreaClickHandler = new com.tencent.mm.plugin.appbrand.widget.halfscreen.p0(rt6);
        com.tencent.mm.plugin.appbrand.widget.halfscreen.a aVar = Companion;
        android.content.Context context = baseWindow.getContext();
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = rt6.u0().L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        boolean a17 = aVar.a(context, halfScreenConfig);
        this.shouldUseCenterPopStyle = a17;
        if (a17) {
            this.centerInsideManager = centerInsideManagerFactory();
        }
        this.onApplyWindowInsetsListener$delegate = jz5.h.a(jz5.i.f302831f, new com.tencent.mm.plugin.appbrand.widget.halfscreen.e(this));
    }

    private final ze.g centerInsideManagerFactory() {
        return new com.tencent.mm.plugin.appbrand.widget.halfscreen.c(this, this.f91167rt);
    }

    private final void configGesture(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        android.app.Activity r07 = this.f91167rt.r0();
        kotlin.jvm.internal.o.d(r07);
        boolean z17 = r07.getResources().getConfiguration().orientation == 2;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = this.f91167rt.H2.f91198d;
        if (f0Var != null) {
            f0Var.d0(!z17 && halfScreenConfig.f77364n, !z17 && halfScreenConfig.f77369s, halfScreenConfig.f77356J, halfScreenConfig.L, halfScreenConfig.N, halfScreenConfig.W);
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.f91167rt.H2;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var2 = l0Var.f91198d;
        if (f0Var2 != null) {
            f0Var2.c0(l0Var.f91201g);
        }
    }

    private final void configHalfScreenConfig(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.widget.halfscreen.b bVar) {
        com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams wxaWindowLayoutParams;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = appBrandInitConfigWC.L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        boolean z17 = false;
        if (!halfScreenConfig.c()) {
            this.f91167rt.f74810s.setWxaHalfScreenGestureController(null);
            com.tencent.mm.plugin.appbrand.widget.f0 f0Var = this.f91167rt.H2.f91198d;
            if (f0Var != null) {
                f0Var.Y();
            }
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.f91167rt.H2;
            l0Var.f91198d = null;
            l0Var.n();
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var2 = this.f91167rt.H2;
            int i17 = hl1.h.f282098a;
            hl1.h hVar = hl1.f.f282093a;
            l0Var2.getClass();
            l0Var2.f91199e = hVar;
            this.setupGestureController = false;
            wxaWindowLayoutParams = new com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams(-1, -1);
        } else {
            if (this.f91167rt.r0() == null) {
                return;
            }
            android.app.Activity r07 = this.f91167rt.r0();
            kotlin.jvm.internal.o.d(r07);
            wxaWindowLayoutParams = makeLayoutParams$default(this, halfScreenConfig, r07.getResources().getConfiguration().orientation == 2, false, 4, null);
            com.tencent.mm.plugin.appbrand.widget.f0 f0Var2 = this.f91167rt.H2.f91198d;
            if (f0Var2 != null) {
                f0Var2.X(0, -1);
            }
            if (this.f91167rt.H2.A()) {
                if (!this.setupGestureController) {
                    com.tencent.mm.plugin.appbrand.o6 runtime = this.f91167rt;
                    com.tencent.mm.plugin.appbrand.widget.q qVar = runtime.f74810s;
                    kotlin.jvm.internal.o.g(runtime, "runtime");
                    com.tencent.mm.plugin.appbrand.widget.halfscreen.z0 z0Var = new com.tencent.mm.plugin.appbrand.widget.halfscreen.z0(runtime, new com.tencent.mm.plugin.appbrand.widget.halfscreen.x0(runtime), null);
                    this.f91167rt.H2.f91198d = z0Var;
                    qVar.setWxaHalfScreenGestureController(z0Var);
                    this.setupGestureController = true;
                }
                com.tencent.mm.plugin.appbrand.widget.f0 f0Var3 = this.f91167rt.H2.f91198d;
                if (f0Var3 != null) {
                    int i18 = ((android.widget.FrameLayout.LayoutParams) wxaWindowLayoutParams).height;
                    int i19 = halfScreenConfig.K;
                    if (i19 != -1) {
                        i19 = java.lang.Math.max(-1, i19 - getHeaderOuterIndicatorHeight(halfScreenConfig));
                    }
                    f0Var3.X(i18, i19);
                }
                configGesture(halfScreenConfig);
            }
            if (halfScreenConfig.D == k91.x2.f305817e && this.f91167rt.H2.f91199e.type() != hl1.g.f282096f) {
                com.tencent.mm.plugin.appbrand.o6 o6Var = this.f91167rt;
                com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var3 = o6Var.H2;
                android.app.Activity r08 = o6Var.r0();
                kotlin.jvm.internal.o.d(r08);
                hl1.d dVar = new hl1.d(o6Var, r08.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_4));
                l0Var3.getClass();
                l0Var3.f91199e = dVar;
            } else if (halfScreenConfig.D == k91.x2.f305816d && this.f91167rt.H2.f91199e.type() != hl1.g.f282095e) {
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = this.f91167rt;
                com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var4 = o6Var2.H2;
                hl1.b bVar2 = new hl1.b(o6Var2, halfScreenConfig.f77372v);
                l0Var4.getClass();
                l0Var4.f91199e = bVar2;
            }
            if (bVar != com.tencent.mm.plugin.appbrand.widget.halfscreen.b.f91151d && !halfScreenConfig.f77371u) {
                this.f91167rt.H2.f91199e.a();
            }
            xi1.g windowAndroid = this.f91167rt.getWindowAndroid();
            kotlin.jvm.internal.o.e(windowAndroid, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
            android.app.Activity r09 = this.f91167rt.r0();
            kotlin.jvm.internal.o.d(r09);
            ((xi1.i) windowAndroid).d(r09.getResources().getColor(com.tencent.mm.R.color.a9e), this.f91167rt);
            z17 = true;
        }
        xi1.g windowAndroid2 = this.f91167rt.getWindowAndroid();
        kotlin.jvm.internal.o.e(windowAndroid2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
        ((xi1.i) windowAndroid2).a(wxaWindowLayoutParams, this.f91167rt);
        monitorWindowInsets(z17);
    }

    private final android.view.Display defaultDisplay() {
        android.content.Context r07 = this.f91167rt.r0();
        if (r07 == null) {
            r07 = this.f91167rt.f74795d;
        }
        java.lang.Object systemService = r07.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return ((android.view.WindowManager) systemService).getDefaultDisplay();
    }

    private final int getHeaderOuterIndicatorHeight(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        if (!this.f91167rt.H2.r()) {
            return 0;
        }
        int i17 = halfScreenConfig.G;
        return i17 > 0 ? i17 : com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479706d1);
    }

    private final com.tencent.mm.plugin.appbrand.widget.halfscreen.d getOnApplyWindowInsetsListener() {
        return (com.tencent.mm.plugin.appbrand.widget.halfscreen.d) this.onApplyWindowInsetsListener$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x010b, code lost:
    
        if (xi1.o.b(r13) != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff A[Catch: Error -> 0x010f, TryCatch #0 {Error -> 0x010f, blocks: (B:47:0x00ca, B:49:0x00d2, B:51:0x00da, B:53:0x00e6, B:54:0x00f7, B:56:0x00ff, B:58:0x0105, B:59:0x0107, B:66:0x00e9, B:68:0x00f1), top: B:46:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams makeLayoutParams(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.f.makeLayoutParams(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig, boolean, boolean):com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams");
    }

    public static /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams makeLayoutParams$default(com.tencent.mm.plugin.appbrand.widget.halfscreen.f fVar, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeLayoutParams");
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        return fVar.makeLayoutParams(halfScreenConfig, z17, z18);
    }

    private final com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams makeLayoutParamsForCenterPop() {
        ze.g gVar = this.centerInsideManager;
        kotlin.jvm.internal.o.d(gVar);
        gVar.setSoftOrientation("portrait");
        com.tencent.mars.xlog.Log.i(TAG, "wh=%d%d", java.lang.Integer.valueOf(gVar.getVDisplayMetrics().widthPixels), java.lang.Integer.valueOf(gVar.getVDisplayMetrics().heightPixels));
        android.util.DisplayMetrics vDisplayMetrics = gVar.getVDisplayMetrics();
        com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams wxaWindowLayoutParams = new com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams((int) (vDisplayMetrics.widthPixels * gVar.getScale()), (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * 3) / 4);
        ((android.widget.FrameLayout.LayoutParams) wxaWindowLayoutParams).gravity = 81;
        return wxaWindowLayoutParams;
    }

    private final void monitorWindowInsets(boolean z17) {
        android.app.Activity r07 = this.f91167rt.r0();
        if (!(r07 instanceof android.app.Activity)) {
            r07 = null;
        }
        if (r07 == null) {
            com.tencent.mars.xlog.Log.w(TAG, "[monitorWindowInsets] runtime context is null!");
            return;
        }
        if (!z17) {
            this.isMonitorWindowInsets = false;
            vj5.n.b(r07).f(getOnApplyWindowInsetsListener());
        } else {
            if (this.isMonitorWindowInsets) {
                return;
            }
            this.isMonitorWindowInsets = true;
            android.view.WindowInsets b17 = com.tencent.mm.ui.qk.b(r07);
            if (b17 != null) {
                onApplyWindowInsets(b17);
            }
            vj5.n.b(r07).d(getOnApplyWindowInsetsListener());
        }
    }

    private final int navigationBarHeightToConsume(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        if (halfScreenConfig.C) {
            return this.currentWindowStableInsetBottom;
        }
        return 0;
    }

    private final int navigationBarWidthToConsume(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        if (halfScreenConfig.C) {
            return this.currentWindowStableInsetRight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        boolean z17;
        com.tencent.mars.xlog.Log.i(TAG, "onApplyWindowInsets insets=" + windowInsets + ", currentWindowStableInsetBottom=" + this.currentWindowStableInsetBottom);
        boolean z18 = true;
        if (this.currentWindowStableInsetBottom != windowInsets.getStableInsetBottom()) {
            this.currentWindowStableInsetBottom = windowInsets.getStableInsetBottom();
            z17 = true;
        } else {
            z17 = false;
        }
        if (this.currentWindowStableInsetRight != windowInsets.getStableInsetRight()) {
            this.currentWindowStableInsetRight = windowInsets.getStableInsetRight();
        } else {
            z18 = z17;
        }
        if (z18) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = this.f91167rt.u0();
            kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
            configHalfScreenConfig(u07, com.tencent.mm.plugin.appbrand.widget.halfscreen.b.f91151d);
        }
    }

    public static final boolean shouldUseCenterPopStyle(android.content.Context context, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        return Companion.a(context, halfScreenConfig);
    }

    private final void triggerScreenStatusChange(boolean z17) {
        android.os.ResultReceiver resultReceiver;
        android.os.ResultReceiver resultReceiver2;
        boolean z18 = !this.f91167rt.H2.f91202h;
        com.tencent.mars.xlog.Log.i(TAG, "triggerScreenStatusChange isFullScreen:%b, lastStateIsFullScreen:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17) {
            com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = this.f91167rt.u0().L1.f77366p;
            if (weAppHalfScreenStatusChangeListener != null && (resultReceiver2 = weAppHalfScreenStatusChangeListener.f77397e) != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                k91.q3[] q3VarArr = k91.q3.f305733d;
                bundle.putInt("action", 0);
                bundle.putInt("status", 1);
                resultReceiver2.send(0, bundle);
            }
            if (z18) {
                return;
            }
            if (this.f91167rt.C0() != null) {
                il1.d dVar = new il1.d();
                com.tencent.mm.plugin.appbrand.service.c0 C0 = this.f91167rt.C0();
                kotlin.jvm.internal.o.f(C0, "getService(...)");
                dVar.x(C0, il1.e.f292030d);
            }
            com.tencent.mars.xlog.Log.i(TAG, "triggerScreenStatusChange from half screen to full screen");
            return;
        }
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener2 = this.f91167rt.u0().L1.f77366p;
        if (weAppHalfScreenStatusChangeListener2 != null && (resultReceiver = weAppHalfScreenStatusChangeListener2.f77397e) != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            k91.q3[] q3VarArr2 = k91.q3.f305733d;
            bundle2.putInt("action", 0);
            bundle2.putInt("status", 0);
            resultReceiver.send(0, bundle2);
        }
        if (z18) {
            if (this.f91167rt.C0() != null) {
                il1.d dVar2 = new il1.d();
                com.tencent.mm.plugin.appbrand.service.c0 C02 = this.f91167rt.C0();
                kotlin.jvm.internal.o.f(C02, "getService(...)");
                dVar2.x(C02, il1.e.f292031e);
            }
            com.tencent.mars.xlog.Log.i(TAG, "triggerScreenStatusChange from full screen to half screen");
        }
    }

    private final int tryMinusHeaderOuterIndicatorHeight(int i17, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        return i17 - getHeaderOuterIndicatorHeight(halfScreenConfig);
    }

    public void applyWindowConfig(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, com.tencent.mm.plugin.appbrand.widget.halfscreen.b reason) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i(TAG, "applyWindowConfig");
        configHalfScreenConfig(initConfig, reason);
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.f91167rt.H2;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = l0Var.f91198d;
        if (f0Var != null) {
            f0Var.b0(this.wxaHalfScreenEmptyAreaClickHandler);
        }
        l0Var.p();
    }

    @Override // xi1.s
    public xi1.m createFullscreenHandler(xi1.k kVar) {
        xi1.m createFullscreenHandler = this.baseWindow.createFullscreenHandler(kVar);
        kotlin.jvm.internal.o.f(createFullscreenHandler, "createFullscreenHandler(...)");
        return createFullscreenHandler;
    }

    @Override // xi1.s
    public boolean forceLightMode() {
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = this.f91167rt.u0().L1;
        return halfScreenConfig.f77361h & halfScreenConfig.c();
    }

    @Override // xi1.s
    public xi1.p getOrientationHandler() {
        if (this.shouldUseCenterPopStyle) {
            xi1.g windowAndroid = this.f91167rt.getWindowAndroid();
            kotlin.jvm.internal.o.f(windowAndroid, "getWindowAndroid(...)");
            return new zi1.b(windowAndroid);
        }
        xi1.p orientationHandler = this.baseWindow.getOrientationHandler();
        kotlin.jvm.internal.o.f(orientationHandler, "getOrientationHandler(...)");
        return orientationHandler;
    }

    @Override // xi1.s
    public float getScale() {
        return this.baseWindow.getScale();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((!r0.f77364n && r0.f77357d == -1) == false) goto L13;
     */
    @Override // xi1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xi1.f getStatusBar() {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.o6 r0 = r4.f91167rt
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.L1
            boolean r1 = r0.c()
            r2 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r0.f77364n
            r3 = 1
            if (r1 != 0) goto L1b
            int r0 = r0.f77357d
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
            r0.f454702a = r2
            r1 = 8
            r0.f454703b = r1
            goto L34
        L2e:
            xi1.g r0 = r4.baseWindow
            xi1.f r0 = r0.getStatusBar()
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.f.getStatusBar():xi1.f");
    }

    @Override // xi1.s
    public android.util.DisplayMetrics getVDisplayMetrics() {
        android.view.Display defaultDisplay;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        try {
            if (fp.h.c(30)) {
                android.app.Activity r07 = this.f91167rt.r0();
                kotlin.jvm.internal.o.d(r07);
                defaultDisplay = r07.getDisplay();
                if (defaultDisplay == null) {
                    defaultDisplay = defaultDisplay();
                }
            } else {
                defaultDisplay = defaultDisplay();
            }
        } catch (java.lang.Throwable unused) {
            defaultDisplay = defaultDisplay();
        }
        kotlin.jvm.internal.o.d(defaultDisplay);
        defaultDisplay.getRealMetrics(displayMetrics);
        if (this.f91167rt.u0().L1.c()) {
            displayMetrics.widthPixels = this.f91167rt.f74810s.getMeasuredWidth();
            displayMetrics.heightPixels = this.f91167rt.f74810s.getMeasuredHeight();
        }
        return displayMetrics;
    }

    @Override // xi1.s
    public boolean isLargeScreenWindow() {
        return this.baseWindow.isLargeScreenWindow();
    }

    @Override // ze.p
    public void onAppConfigGot(k91.r appConfig) {
        kotlin.jvm.internal.o.g(appConfig, "appConfig");
        ze.g gVar = this.centerInsideManager;
        if (gVar != null) {
            gVar.onAppConfigGot(appConfig);
        }
        com.tencent.mars.xlog.Log.i(TAG, "onAppConfigGot appId:" + this.f91167rt.f74803n + ", halfScreenEnable=" + this.f91167rt.u0().L1.c());
        android.app.Activity r07 = this.f91167rt.r0();
        kotlin.jvm.internal.o.d(r07);
        int i17 = r07.getResources().getConfiguration().orientation;
        boolean z17 = i17 != 1 && i17 == 2;
        xi1.g windowAndroid = this.f91167rt.getWindowAndroid();
        kotlin.jvm.internal.o.e(windowAndroid, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = this.f91167rt.u0().L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        ((xi1.i) windowAndroid).a(makeLayoutParams(halfScreenConfig, z17, false), this.f91167rt);
    }

    @Override // ze.p
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        com.tencent.mars.xlog.Log.i(TAG, "onConfigurationChanged  new[" + newConfig.orientation + "]  last[" + this.lastOrientation + ']');
        ze.g gVar = this.centerInsideManager;
        if (gVar != null) {
            gVar.onConfigurationChanged(newConfig);
        }
        if (newConfig.orientation == this.lastOrientation) {
            return;
        }
        if (this.f91167rt.Q0()) {
            int i17 = newConfig.orientation;
            boolean z17 = false;
            if (i17 != 1 && i17 == 2) {
                z17 = true;
            }
            xi1.g windowAndroid = this.f91167rt.getWindowAndroid();
            kotlin.jvm.internal.o.e(windowAndroid, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = this.f91167rt.u0().L1;
            kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
            ((xi1.i) windowAndroid).a(makeLayoutParams(halfScreenConfig, z17, true), this.f91167rt);
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig2 = this.f91167rt.u0().L1;
            kotlin.jvm.internal.o.f(halfScreenConfig2, "halfScreenConfig");
            configGesture(halfScreenConfig2);
        }
        this.lastOrientation = newConfig.orientation;
    }

    @Override // xi1.s
    public void setSoftOrientation(java.lang.String str) {
        this.baseWindow.setSoftOrientation(str);
    }

    @Override // xi1.s
    public boolean shouldInLargeScreenCompatMode() {
        return this.shouldUseCenterPopStyle;
    }

    @Override // ze.p
    public void init(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        ze.g gVar = this.centerInsideManager;
        if (gVar != null) {
            gVar.init(initConfig);
        }
        applyWindowConfig(initConfig, com.tencent.mm.plugin.appbrand.widget.halfscreen.b.f91153f);
    }

    @Override // ze.p
    public void onInitConfigUpdated(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig) {
        com.tencent.mm.plugin.appbrand.page.w2 currentPage;
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        com.tencent.mars.xlog.Log.i(TAG, "onInitConfigUpdated");
        com.tencent.mm.plugin.appbrand.widget.halfscreen.a aVar = Companion;
        android.content.Context context = this.baseWindow.getContext();
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = initConfig.L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        boolean a17 = aVar.a(context, halfScreenConfig);
        this.shouldUseCenterPopStyle = a17;
        if (a17) {
            ze.g gVar = this.centerInsideManager;
            if (gVar != null) {
                gVar.onInitConfigUpdated(initConfig);
            } else {
                ze.g centerInsideManagerFactory = centerInsideManagerFactory();
                this.centerInsideManager = centerInsideManagerFactory;
                kotlin.jvm.internal.o.d(centerInsideManagerFactory);
                centerInsideManagerFactory.init(initConfig);
                ze.g gVar2 = this.centerInsideManager;
                kotlin.jvm.internal.o.d(gVar2);
                k91.r m07 = this.f91167rt.m0();
                kotlin.jvm.internal.o.f(m07, "getAppConfig(...)");
                gVar2.onAppConfigGot(m07);
            }
        } else {
            this.centerInsideManager = null;
        }
        applyWindowConfig(initConfig, com.tencent.mm.plugin.appbrand.widget.halfscreen.b.f91152e);
        com.tencent.mm.plugin.appbrand.page.d5 x07 = this.f91167rt.x0();
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = (x07 == null || (currentPage = x07.getCurrentPage()) == null) ? null : currentPage.getCurrentPageView();
        if (currentPageView != null) {
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.f91167rt.H2;
            kotlin.jvm.internal.o.f(l0Var, "getHalfScreenManger(...)");
            l0Var.f91204j = false;
            l0Var.n();
            l0Var.v((com.tencent.mm.plugin.appbrand.page.n7) currentPageView, null);
        }
    }
}
