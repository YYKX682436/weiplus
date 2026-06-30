package ph1;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f435842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f435843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph1.d0 f435844f;

    public c0(ph1.d0 d0Var, boolean z17, java.util.List list) {
        this.f435844f = d0Var;
        this.f435842d = z17;
        this.f435843e = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        ph1.d0 d0Var = this.f435844f;
        boolean L0 = d0Var.f435847c.f435862f.L0();
        java.lang.String str = d0Var.f435845a;
        ph1.g0 g0Var = d0Var.f435847c;
        if (L0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "onLoad with module(%s) but runtime(%s) destroyed", str, g0Var.f435862f.mo48804x9616526c());
            return;
        }
        boolean z17 = this.f435842d;
        if (z17) {
            ze.n nVar = g0Var.f435862f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(nVar, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la laVar = o17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la) o17 : null;
            java.lang.Object obj = laVar != null ? laVar.f157188a : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) obj : null;
            if (acVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "onLoad with module(%s) but runtime(%s) has no reader", str, g0Var.f435862f.mo48804x9616526c());
                return;
            } else {
                acVar.o(this.f435843e);
                if (!g0Var.f435862f.m0().f387282s.booleanValue()) {
                    g0Var.f435862f.w2();
                }
            }
        }
        ph1.g0.h(g0Var, str, z17 ? ph1.g.OK : ph1.g.FAIL);
    }
}
