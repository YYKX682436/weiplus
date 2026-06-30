package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/p2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean Ai = ((com.p314xaae8f345.mm.p2621x8fb0427b.h5) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.c6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.c6.class))).Ai();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("privacySettingPage", Ai ? 1 : 0);
        jSONObject2.put("customEmoticonPage", Ai ? 1 : 0);
        jSONObject2.put("selfieEmoticonPage", Ai ? 1 : 0);
        jSONObject2.put("productEmoticonPage", 1);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("pageConfig", jSONObject2);
        this.f224975e.f(jSONObject3, false);
    }
}
