package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes9.dex */
public class k4 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f221232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.l4 f221234f;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.l4 l4Var, int i17, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f221234f = l4Var;
        this.f221232d = jSONObject;
        this.f221233e = q5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            org.json.JSONObject jSONObject = this.f221232d;
            java.lang.String optString = jSONObject.optString("appid");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f221233e;
            if (i18 != -1) {
                if (i18 == 0 || i18 == 1) {
                    q5Var.a("cancel", null);
                    return;
                } else {
                    q5Var.a("fail", null);
                    return;
                }
            }
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (intent != null) {
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                arrayList = intent.getStringArrayListExtra("SendMsgUsernames");
            }
            if (arrayList == null || arrayList.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSendGameNameCard", "mmOnActivityResult fail, toUser is null");
                q5Var.a("fail", null);
                return;
            }
            java.util.Iterator<java.lang.String> it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next) || next.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSendGameNameCard", "toUser is null");
                } else {
                    android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(jSONObject.optString("img_url"));
                    this.f221234f.getClass();
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendGameNameCard", "thumb image is not null");
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
                    jtVar.f88616d = next;
                    jtVar.f88617e = 2;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject.optString("src_username"))) {
                        jtVar.f88620h = null;
                    } else {
                        jtVar.f88618f = jSONObject.optString("src_username");
                        jtVar.f88619g = jSONObject.optString("src_displayname");
                    }
                    jtVar.f88621i = jSONObject.optString("shareUrl");
                    jtVar.f88622j = jSONObject.optString("currentUrl");
                    jtVar.f88623k = jSONObject.optString("preVerifyAppId");
                    c5987xfe669c12.e();
                    java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                        ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
                        java.util.HashMap a17 = com.p314xaae8f345.mm.ui.i1.a(stringExtra);
                        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(next) || a17 == null) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                            am.mt mtVar = c5990xd50ae361.f136285g;
                            mtVar.f88895a = next;
                            mtVar.f88896b = stringExtra;
                            mtVar.f88897c = c01.e2.C(next);
                            mtVar.f88898d = 0;
                            c5990xd50ae361.e();
                        } else if (w11.t1.a(next)) {
                            w11.r1 a18 = w11.s1.a(next);
                            a18.e(stringExtra);
                            a18.f523663e = c01.e2.C(next);
                            a18.f523664f = 1;
                            a18.f523666h = a17;
                            a18.b();
                        } else {
                            w11.r1 a19 = w11.s1.a(next);
                            a19.g(next);
                            a19.e(stringExtra);
                            a19.f523663e = c01.e2.C(next);
                            a19.f523664f = 1;
                            a19.f523666h = a17;
                            a19.f523667i = 5;
                            a19.a().a();
                        }
                    }
                }
            }
            q5Var.a(null, null);
        }
    }
}
