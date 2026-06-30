package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class f3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f221845d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f221846e;

    public f3(java.lang.String str, java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var3, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "lang = " + str + ", installedApp list size: " + linkedList.size());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "install id:[%s]", (java.lang.String) it.next());
        }
        m53.d2 d2Var = new m53.d2();
        d2Var.f405148d = str;
        d2Var.f405149e = linkedList;
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v.f222021a) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : d17 : com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v.f222021a;
        d2Var.f405150f = d17;
        e1Var = e1Var == null ? e1Var2 != null ? e1Var2 : e1Var3 != null ? e1Var3 : null : e1Var;
        m53.h0 h0Var = new m53.h0();
        d2Var.f405151g = h0Var;
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
        d2Var.f405152h = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().d1();
        d2Var.f405153i = z17;
        d2Var.f405154m = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "Country Code: %s", d17);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = d2Var;
        lVar.f152198b = new m53.e2();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getgameindexdownloadguidance";
        lVar.f152200d = 2586;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f221845d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f221846e = u0Var;
        return mo9409x10f9447a(sVar, this.f221845d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2586;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "errType = " + i18 + ", errCode = " + i19);
        this.f221846e.mo815x76e0bfae(i18, i19, str, this);
    }
}
