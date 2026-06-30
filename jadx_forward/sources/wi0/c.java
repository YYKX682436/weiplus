package wi0;

/* loaded from: classes11.dex */
public final class c implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24210xdaf47d4b {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f527671d = p3325xe03a0797.p3326xc267989b.z0.b();

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24210xdaf47d4b
    /* renamed from: getImageFile */
    public void mo89521xcb0f5ec1(com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24217x3ed66034 request, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(this.f527671d, null, null, new wi0.a(request, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24210xdaf47d4b
    /* renamed from: getLatestFinders */
    public void mo89522xfcb51bd0(com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24219xd944b198 request, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String m89570x6c03c64c = request.m89570x6c03c64c();
        long m89569x8c3238 = request.m89569x8c3238();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPluginFinderDataSource", "getLatestFinders(" + m89570x6c03c64c + ", " + m89569x8c3238 + ')');
        p3325xe03a0797.p3326xc267989b.l.d(this.f527671d, null, null, new wi0.b(m89570x6c03c64c, m89569x8c3238, callback, null), 3, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPluginFinderDataSource", "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24210xdaf47d4b.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24210xdaf47d4b.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24210xdaf47d4b.Companion.m89524x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPluginFinderDataSource", "onDetachedFromEngine");
        p3325xe03a0797.p3326xc267989b.z0.e(this.f527671d, null, 1, null);
    }
}
