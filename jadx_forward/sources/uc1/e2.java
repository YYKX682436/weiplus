package uc1;

/* loaded from: classes13.dex */
public class e2 extends gb1.h {

    /* renamed from: CTRL_INDEX */
    public static final int f76862x366c91de = 4;

    /* renamed from: NAME */
    public static final java.lang.String f76863x24728b = "updateMap";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        try {
            return jSONObject.optInt("mapId");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateMap", "get mapId error, exception : %s", e17);
            return -1;
        }
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        vc1.d3.a(3);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateMap", "data is null");
            return false;
        }
        java.lang.String mo48798x74292566 = tVar.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateMap", "updateView appId:%s viewId:%d data:%s", mo48798x74292566, java.lang.Integer.valueOf(i17), jSONObject);
        vc1.a3 b17 = vc1.h3.b(mo48798x74292566, vc1.e3.b(tVar, jSONObject));
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateMap", "mapView is null, return");
            return false;
        }
        if (jSONObject.has("enableZoom")) {
            ((vc1.p1) b17).f516601e.mo98901xbd4012cd().mo99085x9509ff82(jSONObject.optBoolean("enableZoom", true));
        }
        if (jSONObject.has("enableScroll")) {
            ((vc1.p1) b17).f516601e.mo98901xbd4012cd().mo99083xc5bd91c8(jSONObject.optBoolean("enableScroll", true));
        }
        if (jSONObject.has("enableRotate")) {
            ((vc1.p1) b17).f516601e.mo98901xbd4012cd().mo99080xca66ed7a(jSONObject.optBoolean("enableRotate", true));
        }
        if (jSONObject.has("showCompass")) {
            ((vc1.p1) b17).f516601e.mo98901xbd4012cd().mo99075xbcd5a2d1(jSONObject.optBoolean("showCompass", false));
        }
        if (jSONObject.has("enable3D")) {
            ((vc1.p1) b17).f516601e.mo98897xb5885626().mo98990x9a0dfe5b(jSONObject.optBoolean("enable3D", false));
        }
        if (jSONObject.has("enableOverlooking")) {
            ((vc1.p1) b17).f516601e.mo98901xbd4012cd().mo99084x609fdf58(jSONObject.optBoolean("enableOverlooking", false));
        }
        if (jSONObject.has("enableAutoMaxOverlooking")) {
            ((vc1.p1) b17).f516601e.mo98897xb5885626().mo98956x35bb73fd(jSONObject.optBoolean("enableAutoMaxOverlooking", false));
        }
        if (jSONObject.has("enableSatellite")) {
            ((vc1.p1) b17).f516601e.mo98897xb5885626().mo99018x8e5d8e08(jSONObject.optBoolean("enableSatellite", false));
        }
        if (jSONObject.has("enableTraffic")) {
            ((vc1.p1) b17).f516601e.mo98897xb5885626().mo99020xd7866f86(jSONObject.optBoolean("enableTraffic", false));
        }
        if (jSONObject.has("enableIndoor")) {
            ((vc1.p1) b17).f516601e.mo98897xb5885626().mo98994x16b0fc2c(jSONObject.optBoolean("enableIndoor", false));
        }
        if (jSONObject.has("enableIndoorLevelPick")) {
            ((vc1.p1) b17).f516601e.mo98901xbd4012cd().mo99076x2e99c7e4(jSONObject.optBoolean("enableIndoorLevelPick", false));
        }
        if (jSONObject.has("showLocation")) {
            ((vc1.p1) b17).e0(jSONObject.optBoolean("showLocation", false));
        }
        if (jSONObject.has("showScale")) {
            ((vc1.p1) b17).f516601e.mo98901xbd4012cd().mo99081x2093a083(jSONObject.optBoolean("showScale", true));
        }
        if (jSONObject.has("styleId")) {
            int optInt = jSONObject.optInt("styleId", 0);
            vc1.p1 p1Var = (vc1.p1) b17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s setMapStyle: %d", p1Var, java.lang.Integer.valueOf(optInt));
            p1Var.f516601e.mo98897xb5885626().mo99001x80962037(optInt);
        }
        if (jSONObject.has("maxScale")) {
            ((vc1.p1) b17).a0((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("maxScale"), 20.0f));
        }
        if (jSONObject.has("minScale")) {
            ((vc1.p1) b17).b0((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("minScale"), 3.0f));
        }
        if (jSONObject.has("enablePoi")) {
            ((vc1.p1) b17).f516601e.mo98897xb5885626().mo99017xfda2cdd6(jSONObject.optBoolean("enablePoi", true));
        }
        if (jSONObject.has("enableBuilding")) {
            ((vc1.p1) b17).f516601e.mo98897xb5885626().mo99021x77f204d1(jSONObject.optBoolean("enableBuilding", true));
        }
        try {
            if (jSONObject.has("covers")) {
                vc1.p1 p1Var2 = (vc1.p1) b17;
                p1Var2.K();
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("covers"));
                int i18 = 0;
                while (i18 < jSONArray.length()) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                    double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject2.optString("latitude"), 0.0d);
                    org.json.JSONArray jSONArray2 = jSONArray;
                    double F2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject2.optString("longitude"), 0.0d);
                    java.lang.String T0 = ((o91.e) tVar.q(o91.e.class)).T0(tVar, jSONObject2.optString("iconPath"));
                    float optDouble = (float) jSONObject2.optDouble(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, 0.0d);
                    vc1.s1 s1Var = new vc1.s1();
                    s1Var.f516701a = F;
                    s1Var.f516702b = F2;
                    s1Var.f516703c = T0;
                    s1Var.f516704d = optDouble;
                    p1Var2.l(s1Var, (o91.d) tVar.q(o91.d.class));
                    i18++;
                    jSONArray = jSONArray2;
                }
            }
            if (jSONObject.has("scale") || jSONObject.has(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2) || jSONObject.has("skew") || jSONObject.has("centerLatitude") || jSONObject.has("centerLongitude")) {
                float optDouble2 = (float) jSONObject.optDouble("scale", -1.0d);
                float optDouble3 = (float) jSONObject.optDouble(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, -1.0d);
                float optDouble4 = (float) jSONObject.optDouble("skew", -1.0d);
                vc1.p1 p1Var3 = (vc1.p1) b17;
                p1Var3.D(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("centerLatitude", "-1"), -1.0d), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("centerLongitude", "-1"), -1.0d), -1.0f, -1.0f, -1.0f, false);
                if (optDouble2 != -1.0f) {
                    p1Var3.U(new vc1.h(p1Var3, optDouble2));
                }
                if (optDouble3 != -1.0f || optDouble4 != -1.0f) {
                    p1Var3.E(optDouble3, optDouble4);
                }
            }
            vc1.d3.a(4);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateMap", "parse covers error, exception : %s", e17);
            return false;
        }
    }
}
