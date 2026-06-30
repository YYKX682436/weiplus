package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class z5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f202058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f202059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var, r45.z53 z53Var) {
        super(2);
        this.f202058d = d6Var;
        this.f202059e = z53Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.u24 it = (r45.u24) obj;
        ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f202058d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d6Var.f199595d, "select value:" + it.m75939xb282bd08(1) + ", tip:" + it.m75945x2fec8307(0));
        p012xc85e97e9.p093xedfae76a.j0 j0Var = ((mm2.c1) d6Var.f199594c.P0(mm2.c1.class)).f410366k6;
        java.lang.String m75945x2fec8307 = it.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        j0Var.mo7808x76db6cb1(m75945x2fec8307);
        r45.z53 z53Var = this.f202059e;
        if (z53Var != null) {
            z53Var.set(12, java.lang.Integer.valueOf(it.m75939xb282bd08(1)));
        }
        return jz5.f0.f384359a;
    }
}
