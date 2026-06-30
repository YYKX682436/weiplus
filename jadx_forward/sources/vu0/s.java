package vu0;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final pp0.s0 f521682a;

    /* renamed from: b, reason: collision with root package name */
    public final xu0.a f521683b;

    /* renamed from: c, reason: collision with root package name */
    public final vu0.r f521684c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f521685d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f521686e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f521687f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f521688g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f521689h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f521690i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f521691j;

    public s(pp0.s0 s0Var, xu0.a requestListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestListener, "requestListener");
        this.f521682a = s0Var;
        this.f521683b = requestListener;
        this.f521684c = new vu0.r(this);
        this.f521685d = jz5.h.b(new vu0.n(this));
        this.f521686e = jz5.h.b(new vu0.o(this));
        this.f521687f = new java.util.concurrent.ConcurrentHashMap();
        this.f521688g = new java.util.concurrent.ConcurrentHashMap();
        this.f521689h = new java.util.concurrent.ConcurrentHashMap();
        this.f521690i = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f521691j = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f521689h;
        for (p3325xe03a0797.p3326xc267989b.r2 r2Var : concurrentHashMap.values()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2Var);
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        concurrentHashMap.clear();
        su0.j jVar = (su0.j) ((jz5.n) this.f521685d).mo141623x754a37bb();
        if (jVar != null) {
            jVar.mo165244xae7a2e7a();
        }
        this.f521687f.clear();
        this.f521688g.clear();
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        byte[] bytes = (str3 + '_' + str + '_' + str2).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
        return g17;
    }

    public final java.lang.String c(java.util.List list) {
        while (true) {
            java.lang.String str = "";
            for (java.lang.Object obj : list) {
                if (obj instanceof vu0.l) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                    vu0.l lVar = (vu0.l) obj;
                    sb6.append(lVar.f521648b.m34366xfb85ada3());
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34367xdd1fba = lVar.f521648b.m34367xdd1fba();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34367xdd1fba, "getTimeRange(...)");
                    sb6.append(dx0.o.c(m34367xdd1fba));
                    str = sb6.toString();
                } else if (obj instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str);
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 c4179xedb0cdf9 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9) obj;
                    sb7.append(c4179xedb0cdf9.m34366xfb85ada3());
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34367xdd1fba2 = c4179xedb0cdf9.m34367xdd1fba();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34367xdd1fba2, "getTimeRange(...)");
                    sb7.append(dx0.o.c(m34367xdd1fba2));
                    str = sb7.toString();
                }
            }
            return str;
        }
    }

    public final void d(ru0.d dVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f521689h;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) concurrentHashMap.get(dVar);
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        concurrentHashMap.remove(dVar);
        this.f521687f.remove(dVar);
        this.f521688g.remove(dVar);
    }
}
