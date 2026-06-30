package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class s0 implements java.lang.Runnable {
    public s0(com.tencent.mm.booter.u0 u0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "checkKillProcess, canKillProcess :%b", java.lang.Boolean.valueOf(com.tencent.mm.booter.NotifyReceiver.f63264h));
        synchronized (com.tencent.mm.booter.NotifyReceiver.f63261e) {
            com.tencent.mars.comm.MMWakerLock mMWakerLock = com.tencent.mm.booter.NotifyReceiver.f63257a;
            if (mMWakerLock != null) {
                mMWakerLock.unLock();
            }
            com.tencent.mm.booter.NotifyReceiver.f63257a = null;
        }
        if (com.tencent.mm.booter.NotifyReceiver.f63264h) {
            ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
            com.tencent.mm.booter.notification.l0.f63501a.c(-1, null);
            com.tencent.mars.xlog.Log.appenderFlushSync();
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/booter/NotifyReceiver$NotifyIOnSceneEnd$2", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/booter/NotifyReceiver$NotifyIOnSceneEnd$2", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
