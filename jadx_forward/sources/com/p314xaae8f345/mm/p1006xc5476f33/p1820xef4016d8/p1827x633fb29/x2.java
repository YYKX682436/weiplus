package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes3.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f227223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f227226g;

    public x2(android.view.View view, int i17, java.lang.String str, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f227223d = view;
        this.f227224e = i17;
        this.f227225f = str;
        this.f227226g = c22789xd23e9a9b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.View view = this.f227223d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2$downloadComplete$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2$downloadComplete$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2$downloadComplete$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2$downloadComplete$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(150L)) != null) {
            duration.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.h(this.f227224e, this.f227225f, this.f227226g);
    }
}
