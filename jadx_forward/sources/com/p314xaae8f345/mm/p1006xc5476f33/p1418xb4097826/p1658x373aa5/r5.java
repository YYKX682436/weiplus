package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class r5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f214461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f214462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 f214463f;

    public r5(yz5.a aVar, yz5.a aVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 c15269x718714b0) {
        this.f214461d = aVar;
        this.f214462e = aVar2;
        this.f214463f = c15269x718714b0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f214462e.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f214461d.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f214463f.setHint("");
    }
}
