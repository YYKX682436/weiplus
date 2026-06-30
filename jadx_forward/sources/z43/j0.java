package z43;

/* loaded from: classes8.dex */
public class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public org.json.JSONObject f551653g;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        this.f551653g = jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f9.a(jSONObject.optString("card_image_url"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", jSONObject.optString("card_link"));
        hashMap.put("nickname", jSONObject.optString("card_nick_name"));
        hashMap.put("card_image_url", jSONObject.optString("card_image_url"));
        hashMap.put("card_desc", jSONObject.optString("card_desc"));
        hashMap.put("card_tail", jSONObject.optString("card_tail"));
        if (jSONObject.optJSONObject("liteAppInfo") != null && jSONObject.optJSONObject("liteAppInfo").length() > 0) {
            hashMap.put("liteapp_appId", jSONObject.optJSONObject("liteAppInfo").optString("appId"));
            hashMap.put("liteapp_path", jSONObject.optJSONObject("liteAppInfo").optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714));
            hashMap.put("liteapp_query", jSONObject.optJSONObject("liteAppInfo").optString("query"));
            hashMap.put("liteapp_minVersion", jSONObject.optJSONObject("liteAppInfo").optString("minVersion"));
        }
        hashMap.put("is_game_card", "true");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("webview_params", hashMap);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).sk(this, intent, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            java.lang.String optString = this.f551653g.optString("appid");
            if (i18 != -1) {
                if (i18 == 0 || i18 == 1) {
                    this.f224976f.a("cancel");
                    return;
                } else {
                    this.f224976f.a("fail");
                    return;
                }
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
            if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                this.f224976f.d(false);
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiSendGameNameCard", "onSelectConversationUICallback fail, toUser is null");
                this.f224976f.a("toUser is null");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiSendGameNameCard", "toUser is null");
                return;
            }
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(this.f551653g.optString("img_url"));
            org.json.JSONObject jSONObject = this.f551653g;
            c53.b bVar = new c53.b();
            bVar.f33249xa1713a8c = jSONObject.optString("link");
            bVar.f33246xb2206a6f = jSONObject.optString("review_data");
            bVar.f120186a = jSONObject.optString("card_image_url");
            bVar.f120187b = jSONObject.optString("card_nick_name");
            bVar.f120188c = jSONObject.optString("card_desc");
            bVar.f120189d = jSONObject.optString("card_tail");
            bVar.f120190e = jSONObject.optString("card_link");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
            c11286x34a5504.f33122xe4128443 = bVar;
            c11286x34a5504.f33130x6942258 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            c11286x34a5504.f33121x993583fc = jSONObject.optString("desc");
            if (Bi != null && !Bi.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiSendGameNameCard", "thumb image is not null");
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                c11286x34a5504.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
            }
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(optString);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
            am.jt jtVar = c5987xfe669c12.f136282g;
            jtVar.f88613a = c11286x34a5504;
            jtVar.f88614b = optString;
            jtVar.f88615c = h17 == null ? "" : h17.f67372x453d1e07;
            jtVar.f88616d = stringExtra;
            jtVar.f88617e = 2;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f551653g.optString("src_username"))) {
                jtVar.f88620h = null;
            } else {
                jtVar.f88618f = this.f551653g.optString("src_username");
                jtVar.f88619g = this.f551653g.optString("src_displayname");
            }
            jtVar.f88621i = this.f551653g.optString("shareUrl");
            jtVar.f88622j = this.f551653g.optString("currentUrl");
            jtVar.f88623k = this.f551653g.optString("preVerifyAppId");
            c5987xfe669c12.e();
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                am.mt mtVar = c5990xd50ae361.f136285g;
                mtVar.f88895a = stringExtra;
                mtVar.f88896b = stringExtra2;
                mtVar.f88897c = c01.e2.C(stringExtra);
                mtVar.f88898d = 0;
                c5990xd50ae361.e();
            }
            db5.e1.T(c(), c().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
            this.f224976f.d(false);
        }
    }
}
