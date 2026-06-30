package es1;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "savePageData";
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
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        java.lang.String optString = jSONObject.optString("pageUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            bVar.c("pageUrl is empty", null);
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.j(optString).length() == 0) {
            bVar.c("host invalid", null);
            return;
        }
        java.lang.String optString2 = jSONObject.optString("content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        if (optString2.length() == 0) {
            bVar.c("content is empty", null);
            return;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(optString, false);
        nu4.k kVar = nu4.b0.f421774J;
        nu4.b bVar2 = nu4.b0.P;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a;
        ts1.o oVar = new ts1.o(optString, i17, bVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175980c, null, null, null, null, false, null, null, 2032, null);
        nu4.b bVar3 = oVar.f503123c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar3);
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(bVar3.Q(oVar.d()).u(), true);
        byte[] bytes = optString2.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        int S = com.p314xaae8f345.mm.vfs.w6.S(i18, bytes, 0, bytes.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePrefetchJsApiSavePageData", "[game-web-prefetch] savePageData content: " + optString2.length() + ", targetPath: " + i18 + ", webId: " + oVar.f503122b + ", bizId: " + oVar.d() + ", url: " + optString + ", ret: " + S);
        if (S != 0) {
            bVar.c("save page data error", null);
            return;
        }
        java.lang.String optString3 = jSONObject.optString("headers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
        if (optString3.length() > 0) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString3);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jSONObject2.optInt("x-wx-max-cache", -1));
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                oVar.l().put("x-wx-max-cache", kz5.b0.c(java.lang.String.valueOf(valueOf.intValue())));
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(jSONObject2.optInt("max-age", -1));
            if (!(valueOf2.intValue() > 0)) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                oVar.l().put("max-age", kz5.b0.c(java.lang.String.valueOf(valueOf2.intValue())));
            }
            if (jSONObject2.has("status")) {
                oVar.l().put("status", kz5.b0.c(java.lang.String.valueOf(jSONObject2.optInt("status", -1))));
            } else {
                oVar.l().put("status", kz5.b0.c("200"));
            }
            oVar.z(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e2.f175755g, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.j(optString));
        }
        bVar.a();
    }
}
