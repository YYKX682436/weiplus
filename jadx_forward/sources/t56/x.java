package t56;

/* loaded from: classes16.dex */
public final class x implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            java.util.Iterator it = t56.y.f497478h.keySet().iterator();
            while (it.hasNext()) {
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (java.util.concurrent.ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    it.remove();
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        } catch (java.lang.Throwable th6) {
            q56.f.b(th6);
            x56.m.a(th6);
        }
    }
}
