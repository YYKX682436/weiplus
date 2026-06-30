package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class mb implements com.tencent.mm.plugin.appbrand.page.ob {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.a f86880a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap f86881b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f86882c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f86883d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f86884e;

    public mb(com.tencent.mm.plugin.appbrand.page.a renderer, com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap separatedPluginsMap) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        kotlin.jvm.internal.o.g(separatedPluginsMap, "separatedPluginsMap");
        this.f86880a = renderer;
        this.f86881b = separatedPluginsMap;
        this.f86882c = "Luggage.FULL.IWxaPageSeparatedPluginsInjectHelper.IMPL";
        this.f86883d = jz5.h.b(new com.tencent.mm.plugin.appbrand.page.lb(this));
        this.f86884e = new java.util.HashSet();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ob
    public void a(java.lang.String moduleName, boolean z17) {
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        java.lang.String str = "injectPlugins moduleName(" + moduleName + ") useLazyCodeLoading(" + z17 + ") hash(" + hashCode() + ')';
        java.lang.String str2 = this.f86882c;
        com.tencent.mars.xlog.Log.i(str2, str);
        com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = this.f86881b;
        java.util.List b17 = wxaRuntimeModulePluginListMap.b(moduleName);
        if (b17 == null) {
            java.lang.String i17 = com.tencent.mm.plugin.appbrand.appstorage.l1.i(moduleName);
            if (kotlin.jvm.internal.o.b(i17, moduleName)) {
                b17 = null;
            } else {
                kotlin.jvm.internal.o.d(i17);
                b17 = wxaRuntimeModulePluginListMap.b(i17);
            }
        }
        if (b17 == null || b17.isEmpty()) {
            com.tencent.mars.xlog.Log.i(str2, "injectPlugins, try with module(" + moduleName + "), get empty pluginList");
            return;
        }
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.ac.f75441j.a(moduleName, (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo) it.next());
            com.tencent.mm.plugin.appbrand.page.a aVar = this.f86880a;
            if (z17) {
                if (((com.tencent.mm.plugin.appbrand.appcache.y3) ((jz5.n) this.f86883d).getValue()).d(a17 + "/common.app.js")) {
                    b(aVar, a17 + "/common.app.js");
                    b(aVar, a17 + "/webview.app.js");
                }
            }
            b(aVar, a17 + "/pageframe.js");
        }
    }

    public final void b(com.tencent.mm.plugin.appbrand.page.a aVar, java.lang.String str) {
        java.util.HashSet hashSet = this.f86884e;
        if (hashSet.contains(str)) {
            return;
        }
        java.lang.String str2 = "inner evaluateScriptFile fileName(" + str + ") hash(" + hashCode() + ')';
        java.lang.String str3 = this.f86882c;
        com.tencent.mars.xlog.Log.i(str3, str2);
        java.lang.String a17 = aVar.O().a(str);
        if (!(a17 == null || a17.length() == 0)) {
            aVar.P(str, a17);
            hashSet.add(str);
        } else {
            com.tencent.mars.xlog.Log.w(str3, "evaluateScriptFile source EMPTY for " + str + ", skip adding to injectedScriptNames");
        }
    }
}
