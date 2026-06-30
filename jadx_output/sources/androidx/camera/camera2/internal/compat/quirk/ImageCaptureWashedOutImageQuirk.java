package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class ImageCaptureWashedOutImageQuirk implements androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk {
    public static final java.util.List<java.lang.String> BUILD_MODELS = java.util.Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return BUILD_MODELS.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US)) && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
