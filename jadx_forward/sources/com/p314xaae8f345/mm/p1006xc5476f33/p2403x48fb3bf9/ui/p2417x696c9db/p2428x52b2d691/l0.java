package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class l0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267861e;

    public l0(nw4.k kVar, nw4.y2 y2Var) {
        this.f267860d = kVar;
        this.f267861e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        nw4.y2 y2Var = this.f267861e;
        nw4.k kVar = this.f267860d;
        if (str == null) {
            kVar.f422396d.a(y2Var, "invokeAsync error");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("err_msg");
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject.optString("type");
        java.lang.String str2 = optString2 != null ? optString2 : "";
        java.lang.Object opt = jSONObject.opt("result");
        if (opt == null) {
            opt = new org.json.JSONObject();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_msg", optString);
        hashMap.put("type", str2);
        hashMap.put("result", opt);
        kVar.f422396d.e(y2Var.f422546c, optString, hashMap);
    }
}
