package com.tencent.map.sdk.utilities.visualization.aggregation;

/* loaded from: classes13.dex */
public abstract class AggregationOverlayProvider extends com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider {
    private static final double DEFAULT_MAX_HEIGHT = 100.0d;
    private static final int DEFAULT_MAX_INTENSITY = 2000;
    private static final int DEFAULT_MIN_INTENSITY = 0;
    private static final int DEFAULT_MIN_SIZE = 10;
    private static final int DEFAULT_SIZE = 2000;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mGeoReferencePoint;
    private com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] mNodes;
    private static final int[] DEFAULT_COLORS = {android.graphics.Color.argb(255, 31, 44, 71), android.graphics.Color.argb(255, 40, 72, 138), android.graphics.Color.argb(255, 38, 97, 217), android.graphics.Color.argb(255, 90, 140, 242), android.graphics.Color.argb(255, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS, 187, 255)};
    private static final double DEFAULT_MIN_HEIGHT = 0.0d;
    private static final double[] DEFAULT_START_POINTS = {DEFAULT_MIN_HEIGHT, 0.10000000149011612d, 0.15000000596046448d, 0.30000001192092896d, 0.5d};
    private int mType = 0;
    private float mSize = 2000.0f;
    private float mGap = 0.0f;
    private int[] mColors = DEFAULT_COLORS;
    private double[] mStartPoints = DEFAULT_START_POINTS;
    private double mMinIntensity = DEFAULT_MIN_HEIGHT;
    private double mMaxIntensity = 2000.0d;
    private boolean mRangeFlag = false;
    private double mMaxHeight = DEFAULT_MAX_HEIGHT;
    private double mMinHeight = DEFAULT_MIN_HEIGHT;
    private boolean mDraw3D = false;
    private boolean mAnimate = false;
    private int mAnimateDuration = 0;

    /* loaded from: classes6.dex */
    public enum AggregationOverlayType {
        HoneyComb,
        Square
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider colors(int[] iArr, double[] dArr) {
        boolean z17;
        if (iArr != null && dArr != null && iArr.length > 0 && dArr.length > 0 && iArr.length == dArr.length) {
            int i17 = 1;
            while (true) {
                if (i17 >= dArr.length) {
                    z17 = true;
                    break;
                }
                if (dArr[i17 - 1] > dArr[i17]) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17 && dArr[0] >= DEFAULT_MIN_HEIGHT && dArr[dArr.length - 1] <= 1.0d) {
                this.mColors = iArr;
                this.mStartPoints = dArr;
            }
        }
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider enable3D(boolean z17) {
        this.mDraw3D = z17;
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider gap(float f17) {
        if (f17 >= 0.0f) {
            this.mGap = f17;
        }
        return this;
    }

    public int getAnimateDuration() {
        return this.mAnimateDuration;
    }

    public int[] getColors() {
        return this.mColors;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public float getGap() {
        return this.mGap;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getGeoReferencePoint() {
        return this.mGeoReferencePoint;
    }

    public double getMaxHeight() {
        return this.mMaxHeight;
    }

    public double getMaxIntensity() {
        return this.mMaxIntensity;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMaxZoom() {
        return super.getMaxZoom();
    }

    public double getMinHeight() {
        return this.mMinHeight;
    }

    public double getMinIntensity() {
        return this.mMinIntensity;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMinZoom() {
        return super.getMinZoom();
    }

    public com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] getNodes() {
        return this.mNodes;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public float getOpacity() {
        return super.getOpacity();
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider.AggregationOverlayType getOverlayType() {
        return com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider.AggregationOverlayType.values()[this.mType];
    }

    public boolean getRangeFlag() {
        return this.mRangeFlag;
    }

    public float getSize() {
        return this.mSize;
    }

    public double[] getStartPoints() {
        return this.mStartPoints;
    }

    public int getType() {
        return getOverlayType().ordinal();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getZIndex() {
        return super.getZIndex();
    }

    public boolean isAnimate() {
        return this.mAnimate;
    }

    public boolean isEnable3D() {
        return this.mDraw3D;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public boolean isVisibility() {
        return super.isVisibility();
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider nodes(com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] weightedLatLngArr) {
        if (weightedLatLngArr != null) {
            this.mNodes = weightedLatLngArr;
        }
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider setAnimateDuration(int i17) {
        if (i17 == 0) {
            this.mAnimate = false;
            this.mAnimateDuration = 0;
        } else if (i17 > 0) {
            this.mAnimateDuration = i17;
            this.mAnimate = true;
        }
        return this;
    }

    public void setGeoReferencePoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mGeoReferencePoint = latLng;
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider setHeightRange(double d17, double d18) {
        if (d17 <= d18 && d17 >= DEFAULT_MIN_HEIGHT) {
            this.mMaxHeight = d18;
            this.mMinHeight = d17;
        }
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider setIntensityRange(double d17, double d18) {
        if (d17 < d18 && d17 >= DEFAULT_MIN_HEIGHT) {
            this.mMaxIntensity = d18;
            this.mMinIntensity = d17;
            this.mRangeFlag = true;
        }
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider size(float f17) {
        if (f17 < 10.0f) {
            return this;
        }
        this.mSize = f17;
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider type(com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider.AggregationOverlayType aggregationOverlayType) {
        this.mType = aggregationOverlayType.ordinal();
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider zoomRange(int i17, int i18) {
        if (i17 <= i18) {
            super.minZoom(i17);
            super.maxZoom(i18);
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider displayLevel(int i17) {
        super.displayLevel(i17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider opacity(float f17) {
        super.opacity(f17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider visibility(boolean z17) {
        super.visibility(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider zIndex(int i17) {
        super.zIndex(i17);
        return this;
    }
}
