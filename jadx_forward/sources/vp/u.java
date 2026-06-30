package vp;

/* loaded from: classes16.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public xp.d f520369a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f520370b = new android.util.SparseArray();

    public u(xp.d dVar) {
        new java.util.concurrent.LinkedBlockingQueue();
        this.f520369a = dVar;
        java.lang.String str = dVar.f537374i;
    }

    public wp.a a(int i17, java.lang.Object obj) {
        wp.a a17;
        java.util.Queue queue = (java.util.concurrent.BlockingQueue) this.f520370b.get(i17);
        if (queue == null) {
            queue = new java.util.concurrent.LinkedBlockingQueue();
        }
        wp.a aVar = (wp.a) queue.poll();
        if (aVar == null) {
            xp.d dVar = this.f520369a;
            if (i17 == -2147483647) {
                dVar.getClass();
                a17 = new wp.i(dVar);
            } else {
                xp.e eVar = dVar.f537370e;
                a17 = eVar != null ? eVar.a(dVar, i17) : null;
                if (a17 == null) {
                    a17 = new wp.c(dVar);
                }
            }
            aVar = a17;
            aVar.m174284x9616526c();
        } else {
            aVar.m174284x9616526c();
        }
        aVar.v();
        if (vp.c.f520270b && obj == null) {
            throw new java.lang.RuntimeException("Danmaku data should been null");
        }
        aVar.f529887y = obj;
        aVar.f529886x = true;
        return aVar;
    }

    public void b(wp.a aVar) {
        int j17 = aVar.j();
        android.util.SparseArray sparseArray = this.f520370b;
        java.util.concurrent.BlockingQueue blockingQueue = (java.util.concurrent.BlockingQueue) sparseArray.get(j17);
        if (blockingQueue == null) {
            blockingQueue = new java.util.concurrent.LinkedBlockingQueue();
            sparseArray.put(j17, blockingQueue);
        }
        if (300 > blockingQueue.size()) {
            blockingQueue.add(aVar);
        }
    }
}
