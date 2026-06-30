package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompat */
/* loaded from: classes14.dex */
public final class C0323x2c84e95d {

    /* renamed from: SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED */
    public static final int f622xe2f1ab0e = 1;

    /* renamed from: SESSION_OPERATION_MODE_NORMAL */
    public static final int f623x359cf302 = 0;

    /* renamed from: mImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.CameraDeviceCompatImpl f624x622d82d;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompat$CameraDeviceCompatImpl */
    /* loaded from: classes14.dex */
    public interface CameraDeviceCompatImpl {
        /* renamed from: createCaptureSession */
        void mo3741xc47ebc8c(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2);

        /* renamed from: unwrap */
        android.hardware.camera2.CameraDevice mo3742xcdecea63();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper */
    /* loaded from: classes14.dex */
    public static final class StateCallbackExecutorWrapper extends android.hardware.camera2.CameraDevice.StateCallback {

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f625x9ec3a060;

        /* renamed from: mWrappedCallback */
        final android.hardware.camera2.CameraDevice.StateCallback f626x5027e3bd;

        public StateCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
            this.f625x9ec3a060 = executor;
            this.f626x5027e3bd = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onClosed$3 */
        public /* synthetic */ void m3743x2526daf7(android.hardware.camera2.CameraDevice cameraDevice) {
            this.f626x5027e3bd.onClosed(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onDisconnected$1 */
        public /* synthetic */ void m3744x9129c304(android.hardware.camera2.CameraDevice cameraDevice) {
            this.f626x5027e3bd.onDisconnected(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onError$2 */
        public /* synthetic */ void m3745x6d22e51a(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            this.f626x5027e3bd.onError(cameraDevice, i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onOpened$0 */
        public /* synthetic */ void m3746xc5f6f6b1(android.hardware.camera2.CameraDevice cameraDevice) {
            this.f626x5027e3bd.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final android.hardware.camera2.CameraDevice cameraDevice) {
            this.f625x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.StateCallbackExecutorWrapper.this.m3743x2526daf7(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final android.hardware.camera2.CameraDevice cameraDevice) {
            this.f625x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.StateCallbackExecutorWrapper.this.m3744x9129c304(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final android.hardware.camera2.CameraDevice cameraDevice, final int i17) {
            this.f625x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$d
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.StateCallbackExecutorWrapper.this.m3745x6d22e51a(cameraDevice, i17);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final android.hardware.camera2.CameraDevice cameraDevice) {
            this.f625x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat$StateCallbackExecutorWrapper$$c
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.StateCallbackExecutorWrapper.this.m3746xc5f6f6b1(cameraDevice);
                }
            });
        }
    }

    private C0323x2c84e95d(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler handler) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f624x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0330x617bb743(cameraDevice);
        } else {
            this.f624x622d82d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0329x6143593f.m3748xaf65a0fc(cameraDevice, handler);
        }
    }

    /* renamed from: toCameraDeviceCompat */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d m3737x4eba6f18(android.hardware.camera2.CameraDevice cameraDevice) {
        return m3738x4eba6f18(cameraDevice, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0792x43f0de11.m5921x9cf0d20b());
    }

    /* renamed from: createCaptureSession */
    public void m3739xc47ebc8c(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2) {
        this.f624x622d82d.mo3741xc47ebc8c(c0355x6096c1c2);
    }

    /* renamed from: toCameraDevice */
    public android.hardware.camera2.CameraDevice m3740x7b0c9ff6() {
        return this.f624x622d82d.mo3742xcdecea63();
    }

    /* renamed from: toCameraDeviceCompat */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d m3738x4eba6f18(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler handler) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d(cameraDevice, handler);
    }
}
