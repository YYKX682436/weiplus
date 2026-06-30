package androidx.fragment.app;

/* loaded from: classes13.dex */
public class h1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f11325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11327f;

    public h1(androidx.fragment.app.FragmentManager fragmentManager, android.view.ViewGroup viewGroup, android.view.View view, androidx.fragment.app.Fragment fragment) {
        this.f11325d = viewGroup;
        this.f11326e = view;
        this.f11327f = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f11325d.endViewTransition(this.f11326e);
        animator.removeListener(this);
        androidx.fragment.app.Fragment fragment = this.f11327f;
        android.view.View view = fragment.mView;
        if (view == null || !fragment.mHidden) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/fragment/app/FragmentManager$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/fragment/app/FragmentManager$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
