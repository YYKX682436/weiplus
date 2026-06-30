package org.p3343x72743996.p3344x2e06d1.p3351x363585;

/* renamed from: org.chromium.base.task.AsyncTask */
/* loaded from: classes13.dex */
public abstract class AbstractC29429x11a92e01<Result> {

    /* renamed from: GET_STATUS_UMA_HISTOGRAM */
    private static final java.lang.String f73576x87a7610a = "Android.Jank.AsyncTaskGetOnUiThreadStatus";
    private static final java.lang.String TAG = "AsyncTask";

    /* renamed from: mFuture */
    private final org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01<Result>.NamedFutureTask f73581x421b490;

    /* renamed from: mWorker */
    private final java.util.concurrent.Callable<Result> f73585x20ce7a4b;

    /* renamed from: THREAD_POOL_EXECUTOR */
    public static final java.util.concurrent.Executor f73579x921e6421 = new org.p3343x72743996.p3344x2e06d1.p3351x363585.ExecutorC29431x36a11241();

    /* renamed from: SERIAL_EXECUTOR */
    public static final java.util.concurrent.Executor f73577x9c3b1abe = new org.p3343x72743996.p3344x2e06d1.p3351x363585.ExecutorC29440x6dd5f307();

    /* renamed from: STEAL_RUNNABLE_HANDLER */
    private static final org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.StealRunnableHandler f73578xf8d00d18 = new org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.StealRunnableHandler();

    /* renamed from: mStatus */
    private volatile int f73583x1a39f6bf = 0;

    /* renamed from: mCancelled */
    private final java.util.concurrent.atomic.AtomicBoolean f73580x971f7364 = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: mTaskInvoked */
    private final java.util.concurrent.atomic.AtomicBoolean f73584x8f6c6efa = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: mIterationIdForTesting */
    private int f73582x4f732192 = org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.f73614x2a93dfdf;

    /* renamed from: org.chromium.base.task.AsyncTask$NamedFutureTask */
    /* loaded from: classes13.dex */
    public class NamedFutureTask extends java.util.concurrent.FutureTask<Result> {
        public NamedFutureTask(java.util.concurrent.Callable<Result> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.this.m152976x43242313(get());
            } catch (java.lang.InterruptedException e17) {
                org.p3343x72743996.p3344x2e06d1.Log.w(org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.TAG, e17.toString());
            } catch (java.util.concurrent.CancellationException unused) {
                org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.this.m152976x43242313(null);
            } catch (java.util.concurrent.ExecutionException e18) {
                throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e18.getCause());
            }
        }

        /* renamed from: getBlamedClass */
        public java.lang.Class m152990xde89502d() {
            return org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.this.getClass();
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            try {
                org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("AsyncTask.run: ".concat(org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.this.f73581x421b490.m152990xde89502d().getName()));
                try {
                    super.run();
                    if (m152702xc9e48c90 != null) {
                        m152702xc9e48c90.close();
                    }
                } finally {
                }
            } finally {
                java.lang.Thread.interrupted();
            }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.base.task.AsyncTask$Status */
    /* loaded from: classes6.dex */
    public @interface Status {

        /* renamed from: FINISHED */
        public static final int f73588x67eb072 = 2;

        /* renamed from: NUM_ENTRIES */
        public static final int f73589x6b242097 = 3;

        /* renamed from: PENDING */
        public static final int f73590x21c1577 = 0;

        /* renamed from: RUNNING */
        public static final int f73591x873aa19f = 1;
    }

    /* renamed from: org.chromium.base.task.AsyncTask$StealRunnableHandler */
    /* loaded from: classes13.dex */
    public static class StealRunnableHandler implements java.util.concurrent.RejectedExecutionHandler {
        private StealRunnableHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.f73579x921e6421.execute(runnable);
        }
    }

    public AbstractC29429x11a92e01() {
        java.util.concurrent.Callable<Result> callable = new java.util.concurrent.Callable<Result>() { // from class: org.chromium.base.task.AsyncTask.1
            @Override // java.util.concurrent.Callable
            public Result call() {
                org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.this.f73584x8f6c6efa.set(true);
                Result result = null;
                try {
                    result = (Result) org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.this.m152979xf8c9bc5e();
                    android.os.Binder.flushPendingCommands();
                    return result;
                } finally {
                }
            }
        };
        this.f73585x20ce7a4b = callable;
        this.f73581x421b490 = new org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.NamedFutureTask(callable);
    }

    /* renamed from: executionPreamble */
    private void m152971x43f04424() {
        if (this.f73583x1a39f6bf != 0) {
            int i17 = this.f73583x1a39f6bf;
            if (i17 == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i17 == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f73583x1a39f6bf = 1;
        m152989xbe208e91();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m152973xf336c7e7(Result result) {
        if (m152985x62a56b47()) {
            m152987x1a926632(result);
        } else {
            mo152988xedcc8b56(result);
        }
        this.f73583x1a39f6bf = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: postResult */
    public void m152975x5dfa54dd(final Result result) {
        if (this instanceof org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29432x3b9ffd27) {
            this.f73583x1a39f6bf = 2;
        } else if (this.f73582x4f732192 == org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.f73614x2a93dfdf) {
            org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152659x5d0197d(new java.lang.Runnable() { // from class: org.chromium.base.task.AsyncTask$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.this.m152973xf336c7e7(result);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: postResultIfNotInvoked */
    public void m152976x43242313(Result result) {
        if (this.f73584x8f6c6efa.get()) {
            return;
        }
        m152975x5dfa54dd(result);
    }

    /* renamed from: takeOverAndroidThreadPool */
    public static void m152977xcf6ce45a() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = (java.util.concurrent.ThreadPoolExecutor) android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        threadPoolExecutor.setRejectedExecutionHandler(f73578xf8d00d18);
        threadPoolExecutor.shutdown();
    }

    /* renamed from: cancel */
    public final boolean m152978xae7a2e7a(boolean z17) {
        this.f73580x971f7364.set(true);
        return this.f73581x421b490.cancel(z17);
    }

    /* renamed from: doInBackground */
    public abstract Result m152979xf8c9bc5e();

    /* renamed from: executeOnExecutor */
    public final org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01<Result> m152980x2e07e127(java.util.concurrent.Executor executor) {
        m152971x43f04424();
        executor.execute(this.f73581x421b490);
        return this;
    }

    /* renamed from: executeOnTaskRunner */
    public final org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01<Result> m152981xe3922c69(org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29445xaefae535 interfaceC29445xaefae535) {
        m152971x43f04424();
        interfaceC29445xaefae535.mo153031x2d1ef245(this.f73581x421b490);
        return this;
    }

    /* renamed from: executeWithTaskTraits */
    public final org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01<Result> m152982x7ddd5a45(int i17) {
        m152971x43f04424();
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153010x2d1ef245(i17, this.f73581x421b490);
        return this;
    }

    public final Result get() {
        java.lang.String str;
        int m152984x9d037765 = m152984x9d037765();
        if (m152984x9d037765 != 2 && org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152667x9483fbdc()) {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29410x1048b7f3.m152933x22a24ab3(f73576x87a7610a, m152984x9d037765, 3);
            java.lang.StackTraceElement[] stackTrace = new java.lang.Exception().getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].getClassName() + "." + stackTrace[1].getMethodName() + ".";
            } else {
                str = "";
            }
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90(str + "AsyncTask.get");
            try {
                Result result = this.f73581x421b490.get();
                if (m152702xc9e48c90 == null) {
                    return result;
                }
                m152702xc9e48c90.close();
                return result;
            } catch (java.lang.Throwable th6) {
                if (m152702xc9e48c90 != null) {
                    try {
                        m152702xc9e48c90.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        return this.f73581x421b490.get();
    }

    /* renamed from: getStatus */
    public final int m152983x2fe4f2e8() {
        return this.f73583x1a39f6bf;
    }

    /* renamed from: getUmaStatus */
    public final int m152984x9d037765() {
        if (this.f73583x1a39f6bf != 1 || this.f73584x8f6c6efa.get()) {
            return this.f73583x1a39f6bf;
        }
        return 0;
    }

    /* renamed from: isCancelled */
    public final boolean m152985x62a56b47() {
        return this.f73580x971f7364.get();
    }

    /* renamed from: onCancelled */
    public void m152986x1a926632() {
    }

    /* renamed from: onPostExecute */
    public abstract void mo152988xedcc8b56(Result result);

    /* renamed from: onPreExecute */
    public void m152989xbe208e91() {
    }

    /* renamed from: onCancelled */
    public void m152987x1a926632(Result result) {
        m152986x1a926632();
    }

    public final Result get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.String str;
        int m152984x9d037765 = m152984x9d037765();
        if (m152984x9d037765 != 2 && org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152667x9483fbdc()) {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29410x1048b7f3.m152933x22a24ab3(f73576x87a7610a, m152984x9d037765, 3);
            java.lang.StackTraceElement[] stackTrace = new java.lang.Exception().getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].getClassName() + "." + stackTrace[1].getMethodName() + ".";
            } else {
                str = "";
            }
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90(str + "AsyncTask.get");
            try {
                Result result = this.f73581x421b490.get(j17, timeUnit);
                if (m152702xc9e48c90 == null) {
                    return result;
                }
                m152702xc9e48c90.close();
                return result;
            } catch (java.lang.Throwable th6) {
                if (m152702xc9e48c90 != null) {
                    try {
                        m152702xc9e48c90.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        return this.f73581x421b490.get(j17, timeUnit);
    }
}
