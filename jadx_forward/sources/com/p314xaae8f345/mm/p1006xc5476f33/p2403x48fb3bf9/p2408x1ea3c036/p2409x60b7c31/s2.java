package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class s2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openFinderView";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            q5Var.a("data is null", null);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("extInfo", new org.json.JSONObject(jSONObject.optString("extInfo")));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.F(context, jSONObject2.toString(), null, null);
            q5Var.a(null, null);
        } catch (org.json.JSONException unused2) {
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
