package e26;

/* loaded from: classes15.dex */
public class b implements e26.z {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.Lock f328548b;

    public b(java.util.concurrent.locks.Lock lock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lock, "lock");
        this.f328548b = lock;
    }

    @Override // e26.z
    /* renamed from: lock */
    public void mo126820x32c52b() {
        this.f328548b.lock();
    }

    @Override // e26.z
    /* renamed from: unlock */
    public void mo126821xcde7df44() {
        this.f328548b.unlock();
    }
}
