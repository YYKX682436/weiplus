package ge1;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ge1.h f352467d;

    public f(ge1.h hVar) {
        this.f352467d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = ge1.h.f352470e;
        ge1.h hVar = this.f352467d;
        reentrantLock.lock();
        try {
            if (ge1.h.f352471f == ge1.b.f352461e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "bind timeout reached (5000ms), giving up");
                ge1.h.f352471f = ge1.b.f352460d;
                ge1.h.f352469d.c(10014, "Bind vendor service timeout");
                try {
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    if (context != null) {
                        context.unbindService(hVar);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "unbindService on timeout exception: " + e17.getMessage());
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
