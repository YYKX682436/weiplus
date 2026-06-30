package androidx.lifecycle;

/* loaded from: classes13.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.q0 f11637d;

    public m0(androidx.lifecycle.q0 q0Var) {
        this.f11637d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.lifecycle.q0 q0Var = this.f11637d;
        int i17 = q0Var.f11642e;
        androidx.lifecycle.b0 b0Var = q0Var.f11646i;
        if (i17 == 0) {
            q0Var.f11643f = true;
            b0Var.f(androidx.lifecycle.m.ON_PAUSE);
        }
        if (q0Var.f11641d == 0 && q0Var.f11643f) {
            b0Var.f(androidx.lifecycle.m.ON_STOP);
            q0Var.f11644g = true;
        }
    }
}
