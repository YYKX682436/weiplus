package ea1;

/* loaded from: classes12.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 144;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f432608c = 19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 wi6 = ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).wi(yVar.f432720e);
        if (wi6 == null) {
            return eVar;
        }
        eVar.f432615j = wi6.f157888w;
        return eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = (i17 - iVar.f496098a) - 1;
        u13.g p17 = (i18 >= iVar.f496103f.size() || i18 < 0) ? null : p(393216, i17, (p13.y) iVar.f496103f.get(i18), iVar);
        if (p17 != null) {
            p17.f505300j = i18 + 1;
            if (i18 == iVar.f496103f.size() - 1) {
                p17.f505294d = false;
            }
        }
        return p17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        ea1.k kVar = new ea1.k(i18);
        kVar.f332064r = yVar;
        kVar.f505295e = iVar.f496104g;
        kVar.n(yVar.f432717b, yVar.f432718c);
        return kVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432683l = r13.d.f450137d;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        uVar.f432681j = hashSet;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(7, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f432693e;
        if (list != null && !list.isEmpty()) {
            m21.x xVar = new m21.x();
            java.lang.String str = this.f219540i;
            if (str != null) {
                str = str.replaceAll(",", " ");
            }
            xVar.a("20KeyWordId", str + ",");
            xVar.a("21ViewType", "1,");
            xVar.a("22OpType", "1,");
            xVar.a("23ResultCount", list.size() + ",");
            xVar.a("24ClickPos", ",");
            xVar.a("25ClickAppUserName", ",");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSWeAppUIUnit", "report oreh LocalSearchWeApp(13963), %s", xVar.c());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13963, xVar);
        }
        if (k(vVar.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -13;
            java.util.List list2 = vVar.f432693e;
            iVar.f496103f = list2;
            iVar.f496104g = vVar.f432692d;
            if (list2.size() > 1) {
                iVar.f496101d = true;
                iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 1));
            }
            this.f219542n.add(iVar);
        }
    }
}
