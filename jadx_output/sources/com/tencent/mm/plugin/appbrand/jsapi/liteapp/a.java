package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
public class a extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1583;
    private static final java.lang.String NAME = "callLiteAppConnectEvent";

    public static java.lang.String C(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", str);
            return jSONObject.toString();
        } catch (org.json.JSONException unused) {
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(final com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "invoke callLiteAppConnectEvent");
        if (jSONObject != null) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()), com.tencent.mm.plugin.appbrand.jsapi.liteapp.c.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.appbrand.jsapi.liteapp.a$$a
                /* JADX WARN: Removed duplicated region for block: B:115:0x017c  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x0180  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0109 A[Catch: JSONException -> 0x0166, TryCatch #2 {JSONException -> 0x0166, blocks: (B:3:0x001b, B:6:0x0021, B:9:0x0029, B:25:0x0083, B:28:0x008f, B:30:0x0097, B:32:0x00a2, B:34:0x00b1, B:39:0x00c0, B:43:0x00d5, B:48:0x00ce, B:51:0x00de, B:56:0x00ea, B:60:0x0100, B:65:0x00f9, B:67:0x0109, B:72:0x0119, B:76:0x012e, B:81:0x0127, B:84:0x0050, B:87:0x005a, B:90:0x0064, B:93:0x006e, B:96:0x0137, B:101:0x0148, B:105:0x015e, B:110:0x0157, B:42:0x00c8, B:59:0x00f3, B:104:0x0151, B:75:0x0121), top: B:2:0x001b, inners: #1, #3, #4, #5 }] */
                @Override // com.tencent.mm.ipcinvoker.r
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(java.lang.Object r17) {
                    /*
                        Method dump skipped, instructions count: 414
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.liteapp.a$$a.a(java.lang.Object):void");
                }
            });
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "data is null");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }
}
