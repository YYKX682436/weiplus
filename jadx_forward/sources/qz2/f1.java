package qz2;

/* loaded from: classes9.dex */
public final class f1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f449393d;

    public f1(qz2.j1 j1Var) {
        this.f449393d = j1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        qz2.y0 y0Var = (qz2.y0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "on receive state: " + y0Var);
        boolean z17 = y0Var instanceof qz2.x0;
        qz2.j1 j1Var = this.f449393d;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = j1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x19263085).m83134x2b33b77f(false);
            return;
        }
        if (y0Var instanceof qz2.u0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = j1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x192630852).mo48627xce38d9a();
            return;
        }
        if (y0Var instanceof qz2.v0) {
            java.lang.String str = ((qz2.v0) y0Var).f449450a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k);
            }
            db5.e1.E(j1Var.m158354x19263085(), str, "", j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), false, new qz2.c1(j1Var));
            return;
        }
        if (y0Var instanceof qz2.w0) {
            qz2.w0 w0Var = (qz2.w0) y0Var;
            java.lang.String str2 = w0Var.f449454b;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str2 = j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k);
            }
            db5.e1.C(j1Var.m158354x19263085(), str2, w0Var.f449453a, j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f575162l14), j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), false, new qz2.d1(j1Var), new qz2.e1(j1Var));
        }
    }
}
