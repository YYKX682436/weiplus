package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class np extends com.tencent.map.lib.models.ArcLineOverlayInfo implements com.tencent.mapsdk.internal.ni {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider f50581a;

    public np(com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider arcLineOverlayProvider) {
        this.f50581a = arcLineOverlayProvider;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(arcLineOverlayProvider.getData());
        setDataList(arrayList);
        this.mType = 0;
        this.mOpacity = arcLineOverlayProvider.getOpacity();
        this.mVisibility = arcLineOverlayProvider.isVisibility();
        this.mMinZoom = arcLineOverlayProvider.getMinZoom();
        this.mMaxZoom = arcLineOverlayProvider.getMaxZoom();
        this.mWidth = arcLineOverlayProvider.getWidth();
        this.mZIndex = arcLineOverlayProvider.getZIndex();
        this.mDraw3D = arcLineOverlayProvider.isEnable3D();
        this.mAnimate = arcLineOverlayProvider.isAnimate();
        this.mAnimateDuration = arcLineOverlayProvider.getAnimateDuration();
        this.mHighLightDuration = arcLineOverlayProvider.getHighLightDuration();
        this.mAnimateColor = arcLineOverlayProvider.getAnimateColor();
        this.mColors = arcLineOverlayProvider.getColors();
        this.mColorPoints = arcLineOverlayProvider.getColorPoints();
        this.mColorMapSize = arcLineOverlayProvider.getColorMapSize();
        this.mDisplayLevel = arcLineOverlayProvider.getDisplayLevel();
        this.outterVectorOverlayLoadListener = arcLineOverlayProvider.getVectorOverlayLoadedListener();
    }

    private com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider a() {
        return this.f50581a;
    }
}
