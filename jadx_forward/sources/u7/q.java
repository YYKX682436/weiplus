package u7;

/* loaded from: classes13.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final u7.t f506605a;

    /* renamed from: b, reason: collision with root package name */
    public final u7.a f506606b;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f506609e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Thread f506610f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f506611g;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f506607c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f506608d = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile int f506612h = -1;

    public q(u7.t tVar, u7.a aVar) {
        tVar.getClass();
        this.f506605a = tVar;
        aVar.getClass();
        this.f506606b = aVar;
        this.f506609e = new java.util.concurrent.atomic.AtomicInteger();
    }

    public final void a() {
        u7.t tVar = this.f506605a;
        try {
            ((u7.l) tVar).a();
        } catch (u7.r e17) {
            new u7.r("Error closing source " + tVar, e17);
        }
    }

    public final void b(long j17, long j18) {
        int i17 = (j18 > 0L ? 1 : (j18 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((((float) j17) / ((float) j18)) * 100.0f);
        boolean z17 = i17 != this.f506612h;
        if ((j18 >= 0) && z17) {
            c(i17);
        }
        this.f506612h = i17;
        synchronized (this.f506607c) {
            this.f506607c.notifyAll();
        }
    }

    public abstract void c(int i17);

    public void d() {
        synchronized (this.f506608d) {
            java.util.Objects.toString(this.f506605a);
            try {
                this.f506611g = true;
                if (this.f506610f != null) {
                    this.f506610f.interrupt();
                }
                ((v7.b) this.f506606b).c();
            } catch (u7.r e17) {
                boolean z17 = e17 instanceof u7.n;
            }
        }
    }

    public final void e() {
        boolean z17;
        synchronized (this.f506608d) {
            if (!java.lang.Thread.currentThread().isInterrupted() && !this.f506611g) {
                z17 = false;
                if (!z17 && ((v7.b) this.f506606b).b() == ((u7.l) this.f506605a).c()) {
                    ((v7.b) this.f506606b).d();
                }
            }
            z17 = true;
            if (!z17) {
                ((v7.b) this.f506606b).d();
            }
        }
    }
}
