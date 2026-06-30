package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl */
/* loaded from: classes16.dex */
public class C28916x5eecba99 implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi {

    /* renamed from: context */
    private android.content.Context f72097x38b735af;

    /* renamed from: flutterApi */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28908x4e9c5837 f72098x2014845e;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72099xd32bb158;

    /* renamed from: webChromeClientCreator */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientCreator f72100x7a1d8193;

    /* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$SecureWebChromeClient */
    /* loaded from: classes13.dex */
    public static class SecureWebChromeClient extends android.webkit.WebChromeClient {

        /* renamed from: webViewClient */
        android.webkit.WebViewClient f72101xd39c5944;

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(android.webkit.WebView webView, boolean z17, boolean z18, android.os.Message message) {
            return m139328xd703478b(webView, message, new android.webkit.WebView(webView.getContext()));
        }

        /* renamed from: setWebViewClient */
        public void m139329x23d27c02(android.webkit.WebViewClient webViewClient) {
            this.f72101xd39c5944 = webViewClient;
        }

        /* renamed from: onCreateWindow */
        public boolean m139328xd703478b(final android.webkit.WebView webView, android.os.Message message, android.webkit.WebView webView2) {
            if (this.f72101xd39c5944 == null) {
                return false;
            }
            android.webkit.WebViewClient webViewClient = new android.webkit.WebViewClient() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(android.webkit.WebView webView3, android.webkit.WebResourceRequest webResourceRequest) {
                    if (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.SecureWebChromeClient.this.f72101xd39c5944.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(android.webkit.WebView webView3, java.lang.String str) {
                    if (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.SecureWebChromeClient.this.f72101xd39c5944.shouldOverrideUrlLoading(webView, str)) {
                        return true;
                    }
                    webView.loadUrl(str);
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new android.webkit.WebView(webView.getContext());
            }
            webView2.setWebViewClient(webViewClient);
            ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientCreator */
    /* loaded from: classes16.dex */
    public static class WebChromeClientCreator {
        /* renamed from: createWebChromeClient */
        public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl m139330x496bafbd(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28908x4e9c5837 c28908x4e9c5837) {
            return new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl(c28908x4e9c5837);
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl */
    /* loaded from: classes16.dex */
    public static class WebChromeClientImpl extends io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.SecureWebChromeClient {

        /* renamed from: flutterApi */
        private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28908x4e9c5837 f72104x2014845e;

        /* renamed from: returnValueForOnShowFileChooser */
        private boolean f72109x136e12fb = false;

        /* renamed from: returnValueForOnConsoleMessage */
        private boolean f72105x99992177 = false;

        /* renamed from: returnValueForOnJsAlert */
        private boolean f72106x7284a4ac = false;

        /* renamed from: returnValueForOnJsConfirm */
        private boolean f72107x53526e10 = false;

        /* renamed from: returnValueForOnJsPrompt */
        private boolean f72108xf801a814 = false;

        public WebChromeClientImpl(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28908x4e9c5837 c28908x4e9c5837) {
            this.f72104x2014845e = c28908x4e9c5837;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onConsoleMessage$7 */
        public static /* synthetic */ void m139331xb21f4f3f(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onGeolocationPermissionsHidePrompt$4 */
        public static /* synthetic */ void m139332xd1079710(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onGeolocationPermissionsShowPrompt$3 */
        public static /* synthetic */ void m139333x7cbca9ca(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onHideCustomView$2 */
        public static /* synthetic */ void m139334x9d4ccb22(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onJsConfirm$9 */
        public static /* synthetic */ void m139336xed0abe90(android.webkit.JsResult jsResult, java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                jsResult.confirm();
            } else {
                jsResult.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onJsPrompt$10 */
        public static /* synthetic */ void m139337xed628c9a(android.webkit.JsPromptResult jsPromptResult, java.lang.String str) {
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onPermissionRequest$6 */
        public static /* synthetic */ void m139338xb96accd6(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onProgressChanged$0 */
        public static /* synthetic */ void m139339x45e8a617(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onShowCustomView$1 */
        public static /* synthetic */ void m139340x6e74085c(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onShowFileChooser$5 */
        public static /* synthetic */ void m139341x1f01f877(boolean z17, android.webkit.ValueCallback valueCallback, java.util.List list) {
            if (z17) {
                android.net.Uri[] uriArr = new android.net.Uri[list.size()];
                for (int i17 = 0; i17 < list.size(); i17++) {
                    uriArr[i17] = android.net.Uri.parse((java.lang.String) list.get(i17));
                }
                valueCallback.onReceiveValue(uriArr);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            this.f72104x2014845e.m139316x3424fa6f(this, consoleMessage, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28918xa42c19b4());
            return this.f72105x99992177;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            this.f72104x2014845e.m139317xfdd89c83(this, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28919xa42c19b5());
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
            this.f72104x2014845e.m139318x179921fe(this, str, callback, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28921xa42c19b7());
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.f72104x2014845e.m139319x9cd05057(this, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28922xa42c19b8());
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, final android.webkit.JsResult jsResult) {
            if (!this.f72106x7284a4ac) {
                return false;
            }
            this.f72104x2014845e.m139320xfefe72b4(this, str, str2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$j
                @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply
                /* renamed from: reply */
                public final void mo139097x67612ea(java.lang.Object obj) {
                    jsResult.confirm();
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, final android.webkit.JsResult jsResult) {
            if (!this.f72107x53526e10) {
                return false;
            }
            this.f72104x2014845e.m139321xa890da18(this, str, str2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$i
                @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply
                /* renamed from: reply */
                public final void mo139097x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl.m139336xed0abe90(jsResult, (java.lang.Boolean) obj);
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, final android.webkit.JsPromptResult jsPromptResult) {
            if (!this.f72108xf801a814) {
                return false;
            }
            this.f72104x2014845e.m139322xfac19b0c(this, str, str2, str3, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$d
                @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply
                /* renamed from: reply */
                public final void mo139097x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl.m139337xed628c9a(jsPromptResult, (java.lang.String) obj);
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
            this.f72104x2014845e.m139323xf4b139a1(this, permissionRequest, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28927xa42c19bd());
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView webView, int i17) {
            this.f72104x2014845e.m139324x95ed2be8(this, webView, java.lang.Long.valueOf(i17), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28923xa42c19b9());
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
            this.f72104x2014845e.m139325x2f8ba052(this, view, customViewCallback, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28924xa42c19ba());
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(android.webkit.WebView webView, final android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
            final boolean z17 = this.f72109x136e12fb;
            this.f72104x2014845e.m139326xca5d5903(this, webView, fileChooserParams, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl$WebChromeClientImpl$$a
                @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply
                /* renamed from: reply */
                public final void mo139097x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl.m139341x1f01f877(z17, valueCallback, (java.util.List) obj);
                }
            });
            return z17;
        }

        /* renamed from: setReturnValueForOnConsoleMessage */
        public void m139342x40711279(boolean z17) {
            this.f72105x99992177 = z17;
        }

        /* renamed from: setReturnValueForOnJsAlert */
        public void m139343x58b4f1ea(boolean z17) {
            this.f72106x7284a4ac = z17;
        }

        /* renamed from: setReturnValueForOnJsConfirm */
        public void m139344x6ea463ce(boolean z17) {
            this.f72107x53526e10 = z17;
        }

        /* renamed from: setReturnValueForOnJsPrompt */
        public void m139345xd7db0296(boolean z17) {
            this.f72108xf801a814 = z17;
        }

        /* renamed from: setReturnValueForOnShowFileChooser */
        public void m139346x47944239(boolean z17) {
            this.f72109x136e12fb = z17;
        }
    }

    public C28916x5eecba99(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientCreator webChromeClientCreator, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28908x4e9c5837 c28908x4e9c5837) {
        this.f72099xd32bb158 = c28897x97be6938;
        this.f72100x7a1d8193 = webChromeClientCreator;
        this.f72098x2014845e = c28908x4e9c5837;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi
    /* renamed from: create */
    public void mo139107xaf65a0fc(java.lang.Long l17) {
        this.f72099xd32bb158.m139285xa3622bbd(this.f72100x7a1d8193.m139330x496bafbd(this.f72098x2014845e), l17.longValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi
    /* renamed from: setSynchronousReturnValueForOnConsoleMessage */
    public void mo139108x76757cde(java.lang.Long l17, java.lang.Boolean bool) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl webChromeClientImpl = (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl) this.f72099xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.m139342x40711279(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi
    /* renamed from: setSynchronousReturnValueForOnJsAlert */
    public void mo139109x82153f25(java.lang.Long l17, java.lang.Boolean bool) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl webChromeClientImpl = (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl) this.f72099xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.m139343x58b4f1ea(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi
    /* renamed from: setSynchronousReturnValueForOnJsConfirm */
    public void mo139110xc1264e49(java.lang.Long l17, java.lang.Boolean bool) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl webChromeClientImpl = (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl) this.f72099xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.m139344x6ea463ce(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi
    /* renamed from: setSynchronousReturnValueForOnJsPrompt */
    public void mo139111xda845cbb(java.lang.Long l17, java.lang.Boolean bool) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl webChromeClientImpl = (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl) this.f72099xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.m139345xd7db0296(bool.booleanValue());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi
    /* renamed from: setSynchronousReturnValueForOnShowFileChooser */
    public void mo139112xd21d2474(java.lang.Long l17, java.lang.Boolean bool) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl webChromeClientImpl = (io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientImpl) this.f72099xd32bb158.m139290x9cf0d20b(l17.longValue());
        java.util.Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.m139346x47944239(bool.booleanValue());
    }
}
