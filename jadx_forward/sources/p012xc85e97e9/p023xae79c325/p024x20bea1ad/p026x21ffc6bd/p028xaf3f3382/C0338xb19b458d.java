package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompatApi30Impl */
/* loaded from: classes14.dex */
public class C0338xb19b458d extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0337xb0654077 {
    public C0338xb19b458d(android.content.Context context) {
        super(context);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0339x9987b8fb, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a.CameraManagerCompatImpl
    /* renamed from: getConcurrentCameraIds */
    public java.util.Set<java.util.Set<java.lang.String>> mo3772xf4d0e226() {
        try {
            return this.f636x4030095b.getConcurrentCameraIds();
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468.m3699x3d80510d(e17);
        }
    }
}
