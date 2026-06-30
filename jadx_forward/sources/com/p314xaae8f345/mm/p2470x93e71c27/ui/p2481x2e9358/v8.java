package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class v8 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f272229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f272230e;

    public v8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var, android.animation.AnimatorSet animatorSet) {
        this.f272229d = h9Var;
        this.f272230e = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272229d;
        h9Var.R = false;
        if (h9Var.O == this.f272230e) {
            h9Var.O = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272229d;
        h9Var.R = true;
        android.view.View view = h9Var.f271904q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$startVoiceRangeAnim$2$rangeSet$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper$startVoiceRangeAnim$2$rangeSet$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = h9Var.f271905r;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (h9Var.O == this.f272230e) {
            h9Var.O = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f272229d.O = this.f272230e;
    }
}
