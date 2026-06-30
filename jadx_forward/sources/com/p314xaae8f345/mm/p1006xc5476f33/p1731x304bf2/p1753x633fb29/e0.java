package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f221803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f0 f221804e;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f0 f0Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f221804e = f0Var;
        this.f221803d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f0.f221838e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f0 f0Var = this.f221804e;
        f0Var.f221841d += 20;
        r45.sw5 sw5Var = (r45.sw5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.j3) this.f221803d).f221879e.f152244b.f152233a;
        if (sw5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSearchGameList", "resp == null");
            str = null;
        } else {
            str = sw5Var.f467529d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.u(str);
        org.json.JSONObject jSONObject = uVar.f221966a;
        java.util.LinkedList a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.s.a(jSONObject.optJSONArray("items"));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) it.next();
            bVar.M = bVar.f221740j2;
            bVar.A = true;
        }
        r53.n.c(a17);
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f0.f221839f;
        linkedList.add(uVar);
        int optInt = jSONObject.optInt("remainingCount");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameListUpdater", "remainingCount: %d", java.lang.Integer.valueOf(optInt));
        if (optInt > 0) {
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.j3(f0Var.f221841d, 20));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f0.f221838e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f0.f221840g.mo50299x35224f();
        gm0.j1.d().q(1215, f0Var);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_SEARCH_LIST_UPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t(linkedList));
    }
}
