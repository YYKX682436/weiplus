package yn1;

/* loaded from: classes11.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545338d;

    public q3(yn1.a4 a4Var) {
        this.f545338d = a4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yn1.a4 a4Var = this.f545338d;
        synchronized (a4Var) {
            if (a4Var.f545141c) {
                a4Var.f545141c = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "endRecover");
                co1.g.f125301a.d();
            }
        }
    }
}
