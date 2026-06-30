package or1;

/* loaded from: classes9.dex */
public class s0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f429100d;

    /* renamed from: e, reason: collision with root package name */
    public al5.y1 f429101e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f429102f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f429103g;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871) {
        this.f429103g = new java.lang.ref.WeakReference(c12980x8e9ea871);
    }

    /* renamed from: finalize */
    public void m152139xd764dc1e() {
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.q0.f34310x366c91de, this);
        super.finalize();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gi5 gi5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f429102f;
        if (u3Var != null && u3Var.isShowing()) {
            this.f429102f.dismiss();
        }
        if (i17 == 0 && i18 == 0 && m1Var.mo808xfb85f7b0() == 1394) {
            r45.mi6 mi6Var = null;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((er3.f) m1Var).f337564e;
            r45.li6 li6Var = (oVar == null || (fVar2 = oVar.f152243a.f152217a) == null) ? null : (r45.li6) fVar2;
            if (oVar != null && (fVar = oVar.f152244b.f152233a) != null) {
                mi6Var = (r45.mi6) fVar;
            }
            if (mi6Var == null || (gi5Var = mi6Var.f462084d) == null || gi5Var.f456821d != 0) {
                if (mi6Var == null || mi6Var.f462084d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:resp == null", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:code:%s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(mi6Var.f462084d.f456821d));
                    return;
                }
            }
            if (li6Var.f461039e) {
                qk.o b17 = r01.z.b(li6Var.f461038d);
                b17.f66733x6baace8e |= 1;
                r45.ln4 ln4Var = new r45.ln4();
                ln4Var.f461192d = b17.f66733x6baace8e;
                ln4Var.f461193e = li6Var.f461038d;
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(47, ln4Var));
                r01.q3.cj().mo9952xce0038c9(b17, new java.lang.String[0]);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(b17.f66748xdec927b);
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().u(b17.f66739xdfb76cc2) <= 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(b17.f66739xdfb76cc2);
                } else {
                    ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Ai().b(b17.f66739xdfb76cc2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871 c12980x8e9ea871 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12980x8e9ea871) this.f429103g.get();
                if (c12980x8e9ea871 == null) {
                    return;
                }
                c12980x8e9ea871.i();
            }
        }
    }
}
