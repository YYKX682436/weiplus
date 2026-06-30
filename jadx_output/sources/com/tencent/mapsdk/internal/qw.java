package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qw {

    /* renamed from: a, reason: collision with root package name */
    public int f51086a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.tk f51087b;

    public qw(com.tencent.mapsdk.internal.tk tkVar, com.tencent.map.lib.models.GeoPoint[] geoPointArr, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
        this.f51087b = tkVar;
        if (tkVar == null) {
            return;
        }
        this.f51086a = ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass55>) new com.tencent.mapsdk.internal.tk.AnonymousClass55(geoPointArr, text), (com.tencent.mapsdk.internal.tk.AnonymousClass55) (-1))).intValue();
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
        int i17;
        com.tencent.mapsdk.internal.tk tkVar = this.f51087b;
        if (tkVar == null || (i17 = this.f51086a) <= 0) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass58(i17, text));
    }

    public final void a() {
        int i17;
        com.tencent.mapsdk.internal.tk tkVar = this.f51087b;
        if (tkVar == null || (i17 = this.f51086a) <= 0) {
            return;
        }
        tkVar.h(i17);
    }
}
