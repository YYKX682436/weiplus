package lx;

/* loaded from: classes11.dex */
public final class y5 implements com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f403552d;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403552d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a.Companion.m87437x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403552d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403552d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a.Companion.m87437x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403552d = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a
    /* renamed from: openLink */
    public void mo87433xe1e81564(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterLinkPlugin", "openLink url:%s", url);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("geta8key_scene", 56);
        j45.l.j(this.f403552d, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a
    /* renamed from: openLocation */
    public void mo87434x5a0401f(com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.C23615x16a1790b linkWrap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkWrap, "linkWrap");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterLinkPlugin", "openLocation address:%s, name:%s", linkWrap.m87457xf964d7be(), linkWrap.m87464xfb82e301());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 10);
        java.lang.String m87462x2605e9e2 = linkWrap.m87462x2605e9e2();
        intent.putExtra("kwebmap_slat", m87462x2605e9e2 != null ? java.lang.Double.valueOf(java.lang.Double.parseDouble(m87462x2605e9e2)) : null);
        java.lang.String m87463x79d7af9 = linkWrap.m87463x79d7af9();
        intent.putExtra("kwebmap_lng", m87463x79d7af9 != null ? java.lang.Double.valueOf(java.lang.Double.parseDouble(m87463x79d7af9)) : null);
        intent.putExtra("kPoiName", linkWrap.m87464xfb82e301());
        intent.putExtra("Kwebmap_locaion", linkWrap.m87457xf964d7be());
        intent.putExtra("kPoiid", linkWrap.m87465x74fbf74f());
        intent.putExtra("kimg_path", linkWrap.m87461xb588488d());
        j45.l.j(this.f403552d, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.InterfaceC23609x58d7162a
    /* renamed from: openWeAppLink */
    public void mo87435x114bf7e3(com.p314xaae8f345.p2845xc516c4b6.p2850xaf3f29eb.C23616x139b2595 linkWrap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkWrap, "linkWrap");
        java.lang.String m87483x74292566 = linkWrap.m87483x74292566();
        java.lang.String m87485xaf1298ca = linkWrap.m87485xaf1298ca();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterLinkPlugin", "openWeAppLink appId:%s, path:%s", m87483x74292566, m87485xaf1298ca);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        java.lang.Long m87486x7520bed6 = linkWrap.m87486x7520bed6();
        c12559xbdae8559.f169323f = m87486x7520bed6 != null ? (int) m87486x7520bed6.longValue() : 0;
        c12559xbdae8559.f169324g = linkWrap.m87487x667e87e8();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(this.f403552d, null, m87483x74292566, 0, 0, m87485xaf1298ca, c12559xbdae8559);
    }
}
