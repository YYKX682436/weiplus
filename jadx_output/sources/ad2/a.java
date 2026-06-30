package ad2;

/* loaded from: classes.dex */
public final class a extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f3116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f3117e;

    public a(ad2.h hVar, android.view.View view) {
        this.f3116d = hVar;
        this.f3117e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f3116d.f3158v = false;
        android.view.View view = this.f3117e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
