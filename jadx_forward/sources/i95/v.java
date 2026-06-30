package i95;

/* loaded from: classes12.dex */
public class v extends java.util.concurrent.RecursiveAction {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f371386d;

    /* renamed from: e, reason: collision with root package name */
    public final i95.y f371387e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ForkJoinPool f371388f;

    /* renamed from: g, reason: collision with root package name */
    public final i95.w f371389g;

    /* renamed from: h, reason: collision with root package name */
    public final i95.r f371390h;

    /* renamed from: i, reason: collision with root package name */
    public final i95.r f371391i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f371392m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i95.u f371393n = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f371394o = new i95.t(this);

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i95.w f371395p;

    public v(i95.w wVar, android.content.Context context, i95.y yVar, java.util.concurrent.ForkJoinPool forkJoinPool, i95.w wVar2, i95.r rVar, i95.r rVar2, boolean z17) {
        this.f371395p = wVar;
        this.f371386d = context;
        this.f371387e = yVar;
        this.f371388f = forkJoinPool;
        this.f371389g = wVar2;
        this.f371390h = rVar;
        this.f371391i = rVar2;
        this.f371392m = z17;
    }

    public final void a() {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        java.util.concurrent.locks.ReentrantLock reentrantLock2;
        i95.v vVar;
        i95.v vVar2;
        i95.w wVar = this.f371395p;
        try {
            reentrantLock2 = wVar.f69869xeaf6b88a;
            reentrantLock2.lock();
            vVar = wVar.f69870x38358f4b;
            if (vVar != null) {
                vVar2 = wVar.f69870x38358f4b;
                if (vVar2.f371391i == this.f371390h) {
                    wVar.oi();
                }
                wVar.f69870x38358f4b = null;
            }
        } finally {
            reentrantLock = wVar.f69869xeaf6b88a;
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.RecursiveAction
    public void compute() {
        boolean z17 = true;
        if (this.f371393n == null) {
            synchronized (this) {
                if (this.f371393n == null) {
                    this.f371393n = new i95.u(this, null);
                    z17 = false;
                }
            }
        }
        if (z17) {
            this.f371393n.join();
        } else {
            this.f371393n.invoke();
        }
    }
}
