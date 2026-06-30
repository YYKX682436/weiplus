package com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27;

@j95.b
/* loaded from: classes9.dex */
public class g extends i95.w implements j05.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f270102d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f270103e = false;

    /* renamed from: f, reason: collision with root package name */
    public final pq5.i f270104f = new pq5.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.e(this));

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f270105g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f270106h;

    public g() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f270105g = new com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.C19562x5c61ba02(this, a0Var);
        this.f270106h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.plugin.wxpay.PluginWxPay$3
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_byp_sync_paymsg, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g.this;
                if (fj6 == gVar.f270102d) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWxPay", "update enableBypSync to %s", java.lang.Boolean.valueOf(fj6));
                gVar.f270102d = fj6;
                ((bt1.d) ((ct1.u) i95.n0.c(ct1.u.class))).Ai(gVar.f270102d);
                return false;
            }
        };
    }

    public void Ai() {
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        if (oVar.of() == 0) {
            oVar.mo150321xed060d07();
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWxPay", "onAccountInitialized call alive");
        this.f270102d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_byp_sync_paymsg, true);
        ((bt1.d) ((ct1.u) i95.n0.c(ct1.u.class))).Ai(this.f270102d);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
            if (M == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginWxPay", "set payMMKV, but payMMKV is null");
            } else {
                M.x(0);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginWxPay", e17, "", new java.lang.Object[0]);
        }
        this.f270106h.mo48813x58998cd();
        this.f270105g.mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginWxPay", "onAccountReleased call dead");
        ((nz2.o) gm0.j1.s(nz2.o.class)).mo150320xae7a2e7a();
        this.f270106h.mo48814x2efc64();
        this.f270105g.mo48814x2efc64();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        mz2.l0 l0Var = new mz2.l0();
        nz2.h hVar = new nz2.h();
        l0Var.c(hVar);
        gm0.j1.q(pz2.a.class, l0Var);
        gm0.j1.q(nz2.o.class, hVar);
        gm0.j1.q(js4.i.class, new ms4.z());
        com.p314xaae8f345.mm.p2802xd031a825.a.h("WXCreditOpenProcess", c05.q.class);
        com.p314xaae8f345.mm.p2802xd031a825.a.h("WXCreditManagerProcess", c05.h.class);
        com.p314xaae8f345.mm.p2802xd031a825.a.h("FingerprintAuth", qz2.b.class);
    }

    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m1 wi() {
        if (gm0.j1.a()) {
            return (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m1) this.f270104f.a();
        }
        throw new c01.c();
    }
}
