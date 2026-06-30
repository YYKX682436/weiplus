package qz2;

/* loaded from: classes9.dex */
public final class a2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f449372d;

    public a2(qz2.i2 i2Var) {
        this.f449372d = i2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        qz2.t1 t1Var = (qz2.t1) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "on receive event: " + t1Var);
        boolean z17 = t1Var instanceof qz2.n1;
        qz2.i2 i2Var = this.f449372d;
        if (z17) {
            android.os.Bundle e17 = com.p314xaae8f345.mm.p2802xd031a825.a.e(i2Var.m158354x19263085());
            if (e17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayUIC", "contextdata is null,for that reason program can't get user pwd");
                re4.n.g(1000, -1000223, -1, "contextdata is null,for that reason program can't get user pwd");
                i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k)));
                return;
            }
            java.lang.String string = e17.getString("pwd");
            if (android.text.TextUtils.isEmpty(string)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayUIC", "get user pwd error");
                re4.n.g(1000, -1000223, -1, "get user pwd error");
                i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k)));
                return;
            }
            nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
            if (!oVar.ja()) {
                i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kut)));
                return;
            } else {
                if (!oVar.Je()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayUIC", "device is not support FingerPrintAuth");
                    return;
                }
                ju5.n.c().b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                i2Var.P6(new qz2.r1(string));
                return;
            }
        }
        if (t1Var instanceof qz2.r1) {
            i2Var.O6(qz2.x1.f449459a);
            java.lang.String str = ((qz2.r1) t1Var).f449440a;
            ((nz2.o) gm0.j1.s(nz2.o.class)).D1(new java.lang.Object[0]);
            i2Var.f449407d = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "hy: start gen auth key");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 35);
            java.lang.Object mo141623x754a37bb = ((jz5.n) i2Var.f449408e).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            qz2.g2 g2Var = new qz2.g2(i2Var);
            ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
            ((ne4.n) ((d50.q) mo141623x754a37bb)).b(g2Var, true, 1, new oz2.c(str, 1), 0);
            return;
        }
        if (t1Var instanceof qz2.m1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = i2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x19263085).m83099x5406100e(new oz2.a(1), false);
            return;
        }
        if (t1Var instanceof qz2.s1) {
            i2Var.O6(qz2.u1.f449447a);
            java.lang.String str2 = ((qz2.s1) t1Var).f449443a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "request authentication");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOpenTouchPayUIC", "no challenge!!");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 41);
            nz2.o oVar2 = (nz2.o) gm0.j1.s(nz2.o.class);
            nz2.f fVar = new nz2.f(str2, 1);
            fVar.f423089d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.heh);
            fVar.f423090e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.heg);
            fVar.f423091f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            oVar2.g9(i2Var.m80379x76847179(), fVar, new qz2.h2(i2Var));
            return;
        }
        if (t1Var instanceof qz2.o1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = i2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
            qz2.o1 o1Var = (qz2.o1) t1Var;
            java.lang.String str3 = o1Var.f449430a;
            java.lang.String str4 = i2Var.f449407d;
            ((d50.i) kVar).getClass();
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x192630852).m83099x5406100e(new oz2.b(str3, o1Var.f449431b, str4, 1), true);
            return;
        }
        if (t1Var instanceof qz2.l1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = i2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x192630853).m83099x5406100e(new ss4.e0(null, 19), true);
        } else if (t1Var instanceof qz2.p1) {
            com.p314xaae8f345.mm.p2802xd031a825.a.c(i2Var.m158354x19263085(), new android.os.Bundle(), 0);
            db5.t7.m123882x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f_l, 0).show();
        } else if (t1Var instanceof qz2.q1) {
            com.p314xaae8f345.mm.p2802xd031a825.a.c(i2Var.m158354x19263085(), new android.os.Bundle(), ((qz2.q1) t1Var).f449437a);
        }
    }
}
