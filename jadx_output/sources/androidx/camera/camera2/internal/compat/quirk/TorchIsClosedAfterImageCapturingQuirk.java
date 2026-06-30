package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class TorchIsClosedAfterImageCapturingQuirk implements androidx.camera.core.impl.Quirk {
    public static final java.util.List<java.lang.String> BUILD_MODELS = java.util.Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro");

    public static boolean load() {
        return BUILD_MODELS.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US));
    }
}
