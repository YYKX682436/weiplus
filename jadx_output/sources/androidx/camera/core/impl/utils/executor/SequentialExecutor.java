package androidx.camera.core.impl.utils.executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class SequentialExecutor implements java.util.concurrent.Executor {
    private static final java.lang.String TAG = "SequentialExecutor";
    private final java.util.concurrent.Executor mExecutor;
    final java.util.Deque<java.lang.Runnable> mQueue = new java.util.ArrayDeque();
    private final androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker mWorker = new androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker();
    androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState mWorkerRunningState = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE;
    long mWorkerRunCount = 0;

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
        
            androidx.camera.core.Logger.e(androidx.camera.core.impl.utils.executor.SequentialExecutor.TAG, "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void workOnQueue() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L68
                java.util.Deque<java.lang.Runnable> r2 = r2.mQueue     // Catch: java.lang.Throwable -> L68
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L68
                if (r0 != 0) goto L26
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = r0.mWorkerRunningState     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r4 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L65
                if (r3 != r4) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r5 = r0.mWorkerRunCount     // Catch: java.lang.Throwable -> L65
                r7 = 1
                long r5 = r5 + r7
                r0.mWorkerRunCount = r5     // Catch: java.lang.Throwable -> L65
                r0.mWorkerRunningState = r4     // Catch: java.lang.Throwable -> L65
                r0 = 1
            L26:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L65
                java.util.Deque<java.lang.Runnable> r3 = r3.mQueue     // Catch: java.lang.Throwable -> L65
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L65
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L65
                if (r3 != 0) goto L43
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L65
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L65
                r0.mWorkerRunningState = r3     // Catch: java.lang.Throwable -> L65
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
                androidx.camera.core.Logger.e(r4, r3, r2)     // Catch: java.lang.Throwable -> L68
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (java.lang.Error e17) {
                synchronized (androidx.camera.core.impl.utils.executor.SequentialExecutor.this.mQueue) {
                    androidx.camera.core.impl.utils.executor.SequentialExecutor.this.mWorkerRunningState = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE;
                    throw e17;
                }
            }
        }
    }

    /* loaded from: classes14.dex */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public SequentialExecutor(java.util.concurrent.Executor executor) {
        executor.getClass();
        this.mExecutor = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final java.lang.Runnable runnable) {
        androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState workerRunningState;
        runnable.getClass();
        synchronized (this.mQueue) {
            androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState workerRunningState2 = this.mWorkerRunningState;
            if (workerRunningState2 != androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUED)) {
                long j17 = this.mWorkerRunCount;
                java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }
                };
                this.mQueue.add(runnable2);
                androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState workerRunningState3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING;
                this.mWorkerRunningState = workerRunningState3;
                try {
                    this.mExecutor.execute(this.mWorker);
                    if (this.mWorkerRunningState != workerRunningState3) {
                        return;
                    }
                    synchronized (this.mQueue) {
                        if (this.mWorkerRunCount == j17 && this.mWorkerRunningState == workerRunningState3) {
                            this.mWorkerRunningState = workerRunningState;
                        }
                    }
                    return;
                } catch (java.lang.Error | java.lang.RuntimeException e17) {
                    synchronized (this.mQueue) {
                        androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState workerRunningState4 = this.mWorkerRunningState;
                        if ((workerRunningState4 != androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE && workerRunningState4 != androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING) || !this.mQueue.removeLastOccurrence(runnable2)) {
                            r0 = false;
                        }
                        if (!(e17 instanceof java.util.concurrent.RejectedExecutionException) || r0) {
                            throw e17;
                        }
                    }
                    return;
                }
            }
            this.mQueue.add(runnable);
        }
    }
}
