package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes7.dex */
public final class m implements ft.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f146623d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f146624e = new java.util.LinkedList();

    @Override // ft.b
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) kz5.n0.X(this.f146623d);
        kVar.j();
        return kVar.l();
    }

    @Override // ft.b
    public void b() {
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k> linkedList = this.f146623d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) kz5.n0.X(linkedList)).m();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar : linkedList) {
            kVar.getClass();
            kVar.f129175c = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g;
            kVar.a();
            kVar.j();
            kVar.f170616n = false;
        }
    }

    @Override // ft.b
    /* renamed from: d */
    public ft.d getF146573f() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.z0.f170755n, getF146571d()) ? ft.d.WASERVICE : ft.d.WAGAME;
    }

    @Override // ft.b
    public void e() {
        if (!this.f146624e.isEmpty()) {
            java.lang.String i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) kz5.n0.X(this.f146623d)).i();
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
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) kz5.n0.X(this.f146623d)).i();
    }

    @Override // ft.b
    /* renamed from: g */
    public java.util.List getF146572e() {
        return this.f146624e;
    }

    @Override // ft.b
    public boolean h() {
        java.util.LinkedList linkedList = this.f146623d;
        if ((linkedList instanceof java.util.Collection) && linkedList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) it.next()).f170615m) {
                return true;
            }
        }
        return false;
    }
}
