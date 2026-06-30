package x41;

/* loaded from: classes15.dex */
public final class f implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de f533306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f533307e;

    public f(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de, int i17) {
        this.f533306d = abstractC11221xf21fe5de;
        this.f533307e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f533306d.N = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de = this.f533306d;
        abstractC11221xf21fe5de.N = false;
        x41.n nVar = abstractC11221xf21fe5de.f153848q;
        if (nVar != null) {
        }
        ((ku5.t0) ku5.t0.f394148d).B(new x41.e(this.f533306d, this.f533307e));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        x41.n nVar = this.f533306d.f153848q;
        if (nVar != null) {
        }
    }
}
