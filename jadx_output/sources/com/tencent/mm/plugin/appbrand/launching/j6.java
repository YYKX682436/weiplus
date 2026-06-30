package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.j6 f84692a = new com.tencent.mm.plugin.appbrand.launching.j6();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f84693b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final ik1.x f84694c = new ik1.x();

    /* renamed from: d, reason: collision with root package name */
    public static final ik1.x f84695d = new ik1.x();

    /* renamed from: e, reason: collision with root package name */
    public static final ik1.x f84696e = new ik1.x();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f84697f = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    public static com.tencent.mm.plugin.appbrand.launching.b6 a(com.tencent.mm.plugin.appbrand.launching.j6 j6Var, com.tencent.mm.plugin.appbrand.launching.o6 request, yz5.l onSuccess, yz5.p onError, yz5.l lVar, com.tencent.mm.plugin.appbrand.launching.a7 a7Var, r45.y50 cgiCommRequestSource, com.tencent.mm.plugin.appbrand.launching.l6 l6Var, com.tencent.mm.plugin.appbrand.launching.k6 k6Var, java.util.concurrent.Executor executor, java.lang.String str, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.q4 q4Var;
        com.tencent.mm.plugin.appbrand.launching.q4 q4Var2;
        yz5.l onProgress = (i17 & 8) != 0 ? com.tencent.mm.plugin.appbrand.launching.f6.f84610d : lVar;
        com.tencent.mm.plugin.appbrand.launching.a7 cgiExecutor = (i17 & 16) != 0 ? com.tencent.mm.plugin.appbrand.launching.x5.f85410a : a7Var;
        com.tencent.mm.plugin.appbrand.launching.l6 l6Var2 = (i17 & 64) != 0 ? null : l6Var;
        com.tencent.mm.plugin.appbrand.launching.k6 k6Var2 = (i17 & 128) != 0 ? null : k6Var;
        java.util.concurrent.Executor executor2 = (i17 & 256) != 0 ? null : executor;
        java.lang.String str2 = (i17 & 512) != 0 ? null : str;
        j6Var.getClass();
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onError, "onError");
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(cgiExecutor, "cgiExecutor");
        kotlin.jvm.internal.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        java.util.concurrent.Executor executor3 = executor2;
        com.tencent.mm.plugin.appbrand.launching.i6 i6Var = new com.tencent.mm.plugin.appbrand.launching.i6(request, onSuccess, onError, onProgress, cgiExecutor, cgiCommRequestSource, k6Var2, str2, c0Var);
        java.util.Map map = f84693b;
        if (map instanceof java.util.concurrent.ConcurrentHashMap) {
            java.lang.Object computeIfAbsent = ((java.util.concurrent.ConcurrentHashMap) map).computeIfAbsent(request, new com.tencent.mm.plugin.appbrand.launching.g6(i6Var));
            kotlin.jvm.internal.o.f(computeIfAbsent, "computeIfAbsent(...)");
            q4Var2 = (com.tencent.mm.plugin.appbrand.launching.q4) computeIfAbsent;
        } else {
            synchronized (map) {
                q4Var = (com.tencent.mm.plugin.appbrand.launching.q4) ((java.util.concurrent.ConcurrentHashMap) map).get(request);
                if (q4Var == null) {
                    java.lang.Object invoke = i6Var.invoke();
                    ((java.util.concurrent.ConcurrentHashMap) map).put(request, (com.tencent.mm.plugin.appbrand.launching.q4) invoke);
                    q4Var = (com.tencent.mm.plugin.appbrand.launching.q4) invoke;
                }
            }
            q4Var2 = q4Var;
        }
        if (l6Var2 != null) {
            q4Var2.f85069l.add(l6Var2);
            q4Var2.f85073p = true;
        }
        if (c0Var.f310112d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ICommonPkgFetcher", "waitForPkg enqueue request(" + request + ')');
            (executor3 == null ? com.tencent.mm.plugin.appbrand.launching.c6.f84544d : executor3).execute(new com.tencent.mm.plugin.appbrand.utils.m(new com.tencent.mm.plugin.appbrand.launching.h6(q4Var2), (java.lang.String) ((jz5.n) request.f84858n).getValue()));
            return com.tencent.mm.plugin.appbrand.launching.b6.f84519e;
        }
        com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
        com.tencent.mm.plugin.appbrand.app.r9.mj();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ICommonPkgFetcher", "waitForPkg already executing, add pending callbacks, request(" + request + ')');
        f84694c.e(request, onSuccess);
        f84695d.e(request, onError);
        f84696e.e(request, onProgress);
        return com.tencent.mm.plugin.appbrand.launching.b6.f84518d;
    }
}
