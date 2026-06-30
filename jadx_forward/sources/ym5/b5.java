package ym5;

/* loaded from: classes5.dex */
public final class b5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 f544756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f544757e;

    public b5(com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2, int i17) {
        this.f544756d = c22803x544dcce2;
        this.f544757e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2 = this.f544756d;
        int i17 = this.f544757e;
        c22803x544dcce2.m82733x3ae760af(i17);
        c22803x544dcce2.f294992o = i17;
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
