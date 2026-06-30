package qz2;

/* loaded from: classes9.dex */
public final class h2 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f449404a;

    public h2(qz2.i2 i2Var) {
        this.f449404a = i2Var;
    }

    @Override // nz2.b
    public final void a(nz2.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "authentication result: %s", java.lang.Integer.valueOf(cVar.f423076a));
        int i17 = cVar.f423076a;
        qz2.i2 i2Var = this.f449404a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "identify success");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 40);
            i2Var.P6(new qz2.o1(cVar.f423080e, cVar.f423081f));
            return;
        }
        if (i17 == 2005) {
            re4.n.g(1000, -1000223, i17, "fingerprint error");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 39);
            i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiz)));
            return;
        }
        if (i17 == 2007) {
            java.lang.String m158362x2fec8307 = (android.os.Build.VERSION.SDK_INT == 27 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("Xiaomi", android.os.Build.MANUFACTURER)) ? i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.aiw) : i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
            re4.n.g(1000, -1000223, cVar.f423076a, "fingerprint error");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 39);
            i2Var.O6(new qz2.v1(m158362x2fec8307));
            return;
        }
        if (i17 == 10308) {
            re4.n.g(6, -1000223, -1, "too many trial");
            i2Var.O6(new qz2.w1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiy), i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jix)));
            return;
        }
        if (i17 == 2009) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "hy: on error: %d", java.lang.Integer.valueOf(i17));
            re4.n.g(1000, -1000223, cVar.f423076a, "fingerprint error");
            re4.n.a(3, 2);
            i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiv)));
            return;
        }
        if (i17 != 2010) {
            switch (i17) {
                case 2000:
                case 2001:
                    break;
                case 2002:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "identify FingerPrintConst.RESULT_NO_MATCH");
                    return;
                default:
                    i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiv)));
                    return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "identify timeout");
        i2Var.P6(new qz2.q1(cVar.f423076a));
    }
}
