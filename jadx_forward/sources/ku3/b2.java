package ku3;

/* loaded from: classes3.dex */
public final class b2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.n2 f393704d;

    public b2(ku3.n2 n2Var) {
        this.f393704d = n2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        if (cVar.f557124e) {
            boolean z17 = cVar.f557121b;
            ku3.n2 n2Var = this.f393704d;
            if (z17) {
                n2Var.c(i65.a.r(n2Var.f393869d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574260hm4));
            } else {
                n2Var.c(i65.a.r(n2Var.f393869d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574259hm3));
            }
        }
    }
}
