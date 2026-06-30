package wi0;

/* loaded from: classes10.dex */
public final class i implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24232x82640564 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f527683d = p3325xe03a0797.p3326xc267989b.z0.b();

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24232x82640564
    /* renamed from: getImageFile */
    public void mo89671xcb0f5ec1(com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24223x8cdb668d request, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(this.f527683d, null, null, new wi0.g(request, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24232x82640564
    /* renamed from: getTextStatus */
    public void mo89672x5c9a6375(com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24225x60b67d7a request, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String m89644x6c03c64c = request.m89644x6c03c64c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPluginTextStatusDataSource", "getTextStatus(" + m89644x6c03c64c + ')');
        p3325xe03a0797.p3326xc267989b.l.d(this.f527683d, null, null, new wi0.h(m89644x6c03c64c, callback, null), 3, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24232x82640564.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24232x82640564.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24232x82640564.Companion.m89674x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3325xe03a0797.p3326xc267989b.z0.e(this.f527683d, null, 1, null);
    }
}
