package df2;

/* loaded from: classes3.dex */
public final class s2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t2 f312816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f312817e;

    public s2(df2.t2 t2Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f312816d = t2Var;
        this.f312817e = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        df2.t2 t2Var = this.f312816d;
        t2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "realHangup");
        android.os.Bundle bundle = new android.os.Bundle();
        km2.q c76 = t2Var.c7();
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", c76 != null ? c76.f390708f : null);
        t2Var.X6(qo0.b.M3, bundle);
        this.f312817e.u();
    }
}
