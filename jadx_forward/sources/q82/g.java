package q82;

/* loaded from: classes12.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 128;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f432608c = 12;
        return eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        q82.c cVar;
        int i18 = (i17 - iVar.f496098a) - 1;
        if (i18 >= iVar.f496103f.size() || i18 < 0) {
            cVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            cVar = new q82.c(i17);
            cVar.f442271q = yVar;
            cVar.f505295e = iVar.f496104g;
            cVar.n(yVar.f432717b, yVar.f432718c);
            cVar.f442272r = false;
        }
        if (cVar != null) {
            cVar.f505300j = i18 + 1;
        }
        return cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432673b = 1;
        uVar.f432674c = this.f219540i;
        uVar.f432680i = 1;
        uVar.f432681j = hashSet;
        uVar.f432685n = n3Var;
        uVar.f432684m = this;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(6, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -1;
            iVar.f496104g = vVar.f432692d;
            java.util.List list = vVar.f432693e;
            iVar.f496103f = list;
            if (list.size() > 1) {
                iVar.f496101d = true;
                iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 1));
            }
            this.f219542n.add(iVar);
        }
    }
}
