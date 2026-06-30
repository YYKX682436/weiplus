package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSession */
/* loaded from: classes14.dex */
public interface InterfaceC0264x1b7732c4 {

    /* renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSession$Opener */
    /* loaded from: classes14.dex */
    public interface Opener {
        /* renamed from: createSessionConfigurationCompat */
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 mo3604x200dfbe(int i17, java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> list, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback stateCallback);

        /* renamed from: getExecutor */
        java.util.concurrent.Executor mo3605xf5a03649();

        /* renamed from: openCaptureSession */
        wa.a mo3606xf3dae15a(android.hardware.camera2.CameraDevice cameraDevice, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list);

        /* renamed from: startWithDeferrableSurface */
        wa.a mo3607xf0e7b34b(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list, long j17);

        /* renamed from: stop */
        boolean mo3608x360802();
    }

    /* renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSession$OpenerBuilder */
    /* loaded from: classes14.dex */
    public static class OpenerBuilder {

        /* renamed from: mCameraQuirks */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 f526x5c91e907;

        /* renamed from: mCaptureSessionRepository */
        private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa f527xf2ed9167;

        /* renamed from: mCompatHandler */
        private final android.os.Handler f528xffbc2dfb;

        /* renamed from: mDeviceQuirks */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 f529x5ce45b78;

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f530x9ec3a060;

        /* renamed from: mScheduledExecutorService */
        private final java.util.concurrent.ScheduledExecutorService f531xf3483782;

        public OpenerBuilder(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.os.Handler handler, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0222xaa5cc7fa c0222xaa5cc7fa, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc952) {
            this.f530x9ec3a060 = executor;
            this.f531xf3483782 = scheduledExecutorService;
            this.f528xffbc2dfb = handler;
            this.f527xf2ed9167 = c0222xaa5cc7fa;
            this.f526x5c91e907 = c0744x90dabc95;
            this.f529x5ce45b78 = c0744x90dabc952;
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.Opener m3609x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0271x537b0704(this.f526x5c91e907, this.f529x5ce45b78, this.f527xf2ed9167, this.f530x9ec3a060, this.f531xf3483782, this.f528xffbc2dfb);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback */
    /* loaded from: classes14.dex */
    public static abstract class StateCallback {
        /* renamed from: onActive */
        public void mo3610x3a2455c5(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        }

        /* renamed from: onCaptureQueueEmpty */
        public void mo3611xf5ec0e83(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        }

        /* renamed from: onClosed */
        public void mo3612x3e0ab82b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        }

        /* renamed from: onConfigureFailed */
        public void mo3355xa3b7eee4(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        }

        /* renamed from: onConfigured */
        public void mo3356xf8bc597d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        }

        /* renamed from: onReady */
        public void mo3357xb03baf04(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        }

        /* renamed from: onSessionFinished */
        public void mo3358x4d620149(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4) {
        }

        /* renamed from: onSurfacePrepared */
        public void mo3613xa39a382b(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4 interfaceC0264x1b7732c4, android.view.Surface surface) {
        }
    }

    /* renamed from: abortCaptures */
    void mo3586xd96a793d();

    /* renamed from: captureBurstRequests */
    int mo3587x6e0a775e(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: captureBurstRequests */
    int mo3588x6e0a775e(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: captureSingleRequest */
    int mo3589x33370f81(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: captureSingleRequest */
    int mo3590x33370f81(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: close */
    void mo3591x5a5ddf8();

    /* renamed from: finishClose */
    void mo3592x4ec94525();

    /* renamed from: getDevice */
    android.hardware.camera2.CameraDevice mo3593x1582414c();

    /* renamed from: getInputSurface */
    android.view.Surface mo3594x2d4747f9();

    /* renamed from: getOpeningBlocker */
    wa.a mo3595x4f81be78();

    /* renamed from: getStateCallback */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.InterfaceC0264x1b7732c4.StateCallback mo3596xf33fe440();

    /* renamed from: onCameraDeviceError */
    void mo3597xbde300ce(int i17);

    /* renamed from: setRepeatingBurstRequests */
    int mo3598x28cf2edf(java.util.List<android.hardware.camera2.CaptureRequest> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: setRepeatingBurstRequests */
    int mo3599x28cf2edf(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: setSingleRepeatingRequest */
    int mo3600x95252392(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: setSingleRepeatingRequest */
    int mo3601x95252392(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: stopRepeating */
    void mo3602x6108ba85();

    /* renamed from: toCameraCaptureSessionCompat */
    p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7 mo3603x27efedb2();
}
