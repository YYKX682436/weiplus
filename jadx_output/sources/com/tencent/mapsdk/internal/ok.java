package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ok extends com.tencent.map.lib.models.TrailOverlayInfo implements com.tencent.mapsdk.internal.ni {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider f50592a;

    public ok(com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider trailOverlayProvider) {
        this.f50592a = trailOverlayProvider;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(trailOverlayProvider.getData());
        setDataList(arrayList);
        this.mType = trailOverlayProvider.getType();
        this.mOpacity = trailOverlayProvider.getOpacity();
        this.mVisibility = trailOverlayProvider.isVisibility();
        this.mMinZoom = trailOverlayProvider.getMinZoom();
        this.mMaxZoom = trailOverlayProvider.getMaxZoom();
        this.mWidth = trailOverlayProvider.getWidth();
        this.mZIndex = trailOverlayProvider.getZIndex();
        this.mAnimateStartTime = trailOverlayProvider.getAnimateStartTime();
        this.mAnimateEndTime = trailOverlayProvider.getAnimateEndTime();
        this.mHighLightDuration = trailOverlayProvider.getHighLightDuration();
        this.mPlayRatio = trailOverlayProvider.getPlayRatio();
        this.mDisplayLevel = trailOverlayProvider.getDisplayLevel();
        this.colorMapSize = trailOverlayProvider.getColorMapSize();
        this.colorPoints = trailOverlayProvider.getColorPoints();
        this.colors = trailOverlayProvider.getColors();
        this.outterVectorOverlayLoadListener = trailOverlayProvider.getVectorOverlayLoadedListener();
    }

    private com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider a() {
        return this.f50592a;
    }
}
