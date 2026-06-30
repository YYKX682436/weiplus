package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class InvalidVideoProfilesQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> AFFECTED_PIXEL_MODELS = java.util.Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");
    private static final java.util.List<java.lang.String> AFFECTED_ONE_PLUS_MODELS = java.util.Arrays.asList("cph2417", "cph2451");
    private static final java.util.List<java.lang.String> AFFECTED_OPPO_MODELS = java.util.Arrays.asList("cph2437", "cph2525", "pht110");

    private static boolean isAPI33() {
        return android.os.Build.VERSION.SDK_INT == 33;
    }

    private static boolean isAffectedOnePlusDevices() {
        return isAffectedOnePlusModel() && isAPI33();
    }

    private static boolean isAffectedOnePlusModel() {
        return AFFECTED_ONE_PLUS_MODELS.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.ROOT));
    }

    private static boolean isAffectedOppoDevices() {
        return isAffectedOppoModel() && isAPI33();
    }

    private static boolean isAffectedOppoModel() {
        return AFFECTED_OPPO_MODELS.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.ROOT));
    }

    private static boolean isAffectedPixelBuild() {
        return isTp1aBuild() || isTd1aBuild();
    }

    private static boolean isAffectedPixelDevices() {
        return isAffectedPixelModel() && isAffectedPixelBuild();
    }

    private static boolean isAffectedPixelModel() {
        return AFFECTED_PIXEL_MODELS.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.ROOT));
    }

    private static boolean isAffectedSamsungDevices() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && isTp1aBuild();
    }

    private static boolean isAffectedXiaomiDevices() {
        java.lang.String str = android.os.Build.BRAND;
        return ("redmi".equalsIgnoreCase(str) || "xiaomi".equalsIgnoreCase(str)) && (isTkq1Build() || isTp1aBuild());
    }

    private static boolean isTd1aBuild() {
        return android.os.Build.ID.toLowerCase(java.util.Locale.ROOT).startsWith("td1a");
    }

    private static boolean isTkq1Build() {
        return android.os.Build.ID.toLowerCase(java.util.Locale.ROOT).startsWith("tkq1");
    }

    private static boolean isTp1aBuild() {
        return android.os.Build.ID.toLowerCase(java.util.Locale.ROOT).startsWith("tp1a");
    }

    public static boolean load() {
        return isAffectedSamsungDevices() || isAffectedPixelDevices() || isAffectedXiaomiDevices() || isAffectedOnePlusDevices() || isAffectedOppoDevices();
    }
}
