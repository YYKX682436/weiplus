package ac2;

/* loaded from: classes2.dex */
public final class b extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f3008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f3009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ac2.g f3010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f3011g;

    public b(android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view, ac2.g gVar, androidx.recyclerview.widget.k3 k3Var) {
        this.f3008d = viewPropertyAnimator;
        this.f3009e = view;
        this.f3010f = gVar;
        this.f3011g = k3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator ani) {
        kotlin.jvm.internal.o.g(ani, "ani");
        this.f3008d.setListener(null);
        android.view.View view = this.f3009e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC$pullDownOtherViews$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC$pullDownOtherViews$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f3010f.getClass();
        androidx.recyclerview.widget.k3 videoHolder = this.f3011g;
        kotlin.jvm.internal.o.g(videoHolder, "videoHolder");
        android.view.View view2 = videoHolder.itemView;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.f484486ee3) : null;
        android.view.View view3 = videoHolder.itemView;
        android.view.View findViewById2 = view3 != null ? view3.findViewById(com.tencent.mm.R.id.g1y) : null;
        android.view.View view4 = videoHolder.itemView;
        android.view.View findViewById3 = view4 != null ? view4.findViewById(com.tencent.mm.R.id.dq6) : null;
        android.view.View view5 = videoHolder.itemView;
        android.view.View findViewById4 = view5 != null ? view5.findViewById(com.tencent.mm.R.id.f484255t95) : null;
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
