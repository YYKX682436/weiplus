package ms4;

/* loaded from: classes8.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.n f412591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f412594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im5.b f412595e;

    public l(ms4.n nVar, java.lang.String str, java.lang.String str2, int i17, im5.b bVar) {
        this.f412591a = nVar;
        this.f412592b = str;
        this.f412593c = str2;
        this.f412594d = i17;
        this.f412595e = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.ns5 ns5Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        os4.a.a(this.f412591a.f412609p, java.lang.Boolean.FALSE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashViewModel", "encashIncome errorType: " + fVar.f152148a + ", errorCode: " + fVar.f152149b + ", errorMsg: " + fVar.f152150c);
        if (os4.h.g(fVar)) {
            this.f412591a.O6(7, 3, fVar.f152149b, fVar.f152150c);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 98);
            int i17 = fVar.f152149b;
            if (i17 == 10001) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
                r45.ck0 ck0Var = (r45.ck0) resp;
                if (ck0Var != null && (ns5Var = ck0Var.f453150f) != null) {
                    ms4.n nVar = this.f412591a;
                    java.lang.String str = this.f412592b;
                    java.lang.String str2 = this.f412593c;
                    int i18 = this.f412594d;
                    im5.b bVar = this.f412595e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                    os4.h.k("MicroMsg.WeCoinEncashViewModel", resp);
                    ((ku5.t0) ku5.t0.f394148d).k(new ms4.k(nVar, str, str2, i18, bVar), ns5Var.f463185d);
                }
            }
            this.f412591a.f412606m.mo7808x76db6cb1(new ms4.a(fVar.f152148a, i17, fVar.f152150c, (r45.js5) fVar.f152151d));
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (fVar2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 98);
                this.f412591a.f412606m.mo7808x76db6cb1(new ms4.a(3, -1, "", null, 8, null));
                this.f412591a.O6(7, 3, -1, "callback resp is null");
            } else {
                r45.ck0 ck0Var2 = (r45.ck0) fVar2;
                ms4.n nVar2 = this.f412591a;
                nVar2.O6(7, 3, 0, "");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 97);
                os4.h.k("MicroMsg.WeCoinEncashViewModel", ck0Var2);
                nVar2.f412607n.mo7808x76db6cb1(ck0Var2.f453148d);
            }
        }
        return jz5.f0.f384359a;
    }
}
