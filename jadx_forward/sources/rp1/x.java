package rp1;

/* loaded from: classes14.dex */
public final class x extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f480086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f480087e;

    public x(yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7) {
        this.f480086d = aVar;
        this.f480087e = c12917x19ac03e7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        yz5.a aVar = this.f480086d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f480087e;
        android.view.ViewGroup.LayoutParams layoutParams = c12917x19ac03e7.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        this.f480087e.A(layoutParams2.x, layoutParams2.y, true, false, true);
        c12917x19ac03e7.f174962q = false;
    }
}
