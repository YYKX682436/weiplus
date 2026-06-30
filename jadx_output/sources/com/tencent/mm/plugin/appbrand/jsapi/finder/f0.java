package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class f0 extends com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.w {
    public static final int CTRL_INDEX = 1149;
    public static final java.lang.String NAME = "navigateToMiniProgramForFinderProductShare";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s
    public void D(com.tencent.mm.plugin.appbrand.config.l builder, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(builder, "builder");
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("uiParam");
        if (optJSONObject == null) {
            optJSONObject = data.optJSONObject("halfPage");
        }
        kotlin.jvm.internal.o.d(optJSONObject);
        if (!optJSONObject.has("width")) {
            builder.f77523c = -1;
        }
        if (!optJSONObject.has("height")) {
            builder.f77522b = -1;
            builder.f77539s = false;
        }
        java.lang.String valueOf = java.lang.String.valueOf(data.hashCode());
        builder.f77534n = true;
        builder.f77541u = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig(true, valueOf);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.w, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s
    public com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g E(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject optJSONObject;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g E = super.E(yVar, jSONObject, i17);
        if (yVar == null) {
            return E;
        }
        org.json.JSONObject optJSONObject2 = (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) == null) ? null : optJSONObject.optJSONObject("shareProductItem");
        if (optJSONObject2 == null) {
            return E;
        }
        java.lang.String valueOf = java.lang.String.valueOf(jSONObject.hashCode());
        r45.br2 br2Var = new r45.br2();
        br2Var.set(5, optJSONObject2.optString("appId"));
        br2Var.set(6, optJSONObject2.optString("pagePath"));
        br2Var.set(1, optJSONObject2.optString("finderUsername"));
        br2Var.set(7, optJSONObject2.optString("productId"));
        br2Var.set(8, optJSONObject2.optString("coverUrl"));
        br2Var.set(10, java.lang.Integer.valueOf(optJSONObject2.optInt("marketPrice")));
        br2Var.set(11, java.lang.Integer.valueOf(optJSONObject2.optInt("sellingPrice")));
        br2Var.set(13, optJSONObject2.optString("platformName"));
        br2Var.set(17, optJSONObject2.optString("ecSource"));
        br2Var.set(18, optJSONObject2.optString("sellingPriceWording"));
        return new com.tencent.mm.plugin.appbrand.jsapi.finder.e0(E, yVar, valueOf, br2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r6 != null && r6.has("uiParam")) != false) goto L15;
     */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s, com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.y r5, org.json.JSONObject r6, int r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "invoke data:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ",callbackId:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.JsApiNavigateToMiniProgramForFinderProductShare"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.String r0 = "halfPage"
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L29
            boolean r3 = r6.has(r0)
            if (r3 != r1) goto L29
            r3 = r1
            goto L2a
        L29:
            r3 = r2
        L2a:
            if (r3 != 0) goto L3b
            if (r6 == 0) goto L38
            java.lang.String r3 = "uiParam"
            boolean r3 = r6.has(r3)
            if (r3 != r1) goto L38
            goto L39
        L38:
            r1 = r2
        L39:
            if (r1 == 0) goto L40
        L3b:
            java.lang.String r1 = "mode"
            r6.put(r1, r0)
        L40:
            super.A(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.finder.f0.A(com.tencent.mm.plugin.appbrand.y, org.json.JSONObject, int):void");
    }
}
