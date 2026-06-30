package androidx.camera.core;

/* loaded from: classes14.dex */
public class CameraUnavailableException extends java.lang.Exception {
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_MAX_IN_USE = 5;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 6;
    public static final int CAMERA_UNKNOWN_ERROR = 0;
    private final int mReason;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Reason {
    }

    public CameraUnavailableException(int i17) {
        this.mReason = i17;
    }

    public int getReason() {
        return this.mReason;
    }

    public CameraUnavailableException(int i17, java.lang.String str) {
        super(str);
        this.mReason = i17;
    }

    public CameraUnavailableException(int i17, java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
        this.mReason = i17;
    }

    public CameraUnavailableException(int i17, java.lang.Throwable th6) {
        super(th6);
        this.mReason = i17;
    }
}
