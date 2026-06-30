package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class CameraValidator {
    private static final androidx.camera.core.CameraSelector EXTERNAL_LENS_FACING = new androidx.camera.core.CameraSelector.Builder().requireLensFacing(2).build();
    private static final java.lang.String TAG = "CameraValidator";

    /* loaded from: classes13.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static int getDeviceId(android.content.Context context) {
            return context.getDeviceId();
        }
    }

    /* loaded from: classes14.dex */
    public static class CameraIdListIncorrectException extends java.lang.Exception {
        private int mAvailableCameraCount;

        public CameraIdListIncorrectException(java.lang.String str, int i17, java.lang.Throwable th6) {
            super(str, th6);
            this.mAvailableCameraCount = i17;
        }

        public int getAvailableCameraCount() {
            return this.mAvailableCameraCount;
        }
    }

    private CameraValidator() {
    }

    public static void validateCameras(android.content.Context context, androidx.camera.core.impl.CameraRepository cameraRepository, androidx.camera.core.CameraSelector cameraSelector) {
        java.lang.Integer lensFacing;
        int i17 = 0;
        java.lang.IllegalArgumentException illegalArgumentException = null;
        if (android.os.Build.VERSION.SDK_INT >= 34 && androidx.camera.core.impl.CameraValidator.Api34Impl.getDeviceId(context) != 0) {
            java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameras = cameraRepository.getCameras();
            if (cameras.isEmpty()) {
                throw new androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException("No cameras available", 0, null);
            }
            androidx.camera.core.Logger.d(TAG, "Virtual device with ID: " + androidx.camera.core.impl.CameraValidator.Api34Impl.getDeviceId(context) + " has " + cameras.size() + " cameras. Skipping validation.");
            return;
        }
        if (cameraSelector != null) {
            try {
                lensFacing = cameraSelector.getLensFacing();
                if (lensFacing == null) {
                    androidx.camera.core.Logger.w(TAG, "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (java.lang.IllegalStateException e17) {
                androidx.camera.core.Logger.e(TAG, "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e17);
                return;
            }
        } else {
            lensFacing = null;
        }
        androidx.camera.core.Logger.d(TAG, "Verifying camera lens facing on " + android.os.Build.DEVICE + ", lensFacingInteger: " + lensFacing);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (cameraSelector == null || lensFacing.intValue() == 1)) {
                androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras());
                i17 = 1;
            }
        } catch (java.lang.IllegalArgumentException e18) {
            illegalArgumentException = e18;
            androidx.camera.core.Logger.w(TAG, "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (cameraSelector == null || lensFacing.intValue() == 0)) {
                androidx.camera.core.CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras());
                i17++;
            }
        } catch (java.lang.IllegalArgumentException e19) {
            illegalArgumentException = e19;
            androidx.camera.core.Logger.w(TAG, "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            EXTERNAL_LENS_FACING.select(cameraRepository.getCameras());
            androidx.camera.core.Logger.d(TAG, "Found a LENS_FACING_EXTERNAL camera");
            i17++;
        } catch (java.lang.IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        androidx.camera.core.Logger.e(TAG, "Camera LensFacing verification failed, existing cameras: " + cameraRepository.getCameras());
        throw new androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException("Expected camera missing from device.", i17, illegalArgumentException);
    }
}
