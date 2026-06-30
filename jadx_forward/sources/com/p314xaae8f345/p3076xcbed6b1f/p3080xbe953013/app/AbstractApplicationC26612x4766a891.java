package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app;

/* renamed from: com.tencent.tinker.loader.app.TinkerApplication */
/* loaded from: classes13.dex */
public abstract class AbstractApplicationC26612x4766a891 extends android.app.Application {

    /* renamed from: INTENT_PATCH_EXCEPTION */
    private static final java.lang.String f55510xee6db935 = "intent_patch_exception";

    /* renamed from: SELF_HOLDER */
    private static final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891[] f55511xaa9e69ff = {null};

    /* renamed from: TINKER_LOADER_METHOD */
    private static final java.lang.String f55512xd874416d = "tryLoad";

    /* renamed from: delegateClassName */
    private final java.lang.String f55513xb675c41e;

    /* renamed from: loaderClassName */
    private final java.lang.String f55514x368f7150;

    /* renamed from: mCurrentClassLoader */
    protected java.lang.ClassLoader f55515x97a51bbf;

    /* renamed from: mInlineFence */
    private android.os.Handler f55516x46f4266b;

    /* renamed from: tinkerFlags */
    private final int f55517x6fb0aea8;

    /* renamed from: tinkerLoadVerifyFlag */
    private final boolean f55518x45ae260a;

    /* renamed from: tinkerResultIntent */
    protected android.content.Intent f55519xf990a9d8;

    /* renamed from: useDelegateLastClassLoader */
    private final boolean f55520xf626d169;

    /* renamed from: useInterpretModeOnSupported32BitSystem */
    private final boolean f55521x6c8da677;

    /* renamed from: useSafeMode */
    private boolean f55522xb5839177;

    public AbstractApplicationC26612x4766a891(int i17) {
        this(i17, "com.tencent.tinker.entry.DefaultApplicationLike");
    }

    /* renamed from: createInlineFence */
    private android.os.Handler m104535xca05e67c(android.app.Application application, int i17, java.lang.String str, boolean z17, long j17, long j18, android.content.Intent intent) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str, false, this.f55515x97a51bbf);
            java.lang.Class<?> cls2 = java.lang.Long.TYPE;
            java.lang.Object newInstance = cls.getConstructor(android.app.Application.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, cls2, cls2, android.content.Intent.class).newInstance(application, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), intent);
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("com.tencent.tinker.entry.TinkerApplicationInlineFence", false, this.f55515x97a51bbf).getConstructor(java.lang.Class.forName("com.tencent.tinker.entry.ApplicationLike", false, this.f55515x97a51bbf));
            constructor.setAccessible(true);
            return (android.os.Handler) constructor.newInstance(newInstance);
        } catch (java.lang.Throwable th6) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("createInlineFence failed", th6);
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 m104536x9cf0d20b() {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 abstractApplicationC26612x4766a891;
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891[] abstractApplicationC26612x4766a891Arr = f55511xaa9e69ff;
        synchronized (abstractApplicationC26612x4766a891Arr) {
            abstractApplicationC26612x4766a891 = abstractApplicationC26612x4766a891Arr[0];
            if (abstractApplicationC26612x4766a891 == null) {
                throw new java.lang.IllegalStateException("TinkerApplication is not initialized.");
            }
        }
        return abstractApplicationC26612x4766a891;
    }

    /* renamed from: loadTinker */
    private void m104537xf43b57a5() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(this.f55514x368f7150, false, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891.class.getClassLoader());
            this.f55519xf990a9d8 = (android.content.Intent) cls.getMethod(f55512xd874416d, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891.class).invoke(cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]), this);
        } catch (java.lang.Throwable th6) {
            android.content.Intent intent = new android.content.Intent();
            this.f55519xf990a9d8 = intent;
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -20);
            this.f55519xf990a9d8.putExtra("intent_patch_exception", th6);
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26611x2c480bf6(this));
        m104543xb9ef6503(context, elapsedRealtime, currentTimeMillis);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        android.content.res.AssetManager assets = super.getAssets();
        android.os.Handler handler = this.f55516x46f4266b;
        return handler == null ? assets : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104545x8f0c05bb(handler, assets);
    }

    @Override // android.content.ContextWrapper
    public android.content.Context getBaseContext() {
        android.content.Context baseContext = super.getBaseContext();
        android.os.Handler handler = this.f55516x46f4266b;
        return handler == null ? baseContext : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104546x6e3ba66(handler, baseContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
        java.lang.ClassLoader classLoader = super.getClassLoader();
        android.os.Handler handler = this.f55516x46f4266b;
        return handler == null ? classLoader : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104547xbe7dc73(handler, classLoader);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources = super.getResources();
        android.os.Handler handler = this.f55516x46f4266b;
        return handler == null ? resources : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104548xc36960ed(handler, resources);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        android.os.Handler handler = this.f55516x46f4266b;
        return handler == null ? systemService : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104549xf0b0e84e(handler, str, systemService);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = super.getTheme();
        android.os.Handler handler = this.f55516x46f4266b;
        return handler == null ? theme : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104550x7940bc91(handler, theme);
    }

    /* renamed from: getTinkerFlags */
    public int m104538x4986f572() {
        return this.f55517x6fb0aea8;
    }

    /* renamed from: isTinkerLoadVerifyFlag */
    public boolean m104539x27032e54() {
        return this.f55518x45ae260a;
    }

    /* renamed from: isUseDelegateLastClassLoader */
    public boolean m104540x4022fa33() {
        return this.f55520xf626d169;
    }

    /* renamed from: isUseInterpretModeOnSupported32BitSystem */
    public boolean m104541x48f0f041() {
        return this.f55521x6c8da677;
    }

    /* renamed from: mzNightModeUseOf */
    public int m104542xc80aabb0() {
        android.os.Handler handler = this.f55516x46f4266b;
        if (handler == null) {
            return 1;
        }
        return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104551xd0bba60e(handler);
    }

    /* renamed from: onBaseContextAttached */
    public void m104543xb9ef6503(android.content.Context context, long j17, long j18) {
        try {
            m104537xf43b57a5();
            this.f55515x97a51bbf = context.getClassLoader();
            android.os.Handler m104535xca05e67c = m104535xca05e67c(this, this.f55517x6fb0aea8, this.f55513xb675c41e, this.f55518x45ae260a, j17, j18, this.f55519xf990a9d8);
            this.f55516x46f4266b = m104535xca05e67c;
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104552xcf6d0145(m104535xca05e67c, context);
            if (this.f55522xb5839177) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104760x10df66dd(this, 0);
            }
        } catch (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6 e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6(th6.getMessage(), th6);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.os.Handler handler = this.f55516x46f4266b;
        if (handler == null) {
            return;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104553xeb17ad5b(handler, configuration);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        android.os.Handler handler = this.f55516x46f4266b;
        if (handler == null) {
            return;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104554x426a1839(handler);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        android.os.Handler handler = this.f55516x46f4266b;
        if (handler == null) {
            return;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104555x4c5e6118(handler);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        android.os.Handler handler = this.f55516x46f4266b;
        if (handler == null) {
            return;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104556xe0aa204(handler);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        android.os.Handler handler = this.f55516x46f4266b;
        if (handler == null) {
            return;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.C26613xb81ebbef.m104557x63978c80(handler, i17);
    }

    /* renamed from: setUseSafeMode */
    public void m104544x25bf4bb5(boolean z17) {
        this.f55522xb5839177 = z17;
    }

    public AbstractApplicationC26612x4766a891(int i17, java.lang.String str) {
        this(i17, str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26604x9a97c832.class.getName(), false);
    }

    public AbstractApplicationC26612x4766a891(int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        this(i17, str, str2, z17, true, false);
    }

    public AbstractApplicationC26612x4766a891(int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        this(i17, str, str2, z17, z18, false);
    }

    public AbstractApplicationC26612x4766a891(int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19) {
        this.f55515x97a51bbf = null;
        this.f55516x46f4266b = null;
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891[] abstractApplicationC26612x4766a891Arr = f55511xaa9e69ff;
        synchronized (abstractApplicationC26612x4766a891Arr) {
            abstractApplicationC26612x4766a891Arr[0] = this;
        }
        this.f55517x6fb0aea8 = i17;
        this.f55513xb675c41e = str;
        this.f55514x368f7150 = str2;
        this.f55518x45ae260a = z17;
        this.f55520xf626d169 = z18;
        this.f55521x6c8da677 = z19;
    }
}
