package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public class b0 implements java.lang.Runnable {
    public b0(com.tencent.mm.booter.KeepAliveService keepAliveService) {
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.autogen.events.PushKeepAliveEvent().b(android.os.Looper.getMainLooper());
        com.tencent.mars.xlog.Log.i("MicroMsg.KeepAliveService", "onReceive() publish PushKeepAliveEvent");
    }
}
