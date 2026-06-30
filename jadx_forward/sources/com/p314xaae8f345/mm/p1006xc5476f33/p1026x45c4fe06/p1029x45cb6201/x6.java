package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes12.dex */
public abstract class x6 {
    public static void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y4 y4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y4(1, ((ku5.t0) ku5.t0.f394148d).p("SimpleAsyncQueueUnitTest"));
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(8);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(10);
        ((ku5.t0) ku5.t0.f394148d).getClass();
        ku5.f fVar = new ku5.f("SimpleAsyncQueueUnitTest", 10, 10, new java.util.concurrent.PriorityBlockingQueue(), new ku5.d());
        for (int i17 = 0; i17 < 10; i17++) {
            fVar.execute(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w6(5000, atomicInteger, y4Var, synchronizedList, scheduledThreadPoolExecutor, countDownLatch));
        }
        try {
            countDownLatch.await(100000, java.util.concurrent.TimeUnit.MILLISECONDS);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("list.size() == count: ");
            sb6.append(synchronizedList.size() == 10);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AsyncTaskQueue", sb6.toString());
            iz5.a.a(synchronizedList.size(), 10);
            int i18 = 0;
            while (i18 < synchronizedList.size()) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("list.get(i).intValue() == i: ");
                sb7.append(((java.lang.Integer) synchronizedList.get(i18)).intValue() == i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AsyncTaskQueue", sb7.toString());
                iz5.a.a(((java.lang.Integer) synchronizedList.get(i18)).intValue(), i18);
                i18++;
            }
            fVar.shutdown();
        } catch (java.lang.InterruptedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
