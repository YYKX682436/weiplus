package com.tencent.map.sdk.utilities.visualization.od;

/* loaded from: classes13.dex */
public final class ArcLineOverlayProvider extends com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider {
    private static final int DEFAULT_COLOR_MAP_SIZE = 200;
    private static final int[] DEFAULT_GRADIENT_COLORS = {android.graphics.Color.argb(255, 0, 128, 255), android.graphics.Color.argb(51, 0, 170, 255), android.graphics.Color.argb(255, 0, 128, 255)};
    private static final float[] DEFAULT_GRADIENT_START_POINTS = {0.0f, 0.5f, 1.0f};
    private java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng> dataList = new java.util.ArrayList();
    private float mWidth = 6.0f;
    private float mRadian = 45.0f;
    private boolean mDraw3D = false;
    private boolean mAnimate = true;
    private int mHighLightDuration = 200;
    private int mAnimationDuration = 2000;
    private int mAnimateColor = -10046465;
    private int[] mColors = DEFAULT_GRADIENT_COLORS;
    private float[] mColorPoints = DEFAULT_GRADIENT_START_POINTS;
    protected int mColorMapSize = 200;

    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider animateColor(int i17) {
        this.mAnimateColor = i17;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider data(java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng> list) {
        if (list != null) {
            this.dataList = list;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider enable3D(boolean z17) {
        this.mDraw3D = z17;
        return this;
    }

    public final int getAnimateColor() {
        return this.mAnimateColor;
    }

    public final int getAnimateDuration() {
        return this.mAnimationDuration;
    }

    public final int getColorMapSize() {
        return this.mColorMapSize;
    }

    public final float[] getColorPoints() {
        return this.mColorPoints;
    }

    public final int[] getColors() {
        return this.mColors;
    }

    public final java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng> getData() {
        return this.dataList;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public final int getHighLightDuration() {
        return this.mHighLightDuration;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMaxZoom() {
        return super.getMaxZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMinZoom() {
        return super.getMinZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final float getOpacity() {
        return super.getOpacity();
    }

    public final float getRadian() {
        return this.mRadian;
    }

    public final float getWidth() {
        return this.mWidth;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getZIndex() {
        return super.getZIndex();
    }

    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider gradient(int[] iArr) {
        if (iArr != null) {
            if (iArr.length == 1) {
                int i17 = iArr[0];
                this.mColors = new int[]{i17, i17, i17};
                this.mColorPoints = new float[]{0.0f, 0.5f, 1.0f};
            } else if (iArr.length == 2) {
                this.mColors = iArr;
                this.mColorPoints = new float[]{0.0f, 1.0f};
            } else if (iArr.length == 3) {
                this.mColors = iArr;
                this.mColorPoints = new float[]{0.0f, 0.5f, 1.0f};
            }
        }
        return this;
    }

    public final boolean isAnimate() {
        return this.mAnimate;
    }

    public final boolean isEnable3D() {
        return this.mDraw3D;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isVisibility() {
        return super.isVisibility();
    }

    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider radian(float f17) {
        if (f17 > 0.0f && f17 <= 90.0f) {
            this.mRadian = f17;
            java.util.Iterator<com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng> it = this.dataList.iterator();
            while (it.hasNext()) {
                it.next().setArc(this.mRadian);
            }
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider setAnimateDuration(int i17) {
        if (i17 == 0) {
            this.mAnimate = false;
            this.mAnimationDuration = 0;
        } else if (i17 > 0) {
            this.mAnimationDuration = i17;
            this.mAnimate = true;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider setHighlightDuration(int i17) {
        if (i17 >= 0) {
            this.mHighLightDuration = i17;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider width(float f17) {
        if (f17 > 0.0f) {
            this.mWidth = f17;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider zoomRange(int i17, int i18) {
        if (i17 <= i18) {
            super.minZoom(i17);
            super.maxZoom(i18);
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider displayLevel(int i17) {
        super.displayLevel(i17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider opacity(float f17) {
        super.opacity(f17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider visibility(boolean z17) {
        super.visibility(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider zIndex(int i17) {
        super.zIndex(i17);
        return this;
    }
}
