package df2;

/* loaded from: classes3.dex */
public final class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f312739d;

    public r0(df2.v0 v0Var) {
        this.f312739d = v0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        df2.v0 v0Var = this.f312739d;
        if (itemId == 1) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = v0Var.N6();
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(N6, 155001, 1, 28, 1, false, null);
            df2.v0.Z6(v0Var, 2, df2.k0.f312064e);
            return;
        }
        if (itemId != 2) {
            return;
        }
        ya2.g gVar = ya2.h.f542017a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = v0Var.N6();
        ya2.b2 b17 = gVar.b(N62 != null ? xy2.c.e(N62) : null);
        if (b17 == null || (str = b17.f69301x81118c51) == null) {
            return;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            df2.v0.Z6(v0Var, 2, df2.k0.f312065f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(v0Var, null, null, new df2.q0(v0Var, str, null), 3, null);
        }
    }
}
