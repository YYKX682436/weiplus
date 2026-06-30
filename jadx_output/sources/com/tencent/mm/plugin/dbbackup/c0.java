package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96833d;

    public c0(com.tencent.mm.plugin.dbbackup.e0 e0Var, java.lang.String str) {
        this.f96833d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = (gm0.j1.u().c().q(89, 0) == 1 ? 7 : 30) * 86400000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f96833d + "corrupted");
        if (r6Var.y()) {
            for (com.tencent.mm.vfs.r6 r6Var2 : r6Var.G()) {
                if (currentTimeMillis - r6Var2.B() < j17) {
                    return;
                }
            }
            if (com.tencent.mm.vfs.w6.g(r6Var.u(), true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "Corrupted databases removed.");
            }
        }
    }
}
