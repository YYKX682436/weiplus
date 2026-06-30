package w6;

/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f524621a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f524622b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f524623c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.ReferenceQueue f524624d;

    /* renamed from: e, reason: collision with root package name */
    public w6.q0 f524625e;

    public e(boolean z17) {
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new w6.b());
        this.f524623c = new java.util.HashMap();
        this.f524624d = new java.lang.ref.ReferenceQueue();
        this.f524621a = z17;
        this.f524622b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new w6.c(this));
    }

    public synchronized void a(t6.h hVar, w6.r0 r0Var) {
        w6.d dVar = (w6.d) ((java.util.HashMap) this.f524623c).put(hVar, new w6.d(hVar, r0Var, this.f524624d, this.f524621a));
        if (dVar != null) {
            dVar.f524611c = null;
            dVar.clear();
        }
    }

    public void b(w6.d dVar) {
        w6.z0 z0Var;
        synchronized (this) {
            ((java.util.HashMap) this.f524623c).remove(dVar.f524609a);
            if (dVar.f524610b && (z0Var = dVar.f524611c) != null) {
                ((w6.g0) this.f524625e).c(dVar.f524609a, new w6.r0(z0Var, true, false, dVar.f524609a, this.f524625e));
            }
        }
    }
}
