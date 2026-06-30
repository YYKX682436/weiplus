package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class CameraNoResponseWhenEnablingFlashQuirk implements androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk {
    public static final java.util.List<java.lang.String> AFFECTED_MODELS = java.util.Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return AFFECTED_MODELS.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US)) && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
