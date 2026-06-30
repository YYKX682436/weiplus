package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class TrailOverlayInfo extends com.tencent.map.lib.models.OverlayListenerInfo {
    private static final int DEFAULT_MAX_ZOOM = 22;
    private static final int DEFAULT_MIN_ZOOM = 3;
    protected float[] colorPoints;
    protected int[] colors;
    protected int mType = 0;
    protected int mZIndex = 0;
    protected int activeIndex = 0;
    protected float mOpacity = 1.0f;
    protected boolean mVisibility = true;
    protected int mMinZoom = 3;
    protected int mMaxZoom = 22;
    protected int mDisplayLevel = 1;
    protected float mWidth = 4.0f;
    protected boolean mAnimate = true;
    protected int mHighLightDuration = 5000;
    protected int mAnimateStartTime = 0;
    protected int mAnimateEndTime = 2000;
    protected int mAnimateColor = -16776961;
    protected int colorMapSize = 200;
    protected float mPlayRatio = 1.0f;
    protected int mPulseInterval = 200;
    protected com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng[] notes = new com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng[0];
    protected int[] nodeIndexes = new int[0];

    public int getAnimateColor() {
        return this.mAnimateColor;
    }

    public boolean getIsAnimate() {
        return this.mAnimate;
    }

    public boolean isVisible() {
        return this.mVisibility;
    }

    public void setActiveDataIndex(int i17) {
        this.activeIndex = i17;
    }

    public void setAnimate(boolean z17) {
        this.mAnimate = z17;
    }

    public void setAnimateColor(int i17) {
        this.mAnimateColor = i17;
    }

    public void setAnimateEndTime(int i17) {
        this.mAnimateEndTime = i17;
    }

    public void setAnimateStartTime(int i17) {
        this.mAnimateStartTime = i17;
    }

    public void setDataList(java.util.List<java.util.Collection<com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng>> list) {
        if (list == null || list.size() == 0) {
            this.notes = new com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng[0];
            this.nodeIndexes = new int[0];
            return;
        }
        this.nodeIndexes = new int[list.size()];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.Collection<com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng> collection = list.get(i17);
            this.nodeIndexes[i17] = collection.size();
            arrayList.addAll(collection);
        }
        this.notes = (com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng[]) arrayList.toArray(new com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng[0]);
    }

    public void setDisplayLevel(int i17) {
        this.mDisplayLevel = i17;
    }

    public void setHighLightDuration(int i17) {
        this.mHighLightDuration = i17;
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

    public void setNodes(com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng[] trailLatLngArr) {
        this.notes = trailLatLngArr;
    }

    public void setOpacity(float f17) {
        this.mOpacity = f17;
    }

    public void setPlayRatio(float f17) {
        this.mPlayRatio = f17;
    }

    public void setType(int i17) {
        this.mType = i17;
    }

    public void setVisibility(boolean z17) {
        this.mVisibility = z17;
    }

    public void setWidth(float f17) {
        this.mWidth = f17;
    }

    public void setZoomLevelRange(int i17, int i18) {
        if (i17 <= i18) {
            setMinZoom(i17);
            setMaxZoom(i18);
        }
    }

    public void setzIndex(int i17) {
        this.mZIndex = i17;
    }
}
