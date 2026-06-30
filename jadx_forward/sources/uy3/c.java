package uy3;

/* loaded from: classes8.dex */
public final class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 f513462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f513463e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7, boolean z17) {
        this.f513462d = abstractC17267x816864c7;
        this.f513463e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = this.f513462d;
        boolean z17 = this.f513463e;
        abstractC17267x816864c7.T = z17;
        android.view.View view = abstractC17267x816864c7.f240223n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogContainer");
            throw null;
        }
        abstractC17267x816864c7.f240241z = view.getTranslationY();
        uy3.s sVar = abstractC17267x816864c7.f240232u;
        abstractC17267x816864c7.f240234w = sVar != null ? sVar.mo68744xf46f0f5() : 0.0f;
        abstractC17267x816864c7.D1 = z17 ? 2 : 1;
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
