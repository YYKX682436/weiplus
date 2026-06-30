package t23;

/* loaded from: classes10.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t23.r2 f496784d;

    public p2(t23.r2 r2Var) {
        this.f496784d = r2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.r2 r2Var = this.f496784d;
        t23.q2 q2Var = r2Var.f496793i;
        if (q2Var != null) {
            q2Var.a(r2Var);
        }
    }
}
