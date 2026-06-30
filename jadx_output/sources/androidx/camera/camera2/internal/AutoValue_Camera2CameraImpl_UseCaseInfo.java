package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_Camera2CameraImpl_UseCaseInfo extends androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo {
    private final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> captureTypes;
    private final androidx.camera.core.impl.SessionConfig sessionConfig;
    private final androidx.camera.core.impl.StreamSpec streamSpec;
    private final android.util.Size surfaceResolution;
    private final androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig;
    private final java.lang.String useCaseId;
    private final java.lang.Class<?> useCaseType;

    public AutoValue_Camera2CameraImpl_UseCaseInfo(java.lang.String str, java.lang.Class<?> cls, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, android.util.Size size, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null useCaseId");
        }
        this.useCaseId = str;
        if (cls == null) {
            throw new java.lang.NullPointerException("Null useCaseType");
        }
        this.useCaseType = cls;
        if (sessionConfig == null) {
            throw new java.lang.NullPointerException("Null sessionConfig");
        }
        this.sessionConfig = sessionConfig;
        if (useCaseConfig == null) {
            throw new java.lang.NullPointerException("Null useCaseConfig");
        }
        this.useCaseConfig = useCaseConfig;
        this.surfaceResolution = size;
        this.streamSpec = streamSpec;
        this.captureTypes = list;
    }

    public boolean equals(java.lang.Object obj) {
        android.util.Size size;
        androidx.camera.core.impl.StreamSpec streamSpec;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo)) {
            return false;
        }
        androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo useCaseInfo = (androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo) obj;
        if (this.useCaseId.equals(useCaseInfo.getUseCaseId()) && this.useCaseType.equals(useCaseInfo.getUseCaseType()) && this.sessionConfig.equals(useCaseInfo.getSessionConfig()) && this.useCaseConfig.equals(useCaseInfo.getUseCaseConfig()) && ((size = this.surfaceResolution) != null ? size.equals(useCaseInfo.getSurfaceResolution()) : useCaseInfo.getSurfaceResolution() == null) && ((streamSpec = this.streamSpec) != null ? streamSpec.equals(useCaseInfo.getStreamSpec()) : useCaseInfo.getStreamSpec() == null)) {
            java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list = this.captureTypes;
            if (list == null) {
                if (useCaseInfo.getCaptureTypes() == null) {
                    return true;
                }
            } else if (list.equals(useCaseInfo.getCaptureTypes())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes() {
        return this.captureTypes;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        return this.sessionConfig;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public androidx.camera.core.impl.StreamSpec getStreamSpec() {
        return this.streamSpec;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public android.util.Size getSurfaceResolution() {
        return this.surfaceResolution;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public androidx.camera.core.impl.UseCaseConfig<?> getUseCaseConfig() {
        return this.useCaseConfig;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public java.lang.String getUseCaseId() {
        return this.useCaseId;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    public java.lang.Class<?> getUseCaseType() {
        return this.useCaseType;
    }

    public int hashCode() {
        int hashCode = (((((((this.useCaseId.hashCode() ^ 1000003) * 1000003) ^ this.useCaseType.hashCode()) * 1000003) ^ this.sessionConfig.hashCode()) * 1000003) ^ this.useCaseConfig.hashCode()) * 1000003;
        android.util.Size size = this.surfaceResolution;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        androidx.camera.core.impl.StreamSpec streamSpec = this.streamSpec;
        int hashCode3 = (hashCode2 ^ (streamSpec == null ? 0 : streamSpec.hashCode())) * 1000003;
        java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list = this.captureTypes;
        return hashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "UseCaseInfo{useCaseId=" + this.useCaseId + ", useCaseType=" + this.useCaseType + ", sessionConfig=" + this.sessionConfig + ", useCaseConfig=" + this.useCaseConfig + ", surfaceResolution=" + this.surfaceResolution + ", streamSpec=" + this.streamSpec + ", captureTypes=" + this.captureTypes + "}";
    }
}
