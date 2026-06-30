package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
final class AutoValue_SurfaceOutputConfig extends androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig {

    /* renamed from: id, reason: collision with root package name */
    private final int f10358id;
    private final java.lang.String physicalCameraId;
    private final android.view.Surface surface;
    private final int surfaceGroupId;
    private final java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> surfaceSharingOutputConfigs;

    public AutoValue_SurfaceOutputConfig(int i17, int i18, java.lang.String str, java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> list, android.view.Surface surface) {
        this.f10358id = i17;
        this.surfaceGroupId = i18;
        this.physicalCameraId = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.surfaceSharingOutputConfigs = list;
        if (surface == null) {
            throw new java.lang.NullPointerException("Null surface");
        }
        this.surface = surface;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig)) {
            return false;
        }
        androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig surfaceOutputConfig = (androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig) obj;
        return this.f10358id == surfaceOutputConfig.getId() && this.surfaceGroupId == surfaceOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(surfaceOutputConfig.getPhysicalCameraId()) : surfaceOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(surfaceOutputConfig.getSurfaceSharingOutputConfigs()) && this.surface.equals(surfaceOutputConfig.getSurface());
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.f10358id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public java.lang.String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig
    public android.view.Surface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getSurfaceGroupId() {
        return this.surfaceGroupId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> getSurfaceSharingOutputConfigs() {
        return this.surfaceSharingOutputConfigs;
    }

    public int hashCode() {
        int i17 = (((this.f10358id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        java.lang.String str = this.physicalCameraId;
        return ((((i17 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.surface.hashCode();
    }

    public java.lang.String toString() {
        return "SurfaceOutputConfig{id=" + this.f10358id + ", surfaceGroupId=" + this.surfaceGroupId + ", physicalCameraId=" + this.physicalCameraId + ", surfaceSharingOutputConfigs=" + this.surfaceSharingOutputConfigs + ", surface=" + this.surface + "}";
    }
}
