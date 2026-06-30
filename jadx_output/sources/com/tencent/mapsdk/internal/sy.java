package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sy extends com.tencent.mapsdk.vector.VectorMap implements com.tencent.tencentmap.mapsdk.maps.TencentMapNavi {
    public sy(com.tencent.mapsdk.internal.ne neVar) {
        super(neVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay addIntersectionEnlargeOverlay(com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions intersectionOverlayOptions) {
        return getMapPro().addIntersectionEnlargeOverlay(intersectionOverlayOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void addSegmentsWithRouteName(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2) {
        getMapPro().addSegmentsWithRouteName(list, list2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void animateToNaviPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18) {
        getMapPro().animateToNaviPosition(latLng, f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void animateToNaviPosition2(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19, boolean z17) {
        getMapPro().animateToNaviPosition2(latLng, f17, f18, f19, z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final float calNaviLevel(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, float f17, int i17, boolean z17) {
        return getMapPro().calNaviLevel(latLngBounds, f17, i17, z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final float calNaviLevel2(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, float f18, int i17, boolean z17) {
        return getMapPro().calNaviLevel2(latLng, latLng2, f17, f18, i17, z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final float calNaviLevel3(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, int i17, int i18, int i19, int i27, boolean z17) {
        return getMapPro().calNaviLevel3(latLng, latLng2, f17, i17, i18, i19, i27, z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateZoomToSpanLevelAsync(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IOverlay> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27, com.tencent.tencentmap.mapsdk.maps.TencentMap.AsyncOperateCallback<com.tencent.tencentmap.mapsdk.maps.model.CameraPosition> asyncOperateCallback) {
        return getMapPro().calculateZoomToSpanLevelAsync(list, list2, i17, i18, i19, i27, asyncOperateCallback);
    }

    @Override // com.tencent.mapsdk.vector.VectorMap, com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void clearRouteNameSegments() {
        getMapPro().clearRouteNameSegments();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final boolean isNaviStateEnabled() {
        return getMapPro().isNaviStateEnabled();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void moveToNavPosition(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        getMapPro().moveToNavPosition(cameraUpdate, latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setNavCenter(int i17, int i18) {
        getMapPro().setNavCenter(i17, i18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setNaviFixingProportion(float f17, float f18) {
        getMapPro().setNaviFixingProportion(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setNaviFixingProportion2D(float f17, float f18) {
        getMapPro().setNaviFixingProportion2D(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setNaviStateEnabled(boolean z17) {
        getMapPro().setNaviStateEnabled(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setOptionalResourcePath(java.lang.String str) {
        getMapPro().setOptionalResourcePath(str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void animateToNaviPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19) {
        getMapPro().animateToNaviPosition(latLng, f17, f18, f19);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void animateToNaviPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19, boolean z17) {
        getMapPro().animateToNaviPosition(latLng, f17, f18, f19, z17);
    }
}
