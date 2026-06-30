package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface CameraInternal extends androidx.camera.core.Camera, androidx.camera.core.UseCase.StateChangeCallback {

    /* loaded from: classes14.dex */
    public enum State {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        State(boolean z17) {
            this.mHoldsCameraSlot = z17;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    void attachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection);

    void close();

    void detachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection);

    @Override // androidx.camera.core.Camera
    default androidx.camera.core.CameraControl getCameraControl() {
        return getCameraControlInternal();
    }

    androidx.camera.core.impl.CameraControlInternal getCameraControlInternal();

    @Override // androidx.camera.core.Camera
    default androidx.camera.core.CameraInfo getCameraInfo() {
        return getCameraInfoInternal();
    }

    androidx.camera.core.impl.CameraInfoInternal getCameraInfoInternal();

    androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState();

    @Override // androidx.camera.core.Camera
    default androidx.camera.core.impl.CameraConfig getExtendedConfig() {
        return androidx.camera.core.impl.CameraConfigs.defaultConfig();
    }

    default boolean getHasTransform() {
        return true;
    }

    default boolean isFrontFacing() {
        return getCameraInfo().getLensFacing() == 0;
    }

    void open();

    wa.a release();

    default void setActiveResumingMode(boolean z17) {
    }

    default void setExtendedConfig(androidx.camera.core.impl.CameraConfig cameraConfig) {
    }

    default void setPrimary(boolean z17) {
    }
}
