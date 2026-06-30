package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ge implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f103478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f103479e;

    public ge(yz5.a aVar, yz5.a aVar2) {
        this.f103478d = aVar;
        this.f103479e = aVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f103479e.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f103478d.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
