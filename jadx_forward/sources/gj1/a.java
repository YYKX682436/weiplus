package gj1;

/* loaded from: classes9.dex */
public class a implements com.p314xaae8f345.mm.p2621x8fb0427b.k8 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.k8
    public void p(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.p2621x8fb0427b.l8 l8Var) {
        if (l4Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l4Var.h1())) {
            return;
        }
        java.lang.String h17 = l4Var.h1();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h17, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandConversionExtension", "contact is null or contactId is 0 for %s", h17);
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(h17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(h17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandConversionExtension", "this conversation is a app brand contact!");
            l4Var.T1("appbrandcustomerservicemsg");
            ((ab5.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b5.class))).wi(l4Var);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(h17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandConversionExtension", "appBrandSuperConv is created");
            l4Var.T1(null);
        }
    }
}
