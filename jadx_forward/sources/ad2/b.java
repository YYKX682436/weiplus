package ad2;

/* loaded from: classes.dex */
public final class b extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f84651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f84653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f84654g;

    public b(ad2.h hVar, android.view.View view, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f84651d = hVar;
        this.f84652e = view;
        this.f84653f = z17;
        this.f84654g = h0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f84651d.f84691v = false;
        android.view.View view = this.f84652e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f84653f) {
            return;
        }
        android.view.View view2 = (android.view.View) this.f84654g.f391656d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver$checkShowDescription$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
