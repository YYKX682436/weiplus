package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* loaded from: classes7.dex */
public class d implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f158341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i11.e f158342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.e f158343f;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.e eVar, long j17, i11.e eVar2) {
        this.f158343f = eVar;
        this.f158341d = j17;
        this.f158342e = eVar2;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.e eVar = this.f158343f;
        eVar.f158346e.f158411n = java.lang.System.currentTimeMillis() - this.f158341d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation, location resp, isOk:%b, longitude:%f, latitude:%f, cost:%d", java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Long.valueOf(eVar.f158346e.f158411n));
        ((i11.h) this.f158342e).m(this);
        if (!z17) {
            eVar.f158346e.f158408k = 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, get location error");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.e(eVar.f158348g, eVar.f158349h, eVar.f158350i, eVar.f158351m, eVar.f158352n, eVar.f158353o, null, eVar.f158346e, eVar.f158354p);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.g(null);
        gVar.f158367a = f17;
        gVar.f158368b = f18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.e(eVar.f158348g, eVar.f158349h, eVar.f158350i, eVar.f158351m, eVar.f158352n, eVar.f158353o, gVar, eVar.f158346e, eVar.f158354p);
        return false;
    }
}
