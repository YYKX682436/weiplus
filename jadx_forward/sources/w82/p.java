package w82;

/* loaded from: classes10.dex */
public final class p implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 f525451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 f525452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f525453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f525454g;

    public p(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 c13619xdbaf3371, android.widget.ImageView imageView, yz5.a aVar) {
        this.f525451d = c22642x62f5b194;
        this.f525452e = c13619xdbaf3371;
        this.f525453f = imageView;
        this.f525454g = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f525451d.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 c13619xdbaf3371 = this.f525452e;
        android.view.View view = c13619xdbaf3371.f183072r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$collapseCurrentList$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$collapseCurrentList$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c13619xdbaf3371.f183076v = false;
        c13619xdbaf3371.e(this.f525453f, false);
        yz5.a aVar = this.f525454g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f525451d.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 c13619xdbaf3371 = this.f525452e;
        android.view.View view = c13619xdbaf3371.f183072r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$collapseCurrentList$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$collapseCurrentList$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c13619xdbaf3371.f183076v = false;
        c13619xdbaf3371.e(this.f525453f, false);
        yz5.a aVar = this.f525454g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
