package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.PatchedFlutterActivityController */
/* loaded from: classes15.dex */
public abstract class AbstractC28567x8491fc40 implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, p012xc85e97e9.p093xedfae76a.y, hq4.a {

    /* renamed from: FLUTTER_VIEW_ID */
    public static final int f70736x5ad2abb2 = android.view.View.generateViewId();
    private static final java.lang.String TAG = "PatchedFlutterActivityController";

    /* renamed from: delegate */
    protected io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 f70737x30d5dd85;

    /* renamed from: lifecycle */
    private p012xc85e97e9.p093xedfae76a.b0 f70738xedfae76a;

    /* renamed from: vActivity */
    protected com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a f70739xf8b181a5;

    /* renamed from: io.flutter.embedding.android.PatchedFlutterActivityController$CachedEngineIntentBuilder */
    /* loaded from: classes11.dex */
    public static class CachedEngineIntentBuilder {

        /* renamed from: activityClass */
        private final java.lang.Class<? extends android.app.Activity> f70740xc0af57a9;

        /* renamed from: cachedEngineId */
        private final java.lang.String f70742xeb17de3f;

        /* renamed from: destroyEngineWithActivity */
        private boolean f70743x3e90eef1 = false;

        /* renamed from: backgroundMode */
        private java.lang.String f70741x5512bbf1 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.f70509x9d7e8bf6;

        public CachedEngineIntentBuilder(java.lang.Class<? extends android.app.Activity> cls, java.lang.String str) {
            this.f70740xc0af57a9 = cls;
            this.f70742xeb17de3f = str;
        }

        /* renamed from: backgroundMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40.CachedEngineIntentBuilder m137362x5512bbf1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode) {
            this.f70741x5512bbf1 = backgroundMode.name();
            return this;
        }

        /* renamed from: build */
        public android.content.Intent m137363x59bc66e(android.content.Context context) {
            return new android.content.Intent(context, this.f70740xc0af57a9).putExtra("cached_engine_id", this.f70742xeb17de3f).putExtra("destroy_engine_with_activity", this.f70743x3e90eef1).putExtra("background_mode", this.f70741x5512bbf1);
        }

        /* renamed from: destroyEngineWithActivity */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40.CachedEngineIntentBuilder m137364x3e90eef1(boolean z17) {
            this.f70743x3e90eef1 = z17;
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.android.PatchedFlutterActivityController$NewEngineIntentBuilder */
    /* loaded from: classes11.dex */
    public static class NewEngineIntentBuilder {

        /* renamed from: activityClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b> f70744xc0af57a9;

        /* renamed from: initialRoute */
        private java.lang.String f70746xe6de5565 = "/";

        /* renamed from: backgroundMode */
        private java.lang.String f70745x5512bbf1 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.f70509x9d7e8bf6;

        public NewEngineIntentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b> cls) {
            this.f70744xc0af57a9 = cls;
        }

        /* renamed from: backgroundMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40.NewEngineIntentBuilder m137365x5512bbf1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode) {
            this.f70745x5512bbf1 = backgroundMode.name();
            return this;
        }

        /* renamed from: build */
        public android.content.Intent m137366x59bc66e(android.content.Context context) {
            return new android.content.Intent(context, this.f70744xc0af57a9).putExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f, this.f70746xe6de5565).putExtra("background_mode", this.f70745x5512bbf1).putExtra("destroy_engine_with_activity", true);
        }

        /* renamed from: initialRoute */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40.NewEngineIntentBuilder m137367xe6de5565(java.lang.String str) {
            this.f70746xe6de5565 = str;
            return this;
        }
    }

    public AbstractC28567x8491fc40(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a activityC18916xbd02f08a) {
        this();
        this.f70739xf8b181a5 = activityC18916xbd02f08a;
    }

    /* renamed from: configureStatusBarForFullscreenFlutterExperience */
    private void m137346xbd6baafd() {
        android.view.Window window = this.f70739xf8b181a5.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    /* renamed from: configureWindowForTransparency */
    private void m137347x496a9d6b() {
        if (m137356x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.transparent) {
            this.f70739xf8b181a5.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
    }

    /* renamed from: createDefaultIntent */
    public static android.content.Intent m137348x89568ca1(android.content.Context context) {
        return m137354xf7eec5dc().m137366x59bc66e(context);
    }

    /* renamed from: createFlutterView */
    private android.view.View m137349xfa44a45() {
        return this.f70737x30d5dd85.m137066x18bad100(null, null, null, f70736x5ad2abb2, mo137009x3569ec4f() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface);
    }

    /* renamed from: isDebuggable */
    private boolean m137350x14236c98() {
        return (this.f70739xf8b181a5.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: release */
    private void m137351x41012807() {
        this.f70737x30d5dd85.m137067xa6664a60();
        this.f70737x30d5dd85.m137068x3f5eee52();
        this.f70737x30d5dd85.m137082x41012807();
        this.f70737x30d5dd85 = null;
    }

    /* renamed from: stillAttachedForEvent */
    private boolean m137352x83ff5edd(java.lang.String str) {
        if (this.f70737x30d5dd85 != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "FlutterActivity " + hashCode() + " " + str + " called after release.");
        return false;
    }

    /* renamed from: switchLaunchThemeForNormalTheme */
    private void m137353xb090373b() {
        try {
            android.os.Bundle m137358x60f92cc5 = m137358x60f92cc5();
            if (m137358x60f92cc5 != null) {
                int i17 = m137358x60f92cc5.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i17 != -1) {
                    this.f70739xf8b181a5.setTheme(i17);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Using the launch theme as normal theme.");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    /* renamed from: withNewEngine */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40.NewEngineIntentBuilder m137354xf7eec5dc() {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40.NewEngineIntentBuilder(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.class);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: cleanUpFlutterEngine */
    public void mo29002x72e1151a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: configureFlutterEngine */
    public void mo29003xab73cc38(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3298x36f002.C28638x8c7ff645.m138000x8dcb33d4(c28580x69eec95e);
    }

    @Override // hq4.a
    /* renamed from: dealContentView */
    public abstract /* synthetic */ void mo8717x2105eeb2(android.view.View view);

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: detachFromFlutterEngine */
    public void mo136992xf8d3d6a1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "FlutterActivity " + this + " connection to the engine " + m137357xf7af55c8() + " evicted by another attaching activity");
        m137351x41012807();
    }

    @Override // hq4.a
    /* renamed from: finish */
    public abstract /* synthetic */ void mo8718xb4098c93();

    /* renamed from: fixResources */
    public void m137355xa6411990(android.content.res.Resources resources) {
        mo137361xdbc81d79(resources.getConfiguration());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getActivity */
    public android.app.Activity mo136993x19263085() {
        return this.f70739xf8b181a5;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getAppBundlePath */
    public java.lang.String mo136994x67b29512() {
        java.lang.String dataString;
        if (m137350x14236c98() && "android.intent.action.RUN".equals(this.f70739xf8b181a5.getIntent().getAction()) && (dataString = this.f70739xf8b181a5.getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    /* renamed from: getBackgroundMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode m137356x43aa88e7() {
        return this.f70739xf8b181a5.getIntent().hasExtra("background_mode") ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.m137093xdce0328(this.f70739xf8b181a5.getIntent().getStringExtra("background_mode")) : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getCachedEngineGroupId */
    public java.lang.String mo136997xb73e7e20() {
        return this.f70739xf8b181a5.getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getCachedEngineId */
    public java.lang.String mo136998xd9afab35() {
        return this.f70739xf8b181a5.getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getContext */
    public android.content.Context mo136999x76847179() {
        return this.f70739xf8b181a5;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getDartEntrypointArgs */
    public java.util.List<java.lang.String> mo137000x92703db0() {
        return (java.util.List) this.f70739xf8b181a5.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getDartEntrypointFunctionName */
    public java.lang.String mo137001x36e4a056() {
        try {
            android.os.Bundle m137358x60f92cc5 = m137358x60f92cc5();
            java.lang.String string = m137358x60f92cc5 != null ? m137358x60f92cc5.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getDartEntrypointLibraryUri */
    public java.lang.String mo137002xf14fed44() {
        try {
            android.os.Bundle m137358x60f92cc5 = m137358x60f92cc5();
            if (m137358x60f92cc5 != null) {
                return m137358x60f92cc5.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getExclusiveAppComponent */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a<android.app.Activity> mo137003x6db07fe4() {
        return this.f70737x30d5dd85;
    }

    /* renamed from: getFlutterEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137357xf7af55c8() {
        return this.f70737x30d5dd85.m137059xf7af55c8();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getFlutterShellArgs */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 mo137005xa48db9e7() {
        return io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.m137775x6f3c52e6(this.f70739xf8b181a5.getIntent());
    }

    @Override // hq4.a
    /* renamed from: getForceOrientation */
    public abstract /* synthetic */ int mo8720x663c095b();

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getInitialRoute */
    public java.lang.String mo137006x47d0e7db() {
        if (this.f70739xf8b181a5.getIntent().hasExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f)) {
            return this.f70739xf8b181a5.getIntent().getStringExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f);
        }
        try {
            android.os.Bundle m137358x60f92cc5 = m137358x60f92cc5();
            if (m137358x60f92cc5 != null) {
                return m137358x60f92cc5.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // hq4.a
    /* renamed from: getLayoutId */
    public abstract /* synthetic */ int mo8721x2ee31f5b();

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f70738xedfae76a;
    }

    /* renamed from: getMetaData */
    public android.os.Bundle m137358x60f92cc5() {
        return this.f70739xf8b181a5.getPackageManager().getActivityInfo(this.f70739xf8b181a5.getComponentName(), 128).metaData;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getRenderMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 mo137009x3569ec4f() {
        return m137356x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getTransparencyMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b mo137010x88a6f491() {
        return m137356x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.opaque : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
    }

    @Override // hq4.a
    /* renamed from: importUIComponents */
    public abstract /* synthetic */ void mo8722xa59964ef(java.util.HashSet hashSet);

    @Override // hq4.a
    /* renamed from: onActivityResult */
    public void mo8723x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (m137352x83ff5edd("onActivityResult")) {
            this.f70737x30d5dd85.m137063x9d4787cb(i17, i18, intent);
        }
    }

    @Override // hq4.a
    /* renamed from: onBackPressed */
    public boolean mo8724xbdc3c5dc() {
        if (!m137352x83ff5edd("onBackPressed")) {
            return true;
        }
        this.f70737x30d5dd85.m137065xbdc3c5dc();
        return true;
    }

    @Override // hq4.a
    /* renamed from: onConfigurationChanged */
    public abstract /* synthetic */ void mo8725x50e1c15d(android.content.res.Configuration configuration);

    @Override // hq4.a
    /* renamed from: onCreate */
    public void mo8726x3e5a77bb(android.os.Bundle bundle) {
        m137353xb090373b();
        this.f70739xf8b181a5.setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575903l9);
        this.f70739xf8b181a5.V6(bundle);
        mo137361xdbc81d79(this.f70739xf8b181a5.getResources().getConfiguration());
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1(this);
        this.f70737x30d5dd85 = c28541x438282c1;
        c28541x438282c1.m137064x3b13c504(this.f70739xf8b181a5);
        this.f70737x30d5dd85.m137074xb949e58d(bundle);
        this.f70738xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
        m137347x496a9d6b();
        this.f70739xf8b181a5.setContentView(m137349xfa44a45());
        m137346xbd6baafd();
    }

    @Override // hq4.a
    /* renamed from: onDestroy */
    public void mo8727xac79a11b() {
        if (m137352x83ff5edd("onDestroy")) {
            m137351x41012807();
        }
        this.f70738xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: onFlutterSurfaceViewCreated */
    public void mo137013xfaf285b3(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 c28550x85bcbf56) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: onFlutterTextureViewCreated */
    public void mo137014x8752ac85(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: onFlutterUiDisplayed */
    public void mo137015x6c956b30() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.f70739xf8b181a5.reportFullyDrawn();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: onFlutterUiNoLongerDisplayed */
    public void mo137016xb9179606() {
    }

    @Override // hq4.a
    /* renamed from: onKeyDown */
    public abstract /* synthetic */ boolean mo8728x1f03f0c2(int i17, android.view.KeyEvent keyEvent);

    @Override // hq4.a
    /* renamed from: onNewIntent */
    public void mo8729xc944513d(android.content.Intent intent) {
        if (m137352x83ff5edd("onNewIntent")) {
            this.f70737x30d5dd85.m137070xc944513d(intent);
        }
    }

    @Override // hq4.a
    /* renamed from: onPause */
    public void mo8730xb01dfb57() {
        if (m137352x83ff5edd("onPause")) {
            this.f70737x30d5dd85.m137071xb01dfb57();
        }
        this.f70738xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
    }

    @Override // hq4.a
    /* renamed from: onPostResume */
    public void mo8731x2517b42c() {
        if (m137352x83ff5edd("onPostResume")) {
            this.f70737x30d5dd85.m137072x2517b42c();
        }
    }

    @Override // hq4.a
    /* renamed from: onRequestPermissionsResult */
    public void mo8732x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (m137352x83ff5edd("onRequestPermissionsResult")) {
            this.f70737x30d5dd85.m137073x953457f1(i17, strArr, iArr);
        }
    }

    @Override // hq4.a
    /* renamed from: onResume */
    public void mo8733x57429eec() {
        this.f70738xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
        if (m137352x83ff5edd("onResume")) {
            this.f70737x30d5dd85.m137075x57429eec();
        }
    }

    /* renamed from: onSaveInstanceState */
    public void m137359xa71a2260(android.os.Bundle bundle) {
        if (m137352x83ff5edd("onSaveInstanceState")) {
            this.f70737x30d5dd85.m137076xa71a2260(bundle);
        }
    }

    @Override // hq4.a
    /* renamed from: onStart */
    public void mo8734xb05099c3() {
        this.f70738xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
        if (m137352x83ff5edd("onStart")) {
            this.f70737x30d5dd85.m137077xb05099c3();
        }
    }

    @Override // hq4.a
    /* renamed from: onStop */
    public void mo8735xc39f8281() {
        if (m137352x83ff5edd("onStop")) {
            this.f70737x30d5dd85.m137078xc39f8281();
        }
        this.f70738xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
    }

    @Override // hq4.a
    /* renamed from: onSwipeBackFinish */
    public /* bridge */ /* synthetic */ void mo8736xe4dc1f55() {
    }

    @Override // hq4.a
    /* renamed from: onTrimMemory */
    public void mo8737x29685b02(int i17) {
        if (m137352x83ff5edd("onTrimMemory")) {
            this.f70737x30d5dd85.m137079x29685b02(i17);
        }
    }

    @Override // hq4.a
    /* renamed from: onUserLeaveHint */
    public boolean mo8738xb1e9ab4() {
        if (!m137352x83ff5edd("onUserLeaveHint")) {
            return true;
        }
        this.f70737x30d5dd85.m137080xb1e9ab4();
        return true;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate
    /* renamed from: popSystemNavigator */
    public boolean mo137017x946ed657() {
        return false;
    }

    @Override // hq4.a
    /* renamed from: provideCustomActivityContentView */
    public abstract /* synthetic */ android.view.View mo8739xa334195d();

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28545x9134f56f
    /* renamed from: provideFlutterEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e mo137018x7b33885d(android.content.Context context) {
        return null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: providePlatformPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 mo137019xa3c24e87(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6(mo136993x19263085(), c28580x69eec95e.m137436x69aaa6da(), this);
    }

    /* renamed from: setDelegate */
    public void m137360xa7687c07(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1) {
        this.f70737x30d5dd85 = c28541x438282c1;
    }

    /* renamed from: setupConfiguration */
    public abstract void mo137361xdbc81d79(android.content.res.Configuration configuration);

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldAttachEngineToActivity */
    public boolean mo137025xbfcd5884() {
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldDestroyEngineWithHost */
    public boolean mo137026x3ea0a97() {
        boolean booleanExtra = this.f70739xf8b181a5.getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (mo136998xd9afab35() != null || this.f70737x30d5dd85.m137061x5e463d06()) ? booleanExtra : this.f70739xf8b181a5.getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldDispatchAppLifecycleState */
    public boolean mo137027x394dbffb() {
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldHandleDeeplinking */
    public boolean mo137028x6be04681() {
        try {
            android.os.Bundle m137358x60f92cc5 = m137358x60f92cc5();
            if (m137358x60f92cc5 != null) {
                return m137358x60f92cc5.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldRestoreAndSaveState */
    public boolean mo137029x96a779f8() {
        return this.f70739xf8b181a5.getIntent().hasExtra("enable_state_restoration") ? this.f70739xf8b181a5.getIntent().getBooleanExtra("enable_state_restoration", false) : mo136998xd9afab35() == null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: updateSystemUiOverlays */
    public void mo137034xef494f4f() {
        if (m137352x83ff5edd("updateSystemUiOverlays")) {
            this.f70737x30d5dd85.m137087xef494f4f();
        }
    }

    private AbstractC28567x8491fc40() {
        this.f70738xedfae76a = new p012xc85e97e9.p093xedfae76a.b0(this, true);
    }
}
