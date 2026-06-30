package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public final class FlashAvailabilityChecker {
    private static final java.lang.String TAG = "FlashAvailability";

    private FlashAvailabilityChecker() {
    }

    public static boolean isFlashAvailable(androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider cameraCharacteristicsProvider) {
        return isFlashAvailable(false, cameraCharacteristicsProvider);
    }

    public static boolean isFlashAvailable(boolean z17, androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider cameraCharacteristicsProvider) {
        java.lang.Boolean bool;
        try {
            bool = (java.lang.Boolean) cameraCharacteristicsProvider.get(android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (java.nio.BufferUnderflowException e17) {
            if (androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                androidx.camera.core.Logger.d(TAG, java.lang.String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", android.os.Build.MANUFACTURER, android.os.Build.MODEL, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)));
            } else {
                androidx.camera.core.Logger.e(TAG, java.lang.String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", android.os.Build.MANUFACTURER, android.os.Build.MODEL, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)), e17);
            }
            if (!z17) {
                bool = java.lang.Boolean.FALSE;
            } else {
                throw e17;
            }
        }
        if (bool == null) {
            androidx.camera.core.Logger.w(TAG, "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
