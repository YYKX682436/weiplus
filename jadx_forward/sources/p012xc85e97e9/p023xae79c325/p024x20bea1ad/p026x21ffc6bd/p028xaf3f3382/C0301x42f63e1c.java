package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* renamed from: androidx.camera.camera2.internal.compat.ApiCompat */
/* loaded from: classes14.dex */
public final class C0301x42f63e1c {

    /* renamed from: androidx.camera.camera2.internal.compat.ApiCompat$Api21Impl */
    /* loaded from: classes14.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        /* renamed from: close */
        public static void m3689x5a5ddf8(android.hardware.camera2.CameraDevice cameraDevice) {
            cameraDevice.close();
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.ApiCompat$Api23Impl */
    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        /* renamed from: onSurfacePrepared */
        public static void m3690xa39a382b(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback, android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.ApiCompat$Api24Impl */
    /* loaded from: classes14.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        /* renamed from: onCaptureBufferLost */
        public static void m3691xf66d3f4b(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback, android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
            captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j17);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.ApiCompat$Api26Impl */
    /* loaded from: classes14.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        /* renamed from: newOutputConfiguration */
        public static <T> android.hardware.camera2.params.OutputConfiguration m3692x9ad6fb5(android.util.Size size, java.lang.Class<T> cls) {
            return new android.hardware.camera2.params.OutputConfiguration(size, cls);
        }

        /* renamed from: onCaptureQueueEmpty */
        public static void m3693xf5ec0e83(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback, android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.ApiCompat$Api29Impl */
    /* loaded from: classes14.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        /* renamed from: onCameraAccessPrioritiesChanged */
        public static void m3694xe88ed78a(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
            availabilityCallback.onCameraAccessPrioritiesChanged();
        }
    }

    private C0301x42f63e1c() {
    }
}
