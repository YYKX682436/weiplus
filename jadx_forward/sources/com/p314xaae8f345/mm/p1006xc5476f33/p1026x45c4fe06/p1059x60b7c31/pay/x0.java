package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class x0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34660x366c91de = 1491;

    /* renamed from: NAME */
    public static final java.lang.String f34661x24728b = "reportCrossPlatformPay";

    public static final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, java.lang.String str) {
        x0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportCrossPlatformPay", str + " stopListen");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12206x7db0674f("stopListen", str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s2.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.w0.f164227d);
        java.util.Map l17 = kz5.c1.l(new jz5.l("cmdId", "clientDidStopReportSessionId"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.q0();
        q0Var.t(l17);
        d0Var.p(q0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r7, org.json.JSONObject r8, int r9) {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.jsapi.d0 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) r7
            if (r7 != 0) goto L6
            goto L8a
        L6:
            if (r8 != 0) goto La
            goto L8a
        La:
            java.lang.String r0 = "type"
            boolean r1 = r8.has(r0)     // Catch: java.lang.Exception -> L1d
            r2 = 1
            if (r1 != r2) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L29
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Exception -> L1d
            goto L2a
        L1d:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "safeGetString"
            java.lang.String r2 = ""
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r2, r0)
        L29:
            r0 = 0
        L2a:
            if (r0 != 0) goto L2e
            java.lang.String r0 = "1"
        L2e:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "JsApiReportCrossPlatformPay data:"
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = " uuid:"
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            java.lang.String r2 = "MicroMsg.JsApiReportCrossPlatformPay"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r8 = r7.t3()
            java.lang.String r2 = "getRuntime(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r2)
            com.tencent.mm.plugin.appbrand.jsapi.pay.v0 r2 = new com.tencent.mm.plugin.appbrand.jsapi.pay.v0
            r2.<init>(r1, r6, r7)
            cf.m r3 = new cf.m
            java.lang.String r4 = r8.f156336n
            java.lang.String r5 = "getAppId(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            r3.<init>(r4)
            r2.mo146xb9724478(r3)
            u81.h r8 = r8.N
            r8.a(r3)
            java.lang.String r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a
            com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayParameter r2 = new com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayParameter
            r2.<init>(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.pay.r0 r0 = new com.tencent.mm.plugin.appbrand.jsapi.pay.r0
            r0.<init>(r7, r9, r6)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.pay.s2> r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s2.class
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(r8, r2, r7, r0)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x0.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
