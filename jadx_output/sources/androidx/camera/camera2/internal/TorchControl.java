package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class TorchControl {
    static final int DEFAULT_TORCH_STATE = 0;
    private static final java.lang.String TAG = "TorchControl";
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCamera2CameraControlImpl;
    t2.k mEnableTorchCompleter;
    private final java.util.concurrent.Executor mExecutor;
    private final boolean mHasFlashUnit;
    private boolean mIsActive;
    boolean mTargetTorchEnabled;
    private final androidx.lifecycle.j0 mTorchState;

    public TorchControl(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, java.util.concurrent.Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        java.util.Objects.requireNonNull(cameraCharacteristicsCompat);
        this.mHasFlashUnit = androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker.isFlashAvailable(new androidx.camera.camera2.internal.Camera2CameraInfoImpl$$a(cameraCharacteristicsCompat));
        this.mTorchState = new androidx.lifecycle.j0(0);
        camera2CameraControlImpl.addCaptureResultListener(new androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.TorchControl$$c
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                boolean lambda$new$0;
                lambda$new$0 = androidx.camera.camera2.internal.TorchControl.this.lambda$new$0(totalCaptureResult);
                return lambda$new$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$enableTorch$2(final boolean z17, final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.TorchControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.TorchControl.this.lambda$enableTorch$1(kVar, z17);
            }
        });
        return "enableTorch: " + z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (this.mEnableTorchCompleter != null) {
            java.lang.Integer num = (java.lang.Integer) totalCaptureResult.getRequest().get(android.hardware.camera2.CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.mTargetTorchEnabled) {
                this.mEnableTorchCompleter.a(null);
                this.mEnableTorchCompleter = null;
            }
        }
        return false;
    }

    private <T> void setLiveDataValue(androidx.lifecycle.j0 j0Var, T t17) {
        if (androidx.camera.core.impl.utils.Threads.isMainThread()) {
            j0Var.setValue(t17);
        } else {
            j0Var.postValue(t17);
        }
    }

    public wa.a enableTorch(final boolean z17) {
        if (this.mHasFlashUnit) {
            setLiveDataValue(this.mTorchState, java.lang.Integer.valueOf(z17 ? 1 : 0));
            return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.TorchControl$$b
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$enableTorch$2;
                    lambda$enableTorch$2 = androidx.camera.camera2.internal.TorchControl.this.lambda$enableTorch$2(z17, kVar);
                    return lambda$enableTorch$2;
                }
            });
        }
        androidx.camera.core.Logger.d(TAG, "Unable to enableTorch due to there is no flash unit.");
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("No flash unit"));
    }

    /* renamed from: enableTorchInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$enableTorch$1(t2.k kVar, boolean z17) {
        if (!this.mHasFlashUnit) {
            if (kVar != null) {
                kVar.b(new java.lang.IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.mIsActive) {
                setLiveDataValue(this.mTorchState, 0);
                if (kVar != null) {
                    kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
                    return;
                }
                return;
            }
            this.mTargetTorchEnabled = z17;
            this.mCamera2CameraControlImpl.enableTorchInternal(z17);
            setLiveDataValue(this.mTorchState, java.lang.Integer.valueOf(z17 ? 1 : 0));
            t2.k kVar2 = this.mEnableTorchCompleter;
            if (kVar2 != null) {
                kVar2.b(new androidx.camera.core.CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.mEnableTorchCompleter = kVar;
        }
    }

    public androidx.lifecycle.g0 getTorchState() {
        return this.mTorchState;
    }

    public void setActive(boolean z17) {
        if (this.mIsActive == z17) {
            return;
        }
        this.mIsActive = z17;
        if (z17) {
            return;
        }
        if (this.mTargetTorchEnabled) {
            this.mTargetTorchEnabled = false;
            this.mCamera2CameraControlImpl.enableTorchInternal(false);
            setLiveDataValue(this.mTorchState, 0);
        }
        t2.k kVar = this.mEnableTorchCompleter;
        if (kVar != null) {
            kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            this.mEnableTorchCompleter = null;
        }
    }
}
