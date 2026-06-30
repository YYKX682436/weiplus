package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
final class SynchronizedCaptureSessionStateCallbacks extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback {
    private final java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> mCallbacks;

    public SynchronizedCaptureSessionStateCallbacks(java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.mCallbacks = arrayList;
        arrayList.addAll(list);
    }

    public static androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback createComboCallback(androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback... stateCallbackArr) {
        return new androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks(java.util.Arrays.asList(stateCallbackArr));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onActive(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onActive(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onCaptureQueueEmpty(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCaptureQueueEmpty(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onClosed(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onConfigureFailed(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onConfigured(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onReady(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onReady(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onSessionFinished(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onSessionFinished(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onSurfacePrepared(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession, android.view.Surface surface) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onSurfacePrepared(synchronizedCaptureSession, surface);
        }
    }

    /* loaded from: classes14.dex */
    public static class Adapter extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback {
        private final android.hardware.camera2.CameraCaptureSession.StateCallback mCameraCaptureSessionStateCallback;

        public Adapter(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this.mCameraCaptureSessionStateCallback = stateCallback;
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onActive(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            this.mCameraCaptureSessionStateCallback.onActive(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onCaptureQueueEmpty(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            androidx.camera.camera2.internal.compat.ApiCompat.Api26Impl.onCaptureQueueEmpty(this.mCameraCaptureSessionStateCallback, synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onClosed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            this.mCameraCaptureSessionStateCallback.onClosed(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            this.mCameraCaptureSessionStateCallback.onConfigureFailed(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            this.mCameraCaptureSessionStateCallback.onConfigured(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            this.mCameraCaptureSessionStateCallback.onReady(synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onSessionFinished(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onSurfacePrepared(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession, android.view.Surface surface) {
            androidx.camera.camera2.internal.compat.ApiCompat.Api23Impl.onSurfacePrepared(this.mCameraCaptureSessionStateCallback, synchronizedCaptureSession.toCameraCaptureSessionCompat().toCameraCaptureSession(), surface);
        }

        public Adapter(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list) {
            this(androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.createComboCallback(list));
        }
    }
}
