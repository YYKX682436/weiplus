package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b;

/* loaded from: classes12.dex */
public class d extends ku5.f implements p11.j {

    /* renamed from: v, reason: collision with root package name */
    public boolean f179152v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f179153w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f179154x;

    public d(int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue) {
        super("bkg_loader_default", i17, i18, blockingQueue);
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f179153w = reentrantLock;
        this.f179154x = reentrantLock.newCondition();
    }

    @Override // ku5.f
    public void c(java.lang.Thread thread, java.lang.Runnable runnable) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f179153w;
        reentrantLock.lock();
        while (this.f179152v) {
            try {
                try {
                    this.f179154x.await();
                } catch (java.lang.Exception e17) {
                    thread.interrupt();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.imageloader.DefaultThreadPoolExecutor", "[cpan] before execute exception:%s", e17.toString());
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // ku5.f, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        super.execute(runnable);
    }

    @Override // p11.j
    public boolean i() {
        return this.f179152v;
    }

    @Override // ku5.f, java.util.concurrent.ExecutorService, p11.j
    public boolean isShutdown() {
        return super.isShutdown();
    }

    @Override // p11.j
    /* renamed from: pause */
    public void mo54791x65825f6() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f179153w;
        reentrantLock.lock();
        try {
            this.f179152v = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p11.j
    /* renamed from: remove */
    public void mo54792xc84af884(java.lang.Object obj) {
    }

    @Override // p11.j
    /* renamed from: resume */
    public void mo54793xc84dc82d() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f179153w;
        reentrantLock.lock();
        try {
            this.f179152v = false;
            this.f179154x.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
