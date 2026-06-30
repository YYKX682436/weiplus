package ca3;

/* loaded from: classes13.dex */
public final class k implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.map.LiteAppMapView f39801a;

    public k(com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView) {
        this.f39801a = liteAppMapView;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener
    public void onMapClick(com.tencent.mapsdk.raster.model.LatLng latLng) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f39801a.f144101e;
        if (methodChannel != null) {
            kotlin.jvm.internal.o.d(latLng);
            methodChannel.invokeMethod("clickMap", kz5.c1.i(new jz5.l("longitude", java.lang.Double.valueOf(latLng.getLongitude())), new jz5.l("latitude", java.lang.Double.valueOf(latLng.getLatitude()))));
        }
    }
}
