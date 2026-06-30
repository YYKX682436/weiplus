package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class w0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f162669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f162670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.x0 f162672g;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, org.json.JSONArray jSONArray, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.x0 x0Var) {
        this.f162669d = v5Var;
        this.f162670e = jSONArray;
        this.f162671f = i17;
        this.f162672g = x0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0
    public void l(java.lang.String str, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[] scripts, boolean[] results, java.lang.Object[] extras, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scripts, "scripts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(results, "results");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extras, "extras");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke with appId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f162669d;
        sb6.append(v5Var.mo48798x74292566());
        sb6.append(" paths:");
        sb6.append(this.f162670e);
        sb6.append(" key:");
        sb6.append(str);
        sb6.append(", results:");
        java.lang.String arrays = java.util.Arrays.toString(results);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.JsApiLoadJsFiles", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.x0 x0Var = this.f162672g;
        x0Var.getClass();
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        v5Var.a(this.f162671f, x0Var.u(str3, jSONObject));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0) v5Var.B1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0.class);
        if (v0Var != null) {
            v0Var.l(str, scripts, results, extras, j17, j18);
        }
    }
}
