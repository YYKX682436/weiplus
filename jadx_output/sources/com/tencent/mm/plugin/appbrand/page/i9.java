package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class i9 extends com.tencent.xweb.internal.ProxyWebViewClientExtension {
    public i9(com.tencent.mm.plugin.appbrand.page.w9 w9Var) {
    }

    @Override // com.tencent.xweb.internal.ProxyWebViewClientExtension
    public java.lang.Object onMiscCallBack(java.lang.String str, android.os.Bundle bundle) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && bundle != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "onMiscCallBack method = %s", str);
            if ("onJavascriptCloseWindow".equals(str)) {
                return java.lang.Boolean.TRUE;
            }
        }
        return null;
    }
}
