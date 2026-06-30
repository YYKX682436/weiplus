package yu5;

/* loaded from: classes5.dex */
public enum g implements yu5.a {
    INSTANCE;

    @Override // yu5.a
    public java.util.concurrent.Future a(java.lang.Runnable runnable) {
        return ((ku5.t0) ku5.t0.f394148d).q(runnable);
    }

    @Override // yu5.a
    public java.util.concurrent.Future b(java.lang.Runnable runnable) {
        return ((ku5.t0) ku5.t0.f394148d).B(runnable);
    }

    @Override // yu5.a
    public java.util.concurrent.Future d(java.lang.Runnable runnable, java.lang.String str) {
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        java.util.Objects.requireNonNull(runnable);
        return t0Var.l(runnable, 0L, str);
    }

    @Override // yu5.a
    public java.util.concurrent.Future e(java.lang.Runnable runnable, long j17) {
        return ((ku5.t0) ku5.t0.f394148d).k(runnable, j17);
    }

    @Override // yu5.a
    /* renamed from: execute */
    public java.util.concurrent.Future mo177691xb158f775(java.lang.Runnable runnable) {
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        java.util.Objects.requireNonNull(runnable);
        return t0Var.k(runnable, 0L);
    }
}
