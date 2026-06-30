package gf;

/* loaded from: classes7.dex */
public class b0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f352555d;

    public b0(gf.d0 d0Var, android.view.View view) {
        this.f352555d = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        final android.view.View view2 = this.f352555d;
        view2.post(new java.lang.Runnable() { // from class: gf.b0$$a
            @Override // java.lang.Runnable
            public final void run() {
                view2.removeOnAttachStateChangeListener(this);
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
