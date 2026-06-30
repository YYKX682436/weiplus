package wa2;

/* loaded from: classes3.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f525661d;

    public i0(wa2.n0 n0Var) {
        this.f525661d = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa2.n0 n0Var = this.f525661d;
        com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5 a17 = n0Var.a(n0Var);
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 b17 = n0Var.b(n0Var);
        if (a17 == null && b17 == null) {
            return;
        }
        if ((a17 != null ? a17.getOverCallback() : null) == null) {
            if ((b17 != null ? b17.getOverScrollCallback() : null) != null) {
                return;
            }
            wa2.h0 h0Var = new wa2.h0(n0Var);
            if (b17 != null) {
                b17.m82946x1fa13828(new wa2.g0(h0Var));
            }
            if (a17 == null) {
                return;
            }
            a17.m82562xefb63abb(h0Var);
        }
    }
}
