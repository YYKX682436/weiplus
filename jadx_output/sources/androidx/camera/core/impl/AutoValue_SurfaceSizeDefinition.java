package androidx.camera.core.impl;

/* loaded from: classes13.dex */
final class AutoValue_SurfaceSizeDefinition extends androidx.camera.core.impl.SurfaceSizeDefinition {
    private final android.util.Size analysisSize;
    private final java.util.Map<java.lang.Integer, android.util.Size> maximumSizeMap;
    private final android.util.Size previewSize;
    private final android.util.Size recordSize;
    private final java.util.Map<java.lang.Integer, android.util.Size> s1440pSizeMap;
    private final java.util.Map<java.lang.Integer, android.util.Size> s720pSizeMap;
    private final java.util.Map<java.lang.Integer, android.util.Size> ultraMaximumSizeMap;

    public AutoValue_SurfaceSizeDefinition(android.util.Size size, java.util.Map<java.lang.Integer, android.util.Size> map, android.util.Size size2, java.util.Map<java.lang.Integer, android.util.Size> map2, android.util.Size size3, java.util.Map<java.lang.Integer, android.util.Size> map3, java.util.Map<java.lang.Integer, android.util.Size> map4) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null analysisSize");
        }
        this.analysisSize = size;
        if (map == null) {
            throw new java.lang.NullPointerException("Null s720pSizeMap");
        }
        this.s720pSizeMap = map;
        if (size2 == null) {
            throw new java.lang.NullPointerException("Null previewSize");
        }
        this.previewSize = size2;
        if (map2 == null) {
            throw new java.lang.NullPointerException("Null s1440pSizeMap");
        }
        this.s1440pSizeMap = map2;
        if (size3 == null) {
            throw new java.lang.NullPointerException("Null recordSize");
        }
        this.recordSize = size3;
        if (map3 == null) {
            throw new java.lang.NullPointerException("Null maximumSizeMap");
        }
        this.maximumSizeMap = map3;
        if (map4 == null) {
            throw new java.lang.NullPointerException("Null ultraMaximumSizeMap");
        }
        this.ultraMaximumSizeMap = map4;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.SurfaceSizeDefinition)) {
            return false;
        }
        androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition = (androidx.camera.core.impl.SurfaceSizeDefinition) obj;
        return this.analysisSize.equals(surfaceSizeDefinition.getAnalysisSize()) && this.s720pSizeMap.equals(surfaceSizeDefinition.getS720pSizeMap()) && this.previewSize.equals(surfaceSizeDefinition.getPreviewSize()) && this.s1440pSizeMap.equals(surfaceSizeDefinition.getS1440pSizeMap()) && this.recordSize.equals(surfaceSizeDefinition.getRecordSize()) && this.maximumSizeMap.equals(surfaceSizeDefinition.getMaximumSizeMap()) && this.ultraMaximumSizeMap.equals(surfaceSizeDefinition.getUltraMaximumSizeMap());
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public android.util.Size getAnalysisSize() {
        return this.analysisSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public java.util.Map<java.lang.Integer, android.util.Size> getMaximumSizeMap() {
        return this.maximumSizeMap;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public android.util.Size getPreviewSize() {
        return this.previewSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public android.util.Size getRecordSize() {
        return this.recordSize;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public java.util.Map<java.lang.Integer, android.util.Size> getS1440pSizeMap() {
        return this.s1440pSizeMap;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public java.util.Map<java.lang.Integer, android.util.Size> getS720pSizeMap() {
        return this.s720pSizeMap;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public java.util.Map<java.lang.Integer, android.util.Size> getUltraMaximumSizeMap() {
        return this.ultraMaximumSizeMap;
    }

    public int hashCode() {
        return ((((((((((((this.analysisSize.hashCode() ^ 1000003) * 1000003) ^ this.s720pSizeMap.hashCode()) * 1000003) ^ this.previewSize.hashCode()) * 1000003) ^ this.s1440pSizeMap.hashCode()) * 1000003) ^ this.recordSize.hashCode()) * 1000003) ^ this.maximumSizeMap.hashCode()) * 1000003) ^ this.ultraMaximumSizeMap.hashCode();
    }

    public java.lang.String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.analysisSize + ", s720pSizeMap=" + this.s720pSizeMap + ", previewSize=" + this.previewSize + ", s1440pSizeMap=" + this.s1440pSizeMap + ", recordSize=" + this.recordSize + ", maximumSizeMap=" + this.maximumSizeMap + ", ultraMaximumSizeMap=" + this.ultraMaximumSizeMap + "}";
    }
}
