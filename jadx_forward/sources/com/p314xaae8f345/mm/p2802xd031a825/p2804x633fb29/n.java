package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f295481a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f295482b;

    public n(java.lang.String str) {
        this.f295481a = "";
        this.f295482b = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f295481a = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            jSONObject.optString("body1");
            jSONObject.optString("body2");
            this.f295482b = jSONObject.optString("button");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CrtRtnWoding", "crtwoding error %s", e17.getMessage());
        }
    }

    public n() {
        this.f295481a = "";
        this.f295482b = "";
    }
}
