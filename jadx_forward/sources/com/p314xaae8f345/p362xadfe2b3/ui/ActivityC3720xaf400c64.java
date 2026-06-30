package com.p314xaae8f345.p362xadfe2b3.ui;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI */
/* loaded from: classes15.dex */
public class ActivityC3720xaf400c64 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 implements ox5.l, mx5.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f127607d;

    /* renamed from: e, reason: collision with root package name */
    public ox5.a f127608e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f127609f;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f127611h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo f127612i;

    /* renamed from: m, reason: collision with root package name */
    public int f127613m;

    /* renamed from: g, reason: collision with root package name */
    public boolean f127610g = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f127614n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f127615o = false;

    static {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque.name();
    }

    public ActivityC3720xaf400c64() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65372x7420eb55();
    }

    public android.view.View O6() {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        ox5.a aVar = this.f127608e;
        android.view.View f17 = aVar != null ? aVar.f(null, null, null) : null;
        if (f17 != null) {
            frameLayout.addView(f17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        return frameLayout;
    }

    public void P6() {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        android.util.DisplayMetrics displayMetrics2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37161xa0784b6e;
        if (displayMetrics2 != null) {
            displayMetrics.setTo(displayMetrics2);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: cleanUpFlutterEngine */
    public void mo29002x72e1151a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: configureFlutterEngine */
    public void mo29003xab73cc38(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
    }

    @Override // ox5.l
    /* renamed from: getActivity */
    public android.app.Activity m29017x19263085() {
        return this;
    }

    @Override // ox5.l
    /* renamed from: getAppBundlePath */
    public java.lang.String mo29004x67b29512() {
        java.lang.String dataString;
        if (((getApplicationInfo().flags & 2) != 0) && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // ox5.l
    /* renamed from: getCachedEngineId */
    public java.lang.String mo29005xd9afab35() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // ox5.l
    /* renamed from: getContext */
    public android.content.Context mo29015x76847179() {
        return this;
    }

    @Override // ox5.l
    /* renamed from: getDartEntrypointFunctionName */
    public java.lang.String mo29006x36e4a056() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            android.os.Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            java.lang.String string = bundle != null ? bundle.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        }
    }

    @Override // ox5.l
    /* renamed from: getFlutterActivity */
    public mx5.b mo29007xf9fa8515() {
        return this;
    }

    @Override // mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF127500f() {
        return this.f127613m;
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewId */
    public java.lang.String mo28568x146a8a26() {
        if (getIntent().hasExtra("activityId") && !android.text.TextUtils.isEmpty(getIntent().getStringExtra("activityId"))) {
            return getIntent().getStringExtra("activityId");
        }
        if (android.text.TextUtils.isEmpty(this.f127607d)) {
            this.f127607d = java.lang.String.format("%d-%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(hashCode()));
        }
        return this.f127607d;
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewName */
    public java.lang.String mo28569xa3f2e0d6() {
        return getIntent().hasExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d) ? getIntent().getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d) : "";
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
    /* renamed from: getInitialRoute */
    public java.lang.String mo29008x47d0e7db() {
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
    /* renamed from: getRenderMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 mo29009x3569ec4f() {
        return (getIntent().hasExtra("background_mode") ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.m137093xdce0328(getIntent().getStringExtra("background_mode")) : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque) == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture;
    }

    @Override // ox5.l
    /* renamed from: getTransparencyMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b mo29010x88a6f491() {
        if (this.f127610g) {
            return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
        }
        return (getIntent().hasExtra("background_mode") ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.m137093xdce0328(getIntent().getStringExtra("background_mode")) : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque) == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.opaque : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.c(i17, i18, intent);
        }
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.d(true, false);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f802;
        com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f enumC3698xfb48f2f;
        if (this.f127615o) {
            kd.c.b("WxaLiteAp.WxaLiteAppTransparentBaseUI", "needBackToLaunchUI", new java.lang.Object[0]);
            super.onCreate(bundle);
            finish();
            return;
        }
        try {
            android.os.Bundle bundle2 = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            if (bundle2 != null) {
                int i17 = bundle2.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i17 != -1) {
                    setTheme(i17);
                }
            } else {
                io.p3284xd2ae381c.Log.d("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            io.p3284xd2ae381c.Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.super", true);
        super.onCreate(bundle);
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.super", false);
        if (this.f127614n) {
            kd.c.b("WxaLiteAp.WxaLiteAppTransparentBaseUI", "readyToFinish onCreate", new java.lang.Object[0]);
            finish();
            return;
        }
        P6();
        if (!kx5.n.h().l()) {
            kd.c.b("WxaLiteAp.WxaLiteAppTransparentBaseUI", "WxaRouter not setup", new java.lang.Object[0]);
            finish();
            return;
        }
        ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.L1;
        if (abstractC3700xe41a2874 == null || (c3712x3ed8a441 = this.f127609f) == null || (c3708xc1f46f802 = c3712x3ed8a441.f14370x83282d6d) == null || (enumC3698xfb48f2f = c3708xc1f46f802.f14311x683188c) == null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(abstractC3700xe41a2874 != null);
            objArr[1] = java.lang.Boolean.valueOf(this.f127609f != null);
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4412 = this.f127609f;
            objArr[2] = java.lang.Boolean.valueOf((c3712x3ed8a4412 == null || c3712x3ed8a4412.f14370x83282d6d == null) ? false : true);
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4413 = this.f127609f;
            objArr[3] = java.lang.Boolean.valueOf((c3712x3ed8a4413 == null || (c3708xc1f46f80 = c3712x3ed8a4413.f14370x83282d6d) == null || c3708xc1f46f80.f14311x683188c == null) ? false : true);
            kd.c.b("WxaLiteAp.WxaLiteAppTransparentBaseUI", java.lang.String.format("Failed to set scene - reporter: %b, appInfo: %b, referrerInfo: %b, scene: %b", objArr), new java.lang.Object[0]);
        } else {
            abstractC3700xe41a2874.mo28900x53aed94a(enumC3698xfb48f2f);
        }
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.delegateInit", true);
        ox5.a aVar = new ox5.a(this, this.f127613m, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.L1);
        this.f127608e = aVar;
        this.f127613m = aVar.f431325a;
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.delegateInit", false);
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.delegateOnCreate", true);
        this.f127608e.e();
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.delegateOnCreate", false);
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.initFlutterView", true);
        this.f127611h = O6();
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.initFlutterView", false);
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.setContentView", true);
        setContentView(this.f127611h);
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.b7("Android.UI.Base.onCreate.setContentView", false);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.g(false);
            ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
        }
    }

    @Override // ox5.l
    /* renamed from: onFlutterUiDisplayed */
    public void mo29011x6c956b30() {
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.h(intent);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.i();
        }
        ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.k(i17, strArr, iArr);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f(p012xc85e97e9.p093xedfae76a.m.ON_START);
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.m();
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.n();
        }
        ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.o(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onUserLeaveHint() {
        ox5.a aVar = this.f127608e;
        if (aVar != null) {
            aVar.p();
        }
    }

    @Override // ox5.l
    /* renamed from: providePlatformPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 mo29012xa3c24e87(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        if (activity != null) {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6(this, c28580x69eec95e.m137436x69aaa6da());
        }
        return null;
    }

    @Override // ox5.l
    /* renamed from: shouldAttachEngineToActivity */
    public boolean mo29013xbfcd5884() {
        return true;
    }
}
