package nu0;

/* loaded from: classes5.dex */
public final class z1 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f421689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421690e;

    public z1(android.view.View view, nu0.b4 b4Var) {
        this.f421689d = view;
        this.f421690e = b4Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f421689d.removeOnAttachStateChangeListener(this);
        this.f421690e.B7("onAttach");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
