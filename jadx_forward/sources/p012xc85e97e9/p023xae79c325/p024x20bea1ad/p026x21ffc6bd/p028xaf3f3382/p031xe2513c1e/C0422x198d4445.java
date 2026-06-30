package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.PreviewPixelHDRnet */
/* loaded from: classes14.dex */
public class C0422x198d4445 {

    /* renamed from: ASPECT_RATIO_16_9 */
    public static final android.util.Rational f748x62c8deba = new android.util.Rational(16, 9);

    private C0422x198d4445() {
    }

    /* renamed from: isAspectRatioMatch */
    private static boolean m4095xcf8c083c(android.util.Size size, android.util.Rational rational) {
        return rational.equals(new android.util.Rational(size.getWidth(), size.getHeight()));
    }

    /* renamed from: setHDRnet */
    public static void m4096xda985e9(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder) {
        if (((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0396x5a87d679) p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0370xcf1a968b.get(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0396x5a87d679.class)) == null || m4095xcf8c083c(size, f748x62c8deba)) {
            return;
        }
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
        builder2.m2892xea2ad5c0(android.hardware.camera2.CaptureRequest.TONEMAP_MODE, 2);
        builder.m5610x2f697c6b(builder2.mo2888x59bc66e());
    }
}
