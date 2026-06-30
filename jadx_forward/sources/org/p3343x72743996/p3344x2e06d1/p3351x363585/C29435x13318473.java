package org.p3343x72743996.p3344x2e06d1.p3351x363585;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.task.ChromeThreadPoolExecutor */
/* loaded from: classes12.dex */
public class C29435x13318473 extends java.util.concurrent.ThreadPoolExecutor {

    /* renamed from: CORE_POOL_SIZE */
    private static final int f73600x354499a4;

    /* renamed from: CPU_COUNT */
    private static final int f73601x7aaa7b78;

    /* renamed from: KEEP_ALIVE_SECONDS */
    private static final int f73602x87d50993 = 30;

    /* renamed from: MAXIMUM_POOL_SIZE */
    private static final int f73603xce396ec5;

    /* renamed from: RUNNABLE_WARNING_COUNT */
    private static final int f73604x9a9cc8ca = 32;

    /* renamed from: sPoolWorkQueue */
    private static final java.util.concurrent.BlockingQueue<java.lang.Runnable> f73605xab6cce11;

    /* renamed from: sThreadFactory */
    private static final java.util.concurrent.ThreadFactory f73606x6ca37ded;

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        f73601x7aaa7b78 = availableProcessors;
        f73600x354499a4 = java.lang.Math.max(2, java.lang.Math.min(availableProcessors - 1, 4));
        f73603xce396ec5 = (availableProcessors * 2) + 1;
        f73606x6ca37ded = new java.util.concurrent.ThreadFactory() { // from class: org.chromium.base.task.ChromeThreadPoolExecutor.1

            /* renamed from: mCount */
            private final java.util.concurrent.atomic.AtomicInteger f73607xbde49ca2 = new java.util.concurrent.atomic.AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, "CrAsyncTask #" + this.f73607xbde49ca2.getAndIncrement());
            }
        };
        f73605xab6cce11 = new java.util.concurrent.ArrayBlockingQueue(128);
    }

    public C29435x13318473() {
        this(f73600x354499a4, f73603xce396ec5, 30L, java.util.concurrent.TimeUnit.SECONDS, f73605xab6cce11, f73606x6ca37ded);
    }

    /* renamed from: findClassNamesWithTooManyRunnables */
    private java.lang.String m152995x8bb12232(java.util.Map<java.lang.String, java.lang.Integer> map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() > 32) {
                sb6.append(entry.getKey());
                sb6.append(' ');
            }
        }
        return sb6.length() == 0 ? "NO CLASSES FOUND" : sb6.toString();
    }

    /* renamed from: getClassName */
    private static java.lang.String m152996xfed68d6d(java.lang.Runnable runnable) {
        java.lang.Class cls;
        java.lang.Class cls2 = runnable.getClass();
        try {
        } catch (java.lang.IllegalAccessException e17) {
            if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11) {
                throw new java.lang.RuntimeException(e17);
            }
        } catch (java.lang.NoSuchFieldException e18) {
            if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11) {
                throw new java.lang.RuntimeException(e18);
            }
        }
        if (cls2 != org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.NamedFutureTask.class) {
            if (cls2.getEnclosingClass() == android.os.AsyncTask.class) {
                java.lang.reflect.Field declaredField = cls2.getDeclaredField("this$0");
                declaredField.setAccessible(true);
                cls = declaredField.get(runnable).getClass();
            }
            return cls2.getName();
        }
        cls = ((org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.NamedFutureTask) runnable).m152990xde89502d();
        cls2 = cls;
        return cls2.getName();
    }

    /* renamed from: getNumberOfClassNameOccurrencesInQueue */
    private java.util.Map<java.lang.String, java.lang.Integer> m152997x2e1e62f7() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.Runnable runnable : (java.lang.Runnable[]) getQueue().toArray(new java.lang.Runnable[0])) {
            java.lang.String m152996xfed68d6d = m152996xfed68d6d(runnable);
            hashMap.put(m152996xfed68d6d, java.lang.Integer.valueOf((hashMap.containsKey(m152996xfed68d6d) ? ((java.lang.Integer) hashMap.get(m152996xfed68d6d)).intValue() : 0) + 1));
        }
        return hashMap;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            throw new java.util.concurrent.RejectedExecutionException("Prominent classes in AsyncTask: " + m152995x8bb12232(m152997x2e1e62f7()), e17);
        }
    }

    public C29435x13318473(int i17, int i18, long j17, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue, java.util.concurrent.ThreadFactory threadFactory) {
        super(i17, i18, j17, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }
}
