package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
public class d implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f76808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i11.e f76809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundfetch.e f76810f;

    public d(com.tencent.mm.plugin.appbrand.backgroundfetch.e eVar, long j17, i11.e eVar2) {
        this.f76810f = eVar;
        this.f76808d = j17;
        this.f76809e = eVar2;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.e eVar = this.f76810f;
        eVar.f76813e.f76878n = java.lang.System.currentTimeMillis() - this.f76808d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation, location resp, isOk:%b, longitude:%f, latitude:%f, cost:%d", java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Long.valueOf(eVar.f76813e.f76878n));
        ((i11.h) this.f76809e).m(this);
        if (!z17) {
            eVar.f76813e.f76875k = 2;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, get location error");
            com.tencent.mm.plugin.appbrand.backgroundfetch.h.e(eVar.f76815g, eVar.f76816h, eVar.f76817i, eVar.f76818m, eVar.f76819n, eVar.f76820o, null, eVar.f76813e, eVar.f76821p);
            return false;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.g gVar = new com.tencent.mm.plugin.appbrand.backgroundfetch.g(null);
        gVar.f76834a = f17;
        gVar.f76835b = f18;
        com.tencent.mm.plugin.appbrand.backgroundfetch.h.e(eVar.f76815g, eVar.f76816h, eVar.f76817i, eVar.f76818m, eVar.f76819n, eVar.f76820o, gVar, eVar.f76813e, eVar.f76821p);
        return false;
    }
}
