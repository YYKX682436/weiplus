package sv2;

/* loaded from: classes10.dex */
public final class c0 extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494796h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f494797i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494796h = draftItem;
        this.f494797i = "LogPost.MvDraftPrepareStage";
    }

    @Override // pv2.g
    public int a() {
        return 1;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // ov2.e
    public pv2.g j() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494796h;
        sb6.append(x80Var.f66236x88be67a1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f494797i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        r45.qb4 m60705xa8f45ee4 = x80Var.m60705xa8f45ee4();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) t70Var.n2().r()).booleanValue() && com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "debug failed");
            t70Var.n2().o();
            return new sv2.a(x80Var, -1, -1, "failed for debug");
        }
        mv2.f0 f0Var = mv2.f0.f413094a;
        if (f0Var.m(m60705xa8f45ee4)) {
            return new sv2.a(x80Var, -1, -1, "try to post this feed too many times!");
        }
        boolean m59314x4d5c4d55 = x80Var.t0().m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 17L, 1L);
        if (m59314x4d5c4d55) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 17L, 1L);
            }
        }
        f0Var.v(x80Var);
        mv2.q.f413151a.n(x80Var);
        if (((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.f66236x88be67a1) != null) {
            return new sv2.b0(x80Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "post before mediaprocess cancel because feed is deleted");
        return new sv2.c(x80Var, 1);
    }
}
