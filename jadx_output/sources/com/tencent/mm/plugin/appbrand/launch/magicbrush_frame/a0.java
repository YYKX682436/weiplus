package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng1.s f84257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f84258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ng1.s sVar, kotlinx.coroutines.q qVar) {
        super(1);
        this.f84257d = sVar;
        this.f84258e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List<com.tencent.mm.plugin.appbrand.appcache.IPkgInfo> it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ng1.t tVar = (ng1.t) this.f84257d;
        tVar.getClass();
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = tVar.f336949a;
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
        kotlinx.coroutines.q qVar = this.f84258e;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(((ng1.t) this.f84257d).f336949a));
        return jz5.f0.f302826a;
    }
}
