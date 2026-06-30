package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1;

/* renamed from: com.tencent.thumbplayer.core.utils.TPThreadPoolExecutor */
/* loaded from: classes13.dex */
public class C26453x1efb5bd5 {

    /* renamed from: QUEUE_CAPACITY */
    private static final int f53767x334a9448 = 20;
    private static final java.lang.String TAG = "TPCore[TPThreadPoolExecutor]";

    /* renamed from: THREAD_KEEP_ALIVE_TIME */
    private static final long f53768x6b5b07e4 = 60;

    /* renamed from: THREAD_POOL_NAME */
    private static final java.lang.String f53769x5204c4d9 = "TP-Thread";

    /* renamed from: com.tencent.thumbplayer.core.utils.TPThreadPoolExecutor$CustomRejectedExecutionHandler */
    /* loaded from: classes13.dex */
    public static class CustomRejectedExecutionHandler implements java.util.concurrent.RejectedExecutionHandler {
        private CustomRejectedExecutionHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26453x1efb5bd5.TAG, "rejectedExecution put task to queue");
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26453x1efb5bd5.TAG, "rejectedExecution has exception:" + e17.toString());
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.utils.TPThreadPoolExecutor$CustomThreadFactory */
    /* loaded from: classes13.dex */
    public static class CustomThreadFactory implements java.util.concurrent.ThreadFactory {

        /* renamed from: threadAtomicCount */
        private java.util.concurrent.atomic.AtomicInteger f53770x14a1fd3a;

        private CustomThreadFactory() {
            this.f53770x14a1fd3a = new java.util.concurrent.atomic.AtomicInteger(0);
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26453x1efb5bd5.f53769x5204c4d9 + this.f53770x14a1fd3a.incrementAndGet());
            return thread;
        }
    }

    /* renamed from: newCustomThreadExecutor */
    public static java.util.concurrent.ExecutorService m102989x7e198c8e(int i17, int i18) {
        return new java.util.concurrent.ThreadPoolExecutor(i17, i18, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(20), new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26453x1efb5bd5.CustomThreadFactory(), new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26453x1efb5bd5.CustomRejectedExecutionHandler());
    }
}
