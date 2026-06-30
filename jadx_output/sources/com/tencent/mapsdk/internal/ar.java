package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ar extends com.tencent.mapsdk.internal.au<com.tencent.mapsdk.internal.ag> implements com.tencent.tencentmap.mapsdk.maps.model.Arc {

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ag f48859b;

    public ar(com.tencent.mapsdk.internal.ag agVar) {
        this.f48859b = agVar;
    }

    private com.tencent.mapsdk.internal.ag b() {
        return this.f48859b;
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ag f_() {
        return this.f48859b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getCenter() {
        return this.f48859b.getCenter();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Colorable
    public final int getColor() {
        return this.f48859b.getColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final double getLength() {
        return this.f48859b.getLength();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final double getRadius() {
        return this.f48859b.getRadius();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final int getStrokeColor() {
        return this.f48859b.getStrokeColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final float getStrokeWidth() {
        return this.f48859b.getStrokeWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Widthable
    public final float getWidth() {
        return this.f48859b.getWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Colorable
    public final void setColor(int i17) {
        this.f48859b.setColor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final void setStrokeColor(int i17) {
        this.f48859b.setStrokeColor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final void setStrokeWidth(float f17) {
        this.f48859b.setStrokeWidth(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Widthable
    public final void setWidth(float f17) {
        this.f48859b.setWidth(f17);
    }
}
