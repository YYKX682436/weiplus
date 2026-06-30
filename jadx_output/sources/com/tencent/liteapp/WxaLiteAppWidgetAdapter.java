package com.tencent.liteapp;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0095\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/tencent/liteapp/WxaLiteAppWidgetAdapter;", "Lmx5/b;", "Lcom/tencent/mm/plugin/lite/LiteAppCenter$ILiteAppUICallback;", "Lcom/tencent/liteapp/ui/f;", "Landroidx/lifecycle/v;", "", "appUuid", "engineId", "pluginHash", "", "appId", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, "query", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "signatureKey", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetFlutterPluginApi;", "pluginApi", "Landroid/content/Context;", "applicationContext", "Lio/flutter/embedding/engine/FlutterEngine;", "flutterEngine", "Landroid/app/Activity;", "flutterActivity", "", "flutterLifecycle", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/liteapp/report/WxaLiteAppStartReport;", "startReport", "Lio/flutter/embedding/engine/plugins/PluginRegistry;", "pluginRegistry", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetFlutterPluginApi;Landroid/content/Context;Lio/flutter/embedding/engine/FlutterEngine;Landroid/app/Activity;Ljava/lang/Object;Lio/flutter/plugin/common/BinaryMessenger;Lcom/tencent/liteapp/report/WxaLiteAppStartReport;Lio/flutter/embedding/engine/plugins/PluginRegistry;)V", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class WxaLiteAppWidgetAdapter implements mx5.b, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback, com.tencent.liteapp.ui.f, androidx.lifecycle.v {
    public boolean A;
    public float B;
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo C;
    public boolean D;
    public final java.util.Map E;
    public int F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f45964J;
    public int K;
    public int L;
    public int M;
    public md.j N;
    public android.widget.ImageView P;
    public final zc.l Q;

    /* renamed from: d, reason: collision with root package name */
    public final int f45965d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45966e;

    /* renamed from: f, reason: collision with root package name */
    public final int f45967f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f45968g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f45969h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f45970i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f45971m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f45972n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f45973o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi f45974p;

    /* renamed from: q, reason: collision with root package name */
    public final android.app.Activity f45975q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Object f45976r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f45977s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.liteapp.report.WxaLiteAppStartReport f45978t;

    /* renamed from: u, reason: collision with root package name */
    public final io.flutter.embedding.engine.plugins.PluginRegistry f45979u;

    /* renamed from: v, reason: collision with root package name */
    public int f45980v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.liteapp.ui.i f45981w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig f45982x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback f45983y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f45984z;

    public WxaLiteAppWidgetAdapter(int i17, int i18, int i19, java.lang.String appId, java.lang.String page, java.lang.String query, java.lang.String sessionId, java.lang.String path, java.lang.String signatureKey, com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi pluginApi, android.content.Context applicationContext, io.flutter.embedding.engine.FlutterEngine flutterEngine, android.app.Activity flutterActivity, java.lang.Object flutterLifecycle, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.liteapp.report.WxaLiteAppStartReport startReport, io.flutter.embedding.engine.plugins.PluginRegistry pluginRegistry) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(signatureKey, "signatureKey");
        kotlin.jvm.internal.o.g(pluginApi, "pluginApi");
        kotlin.jvm.internal.o.g(applicationContext, "applicationContext");
        kotlin.jvm.internal.o.g(flutterEngine, "flutterEngine");
        kotlin.jvm.internal.o.g(flutterActivity, "flutterActivity");
        kotlin.jvm.internal.o.g(flutterLifecycle, "flutterLifecycle");
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        kotlin.jvm.internal.o.g(startReport, "startReport");
        kotlin.jvm.internal.o.g(pluginRegistry, "pluginRegistry");
        this.f45965d = i17;
        this.f45966e = i18;
        this.f45967f = i19;
        this.f45968g = appId;
        this.f45969h = page;
        this.f45970i = query;
        this.f45971m = sessionId;
        this.f45972n = path;
        this.f45973o = signatureKey;
        this.f45974p = pluginApi;
        this.f45975q = flutterActivity;
        this.f45976r = flutterLifecycle;
        this.f45977s = binaryMessenger;
        this.f45978t = startReport;
        this.f45979u = pluginRegistry;
        startReport.f45997d = appId;
        startReport.f46002i = java.lang.System.currentTimeMillis();
        startReport.f45999f = page;
        startReport.f45998e = this.f45970i;
        this.B = 1.0f;
        this.E = new java.util.LinkedHashMap();
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.Q = new zc.l(this, new android.os.Handler(android.os.Looper.getMainLooper()));
    }

    public final void a() {
        kx5.n h17 = kx5.n.h();
        h17.f313316f.remove(getFlutterViewId());
        mx5.b bVar = h17.f313315e;
        if (bVar != null && bVar == this) {
            h17.f313315e = null;
        }
        zc.x c17 = c();
        java.lang.String appId = this.f45968g;
        if (c17 != null) {
            kotlin.jvm.internal.o.g(appId, "appId");
            ((com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity) c17).f137318s = null;
        }
        md.j jVar = this.N;
        if (jVar != null) {
            jVar.f325700e.disable();
            jVar.f325699d = null;
            this.N = null;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.unRegisterAudioBroadCaseReceiver(this.f45975q);
        java.lang.Object obj = this.f45976r;
        if (obj instanceof io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference) {
            ((io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference) obj).getLifecycle().c(this);
        }
        long j17 = this.f45965d;
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetUICallback(j17, this.f45983y);
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetReporter(j17);
        ld.d.f318046b.a().c(appId);
    }

    public final android.util.Size b() {
        android.app.Activity activity = this.f45975q;
        android.view.WindowManager windowManager = (android.view.WindowManager) activity.getSystemService("window");
        if (windowManager != null) {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                android.graphics.Point point = new android.graphics.Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                new android.util.Size(point.x, point.y);
                return (point.x == 0 || point.y == 0) ? new android.util.Size(activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels) : new android.util.Size(point.x, point.y);
            }
            int width = windowManager.getCurrentWindowMetrics().getBounds().width();
            int height = windowManager.getCurrentWindowMetrics().getBounds().height();
            if (width != 0 && height != 0) {
                return new android.util.Size(width, height);
            }
        }
        return new android.util.Size(activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels);
    }

    public final zc.x c() {
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f45975q;
        if (componentCallbacks2 instanceof zc.x) {
            return (zc.x) componentCallbacks2;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void closeWindow(android.content.Intent intent) {
        this.f45975q.runOnUiThread(new zc.f(intent, this));
    }

    public final void d(com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (this.D) {
            return;
        }
        this.D = true;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            com.tencent.liteapp.report.WxaLiteAppStartReport.a(liteAppReporter, wxaLiteAppStartReport);
        }
        try {
            java.lang.String b17 = wxaLiteAppStartReport.b();
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "reportStartLiteApp %s", b17);
            com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback;
            if (iWxaLiteAppCallback != null) {
                iWxaLiteAppCallback.dataReporting("startLiteAppTimeLine", b17, wxaLiteAppStartReport.f45997d);
            }
        } catch (java.lang.Exception e17) {
            kd.c.b("LiteApp.WxaLiteAppWidgetAdapter", e17.toString(), new java.lang.Object[0]);
        }
    }

    public final void e() {
        android.app.Activity activity = this.f45975q;
        com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppViewportMetrics viewportMetrics = com.tencent.mm.plugin.lite.LiteAppCenter.getViewportMetrics(activity);
        if (viewportMetrics == null) {
            android.graphics.Point c17 = es.u.c(activity);
            android.graphics.Point b17 = es.u.b(activity);
            android.util.DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            int b18 = md.n.b(activity, this.L);
            int e17 = md.n.e(activity);
            com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppViewportMetrics liteAppViewportMetrics = new com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppViewportMetrics();
            liteAppViewportMetrics.width = c17.x;
            liteAppViewportMetrics.height = c17.y;
            liteAppViewportMetrics.deviceWidth = b17.x;
            liteAppViewportMetrics.deviceHeight = b17.y;
            liteAppViewportMetrics.statusBarHeight = e17;
            liteAppViewportMetrics.actionBarHeight = 48;
            liteAppViewportMetrics.navigationBarHeight = b18;
            liteAppViewportMetrics.densityDpi = displayMetrics.densityDpi;
            liteAppViewportMetrics.density = displayMetrics.density;
            liteAppViewportMetrics.inMultiWindowMode = activity.isInMultiWindowMode();
            liteAppViewportMetrics.multiWindowWidth = b().getWidth();
            liteAppViewportMetrics.multiWindowHeight = b().getHeight();
            viewportMetrics = liteAppViewportMetrics;
        }
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "setDisplayParams viewportMetrics " + viewportMetrics, new java.lang.Object[0]);
        int i17 = viewportMetrics.deviceWidth;
        int i18 = viewportMetrics.deviceHeight;
        double d17 = i17;
        int i19 = viewportMetrics.width;
        if (d17 > i19 * 1.7d) {
            i17 = i19;
        }
        if (viewportMetrics.inMultiWindowMode) {
            i17 = viewportMetrics.multiWindowWidth;
            i18 = viewportMetrics.multiWindowHeight;
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "in MultiWindowMode", new java.lang.Object[0]);
        }
        int i27 = viewportMetrics.navigationBarHeight;
        int i28 = viewportMetrics.statusBarHeight;
        boolean z17 = this.f45984z;
        boolean z18 = activity.getResources().getConfiguration().orientation == 2;
        this.f45984z = z18;
        if (z18 == z17 && i17 == this.f45964J && i18 == this.K && i28 == this.M && i27 == this.L) {
            return;
        }
        this.f45964J = i17;
        this.K = i18;
        this.M = i28;
        this.L = i27;
        int i29 = this.f45965d;
        if (!z18 || viewportMetrics.width <= viewportMetrics.height * 1.2d) {
            int i37 = this.F;
            com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(i29, 0.0f, i37 != 0 ? i28 / viewportMetrics.density : 0.0f, 0.0f, (i37 == 3 || i37 == 4) ? i27 / viewportMetrics.density : 0.0f, false);
        } else {
            float f17 = i28;
            float f18 = viewportMetrics.density;
            com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(i29, f17 / f18, 0.0f, i27 / f18, 0.0f, false);
            i27 = 0;
            i28 = 0;
        }
        float f19 = i28;
        float f27 = viewportMetrics.density;
        float f28 = i27;
        com.tencent.mm.plugin.lite.LiteAppCenter.setSystemBarHeight(i29, f19 / f27, f28 / f27, false);
        float f29 = viewportMetrics.density;
        com.tencent.mm.plugin.lite.LiteAppCenter.setDisplayParams(i29, i17 / f29, i18 / f29, viewportMetrics.deviceWidth / f29, viewportMetrics.deviceHeight / f29, viewportMetrics.densityDpi, f29, viewportMetrics.actionBarHeight / f29, f19 / f29, f28 / f29);
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "updateLvCppDisplayParams SetDisplayParams w=" + i17 + " h=" + i18 + " screen=" + viewportMetrics.deviceWidth + ',' + viewportMetrics.deviceHeight + " densityDpi=" + viewportMetrics.densityDpi + " density=" + viewportMetrics.density + " title=" + viewportMetrics.actionBarHeight + " statusBar=" + i28 + " navigationBar=" + i27, new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void enterFullScreen() {
        this.H = this.F;
        f(4);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void exitFullScreen() {
        f(this.H);
    }

    public final void f(int i17) {
        android.view.Window window;
        android.view.View decorView;
        android.view.View decorView2;
        this.F = i17;
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "setWindowFlags mFlags=" + this.F + " mWindowFlags=" + this.G, new java.lang.Object[0]);
        int i18 = this.G;
        android.app.Activity activity = this.f45975q;
        if (i18 > 0) {
            android.view.Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.clearFlags(this.G);
            }
            this.G = -1;
        }
        android.view.Window window3 = activity.getWindow();
        int systemUiVisibility = (window3 == null || (decorView2 = window3.getDecorView()) == null) ? 1792 : decorView2.getSystemUiVisibility();
        if (i17 == 2) {
            systemUiVisibility |= 4100;
        } else if (i17 == 4) {
            systemUiVisibility |= 4102;
        }
        if (activity.getWindow() != null) {
            android.view.Window window4 = activity.getWindow();
            if ((window4 != null ? window4.getDecorView() : null) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.setSystemUiVisibility(systemUiVisibility);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getAppUuid() {
        return this.f45965d;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.content.Context getCurrentContext() {
        return this.f45975q;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getDataUuid() {
        return 0L;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.os.Bundle getExtraData() {
        return new android.os.Bundle();
    }

    @Override // mx5.b
    /* renamed from: getFlutterEngineId, reason: from getter */
    public int getF45967f() {
        return this.f45967f;
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewId() {
        return java.lang.String.valueOf(this.f45965d);
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewName() {
        return java.lang.String.valueOf(this.C);
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewParams, reason: from getter */
    public java.util.Map getE() {
        return this.E;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo getSystemInfo(int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo systemInfo = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback.getSystemInfo(i17);
        systemInfo.appId = this.f45968g;
        systemInfo.isHalfScreen = false;
        return systemInfo;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    /* renamed from: getWxaLiteAppActivity, reason: from getter */
    public android.app.Activity getF45975q() {
        return this.f45975q;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean hasCutOut() {
        return es.u.d(this.f45975q, false);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void hideKeyboard() {
        android.view.View currentFocus;
        android.app.Activity activity = this.f45975q;
        java.lang.Object systemService = activity.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean isDarkMode() {
        return com.tencent.mm.plugin.lite.LiteAppCenter.isCurrentDarkMode();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void keyboardEnable(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void navigateBack(boolean z17) {
        this.f45975q.runOnUiThread(new zc.j(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckBaseLibSumFail(java.lang.String str, java.util.List list) {
        if (c() != null) {
            kotlin.jvm.internal.o.d(str);
            com.tencent.liteapp.gen.LiteAppReporter reporter = this.f45978t.I;
            kotlin.jvm.internal.o.f(reporter, "reporter");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.logic.g1.s().B(reporter);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckSumFail(java.lang.String str, java.util.List list) {
        if (c() != null) {
            kotlin.jvm.internal.o.d(str);
            com.tencent.liteapp.gen.LiteAppReporter reporter = this.f45978t.I;
            kotlin.jvm.internal.o.f(reporter, "reporter");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.logic.g1.s().C(str, reporter);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCreateLitePageViewFinish(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "onCreateLitePageViewFinish appUuid: " + this.f45965d, new java.lang.Object[0]);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f45978t;
        wxaLiteAppStartReport.E = currentTimeMillis - wxaLiteAppStartReport.D;
        kotlin.jvm.internal.o.d(pageInfo);
        wxaLiteAppStartReport.C = pageInfo.success;
        wxaLiteAppStartReport.F = java.lang.System.currentTimeMillis() - wxaLiteAppStartReport.f46002i;
        wxaLiteAppStartReport.f46016z = pageInfo.isPreload;
        if (wxaLiteAppStartReport.G != 0) {
            d(wxaLiteAppStartReport);
        }
        this.C = pageInfo;
        java.util.Map map = this.E;
        map.put("activityId", java.lang.Long.valueOf(pageInfo.appUuid));
        map.put("appId", pageInfo.appId);
        map.put("appPtr", java.lang.Long.valueOf(pageInfo.appPtr));
        map.put("pageViewId", java.lang.Long.valueOf(pageInfo.pageId));
        map.put("basePath", pageInfo.basePath);
        map.put("pageRenderPtr", java.lang.Long.valueOf(pageInfo.renderId));
        map.put("flags", java.lang.Integer.valueOf(pageInfo.flags));
        map.put(ya.b.SUCCESS, java.lang.Integer.valueOf(pageInfo.success));
        map.put("pageOrientation", java.lang.Integer.valueOf(pageInfo.pageOrientation));
        map.put("startTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        int i17 = pageInfo.flags;
        int i18 = pageInfo.pageOrientation;
        setFlags(i17);
        setPageOrientation(i18);
        e();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onShowPageTimeStamp(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.PageShowInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        long j18 = info.timestamp;
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f45978t;
        wxaLiteAppStartReport.G = j18 - wxaLiteAppStartReport.f46002i;
        if (wxaLiteAppStartReport.F != 0) {
            d(wxaLiteAppStartReport);
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new zc.k(this), 1000L);
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "onStateChanged source: " + source + ", event: " + event.name(), new java.lang.Object[0]);
        int i17 = zc.d.f471341a[event.ordinal()];
        if (i17 != 2) {
            if (i17 == 3) {
                com.tencent.liteapp.ui.i iVar = this.f45981w;
                if (iVar != null) {
                    iVar.c();
                }
                if (!this.I || (window3 = this.f45975q.getWindow()) == null) {
                    return;
                }
                window3.clearFlags(128);
                return;
            }
            if (i17 == 4) {
                com.tencent.liteapp.ui.i iVar2 = this.f45981w;
                if (iVar2 != null) {
                    iVar2.c();
                    return;
                }
                return;
            }
            if (i17 == 5) {
                this.f45975q.getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), false, this.Q);
                return;
            } else {
                if (i17 != 6) {
                    return;
                }
                this.f45975q.getContentResolver().unregisterContentObserver(this.Q);
                return;
            }
        }
        com.tencent.liteapp.ui.i iVar3 = this.f45981w;
        if (iVar3 != null) {
            if (iVar3.f46174g == null) {
                kd.c.e("LiteApp.KeyboardHeightProvider", "start: activity is null", new java.lang.Object[0]);
            } else {
                if ((iVar3.f46174g.getWindow().getAttributes().softInputMode & 240) != 48) {
                    kd.c.e("LiteApp.KeyboardHeightProvider", "start: activity soft input should be adjust nothing", new java.lang.Object[0]);
                    iVar3.f46178k = false;
                } else {
                    iVar3.f46178k = true;
                }
                if (iVar3.f46173f == null) {
                    iVar3.f46173f = iVar3.f46174g.findViewById(android.R.id.content);
                }
                kd.c.c("LiteApp.KeyboardHeightProvider", "start: version:%s", 31);
                int i18 = android.os.Build.VERSION.SDK_INT;
                if (i18 >= 31) {
                    if (i18 >= 30) {
                        java.util.Set set = com.tencent.liteapp.ui.e.f46147a;
                        android.app.Activity activity = iVar3.f46174g;
                        if (activity == null) {
                            kd.c.b("LiteApp.KeyBoardHeightProviderUtil", "register: NPE", new java.lang.Object[0]);
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("register: activity:");
                            sb6.append(activity);
                            sb6.append(" , observer: ");
                            sb6.append(iVar3);
                            sb6.append(" , hasWindowFocus: ");
                            sb6.append(activity.hasWindowFocus());
                            sb6.append("  isFinishing:");
                            sb6.append(activity.isFinishing());
                            sb6.append(" decorView:");
                            android.view.Window window4 = activity.getWindow();
                            sb6.append(window4 != null ? window4.getDecorView() : null);
                            sb6.append(" observer.getActivity:");
                            sb6.append(iVar3.a());
                            kd.c.c("LiteApp.KeyBoardHeightProviderUtil", sb6.toString(), new java.lang.Object[0]);
                            com.tencent.liteapp.ui.e.f46147a.add(iVar3);
                            android.app.Activity a17 = iVar3.a();
                            if (a17 == null || (window2 = a17.getWindow()) == null) {
                                kd.c.b("LiteApp.KeyBoardHeightProviderUtil", "setOnApplyWindowInsetsListener fail", new java.lang.Object[0]);
                            } else {
                                android.view.View decorView = window2.getDecorView();
                                kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
                                decorView.post(new com.tencent.liteapp.ui.c(window2, activity));
                            }
                        }
                    }
                } else if (iVar3.f46173f != null) {
                    kd.c.c("LiteApp.KeyboardHeightProvider", "start: %s, %s", java.lang.Boolean.valueOf(iVar3.f46177j), iVar3.f46173f.getWindowToken());
                    if (!iVar3.f46177j && iVar3.f46173f.getWindowToken() != null && !iVar3.f46174g.isFinishing()) {
                        iVar3.f46177j = true;
                        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(iVar3.f46174g);
                        iVar3.f46170c = linearLayout;
                        linearLayout.setBackgroundColor(0);
                        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(1003, 131096, 1);
                        layoutParams.width = 0;
                        layoutParams.height = -1;
                        layoutParams.gravity = 8388659;
                        layoutParams.softInputMode = 16;
                        layoutParams.setTitle("KeyboardWindow@" + iVar3.hashCode());
                        try {
                            iVar3.f46174g.getWindowManager().addView(iVar3.f46170c, layoutParams);
                        } catch (java.lang.Exception e17) {
                            kd.c.b("LiteApp.KeyboardHeightProvider", e17.toString(), new java.lang.Object[0]);
                            iVar3.f46177j = false;
                            iVar3.f46170c = null;
                        }
                        if (iVar3.f46177j) {
                            iVar3.f46170c.getViewTreeObserver().addOnGlobalLayoutListener(iVar3.f46175h);
                            iVar3.f46173f.getViewTreeObserver().addOnGlobalLayoutListener(iVar3.f46176i);
                        }
                        iVar3.f46179l = 0;
                        iVar3.f46180m = 0;
                        if ((iVar3.f46174g.getWindow().getAttributes().softInputMode & 240) != 48) {
                            kd.c.e("LiteApp.KeyboardHeightProvider", "start: activity soft input should be adjust nothing", new java.lang.Object[0]);
                            iVar3.f46178k = false;
                        } else {
                            iVar3.f46178k = true;
                        }
                    }
                }
            }
        }
        if (!this.I || (window = this.f45975q.getWindow()) == null) {
            return;
        }
        window.addFlags(128);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openApp() {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openWebView(java.util.Map map) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void removeBackgroundImage() {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig pageConfig = this.f45982x;
        kotlin.jvm.internal.o.d(pageConfig);
        if (pageConfig.backgroundImage == null || (imageView = this.P) == null) {
            return;
        }
        kotlin.jvm.internal.o.d(imageView);
        android.view.ViewParent parent = imageView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) parent).removeView(this.P);
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "remove backgroundImage " + this.P, new java.lang.Object[0]);
        this.P = null;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void rightGestureEvent(java.lang.String str, boolean z17) {
        java.lang.String str2 = z17 ? "gesture" : "backpress";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, str2);
        } catch (org.json.JSONException unused) {
        }
        long j17 = this.f45965d;
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(j17, java.lang.Long.parseLong(str), "app.rightGesture", jSONObject);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setFlags(int i17) {
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "setFlags " + i17 + " old=" + this.F, new java.lang.Object[0]);
        if (this.F == i17) {
            return;
        }
        this.f45975q.runOnUiThread(new zc.m(this, i17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setForbidRightGestureEnable(boolean z17) {
        this.f45975q.runOnUiThread(new zc.o(this, new com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage(this.f45965d, z17), z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setIsPopGestureEnabled(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setIsPopGestureEnable : ");
        boolean z18 = !z17;
        sb6.append(z18);
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", sb6.toString(), new java.lang.Object[0]);
        this.f45974p.updatePopGestureEnable(new com.tencent.pigeon.liteapp.WxaLiteAppWidgetUpdatePopGestureEnableMessage(this.f45965d, z18), new zc.g(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setKeepScreenOn(boolean z17) {
        this.f45975q.runOnUiThread(new zc.p(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setPageOrientation(int i17) {
        this.f45975q.runOnUiThread(new zc.q(this, i17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setScreenshotEnabled(boolean z17) {
        this.f45975q.runOnUiThread(new zc.r(z17, this));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setStatusBarHidden(boolean z17) {
        int i17 = this.F;
        if (i17 == 2 || i17 == 4) {
            return;
        }
        int i18 = z17 ? 5892 : 1792;
        android.app.Activity activity = this.f45975q;
        if (activity.getWindow() != null) {
            android.view.Window window = activity.getWindow();
            if ((window != null ? window.getDecorView() : null) != null) {
                activity.runOnUiThread(new zc.s(this, i18));
            }
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void showPage(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        if (pageInfo != null) {
            this.C = pageInfo;
            this.f45975q.runOnUiThread(new zc.t(this, pageInfo));
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateLong(long j17) {
        this.f45975q.runOnUiThread(new zc.v(this, j17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateShort(long j17, int i17) {
        this.f45975q.runOnUiThread(new zc.w(this, j17, i17));
    }

    public /* synthetic */ WxaLiteAppWidgetAdapter(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi wxaLiteAppWidgetFlutterPluginApi, android.content.Context context, io.flutter.embedding.engine.FlutterEngine flutterEngine, android.app.Activity activity, java.lang.Object obj, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, io.flutter.embedding.engine.plugins.PluginRegistry pluginRegistry, int i27, kotlin.jvm.internal.i iVar) {
        this(i17, i18, i19, str, (i27 & 16) != 0 ? "" : str2, (i27 & 32) != 0 ? "" : str3, (i27 & 64) != 0 ? "" : str4, str5, str6, wxaLiteAppWidgetFlutterPluginApi, context, flutterEngine, activity, obj, binaryMessenger, wxaLiteAppStartReport, pluginRegistry);
    }
}
