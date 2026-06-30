package com.p314xaae8f345.p362xadfe2b3.ui;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppBaseFragment */
/* loaded from: classes15.dex */
public class C3715xdc67e8d4 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements ox5.l, mx5.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f127555d;

    /* renamed from: e, reason: collision with root package name */
    public ox5.a f127556e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f127557f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f127558g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f127559h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f127560i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f127561m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f127562n;

    /* renamed from: o, reason: collision with root package name */
    public int f127563o;

    static {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque.name();
    }

    public C3715xdc67e8d4() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65372x7420eb55();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: cleanUpFlutterEngine */
    public void mo29002x72e1151a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: configureFlutterEngine */
    public void mo29003xab73cc38(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, ox5.l
    /* renamed from: getActivity */
    public /* bridge */ /* synthetic */ android.app.Activity m29017x19263085() {
        return super.mo7430x19263085();
    }

    @Override // ox5.l
    /* renamed from: getAppBundlePath */
    public java.lang.String mo29004x67b29512() {
        return null;
    }

    @Override // ox5.l
    /* renamed from: getCachedEngineId */
    public java.lang.String mo29005xd9afab35() {
        return m7436x8619eaa0().containsKey("cached_engine_id") ? m7436x8619eaa0().getString("cached_engine_id") : mo7430x19263085().getIntent().getStringExtra("cached_engine_id");
    }

    @Override // ox5.l
    /* renamed from: getDartEntrypointFunctionName */
    public java.lang.String mo29006x36e4a056() {
        if (m7436x8619eaa0().containsKey("dart_entrypoint")) {
            return m7436x8619eaa0().getString("dart_entrypoint");
        }
        if (mo7430x19263085().getIntent().hasExtra("dart_entrypoint")) {
            return mo7430x19263085().getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            android.os.Bundle bundle = mo7430x19263085().getPackageManager().getActivityInfo(mo7430x19263085().getComponentName(), 128).metaData;
            java.lang.String string = bundle != null ? bundle.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            kd.c.b("WxaLiteAp.WxaLiteAppBaseFragment", "getDartEntrypointFunctionName fail. %s", e17.toString());
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
        return this.f127563o;
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewId */
    public java.lang.String mo28568x146a8a26() {
        if (m7436x8619eaa0().containsKey("activityId") && !android.text.TextUtils.isEmpty(m7436x8619eaa0().getString("activityId"))) {
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewId from Arguments", new java.lang.Object[0]);
            return m7436x8619eaa0().getString("activityId");
        }
        if (mo7430x19263085().getIntent().hasExtra("activityId") && !android.text.TextUtils.isEmpty(mo7430x19263085().getIntent().getStringExtra("activityId"))) {
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewId from Activity Intent", new java.lang.Object[0]);
            return mo7430x19263085().getIntent().getStringExtra("activityId");
        }
        if (android.text.TextUtils.isEmpty(this.f127555d)) {
            this.f127555d = java.lang.String.format("%d-%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(m7479x8cdac1b()));
        }
        return this.f127555d;
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewName */
    public java.lang.String mo28569xa3f2e0d6() {
        if (!m7436x8619eaa0().containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d) || android.text.TextUtils.isEmpty(m7436x8619eaa0().getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d))) {
            return mo7430x19263085().getIntent().hasExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d) ? mo7430x19263085().getIntent().getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d) : "";
        }
        kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getFlutterViewName from Arguments", new java.lang.Object[0]);
        return m7436x8619eaa0().getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (m7436x8619eaa0().containsKey("params")) {
            m7436x8619eaa0().getSerializable("params");
        }
        if (!mo7430x19263085().getIntent().hasExtra("params")) {
            return null;
        }
        mo7430x19263085().getIntent().getSerializableExtra("params");
        return null;
    }

    @Override // ox5.l
    /* renamed from: getInitialRoute */
    public java.lang.String mo29008x47d0e7db() {
        if (m7436x8619eaa0().containsKey("initial_route")) {
            return m7436x8619eaa0().getString("initial_route");
        }
        if (mo7430x19263085().getIntent().hasExtra("initial_route")) {
            return mo7430x19263085().getIntent().getStringExtra("initial_route");
        }
        try {
            android.os.Bundle bundle = mo7430x19263085().getPackageManager().getActivityInfo(mo7430x19263085().getComponentName(), 128).metaData;
            java.lang.String string = bundle != null ? bundle.getString("io.flutter.InitialRoute") : null;
            return string != null ? string : "/";
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "/";
        }
    }

    @Override // ox5.l
    /* renamed from: getRenderMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 mo29009x3569ec4f() {
        return j0() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture;
    }

    @Override // ox5.l
    /* renamed from: getTransparencyMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b mo29010x88a6f491() {
        return j0() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.opaque : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
    }

    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode j0() {
        return m7436x8619eaa0().containsKey("background_mode") ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.m137093xdce0328(m7436x8619eaa0().getString("background_mode")) : mo7430x19263085().getIntent().hasExtra("background_mode") ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.m137093xdce0328(mo7430x19263085().getIntent().getStringExtra("background_mode")) : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque;
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 l0(java.lang.String appId, java.lang.String minVersion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(minVersion, "minVersion");
        if (zc.c.f552871a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        if (zc.c.f552871a != null) {
            throw new java.lang.RuntimeException("Please setup storage first.");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
        throw null;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        super.mo7397x3b13c504(context);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f802;
        com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f enumC3698xfb48f2f;
        super.mo7398x3e5a77bb(bundle);
        android.util.DisplayMetrics displayMetrics = m7460x893a2f6f().getDisplayMetrics();
        android.util.DisplayMetrics displayMetrics2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37161xa0784b6e;
        if (displayMetrics2 != null) {
            displayMetrics.setTo(displayMetrics2);
        }
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.L1;
        if (abstractC3700xe41a2874 == null || (c3712x3ed8a441 = this.f127557f) == null || (c3708xc1f46f802 = c3712x3ed8a441.f14370x83282d6d) == null || (enumC3698xfb48f2f = c3708xc1f46f802.f14311x683188c) == null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(abstractC3700xe41a2874 != null);
            objArr[1] = java.lang.Boolean.valueOf(this.f127557f != null);
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4412 = this.f127557f;
            objArr[2] = java.lang.Boolean.valueOf((c3712x3ed8a4412 == null || c3712x3ed8a4412.f14370x83282d6d == null) ? false : true);
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4413 = this.f127557f;
            objArr[3] = java.lang.Boolean.valueOf((c3712x3ed8a4413 == null || (c3708xc1f46f80 = c3712x3ed8a4413.f14370x83282d6d) == null || c3708xc1f46f80.f14311x683188c == null) ? false : true);
            kd.c.b("WxaLiteAp.WxaLiteAppBaseFragment", java.lang.String.format("Failed to set scene - reporter: %b, appInfo: %b, referrerInfo: %b, scene: %b", objArr), new java.lang.Object[0]);
        } else {
            abstractC3700xe41a2874.mo28900x53aed94a(enumC3698xfb48f2f);
        }
        ox5.a aVar = new ox5.a(this, this.f127563o, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.L1);
        this.f127556e = aVar;
        this.f127563o = aVar.f431325a;
        aVar.e();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View f17 = this.f127556e.f(null, null, null);
        this.f127558g = f17;
        return f17;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        this.f127556e.g(true);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDetach */
    public void mo7400x3f5eee52() {
        super.mo7400x3f5eee52();
    }

    @Override // ox5.l
    /* renamed from: onFlutterUiDisplayed */
    public void mo29011x6c956b30() {
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        this.f127556e.i();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onRequestPermissionsResult */
    public void mo7516x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        super.mo7516x953457f1(i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        this.f127556e.l();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        this.f127556e.m();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        this.f127556e.n();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        super.mo7518x594b1124(view, bundle);
    }

    @Override // ox5.l
    /* renamed from: providePlatformPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 mo29012xa3c24e87(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        if (activity == null || c28580x69eec95e == null) {
            return null;
        }
        return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6(activity, c28580x69eec95e.m137436x69aaa6da());
    }

    @Override // ox5.l
    /* renamed from: shouldAttachEngineToActivity */
    public boolean mo29013xbfcd5884() {
        return true;
    }
}
