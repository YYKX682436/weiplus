package ad2;

/* loaded from: classes.dex */
public final class e extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f84658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f84660f;

    public e(ad2.h hVar, android.view.View view, yz5.a aVar) {
        this.f84658d = hVar;
        this.f84659e = view;
        this.f84660f = aVar;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f84658d.f84687r = false;
        android.view.View view = this.f84659e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f84659e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = this.f84660f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f84658d.f84687r = false;
        android.view.View view = this.f84659e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f84659e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$fadeOutAnimate$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = this.f84660f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
