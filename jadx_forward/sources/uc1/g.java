package uc1;

/* loaded from: classes13.dex */
public class g extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76872x366c91de = 140;

    /* renamed from: NAME */
    public static final java.lang.String f76873x24728b = "addMapControls";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapControls", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        jSONObject.toString();
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapControls", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            if (jSONObject.has("controls")) {
                vc1.p1 p1Var = (vc1.p1) E;
                ik1.h0.b(new vc1.l(p1Var));
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("controls"));
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                    vc1.r1 r1Var = new vc1.r1();
                    r1Var.f516689e = ((o91.e) lVar.q(o91.e.class)).T0(lVar, jSONObject2.optString("iconPath"));
                    r1Var.f516690f = jSONObject2.optBoolean("clickable");
                    r1Var.f516691g = jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                    org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("position");
                    int j17 = ik1.w.j(jSONObject3, "left", 0);
                    int j18 = ik1.w.j(jSONObject3, "top", 0);
                    r1Var.f516685a = j17;
                    r1Var.f516686b = j18;
                    if (jSONObject3.has("width")) {
                        r1Var.f516687c = ik1.w.j(jSONObject3, "width", 0);
                    }
                    if (jSONObject3.has("height")) {
                        r1Var.f516688d = ik1.w.j(jSONObject3, "height", 0);
                    }
                    if (jSONObject2.optBoolean("clickable")) {
                        p1Var.k(r1Var, new uc1.e(this, vc1.e3.c(jSONObject), lVar), (o91.d) lVar.q(o91.d.class));
                    } else {
                        p1Var.k(r1Var, null, (o91.d) lVar.q(o91.d.class));
                    }
                }
            }
            C(lVar, i17, o("ok"), true, ((vc1.p1) E) instanceof dg1.h);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapControls", "parse controls error, exception : %s", e17);
            C(lVar, i17, o("fail:internal error"), false, ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
