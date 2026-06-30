package n0;

/* loaded from: classes14.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f415008a = new java.util.concurrent.atomic.AtomicReference(u0.l.f504979a);

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f415009b = new java.lang.Object();

    public final java.lang.Object a() {
        u0.k kVar = (u0.k) this.f415008a.get();
        int a17 = kVar.a(java.lang.Thread.currentThread().getId());
        if (a17 >= 0) {
            return kVar.f504978c[a17];
        }
        return null;
    }

    public final void b(java.lang.Object obj) {
        boolean z17;
        long id6 = java.lang.Thread.currentThread().getId();
        synchronized (this.f415009b) {
            u0.k kVar = (u0.k) this.f415008a.get();
            int a17 = kVar.a(id6);
            if (a17 < 0) {
                z17 = false;
            } else {
                kVar.f504978c[a17] = obj;
                z17 = true;
            }
            if (z17) {
                return;
            }
            this.f415008a.set(kVar.b(id6, obj));
        }
    }
}
