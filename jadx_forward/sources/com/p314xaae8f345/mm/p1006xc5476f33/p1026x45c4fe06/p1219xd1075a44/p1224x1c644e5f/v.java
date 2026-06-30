package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 f172761d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var) {
        this.f172761d = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.os.ResultReceiver resultReceiver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368 = this.f172761d.e().f158899p;
        if (c11820x84c5f368 == null || (resultReceiver = c11820x84c5f368.f158930e) == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        k91.q3[] q3VarArr = k91.q3.f387266d;
        bundle.putInt("action", 2);
        bundle.putBoolean("isAnimationBegin", false);
        resultReceiver.send(0, bundle);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        android.os.ResultReceiver resultReceiver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = this.f172761d;
        l0Var.f172730c = true;
        java.lang.Object parent = l0Var.f172728a.f156343s.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$onActivityEnterAnimationComplete$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$onActivityEnterAnimationComplete$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368 = l0Var.e().f158899p;
        if (c11820x84c5f368 == null || (resultReceiver = c11820x84c5f368.f158930e) == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        k91.q3[] q3VarArr = k91.q3.f387266d;
        bundle.putInt("action", 2);
        bundle.putBoolean("isAnimationBegin", true);
        resultReceiver.send(0, bundle);
    }
}
