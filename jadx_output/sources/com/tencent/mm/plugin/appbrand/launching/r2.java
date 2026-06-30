package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class r2 extends c01.i8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f85097a;

    public r2(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f85097a = appId;
    }

    public static final java.lang.Object d(com.tencent.mm.plugin.appbrand.launching.r2 r2Var, kotlin.coroutines.Continuation continuation) {
        boolean contains;
        r2Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.appbrand.launching.o2 o2Var = new com.tencent.mm.plugin.appbrand.launching.o2(rVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(o2Var, 5000L, false);
        com.tencent.mm.plugin.appbrand.service.d5 d5Var = (com.tencent.mm.plugin.appbrand.service.d5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.d5.class);
        java.lang.String appId = r2Var.f85097a;
        com.tencent.mm.plugin.appbrand.launching.p2 p2Var = new com.tencent.mm.plugin.appbrand.launching.p2(r2Var, rVar);
        com.tencent.mm.plugin.appbrand.appcache.e eVar = (com.tencent.mm.plugin.appbrand.appcache.e) d5Var;
        eVar.getClass();
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = eVar.f75499e;
        java.util.Collection collection = (java.util.List) concurrentHashMap.get(appId);
        if (collection == null) {
            collection = new java.util.ArrayList();
        }
        concurrentHashMap.put(appId, collection);
        java.lang.Object obj = eVar.f75499e.get(appId);
        kotlin.jvm.internal.o.d(obj);
        ((java.util.List) obj).add(p2Var);
        com.tencent.mm.plugin.appbrand.appcache.c cVar = eVar.f75498d;
        cVar.getClass();
        synchronized (cVar.f75458a) {
            java.util.List list = cVar.f75459b;
            contains = list != null ? ((java.util.ArrayList) list).contains(appId) : false;
        }
        if (!contains) {
            p2Var.a();
        }
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppLaunchFileCleanBlockingRunner";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return true;
    }

    @Override // c01.i8
    public void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppLaunchFileCleanBlockingRunner", "transfer for appId:" + this.f85097a + ", start");
        kotlinx.coroutines.l.f(null, new com.tencent.mm.plugin.appbrand.launching.q2(this, null), 1, null);
    }
}
