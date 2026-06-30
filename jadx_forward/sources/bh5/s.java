package bh5;

/* loaded from: classes14.dex */
public final class s implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 f102492d;

    public s(com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7) {
        this.f102492d = c22415x6ef905d7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int max = java.lang.Math.max((int) ((java.lang.Float) animatedValue).floatValue(), 0);
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = this.f102492d;
        c22415x6ef905d7.f290352w.b(max, c22415x6ef905d7.f290351v);
    }
}
