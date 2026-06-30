package androidx.camera.core.impl;

/* loaded from: classes14.dex */
final class AutoValue_SessionConfig_OutputConfig extends androidx.camera.core.impl.SessionConfig.OutputConfig {
    private final androidx.camera.core.DynamicRange dynamicRange;
    private final int mirrorMode;
    private final java.lang.String physicalCameraId;
    private final java.util.List<androidx.camera.core.impl.DeferrableSurface> sharedSurfaces;
    private final androidx.camera.core.impl.DeferrableSurface surface;
    private final int surfaceGroupId;

    /* loaded from: classes14.dex */
    public static final class Builder extends androidx.camera.core.impl.SessionConfig.OutputConfig.Builder {
        private androidx.camera.core.DynamicRange dynamicRange;
        private java.lang.Integer mirrorMode;
        private java.lang.String physicalCameraId;
        private java.util.List<androidx.camera.core.impl.DeferrableSurface> sharedSurfaces;
        private androidx.camera.core.impl.DeferrableSurface surface;
        private java.lang.Integer surfaceGroupId;

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig build() {
            java.lang.String str = this.surface == null ? " surface" : "";
            if (this.sharedSurfaces == null) {
                str = str + " sharedSurfaces";
            }
            if (this.mirrorMode == null) {
                str = str + " mirrorMode";
            }
            if (this.surfaceGroupId == null) {
                str = str + " surfaceGroupId";
            }
            if (this.dynamicRange == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig(this.surface, this.sharedSurfaces, this.physicalCameraId, this.mirrorMode.intValue(), this.surfaceGroupId.intValue(), this.dynamicRange);
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new java.lang.NullPointerException("Null dynamicRange");
            }
            this.dynamicRange = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setMirrorMode(int i17) {
            this.mirrorMode = java.lang.Integer.valueOf(i17);
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setPhysicalCameraId(java.lang.String str) {
            this.physicalCameraId = str;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSharedSurfaces(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null sharedSurfaces");
            }
            this.sharedSurfaces = list;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            if (deferrableSurface == null) {
                throw new java.lang.NullPointerException("Null surface");
            }
            this.surface = deferrableSurface;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurfaceGroupId(int i17) {
            this.surfaceGroupId = java.lang.Integer.valueOf(i17);
            return this;
        }
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.SessionConfig.OutputConfig)) {
            return false;
        }
        androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig = (androidx.camera.core.impl.SessionConfig.OutputConfig) obj;
        return this.surface.equals(outputConfig.getSurface()) && this.sharedSurfaces.equals(outputConfig.getSharedSurfaces()) && ((str = this.physicalCameraId) != null ? str.equals(outputConfig.getPhysicalCameraId()) : outputConfig.getPhysicalCameraId() == null) && this.mirrorMode == outputConfig.getMirrorMode() && this.surfaceGroupId == outputConfig.getSurfaceGroupId() && this.dynamicRange.equals(outputConfig.getDynamicRange());
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public androidx.camera.core.DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public int getMirrorMode() {
        return this.mirrorMode;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public java.lang.String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public java.util.List<androidx.camera.core.impl.DeferrableSurface> getSharedSurfaces() {
        return this.sharedSurfaces;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public androidx.camera.core.impl.DeferrableSurface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public int getSurfaceGroupId() {
        return this.surfaceGroupId;
    }

    public int hashCode() {
        int hashCode = (((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.sharedSurfaces.hashCode()) * 1000003;
        java.lang.String str = this.physicalCameraId;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mirrorMode) * 1000003) ^ this.surfaceGroupId) * 1000003) ^ this.dynamicRange.hashCode();
    }

    public java.lang.String toString() {
        return "OutputConfig{surface=" + this.surface + ", sharedSurfaces=" + this.sharedSurfaces + ", physicalCameraId=" + this.physicalCameraId + ", mirrorMode=" + this.mirrorMode + ", surfaceGroupId=" + this.surfaceGroupId + ", dynamicRange=" + this.dynamicRange + "}";
    }

    private AutoValue_SessionConfig_OutputConfig(androidx.camera.core.impl.DeferrableSurface deferrableSurface, java.util.List<androidx.camera.core.impl.DeferrableSurface> list, java.lang.String str, int i17, int i18, androidx.camera.core.DynamicRange dynamicRange) {
        this.surface = deferrableSurface;
        this.sharedSurfaces = list;
        this.physicalCameraId = str;
        this.mirrorMode = i17;
        this.surfaceGroupId = i18;
        this.dynamicRange = dynamicRange;
    }
}
