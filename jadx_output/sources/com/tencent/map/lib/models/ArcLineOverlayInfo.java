package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class ArcLineOverlayInfo extends com.tencent.map.lib.models.OverlayListenerInfo {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final int DEFAULT_MAX_ZOOM = 22;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    private static final int DEFAULT_MIN_ZOOM = 3;
    protected int mType = 0;
    protected int mZIndex = 0;
    protected int activeIndex = 0;
    protected float mOpacity = 1.0f;
    protected boolean mVisibility = true;
    protected int mMinZoom = 3;
    protected int mMaxZoom = 22;
    protected int mDisplayLevel = 1;
    protected float mWidth = 4.0f;
    protected int[] mColors = {android.graphics.Color.argb(255, 0, 255, 170), android.graphics.Color.argb(255, 0, 255, 170), android.graphics.Color.argb(255, 0, 255, 170)};
    protected float[] mColorPoints = {0.0f, 0.5f, 1.0f};
    protected int mColorMapSize = 200;
    protected boolean mDraw3D = false;
    protected boolean mAnimate = false;
    protected int mHighLightDuration = 5000;
    protected int mAnimateDuration = 5000;
    protected int mAnimateColor = -16776961;
    protected com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[] notes = new com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[0];
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

    public void setAnimateDuration(int i17) {
        this.mAnimateDuration = i17;
    }

    public void setDataList(java.util.List<java.util.Collection<com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng>> list) {
        if (list == null || list.size() == 0) {
            this.notes = new com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[0];
            this.nodeIndexes = new int[0];
            return;
        }
        this.nodeIndexes = new int[list.size()];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.Collection<com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng> collection = list.get(i17);
            this.nodeIndexes[i17] = collection.size();
            arrayList.addAll(collection);
        }
        this.notes = (com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[]) arrayList.toArray(new com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[0]);
    }

    public void setDisplayLevel(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.mDisplayLevel = i17;
        }
    }

    public void setDraw3D(boolean z17) {
        this.mDraw3D = z17;
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

    public void setNodes(com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[] fromToLatLngArr) {
        this.notes = fromToLatLngArr;
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
