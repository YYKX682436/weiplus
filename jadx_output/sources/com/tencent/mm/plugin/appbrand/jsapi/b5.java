package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class b5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "closeDirectGameCoverViewContainer";

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r6.M0() == true) goto L13;
     */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r5, org.json.JSONObject r6, int r7) {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.e9 r5 = (com.tencent.mm.plugin.appbrand.e9) r5
            if (r5 != 0) goto L5
            goto L5c
        L5:
            if (r6 != 0) goto L8
            goto L5c
        L8:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r5.getRuntime()
            if (r6 == 0) goto L16
            boolean r0 = r6.M0()
            r1 = 1
            if (r0 != r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            java.lang.String r0 = "JsApiCloseDirectGameCoverViewContainer"
            if (r1 != 0) goto L4f
            java.lang.String r6 = "invoke: not direct game"
            com.tencent.mars.xlog.Log.e(r0, r6)
            r6 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L29
            java.lang.String r6 = "fail:internal error"
        L29:
            if (r6 != 0) goto L2d
            java.lang.String r6 = ""
        L2d:
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "errno"
            r2 = 4
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L3b
            goto L47
        L3b:
            r1 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "MicroMsg.AppBrandJsApi"
            java.lang.String r3 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.mars.xlog.Log.e(r2, r3, r1)
        L47:
            java.lang.String r6 = r4.u(r6, r0)
            r5.a(r7, r6)
            goto L5c
        L4f:
            java.lang.String r1 = "invoke"
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.a5 r0 = new com.tencent.mm.plugin.appbrand.jsapi.a5
            r0.<init>(r6, r5, r7, r4)
            r6.m(r0)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.b5.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
