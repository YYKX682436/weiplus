package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes8.dex */
public class e1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, de0.g {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152849d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f152850e;

    public e1(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p957x53236a1b.z zVar = new com.p314xaae8f345.mm.p957x53236a1b.z();
        this.f152850e = zVar;
        o45.di diVar = (o45.di) zVar.mo47979x2d63726f();
        diVar.f424454a.f468393d = c01.z1.r();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17 == 0 ? 64 : i17);
        sb6.append(";");
        sb6.append(str == null ? "" : str);
        java.lang.String sb7 = sb6.toString();
        r45.ty5 ty5Var = diVar.f424454a;
        ty5Var.f468394e = sb7;
        java.lang.String str3 = ty5Var.f468394e;
        ty5Var.f468395f = 64;
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        ty5Var.f468397h = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152849d = u0Var;
        return mo9409x10f9447a(sVar, this.f152850e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 26;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        this.f152849d.mo815x76e0bfae(i18, i19, v0Var.mo13821x7f35c2d1().m150572x17ec12d2(), this);
    }

    public e1(java.lang.String str) {
        com.p314xaae8f345.mm.p957x53236a1b.z zVar = new com.p314xaae8f345.mm.p957x53236a1b.z();
        this.f152850e = zVar;
        o45.di diVar = (o45.di) zVar.mo47979x2d63726f();
        diVar.f424454a.f468393d = c01.z1.r();
        r45.ty5 ty5Var = diVar.f424454a;
        ty5Var.f468394e = str;
        ty5Var.f468396g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null));
        ty5Var.f468395f = 128;
    }

    public e1(java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27) {
        com.p314xaae8f345.mm.p957x53236a1b.z zVar = new com.p314xaae8f345.mm.p957x53236a1b.z();
        this.f152850e = zVar;
        o45.di diVar = (o45.di) zVar.mo47979x2d63726f();
        diVar.f424454a.f468393d = c01.z1.r();
        r45.ty5 ty5Var = diVar.f424454a;
        ty5Var.f468394e = str;
        ty5Var.f468396g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null));
        int i17 = (z17 ? 1 : 0) | 0 | (z18 ? 2 : 0) | (z19 ? 4 : 0) | (z27 ? 8 : 0);
        iz5.a.g("empty sendcard", i17 != 0);
        ty5Var.f468395f = i17;
    }
}
