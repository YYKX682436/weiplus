package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 f85098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f85099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f85100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f85101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.k3 f85102h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1, com.tencent.mm.plugin.appbrand.launching.o6 o6Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, yz5.p pVar, com.tencent.mm.plugin.appbrand.launching.k3 k3Var) {
        super(2);
        this.f85098d = batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1;
        this.f85099e = o6Var;
        this.f85100f = atomicBoolean;
        this.f85101g = pVar;
        this.f85102h = k3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.launching.a6 err = (com.tencent.mm.plugin.appbrand.launching.a6) obj;
        java.lang.String str = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(err, "err");
        dead();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("waitForPkg ");
        com.tencent.mm.plugin.appbrand.launching.o6 request = this.f85099e;
        sb6.append(request);
        sb6.append(" onError(");
        sb6.append(err);
        sb6.append(' ');
        sb6.append(str);
        sb6.append("), stack=");
        sb6.append(android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.BatchGetCodePkgExecutor", sb6.toString());
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f85100f;
        if (!atomicBoolean.getAndSet(true)) {
            this.f85101g.invoke(java.lang.Integer.valueOf(err.f84497d), str);
            atomicBoolean.set(true);
        }
        com.tencent.mm.plugin.appbrand.launching.k3 k3Var = this.f85102h;
        if (k3Var != null) {
            kotlin.jvm.internal.o.f(request, "$request");
            k3Var.c(request);
        }
        return jz5.f0.f302826a;
    }
}
