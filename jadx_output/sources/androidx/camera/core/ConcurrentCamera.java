package androidx.camera.core;

/* loaded from: classes14.dex */
public class ConcurrentCamera {
    private java.util.List<androidx.camera.core.Camera> mCameras;

    /* loaded from: classes14.dex */
    public static final class SingleCameraConfig {
        private androidx.camera.core.CameraSelector mCameraSelector;
        private androidx.camera.core.LayoutSettings mLayoutSettings;
        private androidx.lifecycle.y mLifecycleOwner;
        private androidx.camera.core.UseCaseGroup mUseCaseGroup;

        public SingleCameraConfig(androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup, androidx.lifecycle.y yVar) {
            this(cameraSelector, useCaseGroup, androidx.camera.core.LayoutSettings.DEFAULT, yVar);
        }

        public androidx.camera.core.CameraSelector getCameraSelector() {
            return this.mCameraSelector;
        }

        public androidx.camera.core.LayoutSettings getLayoutSettings() {
            return this.mLayoutSettings;
        }

        public androidx.lifecycle.y getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        public androidx.camera.core.UseCaseGroup getUseCaseGroup() {
            return this.mUseCaseGroup;
        }

        public SingleCameraConfig(androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup, androidx.camera.core.LayoutSettings layoutSettings, androidx.lifecycle.y yVar) {
            this.mCameraSelector = cameraSelector;
            this.mUseCaseGroup = useCaseGroup;
            this.mLayoutSettings = layoutSettings;
            this.mLifecycleOwner = yVar;
        }
    }

    public ConcurrentCamera(java.util.List<androidx.camera.core.Camera> list) {
        this.mCameras = list;
    }

    public java.util.List<androidx.camera.core.Camera> getCameras() {
        return this.mCameras;
    }
}
