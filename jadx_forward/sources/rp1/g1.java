package rp1;

/* loaded from: classes14.dex */
public class g1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 f479936d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0) {
        this.f479936d = c12929x567537a0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f479936d;
        c12929x567537a0.G1 = false;
        c12929x567537a0.s0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f479936d;
        c12929x567537a0.G1 = false;
        c12929x567537a0.s0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        this.f479936d.G1 = true;
    }
}
