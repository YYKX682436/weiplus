package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate */
/* loaded from: classes15.dex */
class C28541x438282c1 implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a<android.app.Activity> {

    /* renamed from: FLUTTER_SPLASH_VIEW_FALLBACK_ID */
    private static final int f70487x3c2e2893 = 486947586;

    /* renamed from: FRAMEWORK_RESTORATION_BUNDLE_KEY */
    private static final java.lang.String f70488x8f91dee4 = "framework";

    /* renamed from: ON_BACK_CALLBACK_ENABLED_KEY */
    static final java.lang.String f70489x2a1b5d1f = "enableOnBackInvokedCallbackState";

    /* renamed from: PLUGINS_RESTORATION_BUNDLE_KEY */
    private static final java.lang.String f70490xbcd12702 = "plugins";
    private static final java.lang.String TAG = "FlutterActivityAndFragmentDelegate";

    /* renamed from: activePreDrawListener */
    android.view.ViewTreeObserver.OnPreDrawListener f70491x43368875;

    /* renamed from: engineGroup */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 f70492x6412255d;

    /* renamed from: flutterEngine */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f70493x3a4f997e;

    /* renamed from: flutterUiDisplayListener */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 f70494xa34b51a6;

    /* renamed from: flutterView */
    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 f70495xe28578e1;

    /* renamed from: host */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host f70496x30f5a8;

    /* renamed from: isAttached */
    private boolean f70497xf0d424ee;

    /* renamed from: isFirstFrameRendered */
    private boolean f70498xdbb75f3c;

    /* renamed from: isFlutterEngineFromHost */
    private boolean f70499x5e463d06;

    /* renamed from: isFlutterUiDisplayed */
    private boolean f70500x31e4dbb;

    /* renamed from: platformPlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 f70501xc8286186;

    /* renamed from: previousVisibility */
    private java.lang.Integer f70502xb563f169;

    /* renamed from: sensitiveContentPlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5.C28747xd0ac0236 f70503xa1635616;

    /* renamed from: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate$DelegateFactory */
    /* loaded from: classes15.dex */
    public interface DelegateFactory {
        /* renamed from: createDelegate */
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 mo137088x67d326a1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host host);
    }

    /* renamed from: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate$Host */
    /* loaded from: classes15.dex */
    public interface Host extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28545x9134f56f, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate {
        /* renamed from: attachToEngineAutomatically */
        boolean mo136989x169db8c1();

        /* renamed from: cleanUpFlutterEngine */
        void mo29002x72e1151a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e);

        /* renamed from: configureFlutterEngine */
        void mo29003xab73cc38(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e);

        /* renamed from: detachFromFlutterEngine */
        void mo136992xf8d3d6a1();

        /* renamed from: getActivity */
        android.app.Activity mo136993x19263085();

        /* renamed from: getAppBundlePath */
        java.lang.String mo136994x67b29512();

        /* renamed from: getBackCallbackState */
        boolean mo136995x590b38ef();

        /* renamed from: getCachedEngineGroupId */
        java.lang.String mo136997xb73e7e20();

        /* renamed from: getCachedEngineId */
        java.lang.String mo136998xd9afab35();

        /* renamed from: getContext */
        android.content.Context mo136999x76847179();

        /* renamed from: getDartEntrypointArgs */
        java.util.List<java.lang.String> mo137000x92703db0();

        /* renamed from: getDartEntrypointFunctionName */
        java.lang.String mo137001x36e4a056();

        /* renamed from: getDartEntrypointLibraryUri */
        java.lang.String mo137002xf14fed44();

        /* renamed from: getExclusiveAppComponent */
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a<android.app.Activity> mo137003x6db07fe4();

        /* renamed from: getFlutterShellArgs */
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 mo137005xa48db9e7();

        /* renamed from: getInitialRoute */
        java.lang.String mo137006x47d0e7db();

        /* renamed from: getLifecycle */
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4();

        /* renamed from: getRenderMode */
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 mo137009x3569ec4f();

        /* renamed from: getTransparencyMode */
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b mo137010x88a6f491();

        /* renamed from: isEnableSwitchSurface */
        default boolean mo137011x3728288c() {
            return false;
        }

        /* renamed from: onFlutterSurfaceViewCreated */
        void mo137013xfaf285b3(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 c28550x85bcbf56);

        /* renamed from: onFlutterTextureViewCreated */
        void mo137014x8752ac85(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4);

        /* renamed from: onFlutterUiDisplayed */
        void mo137015x6c956b30();

        /* renamed from: onFlutterUiNoLongerDisplayed */
        void mo137016xb9179606();

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28545x9134f56f
        /* renamed from: provideFlutterEngine */
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e mo137018x7b33885d(android.content.Context context);

        /* renamed from: providePlatformPlugin */
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 mo137019xa3c24e87(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e);

        /* renamed from: provideSensitiveContentPlugin */
        io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5.C28747xd0ac0236 mo137020xc304b217(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e);

        /* renamed from: shouldAttachEngineToActivity */
        boolean mo137025xbfcd5884();

        /* renamed from: shouldDestroyEngineWithHost */
        boolean mo137026x3ea0a97();

        /* renamed from: shouldDispatchAppLifecycleState */
        boolean mo137027x394dbffb();

        /* renamed from: shouldHandleDeeplinking */
        boolean mo137028x6be04681();

        /* renamed from: shouldRestoreAndSaveState */
        boolean mo137029x96a779f8();

        /* renamed from: updateSystemUiOverlays */
        void mo137034xef494f4f();
    }

    public C28541x438282c1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host host) {
        this(host, null);
    }

    /* renamed from: addEntrypointOptions */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options m137052x95a151bf(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options options) {
        java.lang.String mo136994x67b29512 = this.f70496x30f5a8.mo136994x67b29512();
        if (mo136994x67b29512 == null || mo136994x67b29512.isEmpty()) {
            mo136994x67b29512 = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136951x464ccf4f().m137934x595ee78f();
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint(mo136994x67b29512, this.f70496x30f5a8.mo137001x36e4a056());
        java.lang.String mo137006x47d0e7db = this.f70496x30f5a8.mo137006x47d0e7db();
        if (mo137006x47d0e7db == null && (mo137006x47d0e7db = m137056x5022f999(this.f70496x30f5a8.mo136993x19263085().getIntent())) == null) {
            mo137006x47d0e7db = "/";
        }
        return options.m137547x382db23f(dartEntrypoint).m137549x7e19e2e7(mo137006x47d0e7db).m137548x299bbfbc(this.f70496x30f5a8.mo137000x92703db0());
    }

    /* renamed from: delayFirstAndroidViewDraw */
    private void m137053x634bfa6b(final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1) {
        if (this.f70496x30f5a8.mo137009x3569ec4f() != io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface) {
            throw new java.lang.IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f70491x43368875 != null) {
            c28553x45ef20c1.getViewTreeObserver().removeOnPreDrawListener(this.f70491x43368875);
        }
        this.f70491x43368875 = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.this.f70500x31e4dbb && io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.this.f70491x43368875 != null) {
                    c28553x45ef20c1.getViewTreeObserver().removeOnPreDrawListener(this);
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.this.f70491x43368875 = null;
                }
                return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.this.f70500x31e4dbb;
            }
        };
        c28553x45ef20c1.getViewTreeObserver().addOnPreDrawListener(this.f70491x43368875);
    }

    /* renamed from: doInitialFlutterViewRun */
    private void m137054xa0984683() {
        java.lang.String str;
        if (this.f70496x30f5a8.mo136998xd9afab35() == null && !this.f70493x3a4f997e.m137427x4255efe8().m137860xb615fc87()) {
            java.lang.String mo137006x47d0e7db = this.f70496x30f5a8.mo137006x47d0e7db();
            if (mo137006x47d0e7db == null && (mo137006x47d0e7db = m137056x5022f999(this.f70496x30f5a8.mo136993x19263085().getIntent())) == null) {
                mo137006x47d0e7db = "/";
            }
            java.lang.String mo137002xf14fed44 = this.f70496x30f5a8.mo137002xf14fed44();
            if (("Executing Dart entrypoint: " + this.f70496x30f5a8.mo137001x36e4a056() + ", library uri: " + mo137002xf14fed44) == null) {
                str = "\"\"";
            } else {
                str = mo137002xf14fed44 + ", and sending initial route: " + mo137006x47d0e7db;
            }
            io.p3284xd2ae381c.Log.v(TAG, str);
            this.f70493x3a4f997e.m137435x8a0ad399().m138193x7e19e2e7(mo137006x47d0e7db);
            java.lang.String mo136994x67b29512 = this.f70496x30f5a8.mo136994x67b29512();
            if (mo136994x67b29512 == null || mo136994x67b29512.isEmpty()) {
                mo136994x67b29512 = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136951x464ccf4f().m137934x595ee78f();
            }
            this.f70493x3a4f997e.m137427x4255efe8().m137854x820a9012(mo137002xf14fed44 == null ? new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint(mo136994x67b29512, this.f70496x30f5a8.mo137001x36e4a056()) : new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint(mo136994x67b29512, mo137002xf14fed44, this.f70496x30f5a8.mo137001x36e4a056()), this.f70496x30f5a8.mo137000x92703db0());
        }
    }

    /* renamed from: ensureAlive */
    private void m137055x917032f() {
        if (this.f70496x30f5a8 == null) {
            throw new java.lang.IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    /* renamed from: maybeGetInitialRouteFromIntent */
    private java.lang.String m137056x5022f999(android.content.Intent intent) {
        android.net.Uri data;
        if (!this.f70496x30f5a8.mo137028x6be04681() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    /* renamed from: cancelBackGesture */
    public void m137057xac37788() {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            io.p3284xd2ae381c.Log.v(TAG, "Forwarding cancelBackGesture() to FlutterEngine.");
            this.f70493x3a4f997e.m137424x8f77f637().m138154xac37788();
        }
    }

    /* renamed from: commitBackGesture */
    public void m137058xd12554ab() {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            io.p3284xd2ae381c.Log.v(TAG, "Forwarding commitBackGesture() to FlutterEngine.");
            this.f70493x3a4f997e.m137424x8f77f637().m138155xd12554ab();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a
    /* renamed from: detachFromFlutterEngine */
    public void mo10652xf8d3d6a1() {
        if (!this.f70496x30f5a8.mo137026x3ea0a97()) {
            this.f70496x30f5a8.mo136992xf8d3d6a1();
            return;
        }
        throw new java.lang.AssertionError("The internal FlutterEngine created by " + this.f70496x30f5a8 + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* renamed from: getFlutterEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137059xf7af55c8() {
        return this.f70493x3a4f997e;
    }

    /* renamed from: isAttached */
    public boolean m137060xf0d424ee() {
        return this.f70497xf0d424ee;
    }

    /* renamed from: isFlutterEngineFromHost */
    public boolean m137061x5e463d06() {
        return this.f70499x5e463d06;
    }

    /* renamed from: isInSwapSurface */
    public boolean m137062xccfd02b() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f70495xe28578e1;
        if (c28553x45ef20c1 != null) {
            return c28553x45ef20c1.m137271xccfd02b();
        }
        return false;
    }

    /* renamed from: onActivityResult */
    public void m137063x9d4787cb(int i17, int i18, android.content.Intent intent) {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        io.p3284xd2ae381c.Log.v(TAG, "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i17 + "\nresultCode: " + i18 + "\ndata: " + intent);
        this.f70493x3a4f997e.m137423x1983fc75().mo137487x9d4787cb(i17, i18, intent);
    }

    /* renamed from: onAttach */
    public void m137064x3b13c504(android.content.Context context) {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            m137083x6776f9e1();
        }
        if (this.f70496x30f5a8.mo137025xbfcd5884()) {
            io.p3284xd2ae381c.Log.v(TAG, "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f70493x3a4f997e.m137423x1983fc75().mo137477x715d32cf(this, this.f70496x30f5a8.mo273xed6858b4());
        }
        android.app.Activity mo136993x19263085 = this.f70496x30f5a8.mo136993x19263085();
        this.f70501xc8286186 = this.f70496x30f5a8.mo137019xa3c24e87(mo136993x19263085, this.f70493x3a4f997e);
        this.f70503xa1635616 = this.f70496x30f5a8.mo137020xc304b217(mo136993x19263085, this.f70493x3a4f997e);
        this.f70496x30f5a8.mo29003xab73cc38(this.f70493x3a4f997e);
        this.f70497xf0d424ee = true;
    }

    /* renamed from: onBackPressed */
    public void m137065xbdc3c5dc() {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            io.p3284xd2ae381c.Log.v(TAG, "Forwarding onBackPressed() to FlutterEngine.");
            this.f70493x3a4f997e.m137435x8a0ad399().m138190x262dda78();
        }
    }

    /* renamed from: onCreateView */
    public android.view.View m137066x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle, int i17, boolean z17) {
        io.p3284xd2ae381c.Log.v(TAG, "Creating FlutterView.");
        m137055x917032f();
        if (this.f70496x30f5a8.mo137009x3569ec4f() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56 c28550x85bcbf56 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56(this.f70496x30f5a8.mo136999x76847179(), this.f70496x30f5a8.mo137010x88a6f491() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent);
            this.f70496x30f5a8.mo137013xfaf285b3(c28550x85bcbf56);
            this.f70495xe28578e1 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1(this.f70496x30f5a8.mo136999x76847179(), c28550x85bcbf56);
        } else {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4(this.f70496x30f5a8.mo136999x76847179());
            c28552x398ac0c4.setOpaque(this.f70496x30f5a8.mo137010x88a6f491() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.opaque);
            this.f70496x30f5a8.mo137014x8752ac85(c28552x398ac0c4);
            this.f70495xe28578e1 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1(this.f70496x30f5a8.mo136999x76847179(), c28552x398ac0c4);
        }
        this.f70495xe28578e1.m137255x6d15a5c6(this.f70494xa34b51a6);
        if (this.f70496x30f5a8.mo136989x169db8c1()) {
            io.p3284xd2ae381c.Log.v(TAG, "Attaching FlutterEngine to FlutterView.");
            this.f70495xe28578e1.mo124142x11d031be(this.f70493x3a4f997e);
        }
        this.f70495xe28578e1.setId(i17);
        this.f70495xe28578e1.m137278x5a78fe54(this.f70496x30f5a8.mo137011x3728288c());
        this.f70495xe28578e1.m137280x85e5ffa5(mo10653x73732a52().isInMultiWindowMode());
        if (z17) {
            m137053x634bfa6b(this.f70495xe28578e1);
        }
        return this.f70495xe28578e1;
    }

    /* renamed from: onDestroyView */
    public void m137067xa6664a60() {
        io.p3284xd2ae381c.Log.v(TAG, "onDestroyView()");
        m137055x917032f();
        if (this.f70491x43368875 != null) {
            this.f70495xe28578e1.getViewTreeObserver().removeOnPreDrawListener(this.f70491x43368875);
            this.f70491x43368875 = null;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f70495xe28578e1;
        if (c28553x45ef20c1 != null) {
            c28553x45ef20c1.m137259xf8d3d6a1();
            this.f70495xe28578e1.m137275xa2124329(this.f70494xa34b51a6);
        }
    }

    /* renamed from: onDetach */
    public void m137068x3f5eee52() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e;
        if (this.f70497xf0d424ee) {
            io.p3284xd2ae381c.Log.v(TAG, "onDetach()");
            m137055x917032f();
            this.f70496x30f5a8.mo29002x72e1151a(this.f70493x3a4f997e);
            if (this.f70496x30f5a8.mo137025xbfcd5884()) {
                io.p3284xd2ae381c.Log.v(TAG, "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.f70496x30f5a8.mo136993x19263085().isChangingConfigurations()) {
                    this.f70493x3a4f997e.m137423x1983fc75().mo137483x3d389304();
                } else {
                    this.f70493x3a4f997e.m137423x1983fc75().mo137482x32c8cc0c();
                }
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 c28715x8c6f2da6 = this.f70501xc8286186;
            if (c28715x8c6f2da6 != null) {
                c28715x8c6f2da6.m138690x5cd39ffa();
                this.f70501xc8286186 = null;
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5.C28747xd0ac0236 c28747xd0ac0236 = this.f70503xa1635616;
            if (c28747xd0ac0236 != null) {
                c28747xd0ac0236.m138863x5cd39ffa();
                this.f70503xa1635616 = null;
            }
            if (this.f70496x30f5a8.mo137027x394dbffb() && (c28580x69eec95e = this.f70493x3a4f997e) != null) {
                c28580x69eec95e.m137431xae9c49af().m138172x673813bd();
            }
            if (this.f70496x30f5a8.mo137026x3ea0a97()) {
                this.f70493x3a4f997e.m137419x5cd39ffa();
                if (this.f70496x30f5a8.mo136998xd9afab35() != null) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4.m137465x9cf0d20b().m137468xc84af884(this.f70496x30f5a8.mo136998xd9afab35());
                }
                this.f70493x3a4f997e = null;
            }
            this.f70497xf0d424ee = false;
        }
    }

    /* renamed from: onMultiWindowModeChanged */
    public void m137069xd5c30607(boolean z17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f70495xe28578e1;
        if (c28553x45ef20c1 != null) {
            c28553x45ef20c1.m137280x85e5ffa5(z17);
        }
    }

    /* renamed from: onNewIntent */
    public void m137070xc944513d(android.content.Intent intent) {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        io.p3284xd2ae381c.Log.v(TAG, "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f70493x3a4f997e.m137423x1983fc75().mo137490xc944513d(intent);
        java.lang.String m137056x5022f999 = m137056x5022f999(intent);
        if (m137056x5022f999 == null || m137056x5022f999.isEmpty()) {
            return;
        }
        this.f70493x3a4f997e.m137435x8a0ad399().m138192xcea5d25d(m137056x5022f999);
    }

    /* renamed from: onPause */
    public void m137071xb01dfb57() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e;
        io.p3284xd2ae381c.Log.v(TAG, "onPause()");
        m137055x917032f();
        if (!this.f70496x30f5a8.mo137027x394dbffb() || (c28580x69eec95e = this.f70493x3a4f997e) == null) {
            return;
        }
        c28580x69eec95e.m137431xae9c49af().m138173x2a6de4b6();
    }

    /* renamed from: onPostResume */
    public void m137072x2517b42c() {
        io.p3284xd2ae381c.Log.v(TAG, "onPostResume()");
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        } else {
            m137087xef494f4f();
            this.f70493x3a4f997e.m137437xe5cc0b81().mo138649x57429eec();
        }
    }

    /* renamed from: onRequestPermissionsResult */
    public void m137073x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        io.p3284xd2ae381c.Log.v(TAG, "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i17 + "\npermissions: " + java.util.Arrays.toString(strArr) + "\ngrantResults: " + java.util.Arrays.toString(iArr));
        this.f70493x3a4f997e.m137423x1983fc75().mo137491x953457f1(i17, strArr, iArr);
    }

    /* renamed from: onRestoreInstanceState */
    public void m137074xb949e58d(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        byte[] bArr;
        io.p3284xd2ae381c.Log.v(TAG, "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        m137055x917032f();
        if (bundle != null) {
            bundle2 = bundle.getBundle(f70490xbcd12702);
            bArr = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
            bArr = null;
        }
        if (this.f70496x30f5a8.mo137029x96a779f8()) {
            this.f70493x3a4f997e.m137442xb08f587b().m138306xeaa420a6(bArr);
        }
        if (this.f70496x30f5a8.mo137025xbfcd5884()) {
            this.f70493x3a4f997e.m137423x1983fc75().mo137492xb949e58d(bundle2);
        }
    }

    /* renamed from: onResume */
    public void m137075x57429eec() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e;
        io.p3284xd2ae381c.Log.v(TAG, "onResume()");
        m137055x917032f();
        if (!this.f70496x30f5a8.mo137027x394dbffb() || (c28580x69eec95e = this.f70493x3a4f997e) == null) {
            return;
        }
        c28580x69eec95e.m137431xae9c49af().m138175x84ce002c();
    }

    /* renamed from: onSaveInstanceState */
    public void m137076xa71a2260(android.os.Bundle bundle) {
        io.p3284xd2ae381c.Log.v(TAG, "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        m137055x917032f();
        if (this.f70496x30f5a8.mo137029x96a779f8()) {
            bundle.putByteArray("framework", this.f70493x3a4f997e.m137442xb08f587b().m138305xb3cd8732());
        }
        if (this.f70496x30f5a8.mo137025xbfcd5884()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            this.f70493x3a4f997e.m137423x1983fc75().mo137493xa71a2260(bundle2);
            bundle.putBundle(f70490xbcd12702, bundle2);
        }
        if (this.f70496x30f5a8.mo136998xd9afab35() == null || this.f70496x30f5a8.mo137026x3ea0a97()) {
            return;
        }
        bundle.putBoolean(f70489x2a1b5d1f, this.f70496x30f5a8.mo136995x590b38ef());
    }

    /* renamed from: onStart */
    public void m137077xb05099c3() {
        io.p3284xd2ae381c.Log.v(TAG, "onStart()");
        m137055x917032f();
        m137054xa0984683();
        java.lang.Integer num = this.f70502xb563f169;
        if (num != null) {
            this.f70495xe28578e1.setVisibility(num.intValue());
        }
    }

    /* renamed from: onStop */
    public void m137078xc39f8281() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e;
        io.p3284xd2ae381c.Log.v(TAG, "onStop()");
        m137055x917032f();
        if (this.f70496x30f5a8.mo137027x394dbffb() && (c28580x69eec95e = this.f70493x3a4f997e) != null) {
            c28580x69eec95e.m137431xae9c49af().m138174x196db839();
        }
        this.f70502xb563f169 = java.lang.Integer.valueOf(this.f70495xe28578e1.getVisibility());
        this.f70495xe28578e1.setVisibility(8);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e2 = this.f70493x3a4f997e;
        if (c28580x69eec95e2 != null) {
            c28580x69eec95e2.m137441x5e5b7e39().mo138031x29685b02(40);
        }
    }

    /* renamed from: onTrimMemory */
    public void m137079x29685b02(int i17) {
        m137055x917032f();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f70493x3a4f997e;
        if (c28580x69eec95e != null) {
            if (this.f70498xdbb75f3c && i17 >= 10) {
                c28580x69eec95e.m137427x4255efe8().m137862xcfd0d5d0();
                this.f70493x3a4f997e.m137450x625a5c1e().m138352x27cac7ae();
            }
            this.f70493x3a4f997e.m137441x5e5b7e39().mo138031x29685b02(i17);
            this.f70493x3a4f997e.m137437xe5cc0b81().mo138650x29685b02(i17);
        }
    }

    /* renamed from: onUserLeaveHint */
    public void m137080xb1e9ab4() {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            io.p3284xd2ae381c.Log.v(TAG, "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f70493x3a4f997e.m137423x1983fc75().mo137494xb1e9ab4();
        }
    }

    /* renamed from: onWindowFocusChanged */
    public void m137081xa4ec7b0b(boolean z17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e;
        m137055x917032f();
        io.p3284xd2ae381c.Log.v(TAG, "Received onWindowFocusChanged: ".concat(z17 ? "true" : "false"));
        if (!this.f70496x30f5a8.mo137027x394dbffb() || (c28580x69eec95e = this.f70493x3a4f997e) == null) {
            return;
        }
        if (z17) {
            c28580x69eec95e.m137431xae9c49af().m138171x6c7f4e3c();
        } else {
            c28580x69eec95e.m137431xae9c49af().m138176x840de5a5();
        }
    }

    /* renamed from: release */
    public void m137082x41012807() {
        this.f70496x30f5a8 = null;
        this.f70493x3a4f997e = null;
        this.f70495xe28578e1 = null;
        this.f70501xc8286186 = null;
        this.f70503xa1635616 = null;
    }

    /* renamed from: setUpFlutterEngine */
    public void m137083x6776f9e1() {
        io.p3284xd2ae381c.Log.v(TAG, "Setting up FlutterEngine.");
        java.lang.String mo136998xd9afab35 = this.f70496x30f5a8.mo136998xd9afab35();
        if (mo136998xd9afab35 != null) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4.m137465x9cf0d20b().get(mo136998xd9afab35);
            this.f70493x3a4f997e = c28580x69eec95e;
            this.f70499x5e463d06 = true;
            if (c28580x69eec95e != null) {
                return;
            }
            throw new java.lang.IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + mo136998xd9afab35 + "'");
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host host = this.f70496x30f5a8;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e mo137018x7b33885d = host.mo137018x7b33885d(host.mo136999x76847179());
        this.f70493x3a4f997e = mo137018x7b33885d;
        if (mo137018x7b33885d != null) {
            this.f70499x5e463d06 = true;
            return;
        }
        java.lang.String mo136997xb73e7e20 = this.f70496x30f5a8.mo136997xb73e7e20();
        if (mo136997xb73e7e20 == null) {
            io.p3284xd2ae381c.Log.v(TAG, "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 c28584x3d6c67c1 = this.f70492x6412255d;
            if (c28584x3d6c67c1 == null) {
                c28584x3d6c67c1 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1(this.f70496x30f5a8.mo136999x76847179(), this.f70496x30f5a8.mo137005xa48db9e7().m137777xb986489e());
            }
            this.f70493x3a4f997e = c28584x3d6c67c1.m137537xf6bf6fb2(m137052x95a151bf(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options(this.f70496x30f5a8.mo136999x76847179()).m137546x1c0b3adc(false).m137551xdd4462b6(this.f70496x30f5a8.mo137029x96a779f8())));
            this.f70499x5e463d06 = false;
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 c28584x3d6c67c12 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28585x56710841.m137552x9cf0d20b().get(mo136997xb73e7e20);
        if (c28584x3d6c67c12 != null) {
            this.f70493x3a4f997e = c28584x3d6c67c12.m137537xf6bf6fb2(m137052x95a151bf(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options(this.f70496x30f5a8.mo136999x76847179())));
            this.f70499x5e463d06 = false;
        } else {
            throw new java.lang.IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + mo136997xb73e7e20 + "'");
        }
    }

    /* renamed from: startBackGesture */
    public void m137084x66f1a0a0(android.window.BackEvent backEvent) {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            io.p3284xd2ae381c.Log.v(TAG, "Forwarding startBackGesture() to FlutterEngine.");
            this.f70493x3a4f997e.m137424x8f77f637().m138157x66f1a0a0(backEvent);
        }
    }

    /* renamed from: switchSurface */
    public void m137085xfa380ad9(boolean z17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f70495xe28578e1;
        if (c28553x45ef20c1 != null) {
            c28553x45ef20c1.m137284xfa380ad9(z17);
        }
    }

    /* renamed from: updateBackGestureProgress */
    public void m137086x77f17326(android.window.BackEvent backEvent) {
        m137055x917032f();
        if (this.f70493x3a4f997e == null) {
            io.p3284xd2ae381c.Log.w(TAG, "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        } else {
            io.p3284xd2ae381c.Log.v(TAG, "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.f70493x3a4f997e.m137424x8f77f637().m138158x77f17326(backEvent);
        }
    }

    /* renamed from: updateSystemUiOverlays */
    public void m137087xef494f4f() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 c28715x8c6f2da6 = this.f70501xc8286186;
        if (c28715x8c6f2da6 != null) {
            c28715x8c6f2da6.m138691xef494f4f();
        }
    }

    public C28541x438282c1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host host, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 c28584x3d6c67c1) {
        this.f70494xa34b51a6 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiDisplayed */
            public void mo2121x6c956b30() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.this.f70496x30f5a8.mo137015x6c956b30();
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.this.f70500x31e4dbb = true;
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.this.f70498xdbb75f3c = true;
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiNoLongerDisplayed */
            public void mo2122xb9179606() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.this.f70496x30f5a8.mo137016xb9179606();
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.this.f70500x31e4dbb = false;
            }
        };
        this.f70496x30f5a8 = host;
        this.f70498xdbb75f3c = false;
        this.f70492x6412255d = c28584x3d6c67c1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a
    /* renamed from: getAppComponent */
    public android.app.Activity mo10653x73732a52() {
        android.app.Activity mo136993x19263085 = this.f70496x30f5a8.mo136993x19263085();
        if (mo136993x19263085 != null) {
            return mo136993x19263085;
        }
        throw new java.lang.AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }
}
