package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33377x366c91de = 749;

    /* renamed from: NAME */
    public static final java.lang.String f33378x24728b = "closeSplashAd";

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r11, org.json.JSONObject r12, int r13) {
        /*
            r10 = this;
            com.tencent.mm.plugin.appbrand.service.c0 r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) r11
            java.lang.String r0 = "source"
            java.lang.String r1 = ""
            java.lang.String r0 = r12.optString(r0, r1)
            java.lang.String r1 = "animated"
            r2 = 1
            boolean r1 = r12.optBoolean(r1, r2)
            java.lang.String r2 = "closeType"
            r3 = 0
            int r2 = r12.optInt(r2, r3)
            java.lang.String r3 = "animConfig"
            org.json.JSONObject r12 = r12.optJSONObject(r3)
            java.lang.String r3 = "MicroMsg.AppBrand.JsApiCloseSplashAd[AppBrandSplashAd]"
            if (r12 == 0) goto L76
            java.lang.String r4 = "animEndX"
            r5 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            double r7 = r12.optDouble(r4, r5)
            float r4 = (float) r7
            float r7 = ik1.w.f()
            float r4 = r4 * r7
            java.lang.String r7 = "animEndY"
            double r7 = r12.optDouble(r7, r5)
            float r7 = (float) r7
            float r8 = ik1.w.f()
            float r7 = r7 * r8
            java.lang.String r8 = "animEndHeight"
            double r8 = r12.optDouble(r8, r5)
            float r12 = (float) r8
            float r8 = ik1.w.f()
            float r12 = r12 * r8
            double r8 = (double) r4
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L61
            double r8 = (double) r7
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L61
            double r8 = (double) r12
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 == 0) goto L61
            com.tencent.mm.plugin.appbrand.ui.yc r5 = new com.tencent.mm.plugin.appbrand.ui.yc
            r5.<init>(r4, r7, r12)
            goto L77
        L61:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Float r5 = java.lang.Float.valueOf(r7)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r4, r5, r12}
            java.lang.String r4 = "hy: has animConfig but value invalid: %f, %f, %f"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4, r12)
        L76:
            r5 = 0
        L77:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r12 = new java.lang.Object[]{r0, r12, r4}
            java.lang.String r4 = "closeSplashAd, source:%s, animated:%s, closeType: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r12)
            java.lang.String r12 = "launch"
            boolean r12 = r12.equalsIgnoreCase(r0)
            if (r12 == 0) goto La2
            com.tencent.mm.plugin.appbrand.o6 r12 = r11.t3()
            i81.b0 r12 = r12.A2
            if (r12 == 0) goto Lba
            com.tencent.mm.plugin.appbrand.o6 r12 = r11.t3()
            i81.b0 r12 = r12.A2
            r12.c(r1, r0, r2, r5)
            goto Lba
        La2:
            java.lang.String r12 = "menu"
            boolean r12 = r12.equalsIgnoreCase(r0)
            if (r12 == 0) goto Lba
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandCloseAppBrandAdUIEvent r12 = new com.tencent.mm.plugin.appbrand.ad.ui.AppBrandCloseAppBrandAdUIEvent
            r12.<init>()
            com.tencent.mm.plugin.appbrand.ad.ui.k r0 = r12.f156469g
            java.lang.String r1 = r11.mo48798x74292566()
            r0.f156484a = r1
            r12.e()
        Lba:
            java.lang.String r12 = "ok"
            java.lang.String r12 = r10.o(r12)
            r11.a(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.d.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
