package ce;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnAttachStateChangeListener f40718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce.q f40719e;

    public p(ce.q qVar, android.view.View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f40719e = qVar;
        this.f40718d = onAttachStateChangeListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f40719e.f40720d.f40685f.removeOnAttachStateChangeListener(this.f40718d);
    }
}
