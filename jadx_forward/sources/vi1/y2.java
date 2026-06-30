package vi1;

/* loaded from: classes7.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f519042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.x20 f519043e;

    public y2(vi1.k3 k3Var, r45.x20 x20Var) {
        this.f519042d = k3Var;
        this.f519043e = x20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.k3 k3Var = this.f519042d;
        r45.x20 x20Var = this.f519043e;
        vi1.k3.b(k3Var, x20Var.f471223d, x20Var.f471224e, x20Var.f471225f, x20Var.f471227h, x20Var.f471228i);
    }
}
