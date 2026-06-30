package ge1;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ge1.e f352466d = new ge1.e();

    @Override // java.lang.Runnable
    public final void run() {
        ge1.h hVar = ge1.h.f352469d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = ge1.h.f352473h;
        for (ge1.a aVar = (ge1.a) concurrentLinkedQueue.poll(); aVar != null; aVar = (ge1.a) concurrentLinkedQueue.poll()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - aVar.f352459c;
            yz5.l lVar = aVar.f352458b;
            he1.h hVar2 = aVar.f352457a;
            if (currentTimeMillis > 60000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.ServiceConnection", "flushPendingTasks, task expired, elapsed=" + currentTimeMillis + "ms");
                hVar.a(hVar2);
                lVar.mo146xb9724478(new he1.i(10014, "Task enqueue timeout"));
            } else {
                hVar.e(hVar2, lVar);
            }
        }
        if (concurrentLinkedQueue.isEmpty()) {
            java.lang.Runnable runnable = ge1.h.f352477o;
            if (runnable != null) {
                ge1.h.f352476n.removeCallbacks(runnable);
            }
            ge1.h.f352477o = null;
            ge1.g gVar = ge1.g.f352468d;
            ge1.h.f352476n.postDelayed(gVar, 180000L);
            ge1.h.f352477o = gVar;
        }
    }
}
