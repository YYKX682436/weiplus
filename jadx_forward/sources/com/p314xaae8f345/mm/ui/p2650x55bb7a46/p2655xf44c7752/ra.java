package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f282873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f282874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sa f282875f;

    public ra(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sa saVar, int i17, int i18) {
        this.f282875f = saVar;
        this.f282873d = i17;
        this.f282874e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sa saVar = this.f282875f;
        objArr[0] = java.lang.Integer.valueOf(saVar.f282904d.H);
        int i17 = this.f282873d;
        if (i17 <= 0) {
            i17 = saVar.f282904d.G * 1000;
        }
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(this.f282874e);
        objArr[3] = 1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = saVar.f282904d;
        objArr[4] = taVar.f282955J;
        objArr[5] = java.lang.Integer.valueOf(taVar.I);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar2 = saVar.f282904d;
        objArr[6] = taVar2.L;
        objArr[7] = java.lang.Long.valueOf(taVar2.K);
        g0Var.d(12084, objArr);
    }
}
