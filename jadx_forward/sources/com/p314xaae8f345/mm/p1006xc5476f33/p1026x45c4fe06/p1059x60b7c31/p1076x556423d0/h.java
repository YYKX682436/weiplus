package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignRequest;", "kotlin.jvm.PlatformType", "request", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignResult;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignRequest;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class h<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.h f161768d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.h();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.Exception e17;
        java.lang.String str;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12046xfa62b2ae) obj).f161736d);
            str = "|AppId=" + jSONObject.optString("appId");
            try {
                java.lang.String optString = jSONObject.optString("signText");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEcdSaSign", "signText :" + optString + str);
                byte[] bytes = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e.c(optString + str).getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 0);
                if (rVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
                    rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12047xbdc2081e(encodeToString, str));
                }
            } catch (java.lang.Exception e18) {
                e17 = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiEcdSaSign", e17, "handleRequest fail", new java.lang.Object[0]);
                if (rVar != null) {
                    rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12047xbdc2081e("", str));
                }
            }
        } catch (java.lang.Exception e19) {
            e17 = e19;
            str = "";
        }
    }
}
