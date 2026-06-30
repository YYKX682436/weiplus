package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ge implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f185011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f185012e;

    public ge(yz5.a aVar, yz5.a aVar2) {
        this.f185011d = aVar;
        this.f185012e = aVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f185012e.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f185011d.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
