package cl5;

/* loaded from: classes5.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl5.n f42976e;

    public b(android.view.View view, cl5.n nVar) {
        this.f42975d = view;
        this.f42976e = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.view.View view = this.f42975d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/banner/PushBanner$dismissBanner$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/banner/PushBanner$dismissBanner$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cl5.n nVar = this.f42976e;
        android.view.View view2 = nVar.f42999d;
        if (view2 != null && (viewGroup = nVar.f42998c) != null) {
            if (viewGroup != null) {
                viewGroup.removeView(view2);
            }
            nVar.f42999d = null;
        }
        android.view.ViewManager viewManager = nVar.f42996a;
        if (viewManager != null) {
            viewManager.removeView(this.f42975d);
        }
        nVar.f42996a = null;
        nVar.f43004i = null;
    }
}
