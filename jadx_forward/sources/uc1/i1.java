package uc1;

/* loaded from: classes13.dex */
public class i1 extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f76886x366c91de = 2;

    /* renamed from: NAME */
    public static final java.lang.String f76887x24728b = "insertMap";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        try {
            return jSONObject.optInt("mapId");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "get mapId error, exception : %s", e17);
            return -1;
        }
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("centerLatitude"), 0.0f);
        float L2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("centerLongitude"), 0.0f);
        float L3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("scale"), 16.0f);
        int optInt = jSONObject.optInt(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, 0);
        int optInt2 = jSONObject.optInt("skew", 0);
        int L4 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("maxScale"), 20.0f);
        int L5 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("minScale"), 3.0f);
        if (java.lang.Math.abs(L) > 90.0f || java.lang.Math.abs(L2) > 180.0f) {
            return null;
        }
        vc1.d3.a(0);
        java.lang.String mo48798x74292566 = tVar.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertMap", "insertMap appId:%s viewId:%d data:%s", mo48798x74292566, java.lang.Integer.valueOf(H(jSONObject)), jSONObject);
        dg1.i iVar = (dg1.i) ((vc1.b3) nd.f.a(vc1.b3.class));
        iVar.getClass();
        try {
            jSONObject.put("mapType", 1);
            boolean optBoolean = jSONObject.optBoolean("enableDarkMode", false);
            nf.y yVar = nf.x.f418149b;
            if (!(yVar != null ? yVar.mo53144x387a9983() : false)) {
                optBoolean = false;
            }
            jSONObject.put("enableDarkMode", optBoolean ? 1 : 0);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.WxaMapViewFactory", "", e17);
        }
        android.content.Context mo50352x76847179 = tVar.mo50352x76847179();
        java.lang.String optString = jSONObject.optString("theme", "");
        int optInt3 = jSONObject.optInt("mapType", 1);
        java.lang.String optString2 = jSONObject.optString("subKey", "");
        java.lang.String mo48798x742925662 = tVar.mo48798x74292566();
        java.lang.String optString3 = jSONObject.optString("pluginId", "");
        if (android.text.TextUtils.isEmpty(optString3)) {
            optString3 = mo48798x742925662;
        }
        int optInt4 = jSONObject.optInt("styleId", 0);
        java.lang.String b17 = vc1.e3.b(tVar, jSONObject);
        int optInt5 = jSONObject.optInt("enableDarkMode", 0);
        boolean optBoolean2 = jSONObject.optBoolean("enableMSAA", false);
        java.util.HashMap hashMap = new java.util.HashMap(5);
        hashMap.put("theme", optString);
        hashMap.put("mapType", java.lang.Integer.valueOf(optInt3));
        hashMap.put("subKey", optString2);
        hashMap.put("subId", optString3);
        hashMap.put("styleId", java.lang.Integer.valueOf(optInt4));
        hashMap.put("enableDarkMode", java.lang.Integer.valueOf(optInt5));
        hashMap.put("isOverseasUser", java.lang.Boolean.valueOf(iVar.a()));
        hashMap.put("enableMSAA", java.lang.Boolean.valueOf(optBoolean2));
        vc1.p1 p1Var = new vc1.p1(mo50352x76847179, b17, hashMap);
        if (!vc1.h3.d(mo48798x74292566, vc1.e3.b(tVar, jSONObject), p1Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "initMapView is false, return");
            vc1.d3.a(1);
            return null;
        }
        vc1.d3.a(2);
        boolean optBoolean3 = jSONObject.optBoolean("enableZoom", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 c16320xe3e95109 = p1Var.f516601e;
        c16320xe3e95109.mo98901xbd4012cd().mo99085x9509ff82(optBoolean3);
        c16320xe3e95109.mo98901xbd4012cd().mo99083xc5bd91c8(jSONObject.optBoolean("enableScroll", true));
        c16320xe3e95109.mo98901xbd4012cd().mo99080xca66ed7a(jSONObject.optBoolean("enableRotate", false));
        c16320xe3e95109.mo98901xbd4012cd().mo99075xbcd5a2d1(jSONObject.optBoolean("showCompass", false));
        c16320xe3e95109.mo98897xb5885626().mo98990x9a0dfe5b(jSONObject.optBoolean("enable3D", false));
        c16320xe3e95109.mo98901xbd4012cd().mo99084x609fdf58(jSONObject.optBoolean("enableOverlooking", false));
        c16320xe3e95109.mo98897xb5885626().mo98956x35bb73fd(jSONObject.optBoolean("enableAutoMaxOverlooking", false));
        c16320xe3e95109.mo98897xb5885626().mo99018x8e5d8e08(jSONObject.optBoolean("enableSatellite", false));
        c16320xe3e95109.mo98897xb5885626().mo98994x16b0fc2c(jSONObject.optBoolean("enableIndoor", true));
        c16320xe3e95109.mo98901xbd4012cd().mo99076x2e99c7e4(jSONObject.optBoolean("enableIndoorLevelPick", false));
        c16320xe3e95109.mo98901xbd4012cd().mo99081x2093a083(jSONObject.optBoolean("showScale", true));
        if (jSONObject.has("enablePoi")) {
            c16320xe3e95109.mo98897xb5885626().mo99017xfda2cdd6(jSONObject.optBoolean("enablePoi", true));
        }
        if (jSONObject.has("enableBuilding")) {
            c16320xe3e95109.mo98897xb5885626().mo99021x77f204d1(jSONObject.optBoolean("enableBuilding", true));
        }
        p1Var.a0(L4);
        p1Var.b0(L5);
        p1Var.D(L, L2, L3, optInt, optInt2, false);
        tVar.R(new uc1.m0(this, p1Var));
        tVar.U(new uc1.n0(this, p1Var));
        tVar.w(new uc1.o0(this, tVar, mo48798x74292566, jSONObject));
        android.widget.FrameLayout frameLayout = p1Var.f516597c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/map/JsApiInsertMap", "inflateView", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        frameLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(frameLayout, "com/tencent/mm/plugin/appbrand/jsapi/map/JsApiInsertMap", "inflateView", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(tVar.mo50352x76847179(), frameLayout);
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        vc1.a3 b17 = vc1.h3.b(tVar.mo48798x74292566(), vc1.e3.b(tVar, jSONObject));
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "mapView is null, error, return");
            return;
        }
        vc1.p1 p1Var = (vc1.p1) b17;
        p1Var.f516605g = new uc1.p0(this, i17, tVar);
        p1Var.f516607h = new uc1.q0(this, i17, tVar);
        p1Var.H = new uc1.r0(this, i17, tVar);
        p1Var.f516609i = new uc1.s0(this, i17, tVar);
        p1Var.I = new uc1.t0(this, i17, tVar);
        p1Var.e0(jSONObject.optBoolean("showLocation"));
        p1Var.c0(new uc1.u0(this, i17, tVar, b17));
        p1Var.M = new uc1.h0(this, i17, tVar);
        p1Var.f516611j = new uc1.i0(this, i17, tVar);
        p1Var.W(new uc1.j0(this, i17, tVar));
        p1Var.f516639x = new uc1.k0(this, i17, tVar);
        p1Var.f516641y = new uc1.l0(this, i17, tVar);
    }
}
