package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* loaded from: classes.dex */
public class c extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 344;
    public static final java.lang.String NAME = "checkIsSoterEnrolledInDevice";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment$GetIsEnrolledTask f79898g = null;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckBioEnrollment", "hy: subapp start do check is enrolled");
        this.f79898g = new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment$GetIsEnrolledTask(lVar, i17, com.tencent.mm.plugin.appbrand.jsapi.bio.soter.a.a(jSONObject.optString("checkAuthMode")), this);
        this.f79898g.d();
    }
}
