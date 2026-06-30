package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterActivity */
/* loaded from: classes15.dex */
public class ActivityC28539xda2b6b2b extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: FLUTTER_VIEW_ID */
    public static final int f70466x5ad2abb2 = android.view.View.generateViewId();
    private static final java.lang.String TAG = "FlutterActivity";

    /* renamed from: delegate */
    protected io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 f70467x30d5dd85;

    /* renamed from: hasRegisteredBackCallback */
    boolean f70468x162a6128 = false;

    /* renamed from: lifecycle */
    private p012xc85e97e9.p093xedfae76a.b0 f70469xedfae76a;

    /* renamed from: onBackInvokedCallback */
    private final android.window.OnBackInvokedCallback f70470x6ce4e30b;

    /* renamed from: io.flutter.embedding.android.FlutterActivity$CachedEngineIntentBuilder */
    /* loaded from: classes11.dex */
    public static class CachedEngineIntentBuilder {

        /* renamed from: activityClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b> f70472xc0af57a9;

        /* renamed from: cachedEngineId */
        private final java.lang.String f70474xeb17de3f;

        /* renamed from: destroyEngineWithActivity */
        private boolean f70475x3e90eef1 = false;

        /* renamed from: backgroundMode */
        private java.lang.String f70473x5512bbf1 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.f70509x9d7e8bf6;

        /* renamed from: enableSwitchSurface */
        private boolean f70476xb4046216 = false;

        public CachedEngineIntentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b> cls, java.lang.String str) {
            this.f70472xc0af57a9 = cls;
            this.f70474xeb17de3f = str;
        }

        /* renamed from: backgroundMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.CachedEngineIntentBuilder m137035x5512bbf1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode) {
            this.f70473x5512bbf1 = backgroundMode.name();
            return this;
        }

        /* renamed from: build */
        public android.content.Intent m137036x59bc66e(android.content.Context context) {
            return new android.content.Intent(context, this.f70472xc0af57a9).putExtra("cached_engine_id", this.f70474xeb17de3f).putExtra("destroy_engine_with_activity", this.f70475x3e90eef1).putExtra("background_mode", this.f70473x5512bbf1).putExtra("enable_switch_surface", this.f70476xb4046216);
        }

        /* renamed from: destroyEngineWithActivity */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.CachedEngineIntentBuilder m137037x3e90eef1(boolean z17) {
            this.f70475x3e90eef1 = z17;
            return this;
        }

        /* renamed from: enableSwitchSurface */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.CachedEngineIntentBuilder m137038xb4046216(boolean z17) {
            this.f70476xb4046216 = z17;
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterActivity$NewEngineInGroupIntentBuilder */
    /* loaded from: classes11.dex */
    public static class NewEngineInGroupIntentBuilder {

        /* renamed from: activityClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b> f70477xc0af57a9;

        /* renamed from: cachedEngineGroupId */
        private final java.lang.String f70479x5f0ea156;

        /* renamed from: dartEntrypoint */
        private java.lang.String f70480x819f7d3d = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;

        /* renamed from: initialRoute */
        private java.lang.String f70481xe6de5565 = "/";

        /* renamed from: backgroundMode */
        private java.lang.String f70478x5512bbf1 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.f70509x9d7e8bf6;

        public NewEngineInGroupIntentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b> cls, java.lang.String str) {
            this.f70477xc0af57a9 = cls;
            this.f70479x5f0ea156 = str;
        }

        /* renamed from: backgroundMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineInGroupIntentBuilder m137039x5512bbf1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode) {
            this.f70478x5512bbf1 = backgroundMode.name();
            return this;
        }

        /* renamed from: build */
        public android.content.Intent m137040x59bc66e(android.content.Context context) {
            return new android.content.Intent(context, this.f70477xc0af57a9).putExtra("dart_entrypoint", this.f70480x819f7d3d).putExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f, this.f70481xe6de5565).putExtra("cached_engine_group_id", this.f70479x5f0ea156).putExtra("background_mode", this.f70478x5512bbf1).putExtra("destroy_engine_with_activity", true);
        }

        /* renamed from: dartEntrypoint */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineInGroupIntentBuilder m137041x819f7d3d(java.lang.String str) {
            this.f70480x819f7d3d = str;
            return this;
        }

        /* renamed from: initialRoute */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineInGroupIntentBuilder m137042xe6de5565(java.lang.String str) {
            this.f70481xe6de5565 = str;
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterActivity$NewEngineIntentBuilder */
    /* loaded from: classes11.dex */
    public static class NewEngineIntentBuilder {

        /* renamed from: activityClass */
        private final java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b> f70482xc0af57a9;

        /* renamed from: dartEntrypointArgs */
        private java.util.List<java.lang.String> f70484x7f13dbba;

        /* renamed from: initialRoute */
        private java.lang.String f70486xe6de5565 = "/";

        /* renamed from: backgroundMode */
        private java.lang.String f70483x5512bbf1 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.f70509x9d7e8bf6;

        /* renamed from: enableSwitchSurface */
        private boolean f70485xb4046216 = false;

        public NewEngineIntentBuilder(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b> cls) {
            this.f70482xc0af57a9 = cls;
        }

        /* renamed from: backgroundMode */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineIntentBuilder m137043x5512bbf1(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode) {
            this.f70483x5512bbf1 = backgroundMode.name();
            return this;
        }

        /* renamed from: build */
        public android.content.Intent m137044x59bc66e(android.content.Context context) {
            android.content.Intent putExtra = new android.content.Intent(context, this.f70482xc0af57a9).putExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f, this.f70486xe6de5565).putExtra("background_mode", this.f70483x5512bbf1).putExtra("destroy_engine_with_activity", true).putExtra("enable_switch_surface", true);
            if (this.f70484x7f13dbba != null) {
                putExtra.putExtra("dart_entrypoint_args", new java.util.ArrayList(this.f70484x7f13dbba));
            }
            return putExtra;
        }

        /* renamed from: dartEntrypointArgs */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineIntentBuilder m137045x7f13dbba(java.util.List<java.lang.String> list) {
            this.f70484x7f13dbba = list;
            return this;
        }

        /* renamed from: enableSwitchSurface */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineIntentBuilder m137046xb4046216(boolean z17) {
            this.f70485xb4046216 = z17;
            return this;
        }

        /* renamed from: initialRoute */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineIntentBuilder m137047xe6de5565(java.lang.String str) {
            this.f70486xe6de5565 = str;
            return this;
        }
    }

    public ActivityC28539xda2b6b2b() {
        this.f70470x6ce4e30b = android.os.Build.VERSION.SDK_INT < 33 ? null : m136982x2bc8476f();
        this.f70469xedfae76a = new p012xc85e97e9.p093xedfae76a.b0(this, true);
    }

    @java.lang.Deprecated
    /* renamed from: configureStatusBarForFullscreenFlutterExperience */
    private void m136978xbd6baafd() {
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    /* renamed from: configureWindowForTransparency */
    private void m136979x496a9d6b() {
        if (m136996x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
    }

    /* renamed from: createDefaultIntent */
    public static android.content.Intent m136980x89568ca1(android.content.Context context) {
        return m136987xf7eec5dc().m137044x59bc66e(context);
    }

    /* renamed from: createFlutterView */
    private android.view.View m136981xfa44a45() {
        return this.f70467x30d5dd85.m137066x18bad100(null, null, null, f70466x5ad2abb2, mo137009x3569ec4f() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface);
    }

    /* renamed from: createOnBackInvokedCallback */
    private android.window.OnBackInvokedCallback m136982x2bc8476f() {
        return android.os.Build.VERSION.SDK_INT >= 34 ? new android.window.OnBackAnimationCallback() { // from class: io.flutter.embedding.android.FlutterActivity.1
            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.this.m136990xac37788();
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.this.m136991xd12554ab();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(android.window.BackEvent backEvent) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.this.m137033x77f17326(backEvent);
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(android.window.BackEvent backEvent) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.this.m137030x66f1a0a0(backEvent);
            }
        } : new android.window.OnBackInvokedCallback() { // from class: io.flutter.embedding.android.FlutterActivity$$a
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.this.onBackPressed();
            }
        };
    }

    /* renamed from: isDebuggable */
    private boolean m136983x14236c98() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: stillAttachedForEvent */
    private boolean m136984x83ff5edd(java.lang.String str) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70467x30d5dd85;
        if (c28541x438282c1 == null) {
            io.p3284xd2ae381c.Log.w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c28541x438282c1.m137060xf0d424ee()) {
            return true;
        }
        io.p3284xd2ae381c.Log.w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    /* renamed from: switchLaunchThemeForNormalTheme */
    private void m136985xb090373b() {
        try {
            android.os.Bundle m137007x60f92cc5 = m137007x60f92cc5();
            if (m137007x60f92cc5 != null) {
                int i17 = m137007x60f92cc5.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i17 != -1) {
                    setTheme(i17);
                }
            } else {
                io.p3284xd2ae381c.Log.v(TAG, "Using the launch theme as normal theme.");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            io.p3284xd2ae381c.Log.e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    /* renamed from: withCachedEngine */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.CachedEngineIntentBuilder m136986x37a351ea(java.lang.String str) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.CachedEngineIntentBuilder(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.class, str);
    }

    /* renamed from: withNewEngine */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineIntentBuilder m136987xf7eec5dc() {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineIntentBuilder(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.class);
    }

    /* renamed from: withNewEngineInGroup */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineInGroupIntentBuilder m136988x42d62ade(java.lang.String str) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.NewEngineInGroupIntentBuilder(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.ActivityC28539xda2b6b2b.class, str);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: attachToEngineAutomatically */
    public boolean mo136989x169db8c1() {
        return true;
    }

    /* renamed from: cancelBackGesture */
    public void m136990xac37788() {
        if (m136984x83ff5edd("cancelBackGesture")) {
            this.f70467x30d5dd85.m137057xac37788();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: cleanUpFlutterEngine */
    public void mo29002x72e1151a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
    }

    /* renamed from: commitBackGesture */
    public void m136991xd12554ab() {
        if (m136984x83ff5edd("commitBackGesture")) {
            this.f70467x30d5dd85.m137058xd12554ab();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: configureFlutterEngine */
    public void mo29003xab73cc38(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        if (this.f70467x30d5dd85.m137061x5e463d06()) {
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3298x36f002.C28638x8c7ff645.m138000x8dcb33d4(c28580x69eec95e);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: detachFromFlutterEngine */
    public void mo136992xf8d3d6a1() {
        io.p3284xd2ae381c.Log.w(TAG, "FlutterActivity " + this + " connection to the engine " + m137004xf7af55c8() + " evicted by another attaching activity");
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70467x30d5dd85;
        if (c28541x438282c1 != null) {
            c28541x438282c1.m137067xa6664a60();
            this.f70467x30d5dd85.m137068x3f5eee52();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getActivity */
    public android.app.Activity mo136993x19263085() {
        return this;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getAppBundlePath */
    public java.lang.String mo136994x67b29512() {
        java.lang.String dataString;
        if (m136983x14236c98() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getBackCallbackState */
    public boolean mo136995x590b38ef() {
        return this.f70468x162a6128;
    }

    /* renamed from: getBackgroundMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode m136996x43aa88e7() {
        return getIntent().hasExtra("background_mode") ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.m137093xdce0328(getIntent().getStringExtra("background_mode")) : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getCachedEngineGroupId */
    public java.lang.String mo136997xb73e7e20() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getCachedEngineId */
    public java.lang.String mo136998xd9afab35() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getContext */
    public android.content.Context mo136999x76847179() {
        return this;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getDartEntrypointArgs */
    public java.util.List<java.lang.String> mo137000x92703db0() {
        return (java.util.List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getDartEntrypointFunctionName */
    public java.lang.String mo137001x36e4a056() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            android.os.Bundle m137007x60f92cc5 = m137007x60f92cc5();
            java.lang.String string = m137007x60f92cc5 != null ? m137007x60f92cc5.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getDartEntrypointLibraryUri */
    public java.lang.String mo137002xf14fed44() {
        try {
            android.os.Bundle m137007x60f92cc5 = m137007x60f92cc5();
            if (m137007x60f92cc5 != null) {
                return m137007x60f92cc5.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getExclusiveAppComponent */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a<android.app.Activity> mo137003x6db07fe4() {
        return this.f70467x30d5dd85;
    }

    /* renamed from: getFlutterEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137004xf7af55c8() {
        return this.f70467x30d5dd85.m137059xf7af55c8();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getFlutterShellArgs */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 mo137005xa48db9e7() {
        return io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.m137775x6f3c52e6(getIntent());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getInitialRoute */
    public java.lang.String mo137006x47d0e7db() {
        if (getIntent().hasExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f)) {
            return getIntent().getStringExtra(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f);
        }
        try {
            android.os.Bundle m137007x60f92cc5 = m137007x60f92cc5();
            if (m137007x60f92cc5 != null) {
                return m137007x60f92cc5.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f70469xedfae76a;
    }

    /* renamed from: getMetaData */
    public android.os.Bundle m137007x60f92cc5() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    /* renamed from: getOnBackInvokedCallback */
    public android.window.OnBackInvokedCallback m137008x7890b555() {
        return this.f70470x6ce4e30b;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getRenderMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 mo137009x3569ec4f() {
        return m136996x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getTransparencyMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b mo137010x88a6f491() {
        return m136996x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.opaque : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: isEnableSwitchSurface */
    public boolean mo137011x3728288c() {
        return getIntent().getBooleanExtra("enable_switch_surface", false);
    }

    /* renamed from: isInSwapSurface */
    public boolean m137012xccfd02b() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70467x30d5dd85;
        if (c28541x438282c1 != null) {
            return c28541x438282c1.m137062xccfd02b();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (m136984x83ff5edd("onActivityResult")) {
            this.f70467x30d5dd85.m137063x9d4787cb(i17, i18, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (m136984x83ff5edd("onBackPressed")) {
            this.f70467x30d5dd85.m137065xbdc3c5dc();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m136985xb090373b();
        super.onCreate(bundle);
        if (bundle != null) {
            mo137024xb9d44976(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1(this);
        this.f70467x30d5dd85 = c28541x438282c1;
        c28541x438282c1.m137064x3b13c504(this);
        this.f70467x30d5dd85.m137074xb949e58d(bundle);
        this.f70469xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
        m136979x496a9d6b();
        setContentView(m136981xfa44a45());
        m136978xbd6baafd();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (m136984x83ff5edd("onDestroy")) {
            this.f70467x30d5dd85.m137067xa6664a60();
            this.f70467x30d5dd85.m137068x3f5eee52();
        }
        m137022x41012807();
        this.f70469xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
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
            reportFullyDrawn();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: onFlutterUiNoLongerDisplayed */
    public void mo137016xb9179606() {
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17) {
        super.onMultiWindowModeChanged(z17);
        this.f70467x30d5dd85.m137069xd5c30607(z17);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (m136984x83ff5edd("onNewIntent")) {
            this.f70467x30d5dd85.m137070xc944513d(intent);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (m136984x83ff5edd("onPause")) {
            this.f70467x30d5dd85.m137071xb01dfb57();
        }
        this.f70469xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (m136984x83ff5edd("onPostResume")) {
            this.f70467x30d5dd85.m137072x2517b42c();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (m136984x83ff5edd("onRequestPermissionsResult")) {
            this.f70467x30d5dd85.m137073x953457f1(i17, strArr, iArr);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f70469xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
        if (m136984x83ff5edd("onResume")) {
            this.f70467x30d5dd85.m137075x57429eec();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m136984x83ff5edd("onSaveInstanceState")) {
            this.f70467x30d5dd85.m137076xa71a2260(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f70469xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
        if (m136984x83ff5edd("onStart")) {
            this.f70467x30d5dd85.m137077xb05099c3();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        if (m136984x83ff5edd("onStop")) {
            this.f70467x30d5dd85.m137078xc39f8281();
        }
        this.f70469xedfae76a.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        if (m136984x83ff5edd("onTrimMemory")) {
            this.f70467x30d5dd85.m137079x29685b02(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onUserLeaveHint() {
        if (m136984x83ff5edd("onUserLeaveHint")) {
            this.f70467x30d5dd85.m137080xb1e9ab4();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (m136984x83ff5edd("onWindowFocusChanged")) {
            this.f70467x30d5dd85.m137081xa4ec7b0b(z17);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate
    /* renamed from: popSystemNavigator */
    public boolean mo137017x946ed657() {
        return false;
    }

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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: provideSensitiveContentPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5.C28747xd0ac0236 mo137020xc304b217(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        return new io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5.C28747xd0ac0236(f70466x5ad2abb2, activity, c28580x69eec95e.m137444xa36cda4a());
    }

    /* renamed from: registerOnBackInvokedCallback */
    public void m137021xd3189828() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f70470x6ce4e30b);
            this.f70468x162a6128 = true;
        }
    }

    /* renamed from: release */
    public void m137022x41012807() {
        m137032xabaddc2f();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70467x30d5dd85;
        if (c28541x438282c1 != null) {
            c28541x438282c1.m137082x41012807();
            this.f70467x30d5dd85 = null;
        }
    }

    /* renamed from: setDelegate */
    public void m137023xa7687c07(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1) {
        this.f70467x30d5dd85 = c28541x438282c1;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6.PlatformPluginDelegate
    /* renamed from: setFrameworkHandlesBack */
    public void mo137024xb9d44976(boolean z17) {
        if (z17 && !this.f70468x162a6128) {
            m137021xd3189828();
        } else {
            if (z17 || !this.f70468x162a6128) {
                return;
            }
            m137032xabaddc2f();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldAttachEngineToActivity */
    public boolean mo137025xbfcd5884() {
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldDestroyEngineWithHost */
    public boolean mo137026x3ea0a97() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (mo136998xd9afab35() != null || this.f70467x30d5dd85.m137061x5e463d06()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
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
            return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.m137090x3772055b(m137007x60f92cc5());
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldRestoreAndSaveState */
    public boolean mo137029x96a779f8() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : mo136998xd9afab35() == null;
    }

    /* renamed from: startBackGesture */
    public void m137030x66f1a0a0(android.window.BackEvent backEvent) {
        if (m136984x83ff5edd("startBackGesture")) {
            this.f70467x30d5dd85.m137084x66f1a0a0(backEvent);
        }
    }

    /* renamed from: switchSurface */
    public void m137031xfa380ad9(boolean z17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70467x30d5dd85;
        if (c28541x438282c1 != null) {
            c28541x438282c1.m137085xfa380ad9(z17);
        }
    }

    /* renamed from: unregisterOnBackInvokedCallback */
    public void m137032xabaddc2f() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f70470x6ce4e30b);
            this.f70468x162a6128 = false;
        }
    }

    /* renamed from: updateBackGestureProgress */
    public void m137033x77f17326(android.window.BackEvent backEvent) {
        if (m136984x83ff5edd("updateBackGestureProgress")) {
            this.f70467x30d5dd85.m137086x77f17326(backEvent);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: updateSystemUiOverlays */
    public void mo137034xef494f4f() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1 c28541x438282c1 = this.f70467x30d5dd85;
        if (c28541x438282c1 != null) {
            c28541x438282c1.m137087xef494f4f();
        }
    }
}
