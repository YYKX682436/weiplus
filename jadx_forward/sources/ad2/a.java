package ad2;

/* loaded from: classes.dex */
public final class a extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f84649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84650e;

    public a(ad2.h hVar, android.view.View view) {
        this.f84649d = hVar;
        this.f84650e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f84649d.f84691v = false;
        android.view.View view = this.f84650e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
