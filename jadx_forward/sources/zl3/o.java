package zl3;

/* loaded from: classes11.dex */
public final class o implements com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.InterfaceC24022x66b0a20a, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.InterfaceC24022x66b0a20a
    /* renamed from: getChatUserName */
    public com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.C24028x99078ebe mo88841x8a59aee4() {
        yl3.f fVar = ((ma0.h) ((ka0.i0) i95.n0.c(ka0.i0.class))).f406673e;
        java.lang.String str = fVar != null ? ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v0) fVar).f270635a : null;
        if (str == null) {
            str = "";
        }
        return new com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.C24028x99078ebe(str);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.InterfaceC24022x66b0a20a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.InterfaceC24022x66b0a20a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.InterfaceC24022x66b0a20a.Companion.m88844x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.InterfaceC24022x66b0a20a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.InterfaceC24022x66b0a20a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.InterfaceC24022x66b0a20a.Companion.m88844x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.InterfaceC24022x66b0a20a
    /* renamed from: sendMusicToChat */
    public void mo88842xa6d29e50(com.p314xaae8f345.p2845xc516c4b6.p2861x1a85a135.C24027x88f6b472 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ot0.q qVar = new ot0.q();
        qVar.f430199i = 76;
        qVar.f430187f = request.m88871xd75a8eb6();
        qVar.f430191g = request.m88870x2f4fa672();
        java.lang.String m88872x35e4f471 = request.m88872x35e4f471();
        if (m88872x35e4f471 == null) {
            m88872x35e4f471 = "";
        }
        qVar.f430207k = m88872x35e4f471;
        qVar.f430211l = "";
        java.lang.String m88865x93d2812f = request.m88865x93d2812f();
        if (m88865x93d2812f == null) {
            m88865x93d2812f = "";
        }
        qVar.V = m88865x93d2812f;
        qVar.W = "";
        qVar.f430179d = request.m88863x74292946();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0 i0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0();
        i0Var.f273223b = request.m88864x66e287ae();
        i0Var.f273224c = request.m88866x74c84aa9();
        i0Var.f273237p = request.m88867xb5885712();
        i0Var.f273229h = request.m88870x2f4fa672();
        i0Var.f273227f = request.m88864x66e287ae();
        qVar.f(i0Var);
        yl3.f fVar = ((ma0.h) ((ka0.i0) i95.n0.c(ka0.i0.class))).f406673e;
        if (fVar != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(ot0.q.i(qVar), qVar.f430179d, qVar.H, ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v0) fVar).f270635a, "", null);
        }
    }
}
