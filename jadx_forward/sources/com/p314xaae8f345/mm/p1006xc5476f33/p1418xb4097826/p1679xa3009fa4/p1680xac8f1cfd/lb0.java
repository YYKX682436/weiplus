package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class lb0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 f216572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f216574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f216575g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 f216576h;

    public lb0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 mb0Var, in5.s0 s0Var, android.view.View view, yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 db0Var) {
        this.f216572d = mb0Var;
        this.f216573e = s0Var;
        this.f216574f = view;
        this.f216575g = aVar;
        this.f216576h = db0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.ValueAnimator valueAnimator;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 mb0Var = this.f216572d;
        android.animation.ValueAnimator valueAnimator2 = mb0Var.f216692d;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = mb0Var.f216692d) != null) {
            valueAnimator.end();
        }
        mb0Var.c7(this.f216573e);
        android.view.View view = this.f216574f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$showWithAnimation$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$showWithAnimation$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f216575g.mo152xb9724478();
        int i17 = this.f216576h != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0.f215652e ? -1 : 1;
        android.view.View view2 = this.f216574f;
        int u17 = hc2.f1.u(view2);
        int i18 = view2.getLayoutParams().height;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        android.view.View view3 = this.f216574f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 mb0Var2 = this.f216572d;
        in5.s0 s0Var = this.f216573e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 db0Var = this.f216576h;
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jb0(view3, u17, i17));
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kb0(view3, mb0Var2, s0Var, i18, db0Var, u17));
        ofFloat.start();
        mb0Var.f216692d = ofFloat;
    }
}
