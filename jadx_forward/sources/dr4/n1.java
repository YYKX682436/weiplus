package dr4;

/* loaded from: classes14.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324207d;

    public n1(dr4.p1 p1Var) {
        this.f324207d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.c0 c0Var;
        int i17 = wo.v1.f529355b.f529193e;
        dr4.p1 p1Var = this.f324207d;
        if (i17 == 0 || p1Var.f324235a) {
            xq4.a aVar = p1Var.f324237c;
            boolean z17 = true;
            if (aVar != null) {
                if (!(aVar != null ? ((zq4.b) aVar).f556574a : true)) {
                    z17 = false;
                }
            }
            dr4.x1 x1Var = p1Var.f324241g;
            if (x1Var == null || (c0Var = x1Var.f324295b) == null) {
                return;
            }
            dr4.p1.a(p1Var, c0Var, z17);
        }
    }
}
