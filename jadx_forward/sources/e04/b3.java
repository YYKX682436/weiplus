package e04;

/* loaded from: classes15.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.c3 f327405d;

    public b3(e04.c3 c3Var) {
        this.f327405d = c3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e04.c3 c3Var = this.f327405d;
        if (c3Var.f327415e) {
            return;
        }
        c3Var.c(false);
    }
}
