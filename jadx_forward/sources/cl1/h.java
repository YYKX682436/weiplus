package cl1;

/* loaded from: classes8.dex */
public class h implements dl1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f f124404a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f c12766x2cdb734f) {
        this.f124404a = c12766x2cdb734f;
    }

    public android.widget.ImageView a() {
        rh4.j0 j0Var;
        android.view.View n17;
        cl1.l0 l0Var = this.f124404a.I;
        if (l0Var == null || (j0Var = ((rh4.f0) l0Var).f477255a.f254248j2) == null || (n17 = j0Var.n()) == null) {
            return null;
        }
        return (android.widget.ImageView) n17.findViewById(com.p314xaae8f345.mm.R.id.jr6);
    }

    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f c12766x2cdb734f = this.f124404a;
        cl1.l0 l0Var = c12766x2cdb734f.I;
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopDragView", "isInAreaAndFromCommonUsedWeAppRecyclerView jacob InAreaFalse");
            return false;
        }
        if (!((rh4.f0) l0Var).a()) {
            return false;
        }
        ((rh4.f0) c12766x2cdb734f.I).getClass();
        return c1163xf1deaba4.getId() == com.p314xaae8f345.mm.R.id.r8w;
    }

    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f c12766x2cdb734f = this.f124404a;
        cl1.l0 l0Var = c12766x2cdb734f.I;
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopDragView", "jacob InAreaFalse");
            return false;
        }
        if (!((rh4.f0) l0Var).a()) {
            return false;
        }
        ((rh4.f0) c12766x2cdb734f.I).getClass();
        return c1163xf1deaba4.getId() == com.p314xaae8f345.mm.R.id.f568766nz1;
    }

    public int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18565x166dd6f4 c18565x166dd6f4;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80 = ((rh4.f0) this.f124404a.I).f477255a;
        rh4.j0 j0Var = c18566x5b11ed80.f254248j2;
        if (j0Var == null) {
            return -1;
        }
        if (j0Var.o()) {
            return c18566x5b11ed80.f254248j2.k();
        }
        rh4.o oVar = (rh4.o) c18566x5b11ed80.f254248j2.n();
        if (oVar == null || (c18565x166dd6f4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18565x166dd6f4) oVar.findViewById(com.p314xaae8f345.mm.R.id.f568765nz0)) == null) {
            return -1;
        }
        return c18565x166dd6f4.m71639xe6796cde().size();
    }
}
