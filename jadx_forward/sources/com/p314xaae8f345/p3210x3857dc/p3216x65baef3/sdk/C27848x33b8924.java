package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* renamed from: com.tencent.xweb.pinus.sdk.WebViewClient */
/* loaded from: classes13.dex */
public class C27848x33b8924 {

    /* renamed from: ERROR_AUTHENTICATION */
    public static final int f61148x5b2a4daf = -4;

    /* renamed from: ERROR_BAD_URL */
    public static final int f61149xf4cf169e = -12;

    /* renamed from: ERROR_CONNECT */
    public static final int f61150x421e1d73 = -6;

    /* renamed from: ERROR_FAILED_SSL_HANDSHAKE */
    public static final int f61151x9b6cfeb9 = -11;

    /* renamed from: ERROR_FILE */
    public static final int f61152x802cbd73 = -13;

    /* renamed from: ERROR_FILE_NOT_FOUND */
    public static final int f61153xd81fe30a = -14;

    /* renamed from: ERROR_HOST_LOOKUP */
    public static final int f61154x4dcd1c1a = -2;

    /* renamed from: ERROR_IO */
    public static final int f61155x81dd6add = -7;

    /* renamed from: ERROR_PROXY_AUTHENTICATION */
    public static final int f61156x3ad1be80 = -5;

    /* renamed from: ERROR_REDIRECT_LOOP */
    public static final int f61157xac74f10 = -9;

    /* renamed from: ERROR_TIMEOUT */
    public static final int f61158xbb18f1ea = -8;

    /* renamed from: ERROR_TOO_MANY_REQUESTS */
    public static final int f61159x25f34342 = -15;

    /* renamed from: ERROR_UNKNOWN */
    public static final int f61160xf86f50d3 = -1;

    /* renamed from: ERROR_UNSAFE_RESOURCE */
    public static final int f61161x4a427230 = -16;

    /* renamed from: ERROR_UNSUPPORTED_AUTH_SCHEME */
    public static final int f61162x12b7679b = -3;

    /* renamed from: ERROR_UNSUPPORTED_SCHEME */
    public static final int f61163x175372c6 = -10;

    /* renamed from: SAFE_BROWSING_THREAT_BILLING */
    public static final int f61164x7ac170fc = 4;

    /* renamed from: SAFE_BROWSING_THREAT_MALWARE */
    public static final int f61165xb3041a56 = 1;

    /* renamed from: SAFE_BROWSING_THREAT_PHISHING */
    public static final int f61166x521a7c1b = 2;

    /* renamed from: SAFE_BROWSING_THREAT_UNKNOWN */
    public static final int f61167x7052facb = 0;

    /* renamed from: SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE */
    public static final int f61168xfc5046df = 3;

    /* renamed from: onReceivedError2 */
    private void m120432x40db402a(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.WebResourceRequest webResourceRequest, java.lang.Object obj) {
        mo120443xa740e108(c27847xac2547f9, webResourceRequest, new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.t(obj));
    }

    /* renamed from: onReceivedHttpAuthRequestInner */
    private void m120433xd5aef077(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        mo120444x2255491f(c27847xac2547f9, new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.h(obj), str, str2);
    }

    /* renamed from: onReceivedSslErrorInner */
    private void m120434xa9411b5a(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.Object obj, android.net.http.SslError sslError) {
        mo120447x4db69c5c(c27847xac2547f9, new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.r(obj), sslError);
    }

    /* renamed from: doUpdateVisitedHistory */
    public void mo120435x8268445e(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, boolean z17) {
    }

    /* renamed from: onFormResubmission */
    public void m120436x642974a2(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.os.Message message, android.os.Message message2) {
        message.sendToTarget();
    }

    /* renamed from: onLoadResource */
    public void mo120437xad733293(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
    }

    /* renamed from: onPageCommitVisible */
    public void mo120438x20cd5ccd(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
    }

    /* renamed from: onPageFinished */
    public void mo120439xe1e213a0(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
    }

    /* renamed from: onPageStarted */
    public void mo120440x65f3cf93(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
    }

    /* renamed from: onReceivedClientCertRequest */
    public void m120441x56409600(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }

    /* renamed from: onReceivedError */
    public void mo120442xa740e108(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
    }

    /* renamed from: onReceivedHttpAuthRequest */
    public void mo120444x2255491f(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.g gVar, java.lang.String str, java.lang.String str2) {
        ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.h) gVar).a();
    }

    /* renamed from: onReceivedHttpError */
    public void mo120445x60257d60(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
    }

    /* renamed from: onReceivedLoginRequest */
    public void m120446x5ba733e6(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }

    /* renamed from: onReceivedSslError */
    public void mo120447x4db69c5c(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.q qVar, android.net.http.SslError sslError) {
        ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.r) qVar).a();
    }

    /* renamed from: onRenderProcessGone */
    public boolean mo120448x45b2bc19(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, com.p314xaae8f345.p3210x3857dc.j0 j0Var) {
        return true;
    }

    /* renamed from: onRenderProcessGoneInner */
    public boolean m120449x778449bd(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, boolean z17, int i17) {
        return mo120448x45b2bc19(c27847xac2547f9, new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.c0(this, z17, i17));
    }

    /* renamed from: onScaleChanged */
    public void mo120450x264e5589(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, float f17, float f18) {
    }

    @java.lang.Deprecated
    /* renamed from: onTooManyRedirects */
    public void m120451xc370c383(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.os.Message message, android.os.Message message2) {
        message.sendToTarget();
    }

    /* renamed from: onUnhandledInputEvent */
    public void m120452x6c0dff74(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.view.InputEvent inputEvent) {
        if (inputEvent instanceof android.view.KeyEvent) {
            m120453x28fd5eff(c27847xac2547f9, (android.view.KeyEvent) inputEvent);
        }
    }

    /* renamed from: onUnhandledKeyEvent */
    public void m120453x28fd5eff(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.view.KeyEvent keyEvent) {
    }

    /* renamed from: shouldInterceptRequest */
    public android.webkit.WebResourceResponse mo120455xc23eff40(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
        return null;
    }

    /* renamed from: shouldOverrideKeyEvent */
    public boolean m120456x4f0b8f3a(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.view.KeyEvent keyEvent) {
        return false;
    }

    @java.lang.Deprecated
    /* renamed from: shouldOverrideUrlLoading */
    public boolean mo120458xec6a1ccc(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
        return false;
    }

    /* renamed from: onReceivedError */
    public void mo120443xa740e108(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.WebResourceRequest webResourceRequest, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.s sVar) {
    }

    /* renamed from: shouldInterceptRequest */
    public android.webkit.WebResourceResponse mo120454xc23eff40(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.WebResourceRequest webResourceRequest) {
        return mo120455xc23eff40(c27847xac2547f9, webResourceRequest.getUrl().toString());
    }

    /* renamed from: shouldOverrideUrlLoading */
    public boolean mo120457xec6a1ccc(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.WebResourceRequest webResourceRequest) {
        return mo120458xec6a1ccc(c27847xac2547f9, webResourceRequest.getUrl().toString());
    }
}
