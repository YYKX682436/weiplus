package ca3;

/* loaded from: classes13.dex */
public final class l implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.map.LiteAppMapView f39802a;

    public l(com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView) {
        this.f39802a = liteAppMapView;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener
    public void onClicked(com.tencent.mapsdk.raster.model.MapPoi mapPoi) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f39802a.f144101e;
        if (methodChannel != null) {
            kotlin.jvm.internal.o.d(mapPoi);
            methodChannel.invokeMethod("clickPOI", kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, mapPoi.getName()), new jz5.l("longitude", java.lang.Double.valueOf(mapPoi.getPosition().getLongitude())), new jz5.l("latitude", java.lang.Double.valueOf(mapPoi.getPosition().getLatitude()))));
        }
    }
}
