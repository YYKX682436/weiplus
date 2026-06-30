package pu4;

/* loaded from: classes12.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 288;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = iVar.f496099b ? (i17 - iVar.f496098a) - 1 : 0;
        if (i18 < 0 || i18 >= iVar.f496103f.size()) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i18);
        pu4.l lVar = new pu4.l(i17);
        lVar.f439980q = yVar;
        lVar.f505295e = iVar.f496104g;
        lVar.n(yVar.f432717b, yVar.f432718c);
        if (i18 == iVar.f496103f.size() - 1) {
            lVar.f505294d = false;
        }
        lVar.f505300j = i18 + 1;
        return lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432678g = o13.d.f423756i;
        uVar.f432680i = 4;
        uVar.f432681j = hashSet;
        uVar.f432683l = r13.e.f450138d;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        this.f219543o = hashSet;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(18, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f432693e;
        if (list == null || list.isEmpty()) {
            return;
        }
        t13.i iVar = new t13.i();
        iVar.f496102e = -31;
        java.util.List list2 = vVar.f432693e;
        iVar.f496103f = list2;
        iVar.f496099b = k(list2);
        iVar.f496104g = vVar.f432692d;
        if (iVar.f496103f.size() > 3) {
            iVar.f496101d = true;
            iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 3));
        }
        if (k(vVar.f432693e)) {
            this.f219542n.add(iVar);
        }
    }
}
