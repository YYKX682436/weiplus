package fj1;

/* loaded from: classes7.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.h f344644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fj1.h hVar) {
        super(0);
        this.f344644d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fj1.y yVar;
        java.util.ArrayList arrayList;
        yVar = this.f344644d.f344645d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 e17 = yVar.e();
        java.lang.Object mo141623x754a37bb = ((jz5.n) yVar.f344687n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        k91.r rVar = (k91.r) mo141623x754a37bb;
        uh1.a aVar = new uh1.a();
        aVar.f509273d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.a.c(e17);
        k91.e eVar = rVar.f387280q;
        int i17 = eVar.f387096a;
        if (i17 > 0) {
            aVar.f509274e = i17;
        }
        int i18 = eVar.f387097b;
        if (i18 > 0) {
            aVar.f509275f = i18;
        }
        int i19 = eVar.f387098c;
        if (i19 > 0) {
            aVar.f509276g = i19;
        }
        int i27 = eVar.f387099d;
        if (i27 > 0) {
            aVar.f509277h = i27;
        }
        aVar.f509278i = e17.F;
        aVar.f509279m = e17.I;
        aVar.f509280n = e17.G;
        aVar.f509281o = e17.H;
        aVar.f509282p = e17.P;
        aVar.f509283q = e17.Q;
        aVar.f509284r = e17.R;
        aVar.f509285s = e17.S;
        aVar.f509286t = e17.T;
        aVar.f509287u = e17.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.HttpSetting httpSetting = e17.Y.f158754s;
        int i28 = httpSetting.f158784d;
        if (i28 == 1) {
            java.util.ArrayList arrayList2 = httpSetting.f158785e;
            if (arrayList2 != null) {
                aVar.f509288v = arrayList2;
            }
        } else if (i28 == 2 && (arrayList = httpSetting.f158786f) != null) {
            aVar.f509289w = arrayList;
        }
        aVar.E = i28;
        aVar.f509290x = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a c11807xf443363a = e17.Y;
        aVar.f509291y = c11807xf443363a.f158743h;
        aVar.f509292z = c11807xf443363a.f158766z1;
        aVar.A = e17.K;
        aVar.G = e17.L;
        aVar.B = k91.d3.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, k91.n0.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAMagicBrushFrameConfigAdapter", "runtime(%s).getNetworkConfig.userAgentString = [ %s ]", yVar.c(), aVar.B);
        sd1.a aVar2 = (sd1.a) nd.f.a(sd1.a.class);
        if (aVar2 != null) {
            aVar.C = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5) aVar2).a(rVar.L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("", "getNetworkConfig, referrerHelper is null");
        }
        aVar.D = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.a.a(e17);
        aVar.F = false;
        aVar.H = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(e17.f387385r.f156932d);
        if (pe.a.f435121a != null) {
            java.lang.String a17 = j62.e.g().a("clicfg_appbrand_network_check_user_trust_ca", "", true, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAMagicBrushFrameConfigAdapter", "exptCheckCA = %s", a17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) || !a17.equalsIgnoreCase("false")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAMagicBrushFrameConfigAdapter", "exptCheckCA has no delegate");
            } else {
                aVar.I = false;
            }
        }
        return aVar;
    }
}
