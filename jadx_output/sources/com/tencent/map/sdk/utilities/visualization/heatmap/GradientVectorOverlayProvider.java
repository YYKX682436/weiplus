package com.tencent.map.sdk.utilities.visualization.heatmap;

/* loaded from: classes13.dex */
public class GradientVectorOverlayProvider extends com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider {
    private static final boolean DEFAULT_ANIMATE = false;
    private static final int DEFAULT_ANIMATE_TIME = 0;
    private static final int DEFAULT_COLOR_MAP_SIZE = 500;
    private static final boolean DEFAULT_DRAW_3D = false;
    private static final int[] DEFAULT_GRADIENT_COLORS = {android.graphics.Color.argb(255, 77, 111, 255), android.graphics.Color.argb(255, 0, 238, 227), android.graphics.Color.argb(255, 113, com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX, 80), android.graphics.Color.argb(255, 255, 176, 0), android.graphics.Color.argb(255, 255, 72, 0)};
    private static final float[] DEFAULT_GRADIENT_START_POINTS = {0.1f, 0.185f, 0.3571f, 0.6142f, 1.0f};
    public static final float DEFAULT_MAX_HEIGHT = 60.0f;
    public static final float DEFAULT_MAX_INTENSITY = 2000.0f;
    public static final float DEFAULT_MIN_INTENSITY = 0.0f;
    public static final float DEFAULT_OPACITY = 1.0f;
    public static final int DEFAULT_RADIUS = 30;
    private static final int MAX_RADIUS = 150;
    private static final int MIN_RADIUS = 18;
    private java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> dataList = new java.util.ArrayList();
    private float maxHeight = 60.0f;
    private int radius = 30;
    private int[] colors = DEFAULT_GRADIENT_COLORS;
    private float[] colorPoints = DEFAULT_GRADIENT_START_POINTS;
    private int colorMapSize = 500;
    private boolean draw3D = false;
    private float maxIntensity = 2000.0f;
    private float minIntensity = 0.0f;
    private boolean intensityFlag = false;
    private boolean mAnimate = false;
    private int mAnimationDuration = 0;

    private static java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> wrapData(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider data(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        return weightedData(wrapData(list));
    }

    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider enable3D(boolean z17) {
        this.draw3D = z17;
        return this;
    }

    public int getAnimateDuration() {
        return this.mAnimationDuration;
    }

    public int getColorMapSize() {
        return this.colorMapSize;
    }

    public float[] getColorPoints() {
        return this.colorPoints;
    }

    public int[] getColors() {
        return this.colors;
    }

    public java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> getData() {
        return this.dataList;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public float getMaxHeight() {
        return this.maxHeight;
    }

    public float getMaxIntensity() {
        return this.maxIntensity;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMaxZoom() {
        return super.getMaxZoom();
    }

    public float getMinIntensity() {
        return this.minIntensity;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMinZoom() {
        return super.getMinZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public float getOpacity() {
        return super.getOpacity();
    }

    public int getRadius() {
        return this.radius;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getZIndex() {
        return super.getZIndex();
    }

    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider gradient(int[] iArr, float[] fArr) {
        boolean z17;
        if (iArr != null && fArr != null && iArr.length > 0 && fArr.length > 0 && iArr.length == fArr.length) {
            int i17 = 1;
            while (true) {
                if (i17 >= fArr.length) {
                    z17 = true;
                    break;
                }
                if (fArr[i17 - 1] > fArr[i17]) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17 && fArr[0] >= 0.0f && fArr[fArr.length - 1] <= 1.0f) {
                this.colors = iArr;
                this.colorPoints = fArr;
            }
        }
        return this;
    }

    public boolean isAnimate() {
        return this.mAnimate;
    }

    public boolean isEnable3D() {
        return this.draw3D;
    }

    public boolean isIntensityFlag() {
        return this.intensityFlag;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public boolean isVisibility() {
        return super.isVisibility();
    }

    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider radius(int i17) {
        if (i17 >= 18 && i17 <= 150) {
            this.radius = i17;
        }
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider setAnimateDuration(int i17) {
        if (i17 == 0) {
            this.mAnimate = false;
            this.mAnimationDuration = 0;
        } else if (i17 > 0) {
            this.mAnimationDuration = i17;
            this.mAnimate = true;
        }
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider setIntensityRange(float f17, float f18) {
        if (f17 >= f18 || f17 < 0.0f) {
            this.intensityFlag = false;
        } else {
            this.maxIntensity = f18;
            this.minIntensity = f17;
            this.intensityFlag = true;
        }
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider setMaxHeight(float f17) {
        if (f17 >= 0.0f) {
            this.maxHeight = f17;
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider
    public java.lang.String toString() {
        return "GradientVectorOverlayProvider{dataList=" + this.dataList.size() + ", maxHeight=" + this.maxHeight + ", radius=" + this.radius + ", colors=" + java.util.Arrays.toString(this.colors) + ", colorPoints=" + java.util.Arrays.toString(this.colorPoints) + ", colorMapSize=" + this.colorMapSize + ", draw3D=" + this.draw3D + ", maxIntensity=" + this.maxIntensity + ", minIntensity=" + this.minIntensity + ", intensityFlag=" + this.intensityFlag + ", mAnimate=" + this.mAnimate + ", mAnimationDuration=" + this.mAnimationDuration + ", mOpacity=" + this.mOpacity + ", mVisibility=" + this.mVisibility + ", mMinZoom=" + this.mMinZoom + ", mMaxZoom=" + this.mMaxZoom + ", mDisplayLevel=" + this.mDisplayLevel + ", mZIndex=" + this.mZIndex + '}';
    }

    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider weightedData(java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> list) {
        if (list != null) {
            this.dataList = list;
        }
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider zoomRange(int i17, int i18) {
        if (i17 <= i18) {
            super.minZoom(i17);
            super.maxZoom(i18);
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider displayLevel(int i17) {
        super.displayLevel(i17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider opacity(float f17) {
        super.opacity(f17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider visibility(boolean z17) {
        super.visibility(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider zIndex(int i17) {
        super.zIndex(i17);
        return this;
    }
}
