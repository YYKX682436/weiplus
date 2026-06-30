package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentSkipListSet f85047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f85048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o3 f85049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f85050g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f85051h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 f85052i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85053m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f85054n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.k3 f85055o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.a7 f85056p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet, com.tencent.mm.plugin.appbrand.launching.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.o3 o3Var, java.util.HashSet hashSet, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1, java.lang.String str, yz5.l lVar, com.tencent.mm.plugin.appbrand.launching.k3 k3Var, com.tencent.mm.plugin.appbrand.launching.a7 a7Var) {
        super(1);
        this.f85047d = concurrentSkipListSet;
        this.f85048e = o6Var;
        this.f85049f = o3Var;
        this.f85050g = hashSet;
        this.f85051h = atomicBoolean;
        this.f85052i = batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1;
        this.f85053m = str;
        this.f85054n = lVar;
        this.f85055o = k3Var;
        this.f85056p = a7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.p6 response = (com.tencent.mm.plugin.appbrand.launching.p6) obj;
        kotlin.jvm.internal.o.g(response, "response");
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = this.f85047d;
        com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo = response.f84892a;
        boolean add = concurrentSkipListSet.add(iPkgInfo);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("waitForPkg ");
        com.tencent.mm.plugin.appbrand.launching.o6 request = this.f85048e;
        sb6.append(request);
        sb6.append(" onSuccess(");
        sb6.append(iPkgInfo.pkgVersion());
        sb6.append('|');
        com.tencent.mm.plugin.appbrand.launching.s6 s6Var = response.f84893b;
        sb6.append(s6Var);
        sb6.append(") added(");
        sb6.append(add);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BatchGetCodePkgExecutor", sb6.toString());
        if (add) {
            kotlin.jvm.internal.o.f(request, "$request");
            com.tencent.mm.plugin.appbrand.launching.o3 o3Var = this.f85049f;
            o3Var.getClass();
            java.lang.String pkgPath = iPkgInfo.pkgPath();
            kotlin.jvm.internal.o.d(pkgPath);
            if (o3Var.f84844b.size() == 1) {
                if (kotlin.jvm.internal.o.b(s6Var, com.tencent.mm.plugin.appbrand.launching.r6.f85104a)) {
                    long k17 = com.tencent.mm.vfs.w6.k(pkgPath);
                    o3Var.f84843a.invoke(new com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress(100, k17, k17));
                }
            } else if (o3Var.f84845c.size() > 0) {
                long k18 = com.tencent.mm.vfs.w6.k(pkgPath);
                o3Var.a(request, new com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress(100, k18, k18));
            }
            if (concurrentSkipListSet.size() == this.f85050g.size()) {
                if (!this.f85051h.getAndSet(true)) {
                    dead();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + this.f85053m + ") waitForPkg all completed");
                    this.f85054n.invoke(kz5.n0.S0(concurrentSkipListSet));
                    com.tencent.mm.plugin.appbrand.launching.k3 k3Var = this.f85055o;
                    if (k3Var != null) {
                        k3Var.b();
                    }
                }
            } else if (s6Var instanceof com.tencent.mm.plugin.appbrand.launching.q6) {
                com.tencent.mm.plugin.appbrand.launching.a7 a7Var = this.f85056p;
                com.tencent.mm.plugin.appbrand.launching.n3 n3Var = a7Var instanceof com.tencent.mm.plugin.appbrand.launching.n3 ? (com.tencent.mm.plugin.appbrand.launching.n3) a7Var : null;
                if (n3Var != null) {
                    n3Var.d(request);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
