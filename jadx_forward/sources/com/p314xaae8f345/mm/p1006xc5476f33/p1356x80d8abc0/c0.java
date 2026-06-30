package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178366d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0 e0Var, java.lang.String str) {
        this.f178366d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = (gm0.j1.u().c().q(89, 0) == 1 ? 7 : 30) * 86400000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f178366d + "corrupted");
        if (r6Var.y()) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : r6Var.G()) {
                if (currentTimeMillis - r6Var2.B() < j17) {
                    return;
                }
            }
            if (com.p314xaae8f345.mm.vfs.w6.g(r6Var.u(), true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "Corrupted databases removed.");
            }
        }
    }
}
