package il2;

/* loaded from: classes3.dex */
public final class n implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ il2.r f373607d;

    public n(il2.r rVar) {
        this.f373607d = rVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.p5 p5Var = (mm2.p5) obj;
        int ordinal = p5Var.f410882a.ordinal();
        il2.r rVar = this.f373607d;
        if (ordinal == 0) {
            il2.r.t1(rVar, p5Var);
            return;
        }
        if (ordinal == 1) {
            rVar.b0(1, p5Var.f410883b, new il2.l(p5Var, rVar));
        } else {
            if (ordinal != 2) {
                return;
            }
            long j17 = p5Var.f410883b;
            il2.m mVar = new il2.m(p5Var, rVar);
            rVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(rVar, null, null, new il2.f(rVar, j17, mVar, null), 3, null);
        }
    }
}
