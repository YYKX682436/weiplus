package ca3;

/* loaded from: classes13.dex */
public final class o implements com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.map.LiteAppMapView f39805a;

    public o(com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView) {
        this.f39805a = liteAppMapView;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource
    public android.location.Location getMyLocation() {
        com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView = this.f39805a;
        android.location.Location location = liteAppMapView.D;
        if (location == null) {
            return null;
        }
        kotlin.jvm.internal.o.d(location);
        location.getLatitude();
        android.location.Location location2 = liteAppMapView.D;
        kotlin.jvm.internal.o.d(location2);
        location2.getLongitude();
        return liteAppMapView.D;
    }
}
