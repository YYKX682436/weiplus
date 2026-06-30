package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.CaptureCallbackContainer */
/* loaded from: classes14.dex */
final class C0214xaed41b36 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 {

    /* renamed from: mCaptureCallback */
    private final android.hardware.camera2.CameraCaptureSession.CaptureCallback f361x4833d57e;

    private C0214xaed41b36(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new java.lang.NullPointerException("captureCallback is null");
        }
        this.f361x4833d57e = captureCallback;
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0214xaed41b36 m3318xaf65a0fc(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0214xaed41b36(captureCallback);
    }

    /* renamed from: getCaptureCallback */
    public android.hardware.camera2.CameraCaptureSession.CaptureCallback m3319x5ce77775() {
        return this.f361x4833d57e;
    }
}
