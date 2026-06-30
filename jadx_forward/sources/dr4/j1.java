package dr4;

/* loaded from: classes14.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324185d;

    public j1(dr4.p1 p1Var) {
        this.f324185d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.x1 x1Var;
        dr4.c0 c0Var;
        dr4.p1 p1Var = this.f324185d;
        xq4.a aVar = p1Var.f324237c;
        if (aVar == null || (x1Var = p1Var.f324241g) == null || (c0Var = x1Var.f324295b) == null) {
            return;
        }
        dr4.p1.a(p1Var, c0Var, aVar != null ? ((zq4.b) aVar).f556574a : true);
    }
}
