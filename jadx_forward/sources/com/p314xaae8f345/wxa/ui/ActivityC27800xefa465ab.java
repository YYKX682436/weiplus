package com.p314xaae8f345.wxa.ui;

/* renamed from: com.tencent.wxa.ui.WxaFlutterActivity */
/* loaded from: classes15.dex */
public class ActivityC27800xefa465ab extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 implements ox5.l, mx5.b {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b f301715d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301716e;

    /* renamed from: f, reason: collision with root package name */
    public ox5.a f301717f;

    /* renamed from: g, reason: collision with root package name */
    public int f301718g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f301719h = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    static {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque.name();
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
        return this.f301718g;
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewId */
    public java.lang.String mo28568x146a8a26() {
        if (getIntent().hasExtra("activityId") && !android.text.TextUtils.isEmpty(getIntent().getStringExtra("activityId"))) {
            return getIntent().getStringExtra("activityId");
        }
        if (android.text.TextUtils.isEmpty(this.f301716e)) {
            this.f301716e = java.lang.String.format("%d-%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(hashCode()));
        }
        return this.f301716e;
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

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f301719h;
    }

    @Override // ox5.l
    /* renamed from: getRenderMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 mo29009x3569ec4f() {
        return (getIntent().hasExtra("background_mode") ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.m137093xdce0328(getIntent().getStringExtra("background_mode")) : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque) == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture;
    }

    @Override // ox5.l
    /* renamed from: getTransparencyMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b mo29010x88a6f491() {
        return (getIntent().hasExtra("background_mode") ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.m137093xdce0328(getIntent().getStringExtra("background_mode")) : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque) == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.opaque : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f301717f.c(i17, i18, intent);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        this.f301717f.d(true, false);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        try {
            android.os.Bundle bundle2 = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            if (bundle2 != null) {
                int i17 = bundle2.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i17 != -1) {
                    setTheme(i17);
                }
            } else {
                nx5.c.a("FlutterActivity", "Using the launch theme as normal theme.", new java.lang.Object[0]);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            nx5.c.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.", new java.lang.Object[0]);
        }
        super.onCreate(bundle);
        this.f301719h.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
        ox5.a aVar = new ox5.a(this, 0, null);
        this.f301717f = aVar;
        this.f301718g = aVar.f431325a;
        aVar.e();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setOrientation(1);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b(this, null);
        c0102x1f44235b.setLayoutParams(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams(-1, -2));
        if (c0102x1f44235b.f91030z == null) {
            c0102x1f44235b.f91030z = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1 q1Var = c0102x1f44235b.f91030z;
        q1Var.f91224h = false;
        q1Var.f91221e = 0;
        q1Var.f91217a = 0;
        q1Var.f91222f = 0;
        q1Var.f91218b = 0;
        c0102x1f44235b.setVisibility(8);
        this.f301715d = c0102x1f44235b;
        linearLayout.addView(c0102x1f44235b);
        m2542xb4674770(this.f301715d);
        linearLayout.addView(this.f301717f.f(null, null, null), new android.widget.LinearLayout.LayoutParams(-1, -1));
        setContentView(linearLayout);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f301717f.g(false);
        this.f301719h.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
    }

    @Override // ox5.l
    /* renamed from: onFlutterUiDisplayed */
    public void mo29011x6c956b30() {
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f301717f.h(intent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f301717f.i();
        this.f301719h.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f301717f.j();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f301717f.k(i17, strArr, iArr);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f301719h.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
        this.f301717f.l();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f301719h.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
        this.f301717f.m();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f301717f.n();
        this.f301719h.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        this.f301717f.o(i17);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onUserLeaveHint() {
        this.f301717f.p();
    }

    @Override // ox5.l
    /* renamed from: providePlatformPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 mo29012xa3c24e87(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        return null;
    }

    @Override // ox5.l
    /* renamed from: shouldAttachEngineToActivity */
    public boolean mo29013xbfcd5884() {
        return true;
    }
}
