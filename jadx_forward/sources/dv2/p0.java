package dv2;

/* loaded from: classes2.dex */
public final class p0 extends zx2.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.t0 f325460a;

    public p0(dv2.t0 t0Var) {
        this.f325460a = t0Var;
    }

    @Override // zx2.y, zx2.z
    public void a(android.content.Context context, zx2.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        super.a(context, tab);
        int i17 = tab.f558573a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTabSelected: index=");
        sb6.append(i17);
        sb6.append(", fragments size=");
        dv2.t0 t0Var = this.f325460a;
        sb6.append(t0Var.Y6().size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabViewAction", sb6.toString());
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) kz5.n0.a0(t0Var.Y6(), i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabViewAction", "Fragment at index " + i17 + ": " + abstractC15124x7bae6180);
            if (!(abstractC15124x7bae6180 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14067x53338e9a)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Fragment is not FinderPostPlaySquareContainerFragment: ");
                sb7.append(abstractC15124x7bae6180 != null ? abstractC15124x7bae6180.getClass().getSimpleName() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderTabViewAction", sb7.toString());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabViewAction", "Calling reloadData on second tab");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14067x53338e9a c14067x53338e9a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14067x53338e9a) abstractC15124x7bae6180;
                c14067x53338e9a.getClass();
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.zh(c14067x53338e9a));
            }
        }
    }
}
