package zo1;

/* loaded from: classes5.dex */
public final class c3 implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f556104d = "";

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f556105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556106f;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8) {
        this.f556106f = activityC12872x8baa24f8;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String searchText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchText, "searchText");
        this.f556104d = searchText;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
        this.f556105e = false;
        this.f556104d = "";
        zo1.d3 d3Var = this.f556106f.f174393t;
        if (d3Var != null) {
            d3Var.r();
        }
        zo1.d3 d3Var2 = this.f556106f.f174393t;
        if (d3Var2 != null) {
            d3Var2.notifyDataSetChanged();
        }
        ((ku5.t0) ku5.t0.f394148d).q(new zo1.b3(this, this.f556106f));
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "onQuitSearch");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.T6(this.f556106f);
        this.f556105e = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
