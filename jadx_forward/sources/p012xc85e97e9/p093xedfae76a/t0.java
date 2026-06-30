package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class t0 extends android.app.Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f93184e = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.r0 f93185d;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.app.Activity activity, p012xc85e97e9.p093xedfae76a.m mVar) {
        if (activity instanceof p012xc85e97e9.p093xedfae76a.y) {
            p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = ((p012xc85e97e9.p093xedfae76a.y) activity).mo273xed6858b4();
            if (mo273xed6858b4 instanceof p012xc85e97e9.p093xedfae76a.b0) {
                ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4).f(mVar);
            }
        }
    }

    public static void c(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            p012xc85e97e9.p093xedfae76a.s0.m7821x908b1b28(activity);
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new p012xc85e97e9.p093xedfae76a.t0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(p012xc85e97e9.p093xedfae76a.m mVar) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            a(getActivity(), mVar);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        b(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
        this.f93185d = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        p012xc85e97e9.p093xedfae76a.r0 r0Var = this.f93185d;
        if (r0Var != null) {
            ((p012xc85e97e9.p093xedfae76a.n0) r0Var).f93171a.a();
        }
        b(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        p012xc85e97e9.p093xedfae76a.r0 r0Var = this.f93185d;
        if (r0Var != null) {
            p012xc85e97e9.p093xedfae76a.q0 q0Var = ((p012xc85e97e9.p093xedfae76a.n0) r0Var).f93171a;
            int i17 = q0Var.f93174d + 1;
            q0Var.f93174d = i17;
            if (i17 == 1 && q0Var.f93177g) {
                q0Var.f93179i.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
                q0Var.f93177g = false;
            }
        }
        b(p012xc85e97e9.p093xedfae76a.m.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
    }
}
