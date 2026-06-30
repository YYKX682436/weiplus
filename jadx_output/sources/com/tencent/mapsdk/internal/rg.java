package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rg {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.re f51159a;

    public rg(com.tencent.mapsdk.internal.re reVar) {
        this.f51159a = reVar;
    }

    public final com.tencent.mapsdk.internal.qz a(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions) {
        com.tencent.tencentmap.mapsdk.maps.model.TileProvider tileProvider = tileOverlayOptions.getTileProvider();
        com.tencent.mapsdk.internal.qz rfVar = tileProvider != null ? tileProvider instanceof com.tencent.mapsdk.internal.ro ? new com.tencent.mapsdk.internal.rf(this.f51159a, tileOverlayOptions) : tileProvider instanceof com.tencent.mapsdk.internal.sq ? new com.tencent.mapsdk.internal.rh(this.f51159a, tileOverlayOptions) : new com.tencent.mapsdk.internal.qz(this.f51159a, tileOverlayOptions) : null;
        this.f51159a.a(rfVar);
        return rfVar;
    }
}
