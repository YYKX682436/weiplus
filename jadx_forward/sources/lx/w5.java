package lx;

/* loaded from: classes11.dex */
public final class w5 implements com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23261xfddca4b4, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f403532d;

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23261xfddca4b4
    /* renamed from: addToPreload */
    public void mo85776x81a9936d(java.lang.String url, long j17, long j18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(url, (int) j17, (int) j18, str, new java.lang.Object[0]);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403532d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23261xfddca4b4.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23261xfddca4b4.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23261xfddca4b4.Companion.m85779x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403532d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403532d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23261xfddca4b4.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23261xfddca4b4.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23261xfddca4b4.Companion.m85779x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403532d = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23261xfddca4b4
    /* renamed from: openUrl */
    public void mo85777xb4b50ac5(com.p314xaae8f345.p2845xc516c4b6.biz.C23260x538ee33e articleInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(articleInfo, "articleInfo");
        lx.a aVar = new lx.a(articleInfo.m85759x74d37ac6(), articleInfo.m85767x75298e34(), articleInfo.m85763xb588631e(), articleInfo.m85764x2e2ce293(), articleInfo.m85762x5ae7d1ac(), articleInfo.m85766xff358fa2(), articleInfo.m85769xb5887639(), articleInfo.m85757x7235c680(), articleInfo.m85770x6bf53a6c(), articleInfo.m85761x80025a04(), articleInfo.m85768x7531c8a2(), articleInfo.m85755x66e287ae(), articleInfo.m85753xca0b430(), articleInfo.m85765x8eabbfcf(), articleInfo.m85760xcf411f1b(), articleInfo.m85754x6b6d78f4(), articleInfo.m85758x27681aaa(), articleInfo.m85756x6de99b06());
        yw.h1 h1Var = yw.h1.f547865a;
        android.content.Context context = this.f403532d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        h1Var.t(aVar, context);
    }
}
