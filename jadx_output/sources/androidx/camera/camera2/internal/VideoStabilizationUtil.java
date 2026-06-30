package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class VideoStabilizationUtil {
    private VideoStabilizationUtil() {
    }

    public static boolean isPreviewStabilizationSupported(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        int[] iArr;
        if (android.os.Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i17 : iArr) {
                if (i17 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
