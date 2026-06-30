package ut0;

/* loaded from: classes7.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77239x366c91de = 1587;

    /* renamed from: NAME */
    public static final java.lang.String f77240x24728b = "getLocalWVAPackageInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetLocalWVAPackageInfo", "invoke: packageName=" + optString + ", callbackId=" + i17);
        if (!(optString == null || optString.length() == 0)) {
            com.p314xaae8f345.mm.p874xaefb6cc9.g1 g1Var = com.p314xaae8f345.mm.p874xaefb6cc9.g1.f150604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            g1Var.c(env, optString, new ut0.c(this, i17, env));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiGetLocalWVAPackageInfo", "invoke: packageName is empty");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:invalid request parameter" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 1001);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        env.a(i17, u(str, jSONObject));
    }
}
