package j23;

/* loaded from: classes12.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 64;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = (i17 - iVar.f496098a) - 1;
        u13.g p17 = (i18 >= iVar.f496103f.size() || i18 < 0) ? null : p(262144, i17, (p13.y) iVar.f496103f.get(i18), iVar);
        if (p17 != null) {
            p17.f505300j = i18 + 1;
        }
        return p17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        e23.d0 d0Var = new e23.d0(i18);
        d0Var.f328342q = yVar;
        d0Var.f505295e = iVar.f496104g;
        d0Var.n(yVar.f432717b, yVar.f432718c);
        return d0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        hashSet.add("62");
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            hashSet.add("65");
        }
        ((zq1.a0) gm0.j1.s(zq1.a0.class)).getClass();
        hashSet.add("63");
        ((ab5.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b5.class))).getClass();
        if (!(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("appbrandcustomerservicemsg") != null)) {
            hashSet.add(java.lang.String.valueOf(69));
        }
        if (!((ab5.j) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j5.class))).wi()) {
            hashSet.add(java.lang.String.valueOf(71));
        }
        if (!((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).wi()) {
            hashSet.add(java.lang.String.valueOf(74));
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_b4af18eac3d5", true).r2()) {
            hashSet.add(java.lang.String.valueOf(73));
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_e087bb5b95e6", true).r2()) {
            hashSet.add(java.lang.String.valueOf(76));
        }
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432685n = n3Var;
        uVar.f432681j = hashSet;
        uVar.f432684m = this;
        uVar.f432673b = 98;
        uVar.f432683l = r13.c.f450136d;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(4, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -6;
            iVar.f496104g = vVar.f432692d;
            iVar.f496103f = vVar.f432693e;
            iVar.f496101d = false;
            this.f219542n.add(iVar);
        }
    }
}
