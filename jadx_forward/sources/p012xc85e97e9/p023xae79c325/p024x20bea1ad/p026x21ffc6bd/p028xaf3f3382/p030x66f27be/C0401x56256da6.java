package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk */
/* loaded from: classes14.dex */
public class C0401x56256da6 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0363xc472cf58 {
    /* renamed from: isPixel8 */
    private static boolean m4047xed4b703c() {
        return "Pixel 8".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: load */
    public static boolean m4048x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return m4047xed4b703c() && ((java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
