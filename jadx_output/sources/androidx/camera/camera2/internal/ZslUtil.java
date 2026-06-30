package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
final class ZslUtil {
    private ZslUtil() {
    }

    public static boolean isCapabilitySupported(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, int i17) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i18 : iArr) {
                if (i18 == i17) {
                    return true;
                }
            }
        }
        return false;
    }
}
