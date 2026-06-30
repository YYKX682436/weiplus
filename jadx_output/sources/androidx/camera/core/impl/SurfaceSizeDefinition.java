package androidx.camera.core.impl;

/* loaded from: classes13.dex */
public abstract class SurfaceSizeDefinition {
    public static androidx.camera.core.impl.SurfaceSizeDefinition create(android.util.Size size, java.util.Map<java.lang.Integer, android.util.Size> map, android.util.Size size2, java.util.Map<java.lang.Integer, android.util.Size> map2, android.util.Size size3, java.util.Map<java.lang.Integer, android.util.Size> map3, java.util.Map<java.lang.Integer, android.util.Size> map4) {
        return new androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition(size, map, size2, map2, size3, map3, map4);
    }

    public abstract android.util.Size getAnalysisSize();

    public android.util.Size getMaximumSize(int i17) {
        return getMaximumSizeMap().get(java.lang.Integer.valueOf(i17));
    }

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getMaximumSizeMap();

    public abstract android.util.Size getPreviewSize();

    public abstract android.util.Size getRecordSize();

    public android.util.Size getS1440pSize(int i17) {
        return getS1440pSizeMap().get(java.lang.Integer.valueOf(i17));
    }

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getS1440pSizeMap();

    public android.util.Size getS720pSize(int i17) {
        return getS720pSizeMap().get(java.lang.Integer.valueOf(i17));
    }

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getS720pSizeMap();

    public android.util.Size getUltraMaximumSize(int i17) {
        return getUltraMaximumSizeMap().get(java.lang.Integer.valueOf(i17));
    }

    public abstract java.util.Map<java.lang.Integer, android.util.Size> getUltraMaximumSizeMap();
}
