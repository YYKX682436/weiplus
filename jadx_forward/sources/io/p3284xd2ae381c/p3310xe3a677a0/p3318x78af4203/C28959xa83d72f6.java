package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewFlutterPlugin */
/* loaded from: classes16.dex */
public class C28959xa83d72f6 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: instanceManager */
    private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72126xd32bb158;

    /* renamed from: javaScriptChannelHostApi */
    private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28904xa2b4501c f72127xba62a3bc;

    /* renamed from: pluginBinding */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding f72128xbdeee7d2;

    /* renamed from: webViewHostApi */
    private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9 f72129xae1f94f9;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUp$0 */
    public static /* synthetic */ void m139394x9bfff40c(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUp$1 */
    public static /* synthetic */ void m139395x9bfff40d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, long j17) {
        new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectFlutterApi(interfaceC28679x1b8c77f2).m139046x63a5261f(java.lang.Long.valueOf(j17), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28960x46e5ad2b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUp$2 */
    public /* synthetic */ void m139396x9bfff40e() {
        this.f72126xd32bb158.m139287x5a5b64d();
    }

    /* renamed from: setUp */
    private void m139397x684369d(final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28719xf67d3635 interfaceC28719xf67d3635, android.content.Context context, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.AbstractC28791x20198b9 abstractC28791x20198b9) {
        this.f72126xd32bb158 = io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938.m139282xaf65a0fc(new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938.FinalizationListener() { // from class: io.flutter.plugins.webviewflutter.WebViewFlutterPlugin$$b
            @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938.FinalizationListener
            /* renamed from: onFinalize */
            public final void mo139294x7c7eff1d(long j17) {
                io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28959xa83d72f6.m139395x9bfff40d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.this, j17);
            }
        });
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.InstanceManagerHostApi.m139042x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.InstanceManagerHostApi() { // from class: io.flutter.plugins.webviewflutter.WebViewFlutterPlugin$$c
            @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.InstanceManagerHostApi
            /* renamed from: clear */
            public final void mo139043x5a5b64d() {
                io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28959xa83d72f6.this.m139396x9bfff40e();
            }
        });
        interfaceC28719xf67d3635.mo138696x7b3a4002("plugins.flutter.io/webview", new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28793xba226dcd(this.f72126xd32bb158));
        this.f72129xae1f94f9 = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9(this.f72126xd32bb158, interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28963x27d102d9.WebViewProxy(), context);
        this.f72127xba62a3bc = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28904xa2b4501c(this.f72126xd32bb158, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28904xa2b4501c.JavaScriptChannelCreator(), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28903xe56c2fd4(interfaceC28679x1b8c77f2, this.f72126xd32bb158), new android.os.Handler(context.getMainLooper()));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaObjectHostApi.m139050x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28899xa58f2db1(this.f72126xd32bb158));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewHostApi.m139239x6843a7d(interfaceC28679x1b8c77f2, this.f72129xae1f94f9);
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelHostApi.m139058x6843a7d(interfaceC28679x1b8c77f2, this.f72127xba62a3bc);
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebViewClientHostApi.m139203x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28940xccee8ce(this.f72126xd32bb158, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28940xccee8ce.WebViewClientCreator(), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28930x527b81e2(interfaceC28679x1b8c77f2, this.f72126xd32bb158)));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebChromeClientHostApi.m139106x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99(this.f72126xd32bb158, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28916x5eecba99.WebChromeClientCreator(), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28908x4e9c5837(interfaceC28679x1b8c77f2, this.f72126xd32bb158)));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerHostApi.m139007x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28788x78e39d76(this.f72126xd32bb158, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28788x78e39d76.DownloadListenerCreator(), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28787xd006ac3a(interfaceC28679x1b8c77f2, this.f72126xd32bb158)));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebSettingsHostApi.m139159x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28928x5adb509b(this.f72126xd32bb158, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28928x5adb509b.WebSettingsCreator()));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FlutterAssetManagerHostApi.m139019x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28792x195eba19(abstractC28791x20198b9));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CookieManagerHostApi.m138992x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28781x99f4bc49(interfaceC28679x1b8c77f2, this.f72126xd32bb158));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.WebStorageHostApi.m139178x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28929xc18ded6b(this.f72126xd32bb158, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28929xc18ded6b.WebStorageCreator()));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.PermissionRequestHostApi.m139067x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28906xe8765ed2(interfaceC28679x1b8c77f2, this.f72126xd32bb158));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.GeolocationPermissionsCallbackHostApi.m139026x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28894xb57dcb6f(interfaceC28679x1b8c77f2, this.f72126xd32bb158));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackHostApi.m139001x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28785x6c7b2957(interfaceC28679x1b8c77f2, this.f72126xd32bb158));
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.HttpAuthHandlerHostApi.m139036x6843a7d(interfaceC28679x1b8c77f2, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28896xda682178(interfaceC28679x1b8c77f2, this.f72126xd32bb158));
    }

    /* renamed from: updateContext */
    private void m139398xdf8cd0a6(android.content.Context context) {
        this.f72129xae1f94f9.m139401xe9f5beed(context);
        this.f72127xba62a3bc.m139300x980dc0eb(new android.os.Handler(context.getMainLooper()));
    }

    /* renamed from: getInstanceManager */
    public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 m139399xb78d8322() {
        return this.f72126xd32bb158;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3) {
        m139398xdf8cd0a6(interfaceC28627xb16524e3.mo137508x19263085());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        this.f72128xbdeee7d2 = flutterPluginBinding;
        m139397x684369d(flutterPluginBinding.m137983x3b5b91dc(), flutterPluginBinding.m137987x9883be8b(), flutterPluginBinding.m137982x6e669035(), new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.AbstractC28791x20198b9.PluginBindingFlutterAssetManager(flutterPluginBinding.m137982x6e669035().getAssets(), flutterPluginBinding.m137985xf127cf09()));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        m139398xdf8cd0a6(this.f72128xbdeee7d2.m137982x6e669035());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        m139398xdf8cd0a6(this.f72128xbdeee7d2.m137982x6e669035());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938 = this.f72126xd32bb158;
        if (c28897x97be6938 != null) {
            c28897x97be6938.m139293xedc5d424();
            this.f72126xd32bb158 = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3) {
        m139398xdf8cd0a6(interfaceC28627xb16524e3.mo137508x19263085());
    }
}
