package com.tencent.mm.console;

/* loaded from: classes10.dex */
public class u0 implements java.lang.Runnable {
    public u0(com.tencent.mm.console.v0 v0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "wakeTaskManuallyAsync");
        aw1.l0 l0Var = aw1.l0.f14568a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "wakeTaskManually");
        aw1.l0.f14572e = false;
        l0Var.n();
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "wakeTaskManuallyAsync done");
    }
}
