package jq4;

/* loaded from: classes3.dex */
public final class u0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f382738e;

    public u0(android.view.View view, jq4.z0 z0Var) {
        this.f382737d = view;
        this.f382738e = z0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        jq4.z0 z0Var = this.f382738e;
        java.lang.String str = null;
        z0Var.f382774j = null;
        android.view.View view = z0Var.f382781q;
        if (view != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(z0Var.a());
            android.view.View view2 = z0Var.f382781q;
            if (view2 != null && (context = view2.getContext()) != null) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575004kc4);
            }
            sb6.append(str);
            view.setContentDescription(sb6.toString());
        }
        android.view.View view3 = z0Var.f382781q;
        if (view3 != null) {
            view3.sendAccessibilityEvent(128);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        android.view.View view = this.f382737d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$showCard$2$1$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$showCard$2$1$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
