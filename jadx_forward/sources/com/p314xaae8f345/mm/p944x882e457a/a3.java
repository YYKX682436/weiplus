package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class a3 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.c3 f152122d;

    public a3(com.p314xaae8f345.mm.p944x882e457a.c3 c3Var) {
        this.f152122d = c3Var;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.c3 c3Var = this.f152122d;
        if (c3Var.f152132g == 0) {
            c3Var.f152134i.d();
            c3Var.f152132g = 1;
            com.p314xaae8f345.mm.p944x882e457a.z2.a(c3Var.f152136n, c3Var.f152137o, i18, i19, str, c3Var.f152135m, c3Var.f152130e);
        } else {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c3Var.f152130e.hashCode());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c3Var.f152135m.f152246d);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RunCgi", "Has been callback by protect:%d func:%d time:%d [%d,%d,%s]", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c3Var.f152131f), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        }
        c3Var.f152129d.mo815x76e0bfae(i18, i19, str, c3Var.f152130e);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c3Var.f152130e.hashCode());
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c3Var.f152135m.f152246d);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RunCgi", "onGYNetEnd:%d func:%d time:%d [%d,%d,%s]", valueOf3, valueOf4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c3Var.f152131f), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
    }
}
