package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes.dex */
public final class q implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.m f74921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f74922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ad.jsapi.r f74923f;

    public q(com.tencent.mm.plugin.appbrand.jsapi.m mVar, int i17, com.tencent.mm.plugin.appbrand.ad.jsapi.r rVar) {
        this.f74921d = mVar;
        this.f74922e = i17;
        this.f74923f = rVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$AdPushMsgListWrapper jsApiGetAdPushMsg$AdPushMsgListWrapper = (com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$AdPushMsgListWrapper) obj;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        boolean z17 = jsApiGetAdPushMsg$AdPushMsgListWrapper.f74898e;
        com.tencent.mm.plugin.appbrand.ad.jsapi.r rVar = this.f74923f;
        int i17 = this.f74922e;
        com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f74921d;
        if (!z17) {
            if (mVar != null) {
                rVar.getClass();
                java.lang.String str = android.text.TextUtils.isEmpty("get msg error") ? "fail:internal error" : "get msg error";
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                mVar.a(i17, rVar.u(str, jSONObject));
                return;
            }
            return;
        }
        for (com.tencent.mm.advertise.util.MagicAdPushMsg magicAdPushMsg : jsApiGetAdPushMsg$AdPushMsgListWrapper.f74897d) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("opcode", magicAdPushMsg.f53183d);
            jSONObject2.put("aid", magicAdPushMsg.f53184e);
            jSONObject2.put("slotid", magicAdPushMsg.f53185f);
            jSONObject2.put("op_time", magicAdPushMsg.f53186g);
            jSONObject2.put("traceid", magicAdPushMsg.f53187h);
            jSONArray.put(jSONObject2);
        }
        if (mVar != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("msgData", jSONArray);
            rVar.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            mVar.a(i17, rVar.u(str3, jSONObject3));
        }
    }
}
