package androidx.camera.core;

/* loaded from: classes14.dex */
public final class CameraX {
    private static final java.lang.String RETRY_TOKEN = "retry_token";
    private static final java.lang.String TAG = "CameraX";
    private final java.util.concurrent.Executor mCameraExecutor;
    private androidx.camera.core.impl.CameraFactory mCameraFactory;
    final androidx.camera.core.impl.CameraRepository mCameraRepository;
    private final androidx.camera.core.CameraXConfig mCameraXConfig;
    private androidx.camera.core.impl.UseCaseConfigFactory mDefaultConfigFactory;
    private final wa.a mInitInternalFuture;
    private androidx.camera.core.CameraX.InternalInitState mInitState;
    private final java.lang.Object mInitializeLock;
    private final java.lang.Integer mMinLogLevel;
    private final androidx.camera.core.RetryPolicy mRetryPolicy;
    private final android.os.Handler mSchedulerHandler;
    private final android.os.HandlerThread mSchedulerThread;
    private wa.a mShutdownInternalFuture;
    private androidx.camera.core.impl.CameraDeviceSurfaceManager mSurfaceManager;
    private static final java.lang.Object MIN_LOG_LEVEL_LOCK = new java.lang.Object();
    private static final android.util.SparseArray<java.lang.Integer> sMinLogLevelReferenceCountMap = new android.util.SparseArray<>();

    /* loaded from: classes14.dex */
    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public CameraX(android.content.Context context, androidx.camera.core.CameraXConfig.Provider provider) {
        this(context, provider, new androidx.camera.core.impl.QuirkSettingsLoader());
    }

    private static void decreaseMinLogLevelReference(java.lang.Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            android.util.SparseArray<java.lang.Integer> sparseArray = sMinLogLevelReferenceCountMap;
            int intValue = sparseArray.get(num.intValue()).intValue() - 1;
            if (intValue == 0) {
                sparseArray.remove(num.intValue());
            } else {
                sparseArray.put(num.intValue(), java.lang.Integer.valueOf(intValue));
            }
            updateOrResetMinLogLevel();
        }
    }

    private static androidx.camera.core.CameraXConfig.Provider getConfigProvider(android.content.Context context) {
        android.content.ComponentCallbacks2 applicationFromContext = androidx.camera.core.impl.utils.ContextUtil.getApplicationFromContext(context);
        if (applicationFromContext instanceof androidx.camera.core.CameraXConfig.Provider) {
            return (androidx.camera.core.CameraXConfig.Provider) applicationFromContext;
        }
        try {
            android.content.Context applicationContext = androidx.camera.core.impl.utils.ContextUtil.getApplicationContext(context);
            android.os.Bundle bundle = applicationContext.getPackageManager().getServiceInfo(new android.content.ComponentName(applicationContext, (java.lang.Class<?>) androidx.camera.core.impl.MetadataHolderService.class), 640).metaData;
            java.lang.String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (androidx.camera.core.CameraXConfig.Provider) java.lang.Class.forName(string).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            }
            androidx.camera.core.Logger.e(TAG, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.NullPointerException | java.lang.reflect.InvocationTargetException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e17);
            return null;
        }
    }

    private static void increaseMinLogLevelReference(java.lang.Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            m3.h.c(num.intValue(), 3, 6, "minLogLevel");
            android.util.SparseArray<java.lang.Integer> sparseArray = sMinLogLevelReferenceCountMap;
            sparseArray.put(num.intValue(), java.lang.Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
            updateOrResetMinLogLevel();
        }
    }

    private void initAndRetryRecursively(final java.util.concurrent.Executor executor, final long j17, final int i17, final android.content.Context context, final t2.k kVar) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.CameraX$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.CameraX.this.lambda$initAndRetryRecursively$2(context, executor, i17, kVar, j17);
            }
        });
    }

    private wa.a initInternal(final android.content.Context context) {
        wa.a a17;
        synchronized (this.mInitializeLock) {
            m3.h.e(this.mInitState == androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.mInitState = androidx.camera.core.CameraX.InternalInitState.INITIALIZING;
            a17 = t2.p.a(new t2.m() { // from class: androidx.camera.core.CameraX$$e
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$initInternal$0;
                    lambda$initInternal$0 = androidx.camera.core.CameraX.this.lambda$initInternal$0(context, kVar);
                    return lambda$initInternal$0;
                }
            });
        }
        return a17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAndRetryRecursively$1(java.util.concurrent.Executor executor, long j17, int i17, android.content.Context context, t2.k kVar) {
        initAndRetryRecursively(executor, j17, i17 + 1, context, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lambda$initAndRetryRecursively$2(android.content.Context r19, final java.util.concurrent.Executor r20, final int r21, final t2.k r22, final long r23) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.lambda$initAndRetryRecursively$2(android.content.Context, java.util.concurrent.Executor, int, t2.k, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$initInternal$0(android.content.Context context, t2.k kVar) {
        initAndRetryRecursively(this.mCameraExecutor, android.os.SystemClock.elapsedRealtime(), 1, context, kVar);
        return "CameraX initInternal";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shutdownInternal$3(t2.k kVar) {
        if (this.mSchedulerThread != null) {
            java.util.concurrent.Executor executor = this.mCameraExecutor;
            if (executor instanceof androidx.camera.core.CameraExecutor) {
                ((androidx.camera.core.CameraExecutor) executor).deinit();
            }
            this.mSchedulerThread.quit();
        }
        kVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$shutdownInternal$4(final t2.k kVar) {
        this.mCameraRepository.deinit().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.CameraX$$d
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.CameraX.this.lambda$shutdownInternal$3(kVar);
            }
        }, this.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = androidx.camera.core.CameraX.InternalInitState.INITIALIZED;
        }
    }

    private wa.a shutdownInternal() {
        synchronized (this.mInitializeLock) {
            this.mSchedulerHandler.removeCallbacksAndMessages(RETRY_TOKEN);
            int ordinal = this.mInitState.ordinal();
            if (ordinal == 0) {
                this.mInitState = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN;
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }
            if (ordinal == 1) {
                throw new java.lang.IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
            if (ordinal == 2 || ordinal == 3) {
                this.mInitState = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN;
                decreaseMinLogLevelReference(this.mMinLogLevel);
                this.mShutdownInternalFuture = t2.p.a(new t2.m() { // from class: androidx.camera.core.CameraX$$b
                    @Override // t2.m
                    public final java.lang.Object attachCompleter(t2.k kVar) {
                        java.lang.Object lambda$shutdownInternal$4;
                        lambda$shutdownInternal$4 = androidx.camera.core.CameraX.this.lambda$shutdownInternal$4(kVar);
                        return lambda$shutdownInternal$4;
                    }
                });
            }
            return this.mShutdownInternalFuture;
        }
    }

    private void traceExecutionState(androidx.camera.core.RetryPolicy.ExecutionState executionState) {
        if (t4.a.d()) {
            t4.a.e("CX:CameraProvider-RetryStatus", executionState != null ? executionState.getStatus() : -1);
        }
    }

    private static void updateOrResetMinLogLevel() {
        android.util.SparseArray<java.lang.Integer> sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            androidx.camera.core.Logger.resetMinLogLevel();
            return;
        }
        if (sparseArray.get(3) != null) {
            androidx.camera.core.Logger.setMinLogLevel(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            androidx.camera.core.Logger.setMinLogLevel(4);
        } else if (sparseArray.get(5) != null) {
            androidx.camera.core.Logger.setMinLogLevel(5);
        } else if (sparseArray.get(6) != null) {
            androidx.camera.core.Logger.setMinLogLevel(6);
        }
    }

    private static void updateQuirkSettings(android.content.Context context, androidx.camera.core.impl.QuirkSettings quirkSettings, r.a aVar) {
        if (quirkSettings != null) {
            androidx.camera.core.Logger.d(TAG, "QuirkSettings from CameraXConfig: " + quirkSettings);
        } else {
            quirkSettings = (androidx.camera.core.impl.QuirkSettings) aVar.apply(context);
            androidx.camera.core.Logger.d(TAG, "QuirkSettings from app metadata: " + quirkSettings);
        }
        if (quirkSettings == null) {
            quirkSettings = androidx.camera.core.impl.QuirkSettingsHolder.DEFAULT;
            androidx.camera.core.Logger.d(TAG, "QuirkSettings by default: " + quirkSettings);
        }
        androidx.camera.core.impl.QuirkSettingsHolder.instance().set(quirkSettings);
    }

    public androidx.camera.core.impl.CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    public androidx.camera.core.impl.CameraFactory getCameraFactory() {
        androidx.camera.core.impl.CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    public androidx.camera.core.impl.CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    public androidx.camera.core.impl.UseCaseConfigFactory getDefaultConfigFactory() {
        androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
    }

    public wa.a getInitializeFuture() {
        return this.mInitInternalFuture;
    }

    public boolean isInitialized() {
        boolean z17;
        synchronized (this.mInitializeLock) {
            z17 = this.mInitState == androidx.camera.core.CameraX.InternalInitState.INITIALIZED;
        }
        return z17;
    }

    public wa.a shutdown() {
        return shutdownInternal();
    }

    public CameraX(android.content.Context context, androidx.camera.core.CameraXConfig.Provider provider, r.a aVar) {
        this.mCameraRepository = new androidx.camera.core.impl.CameraRepository();
        this.mInitializeLock = new java.lang.Object();
        this.mInitState = androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED;
        this.mShutdownInternalFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        if (provider != null) {
            this.mCameraXConfig = provider.getCameraXConfig();
        } else {
            androidx.camera.core.CameraXConfig.Provider configProvider = getConfigProvider(context);
            if (configProvider != null) {
                this.mCameraXConfig = configProvider.getCameraXConfig();
            } else {
                throw new java.lang.IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        updateQuirkSettings(context, this.mCameraXConfig.getQuirkSettings(), aVar);
        java.util.concurrent.Executor cameraExecutor = this.mCameraXConfig.getCameraExecutor(null);
        android.os.Handler schedulerHandler = this.mCameraXConfig.getSchedulerHandler(null);
        this.mCameraExecutor = cameraExecutor == null ? new androidx.camera.core.CameraExecutor() : cameraExecutor;
        if (schedulerHandler == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = j3.k.a(handlerThread.getLooper());
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = schedulerHandler;
        }
        java.lang.Integer num = (java.lang.Integer) this.mCameraXConfig.retrieveOption(androidx.camera.core.CameraXConfig.OPTION_MIN_LOGGING_LEVEL, null);
        this.mMinLogLevel = num;
        increaseMinLogLevelReference(num);
        this.mRetryPolicy = new androidx.camera.core.RetryPolicy.Builder(this.mCameraXConfig.getCameraProviderInitRetryPolicy()).build();
        this.mInitInternalFuture = initInternal(context);
    }
}
