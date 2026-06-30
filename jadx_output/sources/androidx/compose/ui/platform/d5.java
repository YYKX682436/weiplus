package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class d5 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f10540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f10541e;

    public d5(android.view.View view, n0.b4 b4Var) {
        this.f10540d = view;
        this.f10541e = b4Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f10540d.removeOnAttachStateChangeListener(this);
        this.f10541e.r();
    }
}
