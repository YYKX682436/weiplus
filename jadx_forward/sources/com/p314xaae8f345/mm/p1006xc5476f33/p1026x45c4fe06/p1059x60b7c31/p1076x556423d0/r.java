package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes.dex */
public class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o {

    /* renamed from: CTRL_INDEX */
    public static final int f34013x366c91de = 968;

    /* renamed from: NAME */
    public static final java.lang.String f34014x24728b = "openChannelsLive";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public java.lang.String E() {
        return "openFinderLive";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public java.lang.String H(java.lang.String originErrMsg, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originErrMsg, "originErrMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsLive", "overrideErrMsg, errCode: " + i17);
        if (-1000 == i17 || -1001 == i17 || -1002 == i17 || -1003 == i17) {
            return originErrMsg;
        }
        java.lang.String format = java.lang.String.format("fail:pre check fail, errCode=%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsLive", "overrideErrMsg, newErrMsg: ".concat(format));
        return format;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public boolean J(org.json.JSONObject extInfoJsonObj, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfoJsonObj, "extInfoJsonObj");
        try {
            extInfoJsonObj.put("feedID", extInfoJsonObj.optString("feedId"));
            extInfoJsonObj.put("nonceID", extInfoJsonObj.optString("nonceId"));
            extInfoJsonObj.put("showRecommend", extInfoJsonObj.optBoolean("showRecommend", true));
            extInfoJsonObj.put("commentScene", 15);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLive", "preProcessExtInfo, fail since " + e17);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public android.content.Intent K(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.e.a(context);
    }
}
