package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class da implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.s6 f103135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f103137f;

    public da(zy2.s6 s6Var, android.view.View view, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f103135d = s6Var;
        this.f103136e = view;
        this.f103137f = mMPAGView;
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
        android.view.View view = this.f103136e;
        kotlin.jvm.internal.o.d(view);
        ((ht2.y0) this.f103135d).Ai(view, this.f103137f);
    }
}
