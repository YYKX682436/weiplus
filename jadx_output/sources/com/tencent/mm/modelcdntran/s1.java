package com.tencent.mm.modelcdntran;

@j95.b
/* loaded from: classes8.dex */
public class s1 extends jm0.o {

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.modelbase.k0 f71130q;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelcdntran.l1 f71126m = null;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f71127n = false;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelcdntran.h2 f71128o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f71129p = false;

    /* renamed from: r, reason: collision with root package name */
    public long f71131r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f71132s = new com.tencent.mm.modelcdntran.q1(this, android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f71133t = new com.tencent.mm.modelcdntran.r1(this);

    public static com.tencent.mm.modelcdntran.s1 Zi() {
        return (com.tencent.mm.modelcdntran.s1) i95.n0.c(com.tencent.mm.modelcdntran.s1.class);
    }

    public static com.tencent.mm.modelcdntran.z aj() {
        if (!gm0.j1.a()) {
            return null;
        }
        jm0.o service = (jm0.o) i95.n0.c(com.tencent.mm.modelcdntran.s1.class);
        kotlin.jvm.internal.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(com.tencent.mm.modelcdntran.z.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(com.tencent.mm.modelcdntran.z.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.modelcdntran.z) ((jm0.g) a17);
    }

    public static com.tencent.mm.modelcdntran.b1 bj() {
        if (!gm0.j1.a()) {
            return null;
        }
        jm0.o service = (jm0.o) i95.n0.c(com.tencent.mm.modelcdntran.s1.class);
        kotlin.jvm.internal.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(com.tencent.mm.modelcdntran.b1.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(com.tencent.mm.modelcdntran.b1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.modelcdntran.b1) ((jm0.g) a17);
    }

    public static com.tencent.mm.modelcdntran.l1 cj() {
        com.tencent.mm.modelcdntran.l1 l1Var;
        com.tencent.mm.modelcdntran.s1 Zi = Zi();
        synchronized (Zi) {
            if (Zi.f71126m == null) {
                if (gm0.j1.b().n()) {
                    Zi.f71126m = new com.tencent.mm.modelcdntran.l1(gm0.j1.u().h(), fj());
                    Zi.f71127n = true;
                } else {
                    java.lang.String str = com.tencent.mm.storage.v3.f196273a + kk.k.g(("mm" + new java.util.Random().nextLong()).getBytes()) + "/";
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCdnTransport", "hy: cdn temp path: %s", str);
                    Zi.f71126m = new com.tencent.mm.modelcdntran.l1(str, fj());
                    Zi.f71127n = false;
                }
            }
            l1Var = Zi.f71126m;
        }
        return l1Var;
    }

    public static com.tencent.mm.modelcdntran.h2 fj() {
        com.tencent.mm.modelcdntran.s1 Zi = Zi();
        if (Zi.f71128o == null) {
            synchronized (Zi) {
                if (Zi.f71128o == null) {
                    Zi.f71128o = new com.tencent.mm.modelcdntran.h2();
                }
            }
        }
        return Zi.f71128o;
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(com.tencent.mm.modelcdntran.z.class);
        set.add(com.tencent.mm.modelcdntran.b1.class);
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        synchronized (this) {
            try {
                if (!this.f71127n) {
                    synchronized (this) {
                        com.tencent.mm.modelcdntran.l1 l1Var = this.f71126m;
                        if (l1Var != null) {
                            l1Var.f();
                            this.f71127n = false;
                            this.f71126m = null;
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        if (this.f71128o == null) {
            fj();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCdnTransport", "summersafecdn onAccountPostReset new CdnTransportService hash[%s]", java.lang.Integer.valueOf(this.f71128o.hashCode()));
        }
        gm0.j1.d().a(379, this.f71133t);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCdnTransport", "onAccountPostReset, tryToGetCdnDns");
        hj(1);
    }

    @Override // jm0.o
    public void Vi() {
        this.f71130q = null;
        synchronized (this) {
            com.tencent.mm.modelcdntran.l1 l1Var = this.f71126m;
            if (l1Var != null) {
                l1Var.f();
                this.f71127n = false;
                this.f71126m = null;
            }
        }
        synchronized (this) {
            com.tencent.mm.modelcdntran.h2 h2Var = this.f71128o;
            if (h2Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "release");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = h2Var.f70991o;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                }
                gm0.j1.n().f273288b.q(379, h2Var);
                h2Var.f70987h.dead();
                h2Var.f70986g.d();
                this.f71128o = null;
            }
        }
        this.f71131r = 0L;
        this.f71132s.removeCallbacksAndMessages(null);
        gm0.j1.d().q(379, this.f71133t);
    }

    public void hj(int i17) {
        this.f71131r = 0L;
        this.f71132s.removeMessages(1);
        gm0.j1.d().g(new com.tencent.mm.modelcdntran.y2(i17));
    }

    @Override // jm0.o
    public java.lang.String wi() {
        return "MicroMsg.SubCoreCdnTransport";
    }
}
