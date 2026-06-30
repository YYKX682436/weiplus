package j23;

/* loaded from: classes12.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 4352;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        e23.u1 u1Var;
        int i18 = (i17 - iVar.f496098a) - 1;
        if (i18 >= iVar.f496103f.size() || i18 < 0) {
            u1Var = null;
        } else {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            u1Var = new e23.u1(19, i17);
            u1Var.f328372q = yVar;
            u1Var.f505295e = iVar.f496104g;
            u1Var.n(yVar.f432717b, yVar.f432718c);
        }
        if (u1Var != null) {
            u1Var.f505300j = i18 + 1;
        }
        return u1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432678g = new int[]{131089, 131090};
        uVar.f432683l = r13.b.f450135d;
        uVar.f432681j = hashSet;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        uVar.f432673b = 113;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(14, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -24;
            iVar.f496103f = vVar.f432693e;
            iVar.f496104g = vVar.f432692d;
            iVar.f496101d = false;
            this.f219542n.add(iVar);
        }
    }
}
