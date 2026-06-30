package v13;

/* loaded from: classes12.dex */
public final class a extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v13.e f514049n;

    public a(v13.e eVar) {
        this.f514049n = eVar;
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218914f;
        dm.i3.m125052xe1f0e832(oVar.l());
        p75.n0 n0Var = dm.i3.f319087g;
        this.f514049n.f514064f = n0Var.h(dm.i3.f319088h.h()).a().n(oVar.l());
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219913a;
        s50.k0 k0Var = (s50.k0) ((u50.w) i95.n0.c(u50.w.class));
        k0Var.getClass();
        if (!jm0.g.class.isAssignableFrom(v13.e.class)) {
            throw new java.lang.IllegalArgumentException(s50.k0.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(k0Var.getViewModel(), new jm0.e(k0Var)).a(v13.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.o oVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218914f;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            p75.m0 t17 = dm.i3.f319089i.t("'net@%'");
            linkedList3.add(dm.i3.f319090m.u());
            p75.i0 g17 = n0Var.g(linkedList2);
            g17.f434190d = t17;
            g17.d(linkedList3);
            g17.b(linkedList4);
            g17.c(30, 0);
            java.util.Iterator it = ((java.util.ArrayList) g17.a().k(oVar2.l(), dm.i3.class)).iterator();
            while (it.hasNext()) {
                dm.i3 i3Var = (dm.i3) it.next();
                r45.cw5 cw5Var = new r45.cw5();
                cw5Var.f453403d = i3Var.u0();
                cw5Var.f453406g = ((int) i3Var.t0()) == 1;
                cw5Var.f453404e = i3Var.v0();
                linkedList.add(cw5Var);
            }
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTSQueryClickRecallPLC", e17, "getLatestQueryClickRecallInfo error", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219913a = linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219914b = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSearchPrefixUserInfo", "initLatestSearchClickHistory Success, latestSearchClickHistory=" + com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219913a.toString());
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "currentDictCount:" + this.f514049n.f514064f;
    }
}
