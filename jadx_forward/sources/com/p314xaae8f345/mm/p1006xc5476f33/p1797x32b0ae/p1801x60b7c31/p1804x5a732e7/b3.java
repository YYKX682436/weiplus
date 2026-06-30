package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes4.dex */
public class b3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
        java.lang.String optString = jSONObject.optString("codeString");
        int optInt = jSONObject.optInt("codeType");
        int optInt2 = jSONObject.optInt("codeVersion");
        android.app.Activity activity = (android.app.Activity) c();
        am.r3 r3Var = c5292x67f91197.f135612g;
        r3Var.f89314b = activity;
        r3Var.f89321i = 40;
        r3Var.f89315c = optInt;
        r3Var.f89316d = optInt2;
        r3Var.f89313a = optString;
        c5292x67f91197.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
