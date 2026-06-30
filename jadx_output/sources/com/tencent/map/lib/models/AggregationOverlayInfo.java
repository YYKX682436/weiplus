package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class AggregationOverlayInfo extends com.tencent.map.lib.models.OverlayListenerInfo {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final int DEFAULT_MAX_ZOOM = 22;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    private static final int DEFAULT_MIN_ZOOM = 3;
    protected com.tencent.tencentmap.mapsdk.maps.model.LatLng mGeoReferencePoint;
    protected int mType = 0;
    protected float mSize = 2000.0f;
    protected float mGap = 0.0f;
    protected float mOpacity = 1.0f;
    protected boolean mVisibility = true;
    protected int mMinZoom = 3;
    protected int mMaxZoom = 22;
    protected int mDisplayLevel = 1;
    protected int mZIndex = 0;
    protected double mMinHeight = 0.0d;
    protected double mMaxHeight = 1000.0d;
    protected double mMinIntensity = 0.0d;
    protected double mMaxIntensity = 2000.0d;
    protected boolean mRangeFlag = false;
    protected int[] mColors = {1174031124, -1711650028, -637908204};
    protected double[] mStartPoints = {0.0d, 0.6d, 0.8d};
    protected boolean mDraw3D = false;
    protected boolean mAnimate = false;
    protected int mAnimateDuration = 5000;
    protected com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] mNodes = new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[0];

    public boolean isAnimate() {
        return this.mAnimate;
    }

    public boolean isVisible() {
        return this.mVisibility;
    }

    public void setAnimate(boolean z17) {
        this.mAnimate = z17;
    }

    public void setAnimateTime(int i17) {
        this.mAnimateDuration = i17;
    }

    public void setColors(int[] iArr) {
        this.mColors = iArr;
    }

    public void setDisplayLevel(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.mDisplayLevel = i17;
        }
    }

    public void setDraw3D(boolean z17) {
        this.mDraw3D = z17;
    }

    public void setGap(float f17) {
        this.mGap = f17;
    }

    public void setHeightRange(double d17, double d18) {
        if (d17 > d18 || d17 < 0.0d) {
            this.mMinHeight = 0.0d;
            this.mMaxHeight = 1000.0d;
        } else {
            this.mMaxHeight = d18;
            this.mMinHeight = d17;
        }
    }

    public void setMaxZoom(int i17) {
        if (i17 <= 22) {
            this.mMaxZoom = i17;
        } else {
            this.mMaxZoom = 22;
        }
    }

    public void setMinZoom(int i17) {
        if (i17 >= 3) {
            this.mMinZoom = i17;
        } else {
            this.mMinZoom = 3;
        }
    }

    public void setNodes(com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] weightedLatLngArr) {
        this.mNodes = weightedLatLngArr;
    }

    public void setOpacity(float f17) {
        if (f17 > 1.0f) {
            this.mOpacity = 1.0f;
        } else if (f17 < 0.0f) {
            this.mOpacity = 0.0f;
        } else {
            this.mOpacity = f17;
        }
    }

    public void setShowRange(double d17, double d18) {
        if (d17 > d18 || d17 < 0.0d) {
            this.mMinIntensity = 0.0d;
            this.mMaxIntensity = 2000.0d;
            this.mRangeFlag = false;
        } else {
            this.mMinIntensity = d17;
            this.mMaxIntensity = d18;
            this.mRangeFlag = true;
        }
    }

    public void setSize(float f17) {
        this.mSize = f17;
    }

    public void setStartPoints(double[] dArr) {
        this.mStartPoints = dArr;
    }

    public void setType(int i17) {
        this.mType = i17;
    }

    public void setVisibility(boolean z17) {
        this.mVisibility = z17;
    }

    public void setZIndex(int i17) {
        this.mZIndex = i17;
    }

    public void setZoomLevelRange(int i17, int i18) {
        if (i17 <= i18) {
            setMinZoom(i17);
            setMaxZoom(i18);
        }
    }
}
