package ce;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnAttachStateChangeListener f122251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce.q f122252e;

    public p(ce.q qVar, android.view.View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f122252e = qVar;
        this.f122251d = onAttachStateChangeListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f122252e.f122253d.f122218f.removeOnAttachStateChangeListener(this.f122251d);
    }
}
