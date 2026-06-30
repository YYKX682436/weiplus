package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.GPApplication */
/* loaded from: classes13.dex */
public class ApplicationC4997x4de828a7 extends android.app.Application {

    /* renamed from: CLASSLOADER_INITIALIZER_CLASSNAME */
    private static final java.lang.String f21405x400b64d2 = "com.tencent.mm.plugin.expansions.ExpansionsClassLoaderInitializer";

    /* renamed from: CLASSLOADER_INITIALIZER_METHODNAME */
    private static final java.lang.String f21406xa6d7cfdd = "initializeClassLoader";
    private static final java.lang.String TAG = "MicroMsg.GPApplication";

    /* renamed from: WECHAT_APPLICATION_LIKE_CLASSNAME */
    private static final java.lang.String f21407x3201c8e3 = "com.tencent.mm.app.MMApplicationLike";

    /* renamed from: mIsAttachBaseContextDone */
    private boolean f21409xd748c704 = false;

    /* renamed from: mIsDisallowedToCallGetBaseContextInAttachBaseContext */
    private final boolean[] f21410x4887cd02 = {false};

    /* renamed from: mResultIntent */
    private final android.content.Intent f21411x9157ba26 = new android.content.Intent();

    /* renamed from: mInlineFence */
    private android.os.Handler f21408x46f4266b = null;

    /* renamed from: createInlineFence */
    private android.os.Handler m42952xca05e67c(long j17, long j18, java.lang.ClassLoader classLoader) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(f21407x3201c8e3, false, classLoader);
            java.lang.Class<?> cls2 = java.lang.Long.TYPE;
            java.lang.Object newInstance = cls.getConstructor(android.app.Application.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, cls2, cls2, android.content.Intent.class).newInstance(this, 0, java.lang.Boolean.TRUE, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), this.f21411x9157ba26);
            java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName("com.tencent.mm.app.GPAppInlineFence", false, classLoader).getDeclaredConstructor(java.lang.Class.forName("com.tencent.tinker.entry.ApplicationLike", false, classLoader));
            declaredConstructor.setAccessible(true);
            return (android.os.Handler) declaredConstructor.newInstance(newInstance);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.IllegalStateException("createInlineFence failed", th6);
        }
    }

    /* renamed from: replaceAndInitAppClassLoader */
    private void m42953xec8143dd() {
        try {
            java.lang.ClassLoader m48364xf8acadbb = com.p314xaae8f345.mm.obb.p978xbe953013.C11195x1ded775c.m48364xf8acadbb(this);
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(f21405x400b64d2, false, m48364xf8acadbb);
                cls.getDeclaredMethod(f21406xa6d7cfdd, android.app.Application.class, java.lang.ClassLoader.class).invoke(cls.newInstance(), this, m48364xf8acadbb);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(this.f21411x9157ba26, -1);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "[-] Error when init expansion classloader.", new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th7, "[-] Error when inject expansion classloader.", new java.lang.Object[0]);
        }
    }

    /* renamed from: _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking */
    public android.content.Context m42954x23d85138() {
        android.content.Context baseContext = super.getBaseContext();
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler == null) {
            return baseContext;
        }
        android.os.Message obtain = android.os.Message.obtain(handler, 8, baseContext);
        handler.handleMessage(obtain);
        return (android.content.Context) obtain.obj;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        m42953xec8143dd();
        android.os.Handler m42952xca05e67c = m42952xca05e67c(elapsedRealtime, currentTimeMillis, context.getClassLoader());
        this.f21408x46f4266b = m42952xca05e67c;
        this.f21409xd748c704 = true;
        m42952xca05e67c.handleMessage(android.os.Message.obtain(m42952xca05e67c, 1, context));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        android.content.res.AssetManager assets = super.getAssets();
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler == null) {
            return assets;
        }
        android.os.Message obtain = android.os.Message.obtain(handler, 9, assets);
        handler.handleMessage(obtain);
        return (android.content.res.AssetManager) obtain.obj;
    }

    @Override // android.content.ContextWrapper
    public android.content.Context getBaseContext() {
        if (!this.f21409xd748c704 && m42955x34b1caaf()) {
            throw new java.lang.UnsupportedOperationException("please don't call app.getBaseContext(), use app itself directly would be fine in most cases.");
        }
        android.content.Context baseContext = super.getBaseContext();
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler == null) {
            return baseContext;
        }
        android.os.Message obtain = android.os.Message.obtain(handler, 8, baseContext);
        handler.handleMessage(obtain);
        return (android.content.Context) obtain.obj;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
        java.lang.ClassLoader classLoader = super.getClassLoader();
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler == null) {
            return classLoader;
        }
        android.os.Message obtain = android.os.Message.obtain(handler, 7, classLoader);
        handler.handleMessage(obtain);
        return (java.lang.ClassLoader) obtain.obj;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources = super.getResources();
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler == null) {
            return resources;
        }
        android.os.Message obtain = android.os.Message.obtain(handler, 10, resources);
        handler.handleMessage(obtain);
        return (android.content.res.Resources) obtain.obj;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler == null) {
            return systemService;
        }
        android.os.Message obtain = android.os.Message.obtain(handler, 11, new java.lang.Object[]{str, systemService});
        handler.handleMessage(obtain);
        return obtain.obj;
    }

    /* renamed from: isDisallowedToCallGetBaseContextInAttachBaseContext */
    public boolean m42955x34b1caaf() {
        boolean z17;
        synchronized (this.f21410x4887cd02) {
            z17 = this.f21410x4887cd02[0];
        }
        return z17;
    }

    /* renamed from: markDisallowToCallGetBaseContextInAttachBaseContext */
    public void m42956xac28aeeb() {
        synchronized (this.f21410x4887cd02) {
            this.f21410x4887cd02[0] = true;
        }
    }

    /* renamed from: mzNightModeUseOf */
    public int m42957xc80aabb0() {
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler == null) {
            return 1;
        }
        android.os.Message obtain = android.os.Message.obtain(handler, 12);
        handler.handleMessage(obtain);
        return ((java.lang.Integer) obtain.obj).intValue();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 3, configuration));
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 2));
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 5));
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 6));
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        android.os.Handler handler = this.f21408x46f4266b;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 4, java.lang.Integer.valueOf(i17)));
        }
    }
}
