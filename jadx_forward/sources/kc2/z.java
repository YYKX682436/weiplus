package kc2;

/* loaded from: classes15.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.c0 f388078d;

    public z(kc2.c0 c0Var) {
        this.f388078d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.c0 c0Var = this.f388078d;
        c0Var.f387879p = e17;
        kc2.h1.f387938a.b(c0Var.g(), c0Var.f387879p, c0Var.f387881r, c0Var.f387880q);
    }
}
