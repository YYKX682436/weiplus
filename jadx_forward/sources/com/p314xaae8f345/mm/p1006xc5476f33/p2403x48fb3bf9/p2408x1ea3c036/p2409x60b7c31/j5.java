package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class j5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1.f34800x24728b;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareTimeLine", "invoke");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d;
        if (abstractActivityC21394xb3d2c0cf == null || abstractActivityC21394xb3d2c0cf.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShareTimeLine", "activity is null or finish");
            return;
        }
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        java.lang.String optString = jSONObject.optString("link");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareTimeLine", "link is null");
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString2 = jSONObject.optString("desc");
        if (optString2 != null) {
            if (optString2.startsWith("http://")) {
                optString2.substring(7);
            } else if (optString2.startsWith("https://")) {
                optString2.substring(8);
            }
        }
        java.lang.String optString3 = jSONObject.optString("appid");
        java.lang.String optString4 = jSONObject.optString("img_width");
        java.lang.String optString5 = jSONObject.optString("img_height");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareTimeLine", "doTimeline, rawUrl:[%s], shareUrl:[%s]", optString, optString);
        java.lang.String optString6 = jSONObject.optString("type");
        java.lang.String optString7 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString8 = jSONObject.optString("img_url");
        java.lang.String optString9 = jSONObject.optString("src_username");
        java.lang.String optString10 = jSONObject.optString("src_displayname");
        int i17 = -1;
        try {
            i17 = java.lang.Integer.valueOf(optString4).intValue();
            java.lang.Integer.valueOf(optString5);
        } catch (java.lang.Exception unused) {
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_width", i17);
        intent.putExtra("Ksnsupload_height", i17);
        intent.putExtra("Ksnsupload_link", optString);
        intent.putExtra("Ksnsupload_title", optString7);
        intent.putExtra("Ksnsupload_imgurl", optString8);
        if (c01.e2.G(optString9)) {
            intent.putExtra("src_username", optString9);
            intent.putExtra("src_displayname", optString10);
        }
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("Ksnsupload_type", 1);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString6) && optString6.equals("music")) {
            intent.putExtra("ksnsis_music", true);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString6) && optString6.equals("video")) {
            intent.putExtra("ksnsis_video", true);
        }
        if (optString3 != null && optString3.length() > 0) {
            intent.putExtra("Ksnsupload_appid", optString3);
        }
        intent.putExtra("ShareUrlOriginal", optString);
        intent.putExtra("ShareUrlOpen", ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).u());
        intent.putExtra("JsAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).K.b());
        intent.putExtra("need_result", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareTimeLine", "doTimeline, start activity");
        abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i5(this, bVar, abstractActivityC21394xb3d2c0cf));
        j45.l.o(abstractActivityC21394xb3d2c0cf, "sns", ".ui.SnsUploadUI", intent, hashCode() & 65535, false);
    }
}
