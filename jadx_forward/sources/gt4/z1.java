package gt4;

/* loaded from: classes9.dex */
public class z1 implements gt4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 f357119a;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577) {
        this.f357119a = c19151x10374577;
    }

    public void a(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577 = this.f357119a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onStartShakeOrClick, isShake: %s, isClickH5OrTinyApp: %s", valueOf, java.lang.Boolean.valueOf(c19151x10374577.f262279u));
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = 4;
            objArr[1] = java.lang.Integer.valueOf(c19151x10374577.f262279u ? 2 : 1);
            g0Var.d(15225, objArr);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = 7;
            objArr2[1] = java.lang.Integer.valueOf(c19151x10374577.f262279u ? 2 : 1);
            g0Var2.d(15225, objArr2);
        }
        c19151x10374577.f262273o.m73921x86175ad(c19151x10374577.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzy));
        c19151x10374577.f262273o.m73922xde5a4db6(c19151x10374577.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.b(c19151x10374577, 2, false);
        c19151x10374577.f262280v = true;
    }
}
