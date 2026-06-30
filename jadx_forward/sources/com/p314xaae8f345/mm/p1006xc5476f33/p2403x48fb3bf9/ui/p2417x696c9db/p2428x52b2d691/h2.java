package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class h2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267752e;

    public h2(nw4.k kVar, nw4.y2 y2Var) {
        this.f267751d = kVar;
        this.f267752e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        nw4.k kVar = this.f267751d;
        nw4.y2 y2Var = this.f267752e;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(c10756x2a5d7b2d.f149939d);
            int optInt = jSONObject.optInt("retCode");
            java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("retCode", java.lang.Integer.valueOf(optInt));
            hashMap.put(dm.i4.f66875xa013b0d5, optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNewLifeContact", "IPCInvokeCallback :" + c10756x2a5d7b2d.f149939d);
            if (optInt == 0) {
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
            } else {
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail open fail", null);
            }
        } catch (java.lang.Exception unused) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail open fail", null);
        }
    }
}
