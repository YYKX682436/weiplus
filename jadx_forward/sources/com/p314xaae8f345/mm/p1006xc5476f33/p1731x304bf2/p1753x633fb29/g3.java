package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes5.dex */
public class g3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f221853d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f221854e;

    public g3(int i17, int i18, java.util.LinkedList linkedList, int i19, boolean z17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new m53.j2();
        lVar.f152198b = new m53.k2();
        lVar.f152199c = "/cgi-bin/mmgame-bin/newgetlibgamelist";
        lVar.f152200d = 1218;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f221854e = a17;
        m53.j2 j2Var = (m53.j2) a17.f152243a.f152217a;
        j2Var.f405344d = i17;
        j2Var.f405345e = i18;
        j2Var.f405346f = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        j2Var.f405348h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        j2Var.f405349i = i19;
        j2Var.f405347g = linkedList;
        j2Var.f405350m = z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f221853d = u0Var;
        return mo9409x10f9447a(sVar, this.f221854e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1218;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetLibGameList", "errType = " + i18 + ", errCode = " + i19);
        this.f221853d.mo815x76e0bfae(i18, i19, str, this);
    }
}
