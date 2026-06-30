package k91;

/* loaded from: classes7.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f387328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f387329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km5.b f387330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k91.y4 f387331g;

    public v4(k91.y4 y4Var, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, km5.b bVar) {
        this.f387331g = y4Var;
        this.f387328d = atomicInteger;
        this.f387329e = concurrentLinkedQueue;
        this.f387330f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f387328d.getAndDecrement() == 1) {
            k91.y4 y4Var = this.f387331g;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(y4Var.f387369b.size());
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f387329e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAttrSyncHelper", "batchSync callback list_size:%d, updated_size:%d, scene:%d", valueOf, java.lang.Integer.valueOf(concurrentLinkedQueue.size()), java.lang.Integer.valueOf(y4Var.f387370c.f387142d));
            this.f387330f.c(new java.util.LinkedList(concurrentLinkedQueue));
            k91.e5 e5Var = y4Var.f387371d;
            if (e5Var != null) {
                e5Var.a();
            }
        }
    }
}
