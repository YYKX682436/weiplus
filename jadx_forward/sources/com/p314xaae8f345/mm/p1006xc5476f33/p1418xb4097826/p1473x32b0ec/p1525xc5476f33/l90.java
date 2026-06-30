package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class l90 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xy2 f194900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 f194901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(r45.xy2 xy2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var, java.lang.Class cls) {
        super(cls);
        this.f194900b = xy2Var;
        this.f194901c = ea0Var;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.yy2 result = (r45.yy2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String m75945x2fec8307 = result.m75945x2fec8307(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = this.f194901c;
        if (m75945x2fec8307 != null) {
            if (m75945x2fec8307.length() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ea0Var.f193923t, "update request id: ".concat(m75945x2fec8307));
                ((mm2.c1) ea0Var.S0().a(mm2.c1.class)).y9(m75945x2fec8307);
            }
        }
        r45.xy2 xy2Var = this.f194900b;
        if (xy2Var.m75939xb282bd08(2) == 1) {
            xy2Var.set(2, 0);
            dk2.ef.f314925k.h(2, xy2Var);
        }
        so2.j5 j5Var = ((mm2.f6) ea0Var.S0().a(mm2.f6.class)).f410582w;
        r45.y23 y23Var = (r45.y23) result.m75936x14adae67(0);
        boolean z17 = j5Var instanceof cm2.m0;
        java.lang.String str = ea0Var.f193923t;
        if (z17 && y23Var != null) {
            cm2.m0 m0Var = (cm2.m0) j5Var;
            if (y23Var.m75942xfb822ef2(0) == m0Var.f124902w) {
                m0Var.f124901v = y23Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[updateCouponBubble] " + m0Var);
                qo0.b bVar = qo0.b.N2;
                android.os.Bundle bundle = new android.os.Bundle();
                r45.f52 J2 = zl2.r4.f555483a.J2(m0Var);
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", J2 != null ? J2.mo14344x5f01b1f6() : null);
                ea0Var.f193920q.mo46557x60d69242(bVar, bundle);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update fail,resp:");
        java.lang.Object obj = y23Var;
        if (y23Var == null) {
            obj = "";
        }
        sb6.append(pm0.b0.b(obj));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }
}
