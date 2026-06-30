package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class n00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 f216772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 f216773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00 f216774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f216776h;

    public n00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f42, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00 o00Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, boolean z17) {
        this.f216772d = c13928xc82087f4;
        this.f216773e = c13928xc82087f42;
        this.f216774f = o00Var;
        this.f216775g = abstractC14490x69736cb5;
        this.f216776h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        android.view.ViewPropertyAnimator duration;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4 = this.f216772d;
        if (c13928xc82087f4.visibilityManager.O6(c13928xc82087f4.f190598e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f42 = this.f216773e;
            c13928xc82087f42.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f43 = this.f216772d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o00 o00Var = this.f216774f;
            o00Var.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c13928xc82087f43, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "animShowTipsView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c13928xc82087f43.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(c13928xc82087f43, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "animShowTipsView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c13928xc82087f43.setScaleX(0.5f);
            c13928xc82087f43.setScaleY(0.5f);
            android.view.ViewPropertyAnimator animate = c13928xc82087f43.animate();
            if (animate != null && (alpha = animate.alpha(1.0f)) != null && (scaleX = alpha.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (duration = scaleY.setDuration(500L)) != null) {
                duration.start();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realShowTips, feedId: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f216775g;
            sb6.append(abstractC14490x69736cb5.mo2128x1ed62e84());
            sb6.append(", fromPayLoad: ");
            boolean z17 = this.f216776h;
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o00Var.f216939d, sb6.toString());
            c13928xc82087f42.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m00(o00Var, abstractC14490x69736cb5, z17, c13928xc82087f4), 5000L);
        }
    }
}
