package uy3;

/* loaded from: classes8.dex */
public final class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 f513467d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7) {
        this.f513467d = abstractC17267x816864c7;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = this.f513467d;
        abstractC17267x816864c7.D1 = 1;
        uy3.s sVar = abstractC17267x816864c7.f240232u;
        abstractC17267x816864c7.f240234w = sVar != null ? sVar.mo68744xf46f0f5() : 0.0f;
        uy3.s sVar2 = abstractC17267x816864c7.f240232u;
        if (sVar2 != null) {
            sVar2.mo68744xf46f0f5();
        }
        uy3.s sVar3 = abstractC17267x816864c7.f240232u;
        if (sVar3 != null) {
            sVar3.mo68746x2bc38d59();
        }
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
