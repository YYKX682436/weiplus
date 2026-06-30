package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f173493d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f173494e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f173495f = new java.util.LinkedHashSet();

    public d(java.lang.Object obj) {
        this.f173493d = obj;
        c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.a(this));
    }

    public final void b(l75.q0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        synchronized (this.f173495f) {
            this.f173495f.add(listener);
        }
    }

    public abstract void c(l75.q0 q0Var);

    public abstract void f(java.lang.String str, l75.w0 w0Var);

    public java.lang.Object h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g2 cacheConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheConfig, "cacheConfig");
        java.lang.Object k17 = k(cacheConfig.f173520a);
        synchronized (this.f173494e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "queryAndCache for config: [" + cacheConfig + ']');
            this.f173494e.put(cacheConfig, k17);
        }
        return k17;
    }

    public final java.lang.Object i(java.lang.Object... args) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g2 g2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g2(java.util.Arrays.copyOf(args, args.length));
        synchronized (this.f173494e) {
            obj = ((java.util.LinkedHashMap) this.f173494e).get(g2Var);
        }
        if (obj != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "cache hit, return cache for config: [" + g2Var + ']');
            return obj;
        }
        java.lang.Object h17 = h(g2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "no cache for config: [" + g2Var + "], do query through delegate");
        return h17;
    }

    public abstract java.lang.Object k(java.lang.Object[] objArr);

    public final void l(l75.q0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        synchronized (this.f173495f) {
            this.f173495f.remove(listener);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "removed: " + this.f173495f.size());
        }
    }
}
