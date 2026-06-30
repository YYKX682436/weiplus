package fo0;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final gp1.r f346340a;

    /* renamed from: b, reason: collision with root package name */
    public long f346341b;

    /* renamed from: c, reason: collision with root package name */
    public final fo0.e f346342c;

    public f(gp1.r rVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 1) != 0) {
            ((ov.i0) ((pv.e0) i95.n0.c(pv.e0.class))).getClass();
            rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d();
        }
        this.f346340a = rVar;
        this.f346342c = new fo0.e(this);
        rVar.b(21, "LiveFloatBall");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).t().f174619f = 15;
        rVar.e();
    }

    public final void a(android.graphics.Point newSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newSize, "newSize");
        gp1.r rVar = this.f346340a;
        android.graphics.Point point = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.f174584i;
        if (point != null && point.x == newSize.x) {
            android.graphics.Point point2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.f174584i;
            if (point2 != null && point2.y == newSize.y) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFloatBallHelper", "adjustFloatBallSize same donothing, width:" + newSize.x + ", height:" + newSize.y);
                return;
            }
        }
        e(newSize);
        rVar.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFloatBallHelper", "adjustFloatBallSize width:" + newSize.x + ", height:" + newSize.y);
    }

    public final void b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) this.f346340a).f174665d.G.remove("is_pause_replace_state");
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().L(21, this.f346342c);
    }

    public final void c() {
        gp1.r rVar = this.f346340a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174623m = 3;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h0(((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d);
    }

    public final void d(android.widget.FrameLayout frameLayout) {
        gp1.r rVar = this.f346340a;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).u()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFloatBallHelper", "removeVoipView, no ball, view:%s", frameLayout);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFloatBallHelper", "removeVoipView, has ball, view:%s", frameLayout);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f346341b = java.lang.System.currentTimeMillis();
        rVar.d();
    }

    public final void e(android.graphics.Point point) {
        gp1.r rVar = this.f346340a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.f174584i = new android.graphics.Point();
        com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.f174584i.x = point.x;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.f174584i.y = point.y;
        android.graphics.Point point2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.f174584i;
    }

    public final void f(fo0.t tVar) {
        gp1.r rVar = this.f346340a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174619f = tVar.f346385d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174620g = java.lang.String.valueOf(tVar.f346382a);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174621h = tVar.f346383b ? "1" : "2";
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174617d = tVar.f346384c;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174623m = tVar.f346386e;
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174619f;
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174620g;
        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174621h;
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.M.f174617d;
    }
}
