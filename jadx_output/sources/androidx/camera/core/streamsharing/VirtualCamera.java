package androidx.camera.core.streamsharing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class VirtualCamera implements androidx.camera.core.impl.CameraInternal {
    private static final java.lang.String UNSUPPORTED_MESSAGE = "Operation not supported by VirtualCamera.";
    private final androidx.camera.core.impl.CameraInternal mParentCamera;
    private final androidx.camera.core.UseCase.StateChangeCallback mStateChangeCallback;
    private final androidx.camera.core.streamsharing.VirtualCameraControl mVirtualCameraControl;
    private final androidx.camera.core.streamsharing.VirtualCameraInfo mVirtualCameraInfo;

    public VirtualCamera(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.UseCase.StateChangeCallback stateChangeCallback, androidx.camera.core.streamsharing.StreamSharing.Control control) {
        this.mParentCamera = cameraInternal;
        this.mStateChangeCallback = stateChangeCallback;
        this.mVirtualCameraControl = new androidx.camera.core.streamsharing.VirtualCameraControl(cameraInternal.getCameraControlInternal(), control);
        this.mVirtualCameraInfo = new androidx.camera.core.streamsharing.VirtualCameraInfo(cameraInternal.getCameraInfoInternal());
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public androidx.camera.core.impl.CameraControlInternal getCameraControlInternal() {
        return this.mVirtualCameraControl;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public androidx.camera.core.impl.CameraInfoInternal getCameraInfoInternal() {
        return this.mVirtualCameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState() {
        return this.mParentCamera.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean getHasTransform() {
        return false;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseActive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseInactive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseReset(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseUpdated(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public wa.a release() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    public void setRotationDegrees(int i17) {
        this.mVirtualCameraInfo.setVirtualCameraRotationDegrees(i17);
    }
}
