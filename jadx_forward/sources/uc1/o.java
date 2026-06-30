package uc1;

/* loaded from: classes13.dex */
public class o extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76896x366c91de = 492;

    /* renamed from: NAME */
    public static final java.lang.String f76897x24728b = "addMapPolygons";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        int[] iArr;
        java.lang.String str2 = "dashArray";
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapPolygons", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddMapPolygons", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapPolygons", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            if (jSONObject.has("polygons")) {
                vc1.p1 p1Var = (vc1.p1) E;
                p1Var.N();
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("polygons"));
                int i18 = 0;
                while (i18 < jSONArray.length()) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray(jSONObject2.optString("points"));
                    int i19 = 0;
                    while (i19 < jSONArray2.length()) {
                        org.json.JSONObject jSONObject3 = jSONArray2.getJSONObject(i19);
                        java.util.ArrayList arrayList2 = arrayList;
                        arrayList2.add(new uc1.n(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject3.optString("latitude"), 0.0d), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject3.optString("longitude"), 0.0d)));
                        i19++;
                        jSONObject2 = jSONObject2;
                        arrayList = arrayList2;
                        jSONArray = jSONArray;
                        jSONArray2 = jSONArray2;
                        i18 = i18;
                    }
                    org.json.JSONObject jSONObject4 = jSONObject2;
                    java.util.ArrayList arrayList3 = arrayList;
                    org.json.JSONArray jSONArray3 = jSONArray;
                    int i27 = i18;
                    java.lang.String optString = jSONObject4.optString("fillColor", "");
                    int parseColor = android.graphics.Color.parseColor("#000000");
                    try {
                        parseColor = ik1.w.l(optString);
                    } catch (java.lang.Exception unused) {
                    }
                    java.lang.String optString2 = jSONObject4.optString("strokeColor", "");
                    int parseColor2 = android.graphics.Color.parseColor("#000000");
                    try {
                        parseColor2 = ik1.w.l(optString2);
                    } catch (java.lang.Exception unused2) {
                    }
                    int j17 = ik1.w.j(jSONObject4, "strokeWidth", 0);
                    int optInt = jSONObject4.optInt("zIndex", 0);
                    if (jSONObject4.has(str2)) {
                        org.json.JSONArray jSONArray4 = new org.json.JSONArray(jSONObject4.optString(str2));
                        iArr = new int[jSONArray4.length()];
                        str = str2;
                        for (int i28 = 0; i28 < jSONArray4.length(); i28++) {
                            iArr[i28] = jSONArray4.getInt(i28);
                        }
                    } else {
                        str = str2;
                        iArr = null;
                    }
                    vc1.x2 x2Var = new vc1.x2();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    x2Var.f516745a = arrayList4;
                    arrayList4.addAll(arrayList3);
                    x2Var.f516746b = parseColor;
                    x2Var.f516747c = j17;
                    x2Var.f516748d = parseColor2;
                    x2Var.f516749e = optInt;
                    x2Var.f516750f = jSONObject4.optString(ya.b.f77487x44fa364);
                    x2Var.f516751g = iArr;
                    p1Var.s(x2Var);
                    i18 = i27 + 1;
                    str2 = str;
                    jSONArray = jSONArray3;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapPolygons", "data has not lines info");
            }
            java.lang.String o17 = o("ok");
            vc1.p1 p1Var2 = (vc1.p1) E;
            p1Var2.getClass();
            C(lVar, i17, o17, true, p1Var2 instanceof dg1.h);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapPolygons", "parse lines error, exception : %s", e17);
            java.lang.String o18 = o("fail:internal error");
            vc1.p1 p1Var3 = (vc1.p1) E;
            p1Var3.getClass();
            C(lVar, i17, o18, false, p1Var3 instanceof dg1.h);
        }
    }
}
