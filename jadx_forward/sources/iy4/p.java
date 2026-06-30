package iy4;

/* loaded from: classes11.dex */
public final class p implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.C23703x4c6877f0 f377514d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.C23707xca910d7a f377515e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f377516f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f377517g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f377518h = new iy4.o(this);

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c
    /* renamed from: goFileTransfer */
    public void mo87843x559b1a8f() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", "filehelper");
        intent.putExtra("key_show_bottom_app_panel", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, this.f377516f);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c
    /* renamed from: goHelpWebview */
    public void mo87844x39a08370(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url + "&lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(this.f377516f, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c
    /* renamed from: goSecondVerify */
    public void mo87845x2f27d715(java.lang.String authURL) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authURL, "authURL");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", authURL);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        this.f377517g = true;
        android.app.Activity activity = this.f377516f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 101, new iy4.m(this));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f377516f = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c.Companion.m87847x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        gm0.j1.d().a(uc1.x1.f76938x366c91de, this.f377518h);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f377514d = new com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.C23703x4c6877f0(m137983x3b5b91dc2, null, 2, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc3 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc3, "getBinaryMessenger(...)");
        this.f377515e = new com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.C23707xca910d7a(m137983x3b5b91dc3, null, 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f377516f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f377516f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.InterfaceC23710x44d9288c.Companion.m87847x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        gm0.j1.d().q(uc1.x1.f76938x366c91de, this.f377518h);
        this.f377514d = null;
        this.f377515e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f377516f = binding.mo137508x19263085();
    }
}
