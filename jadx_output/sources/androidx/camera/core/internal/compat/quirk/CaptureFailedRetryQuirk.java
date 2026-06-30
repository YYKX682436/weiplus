package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes13.dex */
public class CaptureFailedRetryQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> FAILED_RETRY_ALLOW_LIST = new java.util.HashSet(java.util.Collections.singletonList(android.util.Pair.create("SAMSUNG", "SM-G981U1")));

    public static boolean load() {
        java.lang.String str = android.os.Build.BRAND;
        java.util.Locale locale = java.util.Locale.US;
        return FAILED_RETRY_ALLOW_LIST.contains(android.util.Pair.create(str.toUpperCase(locale), android.os.Build.MODEL.toUpperCase(locale)));
    }

    public int getRetryCount() {
        return 1;
    }
}
