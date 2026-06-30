package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class FlashTooSlowQuirk implements androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk {
    private static final java.util.List<java.lang.String> AFFECTED_MODEL_PREFIXES = java.util.Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320", "MOTO G(20)", "ITEL L6006", "RMX3231");

    private static boolean isAffectedModel() {
        java.util.Iterator<java.lang.String> it = AFFECTED_MODEL_PREFIXES.iterator();
        while (it.hasNext()) {
            if (android.os.Build.MODEL.toUpperCase(java.util.Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isAffectedModel() && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
