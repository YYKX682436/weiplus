package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class b implements tx5.c {

    /* renamed from: a, reason: collision with root package name */
    public final y4.a f302078a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.sys.a f302079b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.sys.r f302080c;

    public b(y4.a aVar) {
        this.f302078a = aVar;
    }

    @Override // tx5.c
    /* renamed from: getCookieManager */
    public tx5.b mo120507x5ad7a0f3() {
        com.p314xaae8f345.p3210x3857dc.sys.a aVar = this.f302079b;
        if (aVar != null) {
            return aVar;
        }
        y4.a aVar2 = this.f302078a;
        if (aVar2 == null) {
            return null;
        }
        z4.t tVar = (z4.t) aVar2;
        if (!z4.e0.f551598g.b()) {
            throw z4.e0.a();
        }
        com.p314xaae8f345.p3210x3857dc.sys.a aVar3 = new com.p314xaae8f345.p3210x3857dc.sys.a(tVar.f551607a.m154346x5ad7a0f3());
        this.f302079b = aVar3;
        return aVar3;
    }

    @Override // tx5.c
    /* renamed from: getWebStorage */
    public tx5.e mo120508xb280207d() {
        com.p314xaae8f345.p3210x3857dc.sys.r rVar = this.f302080c;
        if (rVar != null) {
            return rVar;
        }
        y4.a aVar = this.f302078a;
        if (aVar == null) {
            return null;
        }
        z4.t tVar = (z4.t) aVar;
        if (!z4.e0.f551598g.b()) {
            throw z4.e0.a();
        }
        com.p314xaae8f345.p3210x3857dc.sys.r rVar2 = new com.p314xaae8f345.p3210x3857dc.sys.r(tVar.f551607a.m154350xb280207d());
        this.f302080c = rVar2;
        return rVar2;
    }
}
