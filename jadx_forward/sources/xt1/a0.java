package xt1;

/* loaded from: classes8.dex */
public class a0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f537972d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f537973e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f537974f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f537975g = new java.util.LinkedList();

    public a0(java.util.LinkedList linkedList) {
        this.f537974f = linkedList;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ff();
        lVar.f152198b = new r45.gf();
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchgetcarditem";
        lVar.f152200d = 1074;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f537972d = a17;
        r45.ff ffVar = (r45.ff) a17.f152243a.f152217a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList != null && linkedList.size() != 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                xt1.r0 r0Var = (xt1.r0) it.next();
                if (r0Var != null) {
                    linkedList2.add(r0Var.f66167xe3413ddb);
                }
            }
        }
        ffVar.f455802d = linkedList2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f537973e = u0Var;
        return mo9409x10f9447a(sVar, this.f537972d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1074;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        java.util.Iterator it;
        int i28;
        boolean mo9952xce0038c9;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            this.f537973e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.lang.String str2 = ((r45.gf) this.f537972d.f152244b.f152233a).f456714d;
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
            this.f537973e.mo815x76e0bfae(4, -1, null, this);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList c17 = lu1.t.c(str2);
        if (c17 != null) {
            java.util.LinkedList linkedList = this.f537975g;
            java.util.LinkedList linkedList2 = this.f537974f;
            if (linkedList2 != null) {
                linkedList.addAll(linkedList2);
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            java.util.Iterator it6 = c17.iterator();
            int i29 = 0;
            int i37 = 0;
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) it6.next();
                int i38 = i37 + 1;
                if (c13038x357affe == null) {
                    it = it6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardUtil", "processCardObject fail, card is null");
                    i28 = i38;
                    mo9952xce0038c9 = false;
                } else {
                    it = it6;
                    i28 = i38;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe z07 = xt1.t0.cj().z0("" + c13038x357affe.f67736x95970a65);
                    if (z07 == null) {
                        mo9952xce0038c9 = xt1.t0.cj().mo880xb970c2b9(c13038x357affe);
                        if (!mo9952xce0038c9) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardUtil", "processCardObject, insert fail");
                        }
                    } else {
                        c13038x357affe.f67752xead628a4 = z07.f67752xead628a4;
                        c13038x357affe.f67751xba4dbd9a = z07.f67751xba4dbd9a;
                        c13038x357affe.f67750x5da73d35 = z07.f67750x5da73d35;
                        mo9952xce0038c9 = xt1.t0.cj().mo9952xce0038c9(c13038x357affe, new java.lang.String[0]);
                    }
                }
                if (!mo9952xce0038c9) {
                    i29++;
                    if (c13038x357affe != null) {
                        xt1.r0 r0Var = new xt1.r0();
                        r0Var.f66167xe3413ddb = c13038x357affe.f67736x95970a65;
                        linkedList.remove(r0Var);
                    }
                }
                it6 = it;
                i37 = i28;
            }
            gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd do transaction use time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, deal CardObject %d fail of %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
            lu1.a0.J();
            if (c17.size() > 0) {
                int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c344.m40330x4c144dd(281);
                c4582x424c344.m40331x936762bd(43);
                c4582x424c344.m40332x57b2b64f(1L);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3442.m40330x4c144dd(281);
                c4582x424c3442.m40331x936762bd(44);
                c4582x424c3442.m40332x57b2b64f(currentTimeMillis3);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3443.m40330x4c144dd(281);
                c4582x424c3443.m40331x936762bd(45);
                c4582x424c3443.m40332x57b2b64f(c17.size());
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3444.m40330x4c144dd(281);
                c4582x424c3444.m40331x936762bd(47);
                c4582x424c3444.m40332x57b2b64f(currentTimeMillis3 / c17.size());
                arrayList.add(c4582x424c344);
                arrayList.add(c4582x424c3442);
                arrayList.add(c4582x424c3443);
                arrayList.add(c4582x424c3444);
                i27 = 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
                this.f537973e.mo815x76e0bfae(i27, i27, str, this);
            }
        }
        i27 = 0;
        this.f537973e.mo815x76e0bfae(i27, i27, str, this);
    }
}
