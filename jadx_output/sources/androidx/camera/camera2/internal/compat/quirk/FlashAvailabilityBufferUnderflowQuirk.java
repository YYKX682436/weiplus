package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> KNOWN_AFFECTED_MODELS = new java.util.HashSet();

    static {
        addAffectedDevice("sprd", "lemp");
        addAffectedDevice("sprd", "DM20C");
    }

    private static void addAffectedDevice(java.lang.String str, java.lang.String str2) {
        java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> set = KNOWN_AFFECTED_MODELS;
        java.util.Locale locale = java.util.Locale.US;
        set.add(new android.util.Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    public static boolean load() {
        java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> set = KNOWN_AFFECTED_MODELS;
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.util.Locale locale = java.util.Locale.US;
        return set.contains(new android.util.Pair(str.toLowerCase(locale), android.os.Build.MODEL.toLowerCase(locale)));
    }
}
