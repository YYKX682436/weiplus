package ug5;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f509147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f509148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug5.v f509149f;

    public j(android.view.View view, android.view.View view2, ug5.v vVar) {
        this.f509147d = view;
        this.f509148e = view2;
        this.f509149f = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f509147d.removeOnAttachStateChangeListener(this);
        android.view.View view2 = this.f509148e;
        android.view.ViewPropertyAnimator animate = view2.animate();
        if (animate != null) {
            animate.cancel();
        }
        android.view.ViewPropertyAnimator animate2 = view2.animate();
        ug5.v vVar = this.f509149f;
        animate2.setInterpolator(vVar.f509191a.f509138s).setDuration(vVar.f509191a.f509135p).alpha(vVar.f509191a.f509120a == ug5.b.f509114d ? 1.0f : 0.0f).start();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
