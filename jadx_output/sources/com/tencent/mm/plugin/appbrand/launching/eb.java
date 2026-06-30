package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class eb {
    public eb(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.launching.fb a(java.lang.String jsonString) {
        kotlin.jvm.internal.o.g(jsonString, "jsonString");
        try {
            java.lang.Object opt = new org.json.JSONObject(jsonString).opt("auth_item_list");
            if (opt != null && !kotlin.jvm.internal.o.b(org.json.JSONObject.NULL, opt) && (opt instanceof org.json.JSONArray) && ((org.json.JSONArray) opt).length() > 0) {
                com.tencent.mm.plugin.appbrand.launching.db dbVar = com.tencent.mm.plugin.appbrand.launching.db.f84575d;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                cf.f.b((org.json.JSONArray) opt, new cf.e(dbVar, linkedList));
                return new com.tencent.mm.plugin.appbrand.launching.fb(linkedList);
            }
            return null;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PrefetchGetUserPrivacyAuthInfoResponse", "parse json get exception:" + e17);
        }
        return null;
    }
}
