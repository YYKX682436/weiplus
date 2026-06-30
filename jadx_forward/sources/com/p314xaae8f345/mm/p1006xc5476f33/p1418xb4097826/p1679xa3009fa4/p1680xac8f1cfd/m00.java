package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class m00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00 f216638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f216640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 f216641g;

    public m00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00 o00Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4) {
        this.f216638d = o00Var;
        this.f216639e = abstractC14490x69736cb5;
        this.f216640f = z17;
        this.f216641g = c13928xc82087f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00 o00Var = this.f216638d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o00Var.f216939d, "hideTips, feedId: " + this.f216639e.mo2128x1ed62e84() + ", fromPayLoad: " + this.f216640f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4 = this.f216641g;
        o00Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c13928xc82087f4, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "animHideTipsView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        c13928xc82087f4.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(c13928xc82087f4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "animHideTipsView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        c13928xc82087f4.setScaleX(1.0f);
        c13928xc82087f4.setScaleY(1.0f);
        android.view.ViewPropertyAnimator animate = c13928xc82087f4.animate();
        if (animate == null || (alpha = animate.alpha(0.0f)) == null || (scaleX = alpha.scaleX(0.5f)) == null || (scaleY = scaleX.scaleY(0.5f)) == null || (duration = scaleY.setDuration(500L)) == null || (listener = duration.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j00(c13928xc82087f4))) == null) {
            return;
        }
        listener.start();
    }
}
