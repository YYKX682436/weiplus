package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl */
/* loaded from: classes14.dex */
public class C0319x93e0dca8 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl {

    /* renamed from: mCameraCaptureSession */
    final android.hardware.camera2.CameraCaptureSession f614xc1b91f02;

    /* renamed from: mObject */
    final java.lang.Object f615x126cca0c;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl$CameraCaptureSessionCompatParamsApi21 */
    /* loaded from: classes14.dex */
    public static class CameraCaptureSessionCompatParamsApi21 {

        /* renamed from: mCompatHandler */
        final android.os.Handler f616xffbc2dfb;

        public CameraCaptureSessionCompatParamsApi21(android.os.Handler handler) {
            this.f616xffbc2dfb = handler;
        }
    }

    public C0319x93e0dca8(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, java.lang.Object obj) {
        cameraCaptureSession.getClass();
        this.f614xc1b91f02 = cameraCaptureSession;
        this.f615x126cca0c = obj;
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl m3728xaf65a0fc(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.os.Handler handler) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8(cameraCaptureSession, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8.CameraCaptureSessionCompatParamsApi21(handler));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl
    /* renamed from: captureBurstRequests */
    public int mo3709x6e0a775e(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f614xc1b91f02.captureBurst(list, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper(executor, captureCallback), ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8.CameraCaptureSessionCompatParamsApi21) this.f615x126cca0c).f616xffbc2dfb);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl
    /* renamed from: captureSingleRequest */
    public int mo3710x33370f81(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f614xc1b91f02.capture(captureRequest, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper(executor, captureCallback), ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8.CameraCaptureSessionCompatParamsApi21) this.f615x126cca0c).f616xffbc2dfb);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl
    /* renamed from: setRepeatingBurstRequests */
    public int mo3711x28cf2edf(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f614xc1b91f02.setRepeatingBurst(list, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper(executor, captureCallback), ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8.CameraCaptureSessionCompatParamsApi21) this.f615x126cca0c).f616xffbc2dfb);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl
    /* renamed from: setSingleRepeatingRequest */
    public int mo3712x95252392(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f614xc1b91f02.setRepeatingRequest(captureRequest, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CaptureCallbackExecutorWrapper(executor, captureCallback), ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8.CameraCaptureSessionCompatParamsApi21) this.f615x126cca0c).f616xffbc2dfb);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl
    /* renamed from: unwrap */
    public android.hardware.camera2.CameraCaptureSession mo3713xcdecea63() {
        return this.f614xc1b91f02;
    }
}
