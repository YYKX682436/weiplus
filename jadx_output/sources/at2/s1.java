package at2;

/* loaded from: classes3.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.u1 f13751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(at2.u1 u1Var) {
        super(0);
        this.f13751d = u1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        at2.n1 n1Var;
        ws2.p2 p2Var;
        at2.u1 u1Var = this.f13751d;
        at2.u1.f13760s.a(u1Var.V0().f309129d.f68549s, u1Var.Y0());
        if (((ct2.j) u1Var.P0(ct2.j.class)).f222265f && (n1Var = (at2.n1) u1Var.X0(at2.n1.class)) != null) {
            boolean z17 = ((ct2.j) n1Var.P0(ct2.j.class)).C;
            java.lang.String str = n1Var.f13714p;
            if (z17) {
                com.tencent.mars.xlog.Log.w(str, "ReplayTransition1:transition playing!");
            } else {
                ((ct2.j) n1Var.P0(ct2.j.class)).C = true;
                ((ct2.j) n1Var.P0(ct2.j.class)).V6(1);
                com.tencent.mars.xlog.Log.i(str, "ReplayTransition1:playTransition ready to play!");
                n1Var.R0().hideLoadingLayer(true);
                if (n1Var.f13721w == null) {
                    n1Var.f13721w = new at2.e1(n1Var);
                    com.tencent.mars.xlog.Log.i(str, "initTitleFadeTask!");
                }
                java.lang.Runnable runnable = n1Var.f13721w;
                android.view.ViewGroup viewGroup = n1Var.f365323d;
                viewGroup.removeCallbacks(runnable);
                viewGroup.postDelayed(n1Var.f13721w, 2000L);
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f17 = ws2.k1.f449066r.a().f();
                if (f17 != null && (p2Var = (ws2.p2) f17.controller(ws2.p2.class)) != null) {
                    com.tencent.mars.xlog.Log.i(p2Var.f449121m, "startReplayTransition");
                    p2Var.Z6();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
