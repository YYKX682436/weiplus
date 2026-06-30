package zo1;

/* loaded from: classes5.dex */
public final class h2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 f556165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f556166e;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 activityC12869xafc66e3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f556165d = activityC12869xafc66e3;
        this.f556166e = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PackageDeleteConfirmUI", "on menu item clicked, idx=" + i17);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3.U6(this.f556165d);
        }
        this.f556166e.u();
    }
}
