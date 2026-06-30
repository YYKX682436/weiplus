package df2;

/* loaded from: classes3.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.y f313017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f313018e;

    public u(df2.y yVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f313017d = yVar;
        this.f313018e = y1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 1) {
            this.f313018e.s();
            return;
        }
        df2.o oVar = (df2.o) this.f313017d.getStore().m56798x25fe639c(df2.o.class);
        if (oVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(oVar, null, null, new df2.n(oVar, null), 3, null);
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f408878p);
    }
}
