package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public interface SynchronizedCaptureSession {

    /* loaded from: classes14.dex */
    public interface Opener {
        androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat createSessionConfigurationCompat(int i17, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> list, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback stateCallback);

        java.util.concurrent.Executor getExecutor();

        wa.a openCaptureSession(android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat, java.util.List<androidx.camera.core.impl.DeferrableSurface> list);

        wa.a startWithDeferrableSurface(java.util.List<androidx.camera.core.impl.DeferrableSurface> list, long j17);

        boolean stop();
    }

    /* loaded from: classes14.dex */
    public static class OpenerBuilder {
        private final androidx.camera.core.impl.Quirks mCameraQuirks;
        private final androidx.camera.camera2.internal.CaptureSessionRepository mCaptureSessionRepository;
        private final android.os.Handler mCompatHandler;
        private final androidx.camera.core.impl.Quirks mDeviceQuirks;
        private final java.util.concurrent.Executor mExecutor;
        private final java.util.concurrent.ScheduledExecutorService mScheduledExecutorService;

        public OpenerBuilder(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.os.Handler handler, androidx.camera.camera2.internal.CaptureSessionRepository captureSessionRepository, androidx.camera.core.impl.Quirks quirks, androidx.camera.core.impl.Quirks quirks2) {
            this.mExecutor = executor;
            this.mScheduledExecutorService = scheduledExecutorService;
            this.mCompatHandler = handler;
            this.mCaptureSessionRepository = captureSessionRepository;
            this.mCameraQuirks = quirks;
            this.mDeviceQuirks = quirks2;
        }

        public androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener build() {
            return new androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl(this.mCameraQuirks, this.mDeviceQuirks, this.mCaptureSessionRepository, this.mExecutor, this.mScheduledExecutorService, this.mCompatHandler);
        }
    }

    /* loaded from: classes14.dex */
    public static abstract class StateCallback {
        public void onActive(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onCaptureQueueEmpty(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onClosed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigureFailed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onReady(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onSessionFinished(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onSurfacePrepared(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession, android.view.Surface surface) {
        }
    }

    void abortCaptures();

    int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    int captureSingleRequest(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    int captureSingleRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    void close();

    void finishClose();

    android.hardware.camera2.CameraDevice getDevice();

    android.view.Surface getInputSurface();

    wa.a getOpeningBlocker();

    androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback getStateCallback();

    void onCameraDeviceError(int i17);

    int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    void stopRepeating();

    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat();
}
