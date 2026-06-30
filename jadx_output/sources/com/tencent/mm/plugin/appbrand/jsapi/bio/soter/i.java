package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* loaded from: classes15.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 276;
    public static final java.lang.String NAME = "checkIsSupportSoterAuthentication";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask f79902g = null;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLuggageCheckIsSupportSoterAuthentication", "hy: subapp start do check is support soter authentication");
        this.f79902g = new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask(lVar, i17, this);
        this.f79902g.d();
    }
}
