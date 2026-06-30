package bj5;

/* loaded from: classes.dex */
public final class s0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.yb0 f102764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f102765b;

    public s0(r45.yb0 yb0Var, bj5.d1 d1Var) {
        this.f102764a = yb0Var;
        this.f102765b = d1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null) {
            return null;
        }
        int i17 = fVar.f152148a;
        bj5.d1 d1Var = this.f102765b;
        if (i17 != 0 || fVar.f152149b != 0) {
            d1Var.U6();
            return fVar;
        }
        if (b93.r.wi().d(this.f102764a.f472478d)) {
            d1Var.V6();
            return fVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mvvm.SelectLabelActionBarUIC", "cpan[doDeleteContactLabel] fail.");
        d1Var.U6();
        return fVar;
    }
}
