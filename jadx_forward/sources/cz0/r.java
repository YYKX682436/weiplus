package cz0;

/* loaded from: classes5.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cz0.r f306496d = new cz0.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = cz0.y.f306505d;
        reentrantLock.lock();
        try {
            cz0.y.a(cz0.y.f306502a);
            reentrantLock.unlock();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            cz0.y.f306505d.unlock();
            throw th6;
        }
    }
}
