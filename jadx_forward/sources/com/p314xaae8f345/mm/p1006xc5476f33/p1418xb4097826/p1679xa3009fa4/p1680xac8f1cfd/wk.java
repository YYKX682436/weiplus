package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class wk extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f217880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f217882f;

    public wk(android.widget.FrameLayout frameLayout, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f217880d = frameLayout;
        this.f217881e = view;
        this.f217882f = blVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f217880d.removeView(this.f217881e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f217882f;
        android.view.View mo144222x4ff8c0f0 = blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nfb);
        if (mo144222x4ff8c0f0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$2$3$4$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo144222x4ff8c0f0.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$2$3$4$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74 c15275x4b820d74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74) blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nuq);
        if (c15275x4b820d74 == null) {
            return;
        }
        c15275x4b820d74.m62009xae17c85(false);
    }
}
