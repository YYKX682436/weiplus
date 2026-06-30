package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class ScatterPlotInfo extends com.tencent.map.lib.models.OverlayListenerInfo {
    private static final int DEFAULT_MAX_ZOOM = 22;
    private static final int DEFAULT_MIN_ZOOM = 3;
    protected double[] circleStartPoints;
    protected int[] colors;
    protected float[] colorsPoints;
    protected int mBitmapHeight;
    protected int mBitmapWidth;
    protected float maxIntensity;
    protected int maxZoom;
    protected float minIntensity;
    protected int minZoom;
    protected float opacity;
    protected int radius;
    protected boolean visible;
    protected int activeIndex = 0;
    protected int mType = 0;
    protected int level = 1;
    protected int zIndex = 0;
    protected boolean draw3D = false;
    protected int colorMapSize = 200;
    protected boolean mAnimate = false;
    protected boolean intensityFlag = false;
    protected int mMinRadius = 0;
    protected int mMaxRadius = 30;
    protected int mStrokeColor = -1;
    protected int mStrokeWidth = 4;
    protected com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng[] notes = new com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng[0];
    protected int[] nodeIndexes = new int[0];
    protected android.graphics.Bitmap[] mBitmaps = new android.graphics.Bitmap[0];

    public boolean isAnimate() {
        return this.mAnimate;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setActiveIndex(int i17) {
        this.activeIndex = i17;
    }

    public void setAnimate(boolean z17) {
        this.mAnimate = z17;
    }

    public void setColors(int[] iArr) {
        this.colors = iArr;
    }

    public void setColorsPoints(float[] fArr) {
        this.colorsPoints = fArr;
    }

    public void setDataList(java.util.List<java.util.Collection<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng>> list) {
        if (list == null) {
            this.notes = new com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng[0];
            this.nodeIndexes = new int[0];
            return;
        }
        this.nodeIndexes = new int[list.size()];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.Collection<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng> collection = list.get(i17);
            this.nodeIndexes[i17] = collection.size();
            arrayList.addAll(collection);
        }
        this.notes = (com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng[]) arrayList.toArray(new com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng[0]);
    }

    public void setDraw3D(boolean z17) {
        this.draw3D = z17;
    }

    public void setLevel(int i17) {
        this.level = i17;
    }

    public void setMaxZoom(int i17) {
        if (i17 <= 22) {
            this.maxZoom = i17;
        } else {
            this.maxZoom = 22;
        }
    }

    public void setMinZoom(int i17) {
        if (i17 >= 3) {
            this.minZoom = i17;
        } else {
            this.minZoom = 3;
        }
    }

    public void setOpacity(float f17) {
        this.opacity = f17;
    }

    public void setRadius(int i17) {
        this.radius = i17;
    }

    public void setVisible(boolean z17) {
        this.visible = z17;
    }

    public void setZoomLevelRange(int i17, int i18) {
        if (i17 <= i18) {
            setMinZoom(i17);
            setMaxZoom(i18);
        }
    }

    public void setzIndex(int i17) {
        this.zIndex = i17;
    }

    public void setColorsPoints(double[] dArr) {
        this.circleStartPoints = dArr;
    }
}
