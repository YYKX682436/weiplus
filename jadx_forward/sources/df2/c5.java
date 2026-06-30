package df2;

/* loaded from: classes3.dex */
public final class c5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d5 f311391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f311392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(df2.d5 d5Var, r45.tm1 tm1Var) {
        super(0);
        this.f311391d = d5Var;
        this.f311392e = tm1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.d5 d5Var = this.f311391d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = d5Var.f311476q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f408871f);
        df2.o oVar = (df2.o) d5Var.m56789x25fe639c(df2.o.class);
        if (oVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var = oVar.f312433q;
            if (q50Var == null) {
                q50Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50(oVar.O6(), oVar.getStore());
                oVar.f312433q = q50Var;
            }
            q50Var.f201034x1 = true;
            q50Var.V(null, false, 0);
        }
        long m75939xb282bd08 = this.f311392e.m75939xb282bd08(2);
        if (m75939xb282bd08 > 0) {
            df2.d5 d5Var2 = this.f311391d;
            d5Var2.f311476q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(d5Var2, null, null, new df2.b5(m75939xb282bd08, d5Var2, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
