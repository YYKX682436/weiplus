package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterFragment */
/* loaded from: classes15.dex */
public class ComponentCallbacks2C28546xda825a6c extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, android.content.ComponentCallbacks2, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.DelegateFactory {

    /* renamed from: ARG_APP_BUNDLE_PATH */
    protected static final java.lang.String f70529x8098fc7b = "app_bundle_path";

    /* renamed from: ARG_CACHED_ENGINE_GROUP_ID */
    protected static final java.lang.String f70530x22965764 = "cached_engine_group_id";

    /* renamed from: ARG_CACHED_ENGINE_ID */
    protected static final java.lang.String f70531x40ba4444 = "cached_engine_id";

    /* renamed from: ARG_DART_ENTRYPOINT */
    protected static final java.lang.String f70532x50a6f115 = "dart_entrypoint";

    /* renamed from: ARG_DART_ENTRYPOINT_ARGS */
    protected static final java.lang.String f70533x9036f5c7 = "dart_entrypoint_args";

    /* renamed from: ARG_DART_ENTRYPOINT_URI */
    protected static final java.lang.String f70534xd31ad722 = "dart_entrypoint_uri";

    /* renamed from: ARG_DESTROY_ENGINE_WITH_FRAGMENT */
    protected static final java.lang.String f70535x40f8fb1a = "destroy_engine_with_fragment";

    /* renamed from: ARG_ENABLE_STATE_RESTORATION */
    protected static final java.lang.String f70536xf6c113dd = "enable_state_restoration";

    /* renamed from: ARG_FLUTTERVIEW_RENDER_MODE */
    protected static final java.lang.String f70537x5bd31105 = "flutterview_render_mode";

    /* renamed from: ARG_FLUTTERVIEW_TRANSPARENCY_MODE */
    protected static final java.lang.String f70538x623d75c3 = "flutterview_transparency_mode";

    /* renamed from: ARG_FLUTTER_INITIALIZATION_ARGS */
    protected static final java.lang.String f70539xc8ba71d0 = "initialization_args";

    /* renamed from: ARG_HANDLE_DEEPLINKING */
    protected static final java.lang.String f70540x56bc282e = "handle_deeplinking";

    /* renamed from: ARG_INITIAL_ROUTE */
    protected static final java.lang.String f70541x749ecf05 = "initial_route";

    /* renamed from: ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY */
    protected static final java.lang.String f70542xc13fc76d = "should_attach_engine_to_activity";

    /* renamed from: ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED */
    protected static final java.lang.String f70543x4105e9b2 = "should_automatically_handle_on_back_pressed";

    /* renamed from: ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW */
    protected static final java.lang.String f70544xdab04c0 = "should_delay_first_android_view_draw";

    /* renamed from: FLUTTER_VIEW_ID */
    public static final int f70545x5ad2abb2 = android.view.View.generateViewId();
    private static final java.lang.String TAG = "FlutterFragment";

    /* renamed from: delegate */
    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 f70546x30d5dd85;

    /* renamed from: onWindowFocusChangeListener */
    private final android.view.ViewTreeObserver.OnWindowFocusChangeListener f70549xa0f1b44d = new android.view.ViewTreeObserver.OnWindowFocusChangeListener() { // from class: io.flutter.embedding.android.FlutterFragment.1
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z17) {
            if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.this.m137099x83ff5edd("onWindowFocusChanged")) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.this.f70546x30d5dd85.m137081xa4ec7b0b(z17);
            }
        }
    };

    /* renamed from: delegateFactory */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.DelegateFactory f70547xa3679bc5 = this;

    /* renamed from: onBackPressedCallback */
    final p012xc85e97e9.p013x9d4bf30f.g f70548x5894ae41 = new p012xc85e97e9.p013x9d4bf30f.g(true) { // from class: io.flutter.embedding.android.FlutterFragment.2
        @Override // p012xc85e97e9.p013x9d4bf30f.g
        /* renamed from: handleOnBackPressed */
        public void mo2523xc0eac894() {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.this.m137105xbdc3c5dc();
        }
    };

    /* renamed from: io.flutter.embedding.android.FlutterFragment$ActivityCallThrough */
    /* loaded from: classes14.dex */
    public @interface ActivityCallThrough {
    }

    /* renamed from: io.flutter.embedding.android.FlutterFragment$CachedEngineFragmentBuilder */
    /* loaded from: classes15.dex */
    public static class CachedEngineFragmentBuilder {

        /* renamed from: destroyEngineWithFragment */
        private boolean f70552x3ee7de32;

        /* renamed from: engineId */
        private final java.lang.String f70553x6c827afd;

        /* renamed from: fragmentClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c> f70554xcb40c908;

        /* renamed from: handleDeeplinking */
        private boolean f70555xa6595ff4;

        /* renamed from: renderMode */
        private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f70556x47293459;

        /* renamed from: shouldAttachEngineToActivity */
        private boolean f70557xbfcd5884;

        /* renamed from: shouldAutomaticallyHandleOnBackPressed */
        private boolean f70558xe16a5dc4;

        /* renamed from: shouldDelayFirstAndroidViewDraw */
        private boolean f70559x683e03f8;

        /* renamed from: transparencyMode */
        private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b f70560xe0ce8d1b;

        /* renamed from: build */
        public <T extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c> T m137111x59bc66e() {
            try {
                T t17 = (T) this.f70554xcb40c908.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                if (t17 != null) {
                    t17.mo7562xe26dab14(m137112x519407f9());
                    return t17;
                }
                throw new java.lang.RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.f70554xcb40c908.getCanonicalName() + ") does not match the expected return type.");
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException("Could not instantiate FlutterFragment subclass (" + this.f70554xcb40c908.getName() + ")", e17);
            }
        }

        /* renamed from: createArgs */
        public android.os.Bundle m137112x519407f9() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70531x40ba4444, this.f70553x6c827afd);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70535x40f8fb1a, this.f70552x3ee7de32);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70540x56bc282e, this.f70555xa6595ff4);
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f70556x47293459;
            if (enumC28568xbdfb1079 == null) {
                enumC28568xbdfb1079 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
            }
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70537x5bd31105, enumC28568xbdfb1079.name());
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b = this.f70560xe0ce8d1b;
            if (enumC28578xae92d13b == null) {
                enumC28578xae92d13b = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
            }
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70538x623d75c3, enumC28578xae92d13b.name());
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70542xc13fc76d, this.f70557xbfcd5884);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70543x4105e9b2, this.f70558xe16a5dc4);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70544xdab04c0, this.f70559x683e03f8);
            return bundle;
        }

        /* renamed from: destroyEngineWithFragment */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.CachedEngineFragmentBuilder m137113x3ee7de32(boolean z17) {
            this.f70552x3ee7de32 = z17;
            return this;
        }

        /* renamed from: handleDeeplinking */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.CachedEngineFragmentBuilder m137114xa6595ff4(java.lang.Boolean bool) {
            this.f70555xa6595ff4 = bool.booleanValue();
            return this;
        }

        /* renamed from: renderMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.CachedEngineFragmentBuilder m137115x47293459(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079) {
            this.f70556x47293459 = enumC28568xbdfb1079;
            return this;
        }

        /* renamed from: shouldAttachEngineToActivity */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.CachedEngineFragmentBuilder m137116xbfcd5884(boolean z17) {
            this.f70557xbfcd5884 = z17;
            return this;
        }

        /* renamed from: shouldAutomaticallyHandleOnBackPressed */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.CachedEngineFragmentBuilder m137117xe16a5dc4(boolean z17) {
            this.f70558xe16a5dc4 = z17;
            return this;
        }

        /* renamed from: shouldDelayFirstAndroidViewDraw */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.CachedEngineFragmentBuilder m137118x683e03f8(boolean z17) {
            this.f70559x683e03f8 = z17;
            return this;
        }

        /* renamed from: transparencyMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.CachedEngineFragmentBuilder m137119xe0ce8d1b(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b) {
            this.f70560xe0ce8d1b = enumC28578xae92d13b;
            return this;
        }

        private CachedEngineFragmentBuilder(java.lang.String str) {
            this((java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c>) io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.class, str);
        }

        public CachedEngineFragmentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c> cls, java.lang.String str) {
            this.f70552x3ee7de32 = false;
            this.f70555xa6595ff4 = false;
            this.f70556x47293459 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
            this.f70560xe0ce8d1b = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
            this.f70557xbfcd5884 = true;
            this.f70558xe16a5dc4 = false;
            this.f70559x683e03f8 = false;
            this.f70554xcb40c908 = cls;
            this.f70553x6c827afd = str;
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterFragment$NewEngineInGroupFragmentBuilder */
    /* loaded from: classes15.dex */
    public static class NewEngineInGroupFragmentBuilder {

        /* renamed from: cachedEngineGroupId */
        private final java.lang.String f70574x5f0ea156;

        /* renamed from: dartEntrypoint */
        private java.lang.String f70575x819f7d3d;

        /* renamed from: fragmentClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c> f70576xcb40c908;

        /* renamed from: handleDeeplinking */
        private boolean f70577xa6595ff4;

        /* renamed from: initialRoute */
        private java.lang.String f70578xe6de5565;

        /* renamed from: renderMode */
        private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f70579x47293459;

        /* renamed from: shouldAttachEngineToActivity */
        private boolean f70580xbfcd5884;

        /* renamed from: shouldAutomaticallyHandleOnBackPressed */
        private boolean f70581xe16a5dc4;

        /* renamed from: shouldDelayFirstAndroidViewDraw */
        private boolean f70582x683e03f8;

        /* renamed from: transparencyMode */
        private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b f70583xe0ce8d1b;

        public NewEngineInGroupFragmentBuilder(java.lang.String str) {
            this(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.class, str);
        }

        /* renamed from: build */
        public <T extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c> T m137134x59bc66e() {
            try {
                T t17 = (T) this.f70576xcb40c908.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                if (t17 != null) {
                    t17.mo7562xe26dab14(m137135x519407f9());
                    return t17;
                }
                throw new java.lang.RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.f70576xcb40c908.getCanonicalName() + ") does not match the expected return type.");
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException("Could not instantiate FlutterFragment subclass (" + this.f70576xcb40c908.getName() + ")", e17);
            }
        }

        /* renamed from: createArgs */
        public android.os.Bundle m137135x519407f9() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70530x22965764, this.f70574x5f0ea156);
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70532x50a6f115, this.f70575x819f7d3d);
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70541x749ecf05, this.f70578xe6de5565);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70540x56bc282e, this.f70577xa6595ff4);
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f70579x47293459;
            if (enumC28568xbdfb1079 == null) {
                enumC28568xbdfb1079 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
            }
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70537x5bd31105, enumC28568xbdfb1079.name());
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b = this.f70583xe0ce8d1b;
            if (enumC28578xae92d13b == null) {
                enumC28578xae92d13b = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
            }
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70538x623d75c3, enumC28578xae92d13b.name());
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70542xc13fc76d, this.f70580xbfcd5884);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70535x40f8fb1a, true);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70543x4105e9b2, this.f70581xe16a5dc4);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70544xdab04c0, this.f70582x683e03f8);
            return bundle;
        }

        /* renamed from: dartEntrypoint */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder m137136x819f7d3d(java.lang.String str) {
            this.f70575x819f7d3d = str;
            return this;
        }

        /* renamed from: handleDeeplinking */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder m137137xa6595ff4(boolean z17) {
            this.f70577xa6595ff4 = z17;
            return this;
        }

        /* renamed from: initialRoute */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder m137138xe6de5565(java.lang.String str) {
            this.f70578xe6de5565 = str;
            return this;
        }

        /* renamed from: renderMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder m137139x47293459(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079) {
            this.f70579x47293459 = enumC28568xbdfb1079;
            return this;
        }

        /* renamed from: shouldAttachEngineToActivity */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder m137140xbfcd5884(boolean z17) {
            this.f70580xbfcd5884 = z17;
            return this;
        }

        /* renamed from: shouldAutomaticallyHandleOnBackPressed */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder m137141xe16a5dc4(boolean z17) {
            this.f70581xe16a5dc4 = z17;
            return this;
        }

        /* renamed from: shouldDelayFirstAndroidViewDraw */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder m137142x683e03f8(boolean z17) {
            this.f70582x683e03f8 = z17;
            return this;
        }

        /* renamed from: transparencyMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder m137143xe0ce8d1b(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b) {
            this.f70583xe0ce8d1b = enumC28578xae92d13b;
            return this;
        }

        public NewEngineInGroupFragmentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c> cls, java.lang.String str) {
            this.f70575x819f7d3d = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
            this.f70578xe6de5565 = "/";
            this.f70577xa6595ff4 = false;
            this.f70579x47293459 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
            this.f70583xe0ce8d1b = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
            this.f70580xbfcd5884 = true;
            this.f70581xe16a5dc4 = false;
            this.f70582x683e03f8 = false;
            this.f70576xcb40c908 = cls;
            this.f70574x5f0ea156 = str;
        }
    }

    public ComponentCallbacks2C28546xda825a6c() {
        mo7562xe26dab14(new android.os.Bundle());
    }

    /* renamed from: createDefault */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c m137098xe1faf9a5() {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder().m137121x59bc66e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: stillAttachedForEvent */
    public boolean m137099x83ff5edd(java.lang.String str) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70546x30d5dd85;
        if (c28541x438282c1 == null) {
            io.p3284xd2ae381c.Log.w(TAG, "FlutterFragment " + m7479x8cdac1b() + " " + str + " called after release.");
            return false;
        }
        if (c28541x438282c1.m137060xf0d424ee()) {
            return true;
        }
        io.p3284xd2ae381c.Log.w(TAG, "FlutterFragment " + m7479x8cdac1b() + " " + str + " called after detach.");
        return false;
    }

    /* renamed from: withCachedEngine */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.CachedEngineFragmentBuilder m137100x37a351ea(java.lang.String str) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.CachedEngineFragmentBuilder(str);
    }

    /* renamed from: withNewEngine */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137101xf7eec5dc() {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder();
    }

    /* renamed from: withNewEngineInGroup */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder m137102x42d62ade(java.lang.String str) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineInGroupFragmentBuilder(str);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: attachToEngineAutomatically */
    public boolean mo136989x169db8c1() {
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: cleanUpFlutterEngine */
    public void mo29002x72e1151a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3) {
            ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3) mo7430x19263085).mo29002x72e1151a(c28580x69eec95e);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: configureFlutterEngine */
    public void mo29003xab73cc38(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3) {
            ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3) mo7430x19263085).mo29003xab73cc38(c28580x69eec95e);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.DelegateFactory
    /* renamed from: createDelegate */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 mo137088x67d326a1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host host) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1(host);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: detachFromFlutterEngine */
    public void mo136992xf8d3d6a1() {
        io.p3284xd2ae381c.Log.w(TAG, "FlutterFragment " + this + " connection to the engine " + m137103xf7af55c8() + " evicted by another attaching activity");
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70546x30d5dd85;
        if (c28541x438282c1 != null) {
            c28541x438282c1.m137067xa6664a60();
            this.f70546x30d5dd85.m137068x3f5eee52();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, ox5.l
    /* renamed from: getActivity */
    public /* bridge */ /* synthetic */ android.app.Activity m29017x19263085() {
        return super.mo7430x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getAppBundlePath */
    public java.lang.String mo136994x67b29512() {
        return m7436x8619eaa0().getString(f70529x8098fc7b);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getBackCallbackState */
    public boolean mo136995x590b38ef() {
        return this.f70548x5894ae41.m2524x7d80d2b7();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getCachedEngineGroupId */
    public java.lang.String mo136997xb73e7e20() {
        return m7436x8619eaa0().getString(f70530x22965764, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getCachedEngineId */
    public java.lang.String mo136998xd9afab35() {
        return m7436x8619eaa0().getString(f70531x40ba4444, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getDartEntrypointArgs */
    public java.util.List<java.lang.String> mo137000x92703db0() {
        return m7436x8619eaa0().getStringArrayList(f70533x9036f5c7);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getDartEntrypointFunctionName */
    public java.lang.String mo137001x36e4a056() {
        return m7436x8619eaa0().getString(f70532x50a6f115, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getDartEntrypointLibraryUri */
    public java.lang.String mo137002xf14fed44() {
        return m7436x8619eaa0().getString(f70534xd31ad722);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getExclusiveAppComponent */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a<android.app.Activity> mo137003x6db07fe4() {
        return this.f70546x30d5dd85;
    }

    /* renamed from: getFlutterEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137103xf7af55c8() {
        return this.f70546x30d5dd85.m137059xf7af55c8();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getFlutterShellArgs */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 mo137005xa48db9e7() {
        java.lang.String[] stringArray = m7436x8619eaa0().getStringArray(f70539xc8ba71d0);
        if (stringArray == null) {
            stringArray = new java.lang.String[0];
        }
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691(stringArray);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getInitialRoute */
    public java.lang.String mo137006x47d0e7db() {
        return m7436x8619eaa0().getString(f70541x749ecf05);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getRenderMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 mo137009x3569ec4f() {
        return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.m137370xdce0328(m7436x8619eaa0().getString(f70537x5bd31105, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface.name()));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getTransparencyMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b mo137010x88a6f491() {
        return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.m137401xdce0328(m7436x8619eaa0().getString(f70538x623d75c3, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent.name()));
    }

    /* renamed from: isFlutterEngineInjected */
    public boolean m137104xb9643684() {
        return this.f70546x30d5dd85.m137061x5e463d06();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (m137099x83ff5edd("onActivityResult")) {
            this.f70546x30d5dd85.m137063x9d4787cb(i17, i18, intent);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        super.mo7397x3b13c504(context);
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 mo137088x67d326a1 = this.f70547xa3679bc5.mo137088x67d326a1(this);
        this.f70546x30d5dd85 = mo137088x67d326a1;
        mo137088x67d326a1.m137064x3b13c504(context);
        if (m7436x8619eaa0().getBoolean(f70543x4105e9b2, false)) {
            m7548xe6e42394().mo2510x96a7816d().a(this, this.f70548x5894ae41);
            this.f70548x5894ae41.m2527x514e147f(false);
        }
        context.registerComponentCallbacks(this);
    }

    /* renamed from: onBackPressed */
    public void m137105xbdc3c5dc() {
        if (m137099x83ff5edd("onBackPressed")) {
            this.f70546x30d5dd85.m137065xbdc3c5dc();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        if (bundle != null) {
            this.f70548x5894ae41.m2527x514e147f(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        this.f70546x30d5dd85.m137074xb949e58d(bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return this.f70546x30d5dd85.m137066x18bad100(layoutInflater, viewGroup, bundle, f70545x5ad2abb2, m137110x683e03f8());
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        m7554x159e75aa().getViewTreeObserver().removeOnWindowFocusChangeListener(this.f70549xa0f1b44d);
        if (m137099x83ff5edd("onDestroyView")) {
            this.f70546x30d5dd85.m137067xa6664a60();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDetach */
    public void mo7400x3f5eee52() {
        mo7438x76847179().unregisterComponentCallbacks(this);
        super.mo7400x3f5eee52();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70546x30d5dd85;
        if (c28541x438282c1 != null) {
            c28541x438282c1.m137068x3f5eee52();
            this.f70546x30d5dd85.m137082x41012807();
            this.f70546x30d5dd85 = null;
        } else {
            io.p3284xd2ae381c.Log.v(TAG, "FlutterFragment " + this + " onDetach called after release.");
        }
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
        p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) {
            ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) mo7430x19263085).mo2121x6c956b30();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: onFlutterUiNoLongerDisplayed */
    public void mo137016xb9179606() {
        p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) {
            ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) mo7430x19263085).mo2122xb9179606();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onMultiWindowModeChanged */
    public void mo7509xd5c30607(boolean z17) {
        if (m137099x83ff5edd("onMultiWindowModeChanged")) {
            this.f70546x30d5dd85.m137069xd5c30607(z17);
        }
    }

    /* renamed from: onNewIntent */
    public void m137106xc944513d(android.content.Intent intent) {
        if (m137099x83ff5edd("onNewIntent")) {
            this.f70546x30d5dd85.m137070xc944513d(intent);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        if (m137099x83ff5edd("onPause")) {
            this.f70546x30d5dd85.m137071xb01dfb57();
        }
    }

    /* renamed from: onPostResume */
    public void m137107x2517b42c() {
        if (m137099x83ff5edd("onPostResume")) {
            this.f70546x30d5dd85.m137072x2517b42c();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onRequestPermissionsResult */
    public void mo7516x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (m137099x83ff5edd("onRequestPermissionsResult")) {
            this.f70546x30d5dd85.m137073x953457f1(i17, strArr, iArr);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        if (m137099x83ff5edd("onResume")) {
            this.f70546x30d5dd85.m137075x57429eec();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
        if (m137099x83ff5edd("onSaveInstanceState")) {
            this.f70546x30d5dd85.m137076xa71a2260(bundle);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        if (m137099x83ff5edd("onStart")) {
            this.f70546x30d5dd85.m137077xb05099c3();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        if (m137099x83ff5edd("onStop")) {
            this.f70546x30d5dd85.m137078xc39f8281();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        if (m137099x83ff5edd("onTrimMemory")) {
            this.f70546x30d5dd85.m137079x29685b02(i17);
        }
    }

    /* renamed from: onUserLeaveHint */
    public void m137108xb1e9ab4() {
        if (m137099x83ff5edd("onUserLeaveHint")) {
            this.f70546x30d5dd85.m137080xb1e9ab4();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        super.mo7518x594b1124(view, bundle);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f70549xa0f1b44d);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate
    /* renamed from: popSystemNavigator */
    public boolean mo137017x946ed657() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085;
        if (!m7436x8619eaa0().getBoolean(f70543x4105e9b2, false) || (mo7430x19263085 = mo7430x19263085()) == null) {
            return false;
        }
        boolean m2524x7d80d2b7 = this.f70548x5894ae41.m2524x7d80d2b7();
        if (m2524x7d80d2b7) {
            this.f70548x5894ae41.m2527x514e147f(false);
        }
        mo7430x19263085.mo2510x96a7816d().c();
        if (m2524x7d80d2b7) {
            this.f70548x5894ae41.m2527x514e147f(true);
        }
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28545x9134f56f
    /* renamed from: provideFlutterEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e mo137018x7b33885d(android.content.Context context) {
        p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = mo7430x19263085();
        if (!(mo7430x19263085 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28545x9134f56f)) {
            return null;
        }
        io.p3284xd2ae381c.Log.v(TAG, "Deferring to attached Activity to provide a FlutterEngine.");
        return ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28545x9134f56f) mo7430x19263085).mo137018x7b33885d(mo7438x76847179());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: providePlatformPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 mo137019xa3c24e87(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        if (activity != null) {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6(mo7430x19263085(), c28580x69eec95e.m137436x69aaa6da(), this);
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: provideSensitiveContentPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5.C28747xd0ac0236 mo137020xc304b217(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        if (activity != null) {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5.C28747xd0ac0236(f70545x5ad2abb2, activity, c28580x69eec95e.m137444xa36cda4a());
        }
        return null;
    }

    /* renamed from: setDelegateFactory */
    public void m137109xbea00703(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.DelegateFactory delegateFactory) {
        this.f70547xa3679bc5 = delegateFactory;
        this.f70546x30d5dd85 = delegateFactory.mo137088x67d326a1(this);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate
    /* renamed from: setFrameworkHandlesBack */
    public void mo137024xb9d44976(boolean z17) {
        if (m7436x8619eaa0().getBoolean(f70543x4105e9b2, false)) {
            this.f70548x5894ae41.m2527x514e147f(z17);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldAttachEngineToActivity */
    public boolean mo137025xbfcd5884() {
        return m7436x8619eaa0().getBoolean(f70542xc13fc76d);
    }

    /* renamed from: shouldDelayFirstAndroidViewDraw */
    public boolean m137110x683e03f8() {
        return m7436x8619eaa0().getBoolean(f70544xdab04c0);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldDestroyEngineWithHost */
    public boolean mo137026x3ea0a97() {
        boolean z17 = m7436x8619eaa0().getBoolean(f70535x40f8fb1a, false);
        return (mo136998xd9afab35() != null || this.f70546x30d5dd85.m137061x5e463d06()) ? z17 : m7436x8619eaa0().getBoolean(f70535x40f8fb1a, true);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldDispatchAppLifecycleState */
    public boolean mo137027x394dbffb() {
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldHandleDeeplinking */
    public boolean mo137028x6be04681() {
        return m7436x8619eaa0().getBoolean(f70540x56bc282e);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldRestoreAndSaveState */
    public boolean mo137029x96a779f8() {
        return m7436x8619eaa0().containsKey(f70536xf6c113dd) ? m7436x8619eaa0().getBoolean(f70536xf6c113dd) : mo136998xd9afab35() == null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: updateSystemUiOverlays */
    public void mo137034xef494f4f() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70546x30d5dd85;
        if (c28541x438282c1 != null) {
            c28541x438282c1.m137087xef494f4f();
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterFragment$NewEngineFragmentBuilder */
    /* loaded from: classes15.dex */
    public static class NewEngineFragmentBuilder {

        /* renamed from: appBundlePath */
        private java.lang.String f70561xaa52d8c8;

        /* renamed from: dartEntrypoint */
        private java.lang.String f70562x819f7d3d;

        /* renamed from: dartEntrypointArgs */
        private java.util.List<java.lang.String> f70563x7f13dbba;

        /* renamed from: dartLibraryUri */
        private java.lang.String f70564xd3a26390;

        /* renamed from: fragmentClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c> f70565xcb40c908;

        /* renamed from: handleDeeplinking */
        private boolean f70566xa6595ff4;

        /* renamed from: initialRoute */
        private java.lang.String f70567xe6de5565;

        /* renamed from: renderMode */
        private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f70568x47293459;

        /* renamed from: shellArgs */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 f70569x6b6a0b2d;

        /* renamed from: shouldAttachEngineToActivity */
        private boolean f70570xbfcd5884;

        /* renamed from: shouldAutomaticallyHandleOnBackPressed */
        private boolean f70571xe16a5dc4;

        /* renamed from: shouldDelayFirstAndroidViewDraw */
        private boolean f70572x683e03f8;

        /* renamed from: transparencyMode */
        private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b f70573xe0ce8d1b;

        public NewEngineFragmentBuilder() {
            this.f70562x819f7d3d = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
            this.f70564xd3a26390 = null;
            this.f70567xe6de5565 = "/";
            this.f70566xa6595ff4 = false;
            this.f70561xaa52d8c8 = null;
            this.f70569x6b6a0b2d = null;
            this.f70568x47293459 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
            this.f70573xe0ce8d1b = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
            this.f70570xbfcd5884 = true;
            this.f70571xe16a5dc4 = false;
            this.f70572x683e03f8 = false;
            this.f70565xcb40c908 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.class;
        }

        /* renamed from: appBundlePath */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137120xaa52d8c8(java.lang.String str) {
            this.f70561xaa52d8c8 = str;
            return this;
        }

        /* renamed from: build */
        public <T extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c> T m137121x59bc66e() {
            try {
                T t17 = (T) this.f70565xcb40c908.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                if (t17 != null) {
                    t17.mo7562xe26dab14(m137122x519407f9());
                    return t17;
                }
                throw new java.lang.RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.f70565xcb40c908.getCanonicalName() + ") does not match the expected return type.");
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException("Could not instantiate FlutterFragment subclass (" + this.f70565xcb40c908.getName() + ")", e17);
            }
        }

        /* renamed from: createArgs */
        public android.os.Bundle m137122x519407f9() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70541x749ecf05, this.f70567xe6de5565);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70540x56bc282e, this.f70566xa6595ff4);
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70529x8098fc7b, this.f70561xaa52d8c8);
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70532x50a6f115, this.f70562x819f7d3d);
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70534xd31ad722, this.f70564xd3a26390);
            bundle.putStringArrayList(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70533x9036f5c7, this.f70563x7f13dbba != null ? new java.util.ArrayList<>(this.f70563x7f13dbba) : null);
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 c28590xca799691 = this.f70569x6b6a0b2d;
            if (c28590xca799691 != null) {
                bundle.putStringArray(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70539xc8ba71d0, c28590xca799691.m137777xb986489e());
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f70568x47293459;
            if (enumC28568xbdfb1079 == null) {
                enumC28568xbdfb1079 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
            }
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70537x5bd31105, enumC28568xbdfb1079.name());
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b = this.f70573xe0ce8d1b;
            if (enumC28578xae92d13b == null) {
                enumC28578xae92d13b = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
            }
            bundle.putString(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70538x623d75c3, enumC28578xae92d13b.name());
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70542xc13fc76d, this.f70570xbfcd5884);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70535x40f8fb1a, true);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70543x4105e9b2, this.f70571xe16a5dc4);
            bundle.putBoolean(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.f70544xdab04c0, this.f70572x683e03f8);
            return bundle;
        }

        /* renamed from: dartEntrypoint */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137123x819f7d3d(java.lang.String str) {
            this.f70562x819f7d3d = str;
            return this;
        }

        /* renamed from: dartEntrypointArgs */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137124x7f13dbba(java.util.List<java.lang.String> list) {
            this.f70563x7f13dbba = list;
            return this;
        }

        /* renamed from: dartLibraryUri */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137125xd3a26390(java.lang.String str) {
            this.f70564xd3a26390 = str;
            return this;
        }

        /* renamed from: flutterShellArgs */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137126xfcb55271(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 c28590xca799691) {
            this.f70569x6b6a0b2d = c28590xca799691;
            return this;
        }

        /* renamed from: handleDeeplinking */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137127xa6595ff4(java.lang.Boolean bool) {
            this.f70566xa6595ff4 = bool.booleanValue();
            return this;
        }

        /* renamed from: initialRoute */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137128xe6de5565(java.lang.String str) {
            this.f70567xe6de5565 = str;
            return this;
        }

        /* renamed from: renderMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137129x47293459(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079) {
            this.f70568x47293459 = enumC28568xbdfb1079;
            return this;
        }

        /* renamed from: shouldAttachEngineToActivity */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137130xbfcd5884(boolean z17) {
            this.f70570xbfcd5884 = z17;
            return this;
        }

        /* renamed from: shouldAutomaticallyHandleOnBackPressed */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137131xe16a5dc4(boolean z17) {
            this.f70571xe16a5dc4 = z17;
            return this;
        }

        /* renamed from: shouldDelayFirstAndroidViewDraw */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137132x683e03f8(boolean z17) {
            this.f70572x683e03f8 = z17;
            return this;
        }

        /* renamed from: transparencyMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c.NewEngineFragmentBuilder m137133xe0ce8d1b(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b enumC28578xae92d13b) {
            this.f70573xe0ce8d1b = enumC28578xae92d13b;
            return this;
        }

        public NewEngineFragmentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ComponentCallbacks2C28546xda825a6c> cls) {
            this.f70562x819f7d3d = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
            this.f70564xd3a26390 = null;
            this.f70567xe6de5565 = "/";
            this.f70566xa6595ff4 = false;
            this.f70561xaa52d8c8 = null;
            this.f70569x6b6a0b2d = null;
            this.f70568x47293459 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
            this.f70573xe0ce8d1b = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
            this.f70570xbfcd5884 = true;
            this.f70571xe16a5dc4 = false;
            this.f70572x683e03f8 = false;
            this.f70565xcb40c908 = cls;
        }
    }
}
