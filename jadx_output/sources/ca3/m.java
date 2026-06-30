package ca3;

/* loaded from: classes13.dex */
public final class m implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.map.LiteAppMapView f39803a;

    public m(com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView) {
        this.f39803a = liteAppMapView;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener
    public void onPolylineClick(com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f39803a.f144101e;
        if (methodChannel != null) {
            kotlin.jvm.internal.o.d(latLng);
            methodChannel.invokeMethod("clickPolyline", kz5.c1.i(new jz5.l("longitude", java.lang.Double.valueOf(latLng.longitude)), new jz5.l("latitude", java.lang.Double.valueOf(latLng.latitude))));
        }
    }
}
