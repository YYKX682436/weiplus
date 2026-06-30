package androidx.lifecycle;

/* loaded from: classes13.dex */
public class p0 extends androidx.lifecycle.g {
    final /* synthetic */ androidx.lifecycle.q0 this$0;

    public p0(androidx.lifecycle.q0 q0Var) {
        this.this$0 = q0Var;
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i17 = androidx.lifecycle.t0.f11651e;
            ((androidx.lifecycle.t0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f11652d = this.this$0.f11648n;
        }
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        androidx.lifecycle.q0 q0Var = this.this$0;
        int i17 = q0Var.f11642e - 1;
        q0Var.f11642e = i17;
        if (i17 == 0) {
            q0Var.f11645h.postDelayed(q0Var.f11647m, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.o0(this));
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        androidx.lifecycle.q0 q0Var = this.this$0;
        int i17 = q0Var.f11641d - 1;
        q0Var.f11641d = i17;
        if (i17 == 0 && q0Var.f11643f) {
            q0Var.f11646i.f(androidx.lifecycle.m.ON_STOP);
            q0Var.f11644g = true;
        }
    }
}
