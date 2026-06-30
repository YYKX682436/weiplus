package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public class i6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6 f162841c;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6 j6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f162841c = j6Var;
        this.f162839a = lVar;
        this.f162840b = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.dc7 dc7Var = (r45.dc7) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6 j6Var = this.f162841c;
        int i17 = this.f162840b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162839a;
        if (dc7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq cgi failed, null response");
            lVar.a(i17, j6Var.o("fail:cgi fail"));
            return null;
        }
        int i18 = dc7Var.f76492x92037252.f458492d;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), dc7Var.f76492x92037252.f458493e);
            lVar.a(i17, j6Var.o("fail:cgi fail"));
            return null;
        }
        try {
            java.util.LinkedList linkedList = dc7Var.f453848e;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.vb vbVar = (r45.vb) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("scope", vbVar.f469591d);
                    jSONObject.put("state", vbVar.f469593f);
                    jSONObject.put("desc", vbVar.f469592e);
                    jSONArray.put(jSONObject);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetSetting", "parse json failed : %s", e17.getMessage());
                }
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errMsg", "getSetting:ok");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (jSONArray2 == null) {
                    jSONArray2 = "";
                }
                jSONObject2.put("authSetting", new org.json.JSONArray(jSONArray2));
                lVar.a(i17, jSONObject2.toString());
                return null;
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetSetting", e18, "set json error!", new java.lang.Object[0]);
                lVar.a(i17, j6Var.o("fail:resp invalid"));
                return null;
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
