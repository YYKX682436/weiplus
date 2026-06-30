package zd1;

/* loaded from: classes7.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77581x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f77582x24728b = "setAcquireWebviewDom";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String[] strArr;
        zd1.c cVar;
        java.lang.String str;
        java.lang.String str2;
        of1.w1 s37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null) {
            return;
        }
        jz5.g gVar = zd1.c.f553060f;
        if (jSONObject == null) {
            cVar = null;
        } else {
            boolean optBoolean = jSONObject.optBoolean("enableAcquireWebviewDom", false);
            if (optBoolean) {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("type");
                if (optJSONArray != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    c75.c.d(optJSONArray, new zd1.b(arrayList));
                    strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
                } else {
                    strArr = null;
                }
                if (strArr == null) {
                    strArr = new java.lang.String[0];
                }
                cVar = new zd1.c(optBoolean, strArr);
            } else {
                cVar = (zd1.c) ((jz5.n) zd1.c.f553060f).mo141623x754a37bb();
            }
        }
        if (cVar == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        if (t37 != null) {
            t37.N1(cVar, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = c0Var.V0();
        if (V0 != null && (s37 = V0.s3()) != null) {
            s37.t0(s37.f426572m);
        }
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i17, u(str2, jSONObject3));
    }
}
