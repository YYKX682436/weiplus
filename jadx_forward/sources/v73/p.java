package v73;

/* loaded from: classes.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v73.n f515256d;

    public p(v73.n nVar) {
        this.f515256d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f515256d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.h3j);
        if (viewGroup != null) {
            viewGroup.sendAccessibilityEvent(8);
        }
    }
}
