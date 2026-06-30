package sr2;

/* loaded from: classes10.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        super(0);
        this.f493155d = c14609xb4d6eef6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493155d;
        boolean z17 = false;
        if (c14609xb4d6eef6.K == 5 && ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SHOW_SELF_FEED_LIKE_TIPS_TIMES_INT;
            int r17 = c17.r(u3Var, 0);
            if (r17 < 3) {
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
            }
        }
        r45.q23 q23Var = c14609xb4d6eef6.k7().P;
        if (q23Var != null && q23Var.f465119e == 3) {
            z17 = true;
        }
        ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "markStartPost");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257090k <= 0) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257090k = android.os.SystemClock.elapsedRealtime();
        }
        if (z17) {
            op4.a.f428793a.a(3);
        }
        c14609xb4d6eef6.a7();
        return jz5.f0.f384359a;
    }
}
