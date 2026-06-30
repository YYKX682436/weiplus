package ut2;

/* loaded from: classes3.dex */
public final class o1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512554d;

    public o1(ut2.s3 s3Var) {
        this.f512554d = s3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingViewHolder", "flicker end");
        ut2.s3 s3Var = this.f512554d;
        s3Var.f512613p0 = false;
        android.view.View w17 = s3Var.w();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(w17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$flicker$$inlined$doOnEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        w17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(w17, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$flicker$$inlined$doOnEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
