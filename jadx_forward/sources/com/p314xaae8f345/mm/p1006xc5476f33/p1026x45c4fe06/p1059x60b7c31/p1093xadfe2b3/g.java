package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes.dex */
public final class g implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f163071a;

    public g(android.view.View view) {
        this.f163071a = view;
    }

    @Override // ft.p4
    public final void a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            android.view.View view = this.f163071a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.liteapp.ui.WxaLiteAppBaseView");
            long mo28563xe7b2546 = ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view).mo28563xe7b2546();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLiteAppView", "johnjh addWeAppDataCallback appuuid:" + mo28563xe7b2546 + ", param:" + jSONObject);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(mo28563xe7b2546, "app.postmessage", jSONObject);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertLiteAppView", e17.toString());
        }
    }
}
