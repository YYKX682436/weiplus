package be1;

/* loaded from: classes7.dex */
public final class y0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f4240x366c91de = 1225;

    /* renamed from: NAME */
    private static final java.lang.String f4241x24728b = "systemCapabilityAuthorizationStatus";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiSystemCapabilityAuthorizationStatus", "invoke: " + jSONObject);
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("capability", -1)) : null;
        java.lang.Integer valueOf2 = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("authScene", -1)) : null;
        d85.g0 g0Var = (valueOf != null && valueOf.intValue() == 1) ? d85.g0.LOCAION : (valueOf != null && valueOf.intValue() == 6) ? d85.g0.STORAGE : (valueOf != null && valueOf.intValue() == 11) ? d85.g0.CAMERA : null;
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiSystemCapabilityAuthorizationStatus", "capability error: " + valueOf);
            if (yVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                yVar.a(i17, u(str2, jSONObject2));
                return;
            }
            return;
        }
        d85.f0 f0Var = (valueOf2 != null && valueOf2.intValue() == 14) ? d85.f0.f308704v : (valueOf2 != null && valueOf2.intValue() == 42) ? d85.f0.N : (valueOf2 != null && valueOf2.intValue() == 46) ? d85.f0.P : null;
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiSystemCapabilityAuthorizationStatus", "authScene error: " + valueOf2);
            if (yVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str2 = str != null ? str : "";
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                yVar.a(i17, u(str2, jSONObject3));
                return;
            }
            return;
        }
        android.content.Context f229340d = yVar != null ? yVar.getF229340d() : null;
        if (f229340d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.a(i17, u(str2, jSONObject4));
            return;
        }
        java.util.Set entrySet = e85.i.f331849b.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
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
            d85.h0 ij6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(f229340d, (java.lang.String) it7.next(), f0Var.f308710e);
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiSystemCapabilityAuthorizationStatus", "IPluginSensitive.PERMISSION_RESULT.ERROR = " + ij6.f308734d);
                }
            }
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i18)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiSystemCapabilityAuthorizationStatus", "invoke: result " + k17);
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!(k17 instanceof java.util.HashMap)) {
            k17 = new java.util.HashMap(k17);
        }
        k17.put("errno", 0);
        yVar.a(i17, t("ok", k17));
    }
}
