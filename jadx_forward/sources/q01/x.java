package q01;

/* loaded from: classes12.dex */
public final class x implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f440876o = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.m1 f440877d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f440878e;

    /* renamed from: f, reason: collision with root package name */
    public final int f440879f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.l0 f440880g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f440881h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f440882i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f440883m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f440884n;

    public x(com.p314xaae8f345.mm.p944x882e457a.m1 scene, com.p314xaae8f345.mm.p944x882e457a.u0 queueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queueCallback, "queueCallback");
        this.f440877d = scene;
        this.f440878e = queueCallback;
        this.f440879f = f440876o.getAndIncrement();
        this.f440881h = jz5.h.b(q01.u.f440870d);
        this.f440882i = jz5.h.b(q01.r.f440858d);
        this.f440883m = jz5.h.b(q01.s.f440860d);
        this.f440884n = jz5.h.b(q01.t.f440867d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueueTracker", "#init trackCallbacks: " + e());
    }

    public final java.util.LinkedHashMap a() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("dispatchToRemoteCounter", java.lang.Integer.valueOf(((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) this.f440881h).mo141623x754a37bb()).get()));
        linkedHashMap.put("callbackFromRemoteCounter", java.lang.Integer.valueOf(c().get()));
        linkedHashMap.put("callbackToQueueCounter", java.lang.Integer.valueOf(d().get()));
        ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
        return linkedHashMap;
    }

    public final java.lang.String b() {
        return "(" + ((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) this.f440881h).mo141623x754a37bb()).get() + '|' + c().get() + '|' + d().get() + ')';
    }

    public final java.util.concurrent.atomic.AtomicInteger c() {
        return (java.util.concurrent.atomic.AtomicInteger) this.f440882i.mo141623x754a37bb();
    }

    public final java.util.concurrent.atomic.AtomicInteger d() {
        return (java.util.concurrent.atomic.AtomicInteger) this.f440883m.mo141623x754a37bb();
    }

    public final java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f440877d;
        sb6.append(m1Var.getClass().getName());
        sb6.append('@');
        sb6.append(m1Var.hashCode());
        sb6.append('(');
        sb6.append(q01.a1.f440792a.a(m1Var));
        sb6.append("), callbacks=(");
        sb6.append(this.f440879f);
        sb6.append('|');
        com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var = this.f440880g;
        sb6.append(l0Var != null ? java.lang.Integer.valueOf(l0Var.hashCode()) : null);
        sb6.append("), counters=");
        sb6.append(b());
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        c().incrementAndGet();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueueTracker", "#onGYNetEnd: " + e() + '}');
        com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var = this.f440880g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l0Var);
        l0Var.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f440877d;
        if (d().get() >= c().get()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect leaking callback: " + e());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect leaking callback - clear & post");
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.NetSceneQueueTracker.Leak");
        ((ku5.t0) ku5.t0.f394148d).l(new q01.v(this, m1Var), 5000L, "MicroMsg.NetSceneQueueTracker.Leak");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        int i19;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(scene, this.f440877d)) {
            throw new java.lang.IllegalStateException("Illegal NetScene: callbacks are mismatched, expected=" + this.f440877d.getClass().getName() + '@' + this.f440877d.hashCode() + ", actual=" + scene.getClass().getName() + '@' + scene.hashCode());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueueTracker", "#onSceneEnd callback to queue");
        this.f440878e.mo815x76e0bfae(i17, i18, str, scene);
        d().incrementAndGet();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueueTracker", "done: " + e());
        if (q01.e0.f440803a.e()) {
            java.lang.Throwable th6 = new java.lang.Throwable();
            ((java.util.List) ((jz5.n) this.f440884n).mo141623x754a37bb()).add(th6);
            if (((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) this.f440881h).mo141623x754a37bb()).get() > 0) {
                if (d().get() - ((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) this.f440881h).mo141623x754a37bb()).get() > 1 || d().get() - c().get() > 1) {
                    com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f440878e;
                    com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = u0Var instanceof com.p314xaae8f345.mm.p944x882e457a.r1 ? (com.p314xaae8f345.mm.p944x882e457a.r1) u0Var : null;
                    if (r1Var != null) {
                        synchronized (r1Var.f152306p) {
                            linkedList = new java.util.LinkedList(r1Var.f152300g);
                        }
                        i19 = 0;
                        if (!linkedList.isEmpty()) {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((com.p314xaae8f345.mm.p944x882e457a.m1) it.next(), scene) && (i19 = i19 + 1) < 0) {
                                    kz5.c0.o();
                                    throw null;
                                }
                            }
                        }
                    } else {
                        i19 = -1;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect duplicating callback to onSceneEnd: leakCount=" + i19);
                    java.util.LinkedHashMap a17 = a();
                    a17.put("leakCount", java.lang.Integer.valueOf(i19));
                    ap.a.a(10001, "errNetScene", th6, a17, "DuplicateCallback", q01.a1.f440792a.a(scene), b(), java.lang.String.valueOf(i19));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect duplicating callback - clear & post");
                    ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.NetSceneQueueTracker.LeakCaller");
                    ((ku5.t0) ku5.t0.f394148d).l(new q01.w(this), 5000L, "MicroMsg.NetSceneQueueTracker.LeakCaller");
                }
            }
        }
    }
}
