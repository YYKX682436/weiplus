package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes11.dex */
public final class c0 implements l81.p0 {

    /* renamed from: e, reason: collision with root package name */
    public int f270779e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f270778d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f270780f = "";

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = this.f270778d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("dataBuffer", str);
            jSONObject.put("enterScene", this.f270779e);
            jSONObject.put("bypass", this.f270780f);
            java.lang.String jSONObject2 = new org.json.JSONObject().put("bizFinderLiveInfo", jSONObject).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
            return jSONObject2;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizFinderLiveNativeExtraData", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }
}
