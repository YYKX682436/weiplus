package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class CrashWhenTakingPhotoWithAutoFlashAEModeQuirk implements androidx.camera.core.impl.Quirk {
    static final java.util.List<java.lang.String> AFFECTED_MODELS = java.util.Arrays.asList("SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X");

    public static boolean load() {
        return AFFECTED_MODELS.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }
}
