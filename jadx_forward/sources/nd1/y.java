package nd1;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f417956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nd1.c0 f417957e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, nd1.c0 c0Var) {
        this.f417956d = o6Var;
        this.f417957e = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f417956d;
        boolean q17 = o6Var.H2.q();
        nd1.c0 c0Var = this.f417957e;
        if (!q17) {
            nd1.c0.D(c0Var, o6Var, false);
            return;
        }
        nd1.x xVar = new nd1.x(o6Var, c0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = o6Var.H2;
        l0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.t(xVar, l0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = l0Var.f172731d;
        if (f0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0.e0(f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172601h, tVar, false, 4, null);
        }
    }
}
