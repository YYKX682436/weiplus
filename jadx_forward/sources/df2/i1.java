package df2;

/* loaded from: classes3.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k1 f311908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f311909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f311910f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(df2.k1 k1Var, yl2.g1 g1Var, r45.tm1 tm1Var) {
        super(0);
        this.f311908d = k1Var;
        this.f311909e = g1Var;
        this.f311910f = tm1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        df2.k1 k1Var = this.f311908d;
        k1Var.o7(2);
        yl2.g1 g1Var = this.f311909e;
        k1Var.n7(2, k1Var.f312070p, java.lang.Long.valueOf(g1Var.f544543c));
        r45.tm1 tm1Var = this.f311910f;
        long m75939xb282bd08 = tm1Var.m75939xb282bd08(2);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = k1Var.f312073s;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        if (m75939xb282bd08 > 0) {
            df2.k1 k1Var2 = this.f311908d;
            k1Var2.f312073s = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(k1Var2, null, null, new df2.h1(m75939xb282bd08, k1Var2, null), 3, null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xy2.c.e(k1Var.O6()))) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_router_to_profile", false);
            intent.putExtra("key_create_scene", 3);
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.content.Context O6 = k1Var.O6();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = k1Var.N6();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).qj(O6, N6 != null ? N6.getIntent() : null);
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
            if (I1 != null && I1.v0()) {
                zl2.q4.f555466a.Q();
            } else {
                r45.sm1 sm1Var = (r45.sm1) tm1Var.m75936x14adae67(8);
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(k1Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df2.e1(sm1Var, g1Var, k1Var, null), 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
