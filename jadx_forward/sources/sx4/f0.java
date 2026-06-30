package sx4;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f495138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.g0 f495139e;

    public f0(sx4.g0 g0Var, boolean z17) {
        this.f495139e = g0Var;
        this.f495138d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = this.f495139e.f495142b;
        if (activityC19411xef36c7b.N3) {
            activityC19411xef36c7b.N3 = false;
            synchronized (activityC19411xef36c7b.O3) {
                android.widget.FrameLayout frameLayout = activityC19411xef36c7b.f265404y;
                if (frameLayout != null && (viewGroup = activityC19411xef36c7b.M3) != null) {
                    frameLayout.removeView(viewGroup);
                }
            }
            if (this.f495138d) {
                this.f495139e.f495142b.f265348f.mo120194xc77ccada();
                sx4.g0 g0Var = this.f495139e;
                ((vz4.x) g0Var.f495142b.C3).e(g0Var.f495141a, !r2.I3, false);
                sx4.g0 g0Var2 = this.f495139e;
                g0Var2.f495142b.p8(g0Var2.f495141a, null, false);
            }
        }
    }
}
