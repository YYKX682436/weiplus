package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> BUILD_MODELS_FRONT_CAMERA = java.util.Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return BUILD_MODELS_FRONT_CAMERA.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.US)) && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
