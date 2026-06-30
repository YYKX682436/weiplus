package zd1;

/* loaded from: classes7.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77585x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f77586x24728b = "setSecuritySnapshotStrategy";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        boolean optBoolean = data.optBoolean("enabledSnapshot", false);
        long optLong = data.optLong("snapshotIntervalMillis", 2000L);
        int optInt = data.optInt("shortEdge", 300);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "invoke(" + service.mo48798x74292566() + ") data:" + data);
        if (optInt <= 0) {
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            service.a(i17, u(str, jSONObject));
            return;
        }
        if (!optBoolean) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "invoke(" + service.mo48798x74292566() + ") call stop()");
            zd1.a0 X2 = service.t3().X2();
            if (X2 != null) {
                X2.b(true);
            }
        } else {
            if (!wo.w0.q()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "not support in 32bit device");
                str2 = android.text.TextUtils.isEmpty(null) ? "fail forbidden" : null;
                str = str2 != null ? str2 : "";
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                service.a(i17, u(str, jSONObject2));
                return;
            }
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            e42.d0 d0Var = e42.d0.clicfg_android_appbrand_security_detect_snapshot;
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!((h62.d) e0Var).fj(d0Var, false)) {
                java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail forbidden" : null;
                str = str6 != null ? str6 : "";
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                service.a(i17, u(str, jSONObject3));
                return;
            }
            if (optLong <= 0) {
                java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail invalid snapshotIntervalMillis" : null;
                str = str7 != null ? str7 : "";
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 0);
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                service.a(i17, u(str, jSONObject4));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "invoke(" + service.mo48798x74292566() + ") call start()");
            zd1.a0 X22 = service.t3().X2();
            if (X22 != null) {
                X22.a(optLong, ik1.w.c(optInt));
            }
        }
        java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str8 != null ? str8 : "";
        java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 0);
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
        }
        service.a(i17, u(str, jSONObject5));
    }
}
