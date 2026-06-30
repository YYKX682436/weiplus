package androidx.lifecycle;

/* loaded from: classes13.dex */
public class o0 extends androidx.lifecycle.g {
    final /* synthetic */ androidx.lifecycle.p0 this$1;

    public o0(androidx.lifecycle.p0 p0Var) {
        this.this$1 = p0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        this.this$1.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        androidx.lifecycle.q0 q0Var = this.this$1.this$0;
        int i17 = q0Var.f11641d + 1;
        q0Var.f11641d = i17;
        if (i17 == 1 && q0Var.f11644g) {
            q0Var.f11646i.f(androidx.lifecycle.m.ON_START);
            q0Var.f11644g = false;
        }
    }
}
