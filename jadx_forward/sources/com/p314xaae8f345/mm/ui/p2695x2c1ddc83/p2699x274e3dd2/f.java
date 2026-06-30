package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI f289664d;

    public f(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI) {
        this.f289664d = unreadConversationFmUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        em.e4 e4Var;
        android.view.Window window;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI = this.f289664d;
        e4Var = unreadConversationFmUI.viewBinding;
        android.view.View view = null;
        if (e4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        e4Var.a().setTranslationY(floatValue);
        float e17 = 1.0f - e06.p.e(floatValue / (unreadConversationFmUI.m7460x893a2f6f().getDisplayMetrics().heightPixels * 0.5f), 0.0f, 1.0f);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = unreadConversationFmUI.mo7430x19263085();
        if (mo7430x19263085 != null && (window = mo7430x19263085.getWindow()) != null) {
            view = window.getDecorView();
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(e17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$animateReset$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$animateReset$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
