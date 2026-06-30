package org.p3343x72743996.net.p3359x113d858d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.urlconnection.MessageLoop */
/* loaded from: classes13.dex */
public class ExecutorC29646x2f5b872b implements java.util.concurrent.Executor {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74924x7118e671 = false;

    /* renamed from: INVALID_THREAD_ID */
    private static final long f74925xc1710f08 = -1;

    /* renamed from: mLoopFailed */
    private boolean f74926xe131b44e;

    /* renamed from: mLoopRunning */
    private boolean f74927xe237f7ce;

    /* renamed from: mPriorInterruptedIOException */
    private java.io.InterruptedIOException f74928xa2955d04;

    /* renamed from: mPriorRuntimeException */
    private java.lang.RuntimeException f74929xf3b5bd4;

    /* renamed from: mThreadId */
    private long f74931x7cd36452 = -1;

    /* renamed from: mQueue */
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> f74930xbeac64a4 = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: calledOnValidThread */
    private boolean m154327xc86cc14a() {
        long j17 = this.f74931x7cd36452;
        if (j17 != -1) {
            return j17 == java.lang.Thread.currentThread().getId();
        }
        this.f74931x7cd36452 = java.lang.Thread.currentThread().getId();
        return true;
    }

    /* renamed from: take */
    private java.lang.Runnable m154328x363487(boolean z17, long j17) {
        try {
            java.lang.Runnable take = !z17 ? this.f74930xbeac64a4.take() : this.f74930xbeac64a4.poll(j17, java.util.concurrent.TimeUnit.NANOSECONDS);
            if (take != null) {
                return take;
            }
            throw new java.net.SocketTimeoutException();
        } catch (java.lang.InterruptedException e17) {
            java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException();
            interruptedIOException.initCause(e17);
            throw interruptedIOException;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException();
        }
        try {
            this.f74930xbeac64a4.put(runnable);
        } catch (java.lang.InterruptedException e17) {
            throw new java.util.concurrent.RejectedExecutionException(e17);
        }
    }

    /* renamed from: hasLoopFailed */
    public boolean m154329x2e18323b() {
        return this.f74926xe131b44e;
    }

    /* renamed from: isRunning */
    public boolean m154330x39e05d35() {
        return this.f74927xe237f7ce;
    }

    /* renamed from: loop */
    public void m154331x32c6a4() {
        m154332x32c6a4(0);
    }

    /* renamed from: quit */
    public void m154333x35224f() {
        this.f74927xe237f7ce = false;
    }

    /* renamed from: loop */
    public void m154332x32c6a4(int i17) {
        long nanoTime = java.lang.System.nanoTime();
        long convert = java.util.concurrent.TimeUnit.NANOSECONDS.convert(i17, java.util.concurrent.TimeUnit.MILLISECONDS);
        if (this.f74926xe131b44e) {
            java.io.InterruptedIOException interruptedIOException = this.f74928xa2955d04;
            if (interruptedIOException != null) {
                throw interruptedIOException;
            }
            throw this.f74929xf3b5bd4;
        }
        if (!this.f74927xe237f7ce) {
            this.f74927xe237f7ce = true;
            while (this.f74927xe237f7ce) {
                if (i17 == 0) {
                    try {
                        m154328x363487(false, 0L).run();
                    } catch (java.io.InterruptedIOException e17) {
                        this.f74927xe237f7ce = false;
                        this.f74926xe131b44e = true;
                        this.f74928xa2955d04 = e17;
                        throw e17;
                    } catch (java.lang.RuntimeException e18) {
                        this.f74927xe237f7ce = false;
                        this.f74926xe131b44e = true;
                        this.f74929xf3b5bd4 = e18;
                        throw e18;
                    }
                } else {
                    m154328x363487(true, (convert - java.lang.System.nanoTime()) + nanoTime).run();
                }
            }
            return;
        }
        throw new java.lang.IllegalStateException("Cannot run loop when it is already running.");
    }
}
