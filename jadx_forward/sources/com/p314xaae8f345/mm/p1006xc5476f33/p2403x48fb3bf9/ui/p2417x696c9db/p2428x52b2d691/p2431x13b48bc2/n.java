package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/wechatpay/n;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/wechatpay/JsApiReportCrossPlatformPayParameter;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/wechatpay/JsApiReportCrossPlatformPayResponse;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r4 == null) goto L17;
     */
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8834xb9724478(java.lang.Object r7, com.p314xaae8f345.mm.p794xb0fa9b5e.r r8) {
        /*
            r6 = this;
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayParameter r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.C19476x7db0674f) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ReportCrossPlatformPayTask data:"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.JsApiReportCrossPlatformPay"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            com.tencent.kinda.gen.KindaGlobalReporter r0 = com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31.m28230x1d892dfd()
            java.lang.String r2 = ""
            if (r0 != 0) goto L2f
            java.lang.String r7 = "reporter is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r7)
            if (r8 == 0) goto Lc8
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse r7 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse
            r7.<init>(r2)
            r8.a(r7)
            goto Lc8
        L2f:
            java.lang.Class<h45.q> r3 = h45.q.class
            i95.m r4 = i95.n0.c(r3)
            h45.q r4 = (h45.q) r4
            java.lang.String r4 = r4.mo24765x3b648fbf()
            if (r4 == 0) goto L4c
            int r5 = r4.length()
            if (r5 <= 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = 0
        L46:
            if (r5 == 0) goto L49
            goto L4a
        L49:
            r4 = 0
        L4a:
            if (r4 != 0) goto L50
        L4c:
            java.lang.String r4 = r0.mo28231xfa819664()
        L50:
            if (r4 != 0) goto L63
            java.lang.String r7 = "reporter.cppSessionId is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r7)
            if (r8 == 0) goto Lc8
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse r7 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse
            r7.<init>(r2)
            r8.a(r7)
            goto Lc8
        L63:
            if (r7 != 0) goto L75
            java.lang.String r7 = "data is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r7)
            if (r8 == 0) goto Lc8
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse r7 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse
            r7.<init>(r4)
            r8.a(r7)
            goto Lc8
        L75:
            java.lang.String r0 = "stopListen"
            java.lang.String r2 = r7.f268150d
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r0)
            java.lang.String r7 = r7.f268151e
            if (r0 == 0) goto L9e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "task stopListen: "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r8)
            i95.m r8 = i95.n0.c(r3)
            h45.q r8 = (h45.q) r8
            r8.mo24850xa30a7869(r7)
            goto Lc8
        L9e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "task startListen: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r8 == 0) goto Lba
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse r0 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse
            r0.<init>(r4)
            r8.a(r0)
        Lba:
            i95.m r0 = i95.n0.c(r3)
            h45.q r0 = (h45.q) r0
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.m r1 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.m
            r1.<init>(r8)
            r0.mo24811x84386cc9(r7, r1)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.n.mo8834xb9724478(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
