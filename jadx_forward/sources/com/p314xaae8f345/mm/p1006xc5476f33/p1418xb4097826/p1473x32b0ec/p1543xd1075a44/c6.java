package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class c6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f199500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f199501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var, r45.xq1 xq1Var) {
        super(2);
        this.f199500d = d6Var;
        this.f199501e = xq1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.u24 it = (r45.u24) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f199500d;
        java.lang.String str = d6Var.f199595d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gamteam select value:");
        sb6.append(it.m75939xb282bd08(1));
        sb6.append(", tip:");
        sb6.append(it.m75945x2fec8307(0));
        sb6.append(", expose:");
        java.lang.String m75945x2fec8307 = it.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        sb6.append(m75945x2fec8307);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.xq1 xq1Var = this.f199501e;
        java.lang.Integer valueOf = xq1Var != null ? java.lang.Integer.valueOf(xq1Var.m75939xb282bd08(1)) : null;
        r45.o63 o63Var = new r45.o63();
        o63Var.f463513d = it.m75939xb282bd08(1);
        r45.j73 j73Var = new r45.j73();
        r45.j73 j73Var2 = (r45.j73) it.m75936x14adae67(2);
        j73Var.set(0, java.lang.Integer.valueOf(j73Var2 != null ? j73Var2.m75939xb282bd08(0) : 0));
        r45.j73 j73Var3 = (r45.j73) it.m75936x14adae67(2);
        j73Var.set(2, j73Var3 != null ? j73Var3.m75941xfb821914(2) : null);
        j73Var.set(1, java.lang.Integer.valueOf(intValue));
        o63Var.f463514e = j73Var;
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = d6Var.f199594c;
        dk2.xf j17 = efVar.j(lVar.R0());
        if (j17 != null) {
            android.content.Context context = d6Var.f199592a.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            long m75942xfb822ef2 = ((mm2.e1) lVar.S0().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            long j18 = ((mm2.e1) lVar.S0().a(mm2.e1.class)).f410516m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b6 b6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b6(this.f199500d, it, this.f199501e, intValue, valueOf);
            dk2.r4 r4Var = (dk2.r4) j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "setGameTeamMode liveId:" + m75942xfb822ef2 + " objectId:" + j18 + " gameTeamMode:" + o63Var);
            ke2.g gVar = new ke2.g(m75942xfb822ef2, j18, ((mm2.c1) r4Var.m(mm2.c1.class)).f410399q, xy2.c.e(context), 0, null, o63Var, null, null, 0L, new dk2.o3(b6Var, context), null, 2480, null);
            gVar.t(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
            pq5.g l17 = gVar.l();
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                l17.f((im5.b) context);
            }
        }
        return jz5.f0.f384359a;
    }
}
