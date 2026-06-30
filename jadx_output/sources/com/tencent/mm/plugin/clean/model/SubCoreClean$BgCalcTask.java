package com.tencent.mm.plugin.clean.model;

/* loaded from: classes12.dex */
public class SubCoreClean$BgCalcTask extends h04.a {
    @Override // h04.a
    public void onTaskCanceled() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "BgCalcTask canceled");
        if (bw1.u.f24844i) {
            return;
        }
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.e eVar = mt1.b0.f331195e;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // h04.a
    public boolean onTaskExecute(android.os.CancellationSignal cancellationSignal) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "BgCalcTask invoked, wait for account ready...");
        if (bw1.u.f24844i) {
            return !cancellationSignal.isCanceled();
        }
        bw1.u.wi().requireAccountInitialized();
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.e eVar = mt1.b0.f331195e;
        if (eVar != null) {
            eVar.a();
        }
        boolean x17 = b0Var.x();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreClean", "BgCalcTask done");
        return x17;
    }
}
