package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppBaseView extends android.widget.FrameLayout implements ox5.l, androidx.lifecycle.x, androidx.lifecycle.y, mx5.b, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback {
    public static final /* synthetic */ int W = 0;
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public com.tencent.liteapp.storage.LiteAppReferrerInfo E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f46039J;
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig K;
    public md.j L;
    public boolean M;
    public float N;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public com.tencent.liteapp.report.WxaLiteAppStartReport T;
    public md.h U;
    public final md.g V;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.liteapp.gen.LiteAppReporter f46040d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f46041e;

    /* renamed from: f, reason: collision with root package name */
    public ox5.a f46042f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f46043g;

    /* renamed from: h, reason: collision with root package name */
    public int f46044h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback f46045i;

    /* renamed from: m, reason: collision with root package name */
    public long f46046m;

    /* renamed from: n, reason: collision with root package name */
    public long f46047n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo f46048o;

    /* renamed from: p, reason: collision with root package name */
    public long f46049p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f46050q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f46051r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f46052s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f46053t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f46054u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f46055v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f46056w;

    /* renamed from: x, reason: collision with root package name */
    public long f46057x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f46058y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f46059z;

    static {
        io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
    }

    public WxaLiteAppBaseView(android.content.Context context) {
        super(context);
        this.f46040d = null;
        this.f46044h = 0;
        this.f46047n = -1L;
        this.f46049p = -1L;
        this.f46050q = false;
        this.f46052s = "";
        this.f46053t = "";
        this.f46054u = "";
        this.f46057x = 0L;
        this.f46058y = false;
        this.f46059z = false;
        this.A = false;
        this.B = true;
        this.C = 0;
        this.D = false;
        this.E = null;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f46039J = false;
        this.M = false;
        this.N = 1.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = false;
        this.S = false;
        this.V = new com.tencent.liteapp.ui.k(this);
        this.f46045i = new com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback(this.f46051r, this);
        this.F = getLifecycleOwner() != null;
    }

    private void d(com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (this.S) {
            return;
        }
        this.S = true;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            com.tencent.liteapp.report.WxaLiteAppStartReport.a(liteAppReporter, wxaLiteAppStartReport);
        }
        try {
            java.lang.String b17 = wxaLiteAppStartReport.b();
            kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "reportStartLiteApp %s", b17);
            com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback;
            if (iWxaLiteAppCallback != null) {
                iWxaLiteAppCallback.dataReporting("startLiteAppTimeLine", b17, wxaLiteAppStartReport.f45997d);
            }
        } catch (java.lang.Exception e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppBaseView", e17.toString(), new java.lang.Object[0]);
        }
    }

    public void a() {
        md.g gVar;
        if (this.f46050q) {
            onPause();
            onStop();
        }
        this.R = true;
        this.f46042f.g(true);
        androidx.lifecycle.y lifecycleOwner = getLifecycleOwner();
        if (lifecycleOwner != null) {
            lifecycleOwner.mo133getLifecycle().c(this);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetUICallback(this.f46046m, this.f46045i);
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetReporter(this.f46046m);
        if (this.f46051r != null) {
            ld.d.f318046b.a().c(this.f46051r);
        }
        md.h hVar = this.U;
        if (hVar == null || (gVar = this.V) == null) {
            return;
        }
        hVar.f325694f.remove(gVar);
    }

    public void b() {
        if (this.f46042f == null) {
            return;
        }
        this.H = false;
        onPause();
        onStop();
        onDestroy();
    }

    @Override // ox5.l
    public boolean b0(java.lang.Runnable runnable) {
        if (this.C == 0) {
            return false;
        }
        return com.tencent.mm.plugin.lite.LiteAppCenter.keepAlive(this.f46051r + "_" + this.f46052s + "_" + this.f46053t, this.f46044h, this.f46046m, this.f46054u, this.C, runnable, 0);
    }

    public void c() {
        addView(this.f46043g, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void closeWindow(android.content.Intent intent) {
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    public void e() {
        if (this.f46057x <= 0) {
            return;
        }
        android.graphics.Point b17 = es.u.b(getContext());
        android.content.Context context = zc.c.f471339b;
        if (context == null) {
            kotlin.jvm.internal.o.o("appContext");
            throw null;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int flutterViewWidth = getFlutterViewWidth();
        int flutterViewHeight = getFlutterViewHeight();
        float f17 = displayMetrics.density;
        float f18 = 48 * f17;
        long j17 = this.f46046m;
        float f19 = this.P;
        if (f19 <= 0.0f) {
            f19 = flutterViewWidth / f17;
        }
        float f27 = this.Q;
        if (f27 <= 0.0f) {
            f27 = flutterViewHeight / f17;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.setDisplayParams(j17, f19, f27, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, f18 / f17, 0.0f, 0.0f);
        this.Q = 0.0f;
        this.P = 0.0f;
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "updateLvCppDisplayParams SetDisplayParams appPtr=%d, w=%d h=%d screen=%d,%d densityDpi=%d density=%f", java.lang.Long.valueOf(this.f46057x), java.lang.Integer.valueOf(flutterViewWidth), java.lang.Integer.valueOf(flutterViewHeight), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), java.lang.Float.valueOf(displayMetrics.density));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void enterFullScreen() {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void exitFullScreen() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.ui.WxaLiteAppBaseView.f():void");
    }

    public void g() {
        b();
    }

    public java.lang.String getActivityId() {
        if (android.text.TextUtils.isEmpty(this.f46041e)) {
            this.f46041e = java.lang.String.format("%d-%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(hashCode()));
        }
        return this.f46041e;
    }

    @Override // ox5.l
    public java.lang.String getAppBundlePath() {
        return null;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getAppUuid() {
        return this.f46046m;
    }

    public io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        return io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.transparent;
    }

    @Override // ox5.l
    public java.lang.String getCachedEngineId() {
        return null;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.content.Context getCurrentContext() {
        return super.getContext();
    }

    @Override // ox5.l
    public java.lang.String getDartEntrypointFunctionName() {
        return com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getDataUuid() {
        return -1L;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.os.Bundle getExtraData() {
        android.app.Activity m42getActivity = m42getActivity();
        if (m42getActivity != null && m42getActivity.getIntent().hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            return m42getActivity.getIntent().getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        }
        return null;
    }

    @Override // ox5.l
    public mx5.b getFlutterActivity() {
        return this;
    }

    @Override // mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF45967f() {
        return this.f46044h;
    }

    public io.flutter.embedding.engine.FlutterShellArgs getFlutterShellArgs() {
        android.app.Activity m42getActivity = m42getActivity();
        if (m42getActivity == null) {
            return null;
        }
        return io.flutter.embedding.engine.FlutterShellArgs.fromIntent(m42getActivity.getIntent());
    }

    public int getFlutterViewHeight() {
        return getMeasuredHeight();
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewId() {
        kd.c.a("WxaLiteApp.WxaLiteAppBaseView", "getFlutterViewId %s", java.lang.Long.valueOf(this.f46047n));
        return java.lang.String.valueOf(this.f46047n);
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewName() {
        return java.lang.String.valueOf(this.f46049p);
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (this.f46048o == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.Long.valueOf(this.f46048o.appUuid));
        hashMap.put("appId", this.f46051r);
        hashMap.put("appPtr", java.lang.Long.valueOf(this.f46048o.appPtr));
        hashMap.put("pageViewId", java.lang.Long.valueOf(this.f46048o.pageId));
        hashMap.put("basePath", this.f46048o.basePath);
        hashMap.put("pageRenderPtr", java.lang.Long.valueOf(this.f46048o.renderId));
        hashMap.put("flags", java.lang.Integer.valueOf(this.f46048o.flags));
        hashMap.put("startTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return hashMap;
    }

    public int getFlutterViewWidth() {
        return getMeasuredWidth();
    }

    @Override // ox5.l
    public java.lang.String getInitialRoute() {
        return "/";
    }

    @Override // ox5.l, androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return new androidx.lifecycle.b0(this, true);
    }

    public androidx.lifecycle.y getLifecycleOwner() {
        boolean z17;
        java.lang.Object context = getContext();
        while (true) {
            z17 = context instanceof androidx.lifecycle.y;
            if (z17 || !(context instanceof android.content.ContextWrapper)) {
                break;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        if (z17) {
            return (androidx.lifecycle.y) context;
        }
        return null;
    }

    public long getPageId() {
        return this.f46049p;
    }

    @Override // ox5.l
    public io.flutter.embedding.android.RenderMode getRenderMode() {
        return getBackgroundMode() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.RenderMode.surface : io.flutter.embedding.android.RenderMode.texture;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo getSystemInfo(int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo systemInfo = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback.getSystemInfo(i17);
        systemInfo.appId = this.f46051r;
        systemInfo.isHalfScreen = false;
        return systemInfo;
    }

    @Override // ox5.l
    public io.flutter.embedding.android.TransparencyMode getTransparencyMode() {
        return getBackgroundMode() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.TransparencyMode.opaque : io.flutter.embedding.android.TransparencyMode.transparent;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    /* renamed from: getWxaLiteAppActivity */
    public android.app.Activity getF45975q() {
        return m42getActivity();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean hasCutOut() {
        return false;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void hideKeyboard() {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean isDarkMode() {
        return false;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void keyboardEnable(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void navigateBack(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.liteapp.ui.m(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.F && this.G) {
            onStart();
            onResume();
        }
        this.G = true;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onBodySizeChange(java.lang.String str, long j17, long j18, float f17, float f18) {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onBodySizeChange appId=%s appUuid=%d, pageId=%d width=%f height=%f", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckBaseLibSumFail(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppBaseView", "Check Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckSumFail(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppBaseView", "Check BaseLib Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean isCurrentDarkMode = com.tencent.mm.plugin.lite.LiteAppCenter.isCurrentDarkMode();
        if (isCurrentDarkMode != this.M) {
            kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "DarkMode change %b", java.lang.Boolean.valueOf(isCurrentDarkMode));
            this.M = isCurrentDarkMode;
            com.tencent.mm.plugin.lite.LiteAppCenter.updateDarkMode(isCurrentDarkMode);
        }
        float f17 = configuration.fontScale;
        if (f17 == this.N || !com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem) {
            return;
        }
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "fontScale change %b", java.lang.Float.valueOf(f17));
        float f18 = configuration.fontScale;
        this.N = f18;
        com.tencent.mm.plugin.lite.LiteAppCenter.updateFontScale(f18);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCreateLitePageViewFinish(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        this.f46048o = pageInfo;
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.T;
        if (wxaLiteAppStartReport != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2 = this.T;
            wxaLiteAppStartReport.E = currentTimeMillis - wxaLiteAppStartReport2.D;
            wxaLiteAppStartReport2.C = pageInfo.success;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport3 = this.T;
            wxaLiteAppStartReport2.F = currentTimeMillis2 - wxaLiteAppStartReport3.f46002i;
            wxaLiteAppStartReport3.f46016z = pageInfo.isPreload;
            if (wxaLiteAppStartReport3.G != 0) {
                d(wxaLiteAppStartReport3);
            }
        }
        java.util.Map e17 = getE();
        if (e17 != null) {
            if (e17.containsKey("appId")) {
                java.lang.String valueOf = java.lang.String.valueOf(e17.get("appId"));
                this.f46051r = valueOf;
                this.f46045i.appId = valueOf;
            }
            if (e17.containsKey("appPtr")) {
                this.f46057x = java.lang.Long.valueOf(e17.get("appPtr").toString()).longValue();
            }
            if (e17.containsKey("pageViewId")) {
                this.f46049p = java.lang.Long.valueOf(e17.get("pageViewId").toString()).longValue();
            }
            if (e17.containsKey("activityId")) {
                this.f46041e = e17.get("activityId").toString();
            }
            if (e17.containsKey("pageRenderPtr")) {
                java.lang.Long.valueOf(e17.get("pageRenderPtr").toString()).longValue();
            }
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.setAutoSize(this.f46046m, this.f46059z, this.A, false);
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.liteapp.ui.p(this, new java.lang.ref.WeakReference(this)));
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onDestroy() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onDestroy", new java.lang.Object[0]);
        if (this.R || this.f46050q) {
            return;
        }
        a();
    }

    @Override // ox5.l
    public void onFlutterUiDisplayed() {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onLayoutComplete(java.lang.String str, long j17, long j18, float f17, float f18) {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onLayoutComplete appId=%s appUuid=%d, pageId=%d width=%f height=%f", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onPause() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onPause", new java.lang.Object[0]);
        if (this.R || this.f46042f == null || this.I) {
            return;
        }
        md.j jVar = this.L;
        if (jVar != null) {
            jVar.f325700e.disable();
            jVar.f325699d = null;
            this.L = null;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.unRegisterAudioBroadCaseReceiver(getContext());
        this.f46042f.i();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onResume() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onResume", new java.lang.Object[0]);
        if (this.f46042f == null || this.I) {
            return;
        }
        if (this.L == null) {
            this.L = new md.j(getCurrentContext(), 2);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.registerAudioBroadCaseReceiver(getContext());
        this.f46042f.l();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onShowPageTimeStamp(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.PageShowInfo pageShowInfo) {
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.T;
        if (wxaLiteAppStartReport != null) {
            wxaLiteAppStartReport.H = pageShowInfo;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2 = this.T;
            wxaLiteAppStartReport.G = currentTimeMillis - wxaLiteAppStartReport2.f46002i;
            if (wxaLiteAppStartReport2.F != 0) {
                d(wxaLiteAppStartReport2);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.content.Context context = zc.c.f471339b;
        if (context == null) {
            kotlin.jvm.internal.o.o("appContext");
            throw null;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(context.getResources().getDisplayMetrics().density);
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "updateLvCppDisplayParams updateSize appPtr=%d, w=%d,%d old=%d,%d density=%f", java.lang.Long.valueOf(this.f46057x), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), valueOf);
        float floatValue = i17 / valueOf.floatValue();
        float floatValue2 = i18 / valueOf.floatValue();
        if (this.f46057x > 0) {
            com.tencent.mm.plugin.lite.LiteAppCenter.updateSize(this.f46046m, floatValue, floatValue2);
        } else {
            this.Q = floatValue2;
            this.P = floatValue;
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_START)
    public void onStart() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onStart", new java.lang.Object[0]);
        if (this.H) {
            return;
        }
        this.H = true;
        this.f46042f.m();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public void onStop() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onStop", new java.lang.Object[0]);
        if (this.R) {
            return;
        }
        this.f46042f.n();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openApp() {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openWebView(java.util.Map map) {
    }

    @Override // ox5.l
    public io.flutter.plugin.platform.PlatformPlugin providePlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (activity == null || flutterEngine == null) {
            return null;
        }
        return new io.flutter.plugin.platform.PlatformPlugin(activity, flutterEngine.getPlatformChannel());
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void releaseKeepAlive() {
        this.C = 0;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setCanOverScroll(boolean z17) {
        this.B = z17;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setFlags(int i17) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setForbidRightGestureEnable(boolean z17) {
        super.setForbidRightGestureEnable(z17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(this.f46041e));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.liteapp.ui.l(this, hashMap));
        this.f46039J = z17;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setIsPopGestureEnabled(boolean z17) {
    }

    @Override // android.view.View, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setKeepScreenOn(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.liteapp.ui.n(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setPageOrientation(int i17) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setScreenshotEnabled(boolean z17) {
        android.app.Activity m42getActivity = m42getActivity();
        if (m42getActivity == null) {
            return;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.liteapp.ui.o(this, z17, m42getActivity));
    }

    public void setStore(com.tencent.mm.plugin.lite.s sVar) {
        this.f46045i.setStore(sVar);
    }

    @Override // ox5.l
    public boolean shouldAttachEngineToActivity() {
        return m42getActivity() != null;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void showPage(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        this.f46048o = pageInfo;
        this.f46049p = pageInfo.pageId;
        if (this.f46051r.equals(pageInfo.appId)) {
            return;
        }
        e();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateLong(long j17) {
        android.os.Vibrator vibrator;
        android.app.Activity m42getActivity = m42getActivity();
        if (m42getActivity == null || (vibrator = (android.os.Vibrator) m42getActivity.getSystemService("vibrator")) == null) {
            return;
        }
        vibrator.vibrate(j17);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateShort(long j17, int i17) {
        android.os.Vibrator vibrator;
        android.app.Activity m42getActivity = m42getActivity();
        if (m42getActivity == null || (vibrator = (android.os.Vibrator) m42getActivity.getSystemService("vibrator")) == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(j17);
        } else {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, i17));
        }
    }

    @Override // ox5.l
    /* renamed from: getActivity, reason: merged with bridge method [inline-methods] */
    public android.app.Activity m42getActivity() {
        for (android.content.Context context = getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }
}
