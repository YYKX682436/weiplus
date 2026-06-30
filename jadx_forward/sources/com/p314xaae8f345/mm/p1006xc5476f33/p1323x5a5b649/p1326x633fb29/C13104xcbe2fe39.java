package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1326x633fb29;

/* renamed from: com.tencent.mm.plugin.clean.model.SubCoreClean$BgCalcTask */
/* loaded from: classes12.dex */
public class C13104xcbe2fe39 extends h04.a {
    @Override // h04.a
    /* renamed from: onTaskCanceled */
    public void mo45117xe8454bd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "BgCalcTask canceled");
        if (bw1.u.f106377i) {
            return;
        }
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.e eVar = mt1.b0.f412728e;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // h04.a
    /* renamed from: onTaskExecute */
    public boolean mo45118x3e7092d1(android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "BgCalcTask invoked, wait for account ready...");
        if (bw1.u.f106377i) {
            return !cancellationSignal.isCanceled();
        }
        bw1.u.wi().m134976x2690a4ac();
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.e eVar = mt1.b0.f412728e;
        if (eVar != null) {
            eVar.a();
        }
        boolean x17 = b0Var.x();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreClean", "BgCalcTask done");
        return x17;
    }
}
