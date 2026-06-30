package androidx.camera.lifecycle;

/* loaded from: classes14.dex */
final class AutoValue_LifecycleCameraRepository_Key extends androidx.camera.lifecycle.LifecycleCameraRepository.Key {
    private final androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId;
    private final androidx.lifecycle.y lifecycleOwner;

    public AutoValue_LifecycleCameraRepository_Key(androidx.lifecycle.y yVar, androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId) {
        if (yVar == null) {
            throw new java.lang.NullPointerException("Null lifecycleOwner");
        }
        this.lifecycleOwner = yVar;
        if (cameraId == null) {
            throw new java.lang.NullPointerException("Null cameraId");
        }
        this.cameraId = cameraId;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.lifecycle.LifecycleCameraRepository.Key)) {
            return false;
        }
        androidx.camera.lifecycle.LifecycleCameraRepository.Key key = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) obj;
        return this.lifecycleOwner.equals(key.getLifecycleOwner()) && this.cameraId.equals(key.getCameraId());
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public androidx.camera.core.internal.CameraUseCaseAdapter.CameraId getCameraId() {
        return this.cameraId;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public androidx.lifecycle.y getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public int hashCode() {
        return ((this.lifecycleOwner.hashCode() ^ 1000003) * 1000003) ^ this.cameraId.hashCode();
    }

    public java.lang.String toString() {
        return "Key{lifecycleOwner=" + this.lifecycleOwner + ", cameraId=" + this.cameraId + "}";
    }
}
