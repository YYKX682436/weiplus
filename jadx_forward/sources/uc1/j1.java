package uc1;

/* loaded from: classes13.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f507850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f507851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f507852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uc1.m1 f507853g;

    public j1(uc1.m1 m1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f507853g = m1Var;
        this.f507850d = lVar;
        this.f507851e = jSONObject;
        this.f507852f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        double d17;
        org.json.JSONArray jSONArray;
        double d18;
        org.json.JSONArray jSONArray2;
        double d19;
        uc1.m1 m1Var = this.f507853g;
        m1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f507850d;
        org.json.JSONObject jSONObject = this.f507851e;
        int i17 = this.f507852f;
        int i18 = 0;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "data is invalid, err");
            m1Var.F(lVar, i17, "fail:invalid data", false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiMoveMapMarkerAlong", "data:%s", jSONObject.toString());
        vc1.a3 E = m1Var.E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "mapView is null, return");
            m1Var.F(lVar, i17, java.lang.String.format("fail:internal error %s", "mapview is null"), false);
            return;
        }
        java.lang.String optString = jSONObject.optString("markerId");
        try {
            long optLong = jSONObject.optLong("duration", 0L);
            if (optLong == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "duration is zero, err return");
                m1Var.F(lVar, i17, "fail:invalid data", false);
            }
            boolean optBoolean = jSONObject.optBoolean("autoRotate", false);
            if (jSONObject.has("precision")) {
                d17 = jSONObject.optDouble("precision", 0.0d);
                z17 = true;
            } else {
                z17 = false;
                d17 = 0.0d;
            }
            org.json.JSONArray jSONArray3 = jSONObject.getJSONArray(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            jSONArray3.length();
            while (i18 < jSONArray3.length()) {
                org.json.JSONObject optJSONObject = jSONArray3.optJSONObject(i18);
                if (optJSONObject == null) {
                    jSONArray2 = jSONArray3;
                } else {
                    java.lang.String optString2 = optJSONObject.optString("latitude");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                        jSONArray = jSONArray3;
                        d18 = 0.0d;
                    } else {
                        jSONArray = jSONArray3;
                        d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(optString2, 0.0d);
                    }
                    java.lang.String optString3 = optJSONObject.optString("longitude");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                        jSONArray2 = jSONArray;
                        d19 = 0.0d;
                    } else {
                        jSONArray2 = jSONArray;
                        d19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(optString3, 0.0d);
                    }
                    arrayList.add(new vc1.y1(d18, d19));
                }
                i18++;
                jSONArray3 = jSONArray2;
            }
            ((vc1.p1) E).F(optString, arrayList, optLong, optBoolean, d17, new uc1.l1(m1Var, lVar, i17, E), z17 ? new uc1.k1(m1Var, lVar, jSONObject, jSONObject.optInt("mapId", -1), optString) : null);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "parse data error, exception : %s", e17);
            m1Var.F(lVar, i17, java.lang.String.format("fail:internal error %s", "parse json fail"), ((vc1.p1) E) instanceof dg1.h);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "parse data error, exception2 : %s", e18);
            m1Var.F(lVar, i17, java.lang.String.format("fail:internal error %s", "parse json fail"), ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
