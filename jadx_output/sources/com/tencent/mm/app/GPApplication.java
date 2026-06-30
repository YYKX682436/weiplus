package com.tencent.mm.app;

/* loaded from: classes13.dex */
public class GPApplication extends android.app.Application {
    private static final java.lang.String CLASSLOADER_INITIALIZER_CLASSNAME = "com.tencent.mm.plugin.expansions.ExpansionsClassLoaderInitializer";
    private static final java.lang.String CLASSLOADER_INITIALIZER_METHODNAME = "initializeClassLoader";
    private static final java.lang.String TAG = "MicroMsg.GPApplication";
    private static final java.lang.String WECHAT_APPLICATION_LIKE_CLASSNAME = "com.tencent.mm.app.MMApplicationLike";
    private boolean mIsAttachBaseContextDone = false;
    private final boolean[] mIsDisallowedToCallGetBaseContextInAttachBaseContext = {false};
    private final android.content.Intent mResultIntent = new android.content.Intent();
    private android.os.Handler mInlineFence = null;

    private android.os.Handler createInlineFence(long j17, long j18, java.lang.ClassLoader classLoader) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(WECHAT_APPLICATION_LIKE_CLASSNAME, false, classLoader);
            java.lang.Class<?> cls2 = java.lang.Long.TYPE;
            java.lang.Object newInstance = cls.getConstructor(android.app.Application.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, cls2, cls2, android.content.Intent.class).newInstance(this, 0, java.lang.Boolean.TRUE, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), this.mResultIntent);
            java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName("com.tencent.mm.app.GPAppInlineFence", false, classLoader).getDeclaredConstructor(java.lang.Class.forName("com.tencent.tinker.entry.ApplicationLike", false, classLoader));
            declaredConstructor.setAccessible(true);
            return (android.os.Handler) declaredConstructor.newInstance(newInstance);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.IllegalStateException("createInlineFence failed", th6);
        }
    }

    private void replaceAndInitAppClassLoader() {
        try {
            java.lang.ClassLoader injectOnDemand = com.tencent.mm.obb.loader.ObbClassLoader.injectOnDemand(this);
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(CLASSLOADER_INITIALIZER_CLASSNAME, false, injectOnDemand);
                cls.getDeclaredMethod(CLASSLOADER_INITIALIZER_METHODNAME, android.app.Application.class, java.lang.ClassLoader.class).invoke(cls.newInstance(), this, injectOnDemand);
                com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(this.mResultIntent, -1);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "[-] Error when init expansion classloader.", new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th7, "[-] Error when inject expansion classloader.", new java.lang.Object[0]);
        }
    }

    public android.content.Context _doNotCallThisMethodUnlessYouNeedToGetBaseContextForHacking() {
        android.content.Context baseContext = super.getBaseContext();
        android.os.Handler handler = this.mInlineFence;
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
        replaceAndInitAppClassLoader();
        android.os.Handler createInlineFence = createInlineFence(elapsedRealtime, currentTimeMillis, context.getClassLoader());
        this.mInlineFence = createInlineFence;
        this.mIsAttachBaseContextDone = true;
        createInlineFence.handleMessage(android.os.Message.obtain(createInlineFence, 1, context));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        android.content.res.AssetManager assets = super.getAssets();
        android.os.Handler handler = this.mInlineFence;
        if (handler == null) {
            return assets;
        }
        android.os.Message obtain = android.os.Message.obtain(handler, 9, assets);
        handler.handleMessage(obtain);
        return (android.content.res.AssetManager) obtain.obj;
    }

    @Override // android.content.ContextWrapper
    public android.content.Context getBaseContext() {
        if (!this.mIsAttachBaseContextDone && isDisallowedToCallGetBaseContextInAttachBaseContext()) {
            throw new java.lang.UnsupportedOperationException("please don't call app.getBaseContext(), use app itself directly would be fine in most cases.");
        }
        android.content.Context baseContext = super.getBaseContext();
        android.os.Handler handler = this.mInlineFence;
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
        android.os.Handler handler = this.mInlineFence;
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
        android.os.Handler handler = this.mInlineFence;
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
        android.os.Handler handler = this.mInlineFence;
        if (handler == null) {
            return systemService;
        }
        android.os.Message obtain = android.os.Message.obtain(handler, 11, new java.lang.Object[]{str, systemService});
        handler.handleMessage(obtain);
        return obtain.obj;
    }

    public boolean isDisallowedToCallGetBaseContextInAttachBaseContext() {
        boolean z17;
        synchronized (this.mIsDisallowedToCallGetBaseContextInAttachBaseContext) {
            z17 = this.mIsDisallowedToCallGetBaseContextInAttachBaseContext[0];
        }
        return z17;
    }

    public void markDisallowToCallGetBaseContextInAttachBaseContext() {
        synchronized (this.mIsDisallowedToCallGetBaseContextInAttachBaseContext) {
            this.mIsDisallowedToCallGetBaseContextInAttachBaseContext[0] = true;
        }
    }

    public int mzNightModeUseOf() {
        android.os.Handler handler = this.mInlineFence;
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
        android.os.Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 3, configuration));
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        android.os.Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 2));
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        android.os.Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 5));
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        android.os.Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 6));
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        android.os.Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(android.os.Message.obtain(handler, 4, java.lang.Integer.valueOf(i17)));
        }
    }
}
