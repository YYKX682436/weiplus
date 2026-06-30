package v73;

/* loaded from: classes.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v73.k0 f515235d;

    public j0(v73.k0 k0Var) {
        this.f515235d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = (android.widget.TextView) this.f515235d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.h3r);
        if (textView != null) {
            textView.sendAccessibilityEvent(8);
        }
    }
}
