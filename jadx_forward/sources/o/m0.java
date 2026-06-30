package o;

/* loaded from: classes15.dex */
public class m0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.n0 f423280d;

    public m0(o.n0 n0Var) {
        this.f423280d = n0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        o.n0 n0Var = this.f423280d;
        android.view.ViewTreeObserver viewTreeObserver = n0Var.f423301v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                n0Var.f423301v = view.getViewTreeObserver();
            }
            n0Var.f423301v.removeGlobalOnLayoutListener(n0Var.f423295p);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
