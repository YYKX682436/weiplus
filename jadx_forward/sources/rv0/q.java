package rv0;

/* loaded from: classes5.dex */
public final class q implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481722e;

    public q(ex0.a0 a0Var, rv0.n1 n1Var) {
        this.f481721d = a0Var;
        this.f481722e = n1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ex0.a0 a0Var = this.f481721d;
        ax0.e r17 = a0Var.r();
        ax0.e eVar = ax0.e.f96510f;
        rv0.n1 n1Var = this.f481722e;
        if (r17 == eVar || a0Var.r() == ax0.e.f96511g) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 r76 = n1Var.r7();
            gy0.q mainItemDecoration = r76.getMainItemDecoration();
            if (mainItemDecoration != null) {
                mainItemDecoration.l(r76.H);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 r77 = n1Var.r7();
        gy0.q mainItemDecoration2 = r77.getMainItemDecoration();
        if (mainItemDecoration2 != null) {
            mainItemDecoration2.l(r77.G);
        }
    }
}
