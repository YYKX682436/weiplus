package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class y0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f254286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f254287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f254289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f254290h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 f254291i;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f254291i = d1Var;
        this.f254286d = k3Var;
        this.f254287e = i17;
        this.f254288f = view;
        this.f254289g = i18;
        this.f254290h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f254287e;
        android.view.View view = this.f254288f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f254289g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f254290h.setListener(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var = this.f254291i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f254286d;
        d1Var.x(k3Var);
        d1Var.f254130p.remove(k3Var);
        d1Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f254291i.A(this.f254286d);
    }
}
