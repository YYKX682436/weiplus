package al5;

/* loaded from: classes3.dex */
public final class w2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f87615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnLayoutChangeListener f87616e;

    public w2(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, android.view.View.OnLayoutChangeListener onLayoutChangeListener) {
        this.f87615d = f0Var;
        this.f87616e = onLayoutChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        this.f87615d.f391649d = v17.getVisibility();
        v17.addOnLayoutChangeListener(this.f87616e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        v17.removeOnLayoutChangeListener(this.f87616e);
    }
}
