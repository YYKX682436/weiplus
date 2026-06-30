package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2;

/* loaded from: classes.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268159b;

    public f(nw4.k kVar, nw4.y2 y2Var) {
        this.f268158a = kVar;
        this.f268159b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", "actionName:" + str + " data:" + obj);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "reportPayResult");
        java.lang.String str2 = null;
        nw4.k kVar = this.f268158a;
        nw4.y2 y2Var = this.f268159b;
        if (!b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestMedicalInsurancePay", "wrong actionName");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        } else if (obj instanceof org.json.JSONObject) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
            try {
                boolean z17 = true;
                if (!jSONObject.has("result")) {
                    z17 = false;
                }
                if (z17) {
                    str2 = jSONObject.getString("result");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e17);
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, ya.b.f77504xbb80cbe3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", ya.b.f77504xbb80cbe3);
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.i.b(jSONObject));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestMedicalInsurancePay", "fail");
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.i.b(jSONObject));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestMedicalInsurancePay", "wrong data");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        }
        return false;
    }
}
