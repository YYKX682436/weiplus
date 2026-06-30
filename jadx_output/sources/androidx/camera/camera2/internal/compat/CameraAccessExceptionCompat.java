package androidx.camera.camera2.internal.compat;

/* loaded from: classes14.dex */
public class CameraAccessExceptionCompat extends java.lang.Exception {
    public static final int CAMERA_CHARACTERISTICS_CREATION_ERROR = 10002;
    public static final int CAMERA_DEPRECATED_HAL = 1000;
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 10001;
    public static final int MAX_CAMERAS_IN_USE = 5;
    private final android.hardware.camera2.CameraAccessException mCameraAccessException;
    private final int mReason;
    static final java.util.Set<java.lang.Integer> PLATFORM_ERRORS = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(4, 5, 1, 2, 3)));
    static final java.util.Set<java.lang.Integer> COMPAT_ERRORS = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(10001, 10002)));

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface AccessError {
    }

    public CameraAccessExceptionCompat(int i17) {
        super(getDefaultMessage(i17));
        this.mReason = i17;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(java.lang.Integer.valueOf(i17)) ? new android.hardware.camera2.CameraAccessException(i17) : null;
    }

    private static java.lang.String getCombinedMessage(int i17, java.lang.String str) {
        return java.lang.String.format("%s (%d): %s", getProblemString(i17), java.lang.Integer.valueOf(i17), str);
    }

    private static java.lang.String getDefaultMessage(int i17) {
        if (i17 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i17 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i17 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i17 == 4) {
            return "The camera device is in use already";
        }
        if (i17 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i17 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i17 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    private static java.lang.String getProblemString(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 1000 ? i17 != 10001 ? i17 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    public static androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat toCameraAccessExceptionCompat(android.hardware.camera2.CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat(cameraAccessException);
        }
        throw new java.lang.NullPointerException("cameraAccessException should not be null");
    }

    public final int getReason() {
        return this.mReason;
    }

    public android.hardware.camera2.CameraAccessException toCameraAccessException() {
        return this.mCameraAccessException;
    }

    public CameraAccessExceptionCompat(int i17, java.lang.String str) {
        super(getCombinedMessage(i17, str));
        this.mReason = i17;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(java.lang.Integer.valueOf(i17)) ? new android.hardware.camera2.CameraAccessException(i17, str) : null;
    }

    public CameraAccessExceptionCompat(int i17, java.lang.String str, java.lang.Throwable th6) {
        super(getCombinedMessage(i17, str), th6);
        this.mReason = i17;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(java.lang.Integer.valueOf(i17)) ? new android.hardware.camera2.CameraAccessException(i17, str, th6) : null;
    }

    public CameraAccessExceptionCompat(int i17, java.lang.Throwable th6) {
        super(getDefaultMessage(i17), th6);
        this.mReason = i17;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(java.lang.Integer.valueOf(i17)) ? new android.hardware.camera2.CameraAccessException(i17, null, th6) : null;
    }

    private CameraAccessExceptionCompat(android.hardware.camera2.CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }
}
