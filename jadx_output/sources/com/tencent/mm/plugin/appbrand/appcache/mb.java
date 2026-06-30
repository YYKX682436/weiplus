package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class mb {
    public mb(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String hostModule, com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo plugin) {
        kotlin.jvm.internal.o.g(hostModule, "hostModule");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        if (kotlin.jvm.internal.o.b(hostModule, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME)) {
            return b(plugin);
        }
        if (r26.n0.E(hostModule, '/', false, 2, null)) {
            return hostModule + b(plugin);
        }
        return hostModule + '/' + b(plugin);
    }

    public final java.lang.String b(com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo) {
        java.lang.String str = wxaPluginPkgInfo.prefixPath;
        if (str == null || str.length() == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo.PREFIX_EXTENDED + wxaPluginPkgInfo.provider;
        }
        java.lang.String str2 = wxaPluginPkgInfo.prefixPath;
        kotlin.jvm.internal.o.d(str2);
        return str2;
    }
}
