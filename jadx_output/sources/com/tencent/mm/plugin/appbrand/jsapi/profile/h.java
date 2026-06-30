package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.jsapi.profile.j {
    private static final int CTRL_INDEX = 1203;
    private static final java.lang.String NAME = "openWeComUserProfile";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.profile.j
    public com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest C(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(data.getString("dataUrl"));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        java.lang.String str = (java.lang.String) m521constructorimpl;
        if (str != null) {
            int i18 = this.f82809g;
            java.lang.String str2 = this.f82810h;
            return new com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest(str, i18, str2 != null ? str2 : "");
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, dataUrl is null");
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        java.lang.String str4 = str3 != null ? str3 : "";
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        env.a(i17, u(str4, jSONObject));
        return null;
    }
}
