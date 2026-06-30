package androidx.camera.core;

/* loaded from: classes14.dex */
final class AutoValue_ResolutionInfo_ResolutionInfoInternal extends androidx.camera.core.ResolutionInfo.ResolutionInfoInternal {
    private final android.graphics.Rect cropRect;
    private final android.util.Size resolution;
    private final int rotationDegrees;

    /* loaded from: classes14.dex */
    public static final class Builder extends androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder {
        private android.graphics.Rect cropRect;
        private android.util.Size resolution;
        private java.lang.Integer rotationDegrees;

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        public androidx.camera.core.ResolutionInfo.ResolutionInfoInternal build() {
            java.lang.String str = this.resolution == null ? " resolution" : "";
            if (this.cropRect == null) {
                str = str + " cropRect";
            }
            if (this.rotationDegrees == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal(this.resolution, this.cropRect, this.rotationDegrees.intValue());
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        public androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setCropRect(android.graphics.Rect rect) {
            if (rect == null) {
                throw new java.lang.NullPointerException("Null cropRect");
            }
            this.cropRect = rect;
            return this;
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        public androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setResolution(android.util.Size size) {
            if (size == null) {
                throw new java.lang.NullPointerException("Null resolution");
            }
            this.resolution = size;
            return this;
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        public androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setRotationDegrees(int i17) {
            this.rotationDegrees = java.lang.Integer.valueOf(i17);
            return this;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.ResolutionInfo.ResolutionInfoInternal)) {
            return false;
        }
        androidx.camera.core.ResolutionInfo.ResolutionInfoInternal resolutionInfoInternal = (androidx.camera.core.ResolutionInfo.ResolutionInfoInternal) obj;
        return this.resolution.equals(resolutionInfoInternal.getResolution()) && this.cropRect.equals(resolutionInfoInternal.getCropRect()) && this.rotationDegrees == resolutionInfoInternal.getRotationDegrees();
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    public android.graphics.Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    public android.util.Size getResolution() {
        return this.resolution;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        return ((((this.resolution.hashCode() ^ 1000003) * 1000003) ^ this.cropRect.hashCode()) * 1000003) ^ this.rotationDegrees;
    }

    public java.lang.String toString() {
        return "ResolutionInfoInternal{resolution=" + this.resolution + ", cropRect=" + this.cropRect + ", rotationDegrees=" + this.rotationDegrees + "}";
    }

    private AutoValue_ResolutionInfo_ResolutionInfoInternal(android.util.Size size, android.graphics.Rect rect, int i17) {
        this.resolution = size;
        this.cropRect = rect;
        this.rotationDegrees = i17;
    }
}
