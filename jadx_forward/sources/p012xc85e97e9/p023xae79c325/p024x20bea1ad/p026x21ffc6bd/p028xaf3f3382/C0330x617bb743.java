package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompatApi28Impl */
/* loaded from: classes14.dex */
public class C0330x617bb743 extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0329x6143593f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0330x617bb743(android.hardware.camera2.CameraDevice cameraDevice) {
        super(cameraDevice, null);
        cameraDevice.getClass();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0329x6143593f, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0328x613541be, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.CameraDeviceCompatImpl
    /* renamed from: createCaptureSession */
    public void mo3741xc47ebc8c(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2) {
        android.hardware.camera2.params.SessionConfiguration sessionConfiguration = (android.hardware.camera2.params.SessionConfiguration) c0355x6096c1c2.m3900xcdecea63();
        sessionConfiguration.getClass();
        try {
            this.f627x458736e8.createCaptureSession(sessionConfiguration);
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        }
    }
}
