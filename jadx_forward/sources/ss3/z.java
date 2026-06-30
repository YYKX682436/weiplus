package ss3;

/* loaded from: classes5.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss3.c0 f493559d;

    public z(ss3.c0 c0Var) {
        this.f493559d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ss3.c0 c0Var = this.f493559d;
        if (c0Var != null) {
            c0Var.b();
        }
    }
}
