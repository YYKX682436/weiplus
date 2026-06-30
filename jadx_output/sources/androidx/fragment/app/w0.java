package androidx.fragment.app;

/* loaded from: classes14.dex */
public class w0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.d2 f11499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.x0 f11500e;

    public w0(androidx.fragment.app.x0 x0Var, androidx.fragment.app.d2 d2Var) {
        this.f11500e = x0Var;
        this.f11499d = d2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        androidx.fragment.app.d2 d2Var = this.f11499d;
        androidx.fragment.app.Fragment fragment = d2Var.f11304c;
        d2Var.j();
        androidx.fragment.app.n3.f((android.view.ViewGroup) fragment.mView.getParent(), this.f11500e.f11512d).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
