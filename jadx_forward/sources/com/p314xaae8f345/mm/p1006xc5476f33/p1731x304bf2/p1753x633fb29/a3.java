package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class a3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f221733f = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.PERMANENT) + "tabnav/";

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p944x882e457a.u0 f221734g = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w2();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f221735d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f221736e;

    public a3() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new m53.b2();
        lVar.f152198b = new m53.c2();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getgameindex4tabnav";
        lVar.f152200d = 2641;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f221736e = lVar.a();
    }

    public static void H(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z2 z2Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            if (z2Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "nav icon download complete! save nav data");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().J0("game_index4_tab_nav", ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x2) z2Var).f222054a);
                return;
            }
            return;
        }
        java.lang.String str = (java.lang.String) list.remove(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGameIndex4TabNav", "iconUrl is null");
            H(list, z2Var);
            return;
        }
        java.lang.String str2 = f221733f + kk.k.g(str.getBytes());
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423615f = str2;
        n11.a.b().d(str, fVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.y2(str, list, z2Var));
    }

    public static void I(m53.c2 c2Var) {
        if (c2Var == null) {
            return;
        }
        java.util.LinkedList linkedList = c2Var.f405131d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "nav list is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            m53.g1 g1Var = (m53.g1) it.next();
            if (g1Var != null) {
                arrayList.add(g1Var.f405230i);
                arrayList.add(g1Var.f405231m);
            }
        }
        H(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x2(c2Var));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f221735d = u0Var;
        return mo9409x10f9447a(sVar, this.f221736e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2641;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f221735d.mo815x76e0bfae(i18, i19, str, this);
    }
}
