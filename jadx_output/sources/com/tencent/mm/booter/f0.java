package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public class f0 implements java.lang.Runnable {
    public f0(com.tencent.mm.booter.MMReceivers$AlarmReceiver mMReceivers$AlarmReceiver) {
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.autogen.events.PushKeepAliveEvent().b(android.os.Looper.getMainLooper());
        com.tencent.mars.xlog.Log.i("MicroMsg.AlarmReceiver", "onReceive() publish PushKeepAliveEvent");
    }
}
