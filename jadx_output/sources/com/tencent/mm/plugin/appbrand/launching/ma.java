package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ma implements ph1.r, com.tencent.mm.plugin.appbrand.launching.ka {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f84786b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f84787c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84788d;

    /* renamed from: e, reason: collision with root package name */
    public ph1.p f84789e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f84790f;

    public ma(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6, java.lang.String moduleName, java.lang.String transactionKey) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        kotlin.jvm.internal.o.g(transactionKey, "transactionKey");
        this.f84786b = rt6;
        this.f84787c = moduleName;
        this.f84788d = transactionKey;
        this.f84790f = jz5.h.b(new com.tencent.mm.plugin.appbrand.launching.la(this));
    }

    @Override // ph1.r
    public void a(java.util.concurrent.Executor executor) {
        com.tencent.mm.plugin.appbrand.launching.ea eaVar;
        kotlin.jvm.internal.o.b(executor, ph1.o.f354345a);
        java.util.Map map = com.tencent.mm.plugin.appbrand.launching.ea.f84597d;
        java.lang.String transactionKey = this.f84788d;
        kotlin.jvm.internal.o.g(transactionKey, "transactionKey");
        java.util.Map map2 = com.tencent.mm.plugin.appbrand.launching.ea.f84597d;
        if (map2 instanceof java.util.concurrent.ConcurrentHashMap) {
            java.lang.Object computeIfAbsent = ((java.util.concurrent.ConcurrentHashMap) map2).computeIfAbsent(transactionKey, new com.tencent.mm.plugin.appbrand.launching.u9(transactionKey));
            kotlin.jvm.internal.o.d(computeIfAbsent);
            eaVar = (com.tencent.mm.plugin.appbrand.launching.ea) computeIfAbsent;
        } else {
            synchronized (map2) {
                com.tencent.mm.plugin.appbrand.launching.ea eaVar2 = (com.tencent.mm.plugin.appbrand.launching.ea) ((java.util.concurrent.ConcurrentHashMap) map2).get(transactionKey);
                if (eaVar2 == null) {
                    eaVar2 = new com.tencent.mm.plugin.appbrand.launching.ea(transactionKey);
                    ((java.util.concurrent.ConcurrentHashMap) map2).put(transactionKey, eaVar2);
                }
                eaVar = eaVar2;
            }
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = eaVar.f84600c;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f84786b;
        if (appBrandRuntime == null) {
            eaVar.f84600c = appBrandRuntime2;
        } else {
            kotlin.jvm.internal.o.b(appBrandRuntime, appBrandRuntime2);
        }
        eaVar.f84599b.add(this);
    }

    @Override // ph1.r
    public void b(ph1.p pVar) {
        this.f84789e = pVar;
    }
}
