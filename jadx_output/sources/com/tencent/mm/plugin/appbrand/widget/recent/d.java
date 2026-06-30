package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f91960d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f91961e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f91962f = new java.util.LinkedHashSet();

    public d(java.lang.Object obj) {
        this.f91960d = obj;
        c(new com.tencent.mm.plugin.appbrand.widget.recent.a(this));
    }

    public final void b(l75.q0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        synchronized (this.f91962f) {
            this.f91962f.add(listener);
        }
    }

    public abstract void c(l75.q0 q0Var);

    public abstract void f(java.lang.String str, l75.w0 w0Var);

    public java.lang.Object h(com.tencent.mm.plugin.appbrand.widget.recent.g2 cacheConfig) {
        kotlin.jvm.internal.o.g(cacheConfig, "cacheConfig");
        java.lang.Object k17 = k(cacheConfig.f91987a);
        synchronized (this.f91961e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "queryAndCache for config: [" + cacheConfig + ']');
            this.f91961e.put(cacheConfig, k17);
        }
        return k17;
    }

    public final java.lang.Object i(java.lang.Object... args) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(args, "args");
        com.tencent.mm.plugin.appbrand.widget.recent.g2 g2Var = new com.tencent.mm.plugin.appbrand.widget.recent.g2(java.util.Arrays.copyOf(args, args.length));
        synchronized (this.f91961e) {
            obj = ((java.util.LinkedHashMap) this.f91961e).get(g2Var);
        }
        if (obj != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "cache hit, return cache for config: [" + g2Var + ']');
            return obj;
        }
        java.lang.Object h17 = h(g2Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "no cache for config: [" + g2Var + "], do query through delegate");
        return h17;
    }

    public abstract java.lang.Object k(java.lang.Object[] objArr);

    public final void l(l75.q0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        synchronized (this.f91962f) {
            this.f91962f.remove(listener);
            com.tencent.mars.xlog.Log.i("MicroMsg.AbsAppBrandStorageWithCache", "removed: " + this.f91962f.size());
        }
    }
}
