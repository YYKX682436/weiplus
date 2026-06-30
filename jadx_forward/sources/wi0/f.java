package wi0;

/* loaded from: classes4.dex */
public final class f implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24227x4836afdd {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f527676d = p3325xe03a0797.p3326xc267989b.z0.b();

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24227x4836afdd
    /* renamed from: getImageFile */
    public void mo89660xcb0f5ec1(com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24220xddc1739a request, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(this.f527676d, null, null, new wi0.d(request, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24227x4836afdd
    /* renamed from: getLatestSns */
    public void mo89661x93d525bb(com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.C24222xdef41dcd request, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String m89608x6c03c64c = request.m89608x6c03c64c();
        long m89607x8c3238 = request.m89607x8c3238();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPluginSnsDataSource", "getLatestSns(" + m89608x6c03c64c + "), timeLimit:" + m89607x8c3238);
        xi0.f fVar = new xi0.f(m89608x6c03c64c);
        wi0.e eVar = new wi0.e(callback);
        fVar.f536217f = m89607x8c3238;
        fVar.f536218g = eVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLatestSnsInfo username:");
        java.lang.String str = fVar.f536215d;
        sb6.append(str);
        sb6.append(", timeLimit:");
        sb6.append(m89607x8c3238);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", sb6.toString());
        if (ui0.a.a(str)) {
            yz5.l lVar = fVar.f536218g;
            if (lVar != null) {
                lVar.mo146xb9724478(new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.e());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", "do not show sns cause in black list!");
            return;
        }
        gm0.j1.n().f354821b.a(212, fVar);
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        java.lang.String str2 = fVar.f536215d;
        boolean z17 = fVar.f536216e;
        r1Var.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3(str2, 0L, z17, 0, -1, 0, z17 ? 4 : 8, 2));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24227x4836afdd.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24227x4836afdd.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2865x1470b3ce.InterfaceC24227x4836afdd.Companion.m89663x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3325xe03a0797.p3326xc267989b.z0.e(this.f527676d, null, 1, null);
    }
}
