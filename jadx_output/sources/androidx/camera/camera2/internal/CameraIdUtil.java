package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class CameraIdUtil {
    private CameraIdUtil() {
    }

    public static boolean isBackwardCompatible(androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat, java.lang.String str) {
        if ("robolectric".equals(android.os.Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) cameraManagerCompat.getCameraCharacteristicsCompat(str).get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i17 : iArr) {
                    if (i17 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
            throw new androidx.camera.core.InitializationException(androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(e17));
        }
    }
}
