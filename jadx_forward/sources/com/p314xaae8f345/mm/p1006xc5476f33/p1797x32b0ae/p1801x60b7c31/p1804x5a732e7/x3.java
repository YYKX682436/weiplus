package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/x3;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class x3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("orderId");
        if (optString == null || optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiOpenEcsGiftReceivePage", "order id is empty");
            this.f224976f.a("order id is empty");
            return;
        }
        java.lang.String wi6 = ((j00.o) ((c00.d3) i95.n0.c(c00.d3.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.w3(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiOpenEcsGiftReceivePage", "set open event callback, eventId:" + wi6);
        java.util.Map l17 = kz5.c1.l(new jz5.l("ecsOpenEventId", wi6));
        i95.m c17 = i95.n0.c(c00.e3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context c18 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        l17.put("orderId", optString);
        c00.e3.n9((c00.e3) c17, c18, l17, null, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
