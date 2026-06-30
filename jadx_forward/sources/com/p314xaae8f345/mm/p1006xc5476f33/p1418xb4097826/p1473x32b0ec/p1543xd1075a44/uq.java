package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class uq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wq f201520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f201522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wq wqVar, int i17, r45.h32 h32Var) {
        super(1);
        this.f201520d = wqVar;
        this.f201521e = i17;
        this.f201522f = h32Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.h32 it = (r45.h32) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wq wqVar = this.f201520d;
        java.lang.String str = wqVar.U;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("originSendType:");
        int i17 = this.f201521e;
        sb6.append(i17);
        sb6.append(" change send Type to: ");
        sb6.append(it.m75939xb282bd08(18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.f(k0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tq(i17, this.f201522f, wqVar, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
