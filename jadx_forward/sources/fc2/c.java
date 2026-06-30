package fc2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f342472a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f342473b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f342474c;

    public c(java.lang.String threadTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadTag, "threadTag");
        this.f342473b = new java.util.concurrent.ConcurrentHashMap();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(threadTag);
        n3Var.m77789xc5a5549d(false);
        this.f342474c = n3Var;
    }

    public final void a(fc2.d observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f342473b.put(observer, new java.lang.Object());
    }

    public final void b(fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f342472a) {
            return;
        }
        for (java.util.Map.Entry entry : this.f342473b.entrySet()) {
            if (((fc2.d) entry.getKey()).F0(this, event)) {
                fc2.d dVar = (fc2.d) entry.getKey();
                if (kz5.z.G(dVar.f499160e, dVar.f499159d)) {
                    if (((fc2.d) entry.getKey()).E0()) {
                        this.f342474c.mo50293x3498a0(new fc2.b(entry, event));
                    } else {
                        ((fc2.d) entry.getKey()).G0(event);
                    }
                }
            }
        }
    }

    public final void c() {
        this.f342472a = true;
        this.f342474c.m77787xbe88f509();
        java.util.Iterator it = this.f342473b.entrySet().iterator();
        while (it.hasNext()) {
            ((fc2.d) ((java.util.Map.Entry) it.next()).getKey()).H0();
        }
        this.f342473b.clear();
    }

    public final void d(fc2.d dVar) {
        if (dVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f342473b;
            if (concurrentHashMap.containsKey(dVar)) {
                concurrentHashMap.remove(dVar);
            }
        }
    }
}
