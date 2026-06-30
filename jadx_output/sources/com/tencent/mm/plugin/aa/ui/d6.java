package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public final class d6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage f72614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.MarginLayoutParams f72615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f72616f;

    public d6(com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage, android.view.ViewGroup.MarginLayoutParams marginLayoutParams, android.view.View view) {
        this.f72614d = paylistAARemarkInputHalfPage;
        this.f72615e = marginLayoutParams;
        this.f72616f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage = this.f72614d;
            boolean c17 = com.tencent.mm.ui.b4.c(paylistAARemarkInputHalfPage.f72535d);
            android.view.View view = this.f72616f;
            if (!c17) {
                if (com.tencent.mm.ui.w9.c(paylistAARemarkInputHalfPage.f72535d) || com.tencent.mm.ui.bk.g0() || com.tencent.mm.ui.bk.f0() || !fp.h.a(30)) {
                    return;
                }
                view.setPadding(0, 0, 0, intValue);
                return;
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = this.f72615e;
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
