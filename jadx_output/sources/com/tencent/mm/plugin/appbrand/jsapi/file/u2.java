package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes8.dex */
public class u2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a f81133a;

    public u2(com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar) {
        this.f81133a = aVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity activityContext;
        boolean isProcessTerminated;
        com.tencent.mm.ui.MMActivity activityContext2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.webkit.ValueCallback valueCallback;
        uh0.v G;
        java.lang.String str5;
        boolean z17;
        java.lang.String str6 = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenFileRequest", "openReadFile, receiveValue = %s", str6);
        boolean equals = "query for feature_wx_float_window successfully".equals(str6);
        com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar = this.f81133a;
        if (equals) {
            if (aVar.getAppBrandTaskProxyUI() != null) {
                aVar.getAppBrandTaskProxyUI().f78377y = true;
                uh0.s sVar = (uh0.s) i95.n0.c(uh0.s.class);
                boolean s17 = aVar.getAppBrandTaskProxyUI().f78369q.s();
                activityContext2 = aVar.getActivityContext();
                str = aVar.f81026e;
                str2 = aVar.f81027f;
                str3 = aVar.f81028g;
                str4 = aVar.f81029h;
                valueCallback = aVar.f81032n;
                G = aVar.G(true);
                str5 = aVar.f81025d;
                z17 = aVar.f81030i;
                ((th0.w) sVar).Ai(s17, false, false, true, activityContext2, str, str2, str3, str4, 10, valueCallback, G, true, str5, z17);
                return;
            }
            return;
        }
        if ("xwebFileReaderReachEnd".equals(str6) || "xwebFileReaderUserOperated".equals(str6)) {
            return;
        }
        if ("fileReaderClosed".equals(str6)) {
            isProcessTerminated = aVar.isProcessTerminated();
            if (!isProcessTerminated) {
                if (aVar.getAppBrandTaskProxyUI() == null) {
                    aVar.finishProcess(null);
                    return;
                } else if (aVar.getAppBrandTaskProxyUI().f78376x) {
                    aVar.finishProcess(null);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenFileRequest", "opCallback isFinishCurPage:%s", java.lang.Boolean.valueOf(aVar.getAppBrandTaskProxyUI().f78376x));
                    aVar.getAppBrandTaskProxyUI().f78376x = true;
                    return;
                }
            }
        }
        if ("fileReaderMenuClicked".equals(str6)) {
            activityContext = aVar.getActivityContext();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activityContext, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.appbrand.jsapi.file.r2(this);
            k0Var.f211881s = new com.tencent.mm.plugin.appbrand.jsapi.file.t2(this);
            k0Var.v();
        }
    }
}
