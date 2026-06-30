package sx4;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx4.g0 f495136d;

    public e0(sx4.g0 g0Var) {
        this.f495136d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = this.f495136d.f495142b;
        if (activityC19411xef36c7b.N3) {
            synchronized (activityC19411xef36c7b.O3) {
                if (activityC19411xef36c7b.f265404y != null && activityC19411xef36c7b.N3) {
                    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activityC19411xef36c7b);
                    activityC19411xef36c7b.M3 = frameLayout;
                    frameLayout.setClickable(true);
                    activityC19411xef36c7b.f265404y.addView(activityC19411xef36c7b.M3, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    activityC19411xef36c7b.M3.addView(android.view.LayoutInflater.from(activityC19411xef36c7b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bsh, (android.view.ViewGroup) activityC19411xef36c7b.f265404y, false), new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
                }
            }
        }
    }
}
