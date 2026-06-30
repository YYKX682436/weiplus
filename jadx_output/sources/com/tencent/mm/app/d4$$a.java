package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class d4$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        gj.k kVar = gj.k.f272354q;
        gj.j jVar = new gj.j(kVar.f272358f, java.lang.System.currentTimeMillis() - 0);
        java.util.Queue queue = kVar.f272356d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) queue;
        if (concurrentLinkedQueue.size() == 200) {
            concurrentLinkedQueue.poll();
        }
        concurrentLinkedQueue.offer(jVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedQueue) queue).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17++;
            sb6.append((gj.j) it.next());
            sb6.append("\n");
            if (i17 % 10 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMCrashReporter", "ANR History Message = " + ((java.lang.Object) sb6));
                sb6 = new java.lang.StringBuilder();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMCrashReporter", "ANR History Message end = " + ((java.lang.Object) sb6));
    }
}
