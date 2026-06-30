package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection */
/* loaded from: classes14.dex */
public class C0419xdf392b6b {

    /* renamed from: mCameraQuirks */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 f742x5c91e907;

    public C0419xdf392b6b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 c0744x90dabc95) {
        this.f742x5c91e907 = c0744x90dabc95;
    }

    /* renamed from: getCorrectedPoint */
    public android.graphics.PointF m4084xc4ae1d7d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 c0548xb03aad37, int i17) {
        return (i17 == 1 && this.f742x5c91e907.m5568xde2d761f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0357x880b0a87.class)) ? new android.graphics.PointF(1.0f - c0548xb03aad37.m4693x305bc2(), c0548xb03aad37.m4694x305bc3()) : new android.graphics.PointF(c0548xb03aad37.m4693x305bc2(), c0548xb03aad37.m4694x305bc3());
    }
}
