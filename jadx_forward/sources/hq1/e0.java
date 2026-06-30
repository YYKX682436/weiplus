package hq1;

/* loaded from: classes13.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.h0 f364638d;

    public e0(hq1.h0 h0Var) {
        this.f364638d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.h0 h0Var = this.f364638d;
        if (h0Var.f364660r) {
            hq1.f0 f0Var = h0Var.f364647e;
            if (f0Var != null) {
                f0Var.a(h0Var.f364643a, false, h0Var.f364658p);
            }
            h0Var.e();
        }
    }
}
