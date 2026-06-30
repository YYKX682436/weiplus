package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class ImageCaptureWithFlashUnderexposureQuirk implements androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk {
    public static final java.util.List<java.lang.String> BUILD_MODELS = java.util.Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return BUILD_MODELS.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US)) && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
