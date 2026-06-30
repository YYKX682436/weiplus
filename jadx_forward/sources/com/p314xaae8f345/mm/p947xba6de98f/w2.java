package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes4.dex */
public class w2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152686d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152687e;

    public w2(int i17, int i18, int i19) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCdnDistance", "summersafecdn init Scene ver %d prov %d city %d [%s]", valueOf, valueOf2, valueOf3, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.w86();
        lVar.f152198b = new r45.x86();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsgetcdndistance";
        lVar.f152200d = 7989;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152686d = a17;
        r45.w86 w86Var = (r45.w86) a17.f152243a.f152217a;
        w86Var.f470501d = i17;
        w86Var.f470503f = i18;
        w86Var.f470502e = i19;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152687e = u0Var;
        if (gm0.j1.b().h() != 0) {
            return mo9409x10f9447a(sVar, this.f152686d, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetCdnDistance", "has not set uin.");
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 7989;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.x86 x86Var = (r45.x86) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0 && (gVar = x86Var.f471409d) != null) {
            try {
                ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37777x79cdf615(x86Var.f471410e, x86Var.f471412g, x86Var.f471411f, gVar.g());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetCdnDistance", "what: %s", e17.getLocalizedMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetCdnDistance", e17, "", new java.lang.Object[0]);
            }
            this.f152687e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = java.lang.Integer.valueOf(i19);
        objArr[2] = java.lang.Boolean.valueOf(x86Var.f471409d == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetCdnDistance", "onGYNetEnd: [%d ,%d]  data is null :%b", objArr);
        this.f152687e.mo815x76e0bfae(i18, i19, str, this);
    }
}
