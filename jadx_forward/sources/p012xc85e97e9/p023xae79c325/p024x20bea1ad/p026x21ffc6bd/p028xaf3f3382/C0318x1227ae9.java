package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatApi28Impl */
/* loaded from: classes14.dex */
public class C0318x1227ae9 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8 {
    public C0318x1227ae9(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl
    /* renamed from: captureBurstRequests */
    public int mo3709x6e0a775e(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f614xc1b91f02.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl
    /* renamed from: captureSingleRequest */
    public int mo3710x33370f81(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f614xc1b91f02.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl
    /* renamed from: setRepeatingBurstRequests */
    public int mo3711x28cf2edf(java.util.List<android.hardware.camera2.CaptureRequest> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f614xc1b91f02.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0319x93e0dca8, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.CameraCaptureSessionCompatImpl
    /* renamed from: setSingleRepeatingRequest */
    public int mo3712x95252392(android.hardware.camera2.CaptureRequest captureRequest, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f614xc1b91f02.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
