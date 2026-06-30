package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class e3 extends o13.b implements xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f219047e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f219048f;

    /* renamed from: g, reason: collision with root package name */
    public o13.v f219049g;

    /* renamed from: h, reason: collision with root package name */
    public w13.j f219050h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f219051i = false;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f219052m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f219053n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f219054o;

    /* renamed from: p, reason: collision with root package name */
    public final p13.n f219055p;

    public e3() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f219052m = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.C15582xc030cda5(this, a0Var);
        this.f219053n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$2
            {
                this.f39173x3fe91575 = -1435144905;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd47) {
                boolean z17 = c5147x8f44fd47.f135497g.f87945a;
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3.this;
                if (z17) {
                    e3Var.f219054o.d();
                    return false;
                }
                e3Var.f219054o.c(30000L, 30000L);
                return false;
            }
        };
        this.f219054o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s2(this), false);
        this.f219055p = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.t2(this);
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        p13.c z2Var;
        switch (uVar.f432673b) {
            case 10:
                z2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.z2(this, uVar, false);
                break;
            case 11:
                z2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.z2(this, uVar, true);
                break;
            case 12:
                z2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b3(this, uVar);
                break;
            default:
                z2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.a3(this, uVar);
                break;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219048f).b(-65536, z2Var);
        return z2Var;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (z65.c.f551991d) {
            return;
        }
        boolean equals = "notifymessage".equals(l0Var.f535943a);
        java.lang.String str = l0Var.f535943a;
        if (equals || "gh_3dfda90e39d6".equals(str)) {
            java.lang.String str2 = l0Var.f535944b;
            boolean equals2 = str2.equals("insert");
            int i17 = 0;
            java.util.ArrayList arrayList = l0Var.f535945c;
            if (equals2) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (i17 < arrayList.size()) {
                    arrayList2.add((com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i17));
                    i17++;
                }
                if (arrayList2.size() > 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219047e).b(65576, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.x2(this, arrayList2, str));
                    return;
                }
                return;
            }
            if (str2.equals("delete")) {
                if (arrayList == null || arrayList.isEmpty()) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(str) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "clear all record");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219047e).b(65576, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.v2(this, null));
                        return;
                    }
                    return;
                }
                while (i17 < arrayList.size()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i17);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219047e).b(65576, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.w2(this, f9Var.m124847x74d37ac6()));
                    i17++;
                }
            }
        }
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchServiceNotifyLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "Create Success!");
        this.f219050h = (w13.j) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de);
        this.f219047e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        this.f219048f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218913e;
        this.f219049g = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).fj();
        this.f219053n.mo48813x58998cd();
        this.f219052m.mo48813x58998cd();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, null);
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        this.f219053n.mo48814x2efc64();
        this.f219052m.mo48814x2efc64();
        this.f219050h = null;
        this.f219047e = null;
        this.f219048f = null;
        this.f219054o.d();
        return true;
    }
}
