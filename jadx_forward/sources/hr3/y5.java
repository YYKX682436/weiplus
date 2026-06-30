package hr3;

/* loaded from: classes9.dex */
public class y5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f365736d;

    public y5(hr3.t6 t6Var) {
        this.f365736d = t6Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        hr3.t6 t6Var = this.f365736d;
        qk.o oVar = t6Var.f365538g;
        if (oVar != null && oVar.I0()) {
            g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.bgy);
            g4Var.a(4, com.p314xaae8f345.mm.R.C30867xcad56011.bcm);
            g4Var.a(5, com.p314xaae8f345.mm.R.C30867xcad56011.bbi);
            return;
        }
        qk.o oVar2 = t6Var.f365538g;
        if (oVar2 != null && oVar2.G0()) {
            g4Var.a(5, com.p314xaae8f345.mm.R.C30867xcad56011.bbi);
            return;
        }
        g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.bgy);
        g4Var.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.bbv);
        if (!c01.e2.c0(t6Var.f365537f.d1())) {
            g4Var.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.ak6);
            g4Var.a(4, com.p314xaae8f345.mm.R.C30867xcad56011.bcm);
        }
        g4Var.a(5, com.p314xaae8f345.mm.R.C30867xcad56011.bbi);
    }
}
