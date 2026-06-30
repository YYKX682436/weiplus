package androidx.camera.core;

/* loaded from: classes14.dex */
final class AutoValue_CameraState_StateError extends androidx.camera.core.CameraState.StateError {
    private final java.lang.Throwable cause;
    private final int code;

    public AutoValue_CameraState_StateError(int i17, java.lang.Throwable th6) {
        this.code = i17;
        this.cause = th6;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.CameraState.StateError)) {
            return false;
        }
        androidx.camera.core.CameraState.StateError stateError = (androidx.camera.core.CameraState.StateError) obj;
        if (this.code == stateError.getCode()) {
            java.lang.Throwable th6 = this.cause;
            if (th6 == null) {
                if (stateError.getCause() == null) {
                    return true;
                }
            } else if (th6.equals(stateError.getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public java.lang.Throwable getCause() {
        return this.cause;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
        return this.code;
    }

    public int hashCode() {
        int i17 = (this.code ^ 1000003) * 1000003;
        java.lang.Throwable th6 = this.cause;
        return i17 ^ (th6 == null ? 0 : th6.hashCode());
    }

    public java.lang.String toString() {
        return "StateError{code=" + this.code + ", cause=" + this.cause + "}";
    }
}
