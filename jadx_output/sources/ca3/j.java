package ca3;

/* loaded from: classes13.dex */
public final class j implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.map.LiteAppMapView f39800a;

    public j(com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView) {
        this.f39800a = liteAppMapView;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener
    public void onCameraChange(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener
    public void onCameraChangeFinish(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
        com.tencent.mapsdk.raster.model.LatLng target;
        com.tencent.mapsdk.raster.model.LatLng target2;
        com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView = this.f39800a;
        liteAppMapView.f144106m = (cameraPosition == null || (target2 = cameraPosition.getTarget()) == null) ? liteAppMapView.f144106m : target2.getLatitude();
        liteAppMapView.f144105i = (cameraPosition == null || (target = cameraPosition.getTarget()) == null) ? liteAppMapView.f144105i : target.getLongitude();
        liteAppMapView.f144113t = (cameraPosition != null ? java.lang.Float.valueOf(cameraPosition.getBearing()) : java.lang.Double.valueOf(liteAppMapView.f144113t)).doubleValue();
        liteAppMapView.f144107n = (cameraPosition != null ? java.lang.Float.valueOf(cameraPosition.getZoom()) : java.lang.Double.valueOf(liteAppMapView.f144107n)).doubleValue();
        liteAppMapView.f144114u = (cameraPosition != null ? java.lang.Float.valueOf(cameraPosition.getSkew()) : java.lang.Double.valueOf(liteAppMapView.f144114u)).doubleValue();
        com.tencent.tencentmap.mapsdk.map.MapView mapView = liteAppMapView.f144103g;
        kotlin.jvm.internal.o.d(mapView);
        com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds = mapView.getProjection().getVisibleRegion().getLatLngBounds();
        io.flutter.plugin.common.MethodChannel methodChannel = liteAppMapView.f144101e;
        if (methodChannel != null) {
            methodChannel.invokeMethod("regionChange", kz5.c1.i(new jz5.l("northeast", kz5.c1.i(new jz5.l("latitude", java.lang.Double.valueOf(latLngBounds.getNortheast().getLatitude())), new jz5.l("longitude", java.lang.Double.valueOf(latLngBounds.getNortheast().getLongitude())))), new jz5.l("southwest", kz5.c1.i(new jz5.l("latitude", java.lang.Double.valueOf(latLngBounds.getSouthwest().getLatitude())), new jz5.l("longitude", java.lang.Double.valueOf(latLngBounds.getSouthwest().getLongitude()))))));
        }
    }
}
