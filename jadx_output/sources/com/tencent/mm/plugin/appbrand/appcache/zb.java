package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class zb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ac f76101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(com.tencent.mm.plugin.appbrand.appcache.ac acVar) {
        super(0);
        this.f76101d = acVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean hasNext;
        boolean hasNext2;
        com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo;
        java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo> list;
        com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo2;
        com.tencent.mm.plugin.appbrand.appcache.ac acVar = this.f76101d;
        acVar.f75444c.g(acVar.f75443b);
        com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = this.f76101d.f75444c.f75404i;
        if (wxaRuntimeModulePluginListMap != null) {
            wxaRuntimeModulePluginListMap.e();
        }
        com.tencent.mm.plugin.appbrand.appcache.ac acVar2 = this.f76101d;
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(this.f76101d.f75444c.f75402g.size() + 1);
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f76101d.f75444c;
        wxaPkgWrappingInfo.getClass();
        boolean z17 = false;
        boolean z18 = false;
        java.util.Iterator it = null;
        while (true) {
            if (z18) {
                if (it == null) {
                    it = wxaPkgWrappingInfo.f75402g.iterator();
                }
                hasNext = it.hasNext();
            } else {
                hasNext = true;
            }
            if (!hasNext) {
                break;
            }
            if (z18) {
                modulePkgInfo2 = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) it.next();
            } else {
                modulePkgInfo2 = wxaPkgWrappingInfo;
                z18 = true;
            }
            arrayMap.put(modulePkgInfo2.name, modulePkgInfo2);
        }
        acVar2.getClass();
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo2 = this.f76101d.f75444c;
        wxaPkgWrappingInfo2.getClass();
        java.util.Iterator it6 = null;
        while (true) {
            if (z17) {
                if (it6 == null) {
                    it6 = wxaPkgWrappingInfo2.f75402g.iterator();
                }
                hasNext2 = it6.hasNext();
            } else {
                hasNext2 = true;
            }
            if (!hasNext2) {
                return jz5.f0.f302826a;
            }
            if (z17) {
                modulePkgInfo = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) it6.next();
            } else {
                modulePkgInfo = wxaPkgWrappingInfo2;
                z17 = true;
            }
            if (com.tencent.mm.vfs.w6.j(modulePkgInfo.pkgPath)) {
                com.tencent.mm.plugin.appbrand.appcache.ac.b(this.f76101d, modulePkgInfo);
                com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap2 = this.f76101d.f75444c.f75404i;
                if (wxaRuntimeModulePluginListMap2 != null) {
                    java.lang.String name = modulePkgInfo.name;
                    kotlin.jvm.internal.o.f(name, "name");
                    list = wxaRuntimeModulePluginListMap2.b(name);
                } else {
                    list = null;
                }
                if (list == null) {
                    list = kz5.p0.f313996d;
                }
                for (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo : list) {
                    com.tencent.mm.plugin.appbrand.appcache.ac acVar3 = this.f76101d;
                    java.lang.String name2 = modulePkgInfo.name;
                    kotlin.jvm.internal.o.f(name2, "name");
                    com.tencent.mm.plugin.appbrand.appcache.ac.m(acVar3, name2, wxaPluginPkgInfo);
                }
            }
        }
    }
}
