package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk */
/* loaded from: classes14.dex */
public class C0379xb0535a4c implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: BUILD_MODELS_FRONT_CAMERA */
    private static final java.util.List<java.lang.String> f711xd897125f = java.util.Arrays.asList("sm-j700f", "sm-j710f");

    /* renamed from: load */
    public static boolean m3981x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        return f711xd897125f.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US)) && ((java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
