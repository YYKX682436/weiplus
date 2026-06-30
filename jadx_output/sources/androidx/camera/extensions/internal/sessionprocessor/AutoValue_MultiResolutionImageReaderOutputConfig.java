package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
final class AutoValue_MultiResolutionImageReaderOutputConfig extends androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig {

    /* renamed from: id, reason: collision with root package name */
    private final int f10357id;
    private final int imageFormat;
    private final int maxImages;
    private final java.lang.String physicalCameraId;
    private final int surfaceGroupId;
    private final java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> surfaceSharingOutputConfigs;

    public AutoValue_MultiResolutionImageReaderOutputConfig(int i17, int i18, java.lang.String str, java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> list, int i19, int i27) {
        this.f10357id = i17;
        this.surfaceGroupId = i18;
        this.physicalCameraId = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.surfaceSharingOutputConfigs = list;
        this.imageFormat = i19;
        this.maxImages = i27;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig)) {
            return false;
        }
        androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig multiResolutionImageReaderOutputConfig = (androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig) obj;
        return this.f10357id == multiResolutionImageReaderOutputConfig.getId() && this.surfaceGroupId == multiResolutionImageReaderOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(multiResolutionImageReaderOutputConfig.getPhysicalCameraId()) : multiResolutionImageReaderOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(multiResolutionImageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.imageFormat == multiResolutionImageReaderOutputConfig.getImageFormat() && this.maxImages == multiResolutionImageReaderOutputConfig.getMaxImages();
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.f10357id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public java.lang.String getPhysicalCameraId() {
        return this.physicalCameraId;
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
        int i17 = (((this.f10357id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        java.lang.String str = this.physicalCameraId;
        return ((((((i17 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.imageFormat) * 1000003) ^ this.maxImages;
    }

    public java.lang.String toString() {
        return "MultiResolutionImageReaderOutputConfig{id=" + this.f10357id + ", surfaceGroupId=" + this.surfaceGroupId + ", physicalCameraId=" + this.physicalCameraId + ", surfaceSharingOutputConfigs=" + this.surfaceSharingOutputConfigs + ", imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + "}";
    }
}
