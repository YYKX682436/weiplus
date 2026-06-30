package be1;

/* loaded from: classes7.dex */
public final class y0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1225;
    private static final java.lang.String NAME = "systemCapabilityAuthorizationStatus";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mars.xlog.Log.i("JsApiSystemCapabilityAuthorizationStatus", "invoke: " + jSONObject);
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("capability", -1)) : null;
        java.lang.Integer valueOf2 = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("authScene", -1)) : null;
        d85.g0 g0Var = (valueOf != null && valueOf.intValue() == 1) ? d85.g0.LOCAION : (valueOf != null && valueOf.intValue() == 6) ? d85.g0.STORAGE : (valueOf != null && valueOf.intValue() == 11) ? d85.g0.CAMERA : null;
        if (g0Var == null) {
            com.tencent.mars.xlog.Log.e("JsApiSystemCapabilityAuthorizationStatus", "capability error: " + valueOf);
            if (yVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                yVar.a(i17, u(str2, jSONObject2));
                return;
            }
            return;
        }
        d85.f0 f0Var = (valueOf2 != null && valueOf2.intValue() == 14) ? d85.f0.f227171v : (valueOf2 != null && valueOf2.intValue() == 42) ? d85.f0.N : (valueOf2 != null && valueOf2.intValue() == 46) ? d85.f0.P : null;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("JsApiSystemCapabilityAuthorizationStatus", "authScene error: " + valueOf2);
            if (yVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str2 = str != null ? str : "";
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                yVar.a(i17, u(str2, jSONObject3));
                return;
            }
            return;
        }
        android.content.Context f147807d = yVar != null ? yVar.getF147807d() : null;
        if (f147807d == null) {
            kotlin.jvm.internal.o.d(yVar);
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.a(i17, u(str2, jSONObject4));
            return;
        }
        java.util.Set entrySet = e85.i.f250316b.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.util.Map.Entry) next).getValue() == g0Var) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add((java.lang.String) ((java.util.Map.Entry) it6.next()).getKey());
        }
        java.util.Iterator it7 = arrayList2.iterator();
        int i18 = -1;
        while (it7.hasNext()) {
            d85.h0 ij6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(f147807d, (java.lang.String) it7.next(), f0Var.f227177e);
            if (ij6 == d85.h0.SYSTEM_REFUSE) {
                i18 = 2;
            } else {
                if (ij6 == d85.h0.BUSINESS_REFUSE) {
                    i18 = 3;
                }
                if (ij6 == d85.h0.GRANTED && i18 != 3) {
                    i18 = 1;
                }
                if (ij6 == d85.h0.ERROR) {
                    com.tencent.mars.xlog.Log.e("JsApiSystemCapabilityAuthorizationStatus", "IPluginSensitive.PERMISSION_RESULT.ERROR = " + ij6.f227201d);
                }
            }
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i18)));
        com.tencent.mars.xlog.Log.i("JsApiSystemCapabilityAuthorizationStatus", "invoke: result " + k17);
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!(k17 instanceof java.util.HashMap)) {
            k17 = new java.util.HashMap(k17);
        }
        k17.put("errno", 0);
        yVar.a(i17, t("ok", k17));
    }
}
