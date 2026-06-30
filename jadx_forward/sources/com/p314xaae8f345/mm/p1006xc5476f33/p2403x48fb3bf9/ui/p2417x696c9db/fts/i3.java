package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes15.dex */
public final class i3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 f265974d;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var) {
        this.f265974d = j3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var = this.f265974d;
        android.view.View view = j3Var.f266005v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        android.view.View view2 = j3Var.f266006w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
        if (j3Var.f265990g == animation) {
            android.content.Context context = j3Var.f265984a;
            java.lang.Object animatedValue = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.width = com.p314xaae8f345.mm.ui.zk.a(context, ((java.lang.Integer) animatedValue).intValue());
            android.content.Context context2 = j3Var.f265984a;
            java.lang.Object animatedValue2 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams4.width = com.p314xaae8f345.mm.ui.zk.a(context2, ((java.lang.Integer) animatedValue2).intValue());
        } else if (j3Var.f265991h == animation) {
            android.content.Context context3 = j3Var.f265984a;
            java.lang.Object animatedValue3 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.height = com.p314xaae8f345.mm.ui.zk.a(context3, ((java.lang.Integer) animatedValue3).intValue());
            android.content.Context context4 = j3Var.f265984a;
            java.lang.Object animatedValue4 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
            layoutParams4.height = com.p314xaae8f345.mm.ui.zk.a(context4, ((java.lang.Integer) animatedValue4).intValue());
        } else if (j3Var.f265992i == animation) {
            android.content.Context context5 = j3Var.f265984a;
            java.lang.Object animatedValue5 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue5, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.topMargin = com.p314xaae8f345.mm.ui.zk.a(context5, ((java.lang.Integer) animatedValue5).intValue());
            android.content.Context context6 = j3Var.f265984a;
            java.lang.Object animatedValue6 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue6, "null cannot be cast to non-null type kotlin.Int");
            layoutParams4.topMargin = com.p314xaae8f345.mm.ui.zk.a(context6, ((java.lang.Integer) animatedValue6).intValue());
        } else if (j3Var.f265993j == animation) {
            android.content.Context context7 = j3Var.f265984a;
            java.lang.Object animatedValue7 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue7, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.rightMargin = com.p314xaae8f345.mm.ui.zk.a(context7, ((java.lang.Integer) animatedValue7).intValue());
            android.content.Context context8 = j3Var.f265984a;
            java.lang.Object animatedValue8 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue8, "null cannot be cast to non-null type kotlin.Int");
            layoutParams4.rightMargin = com.p314xaae8f345.mm.ui.zk.a(context8, ((java.lang.Integer) animatedValue8).intValue());
        } else if (j3Var.f265994k == animation) {
            android.content.Context context9 = j3Var.f265984a;
            java.lang.Object animatedValue9 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue9, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(context9, ((java.lang.Integer) animatedValue9).intValue());
            android.content.Context context10 = j3Var.f265984a;
            java.lang.Object animatedValue10 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue10, "null cannot be cast to non-null type kotlin.Int");
            layoutParams4.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(context10, ((java.lang.Integer) animatedValue10).intValue());
        }
        android.view.View view3 = j3Var.f266005v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
        view3.setLayoutParams(layoutParams2);
        android.view.View view4 = j3Var.f266006w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
        view4.setLayoutParams(layoutParams4);
    }
}
