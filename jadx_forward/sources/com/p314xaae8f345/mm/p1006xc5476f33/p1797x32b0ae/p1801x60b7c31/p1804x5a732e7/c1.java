package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/c1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonOpenDetailVC", "invoke: " + jSONObject);
        java.lang.String productId = jSONObject != null ? jSONObject.optString("pid") : null;
        int optInt = jSONObject != null ? jSONObject.optInt("emotionScene", 47) : 47;
        int optInt2 = jSONObject != null ? jSONObject.optInt("precedingScene", 17) : 17;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("requestID") : null;
        if (optString == null) {
            optString = "";
        }
        if (productId == null || productId.length() == 0) {
            this.f224976f.a("emoticonOpenDetailVC:fail_missing arguments");
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
        android.content.Context c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var;
        c4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        qk.c0 c0Var = new qk.c0(productId);
        c0Var.f445688a = optInt;
        c0Var.f445731g = optInt2;
        c0Var.f445690c = optString;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c4Var.f147740d, "emoticon liteapp service not found");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(c17, c0Var);
        }
        this.f224976f.d(false);
    }
}
