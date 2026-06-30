package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public final class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.w {

    /* renamed from: CTRL_INDEX */
    public static final int f34288x366c91de = 1149;

    /* renamed from: NAME */
    public static final java.lang.String f34289x24728b = "navigateToMiniProgramForFinderProductShare";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.s
    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l builder, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("uiParam");
        if (optJSONObject == null) {
            optJSONObject = data.optJSONObject("halfPage");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optJSONObject);
        if (!optJSONObject.has("width")) {
            builder.f159056c = -1;
        }
        if (!optJSONObject.has("height")) {
            builder.f159055b = -1;
            builder.f159072s = false;
        }
        java.lang.String valueOf = java.lang.String.valueOf(data.hashCode());
        builder.f159067n = true;
        builder.f159074u = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig(true, valueOf);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.w, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.s
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject optJSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g E = super.E(yVar, jSONObject, i17);
        if (yVar == null) {
            return E;
        }
        org.json.JSONObject optJSONObject2 = (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) == null) ? null : optJSONObject.optJSONObject("shareProductItem");
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
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.e0(E, yVar, valueOf, br2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r6 != null && r6.has("uiParam")) != false) goto L15;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.s, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y r5, org.json.JSONObject r6, int r7) {
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f0.A(com.tencent.mm.plugin.appbrand.y, org.json.JSONObject, int):void");
    }
}
