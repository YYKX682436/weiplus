package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class d5 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f92074e;

    public d5(android.view.View view, n0.b4 b4Var) {
        this.f92073d = view;
        this.f92074e = b4Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        this.f92073d.removeOnAttachStateChangeListener(this);
        this.f92074e.r();
    }
}
