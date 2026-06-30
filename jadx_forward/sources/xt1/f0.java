package xt1;

/* loaded from: classes8.dex */
public class f0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538008d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538009e;

    public f0() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xb3();
        lVar.f152198b = new r45.yb3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getcardcount";
        lVar.f152200d = 1088;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        this.f538008d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538009e = u0Var;
        return mo9409x10f9447a(sVar, this.f538008d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1088;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCardCount", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            r45.yb3 yb3Var = (r45.yb3) this.f538008d.f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCardCount", "has_card_item:" + yb3Var.f472480e + " has_share_card:" + yb3Var.f472481f);
            if (yb3Var.f472480e > 0) {
                lu1.a0.J();
                if (android.text.TextUtils.isEmpty((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, null))) {
                    xt1.t0.wi().a(1);
                }
            }
            if (yb3Var.f472481f > 0) {
                lu1.a0.K();
                java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_REQUENCE_LONG_SYNC, 0L);
                if (l17 != null && l17.longValue() == 0) {
                    xt1.t0.mj().a();
                }
            }
        }
        gm0.j1.u().c().w(282882, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
        this.f538009e.mo815x76e0bfae(i18, i19, str, this);
    }
}
