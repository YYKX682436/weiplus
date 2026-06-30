package com.tencent.mm.plugin.appbrand.jsapi.video.jsapi;

/* loaded from: classes13.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 482;
    public static final java.lang.String NAME = "loadVideoResource";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data nil"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiLoadVideoResource", "data is null");
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiLoadVideoResource", "dataArr nil");
            lVar.a(i17, o("fail:dataArr nil"));
            return;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
            java.lang.String optString = optJSONArray.optString(i19, "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiLoadVideoResource", "videoUrl i nil");
            } else {
                oe1.r1 r1Var = (oe1.r1) i95.n0.c(oe1.r1.class);
                if (r1Var != null) {
                    com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.f(this, lVar, r1Var);
                    ((oe1.z1) r1Var).getClass();
                    com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr appBrandVideoDownLoadMgr = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr.f83524d;
                    int b17 = appBrandVideoDownLoadMgr != null ? appBrandVideoDownLoadMgr.b(optString, fVar) : -3;
                    if (b17 != 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo genPreLoad fail ret = %s, videoUrl = %s", java.lang.Integer.valueOf(b17), optString);
                        C(lVar, optString, b17, 0);
                    }
                }
            }
            i18++;
        }
        if (i18 == 0 || i18 != optJSONArray.length()) {
            return;
        }
        lVar.a(i17, o("fail"));
    }

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        if (i17 != -5) {
            str2 = i17 != -4 ? i17 != -3 ? i17 != -2 ? i17 != -1 ? "" : "args illegal" : "downloading" : "start download fail" : "create file fail";
        } else {
            str2 = "cdn download fail errCode:" + i18;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errMsg", str2);
        hashMap.put("resource", str);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        xe1.l lVar2 = new xe1.l();
        lVar2.p(lVar);
        lVar2.r(jSONObject);
        lVar2.m();
    }
}
