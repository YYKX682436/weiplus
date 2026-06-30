package or1;

/* loaded from: classes9.dex */
public class k0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 f429055d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871) {
        this.f429055d = c12980x8e9ea871;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871 = this.f429055d;
        if (c12980x8e9ea871.f175552x == null) {
            c12980x8e9ea871.f175552x = new or1.s0(c12980x8e9ea871);
        }
        or1.s0 s0Var = c12980x8e9ea871.f175552x;
        int i18 = c12980x8e9ea871.f175553y;
        int i19 = c12980x8e9ea871.f175554z;
        if (s0Var.f429101e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea8712 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871) s0Var.f429103g.get();
            if (c12980x8e9ea8712 == null) {
                return false;
            }
            s0Var.f429101e = new al5.y1(c12980x8e9ea8712.getContext());
        }
        java.lang.Object tag = view.getTag();
        if (tag == null || !(tag instanceof or1.u0)) {
            return false;
        }
        java.lang.String str = ((or1.u0) tag).f429111a;
        s0Var.f429100d = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str2 = s0Var.f429100d;
        ((qv.o) u2Var).getClass();
        if (r01.z.g(str2)) {
            return false;
        }
        al5.y1 y1Var = s0Var.f429101e;
        y1Var.f478883t = view;
        y1Var.g(adapterView, i17, j17, new or1.o0(s0Var, i17), new or1.p0(s0Var), i18, i19);
        return true;
    }
}
