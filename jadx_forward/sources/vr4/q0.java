package vr4;

/* loaded from: classes.dex */
public class q0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f521326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 f521327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr4.r0 f521328f;

    public q0(vr4.r0 r0Var, int i17, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5) {
        this.f521328f = r0Var;
        this.f521326d = i17;
        this.f521327e = c6236xbc6b9a5;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        gm0.j1.i();
        gm0.j1.n().f354821b.q(1767, this);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5 = this.f521327e;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleWCPayWalletBufferListener", "check jsapi error: %s, %s", java.lang.Integer.valueOf(i18), str);
            am.f10 f10Var = c6236xbc6b9a5.f136485h;
            f10Var.f88159a = -1;
            f10Var.f88161c.run();
            return;
        }
        java.lang.String str2 = c6236xbc6b9a5.f136484g.f88067j;
        this.f521328f.getClass();
        int i19 = this.f521326d;
        if (i19 == 1) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_WALLET_BUFFER_CN_STRING_SYNC, str2);
        } else if (i19 == 2) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_WALLET_BUFFER_MY_STRING_SYNC, str2);
        } else if (i19 == 4) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_WALLET_BUFFER_ZA_STRING_SYNC, str2);
        } else if (i19 == 8) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_WALLET_BUFFER_HK_STRING_SYNC, str2);
        }
        c6236xbc6b9a5.f136485h.f88161c.run();
    }
}
