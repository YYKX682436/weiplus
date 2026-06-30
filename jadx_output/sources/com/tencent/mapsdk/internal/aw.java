package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class aw extends com.tencent.mapsdk.internal.au<com.tencent.mapsdk.internal.ap> implements com.tencent.tencentmap.mapsdk.maps.model.Polygon {

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.ap f48865b;

    public aw(com.tencent.mapsdk.internal.ap apVar) {
        this.f48865b = apVar;
    }

    private com.tencent.mapsdk.internal.ap b() {
        return this.f48865b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final boolean contains(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return this.f48865b.contains(latLng);
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ap f_() {
        return this.f48865b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable
    public final int getFillColor() {
        return this.f48865b.getFillColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getPoints() {
        return this.f48865b.getPoints();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final int getStrokeColor() {
        return this.f48865b.getStrokeColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final float getStrokeWidth() {
        return this.f48865b.getStrokeWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final java.lang.Object getTag() {
        return this.f48865b.getTag();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final boolean isClickable() {
        com.tencent.mapsdk.internal.ap apVar = this.f48865b;
        if (apVar != null) {
            return apVar.isClickable();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final void setClickable(boolean z17) {
        this.f48865b.setClickable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable
    public final void setFillColor(int i17) {
        this.f48865b.setFillColor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setHolePoints(java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> list) {
        com.tencent.mapsdk.internal.ap apVar = this.f48865b;
        if (apVar == null) {
            return;
        }
        apVar.setHolePoints(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setOptions(com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions) {
        this.f48865b.setOptions(polygonOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setPoints(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        com.tencent.mapsdk.internal.ap apVar = this.f48865b;
        if (apVar == null) {
            return;
        }
        apVar.setPoints(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final void setStrokeColor(int i17) {
        this.f48865b.setStrokeColor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final void setStrokeWidth(float f17) {
        this.f48865b.setStrokeWidth(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final void setTag(java.lang.Object obj) {
        this.f48865b.setTag(obj);
    }
}
