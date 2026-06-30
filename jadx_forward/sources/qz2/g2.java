package qz2;

/* loaded from: classes9.dex */
public final class g2 implements d50.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f449400a;

    public g2(qz2.i2 i2Var) {
        this.f449400a = i2Var;
    }

    @Override // d50.p
    public void a(int i17) {
    }

    @Override // d50.p
    public void b(eu5.c result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        int i17 = result.f557138a;
        qz2.i2 i2Var = this.f449400a;
        if (i17 == 1006) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayUIC", "hy: failed upload: model is null or necessary elements null");
            re4.n.g(4, -1000223, -1, "gen auth key failed: unexpected! generated but cannot get");
        } else if (i17 == 6) {
            re4.n.g(4, -1000223, -1, "gen auth key failed");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(result.f557139b)) {
                java.lang.String errMsg = result.f557139b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(errMsg, "errMsg");
                if (r26.i0.y(errMsg, "java.security.ProviderException", false)) {
                    i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.aix)));
                    return;
                }
            }
            if (wt5.a.g() == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(result.f557139b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(result.f557139b, "errmsg not specified")) {
                i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.aiy)));
                return;
            }
        } else if (i17 == 1004) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayUIC", "hy: update pay auth key failed. remove");
            re4.n.g(5, 4, result.f557138a, "upload auth key failed");
        } else if (i17 == 4 || i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayUIC", "hy: gen auth key failed");
            re4.n.g(2, -1000223, -1, "gen ask failed");
        } else if (i17 == 1003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayUIC", "upload ask failed");
            re4.n.g(3, 4, result.f557138a, result.f557139b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayUIC", "unknown error when prepare auth key");
            re4.n.g(1000, -1000223, result.f557138a, result.f557139b);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 34);
        i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.aiw)));
    }

    @Override // d50.p
    public void c(eu5.c result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f449400a.P6(qz2.m1.f449423a);
    }
}
