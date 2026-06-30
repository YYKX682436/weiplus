package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppBaseFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements ox5.l, mx5.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f46022d;

    /* renamed from: e, reason: collision with root package name */
    public ox5.a f46023e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.liteapp.storage.WxaLiteAppInfo f46024f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f46025g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f46026h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f46027i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f46028m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f46029n;

    /* renamed from: o, reason: collision with root package name */
    public int f46030o;

    static {
        io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
    }

    public WxaLiteAppBaseFragment() {
        com.tencent.mm.plugin.lite.LiteAppCenter.initLib();
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    @Override // androidx.fragment.app.Fragment, ox5.l
    /* renamed from: getActivity */
    public /* bridge */ /* synthetic */ android.app.Activity m42getActivity() {
        return super.getActivity();
    }

    @Override // ox5.l
    public java.lang.String getAppBundlePath() {
        return null;
    }

    @Override // ox5.l
    public java.lang.String getCachedEngineId() {
        return getArguments().containsKey("cached_engine_id") ? getArguments().getString("cached_engine_id") : getActivity().getIntent().getStringExtra("cached_engine_id");
    }

    @Override // ox5.l
    public java.lang.String getDartEntrypointFunctionName() {
        if (getArguments().containsKey("dart_entrypoint")) {
            return getArguments().getString("dart_entrypoint");
        }
        if (getActivity().getIntent().hasExtra("dart_entrypoint")) {
            return getActivity().getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            android.os.Bundle bundle = getActivity().getPackageManager().getActivityInfo(getActivity().getComponentName(), 128).metaData;
            java.lang.String string = bundle != null ? bundle.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            kd.c.b("WxaLiteAp.WxaLiteAppBaseFragment", "getDartEntrypointFunctionName fail. %s", e17.toString());
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
        return this.f46030o;
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewId() {
        if (getArguments().containsKey("activityId") && !android.text.TextUtils.isEmpty(getArguments().getString("activityId"))) {
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewId from Arguments", new java.lang.Object[0]);
            return getArguments().getString("activityId");
        }
        if (getActivity().getIntent().hasExtra("activityId") && !android.text.TextUtils.isEmpty(getActivity().getIntent().getStringExtra("activityId"))) {
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewId from Activity Intent", new java.lang.Object[0]);
            return getActivity().getIntent().getStringExtra("activityId");
        }
        if (android.text.TextUtils.isEmpty(this.f46022d)) {
            this.f46022d = java.lang.String.format("%d-%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(hashCode()));
        }
        return this.f46022d;
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewName() {
        if (!getArguments().containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME) || android.text.TextUtils.isEmpty(getArguments().getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME))) {
            return getActivity().getIntent().hasExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME) ? getActivity().getIntent().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME) : "";
        }
        kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewName from Arguments", new java.lang.Object[0]);
        return getArguments().getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (getArguments().containsKey("params")) {
            getArguments().getSerializable("params");
        }
        if (!getActivity().getIntent().hasExtra("params")) {
            return null;
        }
        getActivity().getIntent().getSerializableExtra("params");
        return null;
    }

    @Override // ox5.l
    public java.lang.String getInitialRoute() {
        if (getArguments().containsKey("initial_route")) {
            return getArguments().getString("initial_route");
        }
        if (getActivity().getIntent().hasExtra("initial_route")) {
            return getActivity().getIntent().getStringExtra("initial_route");
        }
        try {
            android.os.Bundle bundle = getActivity().getPackageManager().getActivityInfo(getActivity().getComponentName(), 128).metaData;
            java.lang.String string = bundle != null ? bundle.getString("io.flutter.InitialRoute") : null;
            return string != null ? string : "/";
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "/";
        }
    }

    @Override // ox5.l
    public io.flutter.embedding.android.RenderMode getRenderMode() {
        return j0() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.RenderMode.surface : io.flutter.embedding.android.RenderMode.texture;
    }

    @Override // ox5.l
    public io.flutter.embedding.android.TransparencyMode getTransparencyMode() {
        return j0() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.TransparencyMode.opaque : io.flutter.embedding.android.TransparencyMode.transparent;
    }

    public io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode j0() {
        return getArguments().containsKey("background_mode") ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getArguments().getString("background_mode")) : getActivity().getIntent().hasExtra("background_mode") ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getActivity().getIntent().getStringExtra("background_mode")) : io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    public com.tencent.liteapp.storage.WxaLiteAppInfo l0(java.lang.String appId, java.lang.String minVersion) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(minVersion, "minVersion");
        if (zc.c.f471338a == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        if (zc.c.f471338a != null) {
            throw new java.lang.RuntimeException("Please setup storage first.");
        }
        kotlin.jvm.internal.o.o("config");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo;
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo2;
        com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene;
        super.onCreate(bundle);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        android.util.DisplayMetrics displayMetrics2 = com.tencent.mm.plugin.lite.LiteAppCenter.mDisplayMetrics;
        if (displayMetrics2 != null) {
            displayMetrics.setTo(displayMetrics2);
        }
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = com.tencent.liteapp.ui.WxaLiteAppUI.L1;
        if (liteAppReporter == null || (wxaLiteAppInfo = this.f46024f) == null || (liteAppReferrerInfo2 = wxaLiteAppInfo.referrerInfo) == null || (liteAppOpenScene = liteAppReferrerInfo2.scene) == null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(liteAppReporter != null);
            objArr[1] = java.lang.Boolean.valueOf(this.f46024f != null);
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo2 = this.f46024f;
            objArr[2] = java.lang.Boolean.valueOf((wxaLiteAppInfo2 == null || wxaLiteAppInfo2.referrerInfo == null) ? false : true);
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo3 = this.f46024f;
            objArr[3] = java.lang.Boolean.valueOf((wxaLiteAppInfo3 == null || (liteAppReferrerInfo = wxaLiteAppInfo3.referrerInfo) == null || liteAppReferrerInfo.scene == null) ? false : true);
            kd.c.b("WxaLiteAp.WxaLiteAppBaseFragment", java.lang.String.format("Failed to set scene - reporter: %b, appInfo: %b, referrerInfo: %b, scene: %b", objArr), new java.lang.Object[0]);
        } else {
            liteAppReporter.setScene(liteAppOpenScene);
        }
        ox5.a aVar = new ox5.a(this, this.f46030o, com.tencent.liteapp.ui.WxaLiteAppUI.L1);
        this.f46023e = aVar;
        this.f46030o = aVar.f349792a;
        aVar.e();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View f17 = this.f46023e.f(null, null, null);
        this.f46025g = f17;
        return f17;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f46023e.g(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // ox5.l
    public void onFlutterUiDisplayed() {
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f46023e.i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f46023e.l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f46023e.m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f46023e.n();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // ox5.l
    public io.flutter.plugin.platform.PlatformPlugin providePlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (activity == null || flutterEngine == null) {
            return null;
        }
        return new io.flutter.plugin.platform.PlatformPlugin(activity, flutterEngine.getPlatformChannel());
    }

    @Override // ox5.l
    public boolean shouldAttachEngineToActivity() {
        return true;
    }
}
