package ac2;

/* loaded from: classes2.dex */
public final class f implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.g f3022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f3023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f3024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f3025g;

    public f(ac2.g gVar, androidx.recyclerview.widget.k3 k3Var, android.view.View view, android.view.View view2) {
        this.f3022d = gVar;
        this.f3023e = k3Var;
        this.f3024f = view;
        this.f3025g = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.view.View view;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator translationYBy2;
        android.view.ViewPropertyAnimator duration3;
        android.view.ViewPropertyAnimator animate4;
        android.view.ViewPropertyAnimator translationYBy3;
        android.view.ViewPropertyAnimator duration4;
        android.view.ViewPropertyAnimator animate5;
        android.view.ViewPropertyAnimator translationYBy4;
        android.view.ViewPropertyAnimator duration5;
        android.view.ViewPropertyAnimator listener2;
        android.view.ViewPropertyAnimator translationYBy5;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        android.view.View view7;
        ac2.g gVar = this.f3022d;
        android.view.View view8 = this.f3024f;
        if (view8 != null) {
            gVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view8, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC", "pullUpOtherViews", "(JLandroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC", "pullUpOtherViews", "(JLandroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.k3 k3Var = this.f3023e;
        gVar.f3027e = k3Var;
        android.view.ViewPropertyAnimator viewPropertyAnimator = null;
        android.view.View findViewById = (k3Var == null || (view7 = k3Var.itemView) == null) ? null : view7.findViewById(com.tencent.mm.R.id.f484486ee3);
        android.view.View findViewById2 = (k3Var == null || (view6 = k3Var.itemView) == null) ? null : view6.findViewById(com.tencent.mm.R.id.g1y);
        android.view.View findViewById3 = (k3Var == null || (view5 = k3Var.itemView) == null) ? null : view5.findViewById(com.tencent.mm.R.id.dq6);
        android.widget.ImageView imageView = (k3Var == null || (view4 = k3Var.itemView) == null) ? null : (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.r2o);
        if (k3Var == null || (view3 = k3Var.itemView) == null || (view = view3.findViewById(com.tencent.mm.R.id.tcv)) == null) {
            view = null;
        } else {
            view.setTag(java.lang.Boolean.TRUE);
        }
        android.view.View findViewById4 = (k3Var == null || (view2 = k3Var.itemView) == null) ? null : view2.findViewById(com.tencent.mm.R.id.f484255t95);
        float b17 = i65.a.b(gVar.getContext(), 40);
        if (findViewById != null) {
            findViewById.setTranslationY(findViewById.getTranslationY() + b17);
            android.view.ViewPropertyAnimator animate6 = findViewById.animate();
            if (animate6 != null && (translationYBy5 = animate6.translationYBy(-b17)) != null) {
                viewPropertyAnimator = translationYBy5.setDuration(300L);
            }
            if (viewPropertyAnimator != null && (listener2 = viewPropertyAnimator.setListener(new ac2.d(viewPropertyAnimator, gVar))) != null) {
                listener2.start();
            }
        }
        if (findViewById2 != null && (animate5 = findViewById2.animate()) != null && (translationYBy4 = animate5.translationYBy(-b17)) != null && (duration5 = translationYBy4.setDuration(300L)) != null) {
            duration5.start();
        }
        if (findViewById3 != null && (animate4 = findViewById3.animate()) != null && (translationYBy3 = animate4.translationYBy(-b17)) != null && (duration4 = translationYBy3.setDuration(300L)) != null) {
            duration4.start();
        }
        if (view != null && (animate3 = view.animate()) != null && (translationYBy2 = animate3.translationYBy(-b17)) != null && (duration3 = translationYBy2.setDuration(300L)) != null) {
            duration3.start();
        }
        if (imageView != null && (animate2 = imageView.animate()) != null && (translationYBy = animate2.translationYBy(-b17)) != null && (duration2 = translationYBy.setDuration(300L)) != null && (listener = duration2.setListener(new ac2.e(gVar, k3Var))) != null) {
            listener.start();
        }
        if (findViewById4 != null && (animate = findViewById4.animate()) != null) {
            android.view.ViewPropertyAnimator translationYBy6 = animate.translationYBy(-(view8 != null ? view8.getHeight() : 0));
            if (translationYBy6 != null && (duration = translationYBy6.setDuration(300L)) != null) {
                duration.start();
            }
        }
        android.view.ViewTreeObserver viewTreeObserver = this.f3025g.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(gVar.f3029g);
        }
    }
}
