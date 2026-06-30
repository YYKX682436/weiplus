package qz2;

/* loaded from: classes9.dex */
public final class e2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f449390d;

    public e2(qz2.i2 i2Var) {
        this.f449390d = i2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        qz2.y1 y1Var = (qz2.y1) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "on receive state: " + y1Var);
        boolean z17 = y1Var instanceof qz2.x1;
        qz2.i2 i2Var = this.f449390d;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = i2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x19263085).m83134x2b33b77f(false);
            return;
        }
        if (y1Var instanceof qz2.u1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = i2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x192630852).mo48627xce38d9a();
            return;
        }
        if (y1Var instanceof qz2.v1) {
            java.lang.String str = ((qz2.v1) y1Var).f449451a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k);
            }
            db5.e1.E(i2Var.m158354x19263085(), str, "", i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), false, new qz2.b2(i2Var));
            return;
        }
        if (y1Var instanceof qz2.w1) {
            qz2.w1 w1Var = (qz2.w1) y1Var;
            java.lang.String str2 = w1Var.f449456b;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str2 = i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k);
            }
            db5.e1.C(i2Var.m158354x19263085(), str2, w1Var.f449455a, i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f575162l14), i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), false, new qz2.c2(i2Var), new qz2.d2(i2Var));
        }
    }
}
