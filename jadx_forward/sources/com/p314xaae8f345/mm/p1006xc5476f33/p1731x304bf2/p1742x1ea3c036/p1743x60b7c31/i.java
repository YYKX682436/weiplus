package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes5.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "searchChatRoomMemberByName";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("chatroomName");
        java.lang.String optString2 = e17.optString("searchText");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            q5Var.a("invalid_params", null);
            return;
        }
        ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
        java.util.List<y33.g> Wd = ((y33.h) i95.n0.c(y33.h.class)).Wd(optString2, optString);
        java.lang.String str2 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(Wd)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.PluginGameChatRoom", "searchChatRoomMemberByName  chatroomName = %s  keywords = %s   result null", optString, optString2);
        } else {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (y33.g gVar : Wd) {
                if (gVar.f68999x2261249b != 1) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("userName", gVar.f69002xdde069b);
                        jSONObject.put("nickName", gVar.f68998x21eb2633);
                        jSONObject.put("avatar", gVar.f68996x81118851);
                    } catch (org.json.JSONException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GameChatRoom.PluginGameChatRoom", e18, "", new java.lang.Object[0]);
                    }
                    jSONArray.put(jSONObject);
                }
            }
            str2 = jSONArray.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.PluginGameChatRoom", "searchChatRoomMemberByName  chatroomName = %s  keywords = %s   jsonArrayResultStr = %s", optString, optString2, str2);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("searchResult", new org.json.JSONArray(str2));
        } catch (org.json.JSONException unused) {
            jSONObject2.put("searchResult", "[]");
        }
        q5Var.a(null, jSONObject2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
