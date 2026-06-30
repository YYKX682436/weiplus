package gp0;

/* loaded from: classes10.dex */
public class c extends ku5.f implements fp0.a {

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f355702v;

    public c(java.lang.String str, int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue) {
        super(str, i17, i18, blockingQueue);
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f355702v = reentrantLock;
        reentrantLock.newCondition();
    }

    @Override // ku5.f
    public void c(java.lang.Thread thread, java.lang.Runnable runnable) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f355702v;
        reentrantLock.lock();
        reentrantLock.unlock();
    }

    @Override // ku5.f, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        super.execute(runnable);
    }
}
