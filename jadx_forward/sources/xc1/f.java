package xc1;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f77395x366c91de = 1145;

    /* renamed from: NAME */
    private static final java.lang.String f77396x24728b = "callbackDataToNative";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (jSONObject == null || jSONObject.length() <= 0) {
            if (yVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:invalid data" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                yVar.a(i17, u(str2, jSONObject2));
                return;
            }
            return;
        }
        if (yVar == null || (mo32091x9a3f0ba2 = yVar.mo32091x9a3f0ba2()) == null) {
            if (yVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                str2 = str != null ? str : "";
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 4);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                yVar.a(i17, u(str2, jSONObject3));
                return;
            }
            return;
        }
        java.lang.String jSONObject4 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        java.lang.String str5 = mo32091x9a3f0ba2.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getAppId(...)");
        uk0.a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1099x434a842f.C12188xee09b892(str5, jSONObject4), new xc1.q(), null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeDataChannel", "callbackDataToNative, in appbrand process, notify again");
            xc1.s sVar = xc1.s.f534590a;
            java.lang.String str6 = mo32091x9a3f0ba2.f156336n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str6, "getAppId(...)");
            sVar.a(str6, jSONObject4);
        }
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        yVar.a(i17, u(str2, jSONObject5));
    }
}
