package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class g1 extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f263745a;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.h1 h1Var, boolean z17) {
        this.f263745a = z17;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("isAccessibilityMode", this.f263745a);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onAccessibilityStateChange";
    }
}
