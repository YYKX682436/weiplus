package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> PROBLEMATIC_UNI_SOC_MODELS = new java.util.HashSet(java.util.Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    private static boolean isHuaweiPSmart() {
        return "HUAWEI".equalsIgnoreCase(android.os.Build.BRAND) && "FIG-LX1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isUniSocChipsetDevice() {
        java.util.Set<java.lang.String> set = PROBLEMATIC_UNI_SOC_MODELS;
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

    public static boolean load() {
        return isUniSocChipsetDevice() || isHuaweiPSmart();
    }
}
