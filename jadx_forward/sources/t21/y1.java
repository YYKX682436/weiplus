package t21;

/* loaded from: classes12.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.c2 f496598d;

    public y1(t21.c2 c2Var) {
        this.f496598d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.c2 c2Var = this.f496598d;
        t21.v0 v0Var = c2Var.f496261i;
        if (v0Var != null) {
            v0Var.e();
        }
        c2Var.f496261i = null;
    }
}
