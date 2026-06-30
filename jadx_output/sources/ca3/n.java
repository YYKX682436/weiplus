package ca3;

/* loaded from: classes13.dex */
public final class n implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.map.LiteAppMapView f39804a;

    public n(com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView) {
        this.f39804a = liteAppMapView;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener
    public boolean onMarkerClick(com.tencent.mapsdk.raster.model.Marker marker) {
        com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView = this.f39804a;
        java.util.Collection<ca3.b> values = liteAppMapView.H.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        ca3.b bVar = null;
        for (ca3.b bVar2 : values) {
            if (kotlin.jvm.internal.o.b(bVar2.f39787c, marker)) {
                bVar = bVar2;
            }
        }
        io.flutter.plugin.common.MethodChannel methodChannel = liteAppMapView.f144101e;
        if (methodChannel == null) {
            return true;
        }
        kotlin.jvm.internal.o.d(bVar);
        methodChannel.invokeMethod("clickMarker", kz5.c1.i(new jz5.l("markerId", java.lang.Integer.valueOf(bVar.f39786b))));
        return true;
    }
}
