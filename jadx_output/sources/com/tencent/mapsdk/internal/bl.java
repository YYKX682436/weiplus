package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class bl implements com.tencent.mapsdk.internal.bt, com.tencent.tencentmap.mapsdk.maps.TencentMap {
    public void a(android.os.Bundle bundle) {
    }

    public abstract void a(boolean z17);

    public abstract boolean a();

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.AoiLayer addAoiLayer(java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions aoiLayerOptions, com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addAoiLayer", (java.lang.Object) (str + "#" + aoiLayerOptions + "#" + onAoiLayerLoadListener), h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Arc addArc(com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addArc", arcOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Circle addCircle(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addCircle", circleOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.CustomLayer addCustomLayer(com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions customLayerOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addCustomLayer", customLayerOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay addGroundOverlay(com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addGroundOverlay", groundOverlayOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Marker addMarker(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addMarker", markerOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void addOnMapLoadedCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addOnMapLoadedCallback", onMapLoadedCallback, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Polygon addPolygon(com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addPolygon", polygonOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Polyline addPolyline(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addPolyline", polylineOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void addTencentMapGestureListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addTencentMapGestureListener", tencentMapGestureListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.TileOverlay addTileOverlay(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addTileOverlay", tileOverlayOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay addVectorHeatOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions vectorHeatOverlayOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addVectorHeatOverlay", vectorHeatOverlayOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public <L extends com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay> L addVectorOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider vectorOverlayProvider) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addVectorOverlay", vectorOverlayProvider, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.map.sdk.comps.vis.VisualLayer addVisualLayer(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "addVisualLayer", visualLayerOptions, h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "animateCamera", cameraUpdate, h());
    }

    public abstract void b();

    @Override // com.tencent.mapsdk.internal.bt
    public final void b(android.os.Bundle bundle) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.Q, h());
        a(bundle);
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.Q, h());
    }

    public abstract void c();

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateZoomToSpanLevel(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IOverlay> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "calculateZoomToSpanLevel", (java.lang.Object) (list + "#" + list2 + "#" + i17 + "#" + i18 + "#" + i19 + "#" + i27), h());
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clear() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "clear", java.lang.Integer.valueOf(com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.la.f50258aa, "clear", h())), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clearAllOverlays() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "clearAllOverlays", java.lang.Integer.valueOf(com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.la.f50258aa, "clearAllOverlays", h())), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clearCache() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "clearCache", java.lang.Integer.valueOf(com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.la.f50258aa, "clearCache", h())), h());
    }

    public abstract void d();

    public abstract void e();

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void enableAutoMaxSkew(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "enableAutoMaxSkew", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void enableMultipleInfowindow(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "enableMultipleInfowindow", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public java.lang.String executeVisualLayerCommand(com.tencent.map.sdk.comps.vis.VisualLayer visualLayer, java.lang.String str) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "executeVisualLayerCommand", (java.lang.Object) (visualLayer + "#" + str), h());
        return null;
    }

    public abstract void f();

    public void g() {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public <T extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> T getMapComponent(java.lang.Class<T> cls) {
        return (T) getMapContext().getMapComponent(cls);
    }

    public abstract int h();

    @Override // com.tencent.mapsdk.internal.bt
    public final void i() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.R, h());
        b();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.R, h());
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void j() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.S, h());
        c();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.S, h());
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void k() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.U, h());
        d();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.U, h());
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void l() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.T, h());
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.T, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void loadKMLFile(java.lang.String str) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "loadKMLFile", (java.lang.Object) str, h());
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void m() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.V, h());
        f();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.V, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void moveCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "moveCamera", cameraUpdate, h());
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void n() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.W, h());
        g();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.W, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void removeOnMapLoadedCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "removeOnMapLoadedCallback", onMapLoadedCallback, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void removeTencentMapGestureListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "removeTencentMapGestureListener", tencentMapGestureListener, h());
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void resetIndoorCellInfo() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "resetIndoorParkSpaceColors", (java.lang.Object) "", h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBaseMapEnabled(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setBaseMapEnabled", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBlockRouteEnabled(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setBlockRouteEnabled", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuilding3dEffectEnable(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setBuilding3dEffectEnable", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuildingBlackList(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds> list) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setBuildingBlackList", list, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuildingEnable(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setBuildingEnable", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCameraCenterProportion(float f17, float f18) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setCameraCenterProportion", (java.lang.Object) (f17 + "#" + f18), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCustomRender(com.tencent.tencentmap.mapsdk.maps.CustomRender customRender) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setCustomRender", customRender, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setDrawPillarWith2DStyle(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setDrawPillarWith2DStyle", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setForeignLanguage(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setForeignLanguage", language, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setHandDrawMapEnable(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setHandDrawMapEnable", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorCellInfo(java.util.List<com.tencent.map.lib.models.IndoorCellInfo> list) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setIndoorParkSpaceColors", list, h());
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorEnabled(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setIndoorEnabled", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorFloor(int i17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setIndoorFloor", java.lang.Integer.valueOf(i17), h());
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorMaskColor(int i17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setIndoorMaskColor", java.lang.Integer.valueOf(i17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setInfoWindowAdapter(com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter infoWindowAdapter) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setInfoWindowAdapter", infoWindowAdapter, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setLanguage(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setLanguage", language, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setLocationCompassHidden(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setLocationCompassEnabled", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setLocationNavigationGravityLineHidden(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setLocationNavigationGravityLineEnabled", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setLocationSource(com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setLocationSource", locationSource, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapCenterAndScale(float f17, float f18, float f19) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMapCenterAndScale", (java.lang.Object) (f17 + "#" + f18 + "#" + f19), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapFontSize(com.tencent.tencentmap.mapsdk.maps.model.MapFontSize mapFontSize) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMapFontSize", mapFontSize, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapFrameRate(float f17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMapFrameRate", java.lang.Float.valueOf(f17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapStyle(int i17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMapStyle", java.lang.Integer.valueOf(i17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapType(int i17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMapType", java.lang.Integer.valueOf(i17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMaxZoomLevel(int i17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMaxZoomLevel", java.lang.Integer.valueOf(i17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMinZoomLevel(int i17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMinZoomLevel", java.lang.Integer.valueOf(i17), h());
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMyLocationClickListener", onMyLocationClickListener, h());
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationConfig(com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig myLocationConfig) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMyLocationConfig", myLocationConfig != null ? myLocationConfig.toString() : java.lang.Boolean.FALSE, h());
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationEnabled(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMyLocationEnabled", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationStyle(com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setMyLocationStyle", myLocationStyle, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnCameraChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnCameraChangeListener", onCameraChangeListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnCompassClickedListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCompassClickedListener onCompassClickedListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnCompassClickedListener", onCompassClickedListener, h());
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setOnIndoorStateChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnIndoorStateChangeListener", onIndoorStateChangeListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnInfoWindowClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "OnInfoWindowClickListener", onInfoWindowClickListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener onMapClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnMapClickListener", onMapClickListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapFrameFinished(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapFrameFinishCallback onMapFrameFinishCallback) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnMapFrameFinished", onMapFrameFinishCallback, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapLoadedCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        addOnMapLoadedCallback(onMapLoadedCallback);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapLongClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener onMapLongClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnMapLongClickListener", onMapLongClickListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapPoiClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnMapPoiClickListener", onMapPoiClickListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener onMarkerClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnMarkerClickListener", onMarkerClickListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerCollisionStatusListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "OnMarkerCollisionStatusListener", onMarkerCollisionStatusListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerDragListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener onMarkerDragListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "OnMarkerDragListener", onMarkerDragListener, h());
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setOnMyLocationChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnMyLocationChangeListener", onMyLocationChangeListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnPolygonClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener onPolygonClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnPolygonClickListener", onPolygonClickListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnPolylineClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener onPolylineClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnPolylineClickListener", onPolylineClickListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnScaleViewChangedListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnScaleViewChangedListener", onScaleViewChangedListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnTapMapViewInfoWindowHidden(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnTapMapViewInfoWindowHidden", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnTrafficEventClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnTrafficEventClickListener", java.lang.Boolean.valueOf(onTrafficEventClickListener != null), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnVectorOverlayClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOnVectorOverlayClickListener", onVectorOverlayClickListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOverSeaEnable(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "enableOverSea", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOverSeaTileProvider(com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setOverSeaTileProvider", overSeaTileProvider, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPadding(int i17, int i18, int i19, int i27) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setPadding", (java.lang.Object) (i17 + "#" + i18 + "#" + i19 + "#" + i27), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPointToCenter(int i17, int i18) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setPointToCenter", (java.lang.Object) (i17 + "#" + i18), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPoisEnabled(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setPoisEnabled", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setRestrictBounds(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, com.tencent.tencentmap.mapsdk.maps.model.RestrictBoundsFitMode restrictBoundsFitMode) {
        java.lang.String str;
        if (latLngBounds == null) {
            str = "null restrictBounds";
        } else {
            str = latLngBounds.toString() + "#" + restrictBoundsFitMode;
        }
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setRestrictBounds", (java.lang.Object) str, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setSatelliteEnabled(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setSatelliteEnabled", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setSceneByTag(java.lang.String str) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setSceneByTag", (java.lang.Object) str, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTencentMapGestureListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setTencentMapGestureListener", tencentMapGestureListener, h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTrafficEnabled(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setTrafficEnabled", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTrafficMode(int i17, int i18) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setTrafficMode", (java.lang.Object) (i17 + "#" + i18), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void showBuilding(boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "showBuilding", java.lang.Boolean.valueOf(z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(snapshotReadyCallback != null);
        sb6.append("#");
        sb6.append(config);
        sb6.append("#");
        sb6.append(i17);
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, com.tencent.mm.plugin.appbrand.j0.f78445f, (java.lang.Object) sb6.toString(), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void stopAnimation() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "stopAnimation", java.lang.Integer.valueOf(com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.la.f50258aa, "stopAnimation", h())), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void updateVectorOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider vectorOverlayProvider) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "updateVectorOverlay", (java.lang.Object) (vectorOverlay + "#" + vectorOverlayProvider), h());
    }

    public void a(int i17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setIndoorConfigType", java.lang.Integer.valueOf(i17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "animateCamera", (java.lang.Object) (cameraUpdate + "#" + cancelableCallback), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCameraCenterProportion(float f17, float f18, boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setCameraCenterProportion", (java.lang.Object) (f17 + "#" + f18 + "#" + z17), h());
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorFloor(java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setIndoorFloor", (java.lang.Object) (str + "#" + str2), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPadding(int i17, int i18, int i19, int i27, boolean z17) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "setPadding", (java.lang.Object) (i17 + "#" + i18 + "#" + i19 + "#" + i27 + "#" + z17), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(snapshotReadyCallback != null);
        sb6.append("#");
        sb6.append(config);
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, com.tencent.mm.plugin.appbrand.j0.f78445f, (java.lang.Object) sb6.toString(), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "animateCamera", (java.lang.Object) (cameraUpdate + "#" + j17 + "#" + cancelableCallback), h());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, com.tencent.mm.plugin.appbrand.j0.f78445f, java.lang.Boolean.valueOf(snapshotReadyCallback != null), h());
    }
}
