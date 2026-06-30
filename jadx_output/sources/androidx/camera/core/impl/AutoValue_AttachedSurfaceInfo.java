package androidx.camera.core.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_AttachedSurfaceInfo extends androidx.camera.core.impl.AttachedSurfaceInfo {
    private final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> captureTypes;
    private final androidx.camera.core.DynamicRange dynamicRange;
    private final int imageFormat;
    private final androidx.camera.core.impl.Config implementationOptions;
    private final android.util.Size size;
    private final androidx.camera.core.impl.SurfaceConfig surfaceConfig;
    private final android.util.Range<java.lang.Integer> targetFrameRate;

    public AutoValue_AttachedSurfaceInfo(androidx.camera.core.impl.SurfaceConfig surfaceConfig, int i17, android.util.Size size, androidx.camera.core.DynamicRange dynamicRange, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list, androidx.camera.core.impl.Config config, android.util.Range<java.lang.Integer> range) {
        if (surfaceConfig == null) {
            throw new java.lang.NullPointerException("Null surfaceConfig");
        }
        this.surfaceConfig = surfaceConfig;
        this.imageFormat = i17;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.size = size;
        if (dynamicRange == null) {
            throw new java.lang.NullPointerException("Null dynamicRange");
        }
        this.dynamicRange = dynamicRange;
        if (list == null) {
            throw new java.lang.NullPointerException("Null captureTypes");
        }
        this.captureTypes = list;
        this.implementationOptions = config;
        this.targetFrameRate = range;
    }

    public boolean equals(java.lang.Object obj) {
        androidx.camera.core.impl.Config config;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.AttachedSurfaceInfo)) {
            return false;
        }
        androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo = (androidx.camera.core.impl.AttachedSurfaceInfo) obj;
        if (this.surfaceConfig.equals(attachedSurfaceInfo.getSurfaceConfig()) && this.imageFormat == attachedSurfaceInfo.getImageFormat() && this.size.equals(attachedSurfaceInfo.getSize()) && this.dynamicRange.equals(attachedSurfaceInfo.getDynamicRange()) && this.captureTypes.equals(attachedSurfaceInfo.getCaptureTypes()) && ((config = this.implementationOptions) != null ? config.equals(attachedSurfaceInfo.getImplementationOptions()) : attachedSurfaceInfo.getImplementationOptions() == null)) {
            android.util.Range<java.lang.Integer> range = this.targetFrameRate;
            if (range == null) {
                if (attachedSurfaceInfo.getTargetFrameRate() == null) {
                    return true;
                }
            } else if (range.equals(attachedSurfaceInfo.getTargetFrameRate())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes() {
        return this.captureTypes;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public androidx.camera.core.DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public androidx.camera.core.impl.Config getImplementationOptions() {
        return this.implementationOptions;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public android.util.Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public androidx.camera.core.impl.SurfaceConfig getSurfaceConfig() {
        return this.surfaceConfig;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public android.util.Range<java.lang.Integer> getTargetFrameRate() {
        return this.targetFrameRate;
    }

    public int hashCode() {
        int hashCode = (((((((((this.surfaceConfig.hashCode() ^ 1000003) * 1000003) ^ this.imageFormat) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.dynamicRange.hashCode()) * 1000003) ^ this.captureTypes.hashCode()) * 1000003;
        androidx.camera.core.impl.Config config = this.implementationOptions;
        int hashCode2 = (hashCode ^ (config == null ? 0 : config.hashCode())) * 1000003;
        android.util.Range<java.lang.Integer> range = this.targetFrameRate;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.surfaceConfig + ", imageFormat=" + this.imageFormat + ", size=" + this.size + ", dynamicRange=" + this.dynamicRange + ", captureTypes=" + this.captureTypes + ", implementationOptions=" + this.implementationOptions + ", targetFrameRate=" + this.targetFrameRate + "}";
    }
}
