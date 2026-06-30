package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class p3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267958e;

    public p3(nw4.k kVar, nw4.y2 y2Var) {
        this.f267957d = kVar;
        this.f267958e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        nw4.k kVar = this.f267957d;
        nw4.y2 y2Var = this.f267958e;
        try {
            int optInt = new org.json.JSONObject(c10756x2a5d7b2d.f149939d).optInt("retCode", -123);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("state", java.lang.Integer.valueOf(optInt));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleLiveCustomBusiness", "IPCInvokeCallback :" + c10756x2a5d7b2d.f149939d);
            if (optInt == 0) {
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
            } else {
                nw4.g gVar = kVar.f422396d;
                java.lang.String str = y2Var.f422546c;
                java.lang.String str2 = y2Var.f422552i + ":fail open fail";
                hashMap.put("err_msg", "liveCustomBusiness doCallback error");
                gVar.e(str, str2, hashMap);
            }
        } catch (java.lang.Exception unused) {
            nw4.g gVar2 = kVar.f422396d;
            java.lang.String str3 = y2Var.f422546c;
            java.lang.String str4 = y2Var.f422552i + ":fail open fail";
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("state", -1);
            hashMap2.put("err_msg", "liveCustomBusiness something crash...");
            gVar2.e(str3, str4, hashMap2);
        }
    }
}
