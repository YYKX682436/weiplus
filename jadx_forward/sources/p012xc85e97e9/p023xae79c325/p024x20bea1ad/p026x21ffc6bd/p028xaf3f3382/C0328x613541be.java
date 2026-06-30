package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl */
/* loaded from: classes14.dex */
public class C0328x613541be extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e {
    public C0328x613541be(android.hardware.camera2.CameraDevice cameraDevice, java.lang.Object obj) {
        super(cameraDevice, obj);
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0328x613541be m3747xaf65a0fc(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler handler) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0328x613541be(cameraDevice, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e.CameraDeviceCompatParamsApi21(handler));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.CameraDeviceCompatImpl
    /* renamed from: createCaptureSession */
    public void mo3741xc47ebc8c(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e.m3750x6c52f173(this.f627x458736e8, c0355x6096c1c2);
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper(c0355x6096c1c2.m3891xf5a03649(), c0355x6096c1c2.m3896xf33fe440());
        java.util.List<android.view.Surface> m3752x939937b8 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e.m3752x939937b8(c0355x6096c1c2.m3893xfeda7614());
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e.CameraDeviceCompatParamsApi21 cameraDeviceCompatParamsApi21 = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e.CameraDeviceCompatParamsApi21) this.f628x81292813;
        cameraDeviceCompatParamsApi21.getClass();
        android.os.Handler handler = cameraDeviceCompatParamsApi21.f629xffbc2dfb;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e m3892x189a2742 = c0355x6096c1c2.m3892x189a2742();
        try {
            if (m3892x189a2742 != null) {
                android.hardware.camera2.params.InputConfiguration inputConfiguration = (android.hardware.camera2.params.InputConfiguration) m3892x189a2742.m3820xcdecea63();
                inputConfiguration.getClass();
                this.f627x458736e8.createReprocessableCaptureSession(inputConfiguration, m3752x939937b8, stateCallbackExecutorWrapper, handler);
            } else if (c0355x6096c1c2.m3895xd87f91ba() == 1) {
                this.f627x458736e8.createConstrainedHighSpeedCaptureSession(m3752x939937b8, stateCallbackExecutorWrapper, handler);
            } else {
                m3753x4a7b5fbd(this.f627x458736e8, m3752x939937b8, stateCallbackExecutorWrapper, handler);
            }
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        }
    }
}
