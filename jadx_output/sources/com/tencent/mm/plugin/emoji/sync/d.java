package com.tencent.mm.plugin.emoji.sync;

/* loaded from: classes12.dex */
public class d extends ku5.f implements p11.j {

    /* renamed from: v, reason: collision with root package name */
    public boolean f97619v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f97620w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f97621x;

    public d(int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue) {
        super("bkg_loader_default", i17, i18, blockingQueue);
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f97620w = reentrantLock;
        this.f97621x = reentrantLock.newCondition();
    }

    @Override // ku5.f
    public void c(java.lang.Thread thread, java.lang.Runnable runnable) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f97620w;
        reentrantLock.lock();
        while (this.f97619v) {
            try {
                try {
                    this.f97621x.await();
                } catch (java.lang.Exception e17) {
                    thread.interrupt();
                    com.tencent.mars.xlog.Log.w("MicroMsg.imageloader.DefaultThreadPoolExecutor", "[cpan] before execute exception:%s", e17.toString());
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
        return this.f97619v;
    }

    @Override // ku5.f, java.util.concurrent.ExecutorService, p11.j
    public boolean isShutdown() {
        return super.isShutdown();
    }

    @Override // p11.j
    public void pause() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f97620w;
        reentrantLock.lock();
        try {
            this.f97619v = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p11.j
    public void remove(java.lang.Object obj) {
    }

    @Override // p11.j
    public void resume() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f97620w;
        reentrantLock.lock();
        try {
            this.f97619v = false;
            this.f97621x.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
