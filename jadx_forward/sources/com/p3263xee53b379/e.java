package com.p3263xee53b379;

/* loaded from: classes8.dex */
public final class e extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.b f302246a;

    public e(com.p3263xee53b379.b bVar, byte b17) {
        this.f302246a = bVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        "shouldOverrideUrlLoading：".concat(java.lang.String.valueOf(str));
        com.p3263xee53b379.b bVar = this.f302246a;
        if (bVar.f302237h && !android.text.TextUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith("HTTP")) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(android.net.Uri.parse(str));
                android.app.Activity activity = bVar.f302234e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/unionpay/ac", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/unionpay/ac", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } catch (java.lang.Exception unused) {
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
