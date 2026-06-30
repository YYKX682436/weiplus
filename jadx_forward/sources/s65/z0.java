package s65;

/* loaded from: classes11.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc f485102d;

    public z0(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc c20974x100c85cc) {
        this.f485102d = c20974x100c85cc;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc c20974x100c85cc = this.f485102d;
        if (((java.util.HashMap) c20974x100c85cc.f273866i).size() > 0) {
            java.util.Iterator it = ((java.util.HashMap) c20974x100c85cc.f273866i).values().iterator();
            while (it.hasNext()) {
                if (((s65.w) it.next()).d()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.UpdaterService", "checkAndTryStopSelf2, dont stop, some download mgr still busy");
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.j jVar = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273825a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "isCrashWorking process:" + bm5.f1.a());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.q()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExceptionMonitor", "isCrashWorking :" + com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273828d);
            z17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.k.f273828d;
        } else {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TBSDownloadMgr", "is still busy");
        } else {
            c20974x100c85cc.m77854x66357a6e();
        }
    }
}
