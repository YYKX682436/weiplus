package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class v extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w f264166a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w wVar) {
        this.f264166a = wVar;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", this.f264166a.f264174e);
            jSONObject.put("set_cookie", 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8KeyUtil", "onGetA8Key, e:" + e17.getMessage());
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onGetA8KeyUrl";
    }
}
