package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* renamed from: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
/* loaded from: classes14.dex */
public class C0302x1aaa9468 extends java.lang.Exception {

    /* renamed from: CAMERA_CHARACTERISTICS_CREATION_ERROR */
    public static final int f597x53bed9e9 = 10002;

    /* renamed from: CAMERA_DEPRECATED_HAL */
    public static final int f598xa4a46e41 = 1000;

    /* renamed from: CAMERA_DISABLED */
    public static final int f599xaa1fde56 = 1;

    /* renamed from: CAMERA_DISCONNECTED */
    public static final int f600xa80acd15 = 2;

    /* renamed from: CAMERA_ERROR */
    public static final int f601x9cbd444e = 3;

    /* renamed from: CAMERA_IN_USE */
    public static final int f602x18c49a7 = 4;

    /* renamed from: CAMERA_UNAVAILABLE_DO_NOT_DISTURB */
    public static final int f603xe5af47e8 = 10001;

    /* renamed from: MAX_CAMERAS_IN_USE */
    public static final int f605x5157c739 = 5;

    /* renamed from: mCameraAccessException */
    private final android.hardware.camera2.CameraAccessException f607xb90776f9;

    /* renamed from: mReason */
    private final int f608x17b1b911;

    /* renamed from: PLATFORM_ERRORS */
    static final java.util.Set<java.lang.Integer> f606x29a930b7 = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: COMPAT_ERRORS */
    static final java.util.Set<java.lang.Integer> f604xc2f522c8 = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(10001, 10002)));

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat$AccessError */
    /* loaded from: classes6.dex */
    public @interface AccessError {
    }

    public C0302x1aaa9468(int i17) {
        super(m3697x9ef7337c(i17));
        this.f608x17b1b911 = i17;
        this.f607xb90776f9 = f606x29a930b7.contains(java.lang.Integer.valueOf(i17)) ? new android.hardware.camera2.CameraAccessException(i17) : null;
    }

    /* renamed from: getCombinedMessage */
    private static java.lang.String m3696xcba63f0c(int i17, java.lang.String str) {
        return java.lang.String.format("%s (%d): %s", m3698x3a0c17da(i17), java.lang.Integer.valueOf(i17), str);
    }

    /* renamed from: getDefaultMessage */
    private static java.lang.String m3697x9ef7337c(int i17) {
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

    /* renamed from: getProblemString */
    private static java.lang.String m3698x3a0c17da(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 1000 ? i17 != 10001 ? i17 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    /* renamed from: toCameraAccessExceptionCompat */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 m3699x3d80510d(android.hardware.camera2.CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468(cameraAccessException);
        }
        throw new java.lang.NullPointerException("cameraAccessException should not be null");
    }

    /* renamed from: getReason */
    public final int m3700x2d5cb53a() {
        return this.f608x17b1b911;
    }

    /* renamed from: toCameraAccessException */
    public android.hardware.camera2.CameraAccessException m3701x648c5dab() {
        return this.f607xb90776f9;
    }

    public C0302x1aaa9468(int i17, java.lang.String str) {
        super(m3696xcba63f0c(i17, str));
        this.f608x17b1b911 = i17;
        this.f607xb90776f9 = f606x29a930b7.contains(java.lang.Integer.valueOf(i17)) ? new android.hardware.camera2.CameraAccessException(i17, str) : null;
    }

    public C0302x1aaa9468(int i17, java.lang.String str, java.lang.Throwable th6) {
        super(m3696xcba63f0c(i17, str), th6);
        this.f608x17b1b911 = i17;
        this.f607xb90776f9 = f606x29a930b7.contains(java.lang.Integer.valueOf(i17)) ? new android.hardware.camera2.CameraAccessException(i17, str, th6) : null;
    }

    public C0302x1aaa9468(int i17, java.lang.Throwable th6) {
        super(m3697x9ef7337c(i17), th6);
        this.f608x17b1b911 = i17;
        this.f607xb90776f9 = f606x29a930b7.contains(java.lang.Integer.valueOf(i17)) ? new android.hardware.camera2.CameraAccessException(i17, null, th6) : null;
    }

    private C0302x1aaa9468(android.hardware.camera2.CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f608x17b1b911 = cameraAccessException.getReason();
        this.f607xb90776f9 = cameraAccessException;
    }
}
