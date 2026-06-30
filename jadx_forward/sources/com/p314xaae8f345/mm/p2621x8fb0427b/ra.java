package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public final class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.ra f276816d = new com.p314xaae8f345.mm.p2621x8fb0427b.ra();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 4);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (java.lang.System.currentTimeMillis() < calendar.getTimeInMillis()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "executeTask!");
            com.p314xaae8f345.mm.p2621x8fb0427b.va vaVar = com.p314xaae8f345.mm.p2621x8fb0427b.va.f277822a;
            long j17 = 600000;
            while (true) {
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = com.p314xaae8f345.mm.p2621x8fb0427b.va.f277824c;
                if (concurrentLinkedQueue.isEmpty() || !com.p314xaae8f345.mm.p2621x8fb0427b.va.f277823b || j17 <= 0) {
                    break;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "mTaskRunnableQueue, mTaskQueue.size = " + concurrentLinkedQueue.size());
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p2621x8fb0427b.ta taVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ta) concurrentLinkedQueue.poll();
                if (taVar != null) {
                    java.lang.Runnable runnable = taVar.f276873a;
                    if (runnable != null) {
                        runnable.run();
                    }
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "mTaskRunnableQueue, [" + taVar.f276874b + "], duration = " + currentTimeMillis2);
                    j17 -= currentTimeMillis2;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remainingTime = ");
                    sb6.append(j17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", sb6.toString());
                }
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.va.f277823b = false;
    }
}
