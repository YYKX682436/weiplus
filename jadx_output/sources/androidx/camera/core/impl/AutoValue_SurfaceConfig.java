package androidx.camera.core.impl;

/* loaded from: classes13.dex */
final class AutoValue_SurfaceConfig extends androidx.camera.core.impl.SurfaceConfig {
    private final androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize;
    private final androidx.camera.core.impl.SurfaceConfig.ConfigType configType;
    private final long streamUseCase;

    public AutoValue_SurfaceConfig(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize, long j17) {
        if (configType == null) {
            throw new java.lang.NullPointerException("Null configType");
        }
        this.configType = configType;
        if (configSize == null) {
            throw new java.lang.NullPointerException("Null configSize");
        }
        this.configSize = configSize;
        this.streamUseCase = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.SurfaceConfig)) {
            return false;
        }
        androidx.camera.core.impl.SurfaceConfig surfaceConfig = (androidx.camera.core.impl.SurfaceConfig) obj;
        return this.configType.equals(surfaceConfig.getConfigType()) && this.configSize.equals(surfaceConfig.getConfigSize()) && this.streamUseCase == surfaceConfig.getStreamUseCase();
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public androidx.camera.core.impl.SurfaceConfig.ConfigSize getConfigSize() {
        return this.configSize;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType() {
        return this.configType;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public long getStreamUseCase() {
        return this.streamUseCase;
    }

    public int hashCode() {
        int hashCode = (((this.configType.hashCode() ^ 1000003) * 1000003) ^ this.configSize.hashCode()) * 1000003;
        long j17 = this.streamUseCase;
        return hashCode ^ ((int) (j17 ^ (j17 >>> 32)));
    }

    public java.lang.String toString() {
        return "SurfaceConfig{configType=" + this.configType + ", configSize=" + this.configSize + ", streamUseCase=" + this.streamUseCase + "}";
    }
}
