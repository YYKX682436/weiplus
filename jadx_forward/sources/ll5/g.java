package ll5;

/* loaded from: classes3.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f400822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f400823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f400824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f400825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f400826h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f400827i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f400828m;

    public g(android.view.View view, android.view.View view2, boolean z17, boolean z18, android.widget.LinearLayout linearLayout, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185, yz5.a aVar) {
        this.f400822d = view;
        this.f400823e = view2;
        this.f400824f = z17;
        this.f400825g = z18;
        this.f400826h = linearLayout;
        this.f400827i = c22675xc8629185;
        this.f400828m = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = this.f400827i;
        em.b0 b0Var = c22675xc8629185.f293161f;
        if (b0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        android.widget.FrameLayout c17 = b0Var.c();
        android.view.View view = this.f400822d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, c17)) {
            view.getLayoutParams().height = -2;
            android.view.View view2 = this.f400822d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f400822d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view4 = this.f400823e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f400823e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            view.getLayoutParams().height = -2;
            android.view.View view6 = this.f400822d;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = this.f400822d;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view7.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(view7, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view8 = this.f400823e;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f400823e;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view9.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
            yj0.a.f(view9, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f400823e.getLayoutParams().height = -2;
        view.getLayoutParams().height = -2;
        if (this.f400824f) {
            android.widget.LinearLayout linearLayout = this.f400826h;
            linearLayout.getLayoutParams().height = -2;
            if (this.f400825g) {
                linearLayout.setVisibility(0);
                linearLayout.setAlpha(1.0f);
            } else {
                linearLayout.setVisibility(8);
                linearLayout.setAlpha(0.0f);
            }
        }
        c22675xc8629185.f293162g = null;
        this.f400828m.mo152xb9724478();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f400822d.getLayoutParams().height = -2;
        android.view.View view = this.f400822d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f400822d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f400823e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f400823e;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/ui/widget/code/CodeItemView$performHeightAnimation$5$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f400823e.getLayoutParams().height = -2;
        if (this.f400824f) {
            boolean z17 = this.f400825g;
            android.widget.LinearLayout linearLayout = this.f400826h;
            if (z17) {
                linearLayout.getLayoutParams().height = -2;
                linearLayout.setAlpha(1.0f);
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
                linearLayout.setAlpha(0.0f);
                linearLayout.getLayoutParams().height = -2;
            }
        }
        this.f400827i.f293162g = null;
        this.f400828m.mo152xb9724478();
    }
}
