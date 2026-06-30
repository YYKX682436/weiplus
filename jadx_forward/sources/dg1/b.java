package dg1;

/* loaded from: classes13.dex */
public class b extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dg1.c f313800h;

    public b(dg1.c cVar) {
        this.f313800h = cVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        dg1.g gVar;
        vc1.p1 p1Var;
        dg1.c cVar = this.f313800h;
        dg1.g gVar2 = cVar.f313805h;
        eg1.m mVar = (eg1.m) cVar.f313801d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = cVar.f313802e;
        org.json.JSONObject jSONObject = cVar.f313803f;
        android.view.Surface surface = gVar2.f313814i;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertXWebMap", "insertXwebMap:%s", jSONObject);
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("centerLatitude"), 0.0d);
        double F2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("centerLongitude"), 0.0d);
        float optDouble = (float) jSONObject.optDouble("scale", 16.0d);
        int optInt = jSONObject.optInt(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, 0);
        int optInt2 = jSONObject.optInt("skew", 0);
        int L = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("maxScale"), 20.0f);
        int L2 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("minScale"), 3.0f);
        if (java.lang.Math.abs(F) > 90.0d || java.lang.Math.abs(F2) > 180.0d) {
            gVar = gVar2;
        } else {
            java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
            gVar = gVar2;
            java.lang.String optString = jSONObject.optString("theme", "");
            java.lang.String optString2 = jSONObject.optString("subKey", "");
            java.lang.String mo48798x742925662 = lVar.mo48798x74292566();
            java.lang.String optString3 = jSONObject.optString("pluginId", "");
            if (android.text.TextUtils.isEmpty(optString3)) {
                optString3 = mo48798x742925662;
            }
            int optInt3 = jSONObject.optInt("styleId", 0);
            boolean optBoolean = jSONObject.optBoolean("enableDarkMode", false);
            boolean optBoolean2 = jSONObject.optBoolean("enableMSAA", false);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
            if (optJSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertXWebMap", "positionObj is null, err, return");
            } else {
                int j17 = ik1.w.j(optJSONObject, "width", 0);
                int j18 = ik1.w.j(optJSONObject, "height", 0);
                java.lang.String b17 = vc1.e3.b(lVar, jSONObject);
                java.util.HashMap hashMap = new java.util.HashMap(5);
                hashMap.put("theme", optString);
                hashMap.put("subKey", optString2);
                hashMap.put("subId", optString3);
                hashMap.put("styleId", java.lang.Integer.valueOf(optInt3));
                hashMap.put("surface", surface);
                hashMap.put("width", java.lang.Integer.valueOf(j17));
                hashMap.put("height", java.lang.Integer.valueOf(j18));
                hashMap.put("mapType", 2);
                hashMap.put("enableDarkMode", java.lang.Integer.valueOf(optBoolean ? 1 : 0));
                hashMap.put("enableMSAA", java.lang.Boolean.valueOf(optBoolean2));
                vc1.b3 b3Var = (vc1.b3) nd.f.a(vc1.b3.class);
                android.content.Context f229340d = lVar.getF229340d();
                dg1.i iVar = (dg1.i) b3Var;
                iVar.getClass();
                if (f229340d == null) {
                    p1Var = null;
                } else {
                    int d17 = vc1.e3.d(hashMap, "mapType", 1);
                    int d18 = vc1.e3.d(hashMap, "enableDarkMode", 0);
                    nf.y yVar = nf.x.f418149b;
                    if (!(yVar != null ? yVar.mo53144x387a9983() : false)) {
                        d18 = 0;
                    }
                    hashMap.put("enableDarkMode", java.lang.Integer.valueOf(d18));
                    hashMap.put("isOverseasUser", java.lang.Boolean.valueOf(iVar.a()));
                    p1Var = d17 == 2 ? new dg1.h(f229340d, b17, hashMap) : new vc1.p1(f229340d, b17, hashMap);
                }
                if (p1Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertXWebMap", "mapView is null, return");
                } else {
                    if (vc1.h3.d(mo48798x74292566, vc1.e3.b(lVar, jSONObject), p1Var)) {
                        p1Var.f516601e.mo98901xbd4012cd().mo99085x9509ff82(jSONObject.optBoolean("enableZoom", true));
                        p1Var.f516601e.mo98901xbd4012cd().mo99083xc5bd91c8(jSONObject.optBoolean("enableScroll", true));
                        p1Var.f516601e.mo98901xbd4012cd().mo99080xca66ed7a(jSONObject.optBoolean("enableRotate", false));
                        p1Var.f516601e.mo98901xbd4012cd().mo99075xbcd5a2d1(jSONObject.optBoolean("showCompass", false));
                        p1Var.f516601e.mo98897xb5885626().mo98990x9a0dfe5b(jSONObject.optBoolean("enable3D", false));
                        p1Var.f516601e.mo98901xbd4012cd().mo99084x609fdf58(jSONObject.optBoolean("enableOverlooking", false));
                        p1Var.f516601e.mo98897xb5885626().mo98956x35bb73fd(jSONObject.optBoolean("enableAutoMaxOverlooking", false));
                        p1Var.f516601e.mo98897xb5885626().mo99018x8e5d8e08(jSONObject.optBoolean("enableSatellite", false));
                        p1Var.f516601e.mo98897xb5885626().mo98994x16b0fc2c(jSONObject.optBoolean("enableIndoor", true));
                        p1Var.f516601e.mo98901xbd4012cd().mo99076x2e99c7e4(jSONObject.optBoolean("enableIndoorLevelPick", false));
                        p1Var.f516601e.mo98901xbd4012cd().mo99081x2093a083(jSONObject.optBoolean("showScale", true));
                        if (jSONObject.has("enablePoi")) {
                            p1Var.f516601e.mo98897xb5885626().mo99017xfda2cdd6(jSONObject.optBoolean("enablePoi", true));
                        }
                        if (jSONObject.has("enableBuilding")) {
                            p1Var.f516601e.mo98897xb5885626().mo99021x77f204d1(jSONObject.optBoolean("enableBuilding", true));
                        }
                        p1Var.a0(L);
                        p1Var.b0(L2);
                        p1Var.D(F, F2, optDouble, optInt, optInt2, false);
                        android.widget.FrameLayout frameLayout = p1Var.f516597c;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/map/jsapi/JsApiInsertXWebMap", uc1.i1.f76887x24728b, "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;Landroid/view/Surface;)Lcom/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/IMapView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        frameLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(frameLayout, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/map/jsapi/JsApiInsertXWebMap", uc1.i1.f76887x24728b, "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;Landroid/view/Surface;)Lcom/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/IMapView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int c17 = vc1.e3.c(jSONObject);
                        p1Var.f516605g = new eg1.d(mVar, c17, lVar);
                        p1Var.f516607h = new eg1.e(mVar, c17, lVar);
                        p1Var.H = new eg1.f(mVar, c17, lVar);
                        p1Var.f516609i = new eg1.g(mVar, c17, lVar);
                        p1Var.I = new eg1.h(mVar, c17, lVar);
                        p1Var.e0(jSONObject.optBoolean("showLocation"));
                        p1Var.c0(new eg1.i(mVar, c17, lVar, p1Var));
                        p1Var.M = new eg1.j(mVar, c17, lVar);
                        p1Var.f516611j = new eg1.k(mVar, c17, lVar);
                        p1Var.W(new eg1.l(mVar, c17, lVar));
                        p1Var.f516639x = new eg1.b(mVar, c17, lVar);
                        p1Var.f516641y = new eg1.c(mVar, c17, lVar);
                        gVar.f313815m = p1Var;
                        return java.lang.Boolean.FALSE;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertXWebMap", "initMapView is false, return");
                }
            }
        }
        p1Var = null;
        gVar.f313815m = p1Var;
        return java.lang.Boolean.FALSE;
    }
}
