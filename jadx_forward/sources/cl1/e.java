package cl1;

/* loaded from: classes8.dex */
public final class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730 f124394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f124395e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730 c12765x7ca3e730, boolean z17) {
        this.f124394d = c12765x7ca3e730;
        this.f124395e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        cl1.p0 p0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var;
        int mo1894x7e414b06;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730 c12765x7ca3e730 = this.f124394d;
        c12765x7ca3e730.f172610m = false;
        if (!this.f124395e || (p0Var = c12765x7ca3e730.f172606f) == null || (f2Var = (c12767x7016a6fb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb) p0Var).f172626q2) == null || (mo1894x7e414b06 = f2Var.mo1894x7e414b06()) < 1) {
            return;
        }
        cl1.o oVar = new cl1.o(c12767x7016a6fb, c12767x7016a6fb.getContext());
        oVar.f93582a = mo1894x7e414b06 - 1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c12767x7016a6fb.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.m8099x6305639d(oVar);
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
