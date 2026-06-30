package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {
    public f(com.tencent.mm.booter.CoreService coreService) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "KeepAliveService.scheduleKeepAliveJob() flag:%s", java.lang.Boolean.valueOf(com.tencent.mm.booter.KeepAliveService.a()));
    }
}
