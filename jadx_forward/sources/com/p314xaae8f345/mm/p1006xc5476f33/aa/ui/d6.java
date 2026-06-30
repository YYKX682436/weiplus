package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public final class d6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 f154147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.MarginLayoutParams f154148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f154149f;

    public d6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 c11354x3aa9ae06, android.view.ViewGroup.MarginLayoutParams marginLayoutParams, android.view.View view) {
        this.f154147d = c11354x3aa9ae06;
        this.f154148e = marginLayoutParams;
        this.f154149f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        if (num != null) {
            int intValue = num.intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 c11354x3aa9ae06 = this.f154147d;
            boolean c17 = com.p314xaae8f345.mm.ui.b4.c(c11354x3aa9ae06.f154068d);
            android.view.View view = this.f154149f;
            if (!c17) {
                if (com.p314xaae8f345.mm.ui.w9.c(c11354x3aa9ae06.f154068d) || com.p314xaae8f345.mm.ui.bk.g0() || com.p314xaae8f345.mm.ui.bk.f0() || !fp.h.a(30)) {
                    return;
                }
                view.setPadding(0, 0, 0, intValue);
                return;
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = this.f154148e;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = intValue;
            }
            java.lang.Object parent = view.getParent();
            android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
    }
}
