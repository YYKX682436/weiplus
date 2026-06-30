package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class CameraCaptureSessionStateCallbacks {

    /* loaded from: classes14.dex */
    public static final class ComboSessionStateCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> mCallbacks = new java.util.ArrayList();

        public ComboSessionStateCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list) {
            for (android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.NoOpSessionStateCallback)) {
                    this.mCallbacks.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                androidx.camera.camera2.internal.compat.ApiCompat.Api26Impl.onCaptureQueueEmpty(it.next(), cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                androidx.camera.camera2.internal.compat.ApiCompat.Api23Impl.onSurfacePrepared(it.next(), cameraCaptureSession, surface);
            }
        }
    }

    /* loaded from: classes14.dex */
    public static final class NoOpSessionStateCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
        }
    }

    private CameraCaptureSessionStateCallbacks() {
    }

    public static android.hardware.camera2.CameraCaptureSession.StateCallback createComboCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.ComboSessionStateCallback(list);
    }

    public static android.hardware.camera2.CameraCaptureSession.StateCallback createNoOpCallback() {
        return new androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.NoOpSessionStateCallback();
    }

    public static android.hardware.camera2.CameraCaptureSession.StateCallback createComboCallback(android.hardware.camera2.CameraCaptureSession.StateCallback... stateCallbackArr) {
        return createComboCallback((java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback>) java.util.Arrays.asList(stateCallbackArr));
    }
}
