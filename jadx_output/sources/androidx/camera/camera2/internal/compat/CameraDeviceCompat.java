package androidx.camera.camera2.internal.compat;

/* loaded from: classes14.dex */
public final class CameraDeviceCompat {
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;
    private final androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl mImpl;

    /* loaded from: classes14.dex */
    public interface CameraDeviceCompatImpl {
        void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat);

        android.hardware.camera2.CameraDevice unwrap();
    }

    /* loaded from: classes14.dex */
    public static final class StateCallbackExecutorWrapper extends android.hardware.camera2.CameraDevice.StateCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraDevice.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClosed$3(android.hardware.camera2.CameraDevice cameraDevice) {
            this.mWrappedCallback.onClosed(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDisconnected$1(android.hardware.camera2.CameraDevice cameraDevice) {
            this.mWrappedCallback.onDisconnected(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$2(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            this.mWrappedCallback.onError(cameraDevice, i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onOpened$0(android.hardware.camera2.CameraDevice cameraDevice) {
            this.mWrappedCallback.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final android.hardware.camera2.CameraDevice cameraDevice) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.this.lambda$onClosed$3(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final android.hardware.camera2.CameraDevice cameraDevice) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.this.lambda$onDisconnected$1(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final android.hardware.camera2.CameraDevice cameraDevice, final int i17) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$d
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.this.lambda$onError$2(cameraDevice, i17);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final android.hardware.camera2.CameraDevice cameraDevice) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.this.lambda$onOpened$0(cameraDevice);
                }
            });
        }
    }

    private CameraDeviceCompat(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler handler) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new androidx.camera.camera2.internal.compat.CameraDeviceCompatApi28Impl(cameraDevice);
        } else {
            this.mImpl = androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl.create(cameraDevice, handler);
        }
    }

    public static androidx.camera.camera2.internal.compat.CameraDeviceCompat toCameraDeviceCompat(android.hardware.camera2.CameraDevice cameraDevice) {
        return toCameraDeviceCompat(cameraDevice, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
    }

    public void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat) {
        this.mImpl.createCaptureSession(sessionConfigurationCompat);
    }

    public android.hardware.camera2.CameraDevice toCameraDevice() {
        return this.mImpl.unwrap();
    }

    public static androidx.camera.camera2.internal.compat.CameraDeviceCompat toCameraDeviceCompat(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler handler) {
        return new androidx.camera.camera2.internal.compat.CameraDeviceCompat(cameraDevice, handler);
    }
}
