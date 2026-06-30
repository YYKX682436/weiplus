package v73;

/* loaded from: classes.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v73.s1 f515273d;

    public r1(v73.s1 s1Var) {
        this.f515273d = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = (android.widget.TextView) this.f515273d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.h59);
        if (textView != null) {
            textView.sendAccessibilityEvent(8);
        }
    }
}
