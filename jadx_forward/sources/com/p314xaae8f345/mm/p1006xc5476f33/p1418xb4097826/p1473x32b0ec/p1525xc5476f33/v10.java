package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class v10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 f196168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f196169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov2 f196170f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var, r45.h32 h32Var, r45.ov2 ov2Var) {
        super(1);
        this.f196168d = z10Var;
        this.f196169e = h32Var;
        this.f196170f = ov2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd couponCallback = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(couponCallback, "couponCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var = this.f196168d;
        if (z10Var.f196801t) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String m75945x2fec8307 = this.f196169e.m75945x2fec8307(4);
            java.lang.String m75945x2fec83072 = this.f196170f.m75945x2fec8307(1);
            r0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.f4 f4Var = ml2.f4.f408964e;
            jSONObject.put("commerceAction", 1014);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            jSONObject.put("noticeid", m75945x2fec8307);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            jSONObject.put("coupon_id", m75945x2fec83072);
            ml2.r0.hj(r0Var, ml2.b4.f408797s, java.lang.String.valueOf(jSONObject), 0L, null, null, null, null, null, 252, null);
        }
        r45.ov2 ov2Var = couponCallback.f213422a;
        r45.l1 l1Var = (r45.l1) ov2Var.m75936x14adae67(19);
        if (l1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a.b(l1Var);
        }
        r45.h32 h32Var = z10Var.f196799r;
        if (h32Var != null) {
            zl2.t.f(h32Var, ov2Var);
        }
        z10Var.c();
        return jz5.f0.f384359a;
    }
}
