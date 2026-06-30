package ap1;

/* loaded from: classes5.dex */
public final class h1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f94206d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f94207e = "";

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f94208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f94209g;

    public h1(ap1.p1 p1Var) {
        this.f94209g = p1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String searchText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchText, "searchText");
        this.f94207e = searchText;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
        ap1.p1 p1Var = this.f94209g;
        this.f94208f = pf5.e.m158343xd39de650(p1Var, null, null, new ap1.g1(this, p1Var, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamSearchContactUIC", "onQuitSearch");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f94208f;
        if (r2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchJob");
            throw null;
        }
        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        ap1.p1 p1Var = this.f94209g;
        ap1.i1 i1Var = p1Var.f94255d;
        if (i1Var != null) {
            i1Var.r();
        }
        this.f94206d = "";
        this.f94207e = "";
        ap1.p1.T6(p1Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
