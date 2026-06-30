package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
final class AutoValue_ImageReaderOutputConfig extends androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig {

    /* renamed from: id, reason: collision with root package name */
    private final int f10356id;
    private final int imageFormat;
    private final int maxImages;
    private final java.lang.String physicalCameraId;
    private final android.util.Size size;
    private final int surfaceGroupId;
    private final java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> surfaceSharingOutputConfigs;

    public AutoValue_ImageReaderOutputConfig(int i17, int i18, java.lang.String str, java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> list, android.util.Size size, int i19, int i27) {
        this.f10356id = i17;
        this.surfaceGroupId = i18;
        this.physicalCameraId = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.surfaceSharingOutputConfigs = list;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.size = size;
        this.imageFormat = i19;
        this.maxImages = i27;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig)) {
            return false;
        }
        androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig imageReaderOutputConfig = (androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig) obj;
        return this.f10356id == imageReaderOutputConfig.getId() && this.surfaceGroupId == imageReaderOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(imageReaderOutputConfig.getPhysicalCameraId()) : imageReaderOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(imageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.size.equals(imageReaderOutputConfig.getSize()) && this.imageFormat == imageReaderOutputConfig.getImageFormat() && this.maxImages == imageReaderOutputConfig.getMaxImages();
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.f10356id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public java.lang.String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    public android.util.Size getSize() {
        return this.size;
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
        int i17 = (((this.f10356id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        java.lang.String str = this.physicalCameraId;
        return ((((((((i17 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.imageFormat) * 1000003) ^ this.maxImages;
    }

    public java.lang.String toString() {
        return "ImageReaderOutputConfig{id=" + this.f10356id + ", surfaceGroupId=" + this.surfaceGroupId + ", physicalCameraId=" + this.physicalCameraId + ", surfaceSharingOutputConfigs=" + this.surfaceSharingOutputConfigs + ", size=" + this.size + ", imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + "}";
    }
}
