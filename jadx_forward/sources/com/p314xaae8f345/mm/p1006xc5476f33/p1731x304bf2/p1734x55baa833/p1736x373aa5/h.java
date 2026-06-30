package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes3.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l f220667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f220668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f220669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f220670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f220671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f220672i;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f220667d = lVar;
        this.f220668e = k3Var;
        this.f220669f = i17;
        this.f220670g = view;
        this.f220671h = i18;
        this.f220672i = viewPropertyAnimator;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        int i17 = this.f220669f;
        android.view.View view = this.f220670g;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f220671h != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f220672i.setListener(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar = this.f220667d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f220668e;
        lVar.x(k3Var);
        lVar.f220745p.remove(k3Var);
        lVar.E();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f220667d.A(this.f220668e);
    }
}
