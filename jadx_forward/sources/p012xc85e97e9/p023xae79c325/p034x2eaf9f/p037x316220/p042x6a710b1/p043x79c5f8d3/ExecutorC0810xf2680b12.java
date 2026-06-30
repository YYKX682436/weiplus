package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.utils.executor.SequentialExecutor */
/* loaded from: classes14.dex */
public final class ExecutorC0810xf2680b12 implements java.util.concurrent.Executor {
    private static final java.lang.String TAG = "SequentialExecutor";

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f2005x9ec3a060;

    /* renamed from: mQueue */
    final java.util.Deque<java.lang.Runnable> f2006xbeac64a4 = new java.util.ArrayDeque();

    /* renamed from: mWorker */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.QueueWorker f2007x20ce7a4b = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.QueueWorker();

    /* renamed from: mWorkerRunningState */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState f2009xe88133fd = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState.IDLE;

    /* renamed from: mWorkerRunCount */
    long f2008xb2b3e8af = 0;

    /* renamed from: androidx.camera.core.impl.utils.executor.SequentialExecutor$QueueWorker */
    /* loaded from: classes14.dex */
    public final class QueueWorker implements java.lang.Runnable {
        public QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.TAG, "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return;
         */
        /* renamed from: workOnQueue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m5993xa72bda21() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.this     // Catch: java.lang.Throwable -> L68
                java.util.Deque<java.lang.Runnable> r2 = r2.f2006xbeac64a4     // Catch: java.lang.Throwable -> L68
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L68
                if (r0 != 0) goto L26
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.this     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = r0.f2009xe88133fd     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L65
                if (r3 != r4) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r5 = r0.f2008xb2b3e8af     // Catch: java.lang.Throwable -> L65
                r7 = 1
                long r5 = r5 + r7
                r0.f2008xb2b3e8af = r5     // Catch: java.lang.Throwable -> L65
                r0.f2009xe88133fd = r4     // Catch: java.lang.Throwable -> L65
                r0 = 1
            L26:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.this     // Catch: java.lang.Throwable -> L65
                java.util.Deque<java.lang.Runnable> r3 = r3.f2006xbeac64a4     // Catch: java.lang.Throwable -> L65
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L65
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L65
                if (r3 != 0) goto L43
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.this     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L65
                r0.f2009xe88133fd = r3     // Catch: java.lang.Throwable -> L65
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto L42
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L42:
                return
            L43:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L68
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.RuntimeException -> L4d java.lang.Throwable -> L68
                goto L2
            L4d:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
                r5.<init>()     // Catch: java.lang.Throwable -> L68
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L68
                r5.append(r3)     // Catch: java.lang.Throwable -> L68
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L68
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(r4, r3, r2)     // Catch: java.lang.Throwable -> L68
                goto L2
            L65:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                throw r0     // Catch: java.lang.Throwable -> L68
            L68:
                r0 = move-exception
                if (r1 == 0) goto L72
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L72:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.QueueWorker.m5993xa72bda21():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m5993xa72bda21();
            } catch (java.lang.Error e17) {
                synchronized (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.this.f2006xbeac64a4) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.this.f2009xe88133fd = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState.IDLE;
                    throw e17;
                }
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState */
    /* loaded from: classes14.dex */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC0810xf2680b12(java.util.concurrent.Executor executor) {
        executor.getClass();
        this.f2005x9ec3a060 = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final java.lang.Runnable runnable) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState workerRunningState;
        runnable.getClass();
        synchronized (this.f2006xbeac64a4) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState workerRunningState2 = this.f2009xe88133fd;
            if (workerRunningState2 != p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState.QUEUED)) {
                long j17 = this.f2008xb2b3e8af;
                java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }
                };
                this.f2006xbeac64a4.add(runnable2);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState workerRunningState3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState.QUEUING;
                this.f2009xe88133fd = workerRunningState3;
                try {
                    this.f2005x9ec3a060.execute(this.f2007x20ce7a4b);
                    if (this.f2009xe88133fd != workerRunningState3) {
                        return;
                    }
                    synchronized (this.f2006xbeac64a4) {
                        if (this.f2008xb2b3e8af == j17 && this.f2009xe88133fd == workerRunningState3) {
                            this.f2009xe88133fd = workerRunningState;
                        }
                    }
                    return;
                } catch (java.lang.Error | java.lang.RuntimeException e17) {
                    synchronized (this.f2006xbeac64a4) {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState workerRunningState4 = this.f2009xe88133fd;
                        if ((workerRunningState4 != p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState.IDLE && workerRunningState4 != p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12.WorkerRunningState.QUEUING) || !this.f2006xbeac64a4.removeLastOccurrence(runnable2)) {
                            r0 = false;
                        }
                        if (!(e17 instanceof java.util.concurrent.RejectedExecutionException) || r0) {
                            throw e17;
                        }
                    }
                    return;
                }
            }
            this.f2006xbeac64a4.add(runnable);
        }
    }
}
