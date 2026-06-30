package sj3;

/* loaded from: classes14.dex */
public final class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f490350d;

    public z3(sj3.d4 d4Var) {
        this.f490350d = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.q3 q3Var = this.f490350d.f490008d;
        if (q3Var != null) {
            boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231695e;
            sj3.n1 n1Var = q3Var.f490244m;
            if (n1Var != null) {
                n1Var.f490186g = z17;
                n1Var.a(z17, n1Var.f490185f);
            }
        }
    }
}
