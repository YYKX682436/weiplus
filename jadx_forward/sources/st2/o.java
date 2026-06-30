package st2;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(st2.h1 h1Var) {
        super(2);
        this.f493936d = h1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        l81.b1 b1Var = (l81.b1) obj2;
        if (b1Var != null) {
            st2.c2.f493782a.k(b1Var);
            st2.h1 h1Var = this.f493936d;
            st2.h1.b(h1Var, b1Var);
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = h1Var.f493870h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = lVar != null ? lVar.R0() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = R0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) R0 : null;
            ((c61.p2) ybVar).Kj(c14353xe7c1f419 != null ? c14353xe7c1f419.getReportObj() : null, 18054, zl2.r4.k0(zl2.r4.f555483a, h1Var.f493868f, 26, null, 0, null, 28, null));
            if (h1Var.f493867e.mo11219xd0598cf8() == 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("if_show_tip", h1Var.Y ? 1 : 0);
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.Dj((ml2.r0) c17, ml2.f4.f408967h, b1Var.f398567l, null, null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
                h1Var.Y = false;
            }
        }
        return jz5.f0.f384359a;
    }
}
