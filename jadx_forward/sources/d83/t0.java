package d83;

/* loaded from: classes5.dex */
public final class t0 implements e70.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b f308554a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.o f308555b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f308556c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f308557d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f308558e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f308559f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f308560g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f308561h;

    public t0(boolean z17) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z zVar = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19982xc742def2()) == 1 ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z.kTransferStrategyFullSpeedMode : com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.z.kTransferStrategySpeedMode;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b bVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b();
        bVar.f298756d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.c.kStreamChannelModeDual;
        boolean[] zArr = bVar.f298762m;
        zArr[1] = true;
        bVar.f298760h = zVar;
        zArr[5] = true;
        bVar.f298758f = true;
        zArr[3] = true;
        bVar.f298761i = z17;
        zArr[6] = true;
        this.f308554a = bVar;
        this.f308556c = new java.util.concurrent.ConcurrentHashMap();
        this.f308557d = new java.util.concurrent.ConcurrentHashMap();
        this.f308558e = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.ThreadPool.ILinkStreamController", gm0.j1.b().f354778h, 1);
        this.f308559f = new java.util.concurrent.atomic.AtomicLong(java.lang.System.currentTimeMillis());
        this.f308560g = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final void a(d83.t0 t0Var) {
        t0Var.f308559f.set(java.lang.System.currentTimeMillis());
        p3325xe03a0797.p3326xc267989b.r2 r2Var = t0Var.f308561h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        t0Var.f308561h = v65.i.b(t0Var.f308558e, null, new d83.s0(t0Var, null), 1, null);
    }

    public boolean b(java.lang.String streamId, e70.c0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamId, "streamId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f308556c;
        d83.h0 h0Var = (d83.h0) concurrentHashMap.get(streamId);
        if (h0Var == null) {
            return false;
        }
        h0Var.f308506d.add(listener);
        concurrentHashMap.put(streamId, h0Var);
        return true;
    }

    public void c() {
        if (this.f308560g.compareAndSet(false, true)) {
            if (this.f308555b == null) {
                synchronized (this) {
                    if (this.f308555b == null) {
                        this.f308555b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.p.f298827b.d(this.f308554a);
                        this.f308560g.set(false);
                    }
                }
            }
            a(this);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.o oVar = this.f308555b;
            if (oVar != null) {
                oVar.f("event", new d83.l0(this));
                oVar.h("event", new d83.n0(this));
                oVar.i("event", new d83.o0(this));
                oVar.e("event", new d83.p0(this));
                oVar.g("event", new d83.q0(this));
                oVar.o(300);
            }
        }
    }

    public void d() {
        synchronized (this) {
            java.util.Collection values = this.f308556c.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            for (d83.h0 h0Var : kz5.n0.S0(values)) {
                h0Var.f308508f.mo152xb9724478();
                p3325xe03a0797.p3326xc267989b.r2 r2Var = h0Var.f308507e;
                if (r2Var != null) {
                    h0Var.f308507e = null;
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                h0Var.f308506d.clear();
            }
            this.f308556c.clear();
            java.util.Collection values2 = this.f308557d.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
            java.util.Iterator it = kz5.n0.S0(values2).iterator();
            while (it.hasNext()) {
                ((d83.h0) it.next()).f308506d.clear();
            }
            this.f308557d.clear();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.o oVar = this.f308555b;
            if (oVar != null) {
                oVar.m("event");
                oVar.k("event");
                oVar.n("event");
                oVar.j("event");
                oVar.l("event");
            }
            this.f308555b = null;
            this.f308560g.set(false);
        }
    }

    public void e(java.lang.String streamId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamId, "streamId");
        d83.h0 h0Var = (d83.h0) this.f308556c.remove(streamId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseStream streamId: ");
        sb6.append(streamId);
        sb6.append(", existed: ");
        sb6.append(h0Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", sb6.toString());
        if (h0Var != null) {
            this.f308557d.put(streamId, h0Var);
            h0Var.f308508f.mo152xb9724478();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = h0Var.f308507e;
            if (r2Var != null) {
                h0Var.f308507e = null;
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            v65.i.b(this.f308558e, null, new d83.r0(this, streamId, null), 1, null);
        }
    }
}
