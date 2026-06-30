package o11;

/* loaded from: classes12.dex */
public class a extends ku5.f implements p11.j {

    /* renamed from: v, reason: collision with root package name */
    public boolean f423577v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f423578w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f423579x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f423580y;

    public a(java.lang.String str, int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue, ku5.p pVar) {
        super(str, i17, i18, blockingQueue, pVar);
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f423578w = reentrantLock;
        this.f423579x = reentrantLock.newCondition();
        this.f423580y = blockingQueue;
    }

    @Override // ku5.f
    public void b(java.lang.Runnable runnable, java.lang.Throwable th6) {
    }

    @Override // ku5.f
    public void c(java.lang.Thread thread, java.lang.Runnable runnable) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f423578w;
        reentrantLock.lock();
        while (this.f423577v) {
            try {
                try {
                    this.f423579x.await();
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
        return this.f423577v;
    }

    @Override // ku5.f, java.util.concurrent.ExecutorService, p11.j
    public boolean isShutdown() {
        return super.isShutdown();
    }

    @Override // p11.j
    /* renamed from: pause */
    public void mo54791x65825f6() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f423578w;
        reentrantLock.lock();
        try {
            this.f423577v = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p11.j
    /* renamed from: remove */
    public void mo54792xc84af884(java.lang.Object obj) {
        java.util.concurrent.BlockingQueue blockingQueue = this.f423580y;
        if (blockingQueue != null) {
            blockingQueue.remove(obj);
        }
    }

    @Override // p11.j
    /* renamed from: resume */
    public void mo54793xc84dc82d() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f423578w;
        reentrantLock.lock();
        try {
            this.f423577v = false;
            this.f423579x.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
