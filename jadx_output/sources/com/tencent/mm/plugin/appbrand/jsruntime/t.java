package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public interface t extends com.tencent.mm.plugin.appbrand.jsruntime.c0 {
    void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback);

    void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback);

    void addJavascriptInterface(java.lang.Object obj, java.lang.String str);

    void destroy();

    com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls);

    void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar);
}
