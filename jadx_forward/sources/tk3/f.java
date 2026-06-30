package tk3;

/* loaded from: classes8.dex */
public final class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e f501454d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e) {
        this.f501454d = c16608xd141945e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e = this.f501454d;
        android.view.ViewGroup.LayoutParams layoutParams = c16608xd141945e.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        c16608xd141945e.s(layoutParams2.x, layoutParams2.y, true, false);
    }
}
