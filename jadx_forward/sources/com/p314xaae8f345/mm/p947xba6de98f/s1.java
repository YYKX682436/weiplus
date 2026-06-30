package com.p314xaae8f345.mm.p947xba6de98f;

@j95.b
/* loaded from: classes8.dex */
public class s1 extends jm0.o {

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.k0 f152663q;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p947xba6de98f.l1 f152659m = null;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f152660n = false;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p947xba6de98f.h2 f152661o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f152662p = false;

    /* renamed from: r, reason: collision with root package name */
    public long f152664r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f152665s = new com.p314xaae8f345.mm.p947xba6de98f.q1(this, android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f152666t = new com.p314xaae8f345.mm.p947xba6de98f.r1(this);

    public static com.p314xaae8f345.mm.p947xba6de98f.s1 Zi() {
        return (com.p314xaae8f345.mm.p947xba6de98f.s1) i95.n0.c(com.p314xaae8f345.mm.p947xba6de98f.s1.class);
    }

    public static com.p314xaae8f345.mm.p947xba6de98f.z aj() {
        if (!gm0.j1.a()) {
            return null;
        }
        jm0.o service = (jm0.o) i95.n0.c(com.p314xaae8f345.mm.p947xba6de98f.s1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(com.p314xaae8f345.mm.p947xba6de98f.z.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(service.getViewModel(), new jm0.e(service)).a(com.p314xaae8f345.mm.p947xba6de98f.z.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (com.p314xaae8f345.mm.p947xba6de98f.z) ((jm0.g) a17);
    }

    public static com.p314xaae8f345.mm.p947xba6de98f.b1 bj() {
        if (!gm0.j1.a()) {
            return null;
        }
        jm0.o service = (jm0.o) i95.n0.c(com.p314xaae8f345.mm.p947xba6de98f.s1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(com.p314xaae8f345.mm.p947xba6de98f.b1.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(service.getViewModel(), new jm0.e(service)).a(com.p314xaae8f345.mm.p947xba6de98f.b1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (com.p314xaae8f345.mm.p947xba6de98f.b1) ((jm0.g) a17);
    }

    public static com.p314xaae8f345.mm.p947xba6de98f.l1 cj() {
        com.p314xaae8f345.mm.p947xba6de98f.l1 l1Var;
        com.p314xaae8f345.mm.p947xba6de98f.s1 Zi = Zi();
        synchronized (Zi) {
            if (Zi.f152659m == null) {
                if (gm0.j1.b().n()) {
                    Zi.f152659m = new com.p314xaae8f345.mm.p947xba6de98f.l1(gm0.j1.u().h(), fj());
                    Zi.f152660n = true;
                } else {
                    java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + kk.k.g(("mm" + new java.util.Random().nextLong()).getBytes()) + "/";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCdnTransport", "hy: cdn temp path: %s", str);
                    Zi.f152659m = new com.p314xaae8f345.mm.p947xba6de98f.l1(str, fj());
                    Zi.f152660n = false;
                }
            }
            l1Var = Zi.f152659m;
        }
        return l1Var;
    }

    public static com.p314xaae8f345.mm.p947xba6de98f.h2 fj() {
        com.p314xaae8f345.mm.p947xba6de98f.s1 Zi = Zi();
        if (Zi.f152661o == null) {
            synchronized (Zi) {
                if (Zi.f152661o == null) {
                    Zi.f152661o = new com.p314xaae8f345.mm.p947xba6de98f.h2();
                }
            }
        }
        return Zi.f152661o;
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(com.p314xaae8f345.mm.p947xba6de98f.z.class);
        set.add(com.p314xaae8f345.mm.p947xba6de98f.b1.class);
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        synchronized (this) {
            try {
                if (!this.f152660n) {
                    synchronized (this) {
                        com.p314xaae8f345.mm.p947xba6de98f.l1 l1Var = this.f152659m;
                        if (l1Var != null) {
                            l1Var.f();
                            this.f152660n = false;
                            this.f152659m = null;
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        if (this.f152661o == null) {
            fj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCdnTransport", "summersafecdn onAccountPostReset new CdnTransportService hash[%s]", java.lang.Integer.valueOf(this.f152661o.hashCode()));
        }
        gm0.j1.d().a(379, this.f152666t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCdnTransport", "onAccountPostReset, tryToGetCdnDns");
        hj(1);
    }

    @Override // jm0.o
    public void Vi() {
        this.f152663q = null;
        synchronized (this) {
            com.p314xaae8f345.mm.p947xba6de98f.l1 l1Var = this.f152659m;
            if (l1Var != null) {
                l1Var.f();
                this.f152660n = false;
                this.f152659m = null;
            }
        }
        synchronized (this) {
            com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var = this.f152661o;
            if (h2Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "release");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = h2Var.f152524o;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                }
                gm0.j1.n().f354821b.q(379, h2Var);
                h2Var.f152520h.m43072x2efc64();
                h2Var.f152519g.d();
                this.f152661o = null;
            }
        }
        this.f152664r = 0L;
        this.f152665s.mo50302x6b17ad39(null);
        gm0.j1.d().q(379, this.f152666t);
    }

    public void hj(int i17) {
        this.f152664r = 0L;
        this.f152665s.mo50303x856b99f0(1);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p947xba6de98f.y2(i17));
    }

    @Override // jm0.o
    public java.lang.String wi() {
        return "MicroMsg.SubCoreCdnTransport";
    }
}
