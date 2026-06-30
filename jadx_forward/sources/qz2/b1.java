package qz2;

/* loaded from: classes9.dex */
public final class b1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f449377d;

    public b1(qz2.j1 j1Var) {
        this.f449377d = j1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        qz2.t0 t0Var = (qz2.t0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "on receive event: " + t0Var);
        boolean z17 = t0Var instanceof qz2.n0;
        qz2.j1 j1Var = this.f449377d;
        if (z17) {
            java.lang.String stringExtra = j1Var.m158359x1e885992().getStringExtra("kindaPayPwd");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "password is null");
                j1Var.m158354x19263085().finish();
                return;
            }
            nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
            if (!oVar.ja()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "not enrolled fingerprint");
                j1Var.m158354x19263085().finish();
                return;
            } else if (mz2.m0.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "has opened touch pay");
                j1Var.m158354x19263085().finish();
                return;
            } else if (oVar.Je()) {
                ju5.n.c().b();
                j1Var.P6(new qz2.r0(stringExtra));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "can't use soter");
                j1Var.m158354x19263085().finish();
                return;
            }
        }
        if (t0Var instanceof qz2.r0) {
            j1Var.O6(qz2.x0.f449458a);
            java.lang.String str = ((qz2.r0) t0Var).f449439a;
            ((nz2.o) gm0.j1.s(nz2.o.class)).D1(new java.lang.Object[0]);
            j1Var.f449412d = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: start gen auth key");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 35);
            java.lang.Object mo141623x754a37bb = ((jz5.n) j1Var.f449413e).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            qz2.h1 h1Var = new qz2.h1(j1Var);
            ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
            ((ne4.n) ((d50.q) mo141623x754a37bb)).b(h1Var, true, 1, new oz2.c(str, 1), 0);
            return;
        }
        if (t0Var instanceof qz2.m0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = j1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x19263085).m83099x5406100e(new oz2.a(1), false);
            return;
        }
        if (t0Var instanceof qz2.s0) {
            j1Var.O6(qz2.u0.f449446a);
            java.lang.String str2 = ((qz2.s0) t0Var).f449442a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "request authentication");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "no challenge!!");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 41);
            nz2.o oVar2 = (nz2.o) gm0.j1.s(nz2.o.class);
            nz2.f fVar = new nz2.f(str2, 1);
            fVar.f423089d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.heh);
            fVar.f423090e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.heg);
            fVar.f423091f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            oVar2.g9(j1Var.m80379x76847179(), fVar, new qz2.i1(j1Var));
            return;
        }
        if (t0Var instanceof qz2.o0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = j1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            d50.k kVar = (d50.k) i95.n0.c(d50.k.class);
            qz2.o0 o0Var = (qz2.o0) t0Var;
            java.lang.String str3 = o0Var.f449428a;
            java.lang.String str4 = j1Var.f449412d;
            ((d50.i) kVar).getClass();
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x192630852).m83099x5406100e(new oz2.b(str3, o0Var.f449429b, str4, 1), true);
            return;
        }
        if (t0Var instanceof qz2.l0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = j1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x192630853).m83099x5406100e(new ss4.e0(null, 19), true);
        } else if (t0Var instanceof qz2.p0) {
            db5.e1.E(j1Var.m158354x19263085(), j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_m), j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_j), j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kuq), false, new qz2.a1(j1Var));
        } else if (t0Var instanceof qz2.q0) {
            j1Var.m158354x19263085().finish();
        }
    }
}
