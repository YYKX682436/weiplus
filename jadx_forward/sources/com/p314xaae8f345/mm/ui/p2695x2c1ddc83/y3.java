package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 f289794d;

    public y3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 b4Var) {
        this.f289794d = b4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean a17 = gm0.j1.a();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4 b4Var = this.f289794d;
        if (!a17) {
            b4Var.C.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnterpriseConversationAdapter", "dkpno handleDataChange acc has not ready");
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        b4Var.f();
        long currentTimeMillis2 = (java.lang.System.currentTimeMillis() - currentTimeMillis) * 3;
        int i17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4.E;
        boolean z18 = b4Var.B;
        long j17 = (currentTimeMillis2 + com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4.D) / 2;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4.D = j17;
        b4Var.B = false;
        b4Var.C.c(j17, j17);
    }
}
