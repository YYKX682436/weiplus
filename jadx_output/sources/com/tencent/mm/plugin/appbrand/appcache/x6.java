package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes12.dex */
public abstract class x6 {
    public static void a() {
        com.tencent.mm.plugin.appbrand.utils.y4 y4Var = new com.tencent.mm.plugin.appbrand.utils.y4(1, ((ku5.t0) ku5.t0.f312615d).p("SimpleAsyncQueueUnitTest"));
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(8);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(10);
        ((ku5.t0) ku5.t0.f312615d).getClass();
        ku5.f fVar = new ku5.f("SimpleAsyncQueueUnitTest", 10, 10, new java.util.concurrent.PriorityBlockingQueue(), new ku5.d());
        for (int i17 = 0; i17 < 10; i17++) {
            fVar.execute(new com.tencent.mm.plugin.appbrand.appcache.w6(5000, atomicInteger, y4Var, synchronizedList, scheduledThreadPoolExecutor, countDownLatch));
        }
        try {
            countDownLatch.await(100000, java.util.concurrent.TimeUnit.MILLISECONDS);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("list.size() == count: ");
            sb6.append(synchronizedList.size() == 10);
            com.tencent.mars.xlog.Log.i("AsyncTaskQueue", sb6.toString());
            iz5.a.a(synchronizedList.size(), 10);
            int i18 = 0;
            while (i18 < synchronizedList.size()) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("list.get(i).intValue() == i: ");
                sb7.append(((java.lang.Integer) synchronizedList.get(i18)).intValue() == i18);
                com.tencent.mars.xlog.Log.i("AsyncTaskQueue", sb7.toString());
                iz5.a.a(((java.lang.Integer) synchronizedList.get(i18)).intValue(), i18);
                i18++;
            }
            fVar.shutdown();
        } catch (java.lang.InterruptedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
