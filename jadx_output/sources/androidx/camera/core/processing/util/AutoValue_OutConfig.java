package androidx.camera.core.processing.util;

/* loaded from: classes14.dex */
final class AutoValue_OutConfig extends androidx.camera.core.processing.util.OutConfig {
    private final android.graphics.Rect getCropRect;
    private final int getFormat;
    private final int getRotationDegrees;
    private final android.util.Size getSize;
    private final int getTargets;
    private final java.util.UUID getUuid;
    private final boolean isMirroring;
    private final boolean shouldRespectInputCropRect;

    public AutoValue_OutConfig(java.util.UUID uuid, int i17, int i18, android.graphics.Rect rect, android.util.Size size, int i19, boolean z17, boolean z18) {
        if (uuid == null) {
            throw new java.lang.NullPointerException("Null getUuid");
        }
        this.getUuid = uuid;
        this.getTargets = i17;
        this.getFormat = i18;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null getCropRect");
        }
        this.getCropRect = rect;
        if (size == null) {
            throw new java.lang.NullPointerException("Null getSize");
        }
        this.getSize = size;
        this.getRotationDegrees = i19;
        this.isMirroring = z17;
        this.shouldRespectInputCropRect = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.util.OutConfig)) {
            return false;
        }
        androidx.camera.core.processing.util.OutConfig outConfig = (androidx.camera.core.processing.util.OutConfig) obj;
        return this.getUuid.equals(outConfig.getUuid()) && this.getTargets == outConfig.getTargets() && this.getFormat == outConfig.getFormat() && this.getCropRect.equals(outConfig.getCropRect()) && this.getSize.equals(outConfig.getSize()) && this.getRotationDegrees == outConfig.getRotationDegrees() && this.isMirroring == outConfig.isMirroring() && this.shouldRespectInputCropRect == outConfig.shouldRespectInputCropRect();
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public android.graphics.Rect getCropRect() {
        return this.getCropRect;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getFormat() {
        return this.getFormat;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getRotationDegrees() {
        return this.getRotationDegrees;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public android.util.Size getSize() {
        return this.getSize;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public int getTargets() {
        return this.getTargets;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public java.util.UUID getUuid() {
        return this.getUuid;
    }

    public int hashCode() {
        return ((((((((((((((this.getUuid.hashCode() ^ 1000003) * 1000003) ^ this.getTargets) * 1000003) ^ this.getFormat) * 1000003) ^ this.getCropRect.hashCode()) * 1000003) ^ this.getSize.hashCode()) * 1000003) ^ this.getRotationDegrees) * 1000003) ^ (this.isMirroring ? 1231 : 1237)) * 1000003) ^ (this.shouldRespectInputCropRect ? 1231 : 1237);
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public boolean isMirroring() {
        return this.isMirroring;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public boolean shouldRespectInputCropRect() {
        return this.shouldRespectInputCropRect;
    }

    public java.lang.String toString() {
        return "OutConfig{getUuid=" + this.getUuid + ", getTargets=" + this.getTargets + ", getFormat=" + this.getFormat + ", getCropRect=" + this.getCropRect + ", getSize=" + this.getSize + ", getRotationDegrees=" + this.getRotationDegrees + ", isMirroring=" + this.isMirroring + ", shouldRespectInputCropRect=" + this.shouldRespectInputCropRect + "}";
    }
}
