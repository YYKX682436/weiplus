package ge1;

/* loaded from: classes15.dex */
public final class c implements android.os.IBinder.DeathRecipient {
    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.ServiceConnection", "vendor service died, resetting state");
        java.util.concurrent.locks.ReentrantLock reentrantLock = ge1.h.f352470e;
        reentrantLock.lock();
        try {
            ge1.h.f352471f = ge1.b.f352460d;
            ke1.b bVar = ge1.h.f352472g;
            if (bVar != null) {
                bVar.mo142521x41012807();
            }
            ge1.h.f352472g = null;
            android.os.IBinder iBinder = ge1.h.f352480r;
            if (iBinder != null) {
                iBinder.unlinkToDeath(this, 0);
            }
            ge1.h.f352480r = null;
            if (!ge1.h.f352473h.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.ServiceConnection", "pendingTaskQueue is not empty, attempting reconnect");
                ge1.h.f352469d.d();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
