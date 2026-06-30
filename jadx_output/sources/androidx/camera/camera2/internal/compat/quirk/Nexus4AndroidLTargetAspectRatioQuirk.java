package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> DEVICE_MODELS = java.util.Arrays.asList("NEXUS 4");

    public static boolean load() {
        "GOOGLE".equalsIgnoreCase(android.os.Build.BRAND);
        return false;
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
