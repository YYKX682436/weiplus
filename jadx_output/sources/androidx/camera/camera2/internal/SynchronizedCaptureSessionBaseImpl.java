package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class SynchronizedCaptureSessionBaseImpl extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback implements androidx.camera.camera2.internal.SynchronizedCaptureSession, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener {
    private static final java.lang.String TAG = "SyncCaptureSessionBase";
    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat mCameraCaptureSessionCompat;
    final androidx.camera.camera2.internal.CaptureSessionRepository mCaptureSessionRepository;
    androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback mCaptureSessionStateCallback;
    final android.os.Handler mCompatHandler;
    final java.util.concurrent.Executor mExecutor;
    t2.k mOpenCaptureSessionCompleter;
    wa.a mOpenCaptureSessionFuture;
    private final java.util.concurrent.ScheduledExecutorService mScheduledExecutorService;
    private wa.a mStartingSurface;
    final java.lang.Object mLock = new java.lang.Object();
    private java.util.List<androidx.camera.core.impl.DeferrableSurface> mHeldDeferrableSurfaces = null;
    private boolean mClosed = false;
    private boolean mOpenerDisabled = false;
    private boolean mSessionFinished = false;

    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static android.view.Surface getInputSurface(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            return cameraCaptureSession.getInputSurface();
        }
    }

    public SynchronizedCaptureSessionBaseImpl(androidx.camera.camera2.internal.CaptureSessionRepository captureSessionRepository, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.os.Handler handler) {
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mCompatHandler = handler;
        this.mExecutor = executor;
        this.mScheduledExecutorService = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        onSessionFinished(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClosed$3(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionRepository.onCaptureSessionClosed(this);
        onSessionFinished(synchronizedCaptureSession);
        if (this.mCameraCaptureSessionCompat != null) {
            java.util.Objects.requireNonNull(this.mCaptureSessionStateCallback);
            this.mCaptureSessionStateCallback.onClosed(synchronizedCaptureSession);
        } else {
            androidx.camera.core.Logger.w(TAG, "[" + this + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSessionFinished$4(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onSessionFinished(synchronizedCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$openCaptureSession$0(java.util.List list, androidx.camera.camera2.internal.compat.CameraDeviceCompat cameraDeviceCompat, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat, t2.k kVar) {
        java.lang.String str;
        synchronized (this.mLock) {
            holdDeferrableSurfaces(list);
            m3.h.e(this.mOpenCaptureSessionCompleter == null, "The openCaptureSessionCompleter can only set once!");
            this.mOpenCaptureSessionCompleter = kVar;
            cameraDeviceCompat.createCaptureSession(sessionConfigurationCompat);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wa.a lambda$startWithDeferrableSurface$1(java.util.List list, java.util.List list2) {
        androidx.camera.core.Logger.d(TAG, "[" + this + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException("Surface closed", (androidx.camera.core.impl.DeferrableSurface) list.get(list2.indexOf(null)))) : androidx.camera.core.impl.utils.futures.Futures.immediateFuture(list2);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void abortCaptures() {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureSingleRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCaptureSessionRepository.onCaptureSessionClosing(this);
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().close();
        getExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$e
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.lambda$close$2();
            }
        });
    }

    public void createCaptureSessionCompat(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        if (this.mCameraCaptureSessionCompat == null) {
            this.mCameraCaptureSessionCompat = androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.toCameraCaptureSessionCompat(cameraCaptureSession, this.mCompatHandler);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat createSessionConfigurationCompat(int i17, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> list, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback stateCallback) {
        this.mCaptureSessionStateCallback = stateCallback;
        return new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat(i17, list, getExecutor(), new android.hardware.camera2.CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.2
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onActive(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onActive(synchronizedCaptureSessionBaseImpl);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onCaptureQueueEmpty(synchronizedCaptureSessionBaseImpl);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onClosed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onClosed(synchronizedCaptureSessionBaseImpl);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                t2.k kVar;
                try {
                    androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigureFailed(synchronizedCaptureSessionBaseImpl);
                    synchronized (androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        m3.h.d(androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                        kVar = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                    kVar.b(new java.lang.IllegalStateException("onConfigureFailed"));
                } catch (java.lang.Throwable th6) {
                    synchronized (androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        m3.h.d(androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                        t2.k kVar2 = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        kVar2.b(new java.lang.IllegalStateException("onConfigureFailed"));
                        throw th6;
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                t2.k kVar;
                try {
                    androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigured(synchronizedCaptureSessionBaseImpl);
                    synchronized (androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        m3.h.d(androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                        kVar = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                    kVar.a(null);
                } catch (java.lang.Throwable th6) {
                    synchronized (androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        m3.h.d(androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                        t2.k kVar2 = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        kVar2.a(null);
                        throw th6;
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onReady(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onReady(synchronizedCaptureSessionBaseImpl);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onSurfacePrepared(synchronizedCaptureSessionBaseImpl, surface);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void finishClose() {
        releaseDeferrableSurfaces();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public android.hardware.camera2.CameraDevice getDevice() {
        this.mCameraCaptureSessionCompat.getClass();
        return this.mCameraCaptureSessionCompat.toCameraCaptureSession().getDevice();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public java.util.concurrent.Executor getExecutor() {
        return this.mExecutor;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public android.view.Surface getInputSurface() {
        this.mCameraCaptureSessionCompat.getClass();
        return androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.Api23Impl.getInputSurface(this.mCameraCaptureSessionCompat.toCameraCaptureSession());
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public wa.a getOpeningBlocker() {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback getStateCallback() {
        return this;
    }

    public void holdDeferrableSurfaces(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        synchronized (this.mLock) {
            releaseDeferrableSurfaces();
            androidx.camera.core.impl.DeferrableSurfaces.incrementAll(list);
            this.mHeldDeferrableSurfaces = list;
        }
    }

    public boolean isCameraCaptureSessionOpen() {
        boolean z17;
        synchronized (this.mLock) {
            z17 = this.mOpenCaptureSessionFuture != null;
        }
        return z17;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onActive(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onActive(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void onCameraDeviceError(int i17) {
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onCaptureQueueEmpty(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onCaptureQueueEmpty(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(final androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        wa.a aVar;
        synchronized (this.mLock) {
            if (this.mClosed) {
                aVar = null;
            } else {
                this.mClosed = true;
                m3.h.d(this.mOpenCaptureSessionFuture, "Need to call openCaptureSession before using this API.");
                aVar = this.mOpenCaptureSessionFuture;
            }
        }
        finishClose();
        if (aVar != null) {
            aVar.addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$d
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.lambda$onClosed$3(synchronizedCaptureSession);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Objects.requireNonNull(this.mCaptureSessionStateCallback);
        finishClose();
        this.mCaptureSessionRepository.onCaptureSessionConfigureFail(this);
        this.mCaptureSessionStateCallback.onConfigureFailed(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionRepository.onCaptureSessionCreated(this);
        this.mCaptureSessionStateCallback.onConfigured(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onReady(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onReady(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onSessionFinished(final androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        wa.a aVar;
        synchronized (this.mLock) {
            if (this.mSessionFinished) {
                aVar = null;
            } else {
                this.mSessionFinished = true;
                m3.h.d(this.mOpenCaptureSessionFuture, "Need to call openCaptureSession before using this API.");
                aVar = this.mOpenCaptureSessionFuture;
            }
        }
        if (aVar != null) {
            aVar.addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.lambda$onSessionFinished$4(synchronizedCaptureSession);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onSurfacePrepared(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession, android.view.Surface surface) {
        java.util.Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onSurfacePrepared(synchronizedCaptureSession, surface);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public wa.a openCaptureSession(android.hardware.camera2.CameraDevice cameraDevice, final androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat, final java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        synchronized (this.mLock) {
            if (this.mOpenerDisabled) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.util.concurrent.CancellationException("Opener is disabled"));
            }
            this.mCaptureSessionRepository.onCreateCaptureSession(this);
            final androidx.camera.camera2.internal.compat.CameraDeviceCompat cameraDeviceCompat = androidx.camera.camera2.internal.compat.CameraDeviceCompat.toCameraDeviceCompat(cameraDevice, this.mCompatHandler);
            wa.a a17 = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$c
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$openCaptureSession$0;
                    lambda$openCaptureSession$0 = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.lambda$openCaptureSession$0(list, cameraDeviceCompat, sessionConfigurationCompat, kVar);
                    return lambda$openCaptureSession$0;
                }
            });
            this.mOpenCaptureSessionFuture = a17;
            androidx.camera.core.impl.utils.futures.Futures.addCallback(a17, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(java.lang.Throwable th6) {
                    androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.finishClose();
                    androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.mCaptureSessionRepository.onCaptureSessionConfigureFail(synchronizedCaptureSessionBaseImpl);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(java.lang.Void r17) {
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mOpenCaptureSessionFuture);
        }
    }

    public void releaseDeferrableSurfaces() {
        synchronized (this.mLock) {
            java.util.List<androidx.camera.core.impl.DeferrableSurface> list = this.mHeldDeferrableSurfaces;
            if (list != null) {
                androidx.camera.core.impl.DeferrableSurfaces.decrementAll(list);
                this.mHeldDeferrableSurfaces = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setRepeatingBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setSingleRepeatingRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public wa.a startWithDeferrableSurface(final java.util.List<androidx.camera.core.impl.DeferrableSurface> list, long j17) {
        synchronized (this.mLock) {
            if (this.mOpenerDisabled) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.util.concurrent.CancellationException("Opener is disabled"));
            }
            androidx.camera.core.impl.utils.futures.FutureChain transformAsync = androidx.camera.core.impl.utils.futures.FutureChain.from(androidx.camera.core.impl.DeferrableSurfaces.surfaceListWithTimeout(list, false, j17, getExecutor(), this.mScheduledExecutorService)).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl$$b
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$startWithDeferrableSurface$1;
                    lambda$startWithDeferrableSurface$1 = androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.this.lambda$startWithDeferrableSurface$1(list, (java.util.List) obj);
                    return lambda$startWithDeferrableSurface$1;
                }
            }, getExecutor());
            this.mStartingSurface = transformAsync;
            return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(transformAsync);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public boolean stop() {
        boolean z17;
        try {
            synchronized (this.mLock) {
                if (!this.mOpenerDisabled) {
                    wa.a aVar = this.mStartingSurface;
                    r1 = aVar != null ? aVar : null;
                    this.mOpenerDisabled = true;
                }
                z17 = !isCameraCaptureSessionOpen();
            }
            return z17;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void stopRepeating() {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat() {
        this.mCameraCaptureSessionCompat.getClass();
        return this.mCameraCaptureSessionCompat;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        m3.h.d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
