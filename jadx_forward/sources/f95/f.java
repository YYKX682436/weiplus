package f95;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f342085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f342086e;

    public f(l75.k0 k0Var, java.lang.Runnable runnable) {
        this.f342085d = k0Var;
        this.f342086e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l75.k0 k0Var = this.f342085d;
        java.lang.Runnable runnable = this.f342086e;
        synchronized (d95.f.class) {
            java.util.Set set = f95.j.f342097a;
            if (!kz5.n0.O(set, k0Var.mo70515xfb83cc9b())) {
                java.lang.String mo70515xfb83cc9b = k0Var.mo70515xfb83cc9b();
                if (mo70515xfb83cc9b == null) {
                    mo70515xfb83cc9b = "";
                }
                set.add(mo70515xfb83cc9b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", "executeTaskSilently");
                runnable.run();
            }
        }
    }
}
