package nm;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: g, reason: collision with root package name */
    public static final nm.j f419976g = new nm.j();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Queue f419977a = new java.util.ArrayDeque(64);

    /* renamed from: b, reason: collision with root package name */
    public boolean f419978b = false;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f419979c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f419980d = true;

    /* renamed from: e, reason: collision with root package name */
    public volatile km5.d f419981e = km5.u.d();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f419982f = new java.util.concurrent.atomic.AtomicBoolean(false);

    public synchronized void a(java.lang.Runnable runnable) {
        lm5.d a17;
        boolean z17;
        lm5.j jVar = lm5.d.f401133a;
        a17 = lm5.i.a();
        if (!(a17 instanceof lm5.c)) {
            lm5.i.c(a17.d(), a17);
        }
        synchronized (this) {
            if (!this.f419978b || this.f419980d) {
                if (this.f419979c) {
                    z17 = true;
                }
            }
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement arrange runnable postToMainThread %s", runnable);
            ((km5.q) this.f419981e).n(new nm.b(runnable, a17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement", "arrange first screen runnable: %s, %s, %s, %s", java.lang.Boolean.valueOf(this.f419978b), java.lang.Boolean.valueOf(this.f419980d), java.lang.Boolean.valueOf(this.f419979c), this.f419977a);
            ((java.util.ArrayDeque) this.f419977a).add(new nm.b(runnable, a17));
        }
    }

    public final synchronized void b() {
        boolean z17;
        synchronized (this) {
            if (!this.f419978b || this.f419980d) {
                if (this.f419979c) {
                    z17 = true;
                }
            }
            z17 = false;
        }
        if (!z17) {
            return;
        }
        lm5.j jVar = lm5.d.f401133a;
        lm5.d a17 = lm5.i.a();
        if (!(a17 instanceof lm5.c)) {
            lm5.i.c(a17.d(), a17);
        }
        while (true) {
            nm.b bVar = (nm.b) ((java.util.ArrayDeque) this.f419977a).poll();
            if (bVar == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement tryConsumingWaitingQueue runnable %s, %s", bVar.f419959a, bVar.f419960b.d());
            ((km5.q) this.f419981e).n(bVar);
        }
    }
}
