package androidx.camera.core;

/* loaded from: classes14.dex */
final class AutoValue_CameraState extends androidx.camera.core.CameraState {
    private final androidx.camera.core.CameraState.StateError error;
    private final androidx.camera.core.CameraState.Type type;

    public AutoValue_CameraState(androidx.camera.core.CameraState.Type type, androidx.camera.core.CameraState.StateError stateError) {
        if (type == null) {
            throw new java.lang.NullPointerException("Null type");
        }
        this.type = type;
        this.error = stateError;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.CameraState)) {
            return false;
        }
        androidx.camera.core.CameraState cameraState = (androidx.camera.core.CameraState) obj;
        if (this.type.equals(cameraState.getType())) {
            androidx.camera.core.CameraState.StateError stateError = this.error;
            if (stateError == null) {
                if (cameraState.getError() == null) {
                    return true;
                }
            } else if (stateError.equals(cameraState.getError())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState
    public androidx.camera.core.CameraState.StateError getError() {
        return this.error;
    }

    @Override // androidx.camera.core.CameraState
    public androidx.camera.core.CameraState.Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        androidx.camera.core.CameraState.StateError stateError = this.error;
        return hashCode ^ (stateError == null ? 0 : stateError.hashCode());
    }

    public java.lang.String toString() {
        return "CameraState{type=" + this.type + ", error=" + this.error + "}";
    }
}
