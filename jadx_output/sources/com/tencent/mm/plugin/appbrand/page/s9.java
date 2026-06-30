package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class s9 implements android.webkit.WebChromeClient.CustomViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.WebChromeClient.CustomViewCallback f87085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.t9 f87086b;

    public s9(com.tencent.mm.plugin.appbrand.page.t9 t9Var, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        this.f87086b = t9Var;
        this.f87085a = customViewCallback;
    }

    @Override // android.webkit.WebChromeClient.CustomViewCallback
    public void onCustomViewHidden() {
        com.tencent.mm.plugin.appbrand.page.t9 t9Var = this.f87086b;
        if (t9Var.f87122a.s()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebView", "WebChromeClient leaveFullscreen");
            t9Var.f87122a.m();
        }
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f87085a;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
    }
}
