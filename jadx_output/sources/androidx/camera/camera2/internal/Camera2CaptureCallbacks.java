package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class Camera2CaptureCallbacks {

    /* loaded from: classes14.dex */
    public static final class ComboSessionCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> mCallbacks = new java.util.ArrayList();

        public ComboSessionCaptureCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list) {
            for (android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback : list) {
                if (!(captureCallback instanceof androidx.camera.camera2.internal.Camera2CaptureCallbacks.NoOpSessionCaptureCallback)) {
                    this.mCallbacks.add(captureCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                androidx.camera.camera2.internal.compat.ApiCompat.Api24Impl.onCaptureBufferLost(it.next(), cameraCaptureSession, captureRequest, surface, j17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceAborted(cameraCaptureSession, i17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceCompleted(cameraCaptureSession, i17, j17);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j17, j18);
            }
        }
    }

    /* loaded from: classes14.dex */
    public static final class NoOpSessionCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
        }
    }

    private Camera2CaptureCallbacks() {
    }

    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback createComboCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list) {
        return new androidx.camera.camera2.internal.Camera2CaptureCallbacks.ComboSessionCaptureCallback(list);
    }

    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback createNoOpCallback() {
        return new androidx.camera.camera2.internal.Camera2CaptureCallbacks.NoOpSessionCaptureCallback();
    }

    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback createComboCallback(android.hardware.camera2.CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return createComboCallback((java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>) java.util.Arrays.asList(captureCallbackArr));
    }
}
