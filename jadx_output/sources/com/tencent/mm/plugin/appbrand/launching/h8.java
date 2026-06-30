package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class h8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r8 f84639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f84640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f84641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f84642g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(com.tencent.mm.plugin.appbrand.launching.r8 r8Var, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f84639d = r8Var;
        this.f84640e = wxaPkgWrappingInfo;
        this.f84641f = atomicReference;
        this.f84642g = countDownLatch;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List<com.tencent.mm.plugin.appbrand.appcache.IPkgInfo> it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.launching.r8 r8Var = this.f84639d;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f84640e;
        r8Var.getClass();
        for (com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo : it) {
            if (iPkgInfo instanceof com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) {
                java.util.Iterator<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> it6 = wxaPkgWrappingInfo.iterator();
                while (true) {
                    com.tencent.mm.plugin.appbrand.appcache.ab abVar = (com.tencent.mm.plugin.appbrand.appcache.ab) it6;
                    if (!abVar.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = abVar.next();
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) obj2).name, ((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) iPkgInfo).name)) {
                        break;
                    }
                }
                kotlin.jvm.internal.o.d(obj2);
                com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) obj2;
                com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo2 = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) iPkgInfo;
                modulePkgInfo.pkgPath = modulePkgInfo2.pkgPath;
                modulePkgInfo.f75372md5 = modulePkgInfo2.f75372md5;
            } else if (iPkgInfo instanceof com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) {
                com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = wxaPkgWrappingInfo.f75404i;
                kotlin.jvm.internal.o.d(wxaRuntimeModulePluginListMap);
                wxaRuntimeModulePluginListMap.d((com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) iPkgInfo);
            }
        }
        this.f84641f.set(this.f84640e);
        this.f84642g.countDown();
        return jz5.f0.f302826a;
    }
}
