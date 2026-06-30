package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl */
/* loaded from: classes14.dex */
class C0331x2ba1ad0e implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.CameraDeviceCompatImpl {

    /* renamed from: mCameraDevice */
    final android.hardware.camera2.CameraDevice f627x458736e8;

    /* renamed from: mImplParams */
    final java.lang.Object f628x81292813;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl$CameraDeviceCompatParamsApi21 */
    /* loaded from: classes14.dex */
    public static class CameraDeviceCompatParamsApi21 {

        /* renamed from: mCompatHandler */
        final android.os.Handler f629xffbc2dfb;

        public CameraDeviceCompatParamsApi21(android.os.Handler handler) {
            this.f629xffbc2dfb = handler;
        }
    }

    public C0331x2ba1ad0e(android.hardware.camera2.CameraDevice cameraDevice, java.lang.Object obj) {
        cameraDevice.getClass();
        this.f627x458736e8 = cameraDevice;
        this.f628x81292813 = obj;
    }

    /* renamed from: checkPhysicalCameraIdValid */
    private static void m3749x3ab580fd(android.hardware.camera2.CameraDevice cameraDevice, java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> list) {
        java.lang.String id6 = cameraDevice.getId();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String m3839x936d7c8d = it.next().m3839x936d7c8d();
            if (m3839x936d7c8d != null && !m3839x936d7c8d.isEmpty()) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w("CameraDeviceCompat", "Camera " + id6 + ": Camera doesn't support physicalCameraId " + m3839x936d7c8d + ". Ignoring.");
            }
        }
    }

    /* renamed from: checkPreconditions */
    public static void m3750x6c52f173(android.hardware.camera2.CameraDevice cameraDevice, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2) {
        cameraDevice.getClass();
        c0355x6096c1c2.getClass();
        c0355x6096c1c2.m3896xf33fe440().getClass();
        java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> m3893xfeda7614 = c0355x6096c1c2.m3893xfeda7614();
        if (m3893xfeda7614 == null) {
            throw new java.lang.IllegalArgumentException("Invalid output configurations");
        }
        if (c0355x6096c1c2.m3891xf5a03649() == null) {
            throw new java.lang.IllegalArgumentException("Invalid executor");
        }
        m3749x3ab580fd(cameraDevice, m3893xfeda7614);
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e m3751xaf65a0fc(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler handler) {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e(cameraDevice, new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e.CameraDeviceCompatParamsApi21(handler));
    }

    /* renamed from: unpackSurfaces */
    public static java.util.List<android.view.Surface> m3752x939937b8(java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m3841xcf572877());
        }
        return arrayList;
    }

    /* renamed from: createBaseCaptureSession */
    public void m3753x4a7b5fbd(android.hardware.camera2.CameraDevice cameraDevice, java.util.List<android.view.Surface> list, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback, android.os.Handler handler) {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.CameraDeviceCompatImpl
    /* renamed from: createCaptureSession */
    public void mo3741xc47ebc8c(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 c0355x6096c1c2) {
        m3750x6c52f173(this.f627x458736e8, c0355x6096c1c2);
        if (c0355x6096c1c2.m3892x189a2742() != null) {
            throw new java.lang.IllegalArgumentException("Reprocessing sessions not supported until API 23");
        }
        if (c0355x6096c1c2.m3895xd87f91ba() == 1) {
            throw new java.lang.IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0303x2f1252f7.StateCallbackExecutorWrapper(c0355x6096c1c2.m3891xf5a03649(), c0355x6096c1c2.m3896xf33fe440());
        m3753x4a7b5fbd(this.f627x458736e8, m3752x939937b8(c0355x6096c1c2.m3893xfeda7614()), stateCallbackExecutorWrapper, ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0331x2ba1ad0e.CameraDeviceCompatParamsApi21) this.f628x81292813).f629xffbc2dfb);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0323x2c84e95d.CameraDeviceCompatImpl
    /* renamed from: unwrap */
    public android.hardware.camera2.CameraDevice mo3742xcdecea63() {
        return this.f627x458736e8;
    }
}
