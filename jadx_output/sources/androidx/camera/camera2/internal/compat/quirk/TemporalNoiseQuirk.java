package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class TemporalNoiseQuirk implements androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk {
    private static boolean isPixel8() {
        return "Pixel 8".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isPixel8() && ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
