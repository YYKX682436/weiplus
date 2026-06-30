package com.tencent.mm.plugin.appbrand.extendplugin;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandExtendPluginUtil", "build json object fail", e17);
        }
    }
}
