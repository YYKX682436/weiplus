package b03;

/* loaded from: classes11.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.a0 f16871d;

    public z(b03.a0 a0Var) {
        this.f16871d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b03.a0 a0Var = this.f16871d;
        long a17 = b03.a0.a(a0Var);
        long j17 = a0Var.f16822b;
        int i17 = a0Var.f16823c;
        long j18 = (j17 * i17) + a17;
        int i18 = i17 + 1;
        a0Var.f16823c = i18;
        a0Var.f16822b = j18 / i18;
    }
}
