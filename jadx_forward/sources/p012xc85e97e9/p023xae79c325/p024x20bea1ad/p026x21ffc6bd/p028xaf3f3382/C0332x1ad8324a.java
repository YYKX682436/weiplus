package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompat */
/* loaded from: classes14.dex */
public final class C0332x1ad8324a {

    /* renamed from: mCameraCharacteristicsMap */
    private final java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595> f630x605c7d96 = new android.util.ArrayMap(4);

    /* renamed from: mImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl f631x622d82d;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper */
    /* loaded from: classes14.dex */
    public static final class AvailabilityCallbackExecutorWrapper extends android.hardware.camera2.CameraManager.AvailabilityCallback {

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f633x9ec3a060;

        /* renamed from: mWrappedCallback */
        final android.hardware.camera2.CameraManager.AvailabilityCallback f635x5027e3bd;

        /* renamed from: mLock */
        private final java.lang.Object f634x6243b38 = new java.lang.Object();

        /* renamed from: mDisabled */
        private boolean f632x3523e209 = false;

        public AvailabilityCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
            this.f633x9ec3a060 = executor;
            this.f635x5027e3bd = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCameraAccessPrioritiesChanged$0 */
        public /* synthetic */ void m3764xd9ec57f9() {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api29Impl.m3694xe88ed78a(this.f635x5027e3bd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCameraAvailable$1 */
        public /* synthetic */ void m3765x5be98835(java.lang.String str) {
            this.f635x5027e3bd.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCameraUnavailable$2 */
        public /* synthetic */ void m3766xb25b443d(java.lang.String str) {
            this.f635x5027e3bd.onCameraUnavailable(str);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f634x6243b38) {
                if (!this.f632x3523e209) {
                    this.f633x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.AvailabilityCallbackExecutorWrapper.this.m3764xd9ec57f9();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final java.lang.String str) {
            synchronized (this.f634x6243b38) {
                if (!this.f632x3523e209) {
                    this.f633x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.AvailabilityCallbackExecutorWrapper.this.m3765x5be98835(str);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final java.lang.String str) {
            synchronized (this.f634x6243b38) {
                if (!this.f632x3523e209) {
                    this.f633x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.AvailabilityCallbackExecutorWrapper.this.m3766xb25b443d(str);
                        }
                    });
                }
            }
        }

        /* renamed from: setDisabled */
        public void m3767x86b8d8fe() {
            synchronized (this.f634x6243b38) {
                this.f632x3523e209 = true;
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl */
    /* loaded from: classes14.dex */
    public interface CameraManagerCompatImpl {
        /* renamed from: from */
        static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl m3768x3017aa(android.content.Context context, android.os.Handler handler) {
            int i17 = android.os.Build.VERSION.SDK_INT;
            return i17 >= 30 ? new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0338xb19b458d(context) : i17 >= 29 ? new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0337xb0654077(context) : i17 >= 28 ? p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0336xb05728f6.m3776xaf65a0fc(context) : p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb.m3780xaf65a0fc(context, handler);
        }

        /* renamed from: getCameraCharacteristics */
        android.hardware.camera2.CameraCharacteristics mo3769x9b962a9d(java.lang.String str);

        /* renamed from: getCameraIdList */
        java.lang.String[] mo3770x174bbe54();

        /* renamed from: getCameraManager */
        android.hardware.camera2.CameraManager mo3771xa281bd12();

        /* renamed from: getConcurrentCameraIds */
        java.util.Set<java.util.Set<java.lang.String>> mo3772xf4d0e226();

        /* renamed from: openCamera */
        void mo3773xf86b760f(java.lang.String str, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback);

        /* renamed from: registerAvailabilityCallback */
        void mo3774x1037c203(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: unregisterAvailabilityCallback */
        void mo3775x1f76611c(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback);
    }

    private C0332x1ad8324a(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.f631x622d82d = cameraManagerCompatImpl;
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a m3754x3017aa(android.content.Context context) {
        return m3755x3017aa(context, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0792x43f0de11.m5921x9cf0d20b());
    }

    /* renamed from: getCameraCharacteristicsCompat */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 m3757xc2a5207f(java.lang.String str) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595;
        synchronized (this.f630x605c7d96) {
            c0322x11ef9595 = this.f630x605c7d96.get(str);
            if (c0322x11ef9595 == null) {
                try {
                    c0322x11ef9595 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595.m3732x34c5523a(this.f631x622d82d.mo3769x9b962a9d(str), str);
                    this.f630x605c7d96.put(str, c0322x11ef9595);
                } catch (java.lang.AssertionError e17) {
                    throw new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468(10002, e17.getMessage(), e17);
                }
            }
        }
        return c0322x11ef9595;
    }

    /* renamed from: getCameraIdList */
    public java.lang.String[] m3758x174bbe54() {
        return this.f631x622d82d.mo3770x174bbe54();
    }

    /* renamed from: getConcurrentCameraIds */
    public java.util.Set<java.util.Set<java.lang.String>> m3759xf4d0e226() {
        return this.f631x622d82d.mo3772xf4d0e226();
    }

    /* renamed from: openCamera */
    public void m3760xf86b760f(java.lang.String str, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
        this.f631x622d82d.mo3773xf86b760f(str, executor, stateCallback);
    }

    /* renamed from: registerAvailabilityCallback */
    public void m3761x1037c203(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        this.f631x622d82d.mo3774x1037c203(executor, availabilityCallback);
    }

    /* renamed from: unregisterAvailabilityCallback */
    public void m3762x1f76611c(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        this.f631x622d82d.mo3775x1f76611c(availabilityCallback);
    }

    /* renamed from: unwrap */
    public android.hardware.camera2.CameraManager m3763xcdecea63() {
        return this.f631x622d82d.mo3771xa281bd12();
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a m3755x3017aa(android.content.Context context, android.os.Handler handler) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl.m3768x3017aa(context, handler));
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a m3756x3017aa(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl cameraManagerCompatImpl) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a(cameraManagerCompatImpl);
    }
}
