package ge1;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ge1.g f352468d = new ge1.g();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = ge1.h.f352470e;
        reentrantLock.lock();
        try {
            if (ge1.h.f352471f == ge1.b.f352462f && ge1.h.f352473h.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.ServiceConnection", "idle timeout reached (180000ms), proactively unbinding vendor service");
                ge1.h.f352469d.b();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
