package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hx extends com.tencent.mapsdk.internal.hv implements com.tencent.tencentmap.mapsdk.maps.model.IEmergeAnimation {

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng f49866c;

    public hx(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.f49866c = null;
        if (this.f49861a == null) {
            this.f49861a = new com.tencent.mapsdk.internal.io(latLng);
        }
        this.f49866c = latLng;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.LatLng a() {
        return this.f49866c;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setDuration(long j17) {
        com.tencent.mapsdk.internal.im imVar = this.f49861a;
        if (imVar == null) {
            return;
        }
        imVar.a(j17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setInterpolator(android.view.animation.Interpolator interpolator) {
        com.tencent.mapsdk.internal.im imVar = this.f49861a;
        if (imVar == null || interpolator == null) {
            return;
        }
        imVar.f49908f = interpolator;
    }
}
