package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class o0 extends p012xc85e97e9.p093xedfae76a.g {

    /* renamed from: this$1 */
    final /* synthetic */ p012xc85e97e9.p093xedfae76a.p0 f3565xcbdd23ab;

    public o0(p012xc85e97e9.p093xedfae76a.p0 p0Var) {
        this.f3565xcbdd23ab = p0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        this.f3565xcbdd23ab.f3566xcbdd23aa.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        p012xc85e97e9.p093xedfae76a.q0 q0Var = this.f3565xcbdd23ab.f3566xcbdd23aa;
        int i17 = q0Var.f93174d + 1;
        q0Var.f93174d = i17;
        if (i17 == 1 && q0Var.f93177g) {
            q0Var.f93179i.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
            q0Var.f93177g = false;
        }
    }
}
