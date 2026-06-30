package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class ZslDisablerQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> AFFECTED_SAMSUNG_MODEL = java.util.Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");
    private static final java.util.List<java.lang.String> AFFECTED_XIAOMI_MODEL = java.util.Arrays.asList("MI 8");

    private static boolean isAffectedModel(java.util.List<java.lang.String> list) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (android.os.Build.MODEL.toUpperCase(java.util.Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAffectedSamsungDevices() {
        return "samsung".equalsIgnoreCase(android.os.Build.BRAND) && isAffectedModel(AFFECTED_SAMSUNG_MODEL);
    }

    private static boolean isAffectedXiaoMiDevices() {
        return "xiaomi".equalsIgnoreCase(android.os.Build.BRAND) && isAffectedModel(AFFECTED_XIAOMI_MODEL);
    }

    public static boolean load() {
        return isAffectedSamsungDevices() || isAffectedXiaoMiDevices();
    }
}
