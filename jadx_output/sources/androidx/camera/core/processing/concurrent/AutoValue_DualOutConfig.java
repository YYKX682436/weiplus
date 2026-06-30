package androidx.camera.core.processing.concurrent;

/* loaded from: classes14.dex */
final class AutoValue_DualOutConfig extends androidx.camera.core.processing.concurrent.DualOutConfig {
    private final androidx.camera.core.processing.util.OutConfig primaryOutConfig;
    private final androidx.camera.core.processing.util.OutConfig secondaryOutConfig;

    public AutoValue_DualOutConfig(androidx.camera.core.processing.util.OutConfig outConfig, androidx.camera.core.processing.util.OutConfig outConfig2) {
        if (outConfig == null) {
            throw new java.lang.NullPointerException("Null primaryOutConfig");
        }
        this.primaryOutConfig = outConfig;
        if (outConfig2 == null) {
            throw new java.lang.NullPointerException("Null secondaryOutConfig");
        }
        this.secondaryOutConfig = outConfig2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.concurrent.DualOutConfig)) {
            return false;
        }
        androidx.camera.core.processing.concurrent.DualOutConfig dualOutConfig = (androidx.camera.core.processing.concurrent.DualOutConfig) obj;
        return this.primaryOutConfig.equals(dualOutConfig.getPrimaryOutConfig()) && this.secondaryOutConfig.equals(dualOutConfig.getSecondaryOutConfig());
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public androidx.camera.core.processing.util.OutConfig getPrimaryOutConfig() {
        return this.primaryOutConfig;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public androidx.camera.core.processing.util.OutConfig getSecondaryOutConfig() {
        return this.secondaryOutConfig;
    }

    public int hashCode() {
        return ((this.primaryOutConfig.hashCode() ^ 1000003) * 1000003) ^ this.secondaryOutConfig.hashCode();
    }

    public java.lang.String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.primaryOutConfig + ", secondaryOutConfig=" + this.secondaryOutConfig + "}";
    }
}
