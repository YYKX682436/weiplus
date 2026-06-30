package com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fingerprint/ui/WalletOpenTouchPayApi31UI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fingerprint.ui.WalletOpenTouchPayApi31UI */
/* loaded from: classes9.dex */
public final class ActivityC15527x50898ce0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f218550d = jz5.h.b(new qz2.k1(this));

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (((java.lang.Number) ((jz5.n) this.f218550d).mo141623x754a37bb()).intValue() == 1) {
            qz2.j1 j1Var = (qz2.j1) m80391xac8f1cfd(qz2.j1.class);
            j1Var.getClass();
            java.lang.String m158362x2fec8307 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k) : str;
            if (m1Var instanceof d50.l) {
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: failed get challenge");
                    re4.n.g(7, i17, i18, "get challenge failed");
                    j1Var.O6(new qz2.v0(m158362x2fec8307));
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "get challenge success");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((oz2.a) ((d50.l) m1Var)).f431772f)) {
                    j1Var.O6(new qz2.v0(j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k)));
                    return false;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qz2.g1(j1Var, m1Var));
                return false;
            }
            if (!(m1Var instanceof d50.m)) {
                if (!(m1Var instanceof ss4.e0)) {
                    return false;
                }
                j1Var.P6(qz2.p0.f449433a);
                return false;
            }
            if (i18 != 0 || i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: open");
                re4.n.g(8, i17, i18, "open fp pay failed");
                j1Var.O6(new qz2.v0(""));
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: open success");
            re4.n.h();
            re4.n.g(0, 0, 0, "OK");
            j1Var.P6(qz2.l0.f449419a);
            return false;
        }
        qz2.i2 i2Var = (qz2.i2) m80391xac8f1cfd(qz2.i2.class);
        i2Var.getClass();
        java.lang.String m158362x2fec83072 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k) : str;
        if (m1Var instanceof d50.l) {
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenTouchPayUIC", "hy: failed get challenge");
                re4.n.g(7, i17, i18, "get challenge failed");
                i2Var.O6(new qz2.v1(m158362x2fec83072));
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "get challenge success");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((oz2.a) ((d50.l) m1Var)).f431772f)) {
                i2Var.O6(new qz2.v1(i2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f_k)));
                return false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qz2.f2(i2Var, m1Var));
            return false;
        }
        if (!(m1Var instanceof d50.m)) {
            if (!(m1Var instanceof ss4.e0)) {
                return false;
            }
            i2Var.P6(qz2.p1.f449434a);
            return false;
        }
        if (i18 != 0 || i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "hy: open");
            re4.n.g(8, i17, i18, "open fp pay failed");
            i2Var.O6(new qz2.v1(""));
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenTouchPayUIC", "hy: open success");
        re4.n.h();
        re4.n.g(0, 0, 0, "OK");
        i2Var.P6(qz2.l1.f449420a);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        if (((java.lang.Number) ((jz5.n) this.f218550d).mo141623x754a37bb()).intValue() == 1) {
            set.add(qz2.j1.class);
        } else {
            set.add(qz2.i2.class);
        }
    }
}
