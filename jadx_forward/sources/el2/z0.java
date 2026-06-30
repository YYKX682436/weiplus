package el2;

/* loaded from: classes3.dex */
public final class z0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335488d;

    public z0(el2.i1 i1Var) {
        this.f335488d = i1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        el2.i1 i1Var = this.f335488d;
        android.view.ViewGroup viewGroup = i1Var.f335345d;
        viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.0f), i1Var.f335357s);
        if (i1Var.f335355q) {
            el2.i1.m(i1Var);
        }
    }
}
