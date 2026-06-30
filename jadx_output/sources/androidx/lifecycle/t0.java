package androidx.lifecycle;

/* loaded from: classes13.dex */
public class t0 extends android.app.Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11651e = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.r0 f11652d;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.app.Activity activity, androidx.lifecycle.m mVar) {
        if (activity instanceof androidx.lifecycle.y) {
            androidx.lifecycle.o mo133getLifecycle = ((androidx.lifecycle.y) activity).mo133getLifecycle();
            if (mo133getLifecycle instanceof androidx.lifecycle.b0) {
                ((androidx.lifecycle.b0) mo133getLifecycle).f(mVar);
            }
        }
    }

    public static void c(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.lifecycle.s0.registerIn(activity);
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new androidx.lifecycle.t0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(androidx.lifecycle.m mVar) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            a(getActivity(), mVar);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        b(androidx.lifecycle.m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(androidx.lifecycle.m.ON_DESTROY);
        this.f11652d = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        androidx.lifecycle.r0 r0Var = this.f11652d;
        if (r0Var != null) {
            ((androidx.lifecycle.n0) r0Var).f11638a.a();
        }
        b(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        androidx.lifecycle.r0 r0Var = this.f11652d;
        if (r0Var != null) {
            androidx.lifecycle.q0 q0Var = ((androidx.lifecycle.n0) r0Var).f11638a;
            int i17 = q0Var.f11641d + 1;
            q0Var.f11641d = i17;
            if (i17 == 1 && q0Var.f11644g) {
                q0Var.f11646i.f(androidx.lifecycle.m.ON_START);
                q0Var.f11644g = false;
            }
        }
        b(androidx.lifecycle.m.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(androidx.lifecycle.m.ON_STOP);
    }
}
