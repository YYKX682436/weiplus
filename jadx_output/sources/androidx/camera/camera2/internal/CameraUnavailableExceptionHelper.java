package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class CameraUnavailableExceptionHelper {
    private CameraUnavailableExceptionHelper() {
    }

    public static androidx.camera.core.CameraUnavailableException createFrom(androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i17 = 1;
        if (reason != 1) {
            i17 = 2;
            if (reason != 2) {
                i17 = 3;
                if (reason != 3) {
                    i17 = 4;
                    if (reason != 4) {
                        i17 = 5;
                        if (reason != 5) {
                            i17 = reason != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new androidx.camera.core.CameraUnavailableException(i17, cameraAccessExceptionCompat);
    }
}
