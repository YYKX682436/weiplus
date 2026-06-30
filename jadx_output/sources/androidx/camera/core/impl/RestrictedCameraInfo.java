package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class RestrictedCameraInfo extends androidx.camera.core.impl.ForwardingCameraInfo {
    public static final int CAMERA_OPERATION_AE_REGION = 3;
    public static final int CAMERA_OPERATION_AF_REGION = 2;
    public static final int CAMERA_OPERATION_AUTO_FOCUS = 1;
    public static final int CAMERA_OPERATION_AWB_REGION = 4;
    public static final int CAMERA_OPERATION_EXPOSURE_COMPENSATION = 7;
    public static final int CAMERA_OPERATION_EXTENSION_STRENGTH = 8;
    public static final int CAMERA_OPERATION_FLASH = 5;
    public static final int CAMERA_OPERATION_TORCH = 6;
    public static final int CAMERA_OPERATION_ZOOM = 0;
    private final androidx.camera.core.impl.CameraConfig mCameraConfig;
    private final androidx.camera.core.impl.CameraInfoInternal mCameraInfo;
    private boolean mIsCaptureProcessProgressSupported;
    private boolean mIsPostviewSupported;
    private final androidx.camera.core.impl.SessionProcessor mSessionProcessor;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface CameraOperation {
    }

    public RestrictedCameraInfo(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.CameraConfig cameraConfig) {
        super(cameraInfoInternal);
        this.mIsPostviewSupported = false;
        this.mIsCaptureProcessProgressSupported = false;
        this.mCameraInfo = cameraInfoInternal;
        this.mCameraConfig = cameraConfig;
        this.mSessionProcessor = cameraConfig.getSessionProcessor(null);
        setPostviewSupported(cameraConfig.isPostviewSupported());
        setCaptureProcessProgressSupported(cameraConfig.isCaptureProcessProgressSupported());
    }

    public androidx.camera.core.impl.CameraConfig getCameraConfig() {
        return this.mCameraConfig;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public androidx.camera.core.ExposureState getExposureState() {
        return !androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 7) ? new androidx.camera.core.ExposureState() { // from class: androidx.camera.core.impl.RestrictedCameraInfo.1
            @Override // androidx.camera.core.ExposureState
            public int getExposureCompensationIndex() {
                return 0;
            }

            @Override // androidx.camera.core.ExposureState
            public android.util.Range<java.lang.Integer> getExposureCompensationRange() {
                return new android.util.Range<>(0, 0);
            }

            @Override // androidx.camera.core.ExposureState
            public android.util.Rational getExposureCompensationStep() {
                return android.util.Rational.ZERO;
            }

            @Override // androidx.camera.core.ExposureState
            public boolean isExposureCompensationSupported() {
                return false;
            }
        } : this.mCameraInfo.getExposureState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public androidx.camera.core.impl.CameraInfoInternal getImplementation() {
        return this.mCameraInfo;
    }

    public androidx.camera.core.impl.SessionProcessor getSessionProcessor() {
        return this.mSessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public androidx.lifecycle.g0 getTorchState() {
        return !androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 6) ? new androidx.lifecycle.j0(0) : this.mCameraInfo.getTorchState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public androidx.lifecycle.g0 getZoomState() {
        return !androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0) ? new androidx.lifecycle.j0(androidx.camera.core.internal.ImmutableZoomState.create(1.0f, 1.0f, 1.0f, 0.0f)) : this.mCameraInfo.getZoomState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        if (androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 5)) {
            return this.mCameraInfo.hasFlashUnit();
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isCaptureProcessProgressSupported() {
        return this.mIsCaptureProcessProgressSupported;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        androidx.camera.core.FocusMeteringAction modifiedFocusMeteringAction = androidx.camera.core.impl.utils.SessionProcessorUtil.getModifiedFocusMeteringAction(this.mSessionProcessor, focusMeteringAction);
        if (modifiedFocusMeteringAction == null) {
            return false;
        }
        return this.mCameraInfo.isFocusMeteringSupported(modifiedFocusMeteringAction);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isPostviewSupported() {
        return this.mIsPostviewSupported;
    }

    public void setCaptureProcessProgressSupported(boolean z17) {
        this.mIsCaptureProcessProgressSupported = z17;
    }

    public void setPostviewSupported(boolean z17) {
        this.mIsPostviewSupported = z17;
    }
}
