package com.tencent.map.sdk.utilities.visualization.trails;

/* loaded from: classes13.dex */
public final class TrailOverlayProvider extends com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider {
    private static final int DEFAULT_COLOR_MAP_SIZE = 200;
    private static final int[] DEFAULT_GRADIENT_COLORS = {android.graphics.Color.argb(255, 0, 128, 255), android.graphics.Color.argb(0, 0, 128, 255)};
    private static final float[] DEFAULT_GRADIENT_START_POINTS = {0.0f, 1.0f};
    private int mType = 0;
    private java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng> dataList = new java.util.ArrayList();
    private final float DEFAULT_WIDTH = 6.0f;
    private float mWidth = 6.0f;
    private final int DEFAULT_HIGHLIGHT_DURATION = 1000;
    private final int DEFAULT_ANIMATE_START_TIME = 0;
    private final int DEFAULT_ANIMATE_END_TIME = 2000;
    private int mHighLightDuration = 1000;
    private int mAnimationStartTime = 0;
    private int mAnimatationEndTime = 2000;
    private final float DEFAULT_PLAY_RATIO = 1.0f;
    private float mPlayRatio = 1.0f;
    private int[] mColors = DEFAULT_GRADIENT_COLORS;
    private float[] mColorPoints = DEFAULT_GRADIENT_START_POINTS;
    protected int mColorMapSize = 200;

    /* loaded from: classes6.dex */
    public enum TrailOverlayType {
        Trail
    }

    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider data(java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng> list) {
        if (list != null) {
            this.dataList = list;
        }
        return this;
    }

    public final int getAnimateEndTime() {
        return this.mAnimatationEndTime;
    }

    public final int getAnimateStartTime() {
        return this.mAnimationStartTime;
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

    public final java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng> getData() {
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

    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider.TrailOverlayType getOverlayType() {
        return com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider.TrailOverlayType.values()[this.mType];
    }

    public final float getPlayRatio() {
        return this.mPlayRatio;
    }

    public final int getType() {
        return getOverlayType().ordinal();
    }

    public final float getWidth() {
        return this.mWidth;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getZIndex() {
        return super.getZIndex();
    }

    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider gradient(int[] iArr) {
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

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isVisibility() {
        return super.isVisibility();
    }

    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider setAnimateStartTime(int i17, int i18) {
        if (i17 < i18 && i17 >= 0) {
            this.mAnimationStartTime = i17;
            this.mAnimatationEndTime = i18;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider setHighlightDuration(int i17) {
        if (i17 > 0) {
            this.mHighLightDuration = i17;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider setPlayRatio(float f17) {
        if (f17 > 0.0f) {
            this.mPlayRatio = f17;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider type(com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider.TrailOverlayType trailOverlayType) {
        this.mType = trailOverlayType.ordinal();
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider width(float f17) {
        if (f17 > 0.0f) {
            this.mWidth = f17;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider zoomRange(int i17, int i18) {
        if (i17 <= i18) {
            super.minZoom(i17);
            super.maxZoom(i18);
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider displayLevel(int i17) {
        super.displayLevel(i17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider opacity(float f17) {
        super.opacity(f17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider visibility(boolean z17) {
        super.visibility(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider zIndex(int i17) {
        super.zIndex(i17);
        return this;
    }
}
