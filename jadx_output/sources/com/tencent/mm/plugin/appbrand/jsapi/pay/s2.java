package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/s2;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/jsapi/pay/JsApiReportCrossPlatformPayParameter;", "Lcom/tencent/mm/plugin/appbrand/jsapi/pay/JsApiReportCrossPlatformPayResponse;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class s2 implements com.tencent.mm.ipcinvoker.j {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r4 == null) goto L17;
     */
    @Override // com.tencent.mm.ipcinvoker.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.Object r7, com.tencent.mm.ipcinvoker.r r8) {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayParameter r7 = (com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayParameter) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ReportCrossPlatformPayTask data:"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.JsApiReportCrossPlatformPay"
            com.tencent.mars.xlog.Log.i(r1, r0)
            com.tencent.kinda.gen.KindaGlobalReporter r0 = com.tencent.kinda.gen.KindaGlobalReporter.createReporter()
            java.lang.String r2 = ""
            if (r0 != 0) goto L2e
            java.lang.String r7 = "reporter is null"
            com.tencent.mars.xlog.Log.e(r1, r7)
            if (r8 == 0) goto Lc6
            com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse r7 = new com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse
            r7.<init>(r2)
            r8.a(r7)
            goto Lc6
        L2e:
            java.lang.Class<h45.q> r3 = h45.q.class
            i95.m r4 = i95.n0.c(r3)
            h45.q r4 = (h45.q) r4
            java.lang.String r4 = r4.getKindaLiteUseCaseSessionId()
            if (r4 == 0) goto L4b
            int r5 = r4.length()
            if (r5 <= 0) goto L44
            r5 = 1
            goto L45
        L44:
            r5 = 0
        L45:
            if (r5 == 0) goto L48
            goto L49
        L48:
            r4 = 0
        L49:
            if (r4 != 0) goto L4f
        L4b:
            java.lang.String r4 = r0.getCppSessionId()
        L4f:
            if (r4 != 0) goto L61
            java.lang.String r7 = "reporter.cppSessionId is null"
            com.tencent.mars.xlog.Log.e(r1, r7)
            if (r8 == 0) goto Lc6
            com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse r7 = new com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse
            r7.<init>(r2)
            r8.a(r7)
            goto Lc6
        L61:
            if (r7 != 0) goto L73
            java.lang.String r7 = "data is null"
            com.tencent.mars.xlog.Log.e(r1, r7)
            if (r8 == 0) goto Lc6
            com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse r7 = new com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse
            r7.<init>(r4)
            r8.a(r7)
            goto Lc6
        L73:
            java.lang.String r0 = "stopListen"
            java.lang.String r2 = r7.f82551d
            boolean r0 = kotlin.jvm.internal.o.b(r2, r0)
            java.lang.String r7 = r7.f82552e
            if (r0 == 0) goto L9c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "task stopListen "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.i(r1, r8)
            i95.m r8 = i95.n0.c(r3)
            h45.q r8 = (h45.q) r8
            r8.stopListen(r7)
            goto Lc6
        L9c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "task startListen "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r8 == 0) goto Lb8
            com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse r0 = new com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse
            r0.<init>(r4)
            r8.a(r0)
        Lb8:
            i95.m r0 = i95.n0.c(r3)
            h45.q r0 = (h45.q) r0
            com.tencent.mm.plugin.appbrand.jsapi.pay.r2 r1 = new com.tencent.mm.plugin.appbrand.jsapi.pay.r2
            r1.<init>(r8)
            r0.startListen(r7, r1)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.pay.s2.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
