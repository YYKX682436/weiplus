package hf2;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f362568d;

    public d(java.util.LinkedList linkedList) {
        this.f362568d = linkedList;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.util.LinkedList linkedList = this.f362568d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                android.view.ViewGroup viewGroup = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l) it.next()).f446856d;
                java.lang.Object animatedValue = animator.getAnimatedValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                viewGroup.setAlpha(((java.lang.Float) animatedValue).floatValue());
            }
        }
    }
}
