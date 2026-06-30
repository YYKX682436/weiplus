package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public class s0 extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.t0 f221498a;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.t0 t0Var) {
        this.f221498a = t0Var;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", this.f221498a.f221501e);
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
