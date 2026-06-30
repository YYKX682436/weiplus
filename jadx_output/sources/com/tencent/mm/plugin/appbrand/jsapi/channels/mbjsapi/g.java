package com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi;

/* loaded from: classes.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.channels.w {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.r, com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public java.lang.String E() {
        return "autoOpenFinderLive";
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.r, com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public boolean J(org.json.JSONObject extInfoJsonObj, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(extInfoJsonObj, "extInfoJsonObj");
        extInfoJsonObj.put("feedID", extInfoJsonObj.optString("feedId"));
        extInfoJsonObj.put("nonceID", extInfoJsonObj.optString("nonceId"));
        extInfoJsonObj.put("showRecommend", extInfoJsonObj.optBoolean("showRecommend", true));
        return true;
    }
}
