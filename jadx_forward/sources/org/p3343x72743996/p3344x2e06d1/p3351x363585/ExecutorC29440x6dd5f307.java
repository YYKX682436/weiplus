package org.p3343x72743996.p3344x2e06d1.p3351x363585;

/* renamed from: org.chromium.base.task.SerialExecutor */
/* loaded from: classes13.dex */
class ExecutorC29440x6dd5f307 implements java.util.concurrent.Executor {

    /* renamed from: mActive */
    java.lang.Runnable f73619xfa9ba5d3;

    /* renamed from: mTasks */
    final java.util.ArrayDeque<java.lang.Runnable> f73620xbecdc721 = new java.util.ArrayDeque<>();

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final java.lang.Runnable runnable) {
        this.f73620xbecdc721.offer(new java.lang.Runnable() { // from class: org.chromium.base.task.SerialExecutor.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } finally {
                    org.p3343x72743996.p3344x2e06d1.p3351x363585.ExecutorC29440x6dd5f307.this.m153022x45426e2a();
                }
            }
        });
        if (this.f73619xfa9ba5d3 == null) {
            m153022x45426e2a();
        }
    }

    /* renamed from: scheduleNext */
    public synchronized void m153022x45426e2a() {
        java.lang.Runnable poll = this.f73620xbecdc721.poll();
        this.f73619xfa9ba5d3 = poll;
        if (poll != null) {
            org.p3343x72743996.p3344x2e06d1.p3351x363585.AbstractC29429x11a92e01.f73579x921e6421.execute(poll);
        }
    }
}
