package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes4.dex */
public class i3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f221871d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f221872e;

    public i3(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cv3();
        lVar.f152198b = new r45.dv3();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gethvgamemenu";
        lVar.f152200d = 1369;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f221872e = a17;
        r45.cv3 cv3Var = (r45.cv3) a17.f152243a.f152217a;
        cv3Var.f453385e = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        java.lang.String d07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        cv3Var.f453386f = d07;
        cv3Var.f453384d = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneHVGameGetMenu", "lang=%s, country=%s, appid=%s", cv3Var.f453385e, d07, str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f221871d = u0Var;
        return mo9409x10f9447a(sVar, this.f221872e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1369;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneHVGameGetMenu", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        if (i18 != 0 || i19 != 0) {
            this.f221871d.mo815x76e0bfae(i18, i19, str, this);
        } else if (((r45.dv3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a) == null) {
            this.f221871d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f221871d.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
