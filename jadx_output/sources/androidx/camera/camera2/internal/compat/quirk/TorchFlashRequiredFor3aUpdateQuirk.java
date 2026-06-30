package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> AFFECTED_PIXEL_MODELS = java.util.Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;

    public TorchFlashRequiredFor3aUpdateQuirk(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
    }

    private static boolean isAffectedModel(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isAffectedPixelModel() && isFrontCamera(cameraCharacteristicsCompat);
    }

    private static boolean isAffectedPixelModel() {
        java.util.Iterator<java.lang.String> it = AFFECTED_PIXEL_MODELS.iterator();
        while (it.hasNext()) {
            if (android.os.Build.MODEL.toUpperCase(java.util.Locale.US).equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isExternalFlashAeModeSupported(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return android.os.Build.VERSION.SDK_INT >= 28 && androidx.camera.camera2.internal.Camera2CameraControlImpl.getSupportedAeMode(cameraCharacteristicsCompat, 5) == 5;
    }

    private static boolean isFrontCamera(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return ((java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isAffectedModel(cameraCharacteristicsCompat);
    }

    public boolean isFlashModeTorchRequired() {
        return !isExternalFlashAeModeSupported(this.mCameraCharacteristics);
    }
}
