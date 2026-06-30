package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 f289270d;

    public i2(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var) {
        this.f289270d = o2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean a17 = gm0.j1.a();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var = this.f289270d;
        if (!a17) {
            o2Var.G.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationAdapter", "dkpno handleDataChange acc has not ready");
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        o2Var.f();
        long currentTimeMillis2 = (java.lang.System.currentTimeMillis() - currentTimeMillis) * 3;
        int i17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2.I;
        boolean z18 = o2Var.F;
        long j17 = (currentTimeMillis2 + com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2.H) / 2;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2.H = j17;
        o2Var.F = false;
        o2Var.G.c(j17, j17);
    }
}
