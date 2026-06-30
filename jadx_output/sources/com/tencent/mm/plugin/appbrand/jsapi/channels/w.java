package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes.dex */
public class w extends com.tencent.mm.plugin.appbrand.jsapi.channels.r {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "private_openChannelsLive";

    /* renamed from: h, reason: collision with root package name */
    public final boolean f80278h = true;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o, com.tencent.mm.plugin.appbrand.jsapi.channels.m
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17) {
        java.lang.String optString;
        java.lang.String str = "";
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("implType", "");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
            }
        } else {
            optString = null;
        }
        java.lang.String str2 = optString == null ? "" : optString;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("bizName", "") : null;
        java.lang.String str3 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("bizScene", "") : null;
        java.lang.String str4 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("traceId", "") : null;
        java.lang.String str5 = optString4 == null ? "" : optString4;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("frameSetName", "") : null;
        java.lang.String str6 = optString5 == null ? "" : optString5;
        mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
        if (c0Var != null) {
            mq0.z zVar = mq0.z.f330647u;
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("apiName", NAME);
            java.lang.String optString6 = jSONObject != null ? jSONObject.optString("reportExtraInfo", "") : null;
            if (optString6 != null) {
                str = optString6;
            }
            lVarArr[1] = new jz5.l("uxinfo", str);
            mq0.c0.ig(c0Var, zVar, str3, str4, str5, str6, str2, null, kz5.c1.k(lVarArr), 64, null);
        }
        super.C(lVar, jSONObject, jSONObject2, i17);
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f330559e);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public boolean F() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public boolean G() {
        return this.f80278h;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public org.json.JSONObject I(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("feedbackInfo", new org.json.JSONArray(jSONObject.getString("feedbackInfo")));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLivePrivate", "process feedbackInfo failure since " + e17);
        }
        return jSONObject;
    }
}
