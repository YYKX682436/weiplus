package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class c3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "operateGameCenterMsg";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateGameCenterMsg", "invokeInMM");
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateGameCenterMsg", "data is null");
            q5Var.a("invalid_data", null);
            return;
        }
        int optInt = jSONObject.optInt("cmd");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("param");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5574xf9eca6ce c5574xf9eca6ce = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5574xf9eca6ce();
        am.pe peVar = c5574xf9eca6ce.f135895g;
        peVar.f89147a = optInt;
        peVar.f89148b = optJSONObject.toString();
        c5574xf9eca6ce.e();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            java.lang.String str2 = c5574xf9eca6ce.f135896h.f89242a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("result", str2);
        } catch (org.json.JSONException unused2) {
        }
        q5Var.a(null, jSONObject2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
