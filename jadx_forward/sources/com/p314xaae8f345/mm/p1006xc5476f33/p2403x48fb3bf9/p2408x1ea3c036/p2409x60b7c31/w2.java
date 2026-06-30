package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class w2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openWeAppPage";
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeAppPage", "invokeInOwn %s", bVar.f488130b.f426039c);
        java.lang.String optString = bVar.f488130b.f426039c.optString("userName");
        java.lang.String optString2 = bVar.f488130b.f426039c.optString("relativeURL");
        if (optString2.contains("render_data")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(android.net.Uri.parse(optString2).getQueryParameter("widgetData"));
                jSONObject.remove("render_data");
                optString2 = optString2.replaceAll("(widgetData=.*&)|(widgetData=.*$)", "&") + "&widgetData=" + jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenWeAppPage", e17, "", new java.lang.Object[0]);
            }
        }
        int optInt = bVar.f488130b.f426039c.optInt("appVersion", 0);
        java.lang.String optString3 = bVar.f488130b.f426039c.optString("searchId");
        java.lang.String optString4 = bVar.f488130b.f426039c.optString("docId");
        int optInt2 = bVar.f488130b.f426039c.optInt("position", 1);
        int optInt3 = bVar.f488130b.f426039c.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        java.lang.String optString5 = bVar.f488130b.f426039c.optString("privateExtraData");
        l81.b1 b1Var = new l81.b1();
        if (optInt3 == 201 || optInt3 == 14 || optInt3 == 22) {
            b1Var.f398565k = 1006;
        } else if (optInt3 == 3) {
            b1Var.f398565k = 1005;
        } else if (optInt3 == 16) {
            b1Var.f398565k = 1042;
        } else if (optInt3 == 20) {
            b1Var.f398565k = 1053;
        } else {
            b1Var.f398565k = 1000;
        }
        b1Var.f398567l = bVar.f488130b.f426039c.optString("statSessionId") + ":" + bVar.f488130b.f426039c.optString("statKeywordId") + ":" + optString3 + ":" + optString4 + ":" + optInt2 + ":" + bVar.f488130b.f426039c.optString("subScene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        b1Var.f398574s = c11812xa040dc98;
        c11812xa040dc98.f158858g = optString5;
        b1Var.f398545a = optString;
        b1Var.f398551d = optInt;
        b1Var.f398555f = optString2;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d, b1Var);
        bVar.a();
    }
}
