package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class v implements tx5.f {

    /* renamed from: t, reason: collision with root package name */
    public static volatile boolean f302107t;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f302108d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.sys.u f302109e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.h1 f302110f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.s0 f302111g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.g1 f302112h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.sys.w f302113i;

    /* renamed from: o, reason: collision with root package name */
    public sx5.a f302116o;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Looper f302118q;

    /* renamed from: m, reason: collision with root package name */
    public long f302114m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f302115n = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f302117p = -1;

    /* renamed from: r, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f302119r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f302120s = false;

    public v(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        android.webkit.WebChromeClient webChromeClient = new android.webkit.WebChromeClient() { // from class: com.tencent.xweb.sys.SysWebView$2
            @Override // android.webkit.WebChromeClient
            public android.view.View getVideoLoadingProgressView() {
                com.p314xaae8f345.p3210x3857dc.sys.v vVar = com.p314xaae8f345.p3210x3857dc.sys.v.this;
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = vVar.f302111g;
                return s0Var != null ? s0Var.a() : android.view.LayoutInflater.from(vVar.f302108d.getContext()).inflate(com.p314xaae8f345.p3222x9cba06de.R.C27875xbddafb2a.f61380xb21f9c34, (android.view.ViewGroup) null);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = com.p314xaae8f345.p3210x3857dc.sys.v.this.f302111g;
                return s0Var != null ? s0Var.b(consoleMessage) : super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                by5.c4.f("SysWebView", "onGeolocationPermissionsHidePrompt");
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = com.p314xaae8f345.p3210x3857dc.sys.v.this.f302111g;
                if (s0Var != null) {
                    s0Var.f();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
                by5.c4.f("SysWebView", "onGeolocationPermissionsShowPrompt");
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = com.p314xaae8f345.p3210x3857dc.sys.v.this.f302111g;
                if (s0Var != null) {
                    s0Var.g(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                by5.c4.f("SysWebView", "onHideCustomView");
                com.p314xaae8f345.p3210x3857dc.sys.v vVar = com.p314xaae8f345.p3210x3857dc.sys.v.this;
                vVar.f302119r = null;
                vVar.f302120s = false;
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = vVar.f302111g;
                if (s0Var != null ? s0Var.d() : false) {
                    by5.c4.f("SysWebView", "onHideCustomView, isHandled:true");
                    return;
                }
                sx5.a aVar = vVar.f302116o;
                if (aVar != null) {
                    aVar.e();
                    return;
                }
                com.p314xaae8f345.p3210x3857dc.s0 s0Var2 = vVar.f302111g;
                if (s0Var2 != null) {
                    s0Var2.h();
                } else {
                    super.onHideCustomView();
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
                by5.c4.f("SysWebView", "onJsAlert");
                com.p314xaae8f345.p3210x3857dc.sys.v vVar = com.p314xaae8f345.p3210x3857dc.sys.v.this;
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = vVar.f302111g;
                return s0Var != null ? s0Var.i(vVar.f302108d, str, str2, new com.p314xaae8f345.p3210x3857dc.sys.i(jsResult)) : super.onJsAlert(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
                by5.c4.f("SysWebView", "onJsConfirm");
                com.p314xaae8f345.p3210x3857dc.sys.v vVar = com.p314xaae8f345.p3210x3857dc.sys.v.this;
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = vVar.f302111g;
                return s0Var != null ? s0Var.j(vVar.f302108d, str, str2, new com.p314xaae8f345.p3210x3857dc.sys.i(jsResult)) : super.onJsConfirm(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
                by5.c4.f("SysWebView", "onJsPrompt");
                com.p314xaae8f345.p3210x3857dc.sys.v vVar = com.p314xaae8f345.p3210x3857dc.sys.v.this;
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = vVar.f302111g;
                return s0Var != null ? s0Var.k(vVar.f302108d, str, str2, str3, new com.p314xaae8f345.p3210x3857dc.sys.h(jsPromptResult)) : super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
                by5.c4.f("SysWebView", "onPermissionRequest");
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = com.p314xaae8f345.p3210x3857dc.sys.v.this.f302111g;
                if (s0Var != null) {
                    s0Var.l(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequestCanceled(android.webkit.PermissionRequest permissionRequest) {
                by5.c4.f("SysWebView", "onPermissionRequestCanceled");
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = com.p314xaae8f345.p3210x3857dc.sys.v.this.f302111g;
                if (s0Var != null) {
                    s0Var.m(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView webView, int i17) {
                com.p314xaae8f345.p3210x3857dc.sys.v vVar = com.p314xaae8f345.p3210x3857dc.sys.v.this;
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = vVar.f302111g;
                if (s0Var != null) {
                    s0Var.n(vVar.f302108d, i17);
                } else {
                    super.onProgressChanged(webView, i17);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(android.webkit.WebView webView, java.lang.String str) {
                by5.c4.f("SysWebView", "onReceivedTitle: " + str);
                com.p314xaae8f345.p3210x3857dc.sys.v vVar = com.p314xaae8f345.p3210x3857dc.sys.v.this;
                sx5.a aVar = vVar.f302116o;
                if (aVar != null) {
                    aVar.g(true, vVar.f302108d.mo120146xc46191fe() == com.p314xaae8f345.p3210x3857dc.c1.HOOK_EVALUTE_JS);
                }
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = vVar.f302111g;
                if (s0Var != null) {
                    s0Var.o(vVar.f302108d, str);
                } else {
                    super.onReceivedTitle(webView, str);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
                by5.c4.f("SysWebView", "onShowCustomView");
                com.p314xaae8f345.p3210x3857dc.sys.v vVar = com.p314xaae8f345.p3210x3857dc.sys.v.this;
                vVar.f302119r = customViewCallback;
                vVar.f302120s = true;
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = vVar.f302111g;
                boolean c17 = s0Var != null ? s0Var.c(view, customViewCallback) : false;
                com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
                if (n1Var != null) {
                    n1Var.b(577L, 56L, 1L);
                    by5.s0.f118128c.b(1749L, 5L, 1L);
                }
                if (c17) {
                    by5.c4.f("SysWebView", "onShowCustomView, isHandled:true");
                    return;
                }
                sx5.a aVar = vVar.f302116o;
                if (aVar != null) {
                    by5.s0.r(com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS, aVar instanceof sx5.a1, vVar.mo120156xb5887639());
                    vVar.f302116o.b(view, customViewCallback);
                    return;
                }
                com.p314xaae8f345.p3210x3857dc.s0 s0Var2 = vVar.f302111g;
                if (s0Var2 != null) {
                    s0Var2.p(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
                by5.c4.f("SysWebView", "onShowFileChooser last method");
                com.p314xaae8f345.p3210x3857dc.sys.v vVar = com.p314xaae8f345.p3210x3857dc.sys.v.this;
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = vVar.f302111g;
                return s0Var != null ? s0Var.q(vVar.f302108d, valueCallback, new com.p314xaae8f345.p3210x3857dc.sys.g(fileChooserParams)) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            /* renamed from: openFileChooser */
            public void m120504x30999b75(android.webkit.ValueCallback<android.net.Uri> valueCallback) {
                by5.c4.f("SysWebView", "openFileChooser with one param");
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = com.p314xaae8f345.p3210x3857dc.sys.v.this.f302111g;
                if (s0Var != null) {
                    s0Var.r(valueCallback, null, null);
                } else {
                    valueCallback.onReceiveValue(null);
                }
            }

            /* renamed from: openFileChooser */
            public void m120505x30999b75(android.webkit.ValueCallback<android.net.Uri> valueCallback, java.lang.String str) {
                by5.c4.f("SysWebView", "openFileChooser with two param");
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = com.p314xaae8f345.p3210x3857dc.sys.v.this.f302111g;
                if (s0Var != null) {
                    s0Var.r(valueCallback, str, null);
                } else {
                    valueCallback.onReceiveValue(null);
                }
            }

            /* renamed from: openFileChooser */
            public void m120506x30999b75(android.webkit.ValueCallback<android.net.Uri> valueCallback, java.lang.String str, java.lang.String str2) {
                by5.c4.f("SysWebView", "openFileChooser with three param");
                com.p314xaae8f345.p3210x3857dc.s0 s0Var = com.p314xaae8f345.p3210x3857dc.sys.v.this.f302111g;
                if (s0Var != null) {
                    s0Var.r(valueCallback, str, str2);
                } else {
                    valueCallback.onReceiveValue(null);
                }
            }
        };
        com.p314xaae8f345.p3210x3857dc.sys.t tVar = new com.p314xaae8f345.p3210x3857dc.sys.t(this);
        this.f302108d = c27816xac2547f9;
        this.f302118q = android.os.Looper.myLooper();
        f302107t = c27816xac2547f9.getContext().getApplicationInfo().targetSdkVersion >= 18;
        com.p314xaae8f345.p3210x3857dc.sys.u uVar = new com.p314xaae8f345.p3210x3857dc.sys.u(this, c27816xac2547f9.getContext());
        this.f302109e = uVar;
        if (y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74964x93d07063) && !com.p314xaae8f345.p3210x3857dc.o2.f301901c.equals("Default")) {
            java.lang.String str = com.p314xaae8f345.p3210x3857dc.o2.f301901c;
            int i17 = y4.m.f540810a;
            if (!z4.e0.f551598g.b()) {
                throw z4.e0.a();
            }
            z4.g0.f551600a.mo178382xced3d37d(uVar).m154437x9ecd12e7(str);
        }
        uVar.setBackgroundColor(0);
        mo120153xd15cf999();
        uVar.setWebChromeClient(webChromeClient);
        uVar.setWebViewClient(tVar);
        if (c27816xac2547f9.getContext() instanceof android.app.Activity) {
            a((android.app.Activity) c27816xac2547f9.getContext());
        } else {
            a(null);
        }
    }

    @Override // tx5.f
    public boolean F() {
        return this.f302109e.overlayHorizontalScrollbar();
    }

    @Override // tx5.f
    public void S(boolean z17) {
        sx5.a aVar = this.f302116o;
        if (aVar != null) {
            aVar.i(z17);
        }
    }

    @Override // tx5.f
    public boolean T() {
        return false;
    }

    public final void a(android.app.Activity activity) {
        by5.c4.f("SysWebView", "initFullscreenVideo, kind:" + mo120146xc46191fe() + ", activity:" + activity);
        if (mo120146xc46191fe() == com.p314xaae8f345.p3210x3857dc.c1.NOT_HOOK) {
            return;
        }
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f302108d;
        com.p314xaae8f345.p3210x3857dc.f1 m120143xc7aa84d5 = c27816xac2547f9.m120143xc7aa84d5();
        java.lang.String a17 = sx5.g.a();
        com.p314xaae8f345.p3210x3857dc.sys.u uVar = this.f302109e;
        this.f302116o = sx5.c1.a(m120143xc7aa84d5, activity, c27816xac2547f9, uVar, a17);
        if (mo120146xc46191fe() == com.p314xaae8f345.p3210x3857dc.c1.HOOK_EVALUTE_JS) {
            this.f302116o.j(uVar);
        }
    }

    @Override // tx5.f
    /* renamed from: addJavascriptInterface */
    public void mo120128x74041feb(java.lang.Object obj, java.lang.String str) {
        this.f302109e.addJavascriptInterface(obj, str);
    }

    @Override // tx5.f
    /* renamed from: canGoBack */
    public boolean mo120129xed1a21df() {
        return this.f302109e.canGoBack();
    }

    @Override // tx5.f
    /* renamed from: canGoForward */
    public boolean mo120130xc062b2cd() {
        return this.f302109e.canGoForward();
    }

    @Override // tx5.f
    /* renamed from: captureLongScreenshot */
    public void mo120131x81469de8(android.graphics.Rect rect, android.webkit.ValueCallback valueCallback) {
        if (rect == null || valueCallback == null) {
            return;
        }
        valueCallback.onReceiveValue(new com.p314xaae8f345.p3210x3857dc.n2(-1));
    }

    @Override // tx5.f
    /* renamed from: clearHistory */
    public void mo120132x35d48587() {
        this.f302109e.clearHistory();
    }

    @Override // tx5.f
    /* renamed from: clearMatches */
    public void mo120133x30b32a26() {
        this.f302109e.clearMatches();
    }

    @Override // tx5.f
    /* renamed from: clearSslPreferences */
    public void mo120134x3e28c0f9() {
        this.f302109e.clearSslPreferences();
    }

    @Override // tx5.f
    /* renamed from: clearView */
    public void mo120135xb4407692() {
        this.f302109e.clearView();
    }

    @Override // tx5.f
    /* renamed from: destroy */
    public void mo52095x5cd39ffa() {
        this.f302109e.destroy();
    }

    @Override // tx5.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (str == null) {
            return;
        }
        this.f302109e.evaluateJavascript(str, valueCallback);
    }

    @Override // tx5.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public android.graphics.Bitmap f() {
        com.p314xaae8f345.p3210x3857dc.sys.u uVar = this.f302109e;
        int height = uVar.getHeight();
        int width = uVar.getWidth();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/sys/SysWebView", "captureBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/xweb/sys/SysWebView", "captureBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        uVar.draw(new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }

    @Override // tx5.f
    /* renamed from: findAllAsync */
    public void mo120136x72420634(java.lang.String str) {
        this.f302109e.findAllAsync(str);
    }

    @Override // tx5.f
    /* renamed from: findNext */
    public void mo120137xd781704c(boolean z17) {
        this.f302109e.findNext(z17);
    }

    @Override // tx5.f
    /* renamed from: getAbstractInfo */
    public java.lang.String mo120138x33c67a66() {
        return mo120157x2e41070();
    }

    @Override // tx5.f
    /* renamed from: getCertificate */
    public android.net.http.SslCertificate mo120140x4e358861() {
        return this.f302109e.getCertificate();
    }

    @Override // tx5.f
    /* renamed from: getContentHeight */
    public int mo120141x964f6f4a() {
        return this.f302109e.getContentHeight();
    }

    @Override // tx5.f
    /* renamed from: getFavicon */
    public android.graphics.Bitmap mo120145xfdbefdde() {
        return this.f302109e.getFavicon();
    }

    @Override // tx5.f
    /* renamed from: getFullscreenVideoKind */
    public com.p314xaae8f345.p3210x3857dc.c1 mo120146xc46191fe() {
        return com.p314xaae8f345.p3210x3857dc.b.m().l(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120126xba60370d());
    }

    @Override // tx5.f
    /* renamed from: getHitTestResult */
    public com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c() {
        android.webkit.WebView.HitTestResult hitTestResult = this.f302109e.getHitTestResult();
        com.p314xaae8f345.p3210x3857dc.d1 d1Var = new com.p314xaae8f345.p3210x3857dc.d1();
        d1Var.f301772a = hitTestResult.getType();
        d1Var.f301773b = hitTestResult.getExtra();
        return d1Var;
    }

    @Override // tx5.f
    /* renamed from: getImageFromDiskCache */
    public void mo120148x7a5ae7b6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (valueCallback == null) {
            return;
        }
        valueCallback.onReceiveValue(null);
    }

    @Override // tx5.f
    /* renamed from: getOriginalUrl */
    public java.lang.String mo120149x410b6ca8() {
        return this.f302109e.getOriginalUrl();
    }

    @Override // tx5.f
    /* renamed from: getProgress */
    public int mo120150x402effa3() {
        return this.f302109e.getProgress();
    }

    @Override // tx5.f
    /* renamed from: getScale */
    public float mo120151x7520af94() {
        return this.f302109e.getScale();
    }

    @Override // tx5.f
    /* renamed from: getScrollHeight */
    public int mo120152x214ee8ca() {
        return this.f302109e.a();
    }

    @Override // tx5.f
    /* renamed from: getSettings */
    public com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999() {
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        if (by5.d4.e().getBoolean("bEnableCheckThread", false) && this.f302118q != null && android.os.Looper.myLooper() != this.f302118q) {
            java.lang.Throwable th6 = new java.lang.Throwable("A WebView method was called on thread '" + java.lang.Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + this.f302118q + " called on " + android.os.Looper.myLooper() + ", FYI main Looper is " + android.os.Looper.getMainLooper() + ")");
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkThread error:");
            sb6.append(stackTraceString);
            by5.c4.g("SysWebView", sb6.toString());
            xx5.g.a(3, stackTraceString, 3, "");
            if (f302107t) {
                throw new java.lang.RuntimeException(th6);
            }
        }
        com.p314xaae8f345.p3210x3857dc.sys.w wVar = this.f302113i;
        if (wVar != null) {
            return wVar;
        }
        com.p314xaae8f345.p3210x3857dc.sys.u uVar = this.f302109e;
        if (uVar == null) {
            return null;
        }
        com.p314xaae8f345.p3210x3857dc.sys.w wVar2 = new com.p314xaae8f345.p3210x3857dc.sys.w(uVar);
        this.f302113i = wVar2;
        return wVar2;
    }

    @Override // tx5.f
    /* renamed from: getTextClassifier */
    public android.view.textclassifier.TextClassifier mo120154xd9ba3424() {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return this.f302109e.getTextClassifier();
        }
        return null;
    }

    @Override // tx5.f
    /* renamed from: getTitle */
    public java.lang.String mo64579x7531c8a2() {
        return this.f302109e.getTitle();
    }

    @Override // tx5.f
    /* renamed from: getTopView */
    public android.view.ViewGroup mo120155xf9dcf964() {
        return this.f302109e;
    }

    @Override // tx5.f
    /* renamed from: getUrl */
    public java.lang.String mo120156xb5887639() {
        return this.f302109e.getUrl();
    }

    @Override // tx5.f
    /* renamed from: getVersionInfo */
    public java.lang.String mo120157x2e41070() {
        return "sys, sdkver:20260502, sysver:" + by5.e.a();
    }

    @Override // tx5.f
    /* renamed from: getView */
    public android.view.View mo120158xfb86a31b() {
        return this.f302109e;
    }

    @Override // tx5.f
    /* renamed from: getVisibleTitleHeight */
    public int mo120159x81ae3bc3() {
        java.lang.Object a17 = by5.j0.a(this.f302109e, "getVisibleTitleHeight");
        if (a17 == null) {
            return 0;
        }
        return ((java.lang.Integer) a17).intValue();
    }

    @Override // tx5.f
    /* renamed from: getWebChromeClient */
    public com.p314xaae8f345.p3210x3857dc.s0 mo120160x38fe0223() {
        return this.f302111g;
    }

    @Override // tx5.f
    /* renamed from: getWebScrollX */
    public int mo120161x95a6d12d() {
        return this.f302109e.getScrollX();
    }

    @Override // tx5.f
    /* renamed from: getWebScrollY */
    public int mo120162x95a6d12e() {
        return this.f302109e.getScrollY();
    }

    @Override // tx5.f
    /* renamed from: getWebViewCallbackClient */
    public com.p314xaae8f345.p3210x3857dc.g1 mo120163xe602a733() {
        return this.f302112h;
    }

    @Override // tx5.f
    /* renamed from: getWebViewClient */
    public com.p314xaae8f345.p3210x3857dc.h1 mo120164x90fc158e() {
        return this.f302110f;
    }

    @Override // tx5.f
    /* renamed from: getWebViewLooper */
    public android.os.Looper mo120165xa084dc14() {
        return this.f302118q;
    }

    @Override // tx5.f
    /* renamed from: getWebViewRenderProcessClient */
    public com.p314xaae8f345.p3210x3857dc.m1 mo120166x3808f441() {
        return null;
    }

    @Override // tx5.f
    /* renamed from: getWebViewUI */
    public android.view.View mo120167xbfee89b7() {
        return this.f302109e;
    }

    @Override // tx5.f
    /* renamed from: goBack */
    public void mo120168xb5fed1ef() {
        this.f302109e.goBack();
    }

    @Override // tx5.f
    /* renamed from: goForward */
    public void mo120169xed0748bd() {
        this.f302109e.goForward();
    }

    @Override // tx5.f
    /* renamed from: loadData */
    public void mo74798x6dfa45b0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f302109e.loadData(str, str2, str3);
    }

    @Override // tx5.f
    /* renamed from: loadDataWithBaseURL */
    public void mo64581x9b341568(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f302109e.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32265x141096a9(java.lang.String str) {
        this.f302109e.loadUrl(str);
    }

    @Override // tx5.f
    public void m() {
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f302119r;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
    }

    @Override // tx5.f
    public com.p314xaae8f345.p3210x3857dc.o0 m0(com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369) {
        sx5.a aVar = this.f302116o;
        if (aVar != null && aVar.f(interfaceC27815xc8aac369)) {
            return new com.p314xaae8f345.p3210x3857dc.sys.s(this);
        }
        by5.c4.f("SysWebView", "setVideoJsCallback not support");
        return null;
    }

    @Override // tx5.f
    public boolean n0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3210x3857dc.InterfaceC27814x36feca02 interfaceC27814x36feca02) {
        return false;
    }

    @Override // tx5.f
    /* renamed from: onHide */
    public void mo81405xc39a57c1() {
        this.f302109e.onPause();
    }

    @Override // tx5.f
    /* renamed from: onPause */
    public void mo74095xb01dfb57() {
        this.f302109e.onPause();
    }

    @Override // tx5.f
    /* renamed from: onResume */
    public void mo74096x57429eec() {
        this.f302109e.onResume();
    }

    @Override // tx5.f
    /* renamed from: onShow */
    public void mo81406xc39f557c() {
        this.f302109e.onPause();
    }

    @Override // tx5.f
    /* renamed from: reload */
    public void mo120172xc84a8199() {
        this.f302109e.reload();
    }

    @Override // tx5.f
    /* renamed from: removeJavascriptInterface */
    public void mo120173x7af55728(java.lang.String str) {
        this.f302109e.removeJavascriptInterface(str);
    }

    @Override // tx5.f
    public boolean s() {
        return this.f302120s;
    }

    @Override // tx5.f
    /* renamed from: savePage */
    public boolean mo120174x847491ac(java.lang.String str, java.lang.String str2, int i17) {
        return false;
    }

    @Override // tx5.f
    /* renamed from: setAudioMuted */
    public void mo120175x77c16137(boolean z17) {
    }

    @Override // tx5.f
    /* renamed from: setBottomHeight */
    public void mo120176x9f718b4(int i17) {
        by5.c4.c("SysWebView", "setBottomHeight not implement");
    }

    @Override // tx5.f
    /* renamed from: setDownloadListener */
    public void mo120177x7619e5de(android.webkit.DownloadListener downloadListener) {
        this.f302109e.setDownloadListener(downloadListener);
    }

    @Override // tx5.f
    /* renamed from: setFindListener */
    public void mo120178xf031e30f(android.webkit.WebView.FindListener findListener) {
        this.f302109e.setFindListener(findListener);
    }

    @Override // tx5.f
    /* renamed from: setHorizontalScrollBarEnabled */
    public void mo120519x347eaca1(boolean z17) {
        this.f302109e.setHorizontalScrollBarEnabled(z17);
    }

    @Override // tx5.f
    /* renamed from: setHorizontalScrollbarOverlay */
    public void mo120179xdc918990(boolean z17) {
        this.f302109e.setHorizontalScrollbarOverlay(z17);
    }

    @Override // tx5.f
    /* renamed from: setInitialScale */
    public void mo120180x7e2239e8(int i17) {
        this.f302109e.setInitialScale(i17);
    }

    @Override // tx5.f
    /* renamed from: setInputOutOfKeyboardEnable */
    public void mo120181x5e593bc7(boolean z17) {
    }

    @Override // tx5.f
    /* renamed from: setJSExceptionListener */
    public void mo120182xbdc6e038(com.p314xaae8f345.p3210x3857dc.l1 l1Var) {
    }

    @Override // tx5.f
    /* renamed from: setNativeDownloadClient */
    public void mo120183xbeb5ec(com.p314xaae8f345.p3210x3857dc.p2 p2Var) {
    }

    @Override // tx5.f
    /* renamed from: setNetworkAvailable */
    public void mo120184xedbee0bd(boolean z17) {
        this.f302109e.setNetworkAvailable(z17);
    }

    @Override // tx5.f
    /* renamed from: setPictureListener */
    public void mo120185x70aa1310(android.webkit.WebView.PictureListener pictureListener) {
    }

    @Override // tx5.f
    /* renamed from: setTextClassifier */
    public void mo120186xa1b09c30(android.view.textclassifier.TextClassifier textClassifier) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            this.f302109e.setTextClassifier(textClassifier);
        }
    }

    @Override // tx5.f
    /* renamed from: setVerticalScrollBarEnabled */
    public void mo120520x57c53c73(boolean z17) {
        this.f302109e.setVerticalScrollBarEnabled(z17);
    }

    @Override // tx5.f
    /* renamed from: setVerticalScrollbarOverlay */
    public void mo120187xffd81962(boolean z17) {
        this.f302109e.setVerticalScrollbarOverlay(z17);
    }

    @Override // tx5.f
    /* renamed from: setWebChromeClient */
    public void mo81410x6fd49b97(com.p314xaae8f345.p3210x3857dc.s0 s0Var) {
        this.f302111g = s0Var;
    }

    @Override // tx5.f
    /* renamed from: setWebContentsSize */
    public void mo120188x874abeed(int i17, int i18) {
    }

    @Override // tx5.f
    /* renamed from: setWebViewCallbackClient */
    public void mo120189xb61559a7(com.p314xaae8f345.p3210x3857dc.g1 g1Var) {
        this.f302112h = g1Var;
    }

    @Override // tx5.f
    /* renamed from: setWebViewClient */
    public void mo74800x23d27c02(com.p314xaae8f345.p3210x3857dc.h1 h1Var) {
        this.f302110f = h1Var;
    }

    @Override // tx5.f
    /* renamed from: setWebViewClientExtension */
    public void mo120190xd6bb225d(com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 c27839xa92bc749) {
    }

    @Override // tx5.f
    /* renamed from: setXWebKeyEventHandler */
    public void mo120192x9db21c31(com.p314xaae8f345.p3210x3857dc.InterfaceC27824x41f147d3 interfaceC27824x41f147d3) {
    }

    @Override // tx5.f
    /* renamed from: smoothScroll */
    public void mo120193x328cce1b(int i17, int i18, long j17) {
    }

    @Override // tx5.f
    /* renamed from: stopLoading */
    public void mo120194xc77ccada() {
        this.f302109e.stopLoading();
    }

    @Override // tx5.f
    public void t(java.util.concurrent.Executor executor, com.p314xaae8f345.p3210x3857dc.m1 m1Var) {
    }

    @Override // tx5.f
    public boolean u(int i17) {
        return i17 == 2006 || i17 == 2012;
    }

    @Override // tx5.f
    public boolean y() {
        return this.f302109e.getScrollY() == 0;
    }

    @Override // tx5.f
    /* renamed from: zoomIn */
    public boolean mo120195xd67f8458() {
        return this.f302109e.zoomIn();
    }

    @Override // tx5.f
    /* renamed from: zoomOut */
    public boolean mo120196xf9711e7b() {
        return this.f302109e.zoomOut();
    }

    @Override // tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32266x141096a9(java.lang.String str, java.util.Map map) {
        this.f302109e.loadUrl(str, map);
    }
}
