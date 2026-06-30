package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class u1 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("type", Integer.MAX_VALUE);
        int intExtra2 = intent.getIntExtra("error", 0);
        if (intExtra == Integer.MAX_VALUE || intExtra2 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Shell", "kiro set Test.pushNextErrorRet(type=%d, err=%d)", java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2));
        java.util.HashMap hashMap = x51.o1.f452047c0;
        synchronized (hashMap) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) hashMap.get(java.lang.Integer.valueOf(intExtra));
            if (concurrentLinkedQueue == null) {
                concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                hashMap.put(java.lang.Integer.valueOf(intExtra), concurrentLinkedQueue);
            }
            concurrentLinkedQueue.add(java.lang.Integer.valueOf(intExtra2));
        }
    }
}
