package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28908x4e9c5837 extends io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi {

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f72093x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72094xd32bb158;

    /* renamed from: webViewFlutterApi */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28958x4c1027f7 f72095x6e0c8557;

    /* renamed from: io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$android$webkit$ConsoleMessage$MessageLevel */
        static final /* synthetic */ int[] f72096xc1370fc4;

        static {
            int[] iArr = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
            f72096xc1370fc4 = iArr;
            try {
                iArr[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f72096xc1370fc4[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f72096xc1370fc4[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f72096xc1370fc4[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f72096xc1370fc4[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public C28908x4e9c5837(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        super(interfaceC28679x1b8c77f2);
        this.f72093x56f9c012 = interfaceC28679x1b8c77f2;
        this.f72094xd32bb158 = c28897x97be6938;
        this.f72095x6e0c8557 = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28958x4c1027f7(interfaceC28679x1b8c77f2, c28897x97be6938);
    }

    /* renamed from: getIdentifierForClient */
    private long m139307xea7b7015(android.webkit.WebChromeClient webChromeClient) {
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        if (m139289x102c196a != null) {
            return m139289x102c196a.longValue();
        }
        throw new java.lang.IllegalStateException("Could not find identifier for WebChromeClient.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onGeolocationPermissionsShowPrompt$3 */
    public static /* synthetic */ void m139308x7cbca9ca(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onPermissionRequest$4 */
    public static /* synthetic */ void m139309xb96accd4(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onProgressChanged$0 */
    public static /* synthetic */ void m139310x45e8a617(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onShowCustomView$5 */
    public static /* synthetic */ void m139311x6e740860(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onShowCustomView$6 */
    public static /* synthetic */ void m139312x6e740861(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onShowFileChooser$1 */
    public static /* synthetic */ void m139313x1f01f873(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onShowFileChooser$2 */
    public static /* synthetic */ void m139314x1f01f874(java.lang.Void r07) {
    }

    /* renamed from: toConsoleMessageLevel */
    private static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel m139315x464e8039(android.webkit.ConsoleMessage.MessageLevel messageLevel) {
        int i17 = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28908x4e9c5837.AnonymousClass1.f72096xc1370fc4[messageLevel.ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel.UNKNOWN : io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel.DEBUG : io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel.ERROR : io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel.WARNING : io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel.LOG : io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessageLevel.TIP;
    }

    /* renamed from: onConsoleMessage */
    public void m139316x3424fa6f(android.webkit.WebChromeClient webChromeClient, android.webkit.ConsoleMessage consoleMessage, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        super.m139086x3424fa6f(m139289x102c196a, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.ConsoleMessage.Builder().m138980x8c6b65f(java.lang.Long.valueOf(consoleMessage.lineNumber())).m138981xea298945(consoleMessage.message()).m138979x534d5c42(m139315x464e8039(consoleMessage.messageLevel())).m138982xdea97518(consoleMessage.sourceId()).m138978x59bc66e(), reply);
    }

    /* renamed from: onGeolocationPermissionsHidePrompt */
    public void m139317xfdd89c83(android.webkit.WebChromeClient webChromeClient, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        super.m139087xfdd89c83(m139289x102c196a, reply);
    }

    /* renamed from: onGeolocationPermissionsShowPrompt */
    public void m139318x179921fe(android.webkit.WebChromeClient webChromeClient, java.lang.String str, android.webkit.GeolocationPermissions.Callback callback, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28893x2a128fa1(this.f72093x56f9c012, this.f72094xd32bb158).m139276xaf65a0fc(callback, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28911x3fe344c());
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        java.lang.Long m139289x102c196a2 = this.f72094xd32bb158.m139289x102c196a(callback);
        java.util.Objects.requireNonNull(m139289x102c196a2);
        m139088x179921fe(m139289x102c196a, m139289x102c196a2, str, reply);
    }

    /* renamed from: onHideCustomView */
    public void m139319x9cd05057(android.webkit.WebChromeClient webChromeClient, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        super.m139089x9cd05057(m139289x102c196a, reply);
    }

    /* renamed from: onJsAlert */
    public void m139320xfefe72b4(android.webkit.WebChromeClient webChromeClient, java.lang.String str, java.lang.String str2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        super.m139090xfefe72b4(m139289x102c196a, str, str2, reply);
    }

    /* renamed from: onJsConfirm */
    public void m139321xa890da18(android.webkit.WebChromeClient webChromeClient, java.lang.String str, java.lang.String str2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Boolean> reply) {
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        super.m139091xa890da18(m139289x102c196a, str, str2, reply);
    }

    /* renamed from: onJsPrompt */
    public void m139322xfac19b0c(android.webkit.WebChromeClient webChromeClient, java.lang.String str, java.lang.String str2, java.lang.String str3, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.String> reply) {
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        super.m139092xfac19b0c(m139289x102c196a, str, str2, str3, reply);
    }

    /* renamed from: onPermissionRequest */
    public void m139323xf4b139a1(android.webkit.WebChromeClient webChromeClient, android.webkit.PermissionRequest permissionRequest, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28905xb71a1d5e(this.f72093x56f9c012, this.f72094xd32bb158).m139302xaf65a0fc(permissionRequest, permissionRequest.getResources(), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28915x3fe3450());
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        java.lang.Long m139289x102c196a2 = this.f72094xd32bb158.m139289x102c196a(permissionRequest);
        java.util.Objects.requireNonNull(m139289x102c196a2);
        super.m139093xf4b139a1(m139289x102c196a, m139289x102c196a2, reply);
    }

    /* renamed from: onProgressChanged */
    public void m139324x95ed2be8(android.webkit.WebChromeClient webChromeClient, android.webkit.WebView webView, java.lang.Long l17, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        this.f72095x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28912x3fe344d());
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a);
        super.m139094x95ed2be8(java.lang.Long.valueOf(m139307xea7b7015(webChromeClient)), m139289x102c196a, l17, reply);
    }

    /* renamed from: onShowCustomView */
    public void m139325x2f8ba052(android.webkit.WebChromeClient webChromeClient, android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
        new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28907xe601b9c3(this.f72093x56f9c012, this.f72094xd32bb158).m139305xaf65a0fc(view, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28909x3fe344a());
        new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28784xe0a588b9(this.f72093x56f9c012, this.f72094xd32bb158).m138948xaf65a0fc(customViewCallback, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28910x3fe344b());
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        java.lang.Long m139289x102c196a2 = this.f72094xd32bb158.m139289x102c196a(view);
        java.util.Objects.requireNonNull(m139289x102c196a2);
        java.lang.Long m139289x102c196a3 = this.f72094xd32bb158.m139289x102c196a(customViewCallback);
        java.util.Objects.requireNonNull(m139289x102c196a3);
        m139095x2f8ba052(m139289x102c196a, m139289x102c196a2, m139289x102c196a3, reply);
    }

    /* renamed from: onShowFileChooser */
    public void m139326xca5d5903(android.webkit.WebChromeClient webChromeClient, android.webkit.WebView webView, android.webkit.WebChromeClient.FileChooserParams fileChooserParams, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientFlutterApi.Reply<java.util.List<java.lang.String>> reply) {
        this.f72095x6e0c8557.m139391xaf65a0fc(webView, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28913x3fe344e());
        new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28790x9dd79163(this.f72093x56f9c012, this.f72094xd32bb158).m138962xaf65a0fc(fileChooserParams, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28914x3fe344f());
        java.lang.Long m139289x102c196a = this.f72094xd32bb158.m139289x102c196a(webChromeClient);
        java.util.Objects.requireNonNull(m139289x102c196a);
        java.lang.Long m139289x102c196a2 = this.f72094xd32bb158.m139289x102c196a(webView);
        java.util.Objects.requireNonNull(m139289x102c196a2);
        java.lang.Long m139289x102c196a3 = this.f72094xd32bb158.m139289x102c196a(fileChooserParams);
        java.util.Objects.requireNonNull(m139289x102c196a3);
        m139096xca5d5903(m139289x102c196a, m139289x102c196a2, m139289x102c196a3, reply);
    }
}
