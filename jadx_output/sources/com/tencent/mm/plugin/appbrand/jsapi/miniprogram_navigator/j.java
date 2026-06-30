package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public final class j extends com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l {
    public static final int CTRL_INDEX = 967;
    public static final java.lang.String NAME = "launchDevMiniProgram";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l
    public boolean C(com.tencent.luggage.sdk.jsapi.component.service.y service, org.json.JSONObject data, int i17) {
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("appId");
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b a17 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(data.optString("envVersion"), com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.RELEASE);
        java.lang.String optString2 = data.optString("downloadURL");
        java.lang.String optString3 = data.optString("checkSumMd5");
        java.lang.String optString4 = data.optString("extoptions");
        if (com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.DEVELOP == a17) {
            if (!(optString3 == null || optString3.length() == 0)) {
                com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo jsApiNavigateToDevMiniProgram$DevPkgInfo = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo();
                jsApiNavigateToDevMiniProgram$DevPkgInfo.f82181d = optString;
                jsApiNavigateToDevMiniProgram$DevPkgInfo.f82182e = optString2;
                jsApiNavigateToDevMiniProgram$DevPkgInfo.f82183f = optString3;
                jsApiNavigateToDevMiniProgram$DevPkgInfo.f82184g = optString4;
                try {
                    iPCVoid = (com.tencent.mm.ipcinvoker.type.IPCVoid) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, jsApiNavigateToDevMiniProgram$DevPkgInfo, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q.class);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiLaunchDevMiniProgram", "invoke IPCFlushDevPkg, parcel:" + jsApiNavigateToDevMiniProgram$DevPkgInfo + ", exception:" + e17);
                    iPCVoid = null;
                }
                if (!(iPCVoid != null)) {
                    service.a(i17, "fail save packageInfo failed");
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return false;
    }
}
