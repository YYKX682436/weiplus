package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class a2 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f78685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.b2 f78686b;

    public a2(com.tencent.mm.plugin.appbrand.jsapi.b2 b2Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        this.f78686b = b2Var;
        this.f78685a = d0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        org.json.JSONArray jSONArray;
        com.tencent.mm.plugin.appbrand.jsapi.b2 b2Var = this.f78686b;
        if (i17 != b2Var.f79816g) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f78685a;
        if (i18 == -1) {
            if (intent == null) {
                d0Var.a(b2Var.f79817h, b2Var.o("fail:internal error"));
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddCard", "location result is empty!");
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            try {
                jSONArray = new org.json.JSONArray(intent.getStringExtra("card_list"));
            } catch (org.json.JSONException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddCard", "parse fail result:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                jSONArray = null;
            }
            if (jSONArray != null) {
                hashMap.put("cardList", jSONArray);
                d0Var.a(b2Var.f79817h, b2Var.p("ok", hashMap));
            } else {
                d0Var.a(b2Var.f79817h, b2Var.p("fail: cardList is empty", hashMap));
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddCard", "add card result is fail! cardList is empty");
            }
        } else if (i18 == 0) {
            d0Var.a(b2Var.f79817h, b2Var.o("cancel"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddCard", "add card result is cancel!");
        } else {
            int intExtra = intent != null ? intent.getIntExtra("result_code", 2) : 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddCard", "mmSetOnActivityResultCallback ret_code:%d", java.lang.Integer.valueOf(intExtra));
            if (intExtra == 2) {
                d0Var.a(b2Var.f79817h, b2Var.o("fail:internal error"));
            } else {
                d0Var.a(b2Var.f79817h, b2Var.o("cancel"));
            }
        }
        return true;
    }
}
