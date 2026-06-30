package al5;

/* loaded from: classes3.dex */
public final class w2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f6082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnLayoutChangeListener f6083e;

    public w2(kotlin.jvm.internal.f0 f0Var, android.view.View.OnLayoutChangeListener onLayoutChangeListener) {
        this.f6082d = f0Var;
        this.f6083e = onLayoutChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f6082d.f310116d = v17.getVisibility();
        v17.addOnLayoutChangeListener(this.f6083e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        v17.removeOnLayoutChangeListener(this.f6083e);
    }
}
