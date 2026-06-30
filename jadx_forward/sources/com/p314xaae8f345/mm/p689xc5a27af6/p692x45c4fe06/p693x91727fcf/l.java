package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes7.dex */
public final class l implements ft.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f146618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k f146619e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar, com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.t tVar) {
        this.f146619e = kVar;
        java.util.Collection<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s> h17 = kVar.h();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(h17, 10));
        for (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar : h17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(sVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
            tVar.getClass();
            arrayList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.s((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) sVar));
        }
        this.f146618d = arrayList;
    }

    @Override // ft.b
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = this.f146619e;
        kVar.j();
        return kVar.l();
    }

    @Override // ft.b
    public void b() {
        this.f146619e.m();
    }

    @Override // ft.b
    /* renamed from: d */
    public ft.d getF146573f() {
        return this.f146619e.f129175c == com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129160f ? ft.d.WAGAME : ft.d.WASERVICE;
    }

    @Override // ft.b
    public void e() {
        if (!((java.util.ArrayList) this.f146618d).isEmpty()) {
            java.lang.String i17 = this.f146619e.i();
            if (i17 == null) {
                return;
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(i17, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u1.class, null);
            return;
        }
        java.lang.String f146571d = getF146571d();
        if (f146571d == null) {
            f146571d = "";
        }
        if (r26.i0.n(f146571d, "appbrand1", false) && com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229371c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessManagerServiceImpl", "releasePreloadedAndSparedEnvironment skip appbrand1 for mb2.0");
        } else {
            b();
        }
    }

    @Override // ft.b
    /* renamed from: f */
    public java.lang.String getF146571d() {
        return this.f146619e.i();
    }

    @Override // ft.b
    /* renamed from: g */
    public java.util.List getF146572e() {
        return this.f146618d;
    }

    @Override // ft.b
    public boolean h() {
        return this.f146619e.f170615m;
    }
}
