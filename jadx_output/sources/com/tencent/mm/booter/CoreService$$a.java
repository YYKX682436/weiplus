package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public final /* synthetic */ class CoreService$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.booter.l lVar = com.tencent.mm.booter.CoreService.f63234v;
        boolean z17 = com.tencent.mm.sdk.platformtools.x2.f193077g;
        boolean Ri = ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ri(com.tencent.mm.sdk.platformtools.w9.f193053a);
        if (z17 || !Ri) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CoreService", "pull up main proc: push_init, standby=" + z17 + ", alive=" + Ri);
            com.tencent.mm.booter.n.b("push_init");
        }
    }
}
