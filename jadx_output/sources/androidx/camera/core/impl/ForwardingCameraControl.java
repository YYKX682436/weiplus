package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class ForwardingCameraControl implements androidx.camera.core.impl.CameraControlInternal {
    private final androidx.camera.core.impl.CameraControlInternal mCameraControlInternal;

    public ForwardingCameraControl(androidx.camera.core.impl.CameraControlInternal cameraControlInternal) {
        this.mCameraControlInternal = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(androidx.camera.core.impl.Config config) {
        this.mCameraControlInternal.addInteropConfig(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder builder) {
        this.mCameraControlInternal.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a cancelFocusAndMetering() {
        return this.mCameraControlInternal.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCameraControlInternal.clearInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.mCameraControlInternal.decrementVideoUsage();
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a enableTorch(boolean z17) {
        return this.mCameraControlInternal.enableTorch(z17);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public wa.a getCameraCapturePipelineAsync(int i17, int i18) {
        return this.mCameraControlInternal.getCameraCapturePipelineAsync(i17, i18);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mCameraControlInternal.getFlashMode();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.CameraControlInternal getImplementation() {
        return this.mCameraControlInternal.getImplementation();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.Config getInteropConfig() {
        return this.mCameraControlInternal.getInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public android.graphics.Rect getSensorRect() {
        return this.mCameraControlInternal.getSensorRect();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        return this.mCameraControlInternal.getSessionConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.mCameraControlInternal.incrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isInVideoUsage() {
        return this.mCameraControlInternal.isInVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mCameraControlInternal.isZslDisabledByByUserCaseConfig();
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a setExposureCompensationIndex(int i17) {
        return this.mCameraControlInternal.setExposureCompensationIndex(i17);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i17) {
        this.mCameraControlInternal.setFlashMode(i17);
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a setLinearZoom(float f17) {
        return this.mCameraControlInternal.setLinearZoom(f17);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        this.mCameraControlInternal.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a setZoomRatio(float f17) {
        return this.mCameraControlInternal.setZoomRatio(f17);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z17) {
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(z17);
    }

    @Override // androidx.camera.core.CameraControl
    public wa.a startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        return this.mCameraControlInternal.startFocusAndMetering(focusMeteringAction);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public wa.a submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i17, int i18) {
        return this.mCameraControlInternal.submitStillCaptureRequests(list, i17, i18);
    }
}
