package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes13.dex */
public class LowMemoryQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> DEVICE_MODELS = new java.util.HashSet(java.util.Arrays.asList("SM-A520W", "MOTOG3"));

    public static boolean load() {
        return DEVICE_MODELS.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }
}
