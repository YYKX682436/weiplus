package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class xb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f76055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ac f76056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(java.util.LinkedList linkedList, com.tencent.mm.plugin.appbrand.appcache.ac acVar) {
        super(0);
        this.f76055d = linkedList;
        this.f76056e = acVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        java.util.Iterator it = this.f76055d.iterator();
        com.tencent.mm.plugin.appbrand.appcache.ac acVar = this.f76056e;
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo = (com.tencent.mm.plugin.appbrand.appcache.IPkgInfo) it.next();
            if (!(iPkgInfo instanceof com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) && (iPkgInfo instanceof com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo)) {
                com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = acVar.f75444c.f75404i;
                kotlin.jvm.internal.o.d(wxaRuntimeModulePluginListMap);
                wxaRuntimeModulePluginListMap.d((com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) iPkgInfo);
                it.remove();
            }
        }
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.appcache.IPkgInfo> linkedList = this.f76055d;
        com.tencent.mm.plugin.appbrand.appcache.ac acVar2 = this.f76056e;
        for (com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo2 : linkedList) {
            kotlin.jvm.internal.o.e(iPkgInfo2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo");
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) iPkgInfo2;
            java.util.Iterator<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> it6 = acVar2.f75444c.iterator();
            while (true) {
                com.tencent.mm.plugin.appbrand.appcache.ab abVar = (com.tencent.mm.plugin.appbrand.appcache.ab) it6;
                if (!abVar.hasNext()) {
                    obj = null;
                    break;
                }
                obj = abVar.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) obj).name, modulePkgInfo.name)) {
                    break;
                }
            }
            kotlin.jvm.internal.o.d(obj);
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo2 = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) obj;
            modulePkgInfo2.pkgPath = modulePkgInfo.pkgPath;
            modulePkgInfo2.f75372md5 = modulePkgInfo.f75372md5;
            com.tencent.mm.plugin.appbrand.appcache.ac.b(acVar2, modulePkgInfo);
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap2 = acVar2.f75444c.f75404i;
            if (wxaRuntimeModulePluginListMap2 != null) {
                java.lang.String name = modulePkgInfo.name;
                kotlin.jvm.internal.o.f(name, "name");
                java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo> b17 = wxaRuntimeModulePluginListMap2.b(name);
                if (b17 != null) {
                    for (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo : b17) {
                        java.lang.String name2 = modulePkgInfo.name;
                        kotlin.jvm.internal.o.f(name2, "name");
                        com.tencent.mm.plugin.appbrand.appcache.ac.m(acVar2, name2, wxaPluginPkgInfo);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
