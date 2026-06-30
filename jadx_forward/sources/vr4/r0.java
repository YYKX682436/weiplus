package vr4;

/* loaded from: classes.dex */
public class r0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public r0() {
        super(0);
    }

    public final void b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "do check pay jsapi");
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1767, u0Var);
        am.e10 e10Var = c6236xbc6b9a5.f136484g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "appId: %s, \nnonce: %s, \ntimestamp: %s, \npackage: %s, \nsign: %s, \nsignType: %s, \nurl: %s", e10Var.f88058a, e10Var.f88063f, e10Var.f88059b, e10Var.f88060c, e10Var.f88061d, e10Var.f88062e, e10Var.f88064g);
        ts4.a aVar = new ts4.a(e10Var.f88058a, e10Var.f88063f, e10Var.f88059b, e10Var.f88060c, e10Var.f88061d, e10Var.f88062e, e10Var.f88064g);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(aVar);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5) abstractC20979x809547d1;
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        int m17 = c01.z1.m();
        am.f10 f10Var = c6236xbc6b9a5.f136485h;
        f10Var.f88159a = 0;
        if (m17 == 4) {
            am.e10 e10Var = c6236xbc6b9a5.f136484g;
            if (intValue == e10Var.f88066i) {
                if ("fetch".equals(e10Var.f88065h)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "do fetch");
                    java.lang.String str = "";
                    if (intValue == 1) {
                        gm0.j1.i();
                        str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_WALLET_BUFFER_CN_STRING_SYNC, "");
                    } else if (intValue == 2) {
                        gm0.j1.i();
                        str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_WALLET_BUFFER_MY_STRING_SYNC, "");
                    } else if (intValue == 4) {
                        gm0.j1.i();
                        str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_WALLET_BUFFER_ZA_STRING_SYNC, "");
                    } else if (intValue == 8) {
                        gm0.j1.i();
                        str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_WALLET_BUFFER_HK_STRING_SYNC, "");
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "fetch empty buffer");
                        f10Var.f88159a = -2;
                    } else {
                        b(c6236xbc6b9a5, new vr4.p0(this, c6236xbc6b9a5, str));
                    }
                } else if ("save".equals(e10Var.f88065h)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "do save");
                    b(c6236xbc6b9a5, new vr4.q0(this, intValue, c6236xbc6b9a5));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "wrong action: %s", e10Var.f88065h);
                    f10Var.f88159a = -1;
                }
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "wrong region, client: %s, req: %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(e10Var.f88066i));
            f10Var.f88159a = -1;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "wrong type: %s", java.lang.Integer.valueOf(m17));
            f10Var.f88159a = -1;
        }
        f10Var.f88161c.run();
        return false;
    }
}
