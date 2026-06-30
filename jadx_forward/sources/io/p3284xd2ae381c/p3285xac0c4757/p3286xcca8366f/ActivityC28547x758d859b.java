package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterFragmentActivity */
/* loaded from: classes15.dex */
public class ActivityC28547x758d859b extends p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28545x9134f56f, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3 {

    /* renamed from: FRAGMENT_CONTAINER_ID */
    public static final int f70584x79d18348 = android.view.View.generateViewId();
    private static final java.lang.String TAG = "FlutterFragmentActivity";

    /* renamed from: TAG_FLUTTER_FRAGMENT */
    private static final java.lang.String f70585x2a73d58 = "flutter_fragment";

    /* renamed from: flutterFragment */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c f70586x15efa28c;

    /* renamed from: io.flutter.embedding.android.FlutterFragmentActivity$CachedEngineIntentBuilder */
    /* loaded from: classes11.dex */
    public static class CachedEngineIntentBuilder {

        /* renamed from: activityClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b> f70587xc0af57a9;

        /* renamed from: cachedEngineId */
        private final java.lang.String f70589xeb17de3f;

        /* renamed from: destroyEngineWithActivity */
        private boolean f70590x3e90eef1 = false;

        /* renamed from: backgroundMode */
        private java.lang.String f70588x5512bbf1 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.f70509x9d7e8bf6;

        public CachedEngineIntentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b> cls, java.lang.String str) {
            this.f70587xc0af57a9 = cls;
            this.f70589xeb17de3f = str;
        }

        /* renamed from: backgroundMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.CachedEngineIntentBuilder m137172x5512bbf1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode) {
            this.f70588x5512bbf1 = backgroundMode.name();
            return this;
        }

        /* renamed from: build */
        public android.content.Intent m137173x59bc66e(android.content.Context context) {
            return new android.content.Intent(context, this.f70587xc0af57a9).putExtra("cached_engine_id", this.f70589xeb17de3f).putExtra("destroy_engine_with_activity", this.f70590x3e90eef1).putExtra("background_mode", this.f70588x5512bbf1);
        }

        /* renamed from: destroyEngineWithActivity */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.CachedEngineIntentBuilder m137174x3e90eef1(boolean z17) {
            this.f70590x3e90eef1 = z17;
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterFragmentActivity$NewEngineInGroupIntentBuilder */
    /* loaded from: classes11.dex */
    public static class NewEngineInGroupIntentBuilder {

        /* renamed from: activityClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b> f70591xc0af57a9;

        /* renamed from: cachedEngineGroupId */
        private final java.lang.String f70593x5f0ea156;

        /* renamed from: dartEntrypoint */
        private java.lang.String f70594x819f7d3d = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;

        /* renamed from: initialRoute */
        private java.lang.String f70595xe6de5565 = "/";

        /* renamed from: backgroundMode */
        private java.lang.String f70592x5512bbf1 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.f70509x9d7e8bf6;

        public NewEngineInGroupIntentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b> cls, java.lang.String str) {
            this.f70591xc0af57a9 = cls;
            this.f70593x5f0ea156 = str;
        }

        /* renamed from: backgroundMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineInGroupIntentBuilder m137175x5512bbf1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode) {
            this.f70592x5512bbf1 = backgroundMode.name();
            return this;
        }

        /* renamed from: build */
        public android.content.Intent m137176x59bc66e(android.content.Context context) {
            return new android.content.Intent(context, this.f70591xc0af57a9).putExtra("dart_entrypoint", this.f70594x819f7d3d).putExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f, this.f70595xe6de5565).putExtra("cached_engine_group_id", this.f70593x5f0ea156).putExtra("background_mode", this.f70592x5512bbf1).putExtra("destroy_engine_with_activity", true);
        }

        /* renamed from: dartEntrypoint */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineInGroupIntentBuilder m137177x819f7d3d(java.lang.String str) {
            this.f70594x819f7d3d = str;
            return this;
        }

        /* renamed from: initialRoute */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineInGroupIntentBuilder m137178xe6de5565(java.lang.String str) {
            this.f70595xe6de5565 = str;
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterFragmentActivity$NewEngineIntentBuilder */
    /* loaded from: classes11.dex */
    public static class NewEngineIntentBuilder {

        /* renamed from: activityClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b> f70596xc0af57a9;

        /* renamed from: dartEntrypointArgs */
        private java.util.List<java.lang.String> f70598x7f13dbba;

        /* renamed from: initialRoute */
        private java.lang.String f70599xe6de5565 = "/";

        /* renamed from: backgroundMode */
        private java.lang.String f70597x5512bbf1 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.f70509x9d7e8bf6;

        public NewEngineIntentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b> cls) {
            this.f70596xc0af57a9 = cls;
        }

        /* renamed from: backgroundMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineIntentBuilder m137179x5512bbf1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode) {
            this.f70597x5512bbf1 = backgroundMode.name();
            return this;
        }

        /* renamed from: build */
        public android.content.Intent m137180x59bc66e(android.content.Context context) {
            android.content.Intent putExtra = new android.content.Intent(context, this.f70596xc0af57a9).putExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f, this.f70599xe6de5565).putExtra("background_mode", this.f70597x5512bbf1).putExtra("destroy_engine_with_activity", true);
            if (this.f70598x7f13dbba != null) {
                putExtra.putExtra("dart_entrypoint_args", new java.util.ArrayList(this.f70598x7f13dbba));
            }
            return putExtra;
        }

        /* renamed from: dartEntrypointArgs */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineIntentBuilder m137181x7f13dbba(java.util.List<java.lang.String> list) {
            this.f70598x7f13dbba = list;
            return this;
        }

        /* renamed from: initialRoute */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineIntentBuilder m137182xe6de5565(java.lang.String str) {
            this.f70599xe6de5565 = str;
            return this;
        }
    }

    @java.lang.Deprecated
    /* renamed from: configureStatusBarForFullscreenFlutterExperience */
    private void m137145xbd6baafd() {
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    /* renamed from: configureWindowForTransparency */
    private void m137146x496a9d6b() {
        if (m137157x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
    }

    /* renamed from: createDefaultIntent */
    public static android.content.Intent m137147x89568ca1(android.content.Context context) {
        return m137153xf7eec5dc().m137180x59bc66e(context);
    }

    /* renamed from: createFragmentContainer */
    private android.view.View m137148x234f5a75() {
        android.widget.FrameLayout m137167x76684c2d = m137167x76684c2d(this);
        m137167x76684c2d.setId(f70584x79d18348);
        m137167x76684c2d.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        return m137167x76684c2d;
    }

    /* renamed from: ensureFlutterFragmentCreated */
    private void m137149xacce249a() {
        if (this.f70586x15efa28c == null) {
            this.f70586x15efa28c = m137168xa0185133();
        }
        if (this.f70586x15efa28c == null) {
            this.f70586x15efa28c = m137155xabf21f0();
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
            m7630xb2c12e75.h(f70584x79d18348, this.f70586x15efa28c, f70585x2a73d58, 1);
            m7630xb2c12e75.d();
        }
    }

    /* renamed from: isDebuggable */
    private boolean m137150x14236c98() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: switchLaunchThemeForNormalTheme */
    private void m137151xb090373b() {
        try {
            android.os.Bundle m137165x60f92cc5 = m137165x60f92cc5();
            if (m137165x60f92cc5 != null) {
                int i17 = m137165x60f92cc5.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i17 != -1) {
                    setTheme(i17);
                }
            } else {
                io.p3284xd2ae381c.Log.v(TAG, "Using the launch theme as normal theme.");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            io.p3284xd2ae381c.Log.e(TAG, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
    }

    /* renamed from: withCachedEngine */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.CachedEngineIntentBuilder m137152x37a351ea(java.lang.String str) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.CachedEngineIntentBuilder(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.class, str);
    }

    /* renamed from: withNewEngine */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineIntentBuilder m137153xf7eec5dc() {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineIntentBuilder(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.class);
    }

    /* renamed from: withNewEngineInGroup */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineInGroupIntentBuilder m137154x42d62ade(java.lang.String str) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.NewEngineInGroupIntentBuilder(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28547x758d859b.class, str);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: cleanUpFlutterEngine */
    public void mo29002x72e1151a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: configureFlutterEngine */
    public void mo29003xab73cc38(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c componentCallbacks2C28546xda825a6c = this.f70586x15efa28c;
        if (componentCallbacks2C28546xda825a6c == null || !componentCallbacks2C28546xda825a6c.m137104xb9643684()) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3298x36f002.C28638x8c7ff645.m138000x8dcb33d4(c28580x69eec95e);
        }
    }

    /* renamed from: createFlutterFragment */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c m137155xabf21f0() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode m137157x43aa88e7 = m137157x43aa88e7();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 m137166x3569ec4f = m137166x3569ec4f();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b = m137157x43aa88e7 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.opaque : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
        boolean z17 = m137166x3569ec4f == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
        if (m137159xd9afab35() != null) {
            io.p3284xd2ae381c.Log.v(TAG, "Creating FlutterFragment with cached engine:\nCached engine ID: " + m137159xd9afab35() + "\nWill destroy engine when Activity is destroyed: " + m137170x3ea0a97() + "\nBackground transparency mode: " + m137157x43aa88e7 + "\nWill attach FlutterEngine to Activity: " + m137169xbfcd5884());
            return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.m137100x37a351ea(m137159xd9afab35()).m137115x47293459(m137166x3569ec4f).m137119xe0ce8d1b(enumC28578xae92d13b).m137114xa6595ff4(java.lang.Boolean.valueOf(m137171x6be04681())).m137116xbfcd5884(m137169xbfcd5884()).m137113x3ee7de32(m137170x3ea0a97()).m137118x683e03f8(z17).m137117xe16a5dc4(true).m137111x59bc66e();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Creating FlutterFragment with new engine:\nCached engine group ID: ");
        sb6.append(m137158xb73e7e20());
        sb6.append("\nBackground transparency mode: ");
        sb6.append(m137157x43aa88e7);
        sb6.append("\nDart entrypoint: ");
        sb6.append(m137161x36e4a056());
        sb6.append("\nDart entrypoint library uri: ");
        sb6.append(m137162xf14fed44() != null ? m137162xf14fed44() : "\"\"");
        sb6.append("\nInitial route: ");
        sb6.append(m137164x47d0e7db());
        sb6.append("\nApp bundle path: ");
        sb6.append(m137156x67b29512());
        sb6.append("\nWill attach FlutterEngine to Activity: ");
        sb6.append(m137169xbfcd5884());
        io.p3284xd2ae381c.Log.v(TAG, sb6.toString());
        return m137158xb73e7e20() != null ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.m137102x42d62ade(m137158xb73e7e20()).m137136x819f7d3d(m137161x36e4a056()).m137138xe6de5565(m137164x47d0e7db()).m137137xa6595ff4(m137171x6be04681()).m137139x47293459(m137166x3569ec4f).m137143xe0ce8d1b(enumC28578xae92d13b).m137140xbfcd5884(m137169xbfcd5884()).m137142x683e03f8(z17).m137141xe16a5dc4(true).m137134x59bc66e() : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.m137101xf7eec5dc().m137123x819f7d3d(m137161x36e4a056()).m137125xd3a26390(m137162xf14fed44()).m137124x7f13dbba(m137160x92703db0()).m137128xe6de5565(m137164x47d0e7db()).m137120xaa52d8c8(m137156x67b29512()).m137126xfcb55271(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.m137775x6f3c52e6(getIntent())).m137127xa6595ff4(java.lang.Boolean.valueOf(m137171x6be04681())).m137129x47293459(m137166x3569ec4f).m137133xe0ce8d1b(enumC28578xae92d13b).m137130xbfcd5884(m137169xbfcd5884()).m137132x683e03f8(z17).m137131xe16a5dc4(true).m137121x59bc66e();
    }

    /* renamed from: getAppBundlePath */
    public java.lang.String m137156x67b29512() {
        java.lang.String dataString;
        if (m137150x14236c98() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    /* renamed from: getBackgroundMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode m137157x43aa88e7() {
        return getIntent().hasExtra("background_mode") ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.m137093xdce0328(getIntent().getStringExtra("background_mode")) : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque;
    }

    /* renamed from: getCachedEngineGroupId */
    public java.lang.String m137158xb73e7e20() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    /* renamed from: getCachedEngineId */
    public java.lang.String m137159xd9afab35() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    /* renamed from: getDartEntrypointArgs */
    public java.util.List<java.lang.String> m137160x92703db0() {
        return (java.util.List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    /* renamed from: getDartEntrypointFunctionName */
    public java.lang.String m137161x36e4a056() {
        try {
            android.os.Bundle m137165x60f92cc5 = m137165x60f92cc5();
            java.lang.String string = m137165x60f92cc5 != null ? m137165x60f92cc5.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        }
    }

    /* renamed from: getDartEntrypointLibraryUri */
    public java.lang.String m137162xf14fed44() {
        try {
            android.os.Bundle m137165x60f92cc5 = m137165x60f92cc5();
            if (m137165x60f92cc5 != null) {
                return m137165x60f92cc5.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: getFlutterEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137163xf7af55c8() {
        return this.f70586x15efa28c.m137103xf7af55c8();
    }

    /* renamed from: getInitialRoute */
    public java.lang.String m137164x47d0e7db() {
        if (getIntent().hasExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f)) {
            return getIntent().getStringExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f);
        }
        try {
            android.os.Bundle m137165x60f92cc5 = m137165x60f92cc5();
            if (m137165x60f92cc5 != null) {
                return m137165x60f92cc5.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: getMetaData */
    public android.os.Bundle m137165x60f92cc5() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    /* renamed from: getRenderMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 m137166x3569ec4f() {
        return m137157x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f70586x15efa28c.mo7496x9d4787cb(i17, i18, intent);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        this.f70586x15efa28c.m137105xbdc3c5dc();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m137151xb090373b();
        this.f70586x15efa28c = m137168xa0185133();
        super.onCreate(bundle);
        m137146x496a9d6b();
        setContentView(m137148x234f5a75());
        m137145xbd6baafd();
        m137149xacce249a();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        this.f70586x15efa28c.m137106xc944513d(intent);
        super.onNewIntent(intent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f70586x15efa28c.m137107x2517b42c();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        this.f70586x15efa28c.mo7516x953457f1(i17, strArr, iArr);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        this.f70586x15efa28c.onTrimMemory(i17);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onUserLeaveHint() {
        this.f70586x15efa28c.m137108xb1e9ab4();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28545x9134f56f
    /* renamed from: provideFlutterEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e mo137018x7b33885d(android.content.Context context) {
        return null;
    }

    /* renamed from: provideRootLayout */
    public android.widget.FrameLayout m137167x76684c2d(android.content.Context context) {
        return new android.widget.FrameLayout(context);
    }

    /* renamed from: retrieveExistingFlutterFragmentIfPossible */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c m137168xa0185133() {
        return (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c) mo7595x9cdc264().m7665x7a44761a(f70585x2a73d58);
    }

    /* renamed from: shouldAttachEngineToActivity */
    public boolean m137169xbfcd5884() {
        return true;
    }

    /* renamed from: shouldDestroyEngineWithHost */
    public boolean m137170x3ea0a97() {
        return getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    }

    /* renamed from: shouldHandleDeeplinking */
    public boolean m137171x6be04681() {
        try {
            return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.m137090x3772055b(m137165x60f92cc5());
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
