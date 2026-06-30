package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk */
/* loaded from: classes13.dex */
public class C0380x45e87f80 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: PROBLEMATIC_UNI_SOC_MODELS */
    private static final java.util.Set<java.lang.String> f712x56ae9024 = new java.util.HashSet(java.util.Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    /* renamed from: isHuaweiPSmart */
    private static boolean m3983xb680a24a() {
        return "HUAWEI".equalsIgnoreCase(android.os.Build.BRAND) && "FIG-LX1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: isUniSocChipsetDevice */
    private static boolean m3984x6accbcb() {
        java.util.Set<java.lang.String> set = f712x56ae9024;
        java.lang.String str = android.os.Build.MODEL;
        java.util.Locale locale = java.util.Locale.US;
        if (!set.contains(str.toLowerCase(locale)) && (android.os.Build.VERSION.SDK_INT < 31 || !"Spreadtrum".equalsIgnoreCase(android.os.Build.SOC_MANUFACTURER))) {
            java.lang.String str2 = android.os.Build.HARDWARE;
            if (!str2.toLowerCase(locale).startsWith("ums") && (!"itel".equalsIgnoreCase(android.os.Build.BRAND) || !str2.toLowerCase(locale).startsWith("sp"))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: load */
    public static boolean m3985x32c4e6() {
        return m3984x6accbcb() || m3983xb680a24a();
    }
}
