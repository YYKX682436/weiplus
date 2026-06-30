package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk */
/* loaded from: classes14.dex */
public class C0382x2d924b5a implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.InterfaceC0405x67332af5 {

    /* renamed from: BUILD_MODELS */
    private static final java.util.List<java.lang.String> f713xda1c797b = java.util.Arrays.asList("itel w6004");

    /* renamed from: BUILD_MODELS_FRONT_CAMERA */
    private static final java.util.List<java.lang.String> f714xd897125f = java.util.Arrays.asList("sm-j700f", "sm-j710f");

    /* renamed from: load */
    public static boolean m3996x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        java.util.List<java.lang.String> list = f714xd897125f;
        java.lang.String str = android.os.Build.MODEL;
        java.util.Locale locale = java.util.Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0) || f713xda1c797b.contains(str.toLowerCase(locale));
    }
}
