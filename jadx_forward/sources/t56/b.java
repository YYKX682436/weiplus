package t56;

/* loaded from: classes16.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t56.c f497386d;

    public b(t56.c cVar) {
        this.f497386d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        t56.c cVar = this.f497386d;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = cVar.f497391c;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long nanoTime = java.lang.System.nanoTime();
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            t56.f fVar = (t56.f) it.next();
            if (fVar.f497405o > nanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(fVar)) {
                cVar.f497392d.e(fVar);
            }
        }
    }
}
