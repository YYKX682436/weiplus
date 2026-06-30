package uy3;

/* loaded from: classes8.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 f513508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f513509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f513510f;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7, float f17, float f18) {
        this.f513508d = abstractC17267x816864c7;
        this.f513509e = f17;
        this.f513510f = f18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f513508d.U = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = this.f513508d;
        uy3.u uVar = abstractC17267x816864c7.f240230s;
        if (uVar != null) {
            uVar.f();
        }
        abstractC17267x816864c7.V = true;
        abstractC17267x816864c7.U = false;
        android.view.View view = abstractC17267x816864c7.f240223n;
        if (view != null) {
            view.getTranslationY();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogContainer");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = this.f513508d;
        uy3.u uVar = abstractC17267x816864c7.f240230s;
        if (uVar != null) {
            uVar.a(abstractC17267x816864c7.f240238y, this.f513509e, this.f513510f);
        }
    }
}
