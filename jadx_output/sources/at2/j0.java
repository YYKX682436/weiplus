package at2;

/* loaded from: classes3.dex */
public final class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f13694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at2.q0 f13695e;

    public j0(com.tencent.mm.ui.widget.dialog.k0 k0Var, at2.q0 q0Var) {
        this.f13694d = k0Var;
        this.f13695e = q0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f13694d.o(null);
        g4Var.clear();
        at2.q0 q0Var = this.f13695e;
        boolean T6 = ((ct2.j) q0Var.P0(ct2.j.class)).T6();
        android.view.ViewGroup viewGroup = q0Var.f365323d;
        if (T6) {
            ct2.j jVar = (ct2.j) q0Var.P0(ct2.j.class);
            int i17 = jVar.f222277u;
            if (i17 != -1 ? i17 == 5 : jVar.P6().getInteger(31) == 5) {
                g4Var.g(6, viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.eag), com.tencent.mm.R.raw.icons_outlined_eyes_on);
            } else {
                g4Var.g(7, viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.eaf), com.tencent.mm.R.raw.icons_outlined_eyes_off);
            }
            g4Var.g(8, viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.eae), com.tencent.mm.R.raw.icons_outlined_delete);
        } else {
            g4Var.g(4, viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491699dy4), com.tencent.mm.R.raw.icons_outlined_report_problem);
        }
        if (!((mm2.d1) q0Var.P0(mm2.d1.class)).O6() || ((ct2.j) q0Var.P0(ct2.j.class)).T6()) {
            return;
        }
        g4Var.b(9, com.tencent.mm.R.string.egf, com.tencent.mm.R.raw.finder_live_ticket_icon_in_live);
    }
}
