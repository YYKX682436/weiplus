package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class a3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "preVerifyJSAPI";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreVerify", "invokeInOwn");
        sx4.d0.m(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).s(), java.lang.System.currentTimeMillis());
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        java.lang.String optString = jSONObject.optString("verifyAppId");
        java.lang.String optString2 = jSONObject.optString("verifySignature");
        java.lang.String optString3 = jSONObject.optString("verifyNonceStr");
        java.lang.String optString4 = jSONObject.optString("verifyTimestamp");
        java.lang.String optString5 = jSONObject.optString("verifySignType");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("verifyJsApiList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreVerify", "appid : %s, %s, %s, %s, %s", optString, optString2, optString3, optString4, optString5);
        java.lang.String u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).u();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreVerify", "jsItem length %s", java.lang.Integer.valueOf(optJSONArray.length()));
            if (optJSONArray.length() == 0) {
                bVar.c("checkJsApi:param is empty", null);
                return;
            }
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                java.lang.String string = optJSONArray.getString(i17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    linkedList.add(string);
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || linkedList.size() <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPreVerify", "handlePreVerify wrong args, %s", optString);
                bVar.c("pre_verify_jsapi:fail_invalid_args", null);
                return;
            }
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.x14();
            lVar.f152198b = new r45.y14();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/jsapi-preverify";
            lVar.f152200d = bb1.g.f4187x366c91de;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.x14 x14Var = (r45.x14) a17.f152243a.f152217a;
            x14Var.f471183d = u17;
            x14Var.f471184e = optString;
            x14Var.f471185f = linkedList;
            x14Var.f471186g = optString4;
            x14Var.f471187h = optString3;
            x14Var.f471188i = optString2;
            x14Var.f471189m = optString5;
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z2(bVar, optString));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiPreVerify", "exception occur " + e17.getMessage());
            bVar.a();
        }
    }
}
