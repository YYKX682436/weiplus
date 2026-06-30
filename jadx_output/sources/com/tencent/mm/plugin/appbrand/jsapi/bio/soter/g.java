package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* loaded from: classes.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 344;
    public static final java.lang.String NAME = "checkIsSoterEnrolledInDevice";

    /* renamed from: h, reason: collision with root package name */
    public static android.content.Context f79900h;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask f79901g = null;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        f79900h = lVar.getContext();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLuggageCheckBioEnrollment", "hy: subapp start do check is enrolled");
        java.lang.String optString = jSONObject.optString("checkAuthMode");
        if ("fingerPrint".equals(optString)) {
            i18 = 1;
        } else if ("facial".equals(optString)) {
            i18 = 8;
        } else if ("speech".equals(optString)) {
            i18 = 2;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandSoterTranslateUtil", "hy: invalid item");
            i18 = 0;
        }
        this.f79901g = new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask(lVar, i17, i18, this);
        this.f79901g.d();
    }
}
