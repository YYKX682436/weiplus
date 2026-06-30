package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class j7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f213952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f213953e;

    public j7(yz5.a aVar, yz5.a aVar2) {
        this.f213952d = aVar;
        this.f213953e = aVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f213953e.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f213952d.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
