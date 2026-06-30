package e45;

/* loaded from: classes3.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f330941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f330942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e45.r f330943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f330944g;

    public l(android.view.View view, android.widget.LinearLayout linearLayout, e45.r rVar, int i17) {
        this.f330941d = view;
        this.f330942e = linearLayout;
        this.f330943f = rVar;
        this.f330944g = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f330941d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$doReverseAnim$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$doReverseAnim$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f330941d.setTranslationY(0.0f);
        this.f330942e.setTranslationY(0.0f);
        e45.r.O6(this.f330943f, this.f330944g);
    }
}
