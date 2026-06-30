package sv2;

/* loaded from: classes10.dex */
public final class r extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494882h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f494883i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494882h = draftItem;
        this.f494883i = "LogPost.FinderDraftPrepareStage";
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ov2.e
    public pv2.g j() {
        java.lang.String str = "start localId:" + this.f494882h.f66236x88be67a1;
        java.lang.String str2 = this.f494883i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 D0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(this.f494882h.f66236x88be67a1);
        boolean z17 = true;
        if (D0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "draftItem is deleted, " + this.f494882h.v0());
            return new sv2.c(this.f494882h, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "refresh draftItem, " + this.f494882h.v0());
        this.f494882h = D0;
        r45.qb4 m60705xa8f45ee4 = D0.m60705xa8f45ee4();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) t70Var.n2().r()).booleanValue() && com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "debug failed");
            t70Var.n2().o();
            return new sv2.a(this.f494882h, -1, -1, "failed for debug");
        }
        mv2.f0 f0Var = mv2.f0.f413094a;
        if (f0Var.m(m60705xa8f45ee4)) {
            return new sv2.a(this.f494882h, -1, -1, "try to post this feed too many times!");
        }
        boolean m59314x4d5c4d55 = this.f494882h.t0().m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 17L, 1L);
        if (m59314x4d5c4d55) {
            g0Var.C(1719L, 17L, 1L);
        }
        f0Var.v(this.f494882h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "try post need upload task " + this.f494882h.f66236x88be67a1);
        if (this.f494882h.t0().m59240x7c94657b().m76802x2dd01666() == null) {
            return new sv2.q(this.f494882h, null, 2, 0 == true ? 1 : 0);
        }
        mv2.q.f413151a.n(this.f494882h);
        if ((((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(this.f494882h.f66236x88be67a1) != null) != true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "post before mediaprocess cancel because feed is deleted");
            return new sv2.c(this.f494882h, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.C).mo141623x754a37bb()).r()).booleanValue() && !((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.A).mo141623x754a37bb()).r()).booleanValue()) {
            z17 = false;
        }
        return z17 ? new sv2.n(this.f494882h) : new sv2.m(this.f494882h);
    }
}
