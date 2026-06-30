package androidx.camera.core;

/* loaded from: classes14.dex */
public final class SurfaceRequest {
    public static final android.util.Range<java.lang.Integer> FRAME_RATE_RANGE_UNSPECIFIED = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    private final androidx.camera.core.impl.CameraInternal mCamera;
    private final androidx.camera.core.DynamicRange mDynamicRange;
    private final android.util.Range<java.lang.Integer> mExpectedFrameRate;
    private final androidx.camera.core.impl.DeferrableSurface mInternalDeferrableSurface;
    private final boolean mIsPrimary;
    private final java.lang.Object mLock;
    private final t2.k mRequestCancellationCompleter;
    private final android.util.Size mResolution;
    private final wa.a mSessionStatusFuture;
    private final t2.k mSurfaceCompleter;
    final wa.a mSurfaceFuture;
    private final t2.k mSurfaceRecreationCompleter;
    private androidx.camera.core.SurfaceRequest.TransformationInfo mTransformationInfo;
    private java.util.concurrent.Executor mTransformationInfoExecutor;
    private androidx.camera.core.SurfaceRequest.TransformationInfoListener mTransformationInfoListener;

    /* loaded from: classes14.dex */
    public static final class RequestCancelledException extends java.lang.RuntimeException {
        public RequestCancelledException(java.lang.String str, java.lang.Throwable th6) {
            super(str, th6);
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class Result {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes6.dex */
        public @interface ResultCode {
        }

        public static androidx.camera.core.SurfaceRequest.Result of(int i17, android.view.Surface surface) {
            return new androidx.camera.core.AutoValue_SurfaceRequest_Result(i17, surface);
        }

        public abstract int getResultCode();

        public abstract android.view.Surface getSurface();
    }

    /* loaded from: classes14.dex */
    public static abstract class TransformationInfo {
        public static androidx.camera.core.SurfaceRequest.TransformationInfo of(android.graphics.Rect rect, int i17, int i18, boolean z17, android.graphics.Matrix matrix, boolean z18) {
            return new androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo(rect, i17, i18, z17, matrix, z18);
        }

        public abstract android.graphics.Rect getCropRect();

        public abstract int getRotationDegrees();

        public abstract android.graphics.Matrix getSensorToBufferTransform();

        public abstract int getTargetRotation();

        public abstract boolean hasCameraTransform();

        public abstract boolean isMirroring();
    }

    /* loaded from: classes14.dex */
    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo);
    }

    public SurfaceRequest(android.util.Size size, androidx.camera.core.impl.CameraInternal cameraInternal, java.lang.Runnable runnable) {
        this(size, cameraInternal, androidx.camera.core.DynamicRange.SDR, FRAME_RATE_RANGE_UNSPECIFIED, runnable);
    }

    private t2.k initialSurfaceRecreationCompleter(java.util.concurrent.Executor executor, final java.lang.Runnable runnable) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
        androidx.camera.core.impl.utils.futures.Futures.addCallback(t2.p.a(new t2.m() { // from class: androidx.camera.core.SurfaceRequest$$a
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$initialSurfaceRecreationCompleter$6;
                lambda$initialSurfaceRecreationCompleter$6 = androidx.camera.core.SurfaceRequest.this.lambda$initialSurfaceRecreationCompleter$6(atomicReference, kVar);
                return lambda$initialSurfaceRecreationCompleter$6;
            }
        }), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.5
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.lang.Void r17) {
                runnable.run();
            }
        }, executor);
        t2.k kVar = (t2.k) atomicReference.get();
        kVar.getClass();
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$initialSurfaceRecreationCompleter$6(java.util.concurrent.atomic.AtomicReference atomicReference, t2.k kVar) {
        atomicReference.set(kVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$new$0(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, t2.k kVar) {
        atomicReference.set(kVar);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$new$1(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, t2.k kVar) {
        atomicReference.set(kVar);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$new$2(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, t2.k kVar) {
        atomicReference.set(kVar);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        this.mSurfaceFuture.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$4(m3.a aVar, android.view.Surface surface) {
        aVar.accept(androidx.camera.core.SurfaceRequest.Result.of(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$5(m3.a aVar, android.view.Surface surface) {
        aVar.accept(androidx.camera.core.SurfaceRequest.Result.of(4, surface));
    }

    public void addRequestCancellationListener(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        t2.t tVar = this.mRequestCancellationCompleter.f414654c;
        if (tVar != null) {
            tVar.addListener(runnable, executor);
        }
    }

    public void clearTransformationInfoListener() {
        synchronized (this.mLock) {
            this.mTransformationInfoListener = null;
            this.mTransformationInfoExecutor = null;
        }
    }

    public androidx.camera.core.impl.CameraInternal getCamera() {
        return this.mCamera;
    }

    public androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
        return this.mInternalDeferrableSurface;
    }

    public androidx.camera.core.DynamicRange getDynamicRange() {
        return this.mDynamicRange;
    }

    public android.util.Range<java.lang.Integer> getExpectedFrameRate() {
        return this.mExpectedFrameRate;
    }

    public android.util.Size getResolution() {
        return this.mResolution;
    }

    public boolean invalidate() {
        willNotProvideSurface();
        return this.mSurfaceRecreationCompleter.a(null);
    }

    public boolean isPrimary() {
        return this.mIsPrimary;
    }

    public boolean isServiced() {
        return this.mSurfaceFuture.isDone();
    }

    public void provideSurface(final android.view.Surface surface, java.util.concurrent.Executor executor, final m3.a aVar) {
        if (this.mSurfaceCompleter.a(surface) || this.mSurfaceFuture.isCancelled()) {
            androidx.camera.core.impl.utils.futures.Futures.addCallback(this.mSessionStatusFuture, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.4
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(java.lang.Throwable th6) {
                    m3.h.e(th6 instanceof androidx.camera.core.SurfaceRequest.RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th6);
                    aVar.accept(androidx.camera.core.SurfaceRequest.Result.of(1, surface));
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(java.lang.Void r37) {
                    aVar.accept(androidx.camera.core.SurfaceRequest.Result.of(0, surface));
                }
            }, executor);
            return;
        }
        m3.h.e(this.mSurfaceFuture.isDone(), null);
        try {
            this.mSurfaceFuture.get();
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.SurfaceRequest.lambda$provideSurface$4(m3.a.this, surface);
                }
            });
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.SurfaceRequest.lambda$provideSurface$5(m3.a.this, surface);
                }
            });
        }
    }

    public void setTransformationInfoListener(java.util.concurrent.Executor executor, final androidx.camera.core.SurfaceRequest.TransformationInfoListener transformationInfoListener) {
        final androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo;
        synchronized (this.mLock) {
            this.mTransformationInfoListener = transformationInfoListener;
            this.mTransformationInfoExecutor = executor;
            transformationInfo = this.mTransformationInfo;
        }
        if (transformationInfo != null) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$h
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.SurfaceRequest.TransformationInfoListener.this.onTransformationInfoUpdate(transformationInfo);
                }
            });
        }
    }

    public void updateTransformationInfo(final androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
        final androidx.camera.core.SurfaceRequest.TransformationInfoListener transformationInfoListener;
        java.util.concurrent.Executor executor;
        synchronized (this.mLock) {
            this.mTransformationInfo = transformationInfo;
            transformationInfoListener = this.mTransformationInfoListener;
            executor = this.mTransformationInfoExecutor;
        }
        if (transformationInfoListener == null || executor == null) {
            return;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$i
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.SurfaceRequest.TransformationInfoListener.this.onTransformationInfoUpdate(transformationInfo);
            }
        });
    }

    public boolean willNotProvideSurface() {
        return this.mSurfaceCompleter.b(new androidx.camera.core.impl.DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    public SurfaceRequest(android.util.Size size, androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.DynamicRange dynamicRange, android.util.Range<java.lang.Integer> range, java.lang.Runnable runnable) {
        this(size, cameraInternal, true, dynamicRange, range, runnable);
    }

    public SurfaceRequest(android.util.Size size, androidx.camera.core.impl.CameraInternal cameraInternal, boolean z17, androidx.camera.core.DynamicRange dynamicRange, android.util.Range<java.lang.Integer> range, java.lang.Runnable runnable) {
        this.mLock = new java.lang.Object();
        this.mResolution = size;
        this.mCamera = cameraInternal;
        this.mIsPrimary = z17;
        this.mDynamicRange = dynamicRange;
        this.mExpectedFrameRate = range;
        final java.lang.String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
        final wa.a a17 = t2.p.a(new t2.m() { // from class: androidx.camera.core.SurfaceRequest$$d
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$new$0;
                lambda$new$0 = androidx.camera.core.SurfaceRequest.lambda$new$0(atomicReference, str, kVar);
                return lambda$new$0;
            }
        });
        final t2.k kVar = (t2.k) atomicReference.get();
        kVar.getClass();
        this.mRequestCancellationCompleter = kVar;
        final java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference(null);
        wa.a a18 = t2.p.a(new t2.m() { // from class: androidx.camera.core.SurfaceRequest$$e
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar2) {
                java.lang.Object lambda$new$1;
                lambda$new$1 = androidx.camera.core.SurfaceRequest.lambda$new$1(atomicReference2, str, kVar2);
                return lambda$new$1;
            }
        });
        this.mSessionStatusFuture = a18;
        androidx.camera.core.impl.utils.futures.Futures.addCallback(a18, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                if (th6 instanceof androidx.camera.core.SurfaceRequest.RequestCancelledException) {
                    m3.h.e(a17.cancel(false), null);
                } else {
                    m3.h.e(kVar.a(null), null);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.lang.Void r27) {
                m3.h.e(kVar.a(null), null);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        final t2.k kVar2 = (t2.k) atomicReference2.get();
        kVar2.getClass();
        final java.util.concurrent.atomic.AtomicReference atomicReference3 = new java.util.concurrent.atomic.AtomicReference(null);
        wa.a a19 = t2.p.a(new t2.m() { // from class: androidx.camera.core.SurfaceRequest$$f
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar3) {
                java.lang.Object lambda$new$2;
                lambda$new$2 = androidx.camera.core.SurfaceRequest.lambda$new$2(atomicReference3, str, kVar3);
                return lambda$new$2;
            }
        });
        this.mSurfaceFuture = a19;
        t2.k kVar3 = (t2.k) atomicReference3.get();
        kVar3.getClass();
        this.mSurfaceCompleter = kVar3;
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = new androidx.camera.core.impl.DeferrableSurface(size, 34) { // from class: androidx.camera.core.SurfaceRequest.2
            @Override // androidx.camera.core.impl.DeferrableSurface
            public wa.a provideSurface() {
                return androidx.camera.core.SurfaceRequest.this.mSurfaceFuture;
            }
        };
        this.mInternalDeferrableSurface = deferrableSurface;
        final wa.a terminationFuture = deferrableSurface.getTerminationFuture();
        androidx.camera.core.impl.utils.futures.Futures.addCallback(a19, new androidx.camera.core.impl.utils.futures.FutureCallback<android.view.Surface>() { // from class: androidx.camera.core.SurfaceRequest.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                if (!(th6 instanceof java.util.concurrent.CancellationException)) {
                    kVar2.a(null);
                    return;
                }
                m3.h.e(kVar2.b(new androidx.camera.core.SurfaceRequest.RequestCancelledException(str + " cancelled.", th6)), null);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(android.view.Surface surface) {
                androidx.camera.core.impl.utils.futures.Futures.propagate(terminationFuture, kVar2);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        terminationFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$g
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.SurfaceRequest.this.lambda$new$3();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        this.mSurfaceRecreationCompleter = initialSurfaceRecreationCompleter(androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), runnable);
    }
}
