package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class ac extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1070;
    private static final java.lang.String NAME = "publishWechatStateActivity";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String a17;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "invoke, env is null");
            return;
        }
        java.lang.String appId = c0Var.getAppId();
        java.lang.String str = "";
        if (appId == null) {
            appId = "";
        }
        if (jSONObject != null && (a17 = nf.e.a(jSONObject, "activityToken")) != null) {
            str = a17;
        }
        com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusParams publishTextStatusParams = new com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusParams(appId, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "prepareParams, publishTextStatusParams: " + publishTextStatusParams);
        android.content.Context f147807d = c0Var.getF147807d();
        if (f147807d == null) {
            f147807d = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(f147807d);
        com.tencent.mm.plugin.appbrand.jsapi.zb zbVar = new com.tencent.mm.plugin.appbrand.jsapi.zb(c0Var, i17, this);
        com.tencent.mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest doPublishTextStatusRequest = new com.tencent.mm.plugin.appbrand.jsapi.DoPublishTextStatusRequest(publishTextStatusParams);
        com.tencent.mm.plugin.appbrand.jsapi.yb ybVar = new com.tencent.mm.plugin.appbrand.jsapi.yb(zbVar);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, doPublishTextStatusRequest, ybVar, null);
    }
}
