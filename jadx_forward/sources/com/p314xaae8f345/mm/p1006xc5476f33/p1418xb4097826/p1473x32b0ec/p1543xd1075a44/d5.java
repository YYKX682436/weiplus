package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class d5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf f199589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 f199590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var) {
        super(2);
        this.f199589d = cfVar;
        this.f199590e = e5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        mm2.n2 n2Var;
        r45.eq1 eq1Var;
        df2.od odVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String fansClubName = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fansClubName, "fansClubName");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (booleanValue) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
            if (c14197x319b1b9e != null && (odVar = (df2.od) c14197x319b1b9e.m56798x25fe639c(df2.od.class)) != null) {
                odVar.e7(r45.n72.kActionType_CreateFansClub);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar = this.f199589d;
            cfVar.e0();
            mm2.n2 n2Var2 = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var2 == null || (eq1Var = n2Var2.f410812g) == null) {
                f0Var = null;
            } else {
                eq1Var.set(0, fansClubName);
                eq1Var.set(1, java.lang.Boolean.TRUE);
                f0Var = f0Var2;
            }
            if (f0Var == null && (n2Var = (mm2.n2) efVar.i(mm2.n2.class)) != null) {
                r45.eq1 eq1Var2 = new r45.eq1();
                eq1Var2.set(0, fansClubName);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                eq1Var2.set(1, bool);
                eq1Var2.set(4, bool);
                n2Var.f410812g = eq1Var2;
            }
            gk2.e eVar = dk2.ef.I;
            if (eVar != null) {
                new ek2.z(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.e1) eVar.a(mm2.e1.class)).f410525v, xy2.c.e(cfVar.f199716e), 1, ((mm2.e1) eVar.a(mm2.e1.class)).f410518o, zl2.r4.f555483a.b0(eVar), 1, null, null, null, 1792, null).l();
            }
            this.f199590e.f199759a.h(null, true);
        }
        return f0Var2;
    }
}
