package wv2;

/* loaded from: classes10.dex */
public final class g extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f531545h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f531546i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f531545h = finderObj;
        this.f531546i = "LogPost.MvPostPrepareStage";
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f531545h;
        sb6.append(c14994x9b99c079.m59260x51f8f5b0());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f531546i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        r45.qb4 m59277xa8f45ee4 = c14994x9b99c079.m59277xa8f45ee4();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) t70Var.n2().r()).booleanValue() && com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "debug failed");
            t70Var.n2().o();
            return new tv2.a(c14994x9b99c079, Integer.MIN_VALUE, Integer.MIN_VALUE, "failed for debug");
        }
        mv2.f0 f0Var = mv2.f0.f413094a;
        if (f0Var.n(m59277xa8f45ee4)) {
            return new tv2.a(c14994x9b99c079, Integer.MIN_VALUE, Integer.MIN_VALUE, "try to post this feed too many times!");
        }
        boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 17L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 17L, 1L);
            }
        }
        f0Var.w(c14994x9b99c079);
        mv2.q.f413151a.o(c14994x9b99c079);
        if (m59277xa8f45ee4.m75939xb282bd08(2) == 1) {
            if (cu2.u.f303974a.k(c14994x9b99c079.m59260x51f8f5b0())) {
                return new wv2.f(c14994x9b99c079);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "post before doscene2 cancel because feed is deleted");
            return new wv2.n(c14994x9b99c079, 1);
        }
        if (cu2.u.f303974a.k(c14994x9b99c079.m59260x51f8f5b0())) {
            return new wv2.c(c14994x9b99c079);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "post before mediaprocess cancel because feed is deleted");
        return new wv2.n(c14994x9b99c079, 1);
    }
}
