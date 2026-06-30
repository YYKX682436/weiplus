package androidx.camera.core.processing.util;

/* loaded from: classes14.dex */
final class AutoValue_GraphicDeviceInfo extends androidx.camera.core.processing.util.GraphicDeviceInfo {
    private final java.lang.String eglExtensions;
    private final java.lang.String eglVersion;
    private final java.lang.String glExtensions;
    private final java.lang.String glVersion;

    /* loaded from: classes14.dex */
    public static final class Builder extends androidx.camera.core.processing.util.GraphicDeviceInfo.Builder {
        private java.lang.String eglExtensions;
        private java.lang.String eglVersion;
        private java.lang.String glExtensions;
        private java.lang.String glVersion;

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public androidx.camera.core.processing.util.GraphicDeviceInfo build() {
            java.lang.String str = this.glVersion == null ? " glVersion" : "";
            if (this.eglVersion == null) {
                str = str + " eglVersion";
            }
            if (this.glExtensions == null) {
                str = str + " glExtensions";
            }
            if (this.eglExtensions == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo(this.glVersion, this.eglVersion, this.glExtensions, this.eglExtensions);
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setEglExtensions(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null eglExtensions");
            }
            this.eglExtensions = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setEglVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null eglVersion");
            }
            this.eglVersion = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setGlExtensions(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null glExtensions");
            }
            this.glExtensions = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public androidx.camera.core.processing.util.GraphicDeviceInfo.Builder setGlVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null glVersion");
            }
            this.glVersion = str;
            return this;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.util.GraphicDeviceInfo)) {
            return false;
        }
        androidx.camera.core.processing.util.GraphicDeviceInfo graphicDeviceInfo = (androidx.camera.core.processing.util.GraphicDeviceInfo) obj;
        return this.glVersion.equals(graphicDeviceInfo.getGlVersion()) && this.eglVersion.equals(graphicDeviceInfo.getEglVersion()) && this.glExtensions.equals(graphicDeviceInfo.getGlExtensions()) && this.eglExtensions.equals(graphicDeviceInfo.getEglExtensions());
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public java.lang.String getEglExtensions() {
        return this.eglExtensions;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public java.lang.String getEglVersion() {
        return this.eglVersion;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public java.lang.String getGlExtensions() {
        return this.glExtensions;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    public java.lang.String getGlVersion() {
        return this.glVersion;
    }

    public int hashCode() {
        return ((((((this.glVersion.hashCode() ^ 1000003) * 1000003) ^ this.eglVersion.hashCode()) * 1000003) ^ this.glExtensions.hashCode()) * 1000003) ^ this.eglExtensions.hashCode();
    }

    public java.lang.String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.glVersion + ", eglVersion=" + this.eglVersion + ", glExtensions=" + this.glExtensions + ", eglExtensions=" + this.eglExtensions + "}";
    }

    private AutoValue_GraphicDeviceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.glVersion = str;
        this.eglVersion = str2;
        this.glExtensions = str3;
        this.eglExtensions = str4;
    }
}
