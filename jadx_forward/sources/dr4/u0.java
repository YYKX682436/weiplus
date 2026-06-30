package dr4;

/* loaded from: classes14.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324281d;

    public u0(dr4.p1 p1Var) {
        this.f324281d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.p1 p1Var = this.f324281d;
        if (p1Var.h() || p1Var.g()) {
            p1Var.m();
        }
    }
}
