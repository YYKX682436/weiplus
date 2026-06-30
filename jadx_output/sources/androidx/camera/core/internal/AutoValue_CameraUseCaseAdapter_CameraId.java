package androidx.camera.core.internal;

/* loaded from: classes14.dex */
final class AutoValue_CameraUseCaseAdapter_CameraId extends androidx.camera.core.internal.CameraUseCaseAdapter.CameraId {
    private final androidx.camera.core.impl.Identifier cameraConfigId;
    private final java.lang.String cameraIdString;

    public AutoValue_CameraUseCaseAdapter_CameraId(java.lang.String str, androidx.camera.core.impl.Identifier identifier) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null cameraIdString");
        }
        this.cameraIdString = str;
        if (identifier == null) {
            throw new java.lang.NullPointerException("Null cameraConfigId");
        }
        this.cameraConfigId = identifier;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.internal.CameraUseCaseAdapter.CameraId)) {
            return false;
        }
        androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId = (androidx.camera.core.internal.CameraUseCaseAdapter.CameraId) obj;
        return this.cameraIdString.equals(cameraId.getCameraIdString()) && this.cameraConfigId.equals(cameraId.getCameraConfigId());
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.CameraId
    public androidx.camera.core.impl.Identifier getCameraConfigId() {
        return this.cameraConfigId;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.CameraId
    public java.lang.String getCameraIdString() {
        return this.cameraIdString;
    }

    public int hashCode() {
        return ((this.cameraIdString.hashCode() ^ 1000003) * 1000003) ^ this.cameraConfigId.hashCode();
    }

    public java.lang.String toString() {
        return "CameraId{cameraIdString=" + this.cameraIdString + ", cameraConfigId=" + this.cameraConfigId + "}";
    }
}
