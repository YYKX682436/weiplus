package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class p0 extends p012xc85e97e9.p093xedfae76a.g {

    /* renamed from: this$0 */
    final /* synthetic */ p012xc85e97e9.p093xedfae76a.q0 f3566xcbdd23aa;

    public p0(p012xc85e97e9.p093xedfae76a.q0 q0Var) {
        this.f3566xcbdd23aa = q0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i17 = p012xc85e97e9.p093xedfae76a.t0.f93184e;
            ((p012xc85e97e9.p093xedfae76a.t0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f93185d = this.f3566xcbdd23aa.f93181n;
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p012xc85e97e9.p093xedfae76a.q0 q0Var = this.f3566xcbdd23aa;
        int i17 = q0Var.f93175e - 1;
        q0Var.f93175e = i17;
        if (i17 == 0) {
            q0Var.f93178h.postDelayed(q0Var.f93180m, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new p012xc85e97e9.p093xedfae76a.o0(this));
    }

    @Override // p012xc85e97e9.p093xedfae76a.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p012xc85e97e9.p093xedfae76a.q0 q0Var = this.f3566xcbdd23aa;
        int i17 = q0Var.f93174d - 1;
        q0Var.f93174d = i17;
        if (i17 == 0 && q0Var.f93176f) {
            q0Var.f93179i.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
            q0Var.f93177g = true;
        }
    }
}
