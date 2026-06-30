package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class m9 implements android.webkit.DownloadListener {
    public m9(com.tencent.mm.plugin.appbrand.page.w9 w9Var) {
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "onDownloadStart called, url = %s, mimeType = %s, userAgent = %s", str, str4, str2);
    }
}
