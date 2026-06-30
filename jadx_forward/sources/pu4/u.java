package pu4;

/* loaded from: classes12.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 304;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a, t13.k
    public java.util.List h(long j17) {
        java.util.List h17 = super.h(j17);
        java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
        while (it.hasNext()) {
            p13.e eVar = (p13.e) it.next();
            eVar.f432607b++;
            eVar.f432606a++;
            if (eVar.f432609d == 2) {
                eVar.f432615j = "more";
            }
        }
        return h17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f432608c = 40;
        eVar.f432615j = yVar.f432720e;
        return eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = i17 - iVar.f496098a;
        if (iVar.f496099b) {
            i18--;
        }
        if (i18 < 0 || i18 >= iVar.f496103f.size()) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i18);
        pu4.q qVar = new pu4.q(i17);
        qVar.f439993q = yVar;
        qVar.f505295e = iVar.f496104g;
        qVar.n(yVar.f432717b, yVar.f432718c);
        if (i18 == iVar.f496103f.size() - 1) {
            qVar.f505294d = false;
        }
        qVar.f505300j = i18 + 1;
        return qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432678g = o13.d.f423755h;
        uVar.f432680i = 4;
        uVar.f432681j = hashSet;
        uVar.f432683l = r13.e.f450138d;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        this.f219543o = hashSet;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(17, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f432693e;
        if (list == null || list.isEmpty()) {
            return;
        }
        t13.i iVar = new t13.i();
        iVar.f496102e = -32;
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
