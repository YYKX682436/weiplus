package v73;

/* loaded from: classes.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v73.v0 f515280d;

    public u0(v73.v0 v0Var) {
        this.f515280d = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f515280d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.h4j);
        if (viewGroup != null) {
            viewGroup.sendAccessibilityEvent(8);
        }
    }
}
