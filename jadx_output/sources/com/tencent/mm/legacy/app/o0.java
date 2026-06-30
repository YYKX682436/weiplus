package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class o0 extends hm0.x {
    public o0(com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup) {
    }

    @Override // hm0.t
    public void b() {
        if (gm0.j1.a()) {
            nm.i iVar = (nm.i) nm.i.f338436g.b();
            iVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] bailAllPendingActionsToBeScheduled called.");
            nm.g gVar = iVar.f338438b;
            gVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] PendingActionScheduler.scheduleWatchDog called.");
            gVar.sendEmptyMessageDelayed(1, 10000);
        }
    }
}
