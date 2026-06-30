package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes.dex */
public class r extends com.tencent.mm.plugin.appbrand.jsapi.channels.o {
    public static final int CTRL_INDEX = 968;
    public static final java.lang.String NAME = "openChannelsLive";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public java.lang.String E() {
        return "openFinderLive";
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public java.lang.String H(java.lang.String originErrMsg, int i17) {
        kotlin.jvm.internal.o.g(originErrMsg, "originErrMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsLive", "overrideErrMsg, errCode: " + i17);
        if (-1000 == i17 || -1001 == i17 || -1002 == i17 || -1003 == i17) {
            return originErrMsg;
        }
        java.lang.String format = java.lang.String.format("fail:pre check fail, errCode=%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsLive", "overrideErrMsg, newErrMsg: ".concat(format));
        return format;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public boolean J(org.json.JSONObject extInfoJsonObj, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(extInfoJsonObj, "extInfoJsonObj");
        try {
            extInfoJsonObj.put("feedID", extInfoJsonObj.optString("feedId"));
            extInfoJsonObj.put("nonceID", extInfoJsonObj.optString("nonceId"));
            extInfoJsonObj.put("showRecommend", extInfoJsonObj.optBoolean("showRecommend", true));
            extInfoJsonObj.put("commentScene", 15);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLive", "preProcessExtInfo, fail since " + e17);
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public android.content.Intent K(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return com.tencent.mm.plugin.appbrand.ipc.e.a(context);
    }
}
