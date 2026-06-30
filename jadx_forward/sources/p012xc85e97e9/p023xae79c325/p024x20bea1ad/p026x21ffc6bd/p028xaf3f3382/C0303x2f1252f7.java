package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat */
/* loaded from: classes14.dex */
public final class C0303x2f1252f7 {

    /* renamed from: mImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl f609x622d82d;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl */
    /* loaded from: classes14.dex */
    public interface CameraCaptureSessionCompatImpl {
        /* renamed from: captureBurstRequests */
        int mo3709x6e0a775e(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

        /* renamed from: captureSingleRequest */
        int mo3710x33370f81(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

        /* renamed from: setRepeatingBurstRequests */
        int mo3711x28cf2edf(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

        /* renamed from: setSingleRepeatingRequest */
        int mo3712x95252392(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

        /* renamed from: unwrap */
        android.hardware.camera2.CameraCaptureSession mo3713xcdecea63();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper */
    /* loaded from: classes14.dex */
    public static final class CaptureCallbackExecutorWrapper extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f610x9ec3a060;

        /* renamed from: mWrappedCallback */
        final android.hardware.camera2.CameraCaptureSession.CaptureCallback f611x5027e3bd;

        public CaptureCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
            this.f610x9ec3a060 = executor;
            this.f611x5027e3bd = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureBufferLost$6 */
        public /* synthetic */ void m3714x3c3c1000(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.view.Surface surface, long j17) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api24Impl.m3691xf66d3f4b(this.f611x5027e3bd, cameraCaptureSession, captureRequest, surface, j17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureCompleted$2 */
        public /* synthetic */ void m3715x89a021ef(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            this.f611x5027e3bd.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureFailed$3 */
        public /* synthetic */ void m3716xea2faf76(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            this.f611x5027e3bd.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureProgressed$1 */
        public /* synthetic */ void m3717xed9b7603(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult captureResult) {
            this.f611x5027e3bd.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureSequenceAborted$5 */
        public /* synthetic */ void m3718x11809735(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17) {
            this.f611x5027e3bd.onCaptureSequenceAborted(cameraCaptureSession, i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureSequenceCompleted$4 */
        public /* synthetic */ void m3719xa6be6970(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, long j17) {
            this.f611x5027e3bd.onCaptureSequenceCompleted(cameraCaptureSession, i17, j17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureStarted$0 */
        public /* synthetic */ void m3720xfcd63423(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
            this.f611x5027e3bd.onCaptureStarted(cameraCaptureSession, captureRequest, j17, j18);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final android.view.Surface surface, final long j17) {
            this.f610x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper.this.m3714x3c3c1000(cameraCaptureSession, captureRequest, surface, j17);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            this.f610x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$e
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper.this.m3715x89a021ef(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final android.hardware.camera2.CaptureFailure captureFailure) {
            this.f610x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$g
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper.this.m3716xea2faf76(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final android.hardware.camera2.CaptureResult captureResult) {
            this.f610x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$d
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper.this.m3717xed9b7603(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final int i17) {
            this.f610x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper.this.m3718x11809735(cameraCaptureSession, i17);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final int i17, final long j17) {
            this.f610x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$c
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper.this.m3719xa6be6970(cameraCaptureSession, i17, j17);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.hardware.camera2.CaptureRequest captureRequest, final long j17, final long j18) {
            this.f610x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$f
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper.this.m3720xfcd63423(cameraCaptureSession, captureRequest, j17, j18);
                }
            });
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper */
    /* loaded from: classes14.dex */
    public static final class StateCallbackExecutorWrapper extends android.hardware.camera2.CameraCaptureSession.StateCallback {

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f612x9ec3a060;

        /* renamed from: mWrappedCallback */
        final android.hardware.camera2.CameraCaptureSession.StateCallback f613x5027e3bd;

        public StateCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this.f612x9ec3a060 = executor;
            this.f613x5027e3bd = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onActive$3 */
        public /* synthetic */ void m3721x814f7a11(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f613x5027e3bd.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureQueueEmpty$4 */
        public /* synthetic */ void m3722x5743f136(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api26Impl.m3693xf5ec0e83(this.f613x5027e3bd, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onClosed$5 */
        public /* synthetic */ void m3723x2526daf9(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f613x5027e3bd.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onConfigureFailed$1 */
        public /* synthetic */ void m3724xc0e9a14(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f613x5027e3bd.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onConfigured$0 */
        public /* synthetic */ void m3725x3ec4a946(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f613x5027e3bd.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onReady$2 */
        public /* synthetic */ void m3726x5b071f5(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f613x5027e3bd.onReady(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onSurfacePrepared$6 */
        public /* synthetic */ void m3727x9c83ada0(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.view.Surface surface) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0301x42f63e1c.Api23Impl.m3690xa39a382b(this.f613x5027e3bd, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f612x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$d
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper.this.m3721x814f7a11(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f612x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$c
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper.this.m3722x5743f136(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f612x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper.this.m3723x2526daf9(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f612x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$e
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper.this.m3724xc0e9a14(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f612x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper.this.m3725x3ec4a946(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            this.f612x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$f
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper.this.m3726x5b071f5(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final android.hardware.camera2.CameraCaptureSession cameraCaptureSession, final android.view.Surface surface) {
            this.f612x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$g
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper.this.m3727x9c83ada0(cameraCaptureSession, surface);
                }
            });
        }
    }

    private C0303x2f1252f7(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.os.Handler handler) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f609x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0318x1227ae9(cameraCaptureSession);
        } else {
            this.f609x622d82d = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8.m3728xaf65a0fc(cameraCaptureSession, handler);
        }
    }

    /* renamed from: toCameraCaptureSessionCompat */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7 m3702x27efedb2(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        return m3703x27efedb2(cameraCaptureSession, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0792x43f0de11.m5921x9cf0d20b());
    }

    /* renamed from: captureBurstRequests */
    public int m3704x6e0a775e(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f609x622d82d.mo3709x6e0a775e(list, executor, captureCallback);
    }

    /* renamed from: captureSingleRequest */
    public int m3705x33370f81(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f609x622d82d.mo3710x33370f81(captureRequest, executor, captureCallback);
    }

    /* renamed from: setRepeatingBurstRequests */
    public int m3706x28cf2edf(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f609x622d82d.mo3711x28cf2edf(list, executor, captureCallback);
    }

    /* renamed from: setSingleRepeatingRequest */
    public int m3707x95252392(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f609x622d82d.mo3712x95252392(captureRequest, executor, captureCallback);
    }

    /* renamed from: toCameraCaptureSession */
    public android.hardware.camera2.CameraCaptureSession m3708xcf839a10() {
        return this.f609x622d82d.mo3713xcdecea63();
    }

    /* renamed from: toCameraCaptureSessionCompat */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7 m3703x27efedb2(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.os.Handler handler) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7(cameraCaptureSession, handler);
    }
}
