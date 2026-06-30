package androidx.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 b2\u00020\u0001:\u0001bB\t\b\u0002¢\u0006\u0004\b`\u0010aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\tH\u0007J7\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u001d\"\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b \u0010!J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0007J\u0018\u0010 \u001a\u00020'2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0007Jk\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010-2\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0$2\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u001d\"\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J'\u00104\u001a\u00020\u000e2\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u001d\"\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b4\u00105J\b\u00106\u001a\u00020\u000eH\u0017J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120$H\u0016J\u0010\u00109\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010C\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010\u00190\u00190\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M0K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010Q\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR0\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00120$2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00120$8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001d\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120$0$8G¢\u0006\u0006\u001a\u0004\b\\\u0010XR\u0011\u0010^\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006c"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider;", "Landroidx/camera/lifecycle/LifecycleCameraProvider;", "Landroidx/camera/core/UseCase;", "useCase", "", "isVideoCapture", "isPreview", "Landroid/content/Context;", "context", "Lwa/a;", "Landroidx/camera/core/CameraX;", "getOrCreateCameraXInstance", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Ljz5/f0;", "configureInstanceInternal", "Landroidx/camera/core/CameraSelector;", "cameraSelector", "Landroidx/camera/core/CameraInfo;", "cameraInfo", "Landroidx/camera/core/impl/CameraConfig;", "getCameraConfig", "cameraX", "setCameraX", "setContext", "Ljava/lang/Void;", "shutdownAsync", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "useCases", "Landroidx/camera/core/Camera;", "bindToLifecycle", "(Landroidx/lifecycle/y;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/UseCaseGroup;", "useCaseGroup", "", "Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;", "singleCameraConfigs", "Landroidx/camera/core/ConcurrentCamera;", "primaryCameraSelector", "secondaryCameraSelector", "Landroidx/camera/core/LayoutSettings;", "primaryLayoutSettings", "secondaryLayoutSettings", "Landroidx/camera/core/ViewPort;", "viewPort", "Landroidx/camera/core/CameraEffect;", "effects", "bindToLifecycle$camera_lifecycle_release", "(Landroidx/lifecycle/y;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/LayoutSettings;Landroidx/camera/core/LayoutSettings;Landroidx/camera/core/ViewPort;Ljava/util/List;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "isBound", "unbind", "([Landroidx/camera/core/UseCase;)V", "unbindAll", "hasCamera", "getAvailableCameraInfos", "getCameraInfo", "", "mLock", "Ljava/lang/Object;", "Landroidx/camera/core/CameraXConfig$Provider;", "mCameraXConfigProvider", "Landroidx/camera/core/CameraXConfig$Provider;", "mCameraXInitializeFuture", "Lwa/a;", "kotlin.jvm.PlatformType", "mCameraXShutdownFuture", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "mLifecycleCameraRepository", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "mCameraX", "Landroidx/camera/core/CameraX;", "mContext", "Landroid/content/Context;", "", "Landroidx/camera/core/internal/CameraUseCaseAdapter$CameraId;", "Landroidx/camera/core/impl/RestrictedCameraInfo;", "mCameraInfoMap", "Ljava/util/Map;", "", "cameraOperatingMode", "getCameraOperatingMode", "()I", "setCameraOperatingMode", "(I)V", "cameraInfos", "getActiveConcurrentCameraInfos", "()Ljava/util/List;", "setActiveConcurrentCameraInfos", "(Ljava/util/List;)V", "activeConcurrentCameraInfos", "getAvailableConcurrentCameraInfos", "availableConcurrentCameraInfos", "isConcurrentCameraModeOn", "()Z", "<init>", "()V", "Companion", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes14.dex */
public final class ProcessCameraProvider implements androidx.camera.lifecycle.LifecycleCameraProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.lifecycle.ProcessCameraProvider.Companion INSTANCE = new androidx.camera.lifecycle.ProcessCameraProvider.Companion(null);
    private static final androidx.camera.lifecycle.ProcessCameraProvider sAppInstance = new androidx.camera.lifecycle.ProcessCameraProvider();
    private final java.util.Map<androidx.camera.core.internal.CameraUseCaseAdapter.CameraId, androidx.camera.core.impl.RestrictedCameraInfo> mCameraInfoMap;
    private androidx.camera.core.CameraX mCameraX;
    private androidx.camera.core.CameraXConfig.Provider mCameraXConfigProvider;
    private wa.a mCameraXInitializeFuture;
    private wa.a mCameraXShutdownFuture;
    private android.content.Context mContext;
    private final androidx.camera.lifecycle.LifecycleCameraRepository mLifecycleCameraRepository;
    private final java.lang.Object mLock = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;", "", "Landroid/content/Context;", "context", "Lwa/a;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getInstance", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Ljz5/f0;", "configureInstance", "sAppInstance", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "<init>", "()V", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.camera.lifecycle.ProcessCameraProvider getInstance$lambda$0(yz5.l tmp0, java.lang.Object obj) {
            kotlin.jvm.internal.o.g(tmp0, "$tmp0");
            return (androidx.camera.lifecycle.ProcessCameraProvider) tmp0.invoke(obj);
        }

        public final void configureInstance(androidx.camera.core.CameraXConfig cameraXConfig) {
            kotlin.jvm.internal.o.g(cameraXConfig, "cameraXConfig");
            t4.a.f("CX:configureInstance");
            androidx.camera.lifecycle.ProcessCameraProvider.sAppInstance.configureInstanceInternal(cameraXConfig);
        }

        public final wa.a getInstance(android.content.Context context) {
            kotlin.jvm.internal.o.g(context, "context");
            wa.a orCreateCameraXInstance = androidx.camera.lifecycle.ProcessCameraProvider.sAppInstance.getOrCreateCameraXInstance(context);
            final androidx.camera.lifecycle.ProcessCameraProvider$Companion$getInstance$1 processCameraProvider$Companion$getInstance$1 = new androidx.camera.lifecycle.ProcessCameraProvider$Companion$getInstance$1(context);
            wa.a transform = androidx.camera.core.impl.utils.futures.Futures.transform(orCreateCameraXInstance, new r.a() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$$a
                @Override // r.a
                public final java.lang.Object apply(java.lang.Object obj) {
                    androidx.camera.lifecycle.ProcessCameraProvider instance$lambda$0;
                    instance$lambda$0 = androidx.camera.lifecycle.ProcessCameraProvider.Companion.getInstance$lambda$0(yz5.l.this, obj);
                    return instance$lambda$0;
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            kotlin.jvm.internal.o.f(transform, "context: Context): Liste…tExecutor()\n            )");
            return transform;
        }
    }

    private ProcessCameraProvider() {
        wa.a immediateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        kotlin.jvm.internal.o.f(immediateFuture, "immediateFuture<Void>(null)");
        this.mCameraXShutdownFuture = immediateFuture;
        this.mLifecycleCameraRepository = new androidx.camera.lifecycle.LifecycleCameraRepository();
        this.mCameraInfoMap = new java.util.HashMap();
    }

    public static final void configureInstance(androidx.camera.core.CameraXConfig cameraXConfig) {
        INSTANCE.configureInstance(cameraXConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureInstanceInternal(final androidx.camera.core.CameraXConfig cameraXConfig) {
        t4.a.f("CX:configureInstanceInternal");
        synchronized (this.mLock) {
            cameraXConfig.getClass();
            m3.h.e(this.mCameraXConfigProvider == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
            this.mCameraXConfigProvider = new androidx.camera.core.CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$configureInstanceInternal$1$1$1
                @Override // androidx.camera.core.CameraXConfig.Provider
                public final androidx.camera.core.CameraXConfig getCameraXConfig() {
                    return androidx.camera.core.CameraXConfig.this;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<androidx.camera.core.CameraInfo> getActiveConcurrentCameraInfos() {
        androidx.camera.core.CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return new java.util.ArrayList();
        }
        kotlin.jvm.internal.o.d(cameraX);
        java.util.List<androidx.camera.core.CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
        kotlin.jvm.internal.o.f(activeConcurrentCameraInfos, "mCameraX!!.cameraFactory…tiveConcurrentCameraInfos");
        return activeConcurrentCameraInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.camera.core.impl.CameraConfig getCameraConfig(androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.CameraInfo cameraInfo) {
        java.util.Iterator<androidx.camera.core.CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        androidx.camera.core.impl.CameraConfig cameraConfig = null;
        while (it.hasNext()) {
            androidx.camera.core.CameraFilter next = it.next();
            kotlin.jvm.internal.o.f(next, "cameraSelector.cameraFilterSet");
            androidx.camera.core.CameraFilter cameraFilter = next;
            if (!kotlin.jvm.internal.o.b(cameraFilter.getIdentifier(), androidx.camera.core.CameraFilter.DEFAULT_ID)) {
                androidx.camera.core.impl.CameraConfigProvider configProvider = androidx.camera.core.impl.ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier());
                android.content.Context context = this.mContext;
                kotlin.jvm.internal.o.d(context);
                androidx.camera.core.impl.CameraConfig config = configProvider.getConfig(cameraInfo, context);
                if (config == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new java.lang.IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
        }
        return cameraConfig == null ? androidx.camera.core.impl.CameraConfigs.defaultConfig() : cameraConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCameraOperatingMode() {
        androidx.camera.core.CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return 0;
        }
        kotlin.jvm.internal.o.d(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    public static final wa.a getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wa.a getOrCreateCameraXInstance(android.content.Context context) {
        synchronized (this.mLock) {
            wa.a aVar = this.mCameraXInitializeFuture;
            if (aVar != null) {
                kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
                return aVar;
            }
            final androidx.camera.core.CameraX cameraX = new androidx.camera.core.CameraX(context, this.mCameraXConfigProvider);
            wa.a a17 = t2.p.a(new t2.m() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$c
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object orCreateCameraXInstance$lambda$18$lambda$17;
                    orCreateCameraXInstance$lambda$18$lambda$17 = androidx.camera.lifecycle.ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17(androidx.camera.lifecycle.ProcessCameraProvider.this, cameraX, kVar);
                    return orCreateCameraXInstance$lambda$18$lambda$17;
                }
            });
            this.mCameraXInitializeFuture = a17;
            return a17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getOrCreateCameraXInstance$lambda$18$lambda$17(androidx.camera.lifecycle.ProcessCameraProvider this$0, final androidx.camera.core.CameraX cameraX, final t2.k completer) {
        kotlin.jvm.internal.o.g(this$0, "this$0");
        kotlin.jvm.internal.o.g(cameraX, "$cameraX");
        kotlin.jvm.internal.o.g(completer, "completer");
        synchronized (this$0.mLock) {
            androidx.camera.core.impl.utils.futures.FutureChain from = androidx.camera.core.impl.utils.futures.FutureChain.from(this$0.mCameraXShutdownFuture);
            final androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1 processCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1 = new androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1(cameraX);
            androidx.camera.core.impl.utils.futures.FutureChain transformAsync = from.transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$a
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a orCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15;
                    orCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15 = androidx.camera.lifecycle.ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15(yz5.l.this, obj);
                    return orCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15;
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            kotlin.jvm.internal.o.f(transformAsync, "cameraX = CameraX(contex…                        )");
            androidx.camera.core.impl.utils.futures.Futures.addCallback(transformAsync, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(java.lang.Throwable t17) {
                    kotlin.jvm.internal.o.g(t17, "t");
                    t2.k.this.b(t17);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(java.lang.Void r27) {
                    t2.k.this.a(cameraX);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wa.a getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15(yz5.l tmp0, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(tmp0, "$tmp0");
        return (wa.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview(androidx.camera.core.UseCase useCase) {
        return useCase instanceof androidx.camera.core.Preview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVideoCapture(androidx.camera.core.UseCase useCase) {
        return useCase.getCurrentConfig().containsOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveConcurrentCameraInfos(java.util.List<? extends androidx.camera.core.CameraInfo> list) {
        androidx.camera.core.CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        kotlin.jvm.internal.o.d(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i17) {
        androidx.camera.core.CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        kotlin.jvm.internal.o.d(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraX(androidx.camera.core.CameraX cameraX) {
        this.mCameraX = cameraX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContext(android.content.Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdownAsync$lambda$0(androidx.camera.lifecycle.ProcessCameraProvider this$0) {
        kotlin.jvm.internal.o.g(this$0, "this$0");
        this$0.unbindAll();
        this$0.mLifecycleCameraRepository.clear();
    }

    public final androidx.camera.core.Camera bindToLifecycle(androidx.lifecycle.y lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(cameraSelector, "cameraSelector");
        kotlin.jvm.internal.o.g(useCaseGroup, "useCaseGroup");
        t4.a.f("CX:bindToLifecycle-UseCaseGroup");
        if (getCameraOperatingMode() != 2) {
            setCameraOperatingMode(1);
            androidx.camera.core.LayoutSettings DEFAULT = androidx.camera.core.LayoutSettings.DEFAULT;
            kotlin.jvm.internal.o.f(DEFAULT, "DEFAULT");
            kotlin.jvm.internal.o.f(DEFAULT, "DEFAULT");
            androidx.camera.core.ViewPort viewPort = useCaseGroup.getViewPort();
            java.util.List<androidx.camera.core.CameraEffect> effects = useCaseGroup.getEffects();
            kotlin.jvm.internal.o.f(effects, "useCaseGroup.effects");
            java.util.List<androidx.camera.core.UseCase> useCases = useCaseGroup.getUseCases();
            kotlin.jvm.internal.o.f(useCases, "useCaseGroup.useCases");
            androidx.camera.core.UseCase[] useCaseArr = (androidx.camera.core.UseCase[]) useCases.toArray(new androidx.camera.core.UseCase[0]);
            return bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, viewPort, effects, (androidx.camera.core.UseCase[]) java.util.Arrays.copyOf(useCaseArr, useCaseArr.length));
        }
        throw new java.lang.UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
    }

    public final androidx.camera.core.Camera bindToLifecycle$camera_lifecycle_release(androidx.lifecycle.y lifecycleOwner, androidx.camera.core.CameraSelector primaryCameraSelector, androidx.camera.core.CameraSelector secondaryCameraSelector, androidx.camera.core.LayoutSettings primaryLayoutSettings, androidx.camera.core.LayoutSettings secondaryLayoutSettings, androidx.camera.core.ViewPort viewPort, java.util.List<? extends androidx.camera.core.CameraEffect> effects, androidx.camera.core.UseCase... useCases) {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        androidx.camera.core.impl.RestrictedCameraInfo restrictedCameraInfo;
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(primaryCameraSelector, "primaryCameraSelector");
        kotlin.jvm.internal.o.g(primaryLayoutSettings, "primaryLayoutSettings");
        kotlin.jvm.internal.o.g(secondaryLayoutSettings, "secondaryLayoutSettings");
        kotlin.jvm.internal.o.g(effects, "effects");
        kotlin.jvm.internal.o.g(useCases, "useCases");
        t4.a.f("CX:bindToLifecycle-internal");
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.CameraX cameraX = this.mCameraX;
        kotlin.jvm.internal.o.d(cameraX);
        androidx.camera.core.impl.CameraInternal select = primaryCameraSelector.select(cameraX.getCameraRepository().getCameras());
        kotlin.jvm.internal.o.f(select, "primaryCameraSelector.se…cameraRepository.cameras)");
        boolean z17 = true;
        select.setPrimary(true);
        androidx.camera.core.CameraInfo cameraInfo = getCameraInfo(primaryCameraSelector);
        kotlin.jvm.internal.o.e(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
        androidx.camera.core.impl.RestrictedCameraInfo restrictedCameraInfo2 = (androidx.camera.core.impl.RestrictedCameraInfo) cameraInfo;
        if (secondaryCameraSelector != null) {
            androidx.camera.core.CameraX cameraX2 = this.mCameraX;
            kotlin.jvm.internal.o.d(cameraX2);
            androidx.camera.core.impl.CameraInternal select2 = secondaryCameraSelector.select(cameraX2.getCameraRepository().getCameras());
            select2.setPrimary(false);
            androidx.camera.core.CameraInfo cameraInfo2 = getCameraInfo(secondaryCameraSelector);
            kotlin.jvm.internal.o.e(cameraInfo2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            restrictedCameraInfo = (androidx.camera.core.impl.RestrictedCameraInfo) cameraInfo2;
            cameraInternal = select2;
        } else {
            cameraInternal = null;
            restrictedCameraInfo = null;
        }
        androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, androidx.camera.core.internal.CameraUseCaseAdapter.generateCameraId(restrictedCameraInfo2, restrictedCameraInfo));
        java.util.Collection<androidx.camera.lifecycle.LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
        for (androidx.camera.core.UseCase useCase : kz5.z.I(useCases)) {
            for (androidx.camera.lifecycle.LifecycleCamera lifecycleCameras2 : lifecycleCameras) {
                kotlin.jvm.internal.o.f(lifecycleCameras2, "lifecycleCameras");
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera2 = lifecycleCameras2;
                if (lifecycleCamera2.isBound(useCase) && !kotlin.jvm.internal.o.b(lifecycleCamera2, lifecycleCamera)) {
                    java.lang.String format = java.lang.String.format("Use case %s already bound to a different lifecycle.", java.util.Arrays.copyOf(new java.lang.Object[]{useCase}, 1));
                    kotlin.jvm.internal.o.f(format, "format(format, *args)");
                    throw new java.lang.IllegalStateException(format);
                }
                z17 = true;
            }
        }
        if (lifecycleCamera == null) {
            androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository = this.mLifecycleCameraRepository;
            androidx.camera.core.CameraX cameraX3 = this.mCameraX;
            kotlin.jvm.internal.o.d(cameraX3);
            androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator = cameraX3.getCameraFactory().getCameraCoordinator();
            androidx.camera.core.CameraX cameraX4 = this.mCameraX;
            kotlin.jvm.internal.o.d(cameraX4);
            androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX4.getCameraDeviceSurfaceManager();
            androidx.camera.core.CameraX cameraX5 = this.mCameraX;
            kotlin.jvm.internal.o.d(cameraX5);
            lifecycleCamera = lifecycleCameraRepository.createLifecycleCamera(lifecycleOwner, new androidx.camera.core.internal.CameraUseCaseAdapter(select, cameraInternal, restrictedCameraInfo2, restrictedCameraInfo, primaryLayoutSettings, secondaryLayoutSettings, cameraCoordinator, cameraDeviceSurfaceManager, cameraX5.getDefaultConfigFactory()));
        }
        if (useCases.length != 0) {
            z17 = false;
        }
        if (z17) {
            kotlin.jvm.internal.o.d(lifecycleCamera);
        } else {
            androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository2 = this.mLifecycleCameraRepository;
            kotlin.jvm.internal.o.d(lifecycleCamera);
            java.util.List i17 = kz5.c0.i(java.util.Arrays.copyOf(useCases, useCases.length));
            androidx.camera.core.CameraX cameraX6 = this.mCameraX;
            kotlin.jvm.internal.o.d(cameraX6);
            lifecycleCameraRepository2.bindToLifecycleCamera(lifecycleCamera, viewPort, effects, i17, cameraX6.getCameraFactory().getCameraCoordinator());
        }
        return lifecycleCamera;
    }

    @Override // androidx.camera.core.CameraProvider
    public java.util.List<androidx.camera.core.CameraInfo> getAvailableCameraInfos() {
        t4.a.f("CX:getAvailableCameraInfos");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.core.CameraX cameraX = this.mCameraX;
        kotlin.jvm.internal.o.d(cameraX);
        java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
        kotlin.jvm.internal.o.f(cameras, "mCameraX!!.cameraRepository.cameras");
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it = cameras.iterator();
        while (it.hasNext()) {
            androidx.camera.core.CameraInfo cameraInfo = it.next().getCameraInfo();
            kotlin.jvm.internal.o.f(cameraInfo, "camera.cameraInfo");
            arrayList.add(cameraInfo);
        }
        return arrayList;
    }

    public final java.util.List<java.util.List<androidx.camera.core.CameraInfo>> getAvailableConcurrentCameraInfos() {
        t4.a.f("CX:getAvailableConcurrentCameraInfos");
        java.util.Objects.requireNonNull(this.mCameraX);
        androidx.camera.core.CameraX cameraX = this.mCameraX;
        kotlin.jvm.internal.o.d(cameraX);
        java.util.Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
        androidx.camera.core.CameraX cameraX2 = this.mCameraX;
        kotlin.jvm.internal.o.d(cameraX2);
        java.util.List<java.util.List<androidx.camera.core.CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
        kotlin.jvm.internal.o.f(concurrentCameraSelectors, "mCameraX!!.cameraFactory…concurrentCameraSelectors");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List<androidx.camera.core.CameraSelector> list : concurrentCameraSelectors) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (androidx.camera.core.CameraSelector cameraSelector : list) {
                try {
                    kotlin.jvm.internal.o.f(cameraSelector, "cameraSelector");
                    arrayList2.add(getCameraInfo(cameraSelector));
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.CameraProvider
    public androidx.camera.core.CameraInfo getCameraInfo(androidx.camera.core.CameraSelector cameraSelector) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(cameraSelector, "cameraSelector");
        t4.a.f("CX:getCameraInfo");
        androidx.camera.core.CameraX cameraX = this.mCameraX;
        kotlin.jvm.internal.o.d(cameraX);
        androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCameraInfoInternal();
        kotlin.jvm.internal.o.f(cameraInfoInternal, "cameraSelector.select(mC…meras).cameraInfoInternal");
        androidx.camera.core.impl.CameraConfig cameraConfig = getCameraConfig(cameraSelector, cameraInfoInternal);
        androidx.camera.core.internal.CameraUseCaseAdapter.CameraId create = androidx.camera.core.internal.CameraUseCaseAdapter.CameraId.create(cameraInfoInternal.getCameraId(), cameraConfig.getCompatibilityId());
        kotlin.jvm.internal.o.f(create, "create(\n                …ilityId\n                )");
        synchronized (this.mLock) {
            obj = this.mCameraInfoMap.get(create);
            if (obj == null) {
                obj = new androidx.camera.core.impl.RestrictedCameraInfo(cameraInfoInternal, cameraConfig);
                this.mCameraInfoMap.put(create, obj);
            }
        }
        return (androidx.camera.core.impl.RestrictedCameraInfo) obj;
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(androidx.camera.core.CameraSelector cameraSelector) {
        kotlin.jvm.internal.o.g(cameraSelector, "cameraSelector");
        t4.a.f("CX:hasCamera");
        try {
            androidx.camera.core.CameraX cameraX = this.mCameraX;
            kotlin.jvm.internal.o.d(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.o.g(useCase, "useCase");
        for (androidx.camera.lifecycle.LifecycleCamera lifecycleCamera : this.mLifecycleCameraRepository.getLifecycleCameras()) {
            kotlin.jvm.internal.o.f(lifecycleCamera, "mLifecycleCameraRepository.lifecycleCameras");
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isConcurrentCameraModeOn() {
        return getCameraOperatingMode() == 2;
    }

    public final wa.a shutdownAsync() {
        wa.a immediateFuture;
        androidx.camera.core.impl.utils.Threads.runOnMainSync(new java.lang.Runnable() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.lifecycle.ProcessCameraProvider.shutdownAsync$lambda$0(androidx.camera.lifecycle.ProcessCameraProvider.this);
            }
        });
        androidx.camera.core.CameraX cameraX = this.mCameraX;
        if (cameraX != null) {
            kotlin.jvm.internal.o.d(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().shutdown();
        }
        androidx.camera.core.CameraX cameraX2 = this.mCameraX;
        if (cameraX2 != null) {
            kotlin.jvm.internal.o.d(cameraX2);
            immediateFuture = cameraX2.shutdown();
        } else {
            immediateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }
        kotlin.jvm.internal.o.f(immediateFuture, "if (mCameraX != null) mC…mediateFuture<Void>(null)");
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = immediateFuture;
            this.mCameraInfoMap.clear();
        }
        this.mCameraX = null;
        this.mContext = null;
        return immediateFuture;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbind(androidx.camera.core.UseCase... useCases) {
        kotlin.jvm.internal.o.g(useCases, "useCases");
        t4.a.f("CX:unbind");
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (getCameraOperatingMode() == 2) {
            throw new java.lang.UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
        }
        this.mLifecycleCameraRepository.unbind(kz5.c0.i(java.util.Arrays.copyOf(useCases, useCases.length)));
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbindAll() {
        t4.a.f("CX:unbindAll");
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        setCameraOperatingMode(0);
        this.mLifecycleCameraRepository.unbindAll();
    }

    public final androidx.camera.core.Camera bindToLifecycle(androidx.lifecycle.y lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCase... useCases) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(cameraSelector, "cameraSelector");
        kotlin.jvm.internal.o.g(useCases, "useCases");
        t4.a.f("CX:bindToLifecycle");
        if (getCameraOperatingMode() != 2) {
            setCameraOperatingMode(1);
            androidx.camera.core.LayoutSettings DEFAULT = androidx.camera.core.LayoutSettings.DEFAULT;
            kotlin.jvm.internal.o.f(DEFAULT, "DEFAULT");
            kotlin.jvm.internal.o.f(DEFAULT, "DEFAULT");
            return bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, null, kz5.p0.f313996d, (androidx.camera.core.UseCase[]) java.util.Arrays.copyOf(useCases, useCases.length));
        }
        throw new java.lang.UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f3, code lost:
    
        if (isPreview(r5) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0202, code lost:
    
        if (isVideoCapture(r5) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.core.ConcurrentCamera bindToLifecycle(java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> r17) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.ProcessCameraProvider.bindToLifecycle(java.util.List):androidx.camera.core.ConcurrentCamera");
    }
}
