package ym5;

/* loaded from: classes3.dex */
public class g0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22784x20e56a4c f544871d;

    public g0(com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22784x20e56a4c viewOnClickListenerC22784x20e56a4c) {
        this.f544871d = viewOnClickListenerC22784x20e56a4c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22784x20e56a4c viewOnClickListenerC22784x20e56a4c = this.f544871d;
        viewOnClickListenerC22784x20e56a4c.f294835d.setAlpha(1.0f);
        viewOnClickListenerC22784x20e56a4c.f294835d.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
