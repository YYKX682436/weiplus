package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class e3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f221836d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f221837e;

    public e3(java.lang.String str, java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var3, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameIndex4", "lang = " + str + ", installedApp list size: " + linkedList.size());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameIndex4", "install id:[%s]", (java.lang.String) it.next());
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new m53.z1();
        lVar.f152198b = new m53.a2();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getgameindex4";
        lVar.f152200d = 2994;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f221837e = a17;
        m53.z1 z1Var = (m53.z1) a17.f152243a.f152217a;
        z1Var.f405752d = str;
        z1Var.f405753e = linkedList;
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v.f222021a) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : d17 : com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v.f222021a;
        z1Var.f405754f = d17;
        e1Var = e1Var == null ? e1Var2 != null ? e1Var2 : e1Var3 != null ? e1Var3 : null : e1Var;
        m53.h0 h0Var = new m53.h0();
        z1Var.f405755g = h0Var;
        if (e1Var != null) {
            h0Var.f405270d = e1Var.f221812d2.f221943a;
            h0Var.f405271e = e1Var.f68449x28d45f97;
            h0Var.f405273g = e1Var.T2;
            h0Var.f405274h = e1Var.S2;
        }
        if (e1Var2 != null) {
            h0Var.f405272f |= 1;
        }
        if (e1Var3 != null) {
            h0Var.f405272f |= 2;
        }
        z1Var.f405756h = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().d1();
        z1Var.f405757i = z17;
        z1Var.f405758m = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameIndex4", "Country Code: %s", d17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z1Var.f405754f) || "CN".equalsIgnoreCase(z1Var.f405754f)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(860L, 7L, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f221836d = u0Var;
        return mo9409x10f9447a(sVar, this.f221837e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2994;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameIndex4", "errType = " + i18 + ", errCode = " + i19);
        this.f221836d.mo815x76e0bfae(i18, i19, str, this);
    }
}
