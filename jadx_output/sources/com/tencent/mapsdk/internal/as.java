package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class as extends com.tencent.mapsdk.internal.au<com.tencent.mapsdk.internal.ah> implements com.tencent.tencentmap.mapsdk.maps.model.Circle {

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ah f48860b;

    public as(com.tencent.mapsdk.internal.ah ahVar) {
        this.f48860b = ahVar;
    }

    private com.tencent.mapsdk.internal.ah b() {
        return this.f48860b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final boolean contains(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return this.f48860b.contains(latLng);
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ah f_() {
        return this.f48860b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getCenter() {
        return this.f48860b.getCenter();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable
    public final int getFillColor() {
        return this.f48860b.getFillColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final double getRadius() {
        return this.f48860b.getRadius();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final int getStrokeColor() {
        return this.f48860b.getStrokeColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final float getStrokeWidth() {
        return this.f48860b.getStrokeWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final java.lang.Object getTag() {
        return this.f48860b.getTag();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final boolean isClickable() {
        return this.f48860b.isClickable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setCenter(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.f48860b.setCenter(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final void setClickable(boolean z17) {
        this.f48860b.setClickable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable
    public final void setFillColor(int i17) {
        this.f48860b.setFillColor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    @java.lang.Deprecated
    public final void setOptions(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions) {
        this.f48860b.setOptions(circleOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setRadius(double d17) {
        this.f48860b.setRadius(d17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final void setStrokeColor(int i17) {
        this.f48860b.setStrokeColor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final void setStrokeWidth(float f17) {
        this.f48860b.setStrokeWidth(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final void setTag(java.lang.Object obj) {
        this.f48860b.setTag(obj);
    }
}
