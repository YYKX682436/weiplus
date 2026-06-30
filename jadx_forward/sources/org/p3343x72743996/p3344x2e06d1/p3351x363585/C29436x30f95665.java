package org.p3343x72743996.p3344x2e06d1.p3351x363585;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395)
/* renamed from: org.chromium.base.task.PostTask */
/* loaded from: classes13.dex */
public class C29436x30f95665 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73608x7118e671 = false;
    private static final java.lang.String TAG = "PostTask";

    /* renamed from: sNativeInitialized */
    private static volatile boolean f73609x5b65ae0a;

    /* renamed from: sPrenativeThreadPoolExecutorForTesting */
    private static volatile java.util.concurrent.Executor f73613x5ff67f07;

    /* renamed from: sTestIterationForTesting */
    static int f73614x2a93dfdf;

    /* renamed from: sUiThreadTaskExecutor */
    private static org.p3343x72743996.p3344x2e06d1.p3351x363585.C29452x5366e276 f73616xfc1d2b69;

    /* renamed from: sPreNativeTaskRunnerLock */
    private static final java.lang.Object f73610x999a9527 = new java.lang.Object();

    /* renamed from: sPreNativeTaskRunners */
    private static java.util.List<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5> f73611xbffe9217 = new java.util.ArrayList();

    /* renamed from: sPrenativeThreadPoolExecutor */
    private static org.p3343x72743996.p3344x2e06d1.p3351x363585.C29435x13318473 f73612x575081e0 = new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29435x13318473();

    /* renamed from: sThreadPoolTaskExecutor */
    private static final org.p3343x72743996.p3344x2e06d1.p3351x363585.C29451xb04489fe f73615x48c6231 = new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29451xb04489fe();

    /* renamed from: canRunTaskImmediately */
    public static boolean m152999x28fcf81e(int i17) {
        return m153005xe838aa00(i17).mo153025x28fcf81e(i17);
    }

    /* renamed from: createSequencedTaskRunner */
    public static org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29438x8d615618 m153000x3b26bb9c(int i17) {
        return m153005xe838aa00(i17).mo153026x3b26bb9c(i17);
    }

    /* renamed from: createSingleThreadTaskRunner */
    public static org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29441xc5d55347 m153001xb415cf43(int i17) {
        return m153005xe838aa00(i17).mo153027xb415cf43(i17);
    }

    /* renamed from: createTaskRunner */
    public static org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29445xaefae535 m153002xa4f87b31(int i17) {
        return m153005xe838aa00(i17).mo153028xa4f87b31(i17);
    }

    /* renamed from: flushJobsAndResetForTesting */
    public static void m153003x6935cbf9() {
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29435x13318473 c29435x13318473 = f73612x575081e0;
        int size = c29435x13318473.getQueue().size() + c29435x13318473.getActiveCount();
        if (size > 0) {
            c29435x13318473.shutdownNow();
            c29435x13318473.awaitTermination(1L, java.util.concurrent.TimeUnit.SECONDS);
            f73612x575081e0 = new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29435x13318473();
        }
        synchronized (f73610x999a9527) {
            java.util.List<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5> list = f73611xbffe9217;
            if (list != null) {
                java.util.Iterator<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5> it = list.iterator();
                while (it.hasNext()) {
                    size += it.next().m153036xa7228126();
                }
            }
            f73614x2a93dfdf++;
        }
        m153012xf7607bab();
        if (size > 0) {
            org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "%d background task(s) existed after test finished.", java.lang.Integer.valueOf(size));
        }
    }

    /* renamed from: getPrenativeThreadPoolExecutor */
    public static java.util.concurrent.Executor m153004xda1fbd1d() {
        return f73613x5ff67f07 != null ? f73613x5ff67f07 : f73612x575081e0;
    }

    /* renamed from: getTaskExecutorForTraits */
    private static org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198 m153005xe838aa00(int i17) {
        if (i17 < 6) {
            return f73615x48c6231;
        }
        if (f73616xfc1d2b69 == null) {
            org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152654xfa032576();
        }
        return f73616xfc1d2b69;
    }

    /* renamed from: onNativeSchedulerReady */
    private static void m153007xd227aa1e() {
        java.util.List<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5> list;
        if (f73609x5b65ae0a) {
            return;
        }
        f73609x5b65ae0a = true;
        synchronized (f73610x999a9527) {
            list = f73611xbffe9217;
            f73611xbffe9217 = null;
        }
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo153019x794ecdbc();
        }
    }

    /* renamed from: onUiThreadReady */
    public static void m153008x32926ae6(android.os.Handler handler) {
        f73616xfc1d2b69 = new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29452x5366e276(handler);
    }

    /* renamed from: postDelayedTask */
    public static void m153009x6a420547(int i17, java.lang.Runnable runnable, long j17) {
        m153005xe838aa00(i17).mo153029x6a420547(i17, runnable, j17);
    }

    /* renamed from: postTask */
    public static void m153010x2d1ef245(int i17, java.lang.Runnable runnable) {
        m153009x6a420547(i17, runnable, 0L);
    }

    /* renamed from: registerPreNativeTaskRunner */
    public static boolean m153011xc157edac(org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5 c29446x400e18f5) {
        synchronized (f73610x999a9527) {
            java.util.List<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5> list = f73611xbffe9217;
            if (list == null) {
                return false;
            }
            list.add(c29446x400e18f5);
            return true;
        }
    }

    /* renamed from: resetPrenativeThreadPoolExecutorForTesting */
    public static void m153012xf7607bab() {
        f73613x5ff67f07 = null;
    }

    /* renamed from: resetUiThreadForTesting */
    public static void m153013x614acd14() {
        f73616xfc1d2b69 = null;
    }

    /* renamed from: runOrPostTask */
    public static void m153014x4eeaf633(int i17, java.lang.Runnable runnable) {
        if (m153005xe838aa00(i17).mo153025x28fcf81e(i17)) {
            runnable.run();
        } else {
            m153010x2d1ef245(i17, runnable);
        }
    }

    @java.lang.Deprecated
    /* renamed from: runSynchronously */
    public static <T> T m153015x2b95c9cb(int i17, java.util.concurrent.Callable<T> callable) {
        return (T) m153017x39daf9a8(i17, new java.util.concurrent.FutureTask(callable));
    }

    /* renamed from: runSynchronouslyInternal */
    private static <T> T m153017x39daf9a8(int i17, java.util.concurrent.FutureTask<T> futureTask) {
        m153014x4eeaf633(i17, futureTask);
        try {
            return futureTask.get();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: setPrenativeThreadPoolExecutorForTesting */
    public static void m153018x311ddc78(java.util.concurrent.Executor executor) {
        f73613x5ff67f07 = executor;
        org.p3343x72743996.p3344x2e06d1.C29364x88e8a208.m152639xd6dc2ea3(new org.p3343x72743996.p3344x2e06d1.p3351x363585.RunnableC29437x27ad5f5c());
    }

    @java.lang.Deprecated
    /* renamed from: runSynchronously */
    public static void m153016x2b95c9cb(int i17, java.lang.Runnable runnable) {
        m153017x39daf9a8(i17, new java.util.concurrent.FutureTask(runnable, null));
    }
}
