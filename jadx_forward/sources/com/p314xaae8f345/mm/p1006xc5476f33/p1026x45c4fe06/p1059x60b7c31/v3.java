package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class v3 {
    public v3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.util.List list, java.lang.String str) {
        boolean z17 = true;
        if (yVar != null && yVar.mo50262x39e05d35()) {
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w3 w3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w3();
            if (list != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    k91.v5 v5Var = (k91.v5) it.next();
                    org.json.JSONObject optJSONObject = new org.json.JSONObject(v5Var.f68905x453b082a).optJSONObject("PluginInfo");
                    if (optJSONObject == null) {
                        optJSONObject = new org.json.JSONObject();
                    }
                    jSONArray.put(optJSONObject.put("appId", v5Var.f68904x28d45f97));
                }
                w3Var.s("contactList", jSONArray);
            }
            w3Var.s("callbackId", str);
            w3Var.p(yVar);
            w3Var.m();
        }
    }
}
