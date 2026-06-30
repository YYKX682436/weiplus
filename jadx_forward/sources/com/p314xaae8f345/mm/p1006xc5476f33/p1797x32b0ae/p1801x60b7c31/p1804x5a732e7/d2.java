package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/d2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("emoticonInfos") : null;
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("opType")) : null;
        int optInt = jSONObject != null ? jSONObject.optInt("operationScene") : 0;
        org.json.JSONArray optJSONArray2 = jSONObject != null ? jSONObject.optJSONArray("downloadTypes") : null;
        if (str == null || optJSONArray == null || valueOf == null) {
            this.f224976f.a("emoticonStoreOperation:fail_missing arguments");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LIteAppJsApiEmoticonStoreOperation", "invoke: " + c());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (optJSONArray2 != null) {
            c75.c.d(optJSONArray2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b2(arrayList));
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
        long j17 = this.f224975e.f380557a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var).getClass();
        if (j17 != 0) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10572xfeac2836.f147537h.a(j17).f147539d = j17;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c2(optJSONArray, valueOf, this, optInt, arrayList, null), 3, null);
    }
}
