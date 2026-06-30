package uc1;

/* loaded from: classes13.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f507829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f507830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f507831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uc1.d2 f507832g;

    public b2(uc1.d2 d2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f507832g = d2Var;
        this.f507829d = lVar;
        this.f507830e = jSONObject;
        this.f507831f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        uc1.d2 d2Var = this.f507832g;
        d2Var.f507841h.set(true);
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f507829d;
        org.json.JSONObject jSONObject = this.f507830e;
        int i18 = this.f507831f;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiTranslateMapMarker", "data is invalid, err");
            d2Var.G(lVar, i18, "fail:invalid data", false);
            return;
        }
        jSONObject.toString();
        vc1.a3 E = d2Var.E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiTranslateMapMarker", "mapView is null, return");
            d2Var.G(lVar, i18, java.lang.String.format("fail:internal error %s", "mapview is null"), false);
            return;
        }
        java.lang.String optString = jSONObject.optString("markerId");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("keyFrames"));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            jSONArray.length();
            int i19 = 0;
            while (i19 < jSONArray.length()) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i19);
                vc1.x1 x1Var = new vc1.x1();
                int optInt = jSONObject2.optInt("duration", i17);
                x1Var.f516744f = optInt;
                if (optInt == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiTranslateMapMarker", "keyFrame.duration is zero, err continue");
                } else {
                    x1Var.f516743e = (float) jSONObject2.optDouble(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, 0.0d);
                    java.lang.String optString2 = jSONObject2.optString("latitude");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                        x1Var.f516742d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(optString2, 0.0d);
                    }
                    java.lang.String optString3 = jSONObject2.optString("longitude");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                        x1Var.f516741c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(optString3, 0.0d);
                    }
                    linkedList.add(x1Var);
                }
                i19++;
                i17 = 0;
            }
            ((vc1.p1) E).f0(optString, linkedList, new uc1.c2(d2Var, lVar, i18, E));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiTranslateMapMarker", "parse keyFrames error, exception : %s", e17);
            d2Var.G(lVar, i18, java.lang.String.format("fail:internal error %s", "parse json fail"), ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
