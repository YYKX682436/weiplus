package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ny extends com.tencent.map.lib.models.HeatmapInfo implements com.tencent.mapsdk.internal.ni {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider f50589a;

    public ny(com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider gradientVectorOverlayProvider) {
        this.f50589a = gradientVectorOverlayProvider;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(gradientVectorOverlayProvider.getData());
        setDataList(arrayList);
        this.radius = gradientVectorOverlayProvider.getRadius();
        this.colors = gradientVectorOverlayProvider.getColors();
        this.colorPoints = gradientVectorOverlayProvider.getColorPoints();
        this.colorMapSize = gradientVectorOverlayProvider.getColorMapSize();
        this.visible = gradientVectorOverlayProvider.isVisibility();
        this.opacity = gradientVectorOverlayProvider.getOpacity();
        this.maxZoom = gradientVectorOverlayProvider.getMaxZoom();
        this.minZoom = gradientVectorOverlayProvider.getMinZoom();
        this.maxHeight = gradientVectorOverlayProvider.getMaxHeight();
        this.draw3D = gradientVectorOverlayProvider.isEnable3D();
        this.maxIntensity = gradientVectorOverlayProvider.getMaxIntensity();
        this.minIntensity = gradientVectorOverlayProvider.getMinIntensity();
        this.intensityFlag = gradientVectorOverlayProvider.isIntensityFlag();
        this.mAnimate = gradientVectorOverlayProvider.isAnimate();
        this.mAnimateDuration = gradientVectorOverlayProvider.getAnimateDuration();
        this.level = gradientVectorOverlayProvider.getDisplayLevel();
        this.zIndex = gradientVectorOverlayProvider.getZIndex();
        this.outterVectorOverlayLoadListener = gradientVectorOverlayProvider.getVectorOverlayLoadedListener();
        int length = this.colors.length;
        int i17 = 0;
        while (true) {
            int[] iArr = this.colors;
            if (i17 >= iArr.length) {
                int length2 = this.colorPoints.length;
                int length3 = this.notes.length;
                int length4 = this.nodeIndexes.length;
                return;
            }
            int i18 = iArr[i17];
            i17++;
        }
    }

    private com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider a() {
        return this.f50589a;
    }
}
