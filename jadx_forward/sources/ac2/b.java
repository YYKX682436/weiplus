package ac2;

/* loaded from: classes2.dex */
public final class b extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f84541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ac2.g f84543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f84544g;

    public b(android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view, ac2.g gVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f84541d = viewPropertyAnimator;
        this.f84542e = view;
        this.f84543f = gVar;
        this.f84544g = k3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator ani) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ani, "ani");
        this.f84541d.setListener(null);
        android.view.View view = this.f84542e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC$pullDownOtherViews$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC$pullDownOtherViews$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f84543f.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 videoHolder = this.f84544g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoHolder, "videoHolder");
        android.view.View view2 = videoHolder.f3639x46306858;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3) : null;
        android.view.View view3 = videoHolder.f3639x46306858;
        android.view.View findViewById2 = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.g1y) : null;
        android.view.View view4 = videoHolder.f3639x46306858;
        android.view.View findViewById3 = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.dq6) : null;
        android.view.View view5 = videoHolder.f3639x46306858;
        android.view.View findViewById4 = view5 != null ? view5.findViewById(com.p314xaae8f345.mm.R.id.f565788t95) : null;
        if (findViewById != null) {
            findViewById.setTranslationY(0.0f);
        }
        if (findViewById2 != null) {
            findViewById2.setTranslationY(0.0f);
        }
        if (findViewById3 != null) {
            findViewById3.setTranslationY(0.0f);
        }
        if (findViewById4 == null) {
            return;
        }
        findViewById4.setTranslationY(0.0f);
    }
}
