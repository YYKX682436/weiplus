package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk */
/* loaded from: classes13.dex */
public class C0400x636939cb implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {
    /* renamed from: load */
    public static boolean m4046x32c4e6() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.util.Locale locale = java.util.Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && android.os.Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
