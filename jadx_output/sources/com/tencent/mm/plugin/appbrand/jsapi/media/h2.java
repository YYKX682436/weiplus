package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class h2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1516;
    private static final java.lang.String NAME = "bizChooseImage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        java.lang.String str;
        int optInt;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JSApiBizChooseImage", "invoke, env is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JSApiBizChooseImage", "invoke, activity is null");
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JSApiBizChooseImage", "invoke, data is null");
            str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str, jSONObject3));
            return;
        }
        if (((qk.r7) i95.n0.c(qk.r7.class)) != null) {
            z17 = qp.b.f365678e;
            com.tencent.mars.xlog.Log.i("MicroMsg.JSApiBizChooseImage", "live photo core support");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.JSApiBizChooseImage", "livePhotoCoreService is null");
            z17 = false;
        }
        boolean z18 = jSONObject.optBoolean("supportLivePhoto") && z17;
        if (jSONObject.has("count")) {
            int optInt2 = jSONObject.optInt("count");
            if (!(1 <= optInt2 && optInt2 < 21)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JSApiBizChooseImage", "invalid count " + jSONObject.optInt("count"));
                str = android.text.TextUtils.isEmpty("fail:invalid count") ? "fail:jsapi invalid request data" : "fail:invalid count";
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 101);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                lVar.a(i17, u(str, jSONObject4));
                return;
            }
            optInt = jSONObject.optInt("count");
        } else {
            optInt = 20;
        }
        boolean optBoolean = jSONObject.optBoolean("supportTextCover");
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseTaskRequest jSApiBizChooseImage$ChooseTaskRequest = new com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseTaskRequest(null, 0, false, false, 15, null);
        jSApiBizChooseImage$ChooseTaskRequest.f(optInt);
        jSApiBizChooseImage$ChooseTaskRequest.g(z18);
        java.lang.String appId = lVar.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        jSApiBizChooseImage$ChooseTaskRequest.e(appId);
        jSApiBizChooseImage$ChooseTaskRequest.h(optBoolean);
        com.tencent.mm.plugin.appbrand.jsapi.media.g2 g2Var = new com.tencent.mm.plugin.appbrand.jsapi.media.g2(lVar, i17, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.JSApiBizChooseImage", "chooseMedia supportLivePhoto:%b, count:%d", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(optInt));
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(activity, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jSApiBizChooseImage$ChooseTaskRequest, g2Var, null);
    }
}
