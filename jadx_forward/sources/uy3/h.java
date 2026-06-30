package uy3;

/* loaded from: classes8.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 f513474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f513475e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7, int i17) {
        this.f513474d = abstractC17267x816864c7;
        this.f513475e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f513474d.U = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = this.f513474d;
        abstractC17267x816864c7.U = false;
        abstractC17267x816864c7.D1 = 0;
        uy3.u uVar = abstractC17267x816864c7.f240230s;
        if (uVar != null) {
            uVar.e();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new uy3.g(abstractC17267x816864c7, this.f513475e));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        uy3.u uVar = this.f513474d.f240230s;
        if (uVar != null) {
            uVar.c();
        }
    }
}
