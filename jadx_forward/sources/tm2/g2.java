package tm2;

/* loaded from: classes3.dex */
public final class g2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm2.b f502047b;

    public g2(tm2.s2 s2Var, fm2.b bVar) {
        this.f502046a = s2Var;
        this.f502047b = bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.g
    public void a(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (tm2.f2.f502041a[status.ordinal()] == 1) {
            tm2.s2 s2Var = this.f502046a;
            if (s2Var.N == null) {
                s2Var.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm((android.view.ViewGroup) tm2.s2.f(s2Var, com.p314xaae8f345.mm.R.id.f1i, this.f502047b), this.f502047b, null, 4, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = s2Var.N;
                if (hmVar != null) {
                    hmVar.K0(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar2 = s2Var.N;
                if (hmVar2 != null) {
                    hmVar2.z0();
                }
            }
        }
    }
}
