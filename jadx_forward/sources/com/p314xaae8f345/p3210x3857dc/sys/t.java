package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class t extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f302104a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.sys.v f302105b;

    public t(com.p314xaae8f345.p3210x3857dc.sys.v vVar) {
        this.f302105b = vVar;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.k(vVar.f302108d, str, z17);
        } else {
            super.doUpdateVisitedHistory(webView, str, z17);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.l(vVar.f302108d, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        by5.c4.f("SysWebView", "onPageCommitVisible s = " + str);
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.m(vVar.f302108d, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        by5.c4.f("SysWebView", "onPageFinished " + str);
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        sx5.a aVar = vVar.f302116o;
        if (aVar != null) {
            aVar.g(false, vVar.f302108d.mo120146xc46191fe() == com.p314xaae8f345.p3210x3857dc.c1.HOOK_EVALUTE_JS);
        }
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.n(vVar.f302108d, str);
        } else {
            super.onPageFinished(webView, str);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - vVar.f302114m;
        by5.s0.n(currentTimeMillis);
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null && currentTimeMillis > 0 && currentTimeMillis < 300000) {
            n1Var.a(nd1.a2.f72909x366c91de, nd1.a2.f72909x366c91de, 48, 49, 1, (int) currentTimeMillis);
        }
        xx5.j.a(by5.s0.c(str), null, 1, 0, (int) currentTimeMillis, vVar.f302115n, str, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS, "");
        vVar.f302114m = java.lang.System.currentTimeMillis();
        vVar.f302108d.m120144xf39d54e2().h();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        by5.c4.f("SysWebView", "onPageStarted " + str);
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.o(vVar.f302108d, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
        java.lang.String str2 = this.f302104a;
        if (str2 != null && str != null && !str.equals(str2) && by5.s0.c(str) != by5.s0.c(this.f302104a)) {
            if (by5.s0.c(this.f302104a) == 1 && by5.s0.c(str) == 2) {
                vVar.f302115n = 1;
            } else if (by5.s0.c(this.f302104a) == 2 && by5.s0.c(str) == 1) {
                vVar.f302115n = 2;
            }
        }
        this.f302104a = str;
        vVar.f302114m = java.lang.System.currentTimeMillis();
        by5.s0.m(str);
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            n1Var.b(577L, 46L, 1L);
        }
        xx5.j.a(by5.s0.c(str), null, 0, 0, 0, vVar.f302115n, str, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS, "");
        sx5.a aVar = vVar.f302116o;
        if (aVar != null) {
            aVar.g(true, vVar.f302108d.mo120146xc46191fe() == com.p314xaae8f345.p3210x3857dc.c1.HOOK_EVALUTE_JS);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.p(vVar.f302108d, i17, str, str2);
        } else {
            super.onReceivedError(webView, i17, str, str2);
        }
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            n1Var.b(577L, 1L, 1L);
        }
        com.p314xaae8f345.p3210x3857dc.n1 n1Var2 = by5.s0.f118128c;
        if (n1Var2 != null) {
            n1Var2.b(577L, 47L, 1L);
        }
        xx5.j.a(by5.s0.c(str2), null, 1, i17, (int) (java.lang.System.currentTimeMillis() - vVar.f302114m), vVar.f302115n, str2, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
        by5.c4.f("SysWebView", "onReceivedHttpAuthRequest host:" + str + ", realm:" + str2);
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.r(vVar.f302108d, new com.p314xaae8f345.p3210x3857dc.sys.f(httpAuthHandler), str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        by5.c4.f("SysWebView", "onReceivedHttpError code:" + java.lang.String.valueOf(webResourceResponse.getStatusCode()));
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.s(vVar.f302108d, new com.p314xaae8f345.p3210x3857dc.sys.j(webResourceRequest), webResourceResponse == null ? null : new com.p314xaae8f345.p3210x3857dc.y0(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), webResourceResponse.getData()));
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        by5.c4.f("SysWebView", "onReceivedSslError " + sslError.getPrimaryError());
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.t(vVar.f302108d, new com.p314xaae8f345.p3210x3857dc.sys.e(sslErrorHandler), sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(android.webkit.WebView webView, float f17, float f18) {
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            h1Var.v(vVar.f302108d, f17, f18);
        } else {
            super.onScaleChanged(webView, f17, f18);
        }
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            com.p314xaae8f345.p3210x3857dc.sys.j jVar = new com.p314xaae8f345.p3210x3857dc.sys.j(webResourceRequest);
            com.p314xaae8f345.p3210x3857dc.v0 v0Var = jVar.f302094f;
            android.os.Bundle a17 = v0Var == null ? null : v0Var.a();
            com.p314xaae8f345.p3210x3857dc.y0 y17 = a17 != null ? h1Var.y(vVar.f302108d, jVar, a17) : null;
            if (y17 == null) {
                y17 = h1Var.x(vVar.f302108d, jVar);
            }
            return com.p314xaae8f345.p3210x3857dc.sys.k.a(y17);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        if (vVar.f302108d.m120144xf39d54e2().i(str)) {
            return true;
        }
        by5.c4.f("SysWebView", "shouldOverrideUrlLoading " + str);
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            boolean B = h1Var.B(vVar.f302108d, str);
            if (str == null || !str.toLowerCase(java.util.Locale.ROOT).startsWith("javascript")) {
                return B;
            }
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        by5.c4.f("SysWebView", "shouldOverrideUrlLoading " + webResourceRequest.getUrl().toString());
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            boolean A = h1Var.A(vVar.f302108d, new com.p314xaae8f345.p3210x3857dc.sys.j(webResourceRequest));
            android.net.Uri url = webResourceRequest.getUrl();
            java.lang.String scheme = url != null ? url.getScheme() : "";
            if (scheme == null || !scheme.toLowerCase(java.util.Locale.ROOT).startsWith("javascript")) {
                return A;
            }
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            return com.p314xaae8f345.p3210x3857dc.sys.k.a(h1Var.z(vVar.f302108d, str));
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        by5.c4.f("SysWebView", "onReceivedError2");
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302105b;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = vVar.f302110f;
        if (h1Var != null) {
            if (webResourceRequest.isForMainFrame() && webResourceError != null) {
                h1Var.p(vVar.f302108d, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
            }
            h1Var.q(vVar.f302108d, new com.p314xaae8f345.p3210x3857dc.sys.j(webResourceRequest), webResourceError != null ? new com.p314xaae8f345.p3210x3857dc.sys.d(webResourceError) : null);
        }
    }
}
