package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppBaseUI extends com.tencent.mm.ext.ui.SwipeBackActivity implements ox5.l, mx5.b {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f46031f;

    /* renamed from: g, reason: collision with root package name */
    public ox5.a f46032g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.liteapp.storage.WxaLiteAppInfo f46033h;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f46035m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo f46036n;

    /* renamed from: o, reason: collision with root package name */
    public int f46037o;

    /* renamed from: i, reason: collision with root package name */
    public boolean f46034i = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46038p = false;

    static {
        io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
    }

    public WxaLiteAppBaseUI() {
        com.tencent.mm.plugin.lite.LiteAppCenter.initLib();
    }

    public android.view.View R6() {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        frameLayout.addView(this.f46032g.f(null, null, null), new android.widget.FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void S6() {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        android.util.DisplayMetrics displayMetrics2 = com.tencent.mm.plugin.lite.LiteAppCenter.mDisplayMetrics;
        if (displayMetrics2 != null) {
            displayMetrics.setTo(displayMetrics2);
        }
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    @Override // ox5.l
    /* renamed from: getActivity */
    public android.app.Activity m42getActivity() {
        return this;
    }

    @Override // ox5.l
    public java.lang.String getAppBundlePath() {
        java.lang.String dataString;
        if (((getApplicationInfo().flags & 2) != 0) && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // ox5.l
    public java.lang.String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // ox5.l
    public android.content.Context getContext() {
        return this;
    }

    @Override // ox5.l
    public java.lang.String getDartEntrypointFunctionName() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            android.os.Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            java.lang.String string = bundle != null ? bundle.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        }
    }

    @Override // ox5.l
    public mx5.b getFlutterActivity() {
        return this;
    }

    @Override // mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF45967f() {
        return this.f46037o;
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewId() {
        if (getIntent().hasExtra("activityId") && !android.text.TextUtils.isEmpty(getIntent().getStringExtra("activityId"))) {
            return getIntent().getStringExtra("activityId");
        }
        if (android.text.TextUtils.isEmpty(this.f46031f)) {
            this.f46031f = java.lang.String.format("%d-%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(hashCode()));
        }
        return this.f46031f;
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewName() {
        return getIntent().hasExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME) ? getIntent().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME) : "";
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (!getIntent().hasExtra("params")) {
            return null;
        }
        getIntent().getSerializableExtra("params");
        return null;
    }

    @Override // ox5.l
    public java.lang.String getInitialRoute() {
        if (getIntent().hasExtra("initial_route")) {
            return getIntent().getStringExtra("initial_route");
        }
        try {
            android.os.Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            java.lang.String string = bundle != null ? bundle.getString("io.flutter.InitialRoute") : null;
            return string != null ? string : "/";
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "/";
        }
    }

    @Override // ox5.l
    public io.flutter.embedding.android.RenderMode getRenderMode() {
        return (getIntent().hasExtra("background_mode") ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque) == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.RenderMode.surface : io.flutter.embedding.android.RenderMode.texture;
    }

    @Override // ox5.l
    public io.flutter.embedding.android.TransparencyMode getTransparencyMode() {
        if (this.f46034i) {
            return io.flutter.embedding.android.TransparencyMode.transparent;
        }
        return (getIntent().hasExtra("background_mode") ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque) == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.TransparencyMode.opaque : io.flutter.embedding.android.TransparencyMode.transparent;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f46032g.c(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f46032g.d(true, false);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo;
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo2;
        com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene;
        try {
            android.os.Bundle bundle2 = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            if (bundle2 != null) {
                int i17 = bundle2.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i17 != -1) {
                    setTheme(i17);
                }
            } else {
                io.flutter.Log.d("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            io.flutter.Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.super", true);
        super.onCreate(bundle);
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.super", false);
        if (this.f46038p) {
            kd.c.b("WxaLiteAp.WxaLiteAppBaseUI", "readyToFinish onCreate", new java.lang.Object[0]);
            finish();
            return;
        }
        S6();
        if (!kx5.n.h().l()) {
            kd.c.b("WxaLiteAp.WxaLiteAppBaseUI", "WxaRouter not setup", new java.lang.Object[0]);
            finish();
            return;
        }
        ((androidx.lifecycle.b0) mo133getLifecycle()).f(androidx.lifecycle.m.ON_CREATE);
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = com.tencent.liteapp.ui.WxaLiteAppUI.L1;
        if (liteAppReporter == null || (wxaLiteAppInfo = this.f46033h) == null || (liteAppReferrerInfo2 = wxaLiteAppInfo.referrerInfo) == null || (liteAppOpenScene = liteAppReferrerInfo2.scene) == null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(liteAppReporter != null);
            objArr[1] = java.lang.Boolean.valueOf(this.f46033h != null);
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo2 = this.f46033h;
            objArr[2] = java.lang.Boolean.valueOf((wxaLiteAppInfo2 == null || wxaLiteAppInfo2.referrerInfo == null) ? false : true);
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo3 = this.f46033h;
            objArr[3] = java.lang.Boolean.valueOf((wxaLiteAppInfo3 == null || (liteAppReferrerInfo = wxaLiteAppInfo3.referrerInfo) == null || liteAppReferrerInfo.scene == null) ? false : true);
            kd.c.b("WxaLiteAp.WxaLiteAppBaseUI", java.lang.String.format("Failed to set scene - reporter: %b, appInfo: %b, referrerInfo: %b, scene: %b", objArr), new java.lang.Object[0]);
        } else {
            liteAppReporter.setScene(liteAppOpenScene);
        }
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.delegateInit", true);
        ox5.a aVar = new ox5.a(this, this.f46037o, com.tencent.liteapp.ui.WxaLiteAppUI.L1);
        this.f46032g = aVar;
        this.f46037o = aVar.f349792a;
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.delegateInit", false);
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.delegateOnCreate", true);
        this.f46032g.e();
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.delegateOnCreate", false);
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.initFlutterView", true);
        this.f46035m = R6();
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.initFlutterView", false);
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.setContentView", true);
        setContentView(this.f46035m);
        com.tencent.liteapp.ui.WxaLiteAppUI.b7("Android.UI.Base.onCreate.setContentView", false);
    }

    @Override // com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ox5.a aVar = this.f46032g;
        if (aVar != null) {
            aVar.g(false);
            ((androidx.lifecycle.b0) mo133getLifecycle()).f(androidx.lifecycle.m.ON_DESTROY);
        }
    }

    @Override // ox5.l
    public void onFlutterUiDisplayed() {
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f46032g.h(intent);
    }

    @Override // com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f46032g.i();
        ((androidx.lifecycle.b0) mo133getLifecycle()).f(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f46032g.j();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f46032g.k(i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((androidx.lifecycle.b0) mo133getLifecycle()).f(androidx.lifecycle.m.ON_RESUME);
        this.f46032g.l();
    }

    @Override // com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((androidx.lifecycle.b0) mo133getLifecycle()).f(androidx.lifecycle.m.ON_START);
        this.f46032g.m();
    }

    @Override // com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f46032g.n();
        ((androidx.lifecycle.b0) mo133getLifecycle()).f(androidx.lifecycle.m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        this.f46032g.o(i17);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onUserLeaveHint() {
        ox5.a aVar = this.f46032g;
        if (aVar != null) {
            aVar.p();
        }
    }

    @Override // ox5.l
    public io.flutter.plugin.platform.PlatformPlugin providePlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (activity == null || flutterEngine == null) {
            return null;
        }
        return new io.flutter.plugin.platform.PlatformPlugin(this, flutterEngine.getPlatformChannel());
    }

    @Override // ox5.l
    public boolean shouldAttachEngineToActivity() {
        return true;
    }
}
