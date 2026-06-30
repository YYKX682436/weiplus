package l63;

/* loaded from: classes9.dex */
public class g implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m63.f f398306d;

    public g(l63.h hVar, m63.f fVar) {
        this.f398306d = fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.g73 g73Var;
        if (i17 != 0 || i18 != 0 || (g73Var = (r45.g73) oVar.f152244b.f152233a) == null) {
            return 0;
        }
        java.lang.String str2 = g73Var.f456475d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i9 i9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i9) this.f398306d;
        i9Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgGameShare", "readtext callback read is nullornil");
            return 0;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = i9Var.f285705a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.m124847x74d37ac6());
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgGameShare", "null == content");
            return 0;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0 g0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0) v17.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0.class);
        g0Var.f273171j = str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        v17.f(g0Var);
        g0Var.c(sb6, v17, null, null, 0, 0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o9.a(sb6, Li);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), Li, true);
        return 0;
    }
}
