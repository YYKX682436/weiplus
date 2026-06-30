package rp1;

/* loaded from: classes10.dex */
public final class c0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12921xde8d5499 f479896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.d0 f479897e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12921xde8d5499 c12921xde8d5499, rp1.d0 d0Var) {
        this.f479896d = c12921xde8d5499;
        this.f479897e = d0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12921xde8d5499 c12921xde8d5499 = this.f479896d;
        if (c12921xde8d5499.f174985h) {
            ((java.util.ArrayList) c12921xde8d5499.f174986i).remove(this.f479897e);
        }
    }
}
