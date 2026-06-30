package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk */
/* loaded from: classes14.dex */
public class C0384xf7ed7aa8 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0405x67332af5 {

    /* renamed from: BUILD_MODELS */
    public static final java.util.List<java.lang.String> f716xda1c797b = java.util.Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    /* renamed from: load */
    public static boolean m4000x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return f716xda1c797b.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US)) && ((java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
