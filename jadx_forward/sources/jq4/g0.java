package jq4;

/* loaded from: classes5.dex */
public final class g0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f382682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f382683f;

    public g0(android.view.View view, jq4.z0 z0Var, boolean z17) {
        this.f382681d = view;
        this.f382682e = z0Var;
        this.f382683f = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "dismissAnimationEnd");
        super.onAnimationEnd(animation);
        android.view.View view = this.f382681d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$dismissCard$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$dismissCard$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jq4.z0 z0Var = this.f382682e;
        if (z0Var.f382768d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "windowManager is null At Animation: ".concat(jq4.g0.class.getName()));
        }
        android.view.ViewManager viewManager = z0Var.f382768d;
        android.view.View view2 = this.f382681d;
        if (viewManager != null) {
            viewManager.removeView(view2);
        }
        rq4.s sVar = rq4.s.f480631a;
        rq4.r rVar = rq4.s.f480633c;
        if (rVar.f480629d == 1) {
            rVar.f480627b = 1;
        }
        if (this.f382683f) {
            z0Var.u(view2);
        }
        z0Var.f382768d = null;
        z0Var.f382774j = null;
        z0Var.f382766b = false;
        z0Var.f382783s = false;
    }
}
