package lc5;

/* loaded from: classes3.dex */
public final class u extends dp1.a {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 f399568m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e f399569n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f399570o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f399571p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.app.Activity activity, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e, android.view.View view, android.view.View view2) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f399568m = k1Var;
        this.f399569n = c21520x5bb48e5e;
        this.f399570o = view;
        this.f399571p = view2;
    }

    @Override // dp1.u, dp1.x
    public int o() {
        android.view.View z17 = z();
        return z17 != null ? z17.getHeight() : super.o();
    }

    @Override // dp1.u, dp1.x
    public android.view.View s() {
        return this.f399570o;
    }

    @Override // dp1.u, dp1.x
    public boolean t() {
        return false;
    }

    @Override // dp1.u, dp1.x
    public android.view.View u() {
        return z();
    }

    @Override // dp1.u, dp1.x
    public int v() {
        android.view.View z17 = z();
        return z17 != null ? z17.getWidth() : super.v();
    }

    public final android.view.View z() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f399569n;
        if (c21520x5bb48e5e != null) {
            return c21520x5bb48e5e;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f399568m;
        android.view.View view = null;
        if (k1Var == null || c21520x5bb48e5e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageFloatBallPageAdapter", "%d get current view but adapter or gallery is null", java.lang.Integer.valueOf(hashCode()));
        } else if (k1Var.w() != null) {
            if (k1Var.w().J2() || k1Var.w().o2()) {
                view = k1Var.c(c21520x5bb48e5e.m80830xfda78ef6(), true);
                if (view == null) {
                    view = k1Var.f(c21520x5bb48e5e.m80830xfda78ef6(), true);
                }
            } else if (k1Var.w().m78014x7b98c171() || k1Var.w().Y2() || k1Var.w().M2()) {
                view = k1Var.C(c21520x5bb48e5e.m80830xfda78ef6());
            }
        }
        return view;
    }
}
