package androidx.fragment.app;

/* loaded from: classes14.dex */
public class b2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11263d;

    public b2(androidx.fragment.app.d2 d2Var, android.view.View view) {
        this.f11263d = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        android.view.View view2 = this.f11263d;
        view2.removeOnAttachStateChangeListener(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.y0.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
