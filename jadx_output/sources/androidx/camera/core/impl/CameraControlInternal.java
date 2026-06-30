package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface CameraControlInternal extends androidx.camera.core.CameraControl {
    public static final androidx.camera.core.impl.CameraControlInternal DEFAULT_EMPTY_INSTANCE = new androidx.camera.core.impl.CameraControlInternal() { // from class: androidx.camera.core.impl.CameraControlInternal.2
        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addInteropConfig(androidx.camera.core.impl.Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder builder) {
        }

        @Override // androidx.camera.core.CameraControl
        public wa.a cancelFocusAndMetering() {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearInteropConfig() {
        }

        @Override // androidx.camera.core.CameraControl
        public wa.a enableTorch(boolean z17) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public int getFlashMode() {
            return 2;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public androidx.camera.core.impl.Config getInteropConfig() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public android.graphics.Rect getSensorRect() {
            return new android.graphics.Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public androidx.camera.core.impl.SessionConfig getSessionConfig() {
            return androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public boolean isZslDisabledByByUserCaseConfig() {
            return false;
        }

        @Override // androidx.camera.core.CameraControl
        public wa.a setExposureCompensationIndex(int i17) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(0);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setFlashMode(int i17) {
        }

        @Override // androidx.camera.core.CameraControl
        public wa.a setLinearZoom(float f17) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public wa.a setZoomRatio(float f17) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setZslDisabledByUserCaseConfig(boolean z17) {
        }

        @Override // androidx.camera.core.CameraControl
        public wa.a startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(androidx.camera.core.FocusMeteringResult.emptyInstance());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public wa.a submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i17, int i18) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(java.util.Collections.emptyList());
        }
    };

    /* loaded from: classes14.dex */
    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(androidx.camera.core.impl.Config config);

    void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder builder);

    void clearInteropConfig();

    default void decrementVideoUsage() {
    }

    default wa.a getCameraCapturePipelineAsync(int i17, int i18) {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(new androidx.camera.core.imagecapture.CameraCapturePipeline() { // from class: androidx.camera.core.impl.CameraControlInternal.1
            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public wa.a invokePostCapture() {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }

            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public wa.a invokePreCapture() {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }
        });
    }

    int getFlashMode();

    default androidx.camera.core.impl.CameraControlInternal getImplementation() {
        return this;
    }

    androidx.camera.core.impl.Config getInteropConfig();

    android.graphics.Rect getSensorRect();

    androidx.camera.core.impl.SessionConfig getSessionConfig();

    default void incrementVideoUsage() {
    }

    default boolean isInVideoUsage() {
        return false;
    }

    boolean isZslDisabledByByUserCaseConfig();

    void setFlashMode(int i17);

    default void setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
    }

    void setZslDisabledByUserCaseConfig(boolean z17);

    wa.a submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i17, int i18);

    /* loaded from: classes14.dex */
    public static final class CameraControlException extends java.lang.Exception {
        private androidx.camera.core.impl.CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        public androidx.camera.core.impl.CameraCaptureFailure getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure, java.lang.Throwable th6) {
            super(th6);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }
}
