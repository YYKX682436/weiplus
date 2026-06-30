package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public class v implements al1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.w f83895a;

    public v(com.tencent.mm.plugin.appbrand.jsapi.webview.w wVar) {
        this.f83895a = wVar;
    }

    @Override // al1.a
    public void a(android.view.View view) {
        of1.w1 s37 = this.f83895a.f83896d.s3();
        if (s37 != null) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = s37.f345045s;
            mMWebView.getView().scrollTo(mMWebView.getScrollX(), 0);
        }
    }
}
