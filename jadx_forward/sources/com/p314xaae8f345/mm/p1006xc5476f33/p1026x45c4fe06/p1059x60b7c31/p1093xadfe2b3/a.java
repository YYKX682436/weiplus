package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34435x366c91de = 1583;

    /* renamed from: NAME */
    private static final java.lang.String f34436x24728b = "callLiteAppConnectEvent";

    public static java.lang.String C(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", str);
            return jSONObject.toString();
        } catch (org.json.JSONException unused) {
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, final int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCallLiteAppConnectEvent", "invoke callLiteAppConnectEvent");
        if (jSONObject != null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject.toString()), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.c.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: com.tencent.mm.plugin.appbrand.jsapi.liteapp.a$$a
                /* JADX WARN: Removed duplicated region for block: B:115:0x017c  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x0180  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0109 A[Catch: JSONException -> 0x0166, TryCatch #2 {JSONException -> 0x0166, blocks: (B:3:0x001b, B:6:0x0021, B:9:0x0029, B:25:0x0083, B:28:0x008f, B:30:0x0097, B:32:0x00a2, B:34:0x00b1, B:39:0x00c0, B:43:0x00d5, B:48:0x00ce, B:51:0x00de, B:56:0x00ea, B:60:0x0100, B:65:0x00f9, B:67:0x0109, B:72:0x0119, B:76:0x012e, B:81:0x0127, B:84:0x0050, B:87:0x005a, B:90:0x0064, B:93:0x006e, B:96:0x0137, B:101:0x0148, B:105:0x015e, B:110:0x0157, B:42:0x00c8, B:59:0x00f3, B:104:0x0151, B:75:0x0121), top: B:2:0x001b, inners: #1, #3, #4, #5 }] */
                @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(java.lang.Object r17) {
                    /*
                        Method dump skipped, instructions count: 414
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.C12148x2ca3e0.a(java.lang.Object):void");
                }
            });
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCallLiteAppConnectEvent", "data is null");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }
}
