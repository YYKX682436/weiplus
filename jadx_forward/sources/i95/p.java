package i95;

/* loaded from: classes12.dex */
public class p implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.w f371374d;

    public p(i95.w wVar) {
        this.f371374d = wVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        i95.v vVar;
        java.util.concurrent.locks.ReentrantLock reentrantLock2;
        java.util.concurrent.locks.ReentrantLock reentrantLock3;
        i95.w wVar = this.f371374d;
        try {
            vVar = wVar.f69870x38358f4b;
            reentrantLock2 = wVar.f69869xeaf6b88a;
            reentrantLock2.unlock();
            vVar.invoke();
            reentrantLock3 = wVar.f69869xeaf6b88a;
            reentrantLock3.lock();
            return null;
        } catch (java.lang.Throwable th6) {
            reentrantLock = wVar.f69869xeaf6b88a;
            reentrantLock.lock();
            throw th6;
        }
    }
}
