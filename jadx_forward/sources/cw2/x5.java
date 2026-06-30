package cw2;

/* loaded from: classes15.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f305639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f305640e;

    public x5(cw2.z5 z5Var, cw2.d6 d6Var) {
        this.f305639d = z5Var;
        this.f305640e = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw2.z5 z5Var = this.f305639d;
        java.util.Objects.toString(z5Var);
        long j17 = z5Var.f305669d;
        if (j17 == 0) {
            return;
        }
        this.f305640e.f305182c.m47853xa1e5e8a7(j17);
        z5Var.f305669d = 0L;
        z5Var.f305674i = null;
        java.util.Objects.toString(z5Var);
    }
}
