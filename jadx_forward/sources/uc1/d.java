package uc1;

/* loaded from: classes13.dex */
public class d extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76852x366c91de = 135;

    /* renamed from: NAME */
    public static final java.lang.String f76853x24728b = "addMapCircles";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapCircles", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddMapCircles", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapCircles", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            if (jSONObject.has("circles")) {
                vc1.p1 p1Var = (vc1.p1) E;
                synchronized (p1Var.U) {
                    java.util.Iterator it = p1Var.U.iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4395x7851a8f0) it.next()).mo37126xc84af884();
                    }
                    p1Var.U.clear();
                }
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("circles"));
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                    double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject2.optString("latitude"), 0.0d);
                    double F2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject2.optString("longitude"), 0.0d);
                    java.lang.String optString = jSONObject2.optString("color", "");
                    int parseColor = android.graphics.Color.parseColor("#000000");
                    try {
                        parseColor = ik1.w.l(optString);
                    } catch (java.lang.Exception unused) {
                    }
                    java.lang.String optString2 = jSONObject2.optString("fillColor", "");
                    int parseColor2 = android.graphics.Color.parseColor("#00000000");
                    try {
                        parseColor2 = ik1.w.l(optString2);
                    } catch (java.lang.Exception unused2) {
                    }
                    int optInt = jSONObject2.optInt("radius");
                    int h17 = (int) ik1.w.h(jSONObject2, "strokeWidth", 0.0f);
                    java.lang.String optString3 = jSONObject2.optString(ya.b.f77487x44fa364);
                    vc1.p1 p1Var2 = (vc1.p1) E;
                    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e c4396xfbda878e = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e();
                    c4396xfbda878e.m37137xaeb2cc55(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(F, F2));
                    c4396xfbda878e.m37151xc80e6c92(optInt);
                    c4396xfbda878e.m37152x7197ec0b(parseColor);
                    c4396xfbda878e.m37155x72aeea6e(h17);
                    c4396xfbda878e.m37139xbbf043a0(parseColor2);
                    int y17 = p1Var2.y(optString3);
                    if (y17 >= 0) {
                        c4396xfbda878e.m37150x6219b84(y17);
                    } else {
                        c4396xfbda878e.m37150x6219b84(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17474x283bb828);
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4395x7851a8f0 mo98936xe42464d1 = p1Var2.f516601e.mo98897xb5885626().mo98936xe42464d1(c4396xfbda878e);
                    synchronized (p1Var2.U) {
                        p1Var2.U.add(mo98936xe42464d1);
                    }
                }
            }
            java.lang.String o17 = o("ok");
            vc1.p1 p1Var3 = (vc1.p1) E;
            p1Var3.getClass();
            C(lVar, i17, o17, true, p1Var3 instanceof dg1.h);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapCircles", "parse circles error, exception : %s", e17);
            java.lang.String o18 = o("fail:internal error");
            vc1.p1 p1Var4 = (vc1.p1) E;
            p1Var4.getClass();
            C(lVar, i17, o18, false, p1Var4 instanceof dg1.h);
        }
    }
}
