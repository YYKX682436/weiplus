package androidx.camera.core.internal.compat;

/* loaded from: classes14.dex */
class MediaActionSoundCompatBaseImpl {
    private static final int SAMPLE_CAMERA_ID = 0;

    private MediaActionSoundCompatBaseImpl() {
    }

    public static boolean mustPlayShutterSound() {
        if (android.hardware.Camera.getNumberOfCameras() < 1) {
            return false;
        }
        try {
            android.hardware.Camera.getCameraInfo(0, new android.hardware.Camera.CameraInfo());
            return !r0.canDisableShutterSound;
        } catch (java.lang.RuntimeException unused) {
            return false;
        }
    }
}
