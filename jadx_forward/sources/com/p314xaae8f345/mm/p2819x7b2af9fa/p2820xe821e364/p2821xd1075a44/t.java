package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f296165d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.v f296166e;

    public t(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.v vVar) {
        this.f296166e = vVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f296165d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.f296165d) {
            this.f296165d = false;
            return;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.v vVar = this.f296166e;
        if (((java.lang.Float) vVar.f296218z.getAnimatedValue()).floatValue() == 0.0f) {
            vVar.A = 0;
            vVar.c(0);
        } else {
            vVar.A = 2;
            vVar.f296211s.invalidate();
        }
    }
}
