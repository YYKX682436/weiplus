package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class g1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1532;
    private static final java.lang.String NAME = "openBizPublishImage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        data.put("sourceAppId", env.getAppId());
        org.json.JSONObject a17 = ik1.t.a(data.optJSONObject("externalFileRefs"), env.getFileSystem());
        if (a17 != null) {
            data.remove("externalFileRefs");
            data.put("externalFileRefs", a17);
        }
        android.content.Context context = env.getContext();
        java.lang.String jSONObject = data.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessRequest jsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessRequest = new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessRequest(jSONObject);
        com.tencent.mm.plugin.appbrand.jsapi.biz.f1 f1Var = new com.tencent.mm.plugin.appbrand.jsapi.biz.f1(env, i17, this);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessRequest, f1Var, null);
    }
}
