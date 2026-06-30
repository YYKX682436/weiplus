package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class va implements ph1.r, com.tencent.mm.plugin.appbrand.launching.ka {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f85277b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f85278c;

    /* renamed from: d, reason: collision with root package name */
    public ph1.p f85279d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs f85280e;

    public va(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6, java.lang.String requestedModuleName) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(requestedModuleName, "requestedModuleName");
        this.f85277b = rt6;
        this.f85278c = requestedModuleName;
        this.f85280e = new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs(rt6, requestedModuleName);
    }

    @Override // ph1.r
    public void a(java.util.concurrent.Executor executor) {
        ph1.p pVar = this.f85279d;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6 = this.f85277b;
        kotlin.jvm.internal.o.g(rt6, "rt");
        java.lang.String requestedModuleName = this.f85278c;
        kotlin.jvm.internal.o.g(requestedModuleName, "requestedModuleName");
        this.f85280e.f84466t = new com.tencent.mm.plugin.appbrand.launching.ja(rt6, requestedModuleName, pVar, null);
        if (executor == null) {
            executor = ph1.o.f354347c;
        }
        executor.execute(new com.tencent.mm.plugin.appbrand.launching.ua(this));
    }

    @Override // ph1.r
    public void b(ph1.p pVar) {
        this.f85279d = pVar;
    }
}
