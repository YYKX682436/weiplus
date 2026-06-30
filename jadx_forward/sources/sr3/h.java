package sr3;

/* loaded from: classes11.dex */
public abstract class h {
    public static void a(r45.mm mmVar, android.content.Context context, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mmVar.f462172h)) {
            return;
        }
        java.lang.String str2 = mmVar.f462172h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewBizInfoUtil", "jumpToSearch username: %s, suggestData: %s", str, str2);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("ftsneedkeyboard", true);
        a17.putExtra("ftsbizscene", 76);
        a17.putExtra("ftsType", 2);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(76, false, 2);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put("userName", str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("thirdExtParam", str2);
        }
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsbizusername", str);
        a17.addFlags(67108864);
        j45.l.z(context, a17, null);
    }

    public static void b(r45.mm mmVar, android.content.Context context, java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", mmVar.f462172h);
        intent.putExtra("geta8key_username", str);
        intent.putExtra("msgUsername", str);
        intent.putExtra("geta8key_scene", i17);
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void c(r45.mm mmVar, android.content.Context context, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mmVar.f462172h)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(mmVar.f462172h);
            qk.o b17 = r01.z.b(str);
            java.lang.String str2 = mmVar.f462171g;
            java.lang.String format = java.lang.String.format("%s:%s:%s:%s", str, java.lang.Integer.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? str2.length() - str2.replace("_", "").length() : 0), mmVar.f462170f, jSONObject.optString("pagePath"));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
            c12559xbdae8559.f169323f = 1102;
            c12559xbdae8559.f169324g = format;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(context, jSONObject.optString("userName"), null, 0, 0, jSONObject.optString("pagePath"), c12559xbdae8559, b17 == null ? null : b17.f66730x28d45f97);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewBizInfoUtil", e17.getMessage());
        }
    }
}
