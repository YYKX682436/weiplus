package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class a2 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f160218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b2 f160219b;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b2 b2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        this.f160219b = b2Var;
        this.f160218a = d0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        org.json.JSONArray jSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b2 b2Var = this.f160219b;
        if (i17 != b2Var.f161349g) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f160218a;
        if (i18 == -1) {
            if (intent == null) {
                d0Var.a(b2Var.f161350h, b2Var.o("fail:internal error"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddCard", "location result is empty!");
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            try {
                jSONArray = new org.json.JSONArray(intent.getStringExtra("card_list"));
            } catch (org.json.JSONException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddCard", "parse fail result:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                jSONArray = null;
            }
            if (jSONArray != null) {
                hashMap.put("cardList", jSONArray);
                d0Var.a(b2Var.f161350h, b2Var.p("ok", hashMap));
            } else {
                d0Var.a(b2Var.f161350h, b2Var.p("fail: cardList is empty", hashMap));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddCard", "add card result is fail! cardList is empty");
            }
        } else if (i18 == 0) {
            d0Var.a(b2Var.f161350h, b2Var.o("cancel"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddCard", "add card result is cancel!");
        } else {
            int intExtra = intent != null ? intent.getIntExtra("result_code", 2) : 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddCard", "mmSetOnActivityResultCallback ret_code:%d", java.lang.Integer.valueOf(intExtra));
            if (intExtra == 2) {
                d0Var.a(b2Var.f161350h, b2Var.o("fail:internal error"));
            } else {
                d0Var.a(b2Var.f161350h, b2Var.o("cancel"));
            }
        }
        return true;
    }
}
