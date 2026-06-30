package at2;

/* loaded from: classes3.dex */
public final class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f95227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at2.q0 f95228e;

    public j0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, at2.q0 q0Var) {
        this.f95227d = k0Var;
        this.f95228e = q0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        this.f95227d.o(null);
        g4Var.clear();
        at2.q0 q0Var = this.f95228e;
        boolean T6 = ((ct2.j) q0Var.P0(ct2.j.class)).T6();
        android.view.ViewGroup viewGroup = q0Var.f446856d;
        if (T6) {
            ct2.j jVar = (ct2.j) q0Var.P0(ct2.j.class);
            int i17 = jVar.f303810u;
            if (i17 != -1 ? i17 == 5 : jVar.P6().m75939xb282bd08(31) == 5) {
                g4Var.g(6, viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eag), com.p314xaae8f345.mm.R.raw.f80106x9bbc4e84);
            } else {
                g4Var.g(7, viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eaf), com.p314xaae8f345.mm.R.raw.f80105xdbcd816a);
            }
            g4Var.g(8, viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eae), com.p314xaae8f345.mm.R.raw.f80075x444ae503);
        } else {
            g4Var.g(4, viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573232dy4), com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec);
        }
        if (!((mm2.d1) q0Var.P0(mm2.d1.class)).O6() || ((ct2.j) q0Var.P0(ct2.j.class)).T6()) {
            return;
        }
        g4Var.b(9, com.p314xaae8f345.mm.R.C30867xcad56011.egf, com.p314xaae8f345.mm.R.raw.f79299x90587a79);
    }
}
