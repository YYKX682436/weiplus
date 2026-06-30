package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class v3 {
    public v3(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.appbrand.y yVar, java.util.List list, java.lang.String str) {
        boolean z17 = true;
        if (yVar != null && yVar.isRunning()) {
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.w3 w3Var = new com.tencent.mm.plugin.appbrand.jsapi.w3();
            if (list != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    k91.v5 v5Var = (k91.v5) it.next();
                    org.json.JSONObject optJSONObject = new org.json.JSONObject(v5Var.field_appInfo).optJSONObject("PluginInfo");
                    if (optJSONObject == null) {
                        optJSONObject = new org.json.JSONObject();
                    }
                    jSONArray.put(optJSONObject.put("appId", v5Var.field_appId));
                }
                w3Var.s("contactList", jSONArray);
            }
            w3Var.s("callbackId", str);
            w3Var.p(yVar);
            w3Var.m();
        }
    }
}
