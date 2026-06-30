package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk */
/* loaded from: classes13.dex */
public class C0383x38b27749 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: BUILD_MODELS */
    public static final java.util.List<java.lang.String> f715xda1c797b = java.util.Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    /* renamed from: load */
    public static boolean m3998x32c4e6() {
        return f715xda1c797b.contains(android.os.Build.MODEL) && "Google".equals(android.os.Build.MANUFACTURER) && android.os.Build.VERSION.SDK_INT >= 26;
    }
}
