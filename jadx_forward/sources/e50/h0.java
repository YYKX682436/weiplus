package e50;

/* loaded from: classes11.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.a0 f331030d;

    public h0(b03.a0 a0Var) {
        this.f331030d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b03.a0 a0Var = this.f331030d;
        if (a0Var != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new b03.v(a0Var), "EngineGroupMemReporter_serial");
        }
    }
}
