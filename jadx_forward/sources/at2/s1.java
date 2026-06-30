package at2;

/* loaded from: classes3.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.u1 f95284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(at2.u1 u1Var) {
        super(0);
        this.f95284d = u1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        at2.n1 n1Var;
        ws2.p2 p2Var;
        at2.u1 u1Var = this.f95284d;
        at2.u1.f95293s.a(u1Var.V0().f390662d.f150082s, u1Var.Y0());
        if (((ct2.j) u1Var.P0(ct2.j.class)).f303798f && (n1Var = (at2.n1) u1Var.X0(at2.n1.class)) != null) {
            boolean z17 = ((ct2.j) n1Var.P0(ct2.j.class)).C;
            java.lang.String str = n1Var.f95247p;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "ReplayTransition1:transition playing!");
            } else {
                ((ct2.j) n1Var.P0(ct2.j.class)).C = true;
                ((ct2.j) n1Var.P0(ct2.j.class)).V6(1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "ReplayTransition1:playTransition ready to play!");
                n1Var.R0().mo57479x2f73c7d7(true);
                if (n1Var.f95254w == null) {
                    n1Var.f95254w = new at2.e1(n1Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initTitleFadeTask!");
                }
                java.lang.Runnable runnable = n1Var.f95254w;
                android.view.ViewGroup viewGroup = n1Var.f446856d;
                viewGroup.removeCallbacks(runnable);
                viewGroup.postDelayed(n1Var.f95254w, 2000L);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f17 = ws2.k1.f530599r.a().f();
                if (f17 != null && (p2Var = (ws2.p2) f17.m56798x25fe639c(ws2.p2.class)) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p2Var.f530654m, "startReplayTransition");
                    p2Var.Z6();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
