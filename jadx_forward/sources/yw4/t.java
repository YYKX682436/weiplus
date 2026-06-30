package yw4;

/* loaded from: classes7.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw4.u f548526d;

    public t(yw4.u uVar) {
        this.f548526d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[9];
        yw4.u uVar = this.f548526d;
        zq1.j0 j0Var = uVar.f548529c;
        objArr[0] = j0Var != null ? j0Var.f556537j : null;
        objArr[1] = java.lang.Integer.valueOf(j0Var != null ? j0Var.f556531d : 0);
        zq1.j0 j0Var2 = uVar.f548529c;
        objArr[2] = java.lang.Integer.valueOf(j0Var2 != null ? j0Var2.f556535h : 0);
        java.lang.String str = uVar.f548528b;
        objArr[3] = str;
        objArr[4] = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.a(str);
        objArr[5] = java.lang.Long.valueOf(uVar.f548530d);
        objArr[6] = java.lang.Long.valueOf(uVar.f548531e);
        objArr[7] = java.lang.Integer.valueOf(uVar.f548532f);
        objArr[8] = 1;
        g0Var.d(25512, objArr);
    }
}
