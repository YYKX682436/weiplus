package hr3;

/* loaded from: classes9.dex */
public class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f365109d;

    public g6(hr3.t6 t6Var) {
        this.f365109d = t6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hr3.t6 t6Var = this.f365109d;
        if (t6Var.f365535d.isFinishing()) {
            return;
        }
        xp1.c.c(t6Var.f365535d, t6Var.f365537f.d1(), true);
        xp1.c.l(t6Var.f365535d);
    }
}
