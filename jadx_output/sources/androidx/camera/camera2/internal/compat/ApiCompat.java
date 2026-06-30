package androidx.camera.camera2.internal.compat;

/* loaded from: classes14.dex */
public final class ApiCompat {

    /* loaded from: classes14.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static void close(android.hardware.camera2.CameraDevice cameraDevice) {
            cameraDevice.close();
        }
    }

    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback, android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }

    /* loaded from: classes14.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback, android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
            captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j17);
        }
    }

    /* loaded from: classes14.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static <T> android.hardware.camera2.params.OutputConfiguration newOutputConfiguration(android.util.Size size, java.lang.Class<T> cls) {
            return new android.hardware.camera2.params.OutputConfiguration(size, cls);
        }

        public static void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback, android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    /* loaded from: classes14.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void onCameraAccessPrioritiesChanged(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
            availabilityCallback.onCameraAccessPrioritiesChanged();
        }
    }

    private ApiCompat() {
    }
}
