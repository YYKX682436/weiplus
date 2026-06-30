package qz2;

/* loaded from: classes9.dex */
public final class i1 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f449406a;

    public i1(qz2.j1 j1Var) {
        this.f449406a = j1Var;
    }

    @Override // nz2.b
    public final void a(nz2.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "authentication result: %s", java.lang.Integer.valueOf(cVar.f423076a));
        int i17 = cVar.f423076a;
        qz2.j1 j1Var = this.f449406a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "identify success");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 40);
            j1Var.P6(new qz2.o0(cVar.f423080e, cVar.f423081f));
            return;
        }
        if (i17 == 2005) {
            re4.n.g(1000, -1000223, i17, "fingerprint error");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 39);
            j1Var.O6(new qz2.v0(j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiz)));
            return;
        }
        if (i17 == 2007) {
            java.lang.String m158362x2fec8307 = (android.os.Build.VERSION.SDK_INT == 27 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("Xiaomi", android.os.Build.MANUFACTURER)) ? j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.aiw) : j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
            re4.n.g(1000, -1000223, cVar.f423076a, "fingerprint error");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 39);
            j1Var.O6(new qz2.v0(m158362x2fec8307));
            return;
        }
        if (i17 == 10308) {
            re4.n.g(6, -1000223, -1, "too many trial");
            j1Var.O6(new qz2.w0(j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiy), j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jix)));
            return;
        }
        if (i17 == 2009) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: on error: %d", java.lang.Integer.valueOf(i17));
            re4.n.g(1000, -1000223, cVar.f423076a, "fingerprint error");
            re4.n.a(3, 2);
            j1Var.O6(new qz2.v0(j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiv)));
            return;
        }
        if (i17 != 2010) {
            switch (i17) {
                case 2000:
                case 2001:
                    break;
                case 2002:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "identify FingerPrintConst.RESULT_NO_MATCH");
                    return;
                default:
                    j1Var.O6(new qz2.v0(j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jiv)));
                    return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "identify timeout");
        j1Var.P6(new qz2.q0(cVar.f423076a));
    }
}
