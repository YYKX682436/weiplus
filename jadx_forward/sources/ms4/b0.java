package ms4;

/* loaded from: classes8.dex */
public final class b0 implements com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412533a;

    /* renamed from: b, reason: collision with root package name */
    public final js4.n f412534b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f412535c;

    public b0(java.lang.String str, js4.n info, java.lang.String uniqueID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueID, "uniqueID");
        this.f412533a = str;
        this.f412534b = info;
        this.f412535c = uniqueID;
    }

    @Override // com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab
    /* renamed from: MidasPayCallBack */
    public void mo41389xe81ffc73(com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec) {
        if (c4728x8ec3caec != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "MidasPayCallBack: resultCode: " + c4728x8ec3caec.f20116xdde293aa + ", resultMsg: " + c4728x8ec3caec.f20118x938b9624 + ", realSaveNum: " + c4728x8ec3caec.f20115x8297754b + ", payChannel: " + c4728x8ec3caec.f20109xb6c1d73b + ", payState: " + c4728x8ec3caec.f20113x51024cc9 + ",provideState: " + c4728x8ec3caec.f20114xe55f0270);
            int i17 = c4728x8ec3caec.f20116xdde293aa;
            js4.n nVar = this.f412534b;
            if (i17 == 0) {
                a(4, 3, i17, c4728x8ec3caec.f20118x938b9624);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 24);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("pay_coin_success", null, kz5.c1.k(new jz5.l("coin_report_session_id", js4.r.f383100c), new jz5.l("coin_business_id", java.lang.Integer.valueOf(js4.r.f383098a))), 25955);
                js4.o oVar = nVar.f383079d;
                if (oVar != null) {
                    oVar.mo14245xe05b4124(null);
                    return;
                }
                return;
            }
            if (i17 != 2) {
                js4.o oVar2 = nVar.f383079d;
                if (oVar2 != null) {
                    oVar2.a(3, i17, c4728x8ec3caec.f20118x938b9624);
                }
                a(4, 3, c4728x8ec3caec.f20116xdde293aa, c4728x8ec3caec.f20118x938b9624);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 25);
                return;
            }
            a(4, 3, i17, c4728x8ec3caec.f20118x938b9624);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 26);
            java.lang.String str = this.f412533a;
            if (!(str == null || str.length() == 0)) {
                a(5, 1, 0, "");
                new ks4.a(str).l().q(new ms4.a0(this));
            }
            js4.o oVar3 = nVar.f383079d;
            if (oVar3 != null) {
                java.lang.String str2 = c4728x8ec3caec.f20118x938b9624;
                oVar3.a(3, -3, str2 != null ? str2 : "");
            }
        }
    }

    @Override // com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab
    /* renamed from: MidasPayNeedLogin */
    public void mo41390x9af5fe25() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "Midas pay need login:");
    }

    public final void a(int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        js4.n nVar = this.f412534b;
        g0Var.d(22129, java.lang.Integer.valueOf(os4.h.d(nVar.f383076a)), nVar.f383078c, this.f412535c, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
    }
}
