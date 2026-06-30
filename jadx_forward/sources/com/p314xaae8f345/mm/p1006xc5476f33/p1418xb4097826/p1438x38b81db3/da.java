package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class da implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.s6 f184668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f184670f;

    public da(zy2.s6 s6Var, android.view.View view, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f184668d = s6Var;
        this.f184669e = view;
        this.f184670f = c22789xd23e9a9b;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.view.View view = this.f184669e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        ((ht2.y0) this.f184668d).Ai(view, this.f184670f);
    }
}
