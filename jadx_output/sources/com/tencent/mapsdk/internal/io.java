package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class io extends com.tencent.mapsdk.internal.im {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.LatLng f49913i;

    public io(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.f49913i = latLng;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.LatLng c() {
        return this.f49913i;
    }

    @Override // com.tencent.mapsdk.internal.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        float interpolation = interpolator.getInterpolation(f17);
        com.tencent.mapsdk.internal.im.b bVar = this.f49910h;
        if (bVar != null) {
            bVar.b(interpolation);
        }
    }
}
