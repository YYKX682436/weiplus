package androidx.camera.core;

/* loaded from: classes14.dex */
public abstract class CameraState {
    public static final int ERROR_CAMERA_DISABLED = 5;
    public static final int ERROR_CAMERA_FATAL_ERROR = 6;
    public static final int ERROR_CAMERA_IN_USE = 2;
    public static final int ERROR_DO_NOT_DISTURB_MODE_ENABLED = 7;
    public static final int ERROR_MAX_CAMERAS_IN_USE = 1;
    public static final int ERROR_OTHER_RECOVERABLE_ERROR = 3;
    public static final int ERROR_STREAM_CONFIG = 4;

    /* loaded from: classes6.dex */
    public enum ErrorType {
        RECOVERABLE,
        CRITICAL
    }

    /* loaded from: classes14.dex */
    public static abstract class StateError {
        public static androidx.camera.core.CameraState.StateError create(int i17) {
            return create(i17, null);
        }

        public abstract java.lang.Throwable getCause();

        public abstract int getCode();

        public androidx.camera.core.CameraState.ErrorType getType() {
            int code = getCode();
            return (code == 2 || code == 1 || code == 3) ? androidx.camera.core.CameraState.ErrorType.RECOVERABLE : androidx.camera.core.CameraState.ErrorType.CRITICAL;
        }

        public static androidx.camera.core.CameraState.StateError create(int i17, java.lang.Throwable th6) {
            return new androidx.camera.core.AutoValue_CameraState_StateError(i17, th6);
        }
    }

    /* loaded from: classes14.dex */
    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static androidx.camera.core.CameraState create(androidx.camera.core.CameraState.Type type) {
        return create(type, null);
    }

    public abstract androidx.camera.core.CameraState.StateError getError();

    public abstract androidx.camera.core.CameraState.Type getType();

    public static androidx.camera.core.CameraState create(androidx.camera.core.CameraState.Type type, androidx.camera.core.CameraState.StateError stateError) {
        return new androidx.camera.core.AutoValue_CameraState(type, stateError);
    }
}
