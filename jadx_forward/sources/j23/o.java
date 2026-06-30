package j23;

/* loaded from: classes12.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 51;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        int i18 = yVar.f432717b;
        if (i18 == 131090) {
            eVar.f432608c = 33;
            eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
            eVar.f432613h = 1;
        } else {
            if (i18 != 131089) {
                return null;
            }
            eVar.f432608c = 33;
            eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
            eVar.f432613h = 2;
        }
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
            gVar = p(131089, i17, yVar, iVar);
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
        e23.u1 u1Var = new e23.u1(19, i18);
        u1Var.f328372q = yVar;
        u1Var.f505295e = iVar.f496104g;
        u1Var.n(yVar.f432717b, yVar.f432718c);
        return u1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432673b = 112;
        uVar.f432680i = 3;
        uVar.f432674c = this.f219540i;
        uVar.f432681j = hashSet;
        uVar.f432683l = r13.b.f450135d;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(14, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f432693e)) {
            t13.i iVar = new t13.i();
            java.util.List list = vVar.f432693e;
            iVar.f496103f = list;
            iVar.f496102e = -24;
            iVar.f496104g = vVar.f432692d;
            if (list.size() > 3) {
                iVar.f496101d = true;
                iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 3));
            }
            this.f219542n.add(iVar);
        }
    }
}
