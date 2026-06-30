package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class RestrictedCameraControl extends androidx.camera.core.impl.ForwardingCameraControl {
    private final androidx.camera.core.impl.CameraControlInternal mCameraControl;
    private final androidx.camera.core.impl.SessionProcessor mSessionProcessor;

    public RestrictedCameraControl(androidx.camera.core.impl.CameraControlInternal cameraControlInternal, androidx.camera.core.impl.SessionProcessor sessionProcessor) {
        super(cameraControlInternal);
        this.mCameraControl = cameraControlInternal;
        this.mSessionProcessor = sessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public wa.a cancelFocusAndMetering() {
        return this.mCameraControl.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public wa.a enableTorch(boolean z17) {
        return !androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 6) ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Torch is not supported")) : this.mCameraControl.enableTorch(z17);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.CameraControlInternal getImplementation() {
        return this.mCameraControl;
    }

    public androidx.camera.core.impl.SessionProcessor getSessionProcessor() {
        return this.mSessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public wa.a setExposureCompensationIndex(int i17) {
        return !androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 7) ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("ExposureCompensation is not supported")) : this.mCameraControl.setExposureCompensationIndex(i17);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public wa.a setLinearZoom(float f17) {
        return !androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0) ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Zoom is not supported")) : this.mCameraControl.setLinearZoom(f17);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public wa.a setZoomRatio(float f17) {
        return !androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0) ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Zoom is not supported")) : this.mCameraControl.setZoomRatio(f17);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public wa.a startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        androidx.camera.core.FocusMeteringAction modifiedFocusMeteringAction = androidx.camera.core.impl.utils.SessionProcessorUtil.getModifiedFocusMeteringAction(this.mSessionProcessor, focusMeteringAction);
        return modifiedFocusMeteringAction == null ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("FocusMetering is not supported")) : this.mCameraControl.startFocusAndMetering(modifiedFocusMeteringAction);
    }
}
