package j23;

/* loaded from: classes12.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 8192;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        e23.c cVar;
        int i18 = (i17 - iVar.f496098a) - 1;
        if (iVar.f496099b || i17 != 0) {
            cVar = null;
        } else {
            cVar = new e23.c(i17);
            cVar.f505295e = iVar.f496104g;
        }
        if (cVar != null) {
            cVar.f505300j = i18 + 1;
        }
        return cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, p13.u.b(this.f219540i, new int[]{131072}, new int[]{16}, -1, hashSet, r13.b.f450135d, this, n3Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = this.f219542n;
        list.clear();
        t13.i iVar = new t13.i();
        iVar.f496102e = -4;
        iVar.f496099b = false;
        iVar.f496107j = 1;
        iVar.f496104g = vVar.f432692d;
        iVar.f496103f = new java.util.ArrayList();
        list.add(iVar);
    }
}
