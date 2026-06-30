package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.CaptureCallbackAdapter */
/* loaded from: classes14.dex */
final class C0213xab1d9b44 extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

    /* renamed from: mCameraCaptureCallback */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 f360x17671159;

    public C0213xab1d9b44(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
        if (abstractC0659xd0769ba6 == null) {
            throw new java.lang.NullPointerException("cameraCaptureCallback is null");
        }
        this.f360x17671159 = abstractC0659xd0769ba6;
    }

    /* renamed from: getCaptureConfigId */
    private int m3317x44971b2d(android.hardware.camera2.CaptureRequest captureRequest) {
        java.lang.Integer num;
        if ((captureRequest.getTag() instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c) && (num = (java.lang.Integer) ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c) captureRequest.getTag()).m5703xb5887064(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.f1600x52cbcd1a)) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c m5701x298eb42f;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        java.lang.Object tag = captureRequest.getTag();
        if (tag != null) {
            m3.h.b(tag instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            m5701x298eb42f = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c) tag;
        } else {
            m5701x298eb42f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c.m5701x298eb42f();
        }
        this.f360x17671159.mo3016x34cad1a4(m3317x44971b2d(captureRequest), new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0115xf008e111(m5701x298eb42f, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f360x17671159.mo3017x90bd1f84(m3317x44971b2d(captureRequest), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0661xad844609.Reason.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, long j17, long j18) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j17, j18);
        this.f360x17671159.mo4952x56961e1a(m3317x44971b2d(captureRequest));
    }
}
