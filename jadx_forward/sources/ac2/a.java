package ac2;

/* loaded from: classes2.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.g f84536d;

    public a(ac2.g gVar) {
        this.f84536d = gVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
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
        android.view.ViewPropertyAnimator animate6;
        android.view.ViewPropertyAnimator translationYBy5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        ac2.g gVar = this.f84536d;
        if (gVar.f84560e == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        float f17 = gVar.f84561f - (i18 / 5.0f);
        gVar.f84561f = f17;
        gVar.f84561f = h3.a.a(f17, 0.0f, 100.0f);
        if (gVar.f84561f <= 0.0f) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = gVar.f84560e;
            if (k3Var == null) {
                str3 = "(Landroidx/recyclerview/widget/RecyclerView;II)V";
                str4 = "onScrolled";
            } else {
                gVar.f84560e = null;
                android.view.View itemView = k3Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                android.view.ViewStub viewStub = (android.view.ViewStub) itemView.findViewById(com.p314xaae8f345.mm.R.id.skr);
                if (viewStub != null) {
                    viewStub.inflate();
                }
                android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.tbo);
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC", "pullDownOtherViews", "(JF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC", "pullDownOtherViews", "(JF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                float b17 = i65.a.b(gVar.m80379x76847179(), 40);
                android.view.View findViewById2 = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
                android.view.View findViewById3 = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.g1y);
                android.view.View findViewById4 = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.dq6);
                android.widget.ImageView imageView = (android.widget.ImageView) k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.r2o);
                android.view.View findViewById5 = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tcv);
                if (findViewById5 != null) {
                    findViewById5.setTag(java.lang.Boolean.FALSE);
                } else {
                    findViewById5 = null;
                }
                android.view.View findViewById6 = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565788t95);
                str3 = "(Landroidx/recyclerview/widget/RecyclerView;II)V";
                str4 = "onScrolled";
                android.view.ViewPropertyAnimator duration6 = (findViewById2 == null || (animate6 = findViewById2.animate()) == null || (translationYBy5 = animate6.translationYBy(b17)) == null) ? null : translationYBy5.setDuration(260L);
                if (duration6 != null && (listener2 = duration6.setListener(new ac2.b(duration6, findViewById, gVar, k3Var))) != null) {
                    listener2.start();
                }
                if (findViewById3 != null && (animate5 = findViewById3.animate()) != null && (translationYBy4 = animate5.translationYBy(b17)) != null && (duration5 = translationYBy4.setDuration(260L)) != null) {
                    duration5.start();
                }
                if (findViewById5 != null && (animate4 = findViewById5.animate()) != null && (translationYBy3 = animate4.translationYBy(b17)) != null && (duration4 = translationYBy3.setDuration(260L)) != null) {
                    duration4.start();
                }
                if (findViewById4 != null && (animate3 = findViewById4.animate()) != null && (translationYBy2 = animate3.translationYBy(b17)) != null && (duration3 = translationYBy2.setDuration(260L)) != null) {
                    duration3.start();
                }
                if (imageView != null && (animate2 = imageView.animate()) != null && (translationYBy = animate2.translationYBy(b17)) != null && (duration2 = translationYBy.setDuration(260L)) != null && (listener = duration2.setListener(new ac2.c(gVar, k3Var))) != null) {
                    listener.start();
                }
                if (findViewById6 != null && (animate = findViewById6.animate()) != null) {
                    android.view.ViewPropertyAnimator translationYBy6 = animate.translationYBy(findViewById != null ? findViewById.getHeight() : 0);
                    if (translationYBy6 != null && (duration = translationYBy6.setDuration(260L)) != null) {
                        duration.start();
                    }
                }
            }
            str = str3;
            str2 = str4;
        } else {
            str = "(Landroidx/recyclerview/widget/RecyclerView;II)V";
            str2 = "onScrolled";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaGuideUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", str2, str);
    }
}
