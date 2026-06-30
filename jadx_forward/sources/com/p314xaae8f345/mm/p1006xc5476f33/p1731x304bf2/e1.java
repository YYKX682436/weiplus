package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 f220976d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var) {
        this.f220976d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var = this.f220976d;
        if (!l1Var.f221004g) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.GameLiteAppStoreService", "cancal delay release store, after enter foreground");
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l1Var.f221001d)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1.Ai(l1Var);
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.GameLiteAppStoreService", "delay release store, after enter background.");
        }
    }
}
