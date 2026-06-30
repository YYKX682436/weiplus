package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class u0 {
    public u0(kotlin.jvm.internal.i iVar) {
    }

    public final org.json.JSONObject a(com.tencent.mm.plugin.appbrand.jsapi.l service, java.lang.String moduleName, org.json.JSONObject data) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo;
        com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap;
        java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo> b17;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU = (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) service.b(com.tencent.luggage.sdk.config.AppBrandSysConfigLU.class);
        if (appBrandSysConfigLU != null && (wxaPkgWrappingInfo = appBrandSysConfigLU.f305852r) != null && (wxaRuntimeModulePluginListMap = wxaPkgWrappingInfo.f75404i) != null && (b17 = wxaRuntimeModulePluginListMap.b(moduleName)) != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo : b17) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("plugin_id", wxaPluginPkgInfo.provider);
                jSONObject.put("custom_version", wxaPluginPkgInfo.stringVersion);
                jSONObject.put("prefix_path", wxaPluginPkgInfo.prefixPath);
                jSONObject.put("inner_version", wxaPluginPkgInfo.version);
                jSONArray.put(jSONObject);
            }
            data.put("separatedPlugins", jSONArray);
        }
        return data;
    }
}
