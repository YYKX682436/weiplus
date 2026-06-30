package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk */
/* loaded from: classes14.dex */
public class C0385x1a7606fe implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0405x67332af5 {

    /* renamed from: BUILD_MODELS */
    public static final java.util.List<java.lang.String> f717xda1c797b = java.util.Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    /* renamed from: load */
    public static boolean m4002x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return f717xda1c797b.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US)) && ((java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
