package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class e0 extends com.tencent.mm.network.e1 {
    public e0(com.tencent.mm.app.d0 d0Var) {
    }

    @Override // com.tencent.mm.network.f1
    public boolean R0() {
        return true;
    }

    @Override // com.tencent.mm.network.f1
    public void Z8(com.tencent.mm.network.AccInfo accInfo) {
        if (accInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceConnection", "backup AccInfo, hash:%s CgiKeyLength:[%d,%d]", accInfo.E, java.lang.Integer.valueOf(accInfo.K()[0].length()), java.lang.Integer.valueOf(accInfo.K()[1].length()));
        }
        if (c01.b.b()) {
            try {
                gm0.j1.i();
                gm0.j1.b().f273243f.a(accInfo);
            } catch (java.lang.Throwable th6) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.AccInfoCacheInWorker", "tryBackupToWorker Exception:%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
            }
        }
    }
}
