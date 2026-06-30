package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pv extends com.tencent.map.lib.models.AccessibleTouchItem {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.MapPoi f50787a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tr f50788b;

    public pv(com.tencent.mapsdk.internal.tr trVar, com.tencent.tencentmap.mapsdk.maps.model.MapPoi mapPoi) {
        this.f50787a = mapPoi;
        this.f50788b = trVar;
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final android.graphics.Rect getBounds() {
        com.tencent.mapsdk.internal.fu a17 = ((com.tencent.mapsdk.vector.VectorMap) this.f50788b.e_).getProjection().a(com.tencent.map.lib.models.GeoPoint.from(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.f50787a.getLatitude(), this.f50787a.getLongitude())));
        return new android.graphics.Rect((int) (a17.f49467a - (com.tencent.mapsdk.internal.hn.o() * 20.0f)), (int) (a17.f49468b - (com.tencent.mapsdk.internal.hn.o() * 20.0f)), (int) (a17.f49467a + (com.tencent.mapsdk.internal.hn.o() * 20.0f)), (int) (a17.f49468b + (com.tencent.mapsdk.internal.hn.o() * 20.0f)));
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final java.lang.String getContentDescription() {
        return this.f50787a.getName();
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final void onClick() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener onMapPoiClickListener;
        com.tencent.mapsdk.internal.tr trVar = this.f50788b;
        if (trVar == null || (onMapPoiClickListener = trVar.f52208w) == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.MapPoi mapPoi = new com.tencent.tencentmap.mapsdk.maps.model.MapPoi();
        mapPoi.position = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.f50787a.getLatitude(), this.f50787a.getLongitude());
        mapPoi.name = this.f50787a.getName();
        onMapPoiClickListener.onClicked(mapPoi);
    }
}
