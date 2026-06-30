package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class ImageCaptureFlashNotFireQuirk implements androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk {
    private static final java.util.List<java.lang.String> BUILD_MODELS = java.util.Arrays.asList("itel w6004");
    private static final java.util.List<java.lang.String> BUILD_MODELS_FRONT_CAMERA = java.util.Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        java.util.List<java.lang.String> list = BUILD_MODELS_FRONT_CAMERA;
        java.lang.String str = android.os.Build.MODEL;
        java.util.Locale locale = java.util.Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0) || BUILD_MODELS.contains(str.toLowerCase(locale));
    }
}
