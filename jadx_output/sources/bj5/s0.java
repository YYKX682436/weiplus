package bj5;

/* loaded from: classes.dex */
public final class s0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.yb0 f21231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f21232b;

    public s0(r45.yb0 yb0Var, bj5.d1 d1Var) {
        this.f21231a = yb0Var;
        this.f21232b = d1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        int i17 = fVar.f70615a;
        bj5.d1 d1Var = this.f21232b;
        if (i17 != 0 || fVar.f70616b != 0) {
            d1Var.U6();
            return fVar;
        }
        if (b93.r.wi().d(this.f21231a.f390945d)) {
            d1Var.V6();
            return fVar;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Mvvm.SelectLabelActionBarUIC", "cpan[doDeleteContactLabel] fail.");
        d1Var.U6();
        return fVar;
    }
}
