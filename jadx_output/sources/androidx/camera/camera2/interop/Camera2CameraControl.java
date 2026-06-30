package androidx.camera.camera2.interop;

/* loaded from: classes14.dex */
public final class Camera2CameraControl {
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCamera2CameraControlImpl;
    t2.k mCompleter;
    final java.util.concurrent.Executor mExecutor;
    private boolean mIsActive = false;
    private boolean mPendingUpdate = false;
    final java.lang.Object mLock = new java.lang.Object();
    private androidx.camera.camera2.impl.Camera2ImplConfig.Builder mBuilder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();

    public Camera2CameraControl(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, java.util.concurrent.Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
    }

    private void addCaptureRequestOptionsInternal(androidx.camera.camera2.interop.CaptureRequestOptions captureRequestOptions) {
        synchronized (this.mLock) {
            this.mBuilder.insertAllOptions(captureRequestOptions);
        }
    }

    private void clearCaptureRequestOptionsInternal() {
        synchronized (this.mLock) {
            this.mBuilder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeInFlightUpdate() {
        t2.k kVar = this.mCompleter;
        if (kVar != null) {
            kVar.a(null);
            this.mCompleter = null;
        }
    }

    private void failInFlightUpdate(java.lang.Exception exc) {
        t2.k kVar = this.mCompleter;
        if (kVar != null) {
            if (exc == null) {
                exc = new java.lang.Exception("Camera2CameraControl failed with unknown error.");
            }
            kVar.b(exc);
            this.mCompleter = null;
        }
    }

    public static androidx.camera.camera2.interop.Camera2CameraControl from(androidx.camera.core.CameraControl cameraControl) {
        androidx.camera.core.impl.CameraControlInternal implementation = ((androidx.camera.core.impl.CameraControlInternal) cameraControl).getImplementation();
        m3.h.b(implementation instanceof androidx.camera.camera2.internal.Camera2CameraControlImpl, "CameraControl doesn't contain Camera2 implementation.");
        return ((androidx.camera.camera2.internal.Camera2CameraControlImpl) implementation).getCamera2CameraControl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$addCaptureRequestOptions$3(final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.interop.Camera2CameraControl.this.lambda$addCaptureRequestOptions$2(kVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$clearCaptureRequestOptions$5(final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.interop.Camera2CameraControl.this.lambda$clearCaptureRequestOptions$4(kVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$setCaptureRequestOptions$1(final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$f
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.interop.Camera2CameraControl.this.lambda$setCaptureRequestOptions$0(kVar);
            }
        });
        return "setCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setActiveInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$setActive$6(boolean z17) {
        if (this.mIsActive == z17) {
            return;
        }
        this.mIsActive = z17;
        if (!z17) {
            failInFlightUpdate(new androidx.camera.core.CameraControl.OperationCanceledException("The camera control has became inactive."));
        } else if (this.mPendingUpdate) {
            updateSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateConfig, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$setCaptureRequestOptions$0(t2.k kVar) {
        this.mPendingUpdate = true;
        failInFlightUpdate(new androidx.camera.core.CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        this.mCompleter = kVar;
        if (this.mIsActive) {
            updateSession();
        }
    }

    private void updateSession() {
        this.mCamera2CameraControlImpl.updateSessionConfigAsync().addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$h
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.interop.Camera2CameraControl.this.completeInFlightUpdate();
            }
        }, this.mExecutor);
        this.mPendingUpdate = false;
    }

    public wa.a addCaptureRequestOptions(androidx.camera.camera2.interop.CaptureRequestOptions captureRequestOptions) {
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$e
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$addCaptureRequestOptions$3;
                lambda$addCaptureRequestOptions$3 = androidx.camera.camera2.interop.Camera2CameraControl.this.lambda$addCaptureRequestOptions$3(kVar);
                return lambda$addCaptureRequestOptions$3;
            }
        }));
    }

    public void applyOptionsToBuilder(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        synchronized (this.mLock) {
            builder.insertAllOptions(this.mBuilder.getMutableConfig(), androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE);
        }
    }

    public wa.a clearCaptureRequestOptions() {
        clearCaptureRequestOptionsInternal();
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$d
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$clearCaptureRequestOptions$5;
                lambda$clearCaptureRequestOptions$5 = androidx.camera.camera2.interop.Camera2CameraControl.this.lambda$clearCaptureRequestOptions$5(kVar);
                return lambda$clearCaptureRequestOptions$5;
            }
        }));
    }

    public androidx.camera.camera2.impl.Camera2ImplConfig getCamera2ImplConfig() {
        androidx.camera.camera2.impl.Camera2ImplConfig build;
        synchronized (this.mLock) {
            build = this.mBuilder.build();
        }
        return build;
    }

    public androidx.camera.camera2.interop.CaptureRequestOptions getCaptureRequestOptions() {
        androidx.camera.camera2.interop.CaptureRequestOptions build;
        synchronized (this.mLock) {
            build = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(this.mBuilder.build()).build();
        }
        return build;
    }

    public void setActive(final boolean z17) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.interop.Camera2CameraControl.this.lambda$setActive$6(z17);
            }
        });
    }

    public wa.a setCaptureRequestOptions(androidx.camera.camera2.interop.CaptureRequestOptions captureRequestOptions) {
        clearCaptureRequestOptionsInternal();
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.interop.Camera2CameraControl$$g
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$setCaptureRequestOptions$1;
                lambda$setCaptureRequestOptions$1 = androidx.camera.camera2.interop.Camera2CameraControl.this.lambda$setCaptureRequestOptions$1(kVar);
                return lambda$setCaptureRequestOptions$1;
            }
        }));
    }
}
