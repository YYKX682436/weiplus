package tf5;

/* loaded from: classes11.dex */
public final class n implements vg3.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 f500538d;

    public n(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598) {
        this.f500538d = c22342xca74f598;
    }

    @Override // vg3.o3
    public void f(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmAddressUIFragment.IContactRelationUpdateCallback", "beforeAddOpenIMContact");
        com.p314xaae8f345.mm.ui.p2690x38b72420.q3 q3Var = this.f500538d.A;
        if (q3Var != null) {
            q3Var.b();
        }
    }

    @Override // vg3.o3
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmAddressUIFragment.IContactRelationUpdateCallback", "beforeAddContact");
    }

    @Override // vg3.o3
    public void q(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmAddressUIFragment.IContactRelationUpdateCallback", "beforeDelOpenIMContact");
        com.p314xaae8f345.mm.ui.p2690x38b72420.q3 q3Var = this.f500538d.A;
        if (q3Var != null) {
            q3Var.b();
        }
    }

    @Override // vg3.o3
    public void t(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmAddressUIFragment.IContactRelationUpdateCallback", "beforeDelContact");
    }
}
