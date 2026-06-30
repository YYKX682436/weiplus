package sr1;

/* loaded from: classes12.dex */
public class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 4210;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        u13.g gVar;
        int i18 = (i17 - iVar.f496098a) - 1;
        if (i18 >= iVar.f496103f.size() || i18 < 0) {
            gVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            gVar = p(yVar.f432717b, i17, yVar, iVar);
            gVar.n(yVar.f432717b, yVar.f432718c);
        }
        if (gVar != null) {
            gVar.f505300j = i18 + 1;
        }
        return gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        sr1.a0 a0Var = new sr1.a0(4210, i18);
        a0Var.f492980q = yVar;
        a0Var.f505295e = iVar.f496104g;
        a0Var.n(yVar.f432717b, yVar.f432718c);
        return a0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        hashSet.add("gh_43f2581f6fd6");
        hashSet.addAll(com.p314xaae8f345.mm.p2621x8fb0427b.z3.u3());
        if (1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1)) {
            hashSet.add("gh_579db1f2cf89");
        }
        hashSet.add("gh_25d9ac85a4bc");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, p13.u.b(this.f219540i, new int[]{2097173}, null, -1, hashSet, r13.b.f450135d, this, n3Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f432693e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            p13.y yVar = (p13.y) list.get(i17);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f432720e, true);
            if (yVar.f432718c != 15 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.t0())) {
                arrayList.add(yVar);
            }
        }
        vVar.f432693e = arrayList;
        if (k(arrayList)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -29;
            iVar.f496104g = vVar.f432692d;
            iVar.f496103f = vVar.f432693e;
            this.f219542n.add(iVar);
        }
    }
}
