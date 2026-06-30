package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class f8 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g8 f267619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267620b;

    public f8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g8 g8Var, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f267619a = g8Var;
        this.f267620b = rVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderView", "onCallback callbackReportReadInfo");
        this.f267619a.getClass();
        jz5.f0 f0Var = null;
        jz5.l lVar = obj instanceof jz5.l ? (jz5.l) obj : null;
        if (lVar != null) {
            java.lang.Object obj2 = lVar.f384366d;
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 0;
            java.lang.Object obj3 = lVar.f384367e;
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str == null) {
                str = "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("retCode", intValue);
                jSONObject.put("feed_read_info", str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenFinderView", e17, "openFinderView exception", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267620b;
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject.toString()));
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderView", "callbackReportReadInfo null");
        }
    }
}
