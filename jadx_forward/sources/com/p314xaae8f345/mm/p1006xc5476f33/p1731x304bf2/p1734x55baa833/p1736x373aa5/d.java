package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes3.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f220596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l f220597e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        this.f220597e = lVar;
        this.f220596d = viewHolder;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        android.view.View itemView = this.f220596d.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m.a(itemView);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f220596d;
        android.view.View itemView = k3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m.a(itemView);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar = this.f220597e;
        lVar.y(k3Var);
        lVar.f220746q.remove(k3Var);
        lVar.E();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f220597e.C(this.f220596d);
    }
}
