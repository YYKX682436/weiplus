package sr1;

/* loaded from: classes12.dex */
public class i0 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 96;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f432608c = 5;
        eVar.f432615j = yVar.f432720e;
        return eVar;
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
            if (i18 == iVar.f496103f.size() - 1) {
                gVar.f505294d = false;
            }
        }
        return gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        sr1.a0 a0Var = new sr1.a0(96, i18);
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
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, p13.u.b(this.f219540i, new int[]{131076}, null, 2, hashSet, r13.b.f450135d, this, n3Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -7;
            java.util.List list = vVar.f432693e;
            iVar.f496103f = list;
            iVar.f496104g = vVar.f432692d;
            if (list.size() > 1) {
                iVar.f496101d = true;
                iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 1));
            }
            this.f219542n.add(iVar);
        }
    }
}
