package c61;

/* loaded from: classes5.dex */
public final class xa implements com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24575x5e393431, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f120945d;

    public xa() {
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        p3325xe03a0797.p3326xc267989b.z0.c(b17, null);
        this.f120945d = b17;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f120945d = p3325xe03a0797.p3326xc267989b.z0.b();
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24575x5e393431.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24575x5e393431.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24575x5e393431.Companion.m91106x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3325xe03a0797.p3326xc267989b.z0.e(this.f120945d, null, 1, null);
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24575x5e393431.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24575x5e393431.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24575x5e393431.Companion.m91106x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24575x5e393431
    /* renamed from: send */
    public void mo14429x35cf88(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24580xe2b43b66 request, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(this.f120945d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new c61.ta(request, callback, null), 2, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24575x5e393431
    /* renamed from: sendFinder */
    public void mo14430x61c6dce(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24580xe2b43b66 request, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24574xdd503f00 extInfo, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(this.f120945d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new c61.wa(request, extInfo, callback, null), 2, null);
    }
}
