package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class l1 extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264085a;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, java.lang.String str) {
        this.f264085a = str;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("state", this.f264085a);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "activity:state_change";
    }
}
