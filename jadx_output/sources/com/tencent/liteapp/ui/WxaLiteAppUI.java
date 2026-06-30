package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppUI extends com.tencent.liteapp.ui.WxaLiteAppBaseUI implements com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback {
    public static com.tencent.liteapp.gen.LiteAppReporter L1;
    public java.lang.String[] A1;
    public java.lang.String[] B1;
    public md.h H1;
    public com.tencent.liteapp.report.WxaLiteAppStartReport X;
    public android.os.Handler Z;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback f46105p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig f46106p1;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f46109s;

    /* renamed from: x1, reason: collision with root package name */
    public md.j f46116x1;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f46121z1;

    /* renamed from: q, reason: collision with root package name */
    public int f46107q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f46108r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f46110t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f46111u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f46112v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f46113w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f46114x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f46117y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f46120z = "";
    public java.lang.String A = "";
    public long B = 0;
    public long C = -1;
    public long D = -1;
    public float E = 1.0f;
    public int F = -1;
    public int G = 0;
    public int H = 0;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f46103J = 0;
    public boolean K = true;
    public java.lang.String L = "";
    public boolean M = true;
    public int N = -1;
    public int P = com.tencent.mm.R.anim.f477818cc;
    public int Q = -1;
    public int R = com.tencent.mm.R.anim.f477880e4;
    public boolean S = false;
    public boolean T = true;
    public boolean U = true;
    public boolean V = false;
    public boolean W = false;
    public boolean Y = false;

    /* renamed from: x0, reason: collision with root package name */
    public int f46115x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f46118y0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public int f46104l1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.ImageView f46119y1 = null;
    public android.widget.ImageView C1 = null;
    public android.graphics.Bitmap D1 = null;
    public boolean E1 = false;
    public boolean F1 = false;
    public boolean G1 = false;
    public final md.g I1 = new com.tencent.liteapp.ui.a1(this);
    public long J1 = -1;
    public final android.database.ContentObserver K1 = new com.tencent.liteapp.ui.s0(this, new android.os.Handler(android.os.Looper.getMainLooper()));

    public static void T6(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, java.lang.String str) {
        wxaLiteAppUI.getClass();
        try {
            if (com.tencent.mm.plugin.lite.LiteAppCenter.mCallback != null) {
                java.lang.String stringExtra = wxaLiteAppUI.getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", wxaLiteAppUI.f46114x);
                jSONObject.put("appUuid", java.lang.String.valueOf(wxaLiteAppUI.f46108r));
                jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, stringExtra);
                jSONObject.put("query", wxaLiteAppUI.f46117y);
                com.tencent.mm.plugin.lite.LiteAppCenter.mCallback.dataReporting(str, jSONObject.toString(), wxaLiteAppUI.f46114x);
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppUI", e17.toString(), new java.lang.Object[0]);
        }
    }

    public static void X6(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, int i17) {
        if (android.os.Build.VERSION.SDK_INT == 26) {
            wxaLiteAppUI.getClass();
            kd.c.e("WxaLiteApp.WxaLiteAppUI", "avoid setRequestedOrientation when Oreo", new java.lang.Object[0]);
            return;
        }
        wxaLiteAppUI.f46107q = i17;
        if (i17 == 0) {
            wxaLiteAppUI.setRequestedOrientation(1);
            return;
        }
        if (i17 == 1) {
            if (android.provider.Settings.System.getInt(wxaLiteAppUI.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                wxaLiteAppUI.setRequestedOrientation(10);
                return;
            } else {
                wxaLiteAppUI.setRequestedOrientation(1);
                return;
            }
        }
        if (i17 == 2) {
            wxaLiteAppUI.setRequestedOrientation(1);
        } else if (i17 == 3) {
            wxaLiteAppUI.setRequestedOrientation(6);
        }
    }

    public static void Y6(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI) {
        if (android.provider.Settings.System.getInt(wxaLiteAppUI.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            wxaLiteAppUI.setRequestedOrientation(10);
        } else {
            wxaLiteAppUI.setRequestedOrientation(1);
        }
    }

    private void Z6(com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (this.Y) {
            return;
        }
        this.Y = true;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            com.tencent.liteapp.report.WxaLiteAppStartReport.a(liteAppReporter, wxaLiteAppStartReport);
        }
        try {
            java.lang.String b17 = wxaLiteAppStartReport.b();
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "reportStartLiteApp %s", b17);
            com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback;
            if (iWxaLiteAppCallback != null) {
                iWxaLiteAppCallback.dataReporting("startLiteAppTimeLine", b17, this.f46114x);
            }
        } catch (java.lang.Exception e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppUI", e17.toString(), new java.lang.Object[0]);
        }
    }

    public static void a7(com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, java.lang.String str, boolean z17, java.util.HashMap hashMap) {
        if (liteAppReporter == null || hashMap == null) {
            return;
        }
        liteAppReporter.logPerf(str, z17, hashMap);
    }

    public static void b7(java.lang.String str, boolean z17) {
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = L1;
        if (liteAppReporter != null) {
            liteAppReporter.logPerf(str, z17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c7(boolean z17, boolean z18) {
        android.util.Size size;
        if (this.B == 0) {
            return;
        }
        android.graphics.Point c17 = es.u.c(this);
        android.graphics.Point b17 = es.u.b(this);
        android.content.Context context = zc.c.f471339b;
        if (context == null) {
            kotlin.jvm.internal.o.o("appContext");
            throw null;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i17 = b17.x;
        int i18 = b17.y;
        double d17 = i17;
        int i19 = c17.x;
        if (d17 > i19 * 1.7d) {
            i17 = i19;
        }
        int i27 = 0;
        if (isInMultiWindowMode()) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getSystemService("window");
            if (windowManager != null) {
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    int width = windowManager.getCurrentWindowMetrics().getBounds().width();
                    int height = windowManager.getCurrentWindowMetrics().getBounds().height();
                    if (width != 0 && height != 0) {
                        size = new android.util.Size(width, height);
                    }
                } else {
                    android.graphics.Point point = new android.graphics.Point();
                    windowManager.getDefaultDisplay().getRealSize(point);
                    size = (point.x == 0 || point.y == 0) ? new android.util.Size(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : new android.util.Size(point.x, point.y);
                }
                i17 = size.getWidth();
                i18 = size.getHeight();
                kd.c.c("WxaLiteApp.WxaLiteAppUI", "in MultiWindowMode", new java.lang.Object[0]);
            }
            size = new android.util.Size(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
            i17 = size.getWidth();
            i18 = size.getHeight();
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "in MultiWindowMode", new java.lang.Object[0]);
        }
        if (z17) {
            int height2 = this.f46109s.getHeight();
            if (height2 < i18 && this.U) {
                int b18 = md.n.b(this, this.F);
                this.F = b18;
                if (java.lang.Math.abs(b18 - (i18 - height2)) < 10) {
                    this.U = false;
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("activityId", getFlutterViewId());
                    hashMap.put("with", java.lang.Boolean.FALSE);
                    kx5.n.h().j(this.f46037o, "withNavigationBar", hashMap);
                }
            } else if (!this.U) {
                this.U = true;
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("activityId", getFlutterViewId());
                hashMap2.put("with", java.lang.Boolean.TRUE);
                kx5.n.h().j(this.f46037o, "withNavigationBar", hashMap2);
            }
        }
        float f17 = displayMetrics.density;
        this.F = com.tencent.mm.plugin.lite.LiteAppCenter.cacheNavigationBarHeight(this, this.F, this.f46108r);
        int e17 = md.n.e(this);
        boolean z19 = this.S;
        boolean z27 = getResources().getConfiguration().orientation == 2;
        this.S = z27;
        if (!z18 && z27 == z19 && i17 == this.G && i18 == this.H && e17 == this.f46103J && this.F == this.I) {
            return;
        }
        this.G = i17;
        this.H = i18;
        this.f46103J = e17;
        int i28 = this.F;
        this.I = i28;
        if (!z27 || b17.x <= b17.y * 1.2d) {
            int i29 = this.f46110t;
            com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(this.f46108r, 0.0f, i29 != 0 ? e17 / f17 : 0.0f, 0.0f, (i29 == 3 || i29 == 7) ? i28 / f17 : 0.0f, false);
            i27 = e17;
        } else {
            com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(this.f46108r, e17 / f17, 0.0f, i28 / f17, 0.0f, false);
            this.F = 0;
        }
        float f18 = 48;
        com.tencent.mm.plugin.lite.LiteAppCenter.setDisplayParams(this.f46108r, i17 / f17, i18 / f17, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, f18, i27 / f17, this.F / f17);
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "updateLvCppDisplayParams SetDisplayParams w=%d h=%d screen=%d,%d densityDpi=%d density=%f title=%f statusBar=%d navigationBar=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), java.lang.Float.valueOf(displayMetrics.density), java.lang.Float.valueOf(f18 * f17), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.F));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e7(int i17) {
        this.f46110t = i17;
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "setWindowFlags mFlags=%d mWindowFlags=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f46111u));
        if (this.f46111u > 0) {
            getWindow().clearFlags(this.f46111u);
            this.f46111u = -1;
        }
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() | 1024 | 512 | 256;
        if (i17 == 5) {
            systemUiVisibility |= 4100;
        } else if (i17 == 7) {
            systemUiVisibility |= 4102;
        }
        if (getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7() {
        if (this.f46109s != null) {
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "addOnGlobalLayoutListener activityId=%d", java.lang.Long.valueOf(this.D));
            this.f46109s.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.liteapp.ui.d1(this, new java.lang.ref.WeakReference(this)));
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI
    public android.view.View R6() {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "initView", new java.lang.Object[0]);
        android.view.View R6 = super.R6();
        this.f46109s = new md.f(this, R6);
        android.widget.ImageView imageView = new android.widget.ImageView(this);
        this.C1 = imageView;
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.C1.setVisibility(8);
        this.C1.setClickable(false);
        this.C1.setFocusable(false);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) R6;
        viewGroup.addView(this.C1, viewGroup.getChildCount());
        com.tencent.liteapp.ui.z0 z0Var = new com.tencent.liteapp.ui.z0(this);
        ox5.a aVar = this.f46032g;
        if (aVar != null) {
            aVar.f349800i = z0Var;
        }
        this.f46109s.addView(R6, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        return this.f46109s;
    }

    @Override // ox5.l
    public boolean b0(java.lang.Runnable runnable) {
        if (this.f46115x0 == 0) {
            return false;
        }
        return com.tencent.mm.plugin.lite.LiteAppCenter.keepAlive(this.f46114x + "_" + this.f46120z + "_" + this.f46117y, this.f46037o, this.f46108r, this.A, this.f46115x0, runnable, this.f46104l1);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void closeWindow(android.content.Intent intent) {
        new android.os.Handler(getMainLooper()).post(new com.tencent.liteapp.ui.x0(this, intent));
    }

    public void d7(int i17) {
        this.f46115x0 = i17;
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "setKeepAliveSeconds %d", java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void enterFullScreen() {
        this.f46112v = this.f46110t;
        e7(7);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void exitFullScreen() {
        e7(this.f46112v);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        int i17 = this.Q;
        if (i17 >= 0) {
            overridePendingTransition(this.R, i17);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getAppUuid() {
        return this.f46108r;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.content.Context getCurrentContext() {
        return this;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getDataUuid() {
        return this.J1;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.os.Bundle getExtraData() {
        if (getIntent().hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            return getIntent().getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        }
        return null;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF45967f() {
        return this.f46037o;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, mx5.b
    public java.lang.String getFlutterViewId() {
        kd.c.a("WxaLiteApp.WxaLiteAppUI", "getFlutterViewId %s", java.lang.Long.valueOf(this.D));
        return java.lang.String.valueOf(this.D);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, mx5.b
    public java.lang.String getFlutterViewName() {
        return java.lang.String.valueOf(this.C);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (this.f46036n == null) {
            super.getE();
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.Long.valueOf(this.f46036n.appUuid));
        hashMap.put("appId", this.f46036n.appId);
        hashMap.put("appPtr", java.lang.Long.valueOf(this.f46036n.appPtr));
        hashMap.put("pageViewId", java.lang.Long.valueOf(this.f46036n.pageId));
        hashMap.put("basePath", this.f46036n.basePath);
        hashMap.put("pageRenderPtr", java.lang.Long.valueOf(this.f46036n.renderId));
        hashMap.put("flags", java.lang.Integer.valueOf(this.f46036n.flags));
        hashMap.put(ya.b.SUCCESS, java.lang.Integer.valueOf(this.f46036n.success));
        hashMap.put("startTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return hashMap;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo getSystemInfo(int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo systemInfo = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback.getSystemInfo(this.F);
        systemInfo.appId = this.f46114x;
        systemInfo.isHalfScreen = false;
        return systemInfo;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    /* renamed from: getWxaLiteAppActivity */
    public android.app.Activity getF45975q() {
        return this;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean hasCutOut() {
        return es.u.d(this, false);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void hideKeyboard() {
        ((android.view.inputmethod.InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f46109s.getWindowToken(), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (es.u.g() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L17;
     */
    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isDarkMode() {
        /*
            r4 = this;
            r4.getResources()
            java.lang.Boolean r0 = es.u.f256279a
            r1 = 1
            if (r0 != 0) goto Lf
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r1)
            es.u.f256279a = r0
        Lf:
            java.lang.Boolean r0 = es.u.f256279a
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L35
            java.lang.Boolean r0 = es.u.f256284f
            if (r0 != 0) goto L20
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            es.u.f256284f = r0
        L20:
            java.lang.Boolean r0 = es.u.f256284f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2e
            boolean r0 = es.u.g()
            if (r0 == 0) goto L35
        L2e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 < r3) goto L35
            goto L36
        L35:
            r1 = r2
        L36:
            if (r1 != 0) goto L3f
            boolean r0 = es.u.f()
            if (r0 != 0) goto L3f
            goto L43
        L3f:
            boolean r2 = es.u.e()
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.ui.WxaLiteAppUI.isDarkMode():boolean");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void keyboardEnable(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void navigateBack(boolean z17) {
        new android.os.Handler(getMainLooper()).post(new com.tencent.liteapp.ui.h1(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckBaseLibSumFail(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppUI", "Check BaseLib Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckSumFail(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppUI", "Check Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean isDarkMode = isDarkMode();
        if (isDarkMode != this.f46113w) {
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "DarkMode change %b", java.lang.Boolean.valueOf(isDarkMode));
            this.f46113w = isDarkMode;
            com.tencent.mm.plugin.lite.LiteAppCenter.updateDarkMode(isDarkMode);
        }
        int i17 = configuration.orientation;
        if (i17 == 2 && !this.S) {
            this.S = true;
            S6();
            int i18 = this.f46110t;
            if (i18 == 5 || i18 == 7) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 4100);
            return;
        }
        if (i17 == 1 && this.S) {
            this.S = false;
            S6();
            int i19 = this.f46110t;
            if (i19 == 5 || i19 == 7) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-4101));
            return;
        }
        float f17 = configuration.fontScale;
        if (f17 == this.E || !com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem) {
            return;
        }
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "fontScale change %b", java.lang.Float.valueOf(f17));
        float f18 = configuration.fontScale;
        this.E = f18;
        com.tencent.mm.plugin.lite.LiteAppCenter.updateFontScale(f18);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e9  */
    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r40) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.ui.WxaLiteAppUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCreateLitePageViewFinish(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        int parseInt;
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "onCreateLitePageViewFinish appUuid: " + this.f46108r, new java.lang.Object[0]);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.X;
        if (wxaLiteAppStartReport != null && wxaLiteAppStartReport.I != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appUuid", java.lang.String.valueOf(this.f46108r));
            hashMap.put("pageId", java.lang.String.valueOf(pageInfo.pageId));
            hashMap.put(ya.b.SUCCESS, java.lang.String.valueOf(pageInfo.success));
            hashMap.put("isPreload", java.lang.String.valueOf(pageInfo.isPreload));
            a7(this.X.I, "Android.UI.showView->onCreateLitePageViewFinish", false, hashMap);
        }
        this.f46036n = pageInfo;
        this.Z.removeMessages(1);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2 = this.X;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport3 = this.X;
        wxaLiteAppStartReport2.E = currentTimeMillis - wxaLiteAppStartReport3.D;
        wxaLiteAppStartReport3.C = pageInfo.success;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport4 = this.X;
        wxaLiteAppStartReport3.F = currentTimeMillis2 - wxaLiteAppStartReport4.f46002i;
        wxaLiteAppStartReport4.f46016z = pageInfo.isPreload;
        if (wxaLiteAppStartReport4.G != 0) {
            Z6(wxaLiteAppStartReport4);
        }
        java.util.Map e17 = getE();
        if (e17 != null) {
            java.util.HashMap hashMap2 = (java.util.HashMap) e17;
            if (hashMap2.containsKey("appId")) {
                java.lang.String valueOf = java.lang.String.valueOf(hashMap2.get("appId"));
                if (!android.text.TextUtils.isEmpty(valueOf) && !valueOf.equals("null")) {
                    this.f46114x = valueOf;
                }
            }
            if (hashMap2.containsKey("appPtr")) {
                this.B = java.lang.Long.valueOf(hashMap2.get("appPtr").toString()).longValue();
            }
            if (hashMap2.containsKey("pageViewId")) {
                this.C = java.lang.Long.valueOf(hashMap2.get("pageViewId").toString()).longValue();
            }
            if (hashMap2.containsKey("activityId")) {
                this.D = java.lang.Long.valueOf(hashMap2.get("activityId").toString()).longValue();
            }
            if (hashMap2.containsKey("pageRenderPtr")) {
                java.lang.Long.valueOf(hashMap2.get("pageRenderPtr").toString()).longValue();
            }
            if (hashMap2.containsKey(ya.b.SUCCESS)) {
                java.lang.Long.valueOf(hashMap2.get(ya.b.SUCCESS).toString()).longValue();
            }
        }
        if (e17 != null) {
            java.util.HashMap hashMap3 = (java.util.HashMap) e17;
            if (hashMap3.containsKey("flags")) {
                try {
                    parseInt = java.lang.Integer.parseInt(hashMap3.get("flags").toString());
                } catch (java.lang.Exception unused) {
                }
                this.f46110t = parseInt;
            }
            parseInt = -1;
            this.f46110t = parseInt;
        }
        setFlags(pageInfo.flags);
        c7(false, false);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        md.g gVar;
        md.h hVar = this.H1;
        if (hVar != null && (gVar = this.I1) != null) {
            hVar.f325694f.remove(gVar);
        }
        android.os.Handler handler = this.Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetUICallback(this.f46108r, this.f46105p0);
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetReporter(this.f46108r);
        if (this.f46114x != null) {
            ld.d.f318046b.a().c(this.f46114x);
        }
        android.widget.ImageView imageView = this.C1;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        android.graphics.Bitmap bitmap = this.D1;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.D1.recycle();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        if (this.f46115x0 > 0 && isFinishing()) {
            com.tencent.mm.plugin.lite.LiteAppCenter.willPopApp(this.f46114x, this.f46108r, true);
        }
        S6();
        super.onPause();
        if (this.V) {
            getWindow().clearFlags(128);
        }
        md.j jVar = this.f46116x1;
        if (jVar != null) {
            jVar.f325700e.disable();
            jVar.f325699d = null;
            this.f46116x1 = null;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.unRegisterAudioBroadCaseReceiver(this);
        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.tencent.liteapp.ui.WxaLiteAppUI$$a
            /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:7:0x0013, B:9:0x0018, B:11:0x001c, B:13:0x0024, B:15:0x002a, B:17:0x003b, B:19:0x003f, B:21:0x0045, B:22:0x0051), top: B:6:0x0013 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 247
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.ui.WxaLiteAppUI$$a.run():void");
            }
        }, 60);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        S6();
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "TimeRecord startLiteApp %s %d", this.f46114x, java.lang.Long.valueOf(px5.b.f358957a.a("startLiteApp" + this.f46114x)));
        super.onResume();
        if (this.V) {
            getWindow().addFlags(128);
        }
        new android.os.Handler().postDelayed(new com.tencent.liteapp.ui.WxaLiteAppUI$$b(this), 200);
        if (this.f46116x1 == null) {
            this.f46116x1 = new md.j(getCurrentContext(), 2);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.registerAudioBroadCaseReceiver(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        java.lang.String str = this.f46117y;
        if (str != null && str.length() <= 307200) {
            bundle.putString("queryParam", this.f46117y);
        }
        if (!this.L.isEmpty() && this.L.length() <= 307200) {
            bundle.putString("referrerInfo", this.L);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str2 = this.f46117y;
        objArr[0] = str2;
        objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
        objArr[2] = bundle.toString();
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "onSaveInstanceState query:%s len:%d bundle:%s", objArr);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onShowPageTimeStamp(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.PageShowInfo pageShowInfo) {
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.X;
        if (wxaLiteAppStartReport != null && wxaLiteAppStartReport.I != null && pageShowInfo != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appUuid", java.lang.String.valueOf(this.f46108r));
            hashMap.put("pageId", java.lang.String.valueOf(j17));
            hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.String.valueOf(pageShowInfo.timestamp));
            hashMap.put("codeCacheSwitch", java.lang.String.valueOf(pageShowInfo.codeCacheSwitch));
            hashMap.put("codeCacheResult", java.lang.String.valueOf(pageShowInfo.codeCacheResult));
            hashMap.put("compilePageCost", java.lang.String.valueOf(pageShowInfo.compilePageCost));
            hashMap.put("evalPageCost", java.lang.String.valueOf(pageShowInfo.evalPageCost));
            hashMap.put("evalBaseLibCost", java.lang.String.valueOf(pageShowInfo.evalBaseLibCost));
            hashMap.put("hitSnapshotSwitch", java.lang.String.valueOf(pageShowInfo.hitSnapshotSwitch));
            hashMap.put("snapshotRuntimeType", java.lang.String.valueOf(pageShowInfo.snapshotRuntimeType));
            if (!this.F1) {
                this.F1 = true;
                a7(this.X.I, "Android.UI.showView->onShowPageTimeStamp", false, hashMap);
            }
            if (!this.G1) {
                this.G1 = true;
                a7(this.X.I, "Android.Startup.ToOnShowPageTimeStamp", false, hashMap);
            }
        }
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2 = this.X;
        if (wxaLiteAppStartReport2 != null) {
            wxaLiteAppStartReport2.H = pageShowInfo;
            wxaLiteAppStartReport2.G = pageShowInfo.timestamp - wxaLiteAppStartReport2.f46002i;
            if (wxaLiteAppStartReport2.F != 0) {
                Z6(wxaLiteAppStartReport2);
            }
        } else {
            kd.c.e("WxaLiteApp.WxaLiteAppUI", "onShowPageTimeStamp reportStartLiteApp fail. report is null.", new java.lang.Object[0]);
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.liteapp.ui.y0(this), 1000L);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), false, this.K1);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getContentResolver().unregisterContentObserver(this.K1);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            e7(this.f46110t);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openApp() {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "openApp appUuid: " + this.f46108r, new java.lang.Object[0]);
        this.Z.removeMessages(2);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openWebView(java.util.Map map) {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "openWebView", new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void releaseKeepAlive() {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "releaseKeepAlive", new java.lang.Object[0]);
        this.f46115x0 = 0;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void removeBackgroundImage() {
        android.widget.ImageView imageView;
        if (this.f46106p1.backgroundImage == null || (imageView = this.f46119y1) == null) {
            return;
        }
        ((android.view.ViewGroup) imageView.getParent()).removeView(this.f46119y1);
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "remove backgroundImage " + this.f46119y1, new java.lang.Object[0]);
        this.f46119y1 = null;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void rightGestureEvent(java.lang.String str, boolean z17) {
        java.lang.String str2 = z17 ? "gesture" : "backpress";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, str2);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(this.f46108r, java.lang.Integer.parseInt(str), "app.rightGesture", jSONObject);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setFlags(int i17) {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "setFlags %d old=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f46110t));
        if (this.f46110t == i17) {
            return;
        }
        runOnUiThread(new com.tencent.liteapp.ui.e1(this, i17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setForbidRightGestureEnable(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(this.D));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        new android.os.Handler(getMainLooper()).post(new com.tencent.liteapp.ui.i1(this, hashMap));
        this.W = z17;
        this.f64958d.setForceDisEnable(z17);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setIsPopGestureEnabled(boolean z17) {
        this.K = !z17;
        this.f64958d.setEnableGesture(!z17);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setKeepScreenOn(boolean z17) {
        runOnUiThread(new com.tencent.liteapp.ui.v0(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setPageOrientation(int i17) {
        runOnUiThread(new com.tencent.liteapp.ui.f1(this, i17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setScreenshotEnabled(boolean z17) {
        runOnUiThread(new com.tencent.liteapp.ui.w0(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setStatusBarHidden(boolean z17) {
        int i17 = this.f46110t;
        if (i17 == 5 || i17 == 7) {
            return;
        }
        int i18 = z17 ? 5892 : 1792;
        if (getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        runOnUiThread(new com.tencent.liteapp.ui.r0(this, i18));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void showPage(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        this.f46036n = pageInfo;
        this.C = pageInfo.pageId;
        runOnUiThread(new com.tencent.liteapp.ui.g1(this, pageInfo));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateLong(long j17) {
        runOnUiThread(new com.tencent.liteapp.ui.t0(this, j17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateShort(long j17, int i17) {
        runOnUiThread(new com.tencent.liteapp.ui.u0(this, j17, i17));
    }
}
