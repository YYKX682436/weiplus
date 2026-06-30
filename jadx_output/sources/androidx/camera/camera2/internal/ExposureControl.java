package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public class ExposureControl {
    private static final int DEFAULT_EXPOSURE_COMPENSATION = 0;
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCameraControl;
    private final java.util.concurrent.Executor mExecutor;
    private final androidx.camera.camera2.internal.ExposureStateImpl mExposureStateImpl;
    private boolean mIsActive = false;
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mRunningCaptureResultListener;
    private t2.k mRunningCompleter;

    public ExposureControl(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, java.util.concurrent.Executor executor) {
        this.mCameraControl = camera2CameraControlImpl;
        this.mExposureStateImpl = new androidx.camera.camera2.internal.ExposureStateImpl(cameraCharacteristicsCompat, 0);
        this.mExecutor = executor;
    }

    private void clearRunningTask() {
        t2.k kVar = this.mRunningCompleter;
        if (kVar != null) {
            kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.mRunningCompleter = null;
        }
        androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener = this.mRunningCaptureResultListener;
        if (captureResultListener != null) {
            this.mCameraControl.removeCaptureResultListener(captureResultListener);
            this.mRunningCaptureResultListener = null;
        }
    }

    public static androidx.camera.core.ExposureState getDefaultExposureState(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return new androidx.camera.camera2.internal.ExposureStateImpl(cameraCharacteristicsCompat, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setExposureCompensationIndex$0(int i17, t2.k kVar, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        java.lang.Integer num = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE);
        java.lang.Integer num2 = (java.lang.Integer) totalCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != i17) {
                return false;
            }
            kVar.a(java.lang.Integer.valueOf(i17));
            return true;
        }
        int intValue = num.intValue();
        if ((intValue != 2 && intValue != 3 && intValue != 4) || num2.intValue() != i17) {
            return false;
        }
        kVar.a(java.lang.Integer.valueOf(i17));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setExposureCompensationIndex$1(final t2.k kVar, final int i17) {
        if (!this.mIsActive) {
            this.mExposureStateImpl.setExposureCompensationIndex(0);
            kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        clearRunningTask();
        m3.h.e(this.mRunningCompleter == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
        m3.h.e(this.mRunningCaptureResultListener == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener captureResultListener = new androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ExposureControl$$c
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                boolean lambda$setExposureCompensationIndex$0;
                lambda$setExposureCompensationIndex$0 = androidx.camera.camera2.internal.ExposureControl.lambda$setExposureCompensationIndex$0(i17, kVar, totalCaptureResult);
                return lambda$setExposureCompensationIndex$0;
            }
        };
        this.mRunningCaptureResultListener = captureResultListener;
        this.mRunningCompleter = kVar;
        this.mCameraControl.addCaptureResultListener(captureResultListener);
        this.mCameraControl.updateSessionConfigSynchronous();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$setExposureCompensationIndex$2(final int i17, final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ExposureControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.ExposureControl.this.lambda$setExposureCompensationIndex$1(kVar, i17);
            }
        });
        return "setExposureCompensationIndex[" + i17 + "]";
    }

    public androidx.camera.core.ExposureState getExposureState() {
        return this.mExposureStateImpl;
    }

    public void setActive(boolean z17) {
        if (z17 == this.mIsActive) {
            return;
        }
        this.mIsActive = z17;
        if (z17) {
            return;
        }
        this.mExposureStateImpl.setExposureCompensationIndex(0);
        clearRunningTask();
    }

    public void setCaptureRequestOption(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        builder.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, java.lang.Integer.valueOf(this.mExposureStateImpl.getExposureCompensationIndex()), androidx.camera.core.impl.Config.OptionPriority.REQUIRED);
    }

    public wa.a setExposureCompensationIndex(final int i17) {
        if (!this.mExposureStateImpl.isExposureCompensationSupported()) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalArgumentException("ExposureCompensation is not supported"));
        }
        android.util.Range<java.lang.Integer> exposureCompensationRange = this.mExposureStateImpl.getExposureCompensationRange();
        if (exposureCompensationRange.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i17))) {
            this.mExposureStateImpl.setExposureCompensationIndex(i17);
            return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.ExposureControl$$b
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$setExposureCompensationIndex$2;
                    lambda$setExposureCompensationIndex$2 = androidx.camera.camera2.internal.ExposureControl.this.lambda$setExposureCompensationIndex$2(i17, kVar);
                    return lambda$setExposureCompensationIndex$2;
                }
            }));
        }
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalArgumentException("Requested ExposureCompensation " + i17 + " is not within valid range [" + exposureCompensationRange.getUpper() + ".." + exposureCompensationRange.getLower() + "]"));
    }
}
