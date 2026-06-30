package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 f91228d;

    public v(com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var) {
        this.f91228d = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.os.ResultReceiver resultReceiver;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = this.f91228d.e().f77366p;
        if (weAppHalfScreenStatusChangeListener == null || (resultReceiver = weAppHalfScreenStatusChangeListener.f77397e) == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        k91.q3[] q3VarArr = k91.q3.f305733d;
        bundle.putInt("action", 2);
        bundle.putBoolean("isAnimationBegin", false);
        resultReceiver.send(0, bundle);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        android.os.ResultReceiver resultReceiver;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.f91228d;
        l0Var.f91197c = true;
        java.lang.Object parent = l0Var.f91195a.f74810s.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$onActivityEnterAnimationComplete$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$onActivityEnterAnimationComplete$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = l0Var.e().f77366p;
        if (weAppHalfScreenStatusChangeListener == null || (resultReceiver = weAppHalfScreenStatusChangeListener.f77397e) == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        k91.q3[] q3VarArr = k91.q3.f305733d;
        bundle.putInt("action", 2);
        bundle.putBoolean("isAnimationBegin", true);
        resultReceiver.send(0, bundle);
    }
}
