package vx5;

/* loaded from: classes13.dex */
public class d0 extends com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f522866a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f522867b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f522868c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx5.i0 f522869d;

    public d0(vx5.i0 i0Var) {
        this.f522869d = i0Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: doUpdateVisitedHistory */
    public void mo120435x8268445e(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, boolean z17) {
        if (str != null && str.startsWith("data:text/html;charset=utf-8")) {
            by5.c4.g("PinusWebView", "doUpdateVisitedHistory, ignore");
            return;
        }
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.k(i0Var.f522886d, str, z17);
        } else {
            super.mo120435x8268445e(c27847xac2547f9, str, z17);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onLoadResource */
    public void mo120437xad733293(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.l(i0Var.f522886d, str);
        } else {
            super.mo120437xad733293(c27847xac2547f9, str);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onPageCommitVisible */
    public void mo120438x20cd5ccd(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
        by5.c4.f("PinusWebView", "onPageCommitVisible, webview:" + c27847xac2547f9.hashCode() + ", url:" + str);
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.m(i0Var.f522886d, str);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onPageFinished */
    public void mo120439xe1e213a0(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
        java.lang.String str2 = this.f522867b;
        if (str2 != null && str2.equals(str)) {
            by5.c4.f("PinusWebView", "onPageFinished abandoned, url:" + str);
            return;
        }
        by5.c4.f("PinusWebView", "onPageFinished, webview:" + c27847xac2547f9.hashCode() + ", url:" + str);
        vx5.i0 i0Var = this.f522869d;
        sx5.a aVar = i0Var.f522900u;
        if (aVar != null) {
            aVar.g(false, i0Var.f522886d.mo120146xc46191fe() == com.p314xaae8f345.p3210x3857dc.c1.HOOK_EVALUTE_JS);
        }
        this.f522867b = str;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.n(i0Var.f522886d, str);
        } else {
            super.mo120439xe1e213a0(c27847xac2547f9, str);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - i0Var.f522894o;
        by5.s0.n(currentTimeMillis);
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null && currentTimeMillis > 0 && currentTimeMillis < 300000) {
            n1Var.a(nd1.a2.f72909x366c91de, nd1.a2.f72909x366c91de, 6, 7, 1, (int) currentTimeMillis);
        }
        xx5.j.a(by5.s0.c(str), this.f522868c, 1, 0, (int) currentTimeMillis, i0Var.f522897r, str, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS, "");
        i0Var.f522894o = java.lang.System.currentTimeMillis();
        i0Var.f522886d.m120144xf39d54e2().h();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onPageStarted */
    public void mo120440x65f3cf93(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        by5.c4.f("PinusWebView", "onPageStarted, webview:" + c27847xac2547f9.hashCode() + ", url:" + str);
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.o(i0Var.f522886d, str, bitmap);
        } else {
            super.mo120440x65f3cf93(c27847xac2547f9, str, bitmap);
        }
        this.f522867b = null;
        this.f522868c = by5.s0.a();
        java.lang.String str2 = this.f522866a;
        if (str2 != null && str != null && !str.equals(str2) && by5.s0.c(str) != by5.s0.c(this.f522866a)) {
            if (by5.s0.c(this.f522866a) == 1 && by5.s0.c(str) == 2) {
                i0Var.f522897r = 1;
            } else if (by5.s0.c(this.f522866a) == 2 && by5.s0.c(str) == 1) {
                i0Var.f522897r = 2;
            }
        }
        this.f522866a = str;
        i0Var.f522894o = java.lang.System.currentTimeMillis();
        by5.s0.m(str);
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            n1Var.b(577L, 4L, 1L);
        }
        xx5.j.a(by5.s0.c(str), this.f522868c, 0, 0, 0, i0Var.f522897r, str, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS, "");
        sx5.a aVar = i0Var.f522900u;
        if (aVar != null) {
            aVar.g(true, i0Var.f522886d.mo120146xc46191fe() == com.p314xaae8f345.p3210x3857dc.c1.HOOK_EVALUTE_JS);
        }
        i0Var.f522901v.getClass();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onReceivedError */
    public void mo120442xa740e108(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        by5.c4.f("PinusWebView", "onReceivedError, webview:" + c27847xac2547f9.hashCode() + ", errorCode:" + i17 + ", desc:" + str + ", url:" + str2);
        vx5.i0 i0Var = this.f522869d;
        i0Var.f522895p = true;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = i0Var.f522886d;
        if (h1Var != null) {
            h1Var.p(c27816xac2547f9, i17, str, str2);
        } else {
            super.mo120442xa740e108(c27847xac2547f9, i17, str, str2);
        }
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            n1Var.b(577L, 1L, 1L);
        }
        com.p314xaae8f345.p3210x3857dc.n1 n1Var2 = by5.s0.f118128c;
        if (n1Var2 != null) {
            n1Var2.b(577L, 5L, 1L);
        }
        xx5.j.a(by5.s0.c(str2), this.f522868c, 1, i17, (int) (java.lang.System.currentTimeMillis() - i0Var.f522894o), i0Var.f522897r, str2, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS, str);
        com.p314xaae8f345.p3210x3857dc.h1 h1Var2 = i0Var.f522890h;
        if (h1Var2 == null || !h1Var2.w(c27816xac2547f9, i17, str, str2)) {
            i0Var.f522888f.mo120366x9b341568("file:///android_asset/", by5.y3.a(c27816xac2547f9.getContext(), i17, str, str2), "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, null);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onReceivedHttpAuthRequest */
    public void mo120444x2255491f(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.g gVar, java.lang.String str, java.lang.String str2) {
        by5.c4.f("PinusWebView", "onReceivedHttpAuthRequest, host:" + str + ", realm:" + str2);
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.r(i0Var.f522886d, new vx5.p(gVar), str, str2);
        } else {
            super.mo120444x2255491f(c27847xac2547f9, gVar, str, str2);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onReceivedHttpError */
    public void mo120445x60257d60(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        by5.c4.f("PinusWebView", "onReceivedHttpError, webview:" + c27847xac2547f9.hashCode() + ", errorCode:" + java.lang.String.valueOf(webResourceResponse.getStatusCode()));
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.s(i0Var.f522886d, new vx5.t(webResourceRequest), webResourceResponse == null ? null : new com.p314xaae8f345.p3210x3857dc.y0(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), webResourceResponse.getData()));
        } else {
            super.mo120445x60257d60(c27847xac2547f9, webResourceRequest, webResourceResponse);
        }
        if (webResourceRequest.isForMainFrame()) {
            mo120439xe1e213a0(c27847xac2547f9, webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : "");
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onReceivedSslError */
    public void mo120447x4db69c5c(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.q qVar, android.net.http.SslError sslError) {
        by5.c4.f("PinusWebView", "onReceivedSslError, webview:" + c27847xac2547f9.hashCode() + ", error:" + sslError.getPrimaryError());
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.t(i0Var.f522886d, new vx5.s(qVar), sslError);
        } else {
            super.mo120447x4db69c5c(c27847xac2547f9, qVar, sslError);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onRenderProcessGone */
    public boolean mo120448x45b2bc19(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, com.p314xaae8f345.p3210x3857dc.j0 j0Var) {
        by5.c4.f("PinusWebView", "onRenderProcessGone, webview:" + c27847xac2547f9.hashCode() + ", didCrash:" + j0Var.a() + ", rendererPriorityAtExit:" + j0Var.b());
        boolean a17 = j0Var.a();
        int b17 = j0Var.b();
        java.lang.String str = "";
        int i17 = 0;
        try {
            java.lang.String mo120358xb5887639 = c27847xac2547f9.mo120358xb5887639();
            if (mo120358xb5887639 != null) {
                str = java.net.URLEncoder.encode(mo120358xb5887639, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            }
            android.content.Context context = c27847xac2547f9.getContext();
            if (context instanceof android.content.MutableContextWrapper) {
                context = ((android.content.MutableContextWrapper) context).getBaseContext();
            }
            if (context != null) {
                i17 = context instanceof android.app.Activity ? 1 : 2;
            }
        } catch (java.lang.Exception e17) {
            by5.c4.d("KVReportForRenderProcessGone", "report, error", e17);
        }
        java.lang.String str2 = i17 + "," + (a17 ? 1 : 0) + "," + b17 + "," + str + ",20260502," + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
        by5.c4.f("KVReportForRenderProcessGone", "report:" + str2);
        by5.s0.t(26011, str2);
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        return h1Var != null ? h1Var.u(i0Var.f522886d, new vx5.c0(this, j0Var)) : super.mo120448x45b2bc19(c27847xac2547f9, j0Var);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onScaleChanged */
    public void mo120450x264e5589(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, float f17, float f18) {
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.v(i0Var.f522886d, f17, f18);
        } else {
            super.mo120450x264e5589(c27847xac2547f9, f17, f18);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: shouldInterceptRequest */
    public android.webkit.WebResourceResponse mo120454xc23eff40(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.WebResourceRequest webResourceRequest) {
        vx5.i0 i0Var = this.f522869d;
        if (i0Var.f522890h != null) {
            vx5.t tVar = new vx5.t(webResourceRequest);
            com.p314xaae8f345.p3210x3857dc.v0 v0Var = tVar.f522927f;
            android.os.Bundle a17 = v0Var == null ? null : v0Var.a();
            com.p314xaae8f345.p3210x3857dc.y0 y17 = a17 != null ? i0Var.f522890h.y(i0Var.f522886d, tVar, a17) : null;
            if (y17 == null) {
                y17 = i0Var.f522890h.x(i0Var.f522886d, tVar);
            }
            if (y17 == null) {
                y17 = i0Var.f522890h.z(i0Var.f522886d, webResourceRequest.getUrl().toString());
            }
            return vx5.u.a(y17);
        }
        return super.mo120454xc23eff40(c27847xac2547f9, webResourceRequest);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: shouldOverrideUrlLoading */
    public boolean mo120457xec6a1ccc(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.WebResourceRequest webResourceRequest) {
        vx5.i0 i0Var = this.f522869d;
        if (i0Var.f522886d.m120144xf39d54e2().i(webResourceRequest.getUrl().toString())) {
            return true;
        }
        if (i0Var.f522890h != null) {
            boolean A = i0Var.f522890h.A(i0Var.f522886d, new vx5.t(webResourceRequest));
            by5.c4.f("PinusWebView", "shouldOverrideUrlLoading, ret:" + A + ", url:" + webResourceRequest.getUrl().toString());
            return A;
        }
        return super.mo120457xec6a1ccc(c27847xac2547f9, webResourceRequest);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: shouldOverrideUrlLoading */
    public boolean mo120458xec6a1ccc(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
        vx5.i0 i0Var = this.f522869d;
        if (i0Var.f522886d.m120144xf39d54e2().i(str)) {
            return true;
        }
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            boolean B = h1Var.B(i0Var.f522886d, str);
            by5.c4.f("PinusWebView", "shouldOverrideUrlLoading, ret:" + B + ", url:" + str);
            return B;
        }
        return super.mo120458xec6a1ccc(c27847xac2547f9, str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: shouldInterceptRequest */
    public android.webkit.WebResourceResponse mo120455xc23eff40(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            return vx5.u.a(h1Var.z(i0Var.f522886d, str));
        }
        return super.mo120455xc23eff40(c27847xac2547f9, str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27848x33b8924
    /* renamed from: onReceivedError */
    public void mo120443xa740e108(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.WebResourceRequest webResourceRequest, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.s sVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedError, webview:");
        sb6.append(c27847xac2547f9.hashCode());
        sb6.append(", errorCode:");
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.t tVar = (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.t) sVar;
        sb6.append(tVar.b());
        sb6.append(", desc:");
        sb6.append((java.lang.Object) tVar.a());
        sb6.append(", url:");
        sb6.append(webResourceRequest.getUrl());
        by5.c4.f("PinusWebView", sb6.toString());
        vx5.i0 i0Var = this.f522869d;
        com.p314xaae8f345.p3210x3857dc.h1 h1Var = i0Var.f522890h;
        if (h1Var != null) {
            h1Var.q(i0Var.f522886d, new vx5.t(webResourceRequest), new vx5.n(tVar));
        } else {
            super.mo120443xa740e108(c27847xac2547f9, webResourceRequest, tVar);
        }
    }
}
